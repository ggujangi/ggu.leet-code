package solution.easy;

import java.util.LinkedList;
import java.util.List;

/**
 * #989
 * Add to Array-Form of Integer
 *
 * 3 ms 41.3 MB
 */

public class Ex_989 {
    public List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> list = new LinkedList<>();

        int i = num.length - 1, sum = k;

        while (i >= 0 || sum > 0) {
            if (i >= 0) sum += (num[i]);
            list.addFirst(sum % 10);
            sum /= 10;
            i--;
        }

        return list;
    }
}
