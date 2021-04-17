package solution.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * #290
 * Word Pattern
 *
 * 2 ms	39 MB
 */

public class Ex_290 {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map_char = new HashMap<>(); // <a, dog>, <b, cat>, <c, fish>
        Map<String, Character> map_str = new HashMap<>(); // <dog, a>, <cat, b>, <fish, c>
        String[] array = s.split(" ");

        if (pattern.length() != array.length) return false;

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String str = array[i];
            if (map_char.get(c) == null) { // Map에 'a', 'b'. 'c'.. 의 값이 없을 경우
                if (map_str.containsKey(str)) {
                    return false;
                } else {
                    map_char.put(c, str);
                    map_str.put(str, c);
                }
            } else {
                if (!map_char.get(c).equals(str)) {
                    return false;
                }
            }
        }

        return true;
    }
}
