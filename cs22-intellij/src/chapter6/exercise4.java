package chapter6;

import java.util.*;

public class exercise4 {

    public static void mystery2(Queue<Integer> q)
    {
        Stack<Integer> s = new Stack<Integer>();
        int size = q.size();
        for(int i = 0; i < size; i++)
        {
            int n = q.remove();
            if(n%2 ==  0)
            {
                s.push(n);
            }
            else {
                q.add(n);
            }
        }
       System.out.println(q + " " + s);
    }//end mystery2

    public static void displayMenu()
    {
       System.out.println("Choice 1: Test Case 1 (Queue 1: [1,2,3,4,5,6])");
       System.out.println("Choice 2: Test Case 2 (Queue 2: [42, -3, 4, 15, 9, 71])");
       System.out.println("Choice 3: Test Case 3 (Queue 3: [30, 20, 10, 60, 50, 40, 3, 0])");
       System.out.println("Choice 4: Test Case 4 (Random Queue) ");
       System.out.println("Choice 5: Quit");

    } //end displayMenu
    public static void main(String[] args)
    {
        int choice;
        Scanner kb = new Scanner(System.in);
        Queue<Integer> q1 = new LinkedList<Integer>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.add(6);

        Queue<Integer> q2 = new LinkedList<Integer>();
        q2.add(42);
        q2.add(-3);
        q2.add(4);
        q2.add(15);
        q2.add(9);
        q2.add(71);

        Queue<Integer> q3 = new LinkedList<Integer>();
        q3.add(30);
        q3.add(20);
        q3.add(10);
        q3.add(60);
        q3.add(50);
        q3.add(40);
        q3.add(3);
        q3.add(0);

        do{
            displayMenu();
            choice = kb.nextInt();
            if(choice == 1)
            {
                mystery2(q1);
            }
            else if(choice == 2)
            {
                mystery2(q2);
            }
            else if(choice == 3)
            {
                mystery2(q3);
            }
            else if(choice == 4)
            {
                System.out.println("Yet to be implemented");
            }
            else{
                System.exit(0);
            }
        }while(choice != 5);
    } //end main
}
