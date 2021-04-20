package solution.easy;

/**
 * #953
 * Verifying an Alien Dictionary
 *
 * 0 ms	37.1 MB
 */

public class Ex_953 {
    String mOrder;
    int index = 0;

    public boolean isAlienSorted(String[] words, String order) {
        this.mOrder = order;

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

            if (mOrder.indexOf(last_char) < mOrder.indexOf(new_char)) return true;
            else if (mOrder.indexOf(last_char) > mOrder.indexOf(new_char)) return false;
        }

        return true;
    }
}
