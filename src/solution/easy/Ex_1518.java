package solution.easy;

/**
 * #1518
 * Water Bottles
 *
 * 0 ms	35.4 MB
 */

public class Ex_1518 {
    public int numWaterBottles(int numBottles, int numExchange) {
        int answer = numBottles;

        while (numBottles >= numExchange) {
            answer += numBottles / numExchange;
            numBottles = numBottles / numExchange + numBottles % numExchange;
        }
        return answer;
    }
}
