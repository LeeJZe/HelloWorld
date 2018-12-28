package com.lee.Demo.AdDemo;

public class Demo {
    public  static  void  main(String[] args){
        String  a = "abc";
        String  b = "abc";
        String  c = new String("xyz");
        String  d = new String("xyz");
        System.out.println(a==b);
        System.out.println(c==d);
        int i =2;
        System.out.println((i++)+(i++)+(i++));
        int a1 = 1;
        int a2 = 1;
        int b1 = 1000;
        int b2 = 1000;
        Integer c1 = 1;
        Integer c2 = 1;
        Integer d1 = 1000;
        Integer d2 = 1000;
        System.out.println(a1==a2);
        System.out.println(b1==b2);
        System.out.println(c1==c2);
        System.out.println(d1==d2);
        System.out.println(a1==c1);
        System.out.println(b1==d1);

    }
}
