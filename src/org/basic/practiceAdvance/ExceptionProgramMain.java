package org.basic.practiceAdvance;

import java.util.Scanner;

class EProgram1
{
    public int divide(int a1, int b1) throws ArithmeticException
    {
     int res=0;
     res=a1/b1;
     return res;
    }
}

public class ExceptionProgramMain
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a value of a1");
       int a1=sc.nextInt();

       System.out.println("Enter a value of b1");
       int b1=sc.nextInt();
       EProgram1 ep=new EProgram1();
       try {
           int res= ep.divide(a1,b1);
           System.out.println("result is: "+res);
       }
       catch(ArithmeticException ae)
       {
           ae.printStackTrace();
       }


    }
}