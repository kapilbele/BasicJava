package com.basic.practice1;

interface Practice1
{
    public default void check()
    {
        System.out.println("check() of Practice1");
    }
}

interface Practice2
{
    public default void check1()
    {
        System.out.println("check1() of Practice2");
    }
}

class Practice3 implements Practice1,Practice2
{

}
public class InheritancePractice
{

}
