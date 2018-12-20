package com.lee.Demo.BaDemo;

public class Animal {
    public int  head=1;
    public  int legNum = 4 ;

    public Animal(){
        System.out.println("animal的腿的数量为："+ legNum);
        System.out.println("父类方法被调用。");

    }

    public void bark(){
        System.out.println("动物叫。");
    }

}
