package SumOfAllOddLengthSubarrays;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 03/02/23
 * Time: 13:44
 */


public class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int finalTotalSum = 0;
        int len = arr.length;

        for (int index = 0; index < len; index++) {
            int endingIndex = index + 1;
            int startingIndex = len - index;
            int totalSubArrays = endingIndex * startingIndex;
            int oddSubarrays = totalSubArrays / 2;

            if (totalSubArrays % 2 == 1) {
                oddSubarrays++;
            }

            finalTotalSum += oddSubarrays * arr[index];
        }

        return finalTotalSum;
    }
}
