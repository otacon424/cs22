/*
Chapter 3 Exercise 3:

Write a method removeDuplicates that takes as a parameter a sorted ArrayList of Strings and that eliminates any duplicates from the list.
 For example, suppose that a variable called list contains the following values:
 {"be", "be", "is", "not", "or", "question", "that", "the", "to", "to"}
 After calling removeDuplicates(list); the list should store the following values:
 {"be", "is", "not", "or", "question", "that", "the", "to"}

Because the values will be sorted, all of the duplicates will be grouped together.


 */

package chapter3;
import java.util.ArrayList;

public class exercise3 {

    public static void removeDuplicates(ArrayList<String> stringList)
    {
        ArrayList<String> result = new ArrayList<>();

        for(String str : stringList)
        {
            if(!result.contains(str)){
                result.add(str);
            }
        }

        stringList.clear();
        stringList.addAll(result);
    }


    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();

        list.add("be");
        list.add("be");
        list.add("is");
        list.add("not");
        list.add("or");
        list.add("question");
        list.add("that");
        list.add("the");
        list.add("to");
        list.add("to");

        System.out.println(list.toString());
        removeDuplicates(list);
        System.out.println(list);
    }
}
