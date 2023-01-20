package PalindromeNumber;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 20/01/23
 * Time: 23:31
 */


public class Solution {
    public boolean isPalindrome(int x) {
        int y = 0;
        int X = x;

        while(X > 0) {
            y = (y * 10) + (X % 10);
            X = X/10;
        }

        return y == x;
    }
}
