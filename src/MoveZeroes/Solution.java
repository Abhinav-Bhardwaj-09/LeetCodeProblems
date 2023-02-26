package MoveZeroes;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 26/02/23
 * Time: 14:43
 */


public class Solution {
    public void moveZeroes(int[] nums) {
        int numsLen = nums.length, count = 0;

        for (int index = 0; index < numsLen; index++) {
           if (nums[index] != 0) {
               nums[count] = nums[index];
               nums[index] = count++ == index ? nums[index] : 0;
           }
        }
    }
}