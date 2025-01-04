package com.collectionpractice;

import java.util.*;

public class HashMapProgram
{
    public static void main(String[] args)
    {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(101,"kapil");
        hm.put(102,null);
        hm.put(103,"patil");
        hm.put(104,"Pari");
        hm.put(null,"prashant");

        System.out.println(hm);

        System.out.println(hm.get(102));
        System.out.println(hm.containsKey(101));
        System.out.println(hm.containsValue("patil"));

        System.out.println(hm.keySet());
        System.out.println(hm.values());

        /*for(Map.Entry<Integer, String> m:hm.entrySet())
        {

            System.out.println(m.getKey()+" "+m.getValue());
        }*/

         Set sm = hm.entrySet();
         Iterator it=sm.iterator();
         while (it.hasNext())
         {
             System.out.println(it.next());
         }
    }
}
