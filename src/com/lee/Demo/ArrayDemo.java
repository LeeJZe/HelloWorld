package com.lee.Demo;


import java.util.Arrays;

public class ArrayDemo {
    public static void  main(String[] args){
        int [] a1 = {1,2,3} ;
        int [] a2;
        a2 = a1 ;
        System.out.println("a2初始值为" + Arrays.toString(a2));
        System.out.println("a1初始值为" + Arrays.toString(a1));
        for(int i = 0;i < a2.length; i++){
            a2[i]++;
        }
        System.out.println("a2修改后值为" + Arrays.toString(a2));
        System.out.println("a1修改后值为" + Arrays.toString(a1));
        for (int i = 0; i <a1.length ; i++) {
            System.out.println("循环输出a1的值a1["+i+"]为："+a1[i]);
        }
    }
}
