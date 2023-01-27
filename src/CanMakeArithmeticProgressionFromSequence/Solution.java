package CanMakeArithmeticProgressionFromSequence;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 27/01/23
 * Time: 21:05
 */


public class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int len = arr.length;
        int diff = arr[1] - arr[0];

        for (int index = 0; index < len-1; index++) {
            if (arr[index + 1] - arr[index] != diff ) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int arr[] = {3,5,1};

        System.out.println(sol.canMakeArithmeticProgression(arr));
    }
}
