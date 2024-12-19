package com.basic.practice1;

public interface Sample1
{
    public void test();
    public default void check(int a1)
    {
        System.out.println("This is check() of sample1");
    }
}
interface Sample2 extends Sample1
{
    public void test();
    public default void check1(){
        System.out.println("this is check1() of sample2");
    }
}
class Demo implements Sample2
{

    @Override
    public void test()
    {
        System.out.println("This is test() method of sample1 implemented by Demo");
    }

  /*  @Override
    public void test1()
    {
        System.out.println("This is test1() method of sample2 implemented by Demo");
    }*/
}
class InheritanceMainClass extends Demo
{
    public static void main(String[] args) {
      InheritanceMainClass i1=  new InheritanceMainClass();
     // i1.check(10);
      i1.check1();
      i1.test();
     // i1.test1();
    }
}
