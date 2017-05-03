package de.vogella.concurrency.threadpools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by vivek on 30/4/17.
 */
public class Main {

    private static final int NTHREADS = 10;

    public static void main(String[] args) {

        ExecutorService executor= Executors.newFixedThreadPool(NTHREADS);

        for(int i=0 ; i<500 ; i++){
            Runnable worker = new MyRunnable(10000000l+i);
            executor.execute(worker);
            System.out.println("i: "+i);
        }

        executor.shutdown();
//        boolean b = executor.awaitTermination();

        System.out.println("Finished All Threads");
    }
}
