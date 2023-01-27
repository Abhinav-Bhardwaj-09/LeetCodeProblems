package SignOfTheProductOfAnArray;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 27/01/23
 * Time: 20:47
 */


public class Solution {
    public int arraySign(int[] nums) {
        int negativeElementCount = 0;
        for (int element : nums) {
            if(element == 0) {

                return 0;
            }

            negativeElementCount += element < 0 ? 1 : 0;
        }

        return negativeElementCount % 2 == 0 ? 1 : -1;
    }
}
