package com.journaldev.singleton;

/**
 * Created by vivek on 30/4/17.
 */
public class BillPughSingleton {

    private static class SingletonHelper{
        private  static  final BillPughSingleton instance = new BillPughSingleton();
    }

    private static BillPughSingleton getInstance(){
        return SingletonHelper.instance;
    }

}
