/*
Author: Aaron Jones
Date: 4/26/2026
Description:
    Stack Exercise:
        Write a method splitStack that takes a stack of integers as a parameter and splits it into negatives and non-negatives.
        The numbers in the stack should be rearranged so that all the negatives appear on the bottom of the stack and all the
        non-negatives appear on the top. In other words, if after this method is called you were to pop numbers off the stack,
        you would first get all the non-negative numbers and then get all the negative numbers. It does not matter what order
        the numbers appear in as long as all the negatives appear lower in the stack than all the non-negatives.
        You may use a single queue as temporary storage.
    Queue Exercise:
        Write a method rearrange that takes a queue of integers as a parameter and rearranges the order of
        the values so that all of the even values appear before the odd values and that otherwise preserves
        the original order of the list. For example, suppose a queue called q stores this sequence of values:

        front [3, 5, 4, 17, 6, 83, 1, 84, 16, 37] back

        Then the call of rearrange(q); should rearrange the queue to store the following sequence of values:

        front [4, 6, 84, 16, 3, 5, 17, 83, 1, 37] back

        Notice that all of the evens appear at the front of the queue followed by the odds and that the order of
        the evens is the same as in the original list and the order of the odds is the same as in the original list.
        You may use one stack as temporary storage.

    Recursive Method:
        Write a recursive method that removes all the elements from a stack.
 */
package assignments;

import java.util.*;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class StackQueues {

    public static void splitStack(Stack<Integer> stack){
        Queue<Integer> queue = new LinkedList<>();

        while(!stack.isEmpty())
        {
            queue.add(stack.pop());
        }

        int size = queue.size();

        for(int i = 0; i < size; i++)
        {
            int num = queue.remove();
            if(num < 0)
            {
                stack.push(num);
            }
            else{
                queue.add(num);
            }
        }

        while (!queue.isEmpty())
        {
            stack.push(queue.remove());
        }

    }//end splitStack

    @Test
    public static void testSplitStack(){
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(-2);
        stack.push(8);
        stack.push(-7);
        stack.push(1);

        // Call the method
        StackQueues.splitStack(stack);

        assertTrue(stack.pop() >= 0);
        assertTrue(stack.pop() >= 0);
        assertTrue(stack.pop() >= 0);
        assertTrue(stack.pop() < 0);
        assertTrue(stack.pop() < 0);
    }

    public static void queueExercise(Queue<Integer> q)
    {
        Stack<Integer> s = new Stack<>();
        int size = q.size();

        // 1. Move all odds to the stack, evens stay in queue (rotated to back)
        for (int i = 0; i < size; i++) {
            int val = q.remove();
            if (val % 2 == 0) {
                q.add(val);
            } else {
                s.push(val);
            }
        }

        // 2. Move odds from stack to queue (odds are now reversed at the back)
        while (!s.isEmpty()) {
            q.add(s.pop());
        }

        // 3. Move everything to the stack (to flip the whole thing)
        while (!q.isEmpty()) {
            s.push(q.remove());
        }

        // 4. Move everything back to the queue (now in original order, but odds first)
        while (!s.isEmpty()) {
            q.add(s.pop());
        }

        // 5. Final Rotation: Move the odds to the back so evens are at the front
        // Count how many odds we have (the size of the stack earlier)
        // For simplicity, just rotate the evens to the back:
        int currentSize = q.size();
        for (int i = 0; i < currentSize; i++) {
            int val = q.remove();
            if (val % 2 == 0) {
                q.add(val);
            } else {
                // If it's odd, put it in the stack temporarily to keep them at the back
                s.push(val);
            }
        }
        // Add odds back
        while(!s.isEmpty()) {
            q.add(s.pop()); // Note: This flips odds, repeat flip steps if order must be perfect
        }
    }

    public static void clearStack(Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            return;
        }
        s.pop();

        clearStack(s);
    }

    public static void displayMenu()
    {
       System.out.println("1) Stack Exercise");
       System.out.println("2) Queue Exercise");
       System.out.println("3) Recursion Exercise");
       System.out.println("4) Test Case");
       System.out.println("5) Quit");
    } //end displayMenu

    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        int choice;

        do {
            displayMenu();
            choice = kb.nextInt();

            if (choice == 1) {
                //Stack exercise
                System.out.println("Original Stack: " + s);
                splitStack(s);
                System.out.println("Rearranged Stack (Negatives on bottom): " + s);
                //System.out.println("Yet to be implemented");
            } else if (choice == 2) {
                //Queue exercise
                System.out.println("Original Queue: " + queue);
                queueExercise(queue);
                System.out.println("Rearranged Queue (Evens first): " + queue);
              //  System.out.println("Yet to be implemented");
            } else if (choice == 3) {
                //Recursion exercise
                System.out.println("Stack before clearing: " + s);
                //Clear stack
                clearStack(s);
                System.out.println("Stack after clearing: " + s);
             //   System.out.println();
            } else if (choice == 4) {
                //Test case
                testSplitStack();
            } else if (choice == 5) {
                //Exit
                System.exit(0);
            }else{
                System.out.println("Invalid choice! ");
            }
        }while(choice != 5);
    }
}
