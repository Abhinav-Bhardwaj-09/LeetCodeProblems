package RichestCustomerWealth;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 02/03/23
 * Time: 23:16
 */


public class Solution {
    public int maximumWealth(int[][] accounts) {
        int rows = accounts.length, cols = accounts[0].length, sum = 0, tempSum = 0;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                tempSum += accounts[row][col];
            }

            sum = sum < tempSum ? tempSum : sum;
            tempSum = 0;
        }

        return sum;
    }
}
