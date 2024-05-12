package com.cassiano.templateMethod;

public class Manager extends Worker{
    @Override
    protected void work() {
        System.out.println("Work as manager");
    }

    @Override
    protected void relax(){
        System.out.println("Relaxing 1h and 30min");
    }
}
