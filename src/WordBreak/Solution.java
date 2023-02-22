package WordBreak;

import java.util.List;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 22/02/23
 * Time: 14:03
 */


public class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        if (s == null || s.length() == 0) {
            return false;
        }

        int len = s.length();
        boolean[] dp = new boolean[len];

        for (int index1 = 0; index1 < len; index1++) {
            for (int index2 = 0; index2 <= index1; index2++) {
                String word = s.substring(index2, index1 + 1);

                if (wordDict.contains(word) && (index2 == 0 || dp[index2 - 1])) {
                    dp[index1] = true;
                    break;
                }
            }
        }

        return dp[len - 1];
    }
}
