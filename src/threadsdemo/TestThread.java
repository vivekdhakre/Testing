package threadsdemo;

/**
 * Created by vivek on 11/2/17.
 */
public class TestThread {

    public static void main(String[] args) {

        Thread t = new Thread(new FooRunnable());
        t.setName("Vivek");
        t.start();
    }
}

class FooRunnable implements Runnable{
    @Override
    public void run() {
//        for(int i=0 ; i<5 ; i++)
//            System.out.println("Runnable Running ["+(i+1)+"]");

        System.out.println("Run by "
                + Thread.currentThread().getName());
    }
}
