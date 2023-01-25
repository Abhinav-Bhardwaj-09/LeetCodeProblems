package NumberOf1Bits;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 25/01/23
 * Time: 14:54
 */


public class Solution {
    public int hammingWeight(int n) {
        int bitsCount = 0;

        while (n != 0) {
            n &= (n - 1);
            bitsCount++;
        }

        return bitsCount;
    }
}
