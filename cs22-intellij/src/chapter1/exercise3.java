/*
Write a method called append that accepts two integer arrays as parameters and returns a new array that contains the result
of appending the second array's values at the end of the first array. For example, if arrays list1 and list2 store {2, 4, 6} and
{1, 2, 3, 4, 5} respectively, the call of append(list1, list2) should return a new array containing {2, 4, 6, 1, 2, 3, 4, 5}.
If the call instead had been append(list2, list1), the method would return an array containing {1, 2, 3, 4, 5, 2, 4, 6}.
 */

package chapter1;

public class exercise3 {

    public static int[] append(int[] array1, int[] array2)
    {
        int[] result = new int[array1.length + array2.length];

        for(int i = 0; i < array1.length; i++)
        {
            result[i] = array1[i];
        }

        for(int i = 0; i < array2.length; i++)
        {
            result[array1.length + i ] = array2[i];
        }
        return result;
    }
    public static void main(String[] args)
    {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,1,1,1,1};

        int[] array3 = append(array1, array2);
        for(int i = 0; i < array3.length; i++)
        {
            System.out.println(array3[i]);
        }
    }
}
