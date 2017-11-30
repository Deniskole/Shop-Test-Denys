package com.company.drinkables;

public class Pokypatel extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        System.out.println("END --->>> " + Thread.currentThread().getName());
    }

    private void someMethod() {
        throw new RuntimeException();
    }

}
