package com.lee.Demo.AdDemo;

public class PrintTriangle {
    public static void main(String[] args){
        int n = 5;
        PrintTriangle print = new PrintTriangle();
        print.printRightTriangle(n);
        print.printTriangleTwo(n);


    }
    private void printRightTriangle(int a){
        int last=0;
        for(int i=1;i<=a;i++){
            for (int j=1;j<=i;j++){
                last++;
                System.out.printf("%02d\t",last);
            }
            System.out.println();
        }
    }
    private void printTriangleTwo(int b){
        for(int i = 1;i <= b;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }

    }
}
