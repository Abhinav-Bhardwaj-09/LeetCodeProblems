package ConvertBinaryNumberInLinkedListToInteger;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 01/03/23
 * Time: 14:56
 */


public class Solution {
    public int getDecimalValue(ListNode head) {
        int decimalNum = 0;
        ListNode currentNode = head;

        while(currentNode != null){
            decimalNum =  (decimalNum << 1) + currentNode.val;
            currentNode = currentNode.next;
        }

        return decimalNum;
    }
}
