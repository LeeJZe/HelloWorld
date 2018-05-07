package com.lee.Demo;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World");
        String numString = "88";
        System.out.println("numString + 3 =:"+ (numString+3));
        int numInt = Integer.parseInt(numString);
        System.out.println("numInt + 3 =:"+(numInt+3) );
        String aa = String.valueOf(12);
        System.out.println(aa);
        String bb = Integer.toString(13);
        System.out.println(bb);
    }
}
