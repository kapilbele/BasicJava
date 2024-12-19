package org.basic.practiceAdvance;

public class Object
{
    public static void main(String[] args)
    {
       Object ob1= new Object();
       System.out.println(ob1.hashCode());

       Object ob2= new Object();
       System.out.println(ob2.hashCode());

       Object ob3=ob1;

        System.out.println(ob1.equals(ob2));
        System.out.println(ob1.equals(ob3));
        System.out.println(ob1);
    }
}
