package solution.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * #953
 * Verifying an Alien Dictionary
 *
 * 1 ms	39 MB
 */

public class Ex_953 {
    int index = 0;
    Map<Character, Integer> map = new HashMap<>();

    public boolean isAlienSorted(String[] words, String order) {
        for (int i = 0; i < order.length(); i++) {
            map.put(order.charAt(i), i);
        }
        map.put(' ', -1);

        while (true) {
            if (index == words.length - 1) return true;
            if (isSorted(words[index], words[index + 1])) {
                index++;
            } else {
                return false;
            }
        }
    }

    private boolean isSorted(String o1, String o2) {
        char[] lastArray = o1.toCharArray();
        char[] newArray = o2.toCharArray();

        int length = Math.max(lastArray.length, newArray.length);

        for (int i = 0; i < length; i++) {
            char last_char = i < lastArray.length ? lastArray[i] : ' ';
            char new_char = i < newArray.length ? newArray[i] : ' ';

            if (map.get(last_char) < map.get(new_char)) return true;
            else if(map.get(last_char) > map.get(new_char)) return false;
        }

        return true;
    }
}
