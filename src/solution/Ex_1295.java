package solution;

/**
 * #1295
 * Find Numbers with Even Number of Digits
 *
 * 2 ms	38.1 MB
 */

public class Ex_1295 {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int n : nums) {
            count = String.valueOf(n).length() % 2 == 0 ? count + 1 : count;
        }
        System.gc();
        return count;
    }
}
