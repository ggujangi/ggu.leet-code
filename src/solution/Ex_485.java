package solution;

/**
 * #485
 * Max Consecutive Ones
 *
 * 1 ms	40.3 MB
 */

public class Ex_485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;

        for(int n : nums){
            if(n==1) {
                count ++;
                if(max < count) max = count;
            }
            else count = 0;
        }

        return max;
    }
}
