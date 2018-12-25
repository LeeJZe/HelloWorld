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
    }
}
