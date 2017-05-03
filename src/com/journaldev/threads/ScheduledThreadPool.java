package com.journaldev.threads;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by vivek on 3/5/17.
 */
public class ScheduledThreadPool {

    public static void main(String[] args) throws Exception{
        ScheduledExecutorService ses = Executors.newScheduledThreadPool(5);

        System.out.println("Current Time: "+new Date());

//        for(int i=0 ; i<3 ; i++){
//            Thread.sleep(1000);
//            WorkThread wt = new WorkThread("do heavy processing");
//            ses.schedule(wt,100, TimeUnit.SECONDS);
//        }

//        for (int i = 0; i < 3; i++) {
//            Thread.sleep(1000);
//            WorkThread worker = new WorkThread("do heavy processing");
            // schedule task to execute at fixed rate
//        it will start immediately , if last one take long time then period
//            ses.scheduleAtFixedRate(worker, 0, 2,
//                    TimeUnit.SECONDS);
//        }

//        for (int i = 0; i < 3; i++) {
//            Thread.sleep(1000);
//          Next execution will start after delay time between termination of last one.
            WorkThread worker = new WorkThread("do heavy processing");
            ses.scheduleWithFixedDelay(worker, 0, 1,
                    TimeUnit.SECONDS);
//        }

        Thread.sleep(30000);
        ses.shutdown();
        while(!ses.isTerminated()){}
        System.out.println("Finished All Threads");
    }
}
