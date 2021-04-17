package solution.easy;

/**
 * #1486
 * XOR Operation in an Array
 *
 * 0 ms	35.7 MB
 */

public class Ex_1486 {
    public int xorOperation(int n, int start) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            answer ^= (start + i * 2);
        }

        return answer;
    }
}
