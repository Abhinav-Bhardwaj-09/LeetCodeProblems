package SortIntegersByTheNumberOf1Bits;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 01/03/23
 * Time: 15:19
 */


public class Solution {
    public int[] sortByBits(int[] arr) {
        int arrLen = arr.length;

        for (int index = 0; index < arrLen; index++){
            arr[index] += Integer.bitCount(arr[index]) * 10001;
        }

        Arrays.sort(arr);

        for (int index = 0; index < arrLen; index++){
            arr[index] %= 10001;
        }

        return arr;
    }
}
