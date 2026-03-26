/*
Exercise 3.1 Output mystery4 as it passes the ArrayLists.

 */
package chapter3;

import java.util.ArrayList;


public class exercise1 {

    public static void mystery4(ArrayList<Integer> list)
    {
        for(int i = 0; i < list.size(); i++)
        {
            int element = list.get(i);
            list.remove(i);
            list.add(0, element + 1);
        }
        System.out.println(list);
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();


        list1.add(10);
        list1.add(20);
        list1.add(30);

        list2.add(8);
        list2.add(2);
        list2.add(9);
        list2.add(7);
        list2.add(4);

        list3.add(-1);
        list3.add(3);
        list3.add(28);
        list3.add(17);
        list3.add(9);
        list3.add(33);

        mystery4(list1);
        mystery4(list2);
        mystery4(list3);

    }
}
