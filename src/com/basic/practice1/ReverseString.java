package com.basic.practice1;

import java.util.Scanner;

public class ReverseString
{
    public String reverse(String s1)
    {
        String res="";
        for (int i=s1.length()-1;i>=0;i--)
        {
            res=res+s1.charAt(i);
        }

        return res;
    }

    public static void main(String[] args)
    {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter a string");
        String s1=sc1.next();

        ReverseString r1=new ReverseString();
        String res= r1.reverse(s1);
        System.out.println("Reverse String is: "+res);
    }
}
