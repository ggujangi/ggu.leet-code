package solution.easy;

/**
 * #717
 * 1-bit and 2-bit Characters
 *
 * 0 ms	38.1 MB
 */

public class Ex_717 {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while (i < bits.length - 1) {
            i += bits[i] == 1 ? 2 : 1;
        }

        return i == bits.length - 1;
    }
}
