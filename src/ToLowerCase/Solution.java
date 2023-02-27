package ToLowerCase;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 27/02/23
 * Time: 11:09
 */


public class Solution {
    public String toLowerCase(String s) {
        int sLen = s.length();

        for (int index = 0; index < sLen; index++) {
            if(((int) s.charAt(index)) >= 65 && ((int) s.charAt(index)) <= 90) {
                s = s.substring(0, index) + (char) (97 + (s.charAt(index) - 65)) + s.substring(index + 1);
            }
        }

        return s;
    }
}