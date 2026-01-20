package MergeTwoSortedLists;

/** Created by IntelliJ IDEA User: Abhinav Bhardwaj Date: 19/01/2026 Time: 13:17 */

class ListNode {
  int val;
  ListNode next;

  ListNode() {}

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}

public class Solution {
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode dummyList = new ListNode(0);
    ListNode tailNode = dummyList;

    while (list1 != null && list2 != null) {
      if (list1.val <= list2.val) {
        tailNode.next = list1;
        list1 = list2.next;
      } else {
        tailNode.next = list2;
        list2 = list2.next;
      }
      tailNode = tailNode.next;
    }

    // attach the remainder
    tailNode.next = (list1 != null) ? list1 : list2;

    return dummyList.next;
  }
}
