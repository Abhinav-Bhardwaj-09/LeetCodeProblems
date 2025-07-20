package RomanToInteger;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 20/07/2025
 * Time: 12:35
 */

public class Solution {
    public int romanToInt(String s) {
        int result = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int curr = roman[s.charAt(i)];
            result += (curr < prev ? -curr : curr);

            prev = curr;
        }

        return result;
    }

    private static final int[] roman = new int[256];

    static {
        roman['I'] = 1;
        roman['V'] = 5;
        roman['X'] = 10;
        roman['L'] = 50;
        roman['C'] = 100;
        roman['D'] = 500;
        roman['M'] = 1000;
    }
}
