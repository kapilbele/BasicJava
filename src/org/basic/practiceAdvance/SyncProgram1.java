package org.basic.practiceAdvance;

public class SyncProgram1
{

    private int a1=10;
    synchronized public void increment()
    {
        a1++;
    }

    synchronized public void decrement()
    {
        a1--;
    }

    synchronized public void show()
    {
        System.out.println(a1);
    }
}
