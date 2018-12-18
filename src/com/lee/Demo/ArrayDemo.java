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
        for(int num:a1){
            System.out.println(num);
        }
        //二维数组
        int [][] b1 = new int[5][5];
        for(int x =0;x < b1.length; x++){
            for (int y = 0; y<b1[x].length; y++){
                b1[x][y]=x+y;
            }
        }
        System.out.println("b1数组的值为"+Arrays.deepToString(b1));
        int d = 0;
        for(int[] c1:b1){
            System.out.print("b1["+d+"]的值为");
            d++;
            for(int c2:c1){
                System.out.print(c2+",");
            }
            System.out.println();
        }

    }
}
