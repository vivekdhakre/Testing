package com.journaldev.threads;

import java.util.Date;

/**
 * Created by vivek on 3/5/17.
 */
public class WorkThread implements Runnable {

    private String command;

    public WorkThread(String command) {
        this.command = command;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" - Start Time - "+new Date());
        processCommand();
        System.out.println(Thread.currentThread().getName()+" - End Time - "+new Date());

    }

    private void processCommand(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "WorkThread{" +
                "command='" + command + '\'' +
                '}';
    }
}
