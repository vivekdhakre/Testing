package com.journaldev.singleton;

import java.lang.reflect.Constructor;

/**
 * Created by vivek on 30/4/17.
 */
public class ReflectionSingletonTest {

    public static void main(String[] args) {
        EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();

        EagerInitializedSingleton instanceTwo = null;

        try{

            Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            for(Constructor constructor : constructors){
                constructor.setAccessible(true);
                instanceTwo = (EagerInitializedSingleton)constructor.newInstance();
                break;
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("one -> "+instanceOne.hashCode());
        System.out.println("two -> "+instanceTwo.hashCode());
    }

}
