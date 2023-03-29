package MinimumSumOfFourDigitNumberAfterSplittingDigits;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 29/03/23
 * Time: 17:45
 */

public class Solution {
    public int minimumSum(int num) {
        int digitsArr [] = new int[4], index = 0;

        while (num != 0) {
            digitsArr[index++] = num % 10;
            num /= 10;
        }

        Arrays.sort(digitsArr);

        return ((digitsArr[0] * 10 + digitsArr[3]) + (digitsArr[1] * 10 + digitsArr[2]));
    }
}
