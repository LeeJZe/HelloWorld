package com.lee.Demo.BaDemo;

import java.util.Arrays;

public class ExceptionDemo {
    public static void main(String[] args){
//        System.out.println("+1.0/0=" + +1.0/0);
//        System.out.println("-1.0/0=" + -1.0/0);
//        System.out.println("+1/0=" + +1/0);
//        System.out.println("-1/0=" + -1/0);
        int [] array1 = new int[10];
        Arrays.fill(array1,8);
        for(int a :array1){
            System.out.print(a);
        }
        System.out.println();
//        System.out.println(array1[3]);
//        System.out.println(array1[11]);
//        System.out.println(array1[4]);
//        String cc = null;
//        System.out.println(cc.toUpperCase());
        for(int i=6;i>-1;i--){
            if(i==0) {
                throw new SelfExceptionDemo("除数不能为0");
            }
            System.out.println(array1[i]/i);
        }
        System.out.println("8/6="+8/6);

    }
}
