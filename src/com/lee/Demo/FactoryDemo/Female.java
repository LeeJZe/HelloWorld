package com.lee.Demo.FactoryDemo;

public class Female implements Human {
    @Override
    public void sleep() {
        System.out.println("Female can sleep");
    }

    @Override
    public void beat() {
        System.out.println("Female can beat");
    }

    public void eat(){
        System.out.println("Female can eat");
    }
}
