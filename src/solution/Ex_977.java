package solution;

import java.util.Arrays;

/**
 * #977
 * Squares of a Sorted Array
 *
 * 2 ms	40.8 MB
 */

public class Ex_977 {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
