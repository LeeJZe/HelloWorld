package com.lee.Demo.FactoryDemo;

public class HumanFactory {
    public Human createHuman(String gender){
        if(gender.equals("male")){
            return new Male();
        }else if (gender.equals("female")){
            return new Female();
        }else {
            System.out.println("类型错误");
            return null;
        }

    }
}
