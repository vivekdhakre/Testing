package com.journaldev.factory;

/**
 * Created by vivek on 30/4/17.
 */
public class TestFactory {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");

        Computer server = ComputerFactory.getComputer("server","2 GB","500 GB","2.4 GHz");

        System.out.println("Factory PC config: "+pc);
        System.out.println("Factory Server config: "+server);
    }
}
