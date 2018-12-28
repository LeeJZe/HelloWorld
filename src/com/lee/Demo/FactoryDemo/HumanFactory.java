package com.lee.Demo.FactoryDemo;

public class HumanFactory {
    //单工厂模式
//    public Human createHuman(String gender){
//        if(gender.equals("male")){
//            return new Male();
//        }else if (gender.equals("female")){
//            return new Female();
//        }else {
//            System.out.println("类型错误");
//            return null;
//        }
//
//    }
    //静态工厂模式
    public static Male cereateMale(){
        return new Male();
    }
    public static Female createFemale(){
        return new Female();
    }






}
