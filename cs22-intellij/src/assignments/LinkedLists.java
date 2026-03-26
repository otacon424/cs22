/*
Assignment 3: Linked List
Using the ListNode.java Download ListNode.java file.

    Write methods called min and max that return the smallest and largest values in the linked list.
    These methods will be added to your ListNode class.  For example if a variable called list stores {11, -7, 3, 42, 0, 14],
    the call of list.min() should return -7 and the call of list.max() should return 42. If the list is empty, return -1. Print the returned value.

    Write a method called insertNode that inserts a new node anywhere in your linked list. Display your linked list with new value.

Write a program to test these methods to ensure accuracy and successful implementation. Upload your modified version of the ListNode java file only.
 */


package assignments;
import assignments.ListNode;

public class LinkedLists {

    public static void main(String[] args)
    {
        ListNode test = new ListNode();

        test.add(9);
        test.add(7);
        test.add(2);
        test.add(5);
        System.out.println("Linked List is: ");
        test.display();
        System.out.println("Maximum element in linked list: ");
        System.out.println(test.max());
        System.out.println("Minimum element in linked list: ");
        System.out.println(test.min());
    }
}
