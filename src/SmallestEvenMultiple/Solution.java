package SmallestEvenMultiple;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 22/01/23
 * Time: 16:32
 */


public class Solution {
    public int smallestEvenMultiple(int n) {
        return n % 2 == 0 ? n : n * 2;
    }
}
