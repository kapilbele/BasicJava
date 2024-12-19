package org.basic.practiceAdvance;

public class IRProgram1 implements Runnable
{

    @Override
    public void run()
    {
        System.out.println("Task t1 started execution...");
        System.out.println("t1 completed...");
        System.out.println("Task t1 ended his execution...");
    }
}
