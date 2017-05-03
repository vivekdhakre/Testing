package com.journaldev.singleton;

/**
 * Created by vivek on 30/4/17.
 */
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

//    public static synchronized ThreadSafeSingleton getInstance(){
//        if(instance == null){
//            instance = new ThreadSafeSingleton();
//        }
//        return instance;
//    }

    public static ThreadSafeSingleton getInstance(){
        if(instance == null){
            synchronized (ThreadSafeSingleton.class){
                instance = new ThreadSafeSingleton();
            }
        }
        return instance;
    }
}
