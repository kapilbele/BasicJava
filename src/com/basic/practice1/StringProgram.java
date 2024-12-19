package com.basic.practice1;

public class StringProgram
{
    public static void main(String[] args)
    {
        String s1="Kapil";
        String s2="Kapil";
        String s3=new String("Pragati");
        String s4=new String("Pragati");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3==s4);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));
    }
}
