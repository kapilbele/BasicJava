package org.basic.practiceAdvance;

import java.util.Scanner;

public class SyncProgramMain
{
    public static void main(String[] args)
    {

        SyncProgram1 sp1=new SyncProgram1();
        Runnable r1=() ->
        {
            System.out.println("t1 starts....");
            sp1.increment();
            sp1.show();
            System.out.println("t1 ends....");
        };

        Runnable r2=()->
        {
            System.out.println("t2 starts....");
            sp1.decrement();
            sp1.show();
            System.out.println("t2 ends....");
        };

        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);

        t1.start();
        t2.start();
    }
}
