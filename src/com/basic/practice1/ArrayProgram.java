package com.basic.practice1;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayProgram
{

    public void check(int[] a1)
    {
        for (int i=0;i<a1.length;i++)
        {
            System.out.println(a1[i]);
        }

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] a1=new int[4];
        System.out.println("Enter an input array");
        for (int i=0;i<a1.length;i++) {
           a1[i]=sc.nextInt();
        }

        ArrayProgram ap=new ArrayProgram();
        ap.check(a1);

    }
}