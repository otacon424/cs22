/*
Description:
Instructions

Write a method in the HeapIntPriorityQueue class called toArray that returns the elements of the queue as a filled array.
The order of the elements in the array is not important as long as all elements from the queue are present in the array,
with no extra empty slots before or afterward.

Note: You only need to create a method and not a full program. You can use blueJ to test and ensure successful implementation but only submit the method.

test #1: test1
assertion: [-2, 3, 5, 6, 8] toArray
value: [-2, 3, 5, 6, 8]
assertion: [-2, 3, 5, 6, 8] should not be modified
value: [-2, 3, 5, 6, 8]
result: pass

test #2: test2
assertion: [1, 2, 3] toArray
value: [1, 2, 3]
assertion: [1, 2, 3] should not be modified
value: [1, 2, 3]
result: pass
 */
package chapter9;

import classprograms.HeapIntPriorityQueue;
import java.util.Scanner;

public class exercise2 {

    public static void displayMenu()
    {
        System.out.println("1) Display Heap Priority Queue");
        System.out.println("2) Test 1");
        System.out.println("3) Test 2");
        System.out.println("4) Quit");
    } //end displayMenu

    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int choice;

        do{
            displayMenu();
            choice = kb.nextInt();
            if(choice == 1)
            {

            }
            else if(choice == 2)
            {
                System.out.println("Yet to be implemented");
            }
            else if(choice == 3)
            {
                System.out.println("Yet to be implemented");

            }
            else{
                System.exit(0);
            }
        }while(choice != 4);

    }//end main
}
