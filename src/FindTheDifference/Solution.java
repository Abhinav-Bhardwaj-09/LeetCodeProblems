package FindTheDifference;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 27/02/23
 * Time: 09:23
 */


public class Solution {
    public char findTheDifference(String s, String t) {
        int sLen = s.length(), freqArr [] = new int[26];

        for (int index = 0; index <= sLen; index++) {
            freqArr[(int) t.charAt(index) - 97]++;
        }

        for (int index = 0; index < sLen; index++) {
            freqArr[(int) s.charAt(index) - 97]--;
        }

        int extraCharacter = 0;

        for (int index = 0; index < 26; index++) {
            if (freqArr[index] != 0) {
                extraCharacter = index + 97;
                break;
            }
        }

        return (char) (extraCharacter);
    }
}
