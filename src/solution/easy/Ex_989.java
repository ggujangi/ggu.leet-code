package solution.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * #989
 * Add to Array-Form of Integer
 *
 * 3 ms 40 MB
 */

public class Ex_989 {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();

        int i = num.length - 1, sum = k;

        while (i >= 0 || sum > 0) {
            if (i >= 0) sum += (num[i]);
            result.add(sum % 10);
            sum /= 10;
            i--;
        }

        Collections.reverse(result);

        return result;
    }
}
