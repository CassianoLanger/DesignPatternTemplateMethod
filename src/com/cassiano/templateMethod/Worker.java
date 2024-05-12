package com.cassiano.templateMethod;

public abstract class Worker {

    public void execute(){
        dailyRoutine();
        getUp();
        eatBreakfast();
        goToWork();
        work();
        returnHome();
        relax();
        sleep();
        System.out.println("---------------------------------------------------");
    }

    protected void dailyRoutine(){
        System.out.println("Starting the daily routine!");
    }

    protected void getUp(){
        System.out.println("Getting up");
    }

    protected void eatBreakfast(){
        System.out.println("Eating breakfast");
    }

    protected void goToWork(){
        System.out.println("Going to work");
    }

    protected abstract void work();

    protected void returnHome(){
        System.out.println("Returning home");
    }

    protected void relax(){
        System.out.println("Relaxing 1h");
    }

    protected void sleep(){
        System.out.println("Sleeping");
    }
}
