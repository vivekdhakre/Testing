package com.journaldev.singleton;

/**
 * Created by vivek on 30/4/17.
 */
public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    public static LazyInitializedSingleton getInstance(){
        if(instance == null ){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
