package solution.easy;

/**
 * #67
 * Add Binary
 *
 * 1 ms	37.9 MB
 */

public class Ex_67 {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;

        int sum = 0;
        StringBuilder builder = new StringBuilder();

        while (sum > 0 || i >= 0 || j >= 0) {
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            builder.append(sum % 2);
            sum /= 2;
        }

        return builder.reverse().toString();
    }
}
