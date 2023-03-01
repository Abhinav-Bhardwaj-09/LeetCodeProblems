package DecryptStringFromAlphabetToIntegerMapping;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 01/03/23
 * Time: 14:21
 */


public class Solution {
    public String freqAlphabets(String s) {
        StringBuilder decryptedString = new StringBuilder();

        for (int index = s.length() - 1; index >= 0; index--){
            decryptedString.append(s.charAt(index) != '#' ? ((char)('a' + (s.charAt(index) - '0') - 1)) : (char)('a' + (s.charAt(index - 1) - '0' ) + 10 * (s.charAt(index - 2) - '0') - 1));

            index = s.charAt(index) != '#' ? index : index - 2;
        }

        return decryptedString.reverse().toString();
    }
}
