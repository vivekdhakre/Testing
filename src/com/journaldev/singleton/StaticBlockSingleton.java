package com.journaldev.singleton;

/**
 * Created by vivek on 30/4/17.
 */
public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    static {
            instance = new StaticBlockSingleton();
    }

    public static StaticBlockSingleton getInstance(){
        return instance;
    }

}
