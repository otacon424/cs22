/*
4.1. Approximate the runtime of the following code fragment, in terms of n: Write your answer in a format such as "O(N^2)" or "O(N log N)" (without the quotes).
 */
package chapter4;

public class exercise1 {

    public static void main(String[] args)
    {
        int n = 0;
        int sum = 0;
        int j = 1;
        while (j <= n) {
            sum++;
            j = j * 2;
        }
    }
}
