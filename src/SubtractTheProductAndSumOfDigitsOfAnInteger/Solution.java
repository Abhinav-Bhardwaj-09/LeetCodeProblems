package SubtractTheProductAndSumOfDigitsOfAnInteger;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 25/01/23
 * Time: 15:24
 */


public class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0, prod = 1;

        while (n > 0) {
            int digit = n % 10;

            sum += digit;
            prod *= digit;

            n /= 10;
        }

        return prod - sum;
    }
}
