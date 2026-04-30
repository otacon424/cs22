/*
4.2. Approximate the runtime of the following code fragment, in terms of n: Write your answer in a format such as "O(N^2)" or "O(N log N)" (without the quotes).
 */

package chapter4;
import java.util.*;

public class exercise2 {
    public static void main(String[] args)
    {
        long startTime = System.currentTimeMillis();
        long endTime = System.currentTimeMillis();
        long elapsed = endTime - startTime;

        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a value for n: ");
        int n = kb.nextInt();

        int sum = 0;
        for (int j = 1; j < n; j++) {
            sum++;
            if (j % 2 == 0) {
                sum++;
            }
        }

        System.out.println("Elapsed time is: " + elapsed + "For N: " + n);

    }
}
