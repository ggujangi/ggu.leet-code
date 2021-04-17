package solution.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * #914
 * X of a Kind in a Deck of Cards
 *
 * 10 ms 39.5 MB
 */

public class Ex_914 {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : deck) {
            if (map.containsKey(i)) {
                int value = map.get(i);
                map.put(i, value + 1);
            } else {
                map.put(i, 1);
            }
        }

        List<Integer> list = new ArrayList<Integer>();

        for (Integer value : map.values()) {
            list.add(value);
        }

        int g = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            g = gcd(g, list.get(i));
        }

        return g != 1;
    }

    private int gcd(int x, int y) {
        return x == 0 ? y : gcd(y % x, x);
    }
}
