package assignments;

public class Algorithm_Analysis {

    public static int example1(int[] array) {
        int n = array.length, total = 0;
        for (int j = 0; j < n; j += 2) {
            total += array[j];
        }
        return total;
    }

    public static int example2(int[] array) {
        int n = array.length, total = 0;
        for (int j = 0; j < n; j++) {
            for (int k = 0; k <= j; k++) {
                total += array[j];
            }
        }
        return total;
    }

    public static int example3(int[] array) {
        int n = array.length, prefix = 0, total = 0;
        for (int j = 0; j < n; j++) {
            prefix += array[j];
            total += prefix;
        }

        return total;
    }

    public static int example4(int[] array, int[] array2) {
        int n = array.length, count = 0;
        for (int i = 0; i < n; i++) {
            int total = 0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k <= j; k++) {
                    total += array[k];
                    if (array2[i] == total) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

}



