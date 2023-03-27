package LengthOfLastWord;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 27/03/23
 * Time: 20:47
 */

public class Solution {
    public int lengthOfLastWord(String s) {
        int sLength = s.length(), wordLength = 0;

        for (int index = sLength - 1; index >= 0; index--) {
            char c = s.charAt(index);

            if ( c == ' ' && wordLength != 0) {
                return wordLength;
            }

            if (c != ' ') {
                wordLength++;
            }
        }

        return wordLength;
    }
}
