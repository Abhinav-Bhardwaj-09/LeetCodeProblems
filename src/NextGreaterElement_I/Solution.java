package NextGreaterElement_I;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 27/02/23
 * Time: 10:27
 */


public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int num1Len = nums1.length, num2Len = nums2.length, newArr [] = new int[num1Len];

        int index1 = 0, index2 = 0;
        for (index1 = 0; index1 < num1Len; index1++) {
            index2 = 0;
            while (index2 < num2Len && nums1[index1] != nums2[index2]) {
                index2++;
            }

            while (index2 < num2Len && nums1[index1] >= nums2[index2]) {
                index2++;
            }

            newArr[index1] = index2 < num2Len && nums1[index1] < nums2[index2] ? nums2[index2]: -1;
        }

        return newArr;
    }
}
