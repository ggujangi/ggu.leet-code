package solution.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * #989
 * Add to Array-Form of Integer
 *
 * 3 ms 40.2 MB
 */

public class Ex_989 {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();

        int i = num.length - 1;
        int sum = 0;

        while (i >= 0 || k > 0) {
            if (i >= 0) {
                sum += num[i];
                i--;
            }

            if (k > 0) {
                sum += k % 10;
                k /= 10;
            }

            result.add(sum % 10);

            if (sum > 9) {
                if (i < 0 && k == 0) result.add(1);
                sum /= 10;
            } else {
                sum = 0;
            }
        }

        Collections.reverse(result);

        return result;
    }
}
