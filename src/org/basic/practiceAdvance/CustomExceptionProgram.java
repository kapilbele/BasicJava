package org.basic.practiceAdvance;

import java.util.Scanner;

public class CustomExceptionProgram
{
    public static void main(String[] args)
    {
      Scanner sc1=new Scanner(System.in);
      System.out.println("Enter the Age");
      int age= sc1.nextInt();
       Marriage me= new Marriage();
       try {
           me.checkAge(age);
       }
       catch (InvalidMarriageException ie)
       {
           ie.printStackTrace();
       }
    }
}
