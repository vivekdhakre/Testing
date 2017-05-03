package de.vogella.concurrency.callables;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by vivek on 30/4/17.
 */
public class CallableFutures {

    private static final int NTHREDS = 10;

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(NTHREDS);

        List<Future<Long>> list = new ArrayList<>();
        for(int i=0 ; i<1 ; i++){
            Callable<Long> worker = new MyCallable();
            Future<Long> submit = executor.submit(worker);
            list.add(submit);
        }

        long sum = 0;
        System.out.println("list.size() -> "+list.size());

        for(Future<Long> future : list){
            try {
                sum += future.get();
            }catch (Exception e){
                System.out.println(e);
            }
        }

        System.out.println("sum: "+sum);
        executor.shutdown();

    }
}
