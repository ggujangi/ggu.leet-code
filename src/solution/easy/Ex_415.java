package solution.easy;

/**
 * #415
 * Add Strings
 *
 * Wrong!!
 */

public class Ex_415 {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        int sum = 0;

        while (i >= 0 || j >= 0) {
            if (i >= 0) {
                sum += (int) ((num1.charAt(i) - '0') * Math.pow(10, num1.length() - 1 - i));
                i--;
            }
            if (j >= 0) {
                sum += (int) ((num2.charAt(j) - '0') * Math.pow(10, num2.length() - 1 - j));
                j--;
            }
        }

        return String.valueOf(sum);
    }
}
