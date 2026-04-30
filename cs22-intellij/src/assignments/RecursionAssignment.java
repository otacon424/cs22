/*
Complete each of the following exercises and upload your document.

    Describe a recursive algorithm for finding the maximum element in an array, A, of n elements. What is your running time?
    (Note: This question asks for a description of your algorithm not code.)

    Explain how to modify the recursive binary search algorithm so that it returns the index of the target in the sequence or -1
    (if target not found). See slide 11 for code to adjust.

    Draw the recursion trace for the execution of reverseArray(data, 0, 4), from slide 22 on array data = 4, 3, 6, 2, 6.
    Write a short recursive Java method that rearranges an array of integer values so that all the even values appear before all the odd values.
    (Note: this question requests a method so submit a code snippet of your recursive method. Include descriptive details of your code.)

 */

package assignments;

public class RecursionAssignment {


    public static int binarySearch(int[] data, int target, int low, int high)
    {
        if(low > high)
            return -1;
        else {
            int mid = (low + high) / 2;
            if(target == data[mid])
                return mid;
            else if(target < data[mid])
                return binarySearch(data, target, low, mid - 1);
            else
                return binarySearch(data, target, mid + 1, high);
        }
    }// end binary search

    public static int findMax(int[] a, int low, int high)
    {
        if(low == high)
        {
            return a[low];
        }
        int mid = (low + high) /2;

        int leftMax = findMax(a, low, mid);
        int rightMax = findMax(a, mid + 1, high);

        return Math.max(leftMax, rightMax);
    }// end findMax

    public static void reverseArray(int[] data, int low, int high)
    {
        System.out.println("Searching range: [" + low + ", " + high + "]");

        if(low < high) {
            int temp = data[low];
            data[low] = data[high];
            data[high] = temp;
            reverseArray(data, low + 1, high - 1);
        }
    }//end reverseArray

    public static void rearrange(int[] a, int low, int high) {
        if (low >= high) {
            return;
        }

        if (a[low] % 2 == 0)
        {
            rearrange(a, low + 1, high);
        }

        else if(a[high] % 2 != 0)
        {
            rearrange(a, low, high-1);
        }
        else{
            int temp = a[low];
            a[low] = a[high];
            a[high] = temp;

            rearrange(a, low + 1, high - 1);
        }
    }//end rearrange


    public static void main(String[] args)
    {
        int[] array = {4, 3, 6, 2, 6};

        reverseArray(array, 0, 4);

    }
}
