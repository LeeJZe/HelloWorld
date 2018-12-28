package com.lee.Demo.FactoryDemo;

public class FactoryTest {
    public static void main(String [] args){
        //单个工厂类
//        HumanFactory factory = new HumanFactory();
//        Human male = factory.createHuman("male");
        //静态工厂类
        Human male = HumanFactory.cereateMale();
        male.beat();
        male.eat();
        male.sleep();
    }
}
