package FlippingAnImage;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 23/01/23
 * Time: 16:07
 */


public class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for(int row = 0; row < n; row++) {
            for(int col = 0; col < n/2; col++) {
                image[row][col] += image[row][n - col - 1];
                image[row][n - col - 1] = image[row][col] - image[row][n - col - 1];
                image[row][col] = image[row][col] - image[row][n - col - 1];
            }

            for (int index = 0; index < n; index++) {
                image[row][index] = image[row][index] == 0 ? 1 : 0;
            }
        }
        return image;
    }
}