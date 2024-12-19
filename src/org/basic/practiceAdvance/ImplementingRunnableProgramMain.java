package org.basic.practiceAdvance;

public class ImplementingRunnableProgramMain
{
    public static void main(String[] args)
    {

        IRProgram1 ir1=new IRProgram1();
        Thread t1=  new Thread(ir1);
        t1.start();
    }
}
