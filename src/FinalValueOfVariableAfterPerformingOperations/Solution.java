package FinalValueOfVariableAfterPerformingOperations;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 22/01/23
 * Time: 22:15
 */


public class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int countIncrement = 0, countDecrement = 0;

        for (String operator : operations) {
            switch (operator) {
                case "++X", "X++":
                    countIncrement++;
                    break;
                case "--X", "X--":
                    countDecrement++;
                default:
                    break;
            }
        }

        return countDecrement <= countIncrement ? countIncrement-countDecrement : 0-(countDecrement-countIncrement);
    }
}
