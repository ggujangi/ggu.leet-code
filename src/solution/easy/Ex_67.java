package solution.easy;

/**
 * #67
 * Add Binary
 *
 * Wrong!!
 */

public class Ex_67 {
    public String addBinary(String a, String b) {
        long result = convert(a) + convert(b);

        if (result == 0) return "0";

        StringBuilder builder = new StringBuilder();

        while (result > 0) {
            builder.append(result % 2);
            result /= 2;
        }

        return builder.reverse().toString();
    }

    private long convert(String s) {
        int i = s.length() - 1;
        int result = 0;
        while (i >= 0) {
            result += Math.pow(2, s.length() - 1 - i) * (s.charAt(i) - 48);
            i--;
        }
        return result;
    }
}
