package com.cassiano.application;

import com.cassiano.templateMethod.Fireman;
import com.cassiano.templateMethod.Manager;
import com.cassiano.templateMethod.Policeman;
import com.cassiano.templateMethod.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Fireman();
        Worker worker1 = new Policeman();
        Worker worker2 = new Manager();

        worker.execute();
        worker1.execute();
        worker2.execute();
    }
}
