package com.lee.Demo.BaDemo;

public class Cat implements AnimalInterface {
    public void  eat(){
        System.out.println("I like eating fish .");
    }
    public void travel(){
        System.out.println("I like travelling");
    }
    public static void main(String[] args){
        Cat cc = new Cat();
        cc.eat();
        cc.travel();

    }
}
