package MiddleOfTheLinkedList;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 28/02/23
 * Time: 20:04
 */


public class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode singleJump = head, doubleJump = head;

        while (doubleJump != null && doubleJump.next != null) {
            singleJump = singleJump.next;
            doubleJump = doubleJump.next.next;
        }

        return singleJump;
    }
}
