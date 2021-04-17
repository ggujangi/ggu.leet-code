package solution.easy;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

/**
 * #874
 * Walking Robot Simulation
 *
 * 11 ms 44.3 MB
 */

public class Ex_874 {
    int[] xStep = new int[]{0, 1, 0, -1};
    int[] yStep = new int[]{1, 0, -1, 0};

    int direction = 0, x = 0, y = 0;
    int result = 0;

    public int robotSim(int[] commands, int[][] obstacles) {
        Set<Point> set = new HashSet<>();
        for (int[] obs : obstacles) {
            set.add(new Point(obs[0], obs[1]));
        }

        for (int command : commands) {
            if (command == -1 || command == -2) {
                direction = getDirection(command);
            } else {
                for (int j = 0; j < command; j++) {
                    int xTmp = x + xStep[direction];
                    int yTmp = y + yStep[direction];
                    Point point = new Point(xTmp, yTmp);

                    if (set.contains(point)) {
                        break;
                    }

                    x = xTmp;
                    y = yTmp;
                }
            }
            result = Math.max(result, (x * x) + (y * y));
        }

        return result;
    }

    private int getDirection(int d) {
        if (d == -2) direction -= 1;
        else if (d == -1) direction += 1;

        return (direction < 0 ? (direction + 4) : direction) % 4;
    }
}
