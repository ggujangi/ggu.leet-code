package solution.easy;

/**
 * #441
 * Arranging Coins
 *
 * 5 ms 35.8 MB
 */

public class Ex_441 {
    public int arrangeCoins(int n) {
        if(n<=1) return n;
        int i = 1;

        while (n>=0){
            n = n - i;
            i++;
        }
        return i - 2;
    }
}
