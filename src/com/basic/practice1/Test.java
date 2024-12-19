package com.basic.practice1;

public class Test
{
        public Test()
        {
            this("sv",2005);
            System.out.println("Default cons...");
        }

        public Test(String model)
        {
             this();
            System.out.println("One Arg cons...."+model);
        }

        public Test(String model,int year)
        {
            System.out.println("Two Arg con..."+model+" "+year);
        }

        public static void main(String[] args)
        {
            new Test("Thar");

    }
}
