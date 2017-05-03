package com.journaldev.singleton;

/**
 * Created by vivek on 30/4/17.
 */
public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {
    }

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
}
