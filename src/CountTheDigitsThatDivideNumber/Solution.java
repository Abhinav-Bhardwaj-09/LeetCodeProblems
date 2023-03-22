package CountTheDigitsThatDivideNumber;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 22/03/23
 * Time: 11:38
 */

public class Solution {
    public int countDigits(int num) {
        int count = 0, temp = num;

        while (temp > 0) {
            count += num % (temp%10) == 0 ? 1 : 0;
            temp /= 10;
        }

        return count;
    }
}
