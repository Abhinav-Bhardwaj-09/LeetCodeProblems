package CountOddNumbersInAnIntervalRange;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 24/01/23
 * Time: 14:54
 */


public class Solution {
    public int countOdds(int low, int high) {
        return high % 2 != 0 || low % 2 != 0 ? ((high - low) / 2) + 1 : (high - low) / 2;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.countOdds(3,7));
    }
}
//2 3 4 5 6 7 8 9 10 11 12 13 14 15 16