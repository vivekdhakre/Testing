package de.vogella.concurrency.threadpools;

/**
 * Created by vivek on 30/4/17.
 */
public class MyRunnable implements Runnable {

    private final long countUntil;

    public MyRunnable(long countUntil) {
        this.countUntil = countUntil;
    }

    @Override
    public void run() {
        long sum = 0;
        for(int i = 0 ; i<countUntil ; i++){
            sum+=i;
        }
        System.out.println("sum: "+sum);
    }

}
