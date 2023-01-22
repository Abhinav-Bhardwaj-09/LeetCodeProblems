package ConcatenationOfArray;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 22/01/23
 * Time: 12:52
 */


public class Solution {
    public int[] getConcatenation(int[] nums) {
        int ans [] = new int[nums.length * 2];
        int tempIndex = 0;

        for (int index = 0; index < ans.length; index++) {
            ans[index] = nums[tempIndex++];

            tempIndex = tempIndex < nums.length ? tempIndex : 0;
        }

        return ans;
    }
}
