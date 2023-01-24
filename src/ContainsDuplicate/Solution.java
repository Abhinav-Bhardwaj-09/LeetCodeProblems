package ContainsDuplicate;

import java.util.HashSet;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 24/01/23
 * Time: 15:44
 */


public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums == null || nums.length == 0) {
            return false;
        }

        HashSet<Integer> numsHashSet = new HashSet<Integer>();
        for(int element: nums) {
            if(!numsHashSet.add(element)){
                return true;
            }
        }

        return false;
    }
}
