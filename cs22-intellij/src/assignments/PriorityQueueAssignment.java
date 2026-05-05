/*
Author: Aaron Jones
Date: 05/04/2026
Description:

Remove Duplicates

Write a method called removeDuplicates that accepts a PriorityQueue of integers as a parameter
and modifies the queue's state so that any element that is equal to another element in the queue is removed.
For example, if the queue stores [7, 7, 8, 8, 8, 10, 45, 45], your method should modify the queue to store
[7, 8, 10, 45]. You may use one stack or queue as temporary storage.

kthSmallest

Write a method called kthSmallest that accepts a PriorityQueue of integers and an integer k as parameters and
returns the kth-smallest integer from the priority queue (where k=1 would represent the very smallest).
For example, if the queue passed stores the integers [42, 50, 45, 78, 61] and k is 4,
return the fourth-smallest integer, which is 61. If k is 0 or negative or greater than the size of the queue,
return -1 and print "Invalid Argument."  You may use one stack or queue as temporary storage.

isConsecutive

Write a method called isConsecutive that accepts a PriorityQueue of integers as a parameter and returns true
if the queue contains a sequence of consecutive integers starting from the front of the queue.
Consecutive integers are integers that come one after the other, as in 5, 6, 7, 8, 9, etc.,
so if the queue stores [7, 8, 9, 10, 11], your method should return true. (Also return true if passed an empty queue.)
If your method modifies the state of the queue during its computation, it should restore the queue before it returns.
You may use one stack or queue as auxiliary storage.


 */
package assignments;

import java.util.PriorityQueue;

public class PriorityQueueAssignment {


    /*
        kthSmallest(PriorityQueue<Integer> priorityQueue)
        @params PriorityQueue<Integer> priorityQueue
        @returns int k
     */

    
    /*
        isConsecutive(PriorityQueue<Integer> pq)
        @param PriorityQueue<Integers>
        @returns true
     */
    public boolean isConsecutive(PriorityQueue<Integer> priorityQueue)
    {
        return true;
    }

    public static void main(String[] args)
    {
        System.out.println("Priority Queue Assignment");
    }
}
