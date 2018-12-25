package com.lee.Demo.BaDemo;

public class SelfExceptionDemo extends ArithmeticException {
    public SelfExceptionDemo(){

    }
    public SelfExceptionDemo(String msg){
        super(msg);
    }
}
