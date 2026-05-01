/*
Describe a recursive algorithm for finding the maximum element in an array, A, of n elements.
What is your running time? (Note: This question asks for a description of your algorithm not code.)
Explain how to modify the recursive binary search algorithm so that it returns the index of the target in the sequence or -1
(if target not found). See slide 11 for code to adjust.
Draw the recursion trace for the execution of reverseArray(data, 0, 4), from slide 22 on array data = 4, 3, 6, 2, 6.
Write a short recursive Java method that rearranges an array of integer values so that all the even values appear before
all the odd values. (Note: this question requests a method so submit a code snippet of your recursive method.
Include descriptive details of your code.)


 */
package chapter5;
import java.util.*;

public class RecursionExercises {

    public static boolean binarySearch(int[] data, int target, int low, int high)
    {
        if(low > high) // O(n)
            return false; // O(1)
        else{
            int mid = (low + high) / 2; // O(1)
            if(target == data[mid]) // O(n)
                return true; // O(1)
            else if (target < data[mid]) // O(n)
                return binarySearch(data, target, low, mid-1); // O(1)
            else
                return binarySearch(data, target, mid + 1, high); // O(1)
        }
    } // end binarySearch

    // (n * n * n) + 1 + 1 + 1 + 1  = O (n^3)

    public static void reverseArray(int[] data, int low, int high)
    {
        if(low < high)
        {
            int temp = data[low];
            data[low] = data[high];
            data[high] = temp;
            reverseArray(data, low + 1, high - 1);
        }
    } //reverseArray()


    public static void displayMenu()
    {
        System.out.println("1) Yet to be implemented");
        System.out.println("2) Yet to be implemented");
        System.out.println("3) reverseArray(data, 0, 4)");
        System.out.println("4) Exit ");

    } //end displayMenu

    public static void main(String[] args)
    {
        int[] data = {4, 3, 6, 2, 6};

        displayMenu();
        Scanner kb = new Scanner(System.in);
        int choice = kb.nextInt();
            if (choice == 1) {
                System.out.println("Yet to be implemented.");
            } else if (choice == 2) {
                System.out.println("Yet to be implemented.");
            } else if (choice == 3) {
                reverseArray(data, 0, 4);
            } else {
                System.exit(0);
            }

    }//end main
}
