/*
Description:

This algorithm uses min-heap and queues to navigate through a given array and place the top ten greatest integers into a new array and return it.

The queue algorithm returns a O(n)

The min-heap using priority queue returns O(log n)

 */
package assignments;

import java.util.*;


public class Algorith_Analysis_2 {

    /* Didn't get the top ten values */
    public static int[] getTopTen(int[] nums) {
        int k = 10;

        // Handle cases where array size is less than 10
        if (nums.length <= k) {
            Arrays.sort(nums);
            return nums;
        }

        //Used to declare the queue
        Queue<Integer> queue = new LinkedList<>();
        for(int num : nums) // For each loop to navigate the nums array
        {
            if(queue.size() < k)
            {
                queue.add(num); //Add the value of the queue
            }else if(num > queue.peek())
            {
                queue.poll();
                queue.add(num);
            }
        }


        // Convert heap to array for the result
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = queue.poll();
        }
        return result;
    }

     public static int[] getTopTenMinHeap(int[] nums)
     {

                 int k = 10;

                 if (nums.length <= k) {
                     Arrays.sort(nums);
                     return nums;
                 }

                 // A PriorityQueue keeps the smallest element at the head (peek)
                 PriorityQueue<Integer> queue = new PriorityQueue<>(k);

                 for (int num : nums) {
                     if (queue.size() < k) {
                         queue.add(num);
                     } else if (num > queue.peek()) {
                         queue.poll();
                         queue.add(num);
                     }
                 }

                 int[] result = new int[k];
                 for (int i = 0; i < k; i++) {
                     result[i] = queue.poll();
                 }
                 return result;
             }
    public static void main(String[] args)
    {
        int[] data = {3, 10, 100, 1, 4, 15, 2, 65, 8, 20, 11, 7, 50, 9};
        System.out.println("Top 10: " + Arrays.toString(getTopTen(data)));
        System.out.println("Top 10: " + Arrays.toString(getTopTenMinHeap(data)));
    }
}
