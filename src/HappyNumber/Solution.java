package HappyNumber;

import java.util.*;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 28/01/23
 * Time: 15:00
 */


public class Solution {
    private int sumSquares(int num) {
        int totalSum = 0;

        while (num > 0) {
            totalSum += Math.pow((num % 10), 2);
            num /= 10;
        }

        return totalSum;
    }

    public boolean isHappy(int n) {
        Set<Integer> visitedNumbers = new HashSet<>();

        while (n != 1 && !visitedNumbers.contains(n)) {
            visitedNumbers.add(n);
            n = sumSquares(n);
        }

        return n == 1;
    }
}
