package AddTwoNumbers;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 22/01/23
 * Time: 16:40
 */


public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        int carryOver = 0;
        int k = 0;

        ListNode currentNode1 = l1;
        ListNode currentNode2 = l2;
        ListNode ansCurrentNode = new ListNode();

        while ((currentNode1 != null || currentNode2 != null)){
            ListNode newNode = new ListNode();

            if(currentNode1 != null && currentNode2 != null) {

                ansCurrentNode.val  = currentNode1.val + currentNode2.val + carryOver <= 9 ? (carryOver > 0 ? currentNode1.val + currentNode2.val + carryOver-- : currentNode1.val + currentNode2.val) : (carryOver > 0 ? (currentNode1.val + currentNode2.val + carryOver) % 10 : (currentNode1.val + currentNode2.val + carryOver++) % 10);

                currentNode1 = currentNode1.next;
                currentNode2 = currentNode2.next;
            }

            else if(currentNode1 != null && currentNode2 == null) {

                ansCurrentNode.val = (currentNode1.val + carryOver <= 9 ? (carryOver > 0 ? (currentNode1.val + carryOver--) % 10 : (currentNode1.val + carryOver) % 10) : (currentNode1.val + carryOver) % 10);

                currentNode1 = currentNode1.next;
            }

            else if(currentNode2 != null && currentNode1 == null) {
                ansCurrentNode.val = (currentNode2.val + carryOver <= 9 ? (carryOver > 0 ? (currentNode2.val + carryOver--) % 10 : (currentNode2.val + carryOver) % 10) : (currentNode2.val + carryOver) % 10);

                currentNode2 = currentNode2.next;
            }

            if(k == 0) {
                ans = ansCurrentNode;
                k++;
            }
            if((currentNode1 != null || currentNode2 != null)) {
                ansCurrentNode.next = new ListNode();
                ansCurrentNode = ansCurrentNode.next;
            }

        }

        if(carryOver > 0) {
            ansCurrentNode.next = new ListNode(1);
        }

        return ans;
    }
}