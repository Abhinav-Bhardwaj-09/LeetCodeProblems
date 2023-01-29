package CheckIfItIsStraightLine;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 29/01/23
 * Time: 14:15
 */


public class Solution {
    public boolean checkStraightLine____1(int[][] coordinates) {
        int     X0 = coordinates[0][0], Y0 = coordinates[0][1],
                X1 = coordinates[1][0], Y1 = coordinates[1][1];
        int     dX = X1 - X0, dY = Y1 - Y0;

        for (int[] currentCoordinate : coordinates) {
            int currentX = currentCoordinate[0], currentY = currentCoordinate[1];

            if ((dX * (currentY - Y1)) != (dY * (currentX - X1))) {
                return false;
            }
        }

        return true;
    }

    public boolean checkStraightLine____2(int[][] coordinates) {        // beats 100% in memory and runtime
        if(coordinates.length == 2) {
            return true;
        }
        for(int i=2 ; i < coordinates.length ; i++) {
            if ((coordinates[i-1][1]-coordinates[i-2][1])*(coordinates[i][0]-coordinates[i-1][0]) != (coordinates[i][1]-coordinates[i-1][1])*(coordinates[i-1][0]-coordinates[i-2][0])) {
                return false;
            }
        }
        return true;
    }
}
