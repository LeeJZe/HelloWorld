package com.lee.Demo.BaDemo;

public  class  Cellphone extends Telephone {
    public void call(){
        System.out.println("I can make a call!");
    }

    public void message() {
        System.out.println("I can send a message!");
    }
    public  static void main(String[] args){
        Cellphone aa = new Cellphone();
        aa.call();
        aa.message();
    }
}
