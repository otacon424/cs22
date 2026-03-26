/*
Create a class called Name that represents a person's name. The class should have fields named firstName representing the person's first name,
lastName representing their last name, and middleInitial representing their middle initial (a single character). Your class should contain only fields for now.
 */

package chapter2;

import chapter2.Name;

public class exercise1 {

    public static void main(String[] args)
    {
        Name myName = new Name("Aaron", "Jones", 'G');

        System.out.println(myName.toString());
    }
}
