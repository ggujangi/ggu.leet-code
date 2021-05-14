package solution.easy;

import java.util.Arrays;

/**
 * #455
 * Assign Cookies
 *
 * 6 ms 40 MB
 */

public class Ex_455 {
    public int findContentChildren(int[] g, int[] s) {
        if (s.length == 0) return 0;

        Arrays.sort(g);
        Arrays.sort(s);

        int i = g.length - 1, j = s.length - 1;
        int result = 0;
        while (i >= 0 && j >= 0) {
            if (g[i] <= s[j]) {
                result++;
                i--;
                j--;
            } else {
                i--;
            }
        }

        return result;
    }
}
