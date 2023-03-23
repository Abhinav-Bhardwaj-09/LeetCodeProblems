package UniquePaths;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 23/03/23
 * Time: 12:38
 */

public class Solution {
    public int uniquePaths(int m, int n) {
        int dpArr[][] = new int[m][n], index, index2;

        for(index = 0; index < m; index++) {
            dpArr[index][0] = 1;
        }

        for(index = 0; index < n; index++) {
            dpArr[0][index] = 1;
        }

        for(index = 1; index < m; index++) {
            for( index2 = 1; index2 < n; index2++) {
                dpArr[index][index2] = dpArr[index - 1][index2] + dpArr[index][index2 - 1];
            }
        }

        return dpArr[m - 1][n - 1];
    }
}
