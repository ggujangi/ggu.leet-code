package solution;

import java.util.Arrays;

/**
 * #977
 * Squares of a Sorted Array
 *
 * 3 ms	40.9 MB
 */

public class Ex_977 {
    public int[] sortedSquares(int[] nums) {
        int[] s = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            s[i] = nums[i] * nums[i];
        }
        Arrays.sort(s);
        return s;
    }
}
