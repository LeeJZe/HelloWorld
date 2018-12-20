package com.lee.Demo.BaDemo;

public class EncapsulationDemo {

    public static void main(String[] args){
        People lilei = new People();
        People.Student hanmeimei = lilei.new Student();
        lilei.setAge(34);
        lilei.setNum(12);
        System.out.println(lilei.getAge()+" "+lilei.getNum());
        hanmeimei.studentInfo();
    }



}
