package solution.easy;

/**
 * #441
 * Arranging Coins
 *
 * 1 ms 36 MB
 */

public class Ex_441 {
    public int arrangeCoins(int n) {
        if (n <= 1) return n;

        int left = 0, right = n;

        int answer = 0;
        while (left <= right) {
            int m = (left + right) / 2;
            long sum = (long) m * (m + 1) / 2;
            if (sum <= n) {
                answer = m;
                left = m + 1;
            } else {
                right = m - 1;
            }
        }

        return answer;
    }
}
