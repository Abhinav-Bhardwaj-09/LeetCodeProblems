package MatrixDiagonalSum;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 01/03/23
 * Time: 15:29
 */


public class Solution {
    public int diagonalSum(int[][] mat) {
        int row = 0, rows = mat.length, col = 0, cols = rows, sum = 0;

        while (row < rows && col < cols){
            sum += mat[row++][col++];
        }

        row = 0;
        col = cols - 1;

        while (row < rows && col >= 0){
            sum += mat[row++][col--];
        }

        sum -= (rows % 2) != 0 ? mat[rows / 2] [cols / 2] : 0;

        return sum;
    }
}
