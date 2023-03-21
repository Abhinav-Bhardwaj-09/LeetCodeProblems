package PlusOne;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 21/03/23
 * Time: 22:51
 */

public class Solution {
    public int[] plusOne(int[] digits) {
        int digitsLen = digits.length;
        boolean flag = false;

        for (int index = digitsLen - 1; index >= 0; index--) {
            if (digits[index] < 9) {
                digits[index]++;
                flag = true;
                break;
            }

            digits[index] = 0;
        }

        if(!(flag)) {
            digits = new int[digitsLen + 1];
            digits[0] = 1;
        }

        return digits;
    }
}
