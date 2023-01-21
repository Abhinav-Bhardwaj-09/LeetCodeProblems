package DifferenceBetweenElementSumAndDigitSumOfAnArray;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 21/01/23
 * Time: 14:09
 */


public class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;

        for (int element : nums) {
            elementSum += element;

            digitSum += element >= 10 ? sumDigits(element) : element;
        }

        return elementSum > digitSum ? elementSum - digitSum : digitSum - elementSum;
    }

    int sumDigits(int element) {
        int sum = 0;
        while (element > 0) {
            sum += element % 10;
            element /= 10;
        }

        return sum;
    }
}
