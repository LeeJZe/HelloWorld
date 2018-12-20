package com.lee.Demo.BaDemo;

public class Dog extends Animal {
    public Dog(){
//        super();
        System.out.println("子类方法被调用");
        System.out.println("leg数量"+super.legNum);
        System.out.println("head:"+super.head);

    }
    public void bark(){
        super.bark();
        System.out.println("汪汪汪！");
    }
}
