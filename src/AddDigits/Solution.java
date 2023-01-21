package AddDigits;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 21/01/23
 * Time: 14:30
 */


public class Solution {
    public int addDigits(int num) {
        int digitSum = num;

        while (num >= 10) {
            digitSum = 0;
            while (num > 0) {
                digitSum += num % 10;
                num /= 10;
            }
            num = digitSum;
        }

        return digitSum;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.addDigits(38));
    }
}
