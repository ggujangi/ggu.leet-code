package solution.easy;

import java.util.Arrays;

/**
 * #561
 * Array Partition I
 *
 * 10 ms 40.7 MB
 */

public class Ex_561 {
    public int arrayPairSum(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i=i+2){
            result+=nums[i];
        }
        return result;
    }
}
