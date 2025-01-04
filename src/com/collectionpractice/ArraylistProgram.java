package com.collectionpractice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistProgram
{
    public static void main(String[] args)
    {
        ArrayList alist=new ArrayList();
        alist.add(19);
        alist.add("kapil");
        alist.add(null);
        alist.add(true);
        alist.add('a');
        alist.add("pari");

        System.out.println(alist);


        alist.add(5,"patil");
        System.out.println(alist);

        //alist.remove(3);
        System.out.println(alist);
        System.out.println(alist.get(2));
        System.out.println(alist.size());
        System.out.println(alist.isEmpty());

       Iterator it = alist.iterator();
       while (it.hasNext())
       {
           System.out.println(it.next());
       }
    }
}
