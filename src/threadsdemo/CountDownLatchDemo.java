package threadsdemo;

import java.util.concurrent.CountDownLatch;

/**
 * Created by vivek on 13/2/17.
 */
public class CountDownLatchDemo {

    public static void main(String[] args) throws InterruptedException{

        CountDownLatch countDownLatch = new CountDownLatch(4);

        Worker first = new Worker("1st",1000,countDownLatch);
        Worker two = new Worker("2nd",2000,countDownLatch);
        Worker three = new Worker("3rd",3000,countDownLatch);
//        Worker four = new Worker("4th",4000,countDownLatch);

        first.start();
        two.start();
        three.start();
//        four.start();

        System.out.println("finished");
        countDownLatch.await();

        System.out.println(Thread.currentThread().getName()+" finished");

    }
}

class Worker extends Thread{

    private int delay;

    private CountDownLatch countDownLatch;

    public Worker(String name, int delay, CountDownLatch countDownLatch) {
        super(name);
        this.delay = delay;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" start");
        try {
            Thread.sleep(delay);
            countDownLatch.countDown();
            System.out.println(Thread.currentThread().getName()+" finished "+countDownLatch.getCount());

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
