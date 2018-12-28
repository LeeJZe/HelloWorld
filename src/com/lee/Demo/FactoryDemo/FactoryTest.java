package com.lee.Demo.FactoryDemo;

public class FactoryTest {
    public static void main(String [] args){
        HumanFactory factory = new HumanFactory();
        Human male = factory.createHuman("male");
        male.beat();
        male.eat();
        male.sleep();
    }
}
