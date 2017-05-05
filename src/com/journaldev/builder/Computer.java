package com.journaldev.builder;

/**
 * Created by vivek on 30/4/17.
 */
public class Computer {

    //  required parameter
    private String hdd;
    private String ram;

    //  optional parameter
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    public String getHdd() {
        return hdd;
    }

    public String getRam() {
        return ram;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    public Computer(ComputerBuilder builder){
        this.hdd=builder.hdd;
        this.ram=builder.ram;
        this.isGraphicsCardEnabled=builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled=builder.isBluetoothEnabled;
    }

    public static class ComputerBuilder{
        //  required parameter
        private String hdd;
        private String ram;

        //  optional parameter
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String hdd, String ram) {
            this.hdd = hdd;
            this.ram = ram;
        }

        public String getHdd() {
            return hdd;
        }

        public void setHdd(String hdd) {
            this.hdd = hdd;
        }

        public String getRam() {
            return ram;
        }

        public void setRam(String ram) {
            this.ram = ram;
        }

        public boolean isGraphicsCardEnabled() {
            return isGraphicsCardEnabled;
        }


        public boolean isBluetoothEnabled() {
            return isBluetoothEnabled;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }

    }

}
