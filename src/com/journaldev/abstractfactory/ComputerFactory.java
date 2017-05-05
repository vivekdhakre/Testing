package com.journaldev.abstractfactory;

/**
 * Created by vivek on 30/4/17.
 */
public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory computerAbstractFactory){
        return computerAbstractFactory.createComputer();
    }
}
