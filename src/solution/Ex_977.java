package solution;

/**
 * #977
 * Squares of a Sorted Array
 *
 * 1 ms	40.8 MB
 */

public class Ex_977 {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0, right = nums.length-1;
        for (int i = nums.length-1; i >=0; i--) {
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                result[i] = nums[left] * nums[left];
                left++;
            }
            else{
                result[i] = nums[right] * nums[right];
                right--;
            }
        }
        return result;
    }
}
