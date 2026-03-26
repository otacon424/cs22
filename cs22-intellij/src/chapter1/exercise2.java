/*
Write a method named contains that accepts two arrays of integers a1 and a2 as parameters and that returns a boolean value indicating whether or not a2's sequence of elements
appears in a1 (true for yes, false for no). The sequence of elements in a2 may appear anywhere in a1 but must appear consecutively and in the same order.
 */
package chapter1;

public class exercise2 {

    public static boolean contains(int[] array1, int[] array2)
    {
        if(array2.length == 0)
        {
            return true;
        }
        for(int i = 0; i <= array1.length - array2.length; i++)
        {
            boolean match = true;
            for(int j = 0; j < array2.length; j++)
            {
                if(array1[i+j] != array2[j])
                {
                    match = false;
                    break;
                }
            }
            if(match)
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,2,3,4,5};

        System.out.println(contains(array1, array2));
    }
}
