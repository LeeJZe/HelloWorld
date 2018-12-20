package com.lee.Demo.BaDemo;

public class Random {
    public static void main(String[] args){
        String [] names = {"lucy","lily","tom","andy","lala"};
        String [] actions = {"like","hate","love"};
        String [] something = {"apple","banana","pear","ball"};
        int oneLength=names.length;
        int twoLength =  actions.length;
        int threeLength = something.length;
        int oneRandom = (int)(Math.random()*oneLength);
        System.out.println(oneRandom);
        int twoRandom = (int)(Math.random()*twoLength);
        System.out.println(twoRandom);
        System.out.println(Math.random());
        int threeRandom = (int)(Math.random()*threeLength);
        System.out.println(threeRandom);
        String stanceOne = names[oneRandom] + " " +actions[twoRandom]+" "+something[threeRandom];
        System.out.println(stanceOne);
    }
}
