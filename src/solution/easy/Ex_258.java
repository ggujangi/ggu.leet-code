package solution.easy;

/**
 * #258
 * Add Digits
 *
 * 1 ms	36.2 MB
 */

public class Ex_258 {
    public int addDigits(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num = num / 10;

            if (sum > 9 && num == 0) {
                num = sum;
                sum = 0;
            }
        }

        return sum;
    }
}
