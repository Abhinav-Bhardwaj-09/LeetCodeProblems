package RangeSumQuery_Immutable;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 26/02/23
 * Time: 14:31
 */


public class NumArray {
    int[] prefixSumArr;

    public NumArray(int[] nums) {
        prefixSumArr = new int[nums.length + 1];

        for (int index = 1; index <= nums.length; index++) {
            prefixSumArr[index] = prefixSumArr[index - 1] + nums[index - 1];
        }
    }

    public int sumRange(int left, int right) {
        return prefixSumArr[right + 1] - prefixSumArr[left];
    }
}
