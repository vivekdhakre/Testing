package com.journaldev.factory;

/**
 * Created by vivek on 30/4/17.
 */
public class ComputerFactory {

    public static Computer getComputer(String type,String ram,String hdd, String cpu){
        Computer computer =null;
        if("pc".equalsIgnoreCase(type.trim())){
            computer = new PC(ram,hdd,cpu);
        }else if("server".equalsIgnoreCase(type.trim())){
            computer = new Server(ram,hdd,cpu);
        }
        return computer;
    }
}
