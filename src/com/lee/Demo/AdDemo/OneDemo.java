package com.lee.Demo.AdDemo;

public class OneDemo {
    public static void main(String[] args) {
        int c = 0;
        int d = c++;
        c = d;
        System.out.println("c的值为" + c + "" + d);
        int cc= test();
        System.out.println(cc);
        String a = "abc";
        String b = "abc";
        System.out.println("a==b:"+ a==b);
    }
        public static  int test(){
            int a=0;
            try{
                a=1;
                return a;
        }catch (Exception e){
                return 0;
            }finally {
                a=3;
            }

        }




}
