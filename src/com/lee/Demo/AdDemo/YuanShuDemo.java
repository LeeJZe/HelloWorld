package com.lee.Demo.AdDemo;

import java.util.Arrays;

public class YuanShuDemo {
    public static void main(String[] args) {
        int []arr = new int [4];
        int temp = 0;
        int max = 0;
        int min = 0;
        for (int i = 1000; i < 10000; i++) {
            temp = i;
            //1、分别取出每一位，将取出的位数放在一个数组中。
            for (int j = 0; j < arr.length; j++) {
                arr[j] = temp % 10;
                temp = temp / 10;

            }
            //2、将取出的四个数按照从小到大的排序。
            Arrays.sort(arr);
            //3、求出最大数，因为最大数已经找出。
            max = arr[3] * 1000 + arr[2] * 100 + arr[1] * 10 + arr[0];
            //4、将第一个非零数放到第一位。
            temp = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] != 0)
                {
                    temp = arr[0];
                    arr[0] = arr[j];
                    arr[j] = temp;
                    break;
                }
            }
            //5、求出最小数。
            min = arr[0] * 1000 + arr[1] * 100 + arr[2] * 10 + arr[3];
            //6、判断最大数和最小数的差是不是n
            if(i == (max - min))
            {
                System.out.println("这个四位数是" + i);
            }
        }
    }

}
