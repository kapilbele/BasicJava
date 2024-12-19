package com.basic.practice1;

import java.util.Scanner;

public class Addition1
{
    public static void main(String[] args) {
      Scanner sc1 =  new Scanner(System.in);
      System.out.println("Enter value of A1");
      int a1=sc1.nextInt();

      System.out.println("Enter value of b1");
      int b1=sc1.nextInt();

      int c1=a1+b1;
        System.out.println("Addition of a1 + b1 ="+c1);
    }
}
