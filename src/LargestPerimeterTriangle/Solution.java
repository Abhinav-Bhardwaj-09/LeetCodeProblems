package LargestPerimeterTriangle;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 26/01/23
 * Time: 20:42
 */


public class Solution {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);

        for (int index = A.length - 1; index > 1; --index) {
            if (A[index] < A[index - 1] + A[index - 2]) {
                return A[index] + A[index - 1] + A[index - 2];
            }
        }

        return 0;
    }
}
