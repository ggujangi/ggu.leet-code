package solution;

/**
 * #485
 * Max Consecutive Ones
 *
 * 2 ms	40.6 MB
 */

public class Ex_485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, max = 0;

        for (int n : nums) {
            max = Math.max(max,
                    count = n == 0 ? 0 : count + 1);
        }

        return max;
    }
}
