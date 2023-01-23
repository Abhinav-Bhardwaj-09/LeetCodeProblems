package ShuffleTheArray;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 23/01/23
 * Time: 14:19
 */


public class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr [] = new int[2*n];
        int xIndex = 0, yIndex = n;

        for (int index = 0; index < 2*n; index++) {
            arr[index] = index % 2 == 0 ? nums[xIndex++] : nums[yIndex++];
        }

        return arr;
    }
}