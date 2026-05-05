/*
Description:
Write a method in the HeapIntPriorityQueue class called toString that returns a string representation of the elements
in the queue, such as "[42, 50, 45, 78, 61]". The order of the elements in the string does not matter
as long as they are all present in the proper format.


Note: You only need to create a method and not a full program. You can use blueJ to test and ensure successful implementation but only submit the method.

test #1: test1
value: "[-2, 3, 5, 6, 8]"
assertion: [-2, 3, 5, 6, 8] should not be modified
value: [-2, 3, 5, 6, 8]
result: pass

test #2: test2
value: "[1, 2, 3]"
assertion: [1, 2, 3] should not be modified
value: [1, 2, 3]
result: pass
 */
package chapter9;

import java.util.Scanner;
import classprograms.HeapIntPriorityQueue;
public class exercise3 {

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
        HeapIntPriorityQueue pq = new HeapIntPriorityQueue();
        HeapIntPriorityQueue pq1 = new HeapIntPriorityQueue();
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
                pq.add(-2);
                pq.add(3);
                pq.add(5);
                pq.add(6);
                pq.add(8);
                System.out.println(pq.toString());
            }
            else if(choice == 3)
            {
                pq1.add(1);
                pq1.add(2);
                pq1.add(3);
                System.out.println(pq1.toString());
            }
            else{
                System.exit(0);
            }
        }while(choice != 4);

    }//end main
}
