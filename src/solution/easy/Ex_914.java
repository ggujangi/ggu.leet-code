package solution.easy;

/**
 * #914
 * X of a Kind in a Deck of Cards
 *
 * 3 ms 39.8 MB
 */

public class Ex_914 {
    public boolean hasGroupsSizeX(int[] deck) {
        if (deck.length >= 2) {
            int[] array = new int[10000];

            for (int d : deck) {
                array[d] = array[d] + 1;
            }

            int result = 0;
            for (int i = 0; i < 10000; i++) {
                if (array[i] > 0) result = gcd(result, array[i]);
            }

            return result != 1;
        }
        return false;
    }

    private int gcd(int x, int y) {
        return x == 0 ? y : gcd(y % x, x);
    }
}
