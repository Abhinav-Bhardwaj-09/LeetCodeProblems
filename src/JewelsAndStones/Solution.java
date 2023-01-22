package JewelsAndStones;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 22/01/23
 * Time: 22:34
 */


public class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int no_of_jewels = 0;
        for(int jewels_Index = 0; jewels_Index < jewels.length(); jewels_Index++) {
            for(int stones_Index = 0; stones_Index < stones.length(); stones_Index++) {
                if(jewels.charAt(jewels_Index) == stones.charAt(stones_Index)) {
                    no_of_jewels++;
                }
            }
        }

        return no_of_jewels;
    }
}
