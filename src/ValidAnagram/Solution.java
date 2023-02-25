package ValidAnagram;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 25/02/23
 * Time: 16:36
 */


public class Solution {
    public boolean isAnagram(String s, String t) {
        int sLen = s.length(), tLen = t.length();

        if(sLen != tLen) {
            return false;
        }

        int freqArray [] = new int[26];

        for(int index = 0; index < sLen; index++) {
            int charASCII = (int) s.charAt(index) - 97;
            freqArray[charASCII]++;
        }

        for(int index = 0; index < tLen; index++) {
            int charASCII = (int) t.charAt(index) - 97;
            freqArray[charASCII]--;
        }

        for (int index = 0; index < 26; index++) {
            if (freqArray[index] < 0) {
                return false;
            }
        }

        return true;
    }
}
