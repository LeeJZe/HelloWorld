package com.lee.Demo.BaDemo;

public class CatchException {
    public static void main(String[] args ){
        try{
            System.out.println("begin");
            Class tempclass = Class.forName("");
        }catch (ClassNotFoundException e){
            System.out.println("catch it");
            e.printStackTrace();
            System.out.println("over");
        }finally {
            System.out.println("finally.");
        }

    }
}
