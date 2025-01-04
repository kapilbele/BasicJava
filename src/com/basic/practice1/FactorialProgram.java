package com.basic.practice1;

import java.util.Scanner;

public class FactorialProgram
{
    public int calculate(int a1) {
        int fact = 1;
        for (int i = 1; i <= a1; i++) {
            fact = fact * i;
        }
        return fact;

    }
        public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter a number");
        int a1=sc1.nextInt();

        FactorialProgram fp=new FactorialProgram();
        int fact= fp.calculate(a1);
        System.out.println("Factorial of given number is: "+fact);
    }
}
