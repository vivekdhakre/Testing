package de.vogella.concurrency.callables;

import java.util.concurrent.Callable;

/**
 * Created by vivek on 30/4/17.
 */
public class MyCallable implements Callable<Long> {

    @Override
    public Long call() throws Exception {
        long sum = 0;
        for (long i = 0; i <= 100; i++) {
            sum += i;
            System.out.println("i: "+i+" sum: "+sum);
        }

        System.out.println(""+sum);
        return sum;
    }
}
