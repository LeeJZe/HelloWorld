package com.lee.Demo.BaDemo;

public class People{
    private  int age ;
    private  int num ;
    private  int sex = 0;
    public void  setAge(int newage){
        age = newage;
    }
    public int getAge(){
        return  age;
    }
    public void setNum(int newnum){
        num = newnum;
    }
    public  int getNum(){
        return num;
    }

    public class Student{
        String  ID = "123131";
        public void studentInfo(){
            System.out.println("outer.sex"+sex);
            System.out.println("inner.ID"+ID);


        }

    }
}