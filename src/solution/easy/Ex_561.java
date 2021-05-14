package solution.easy;

/**
 * #561
 * Array Partition I
 *
 * 3 ms 40.9 MB
 */

public class Ex_561 {
    public int arrayPairSum(int[] nums) {
        int[] arr = new int[20001];
        int lim = 10000, sum = 0;
        for (int n : nums) arr[n + lim]++;

        int k = 0;

        for (int i = 0; i < nums.length; i = i + 2) {
            while (arr[k] == 0) k++;

            sum += k - lim;

            if (arr[k] == 1) {
                k++;
                while (arr[k] == 0) k++;
                arr[k]--;
            } else {
                arr[k] -= 2;
            }
        }

        return sum;
    }
}
