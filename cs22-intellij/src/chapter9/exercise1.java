/*
Author: Aaron Jones
Date: May 4, 2026
Description:
Write a method called fillGaps that accepts a PriorityQueue of integers as a parameter and adds elements to it until
every element in its range of smallest to largest is represented once if it was not previously found in the priority queue.
For example, if the queue stores [1, 3, 3, 6, 6, 8], your method should modify the queue to store [1, 2, 3, 3, 4, 5, 6, 6, 7, 8].
You may use one collection as auxiliary storage.

Note: You only need to create a method and not a full program. You can use blueJ to test and ensure successful implementation but only submit the method.

Test 1: fillGaps([1, 3, 3, 6, 6, 8]);
→ [1, 2, 3, 4, 5, 6, 7, 8]

Test 2: fillGaps([7, 11, 13, 14]);
→ [7, 8, 9, 10, 11, 12, 13, 14]

Test 3: fillGaps([0, 3]);
→ [0, 1, 2, 3]

 */
package chapter9;

import java.util.Scanner;

public class exercise1 {

    public static void displayMenu()
    {
        System.out.println("1) Test 1");
        System.out.println("2) Test 2");
        System.out.println("3) Test 3");
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
                System.out.println("Yet to be implemented");
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
