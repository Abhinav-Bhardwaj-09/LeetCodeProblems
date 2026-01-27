package RemoveDuplicatesFromSortedList;

// Created by Abhinav Bhardwaj on 27/01/2026 22:25 using IntelliJ IDEA

// Definition for singly-linked list.
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
  public ListNode deleteDuplicates(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }

    ListNode previousNode = head;
    ListNode currentNode = head.next;

    while (currentNode != null) {
      if (currentNode.val == previousNode.val) {
        previousNode.next = currentNode.next;
      } else {
        previousNode = currentNode;
      }

      currentNode = currentNode.next;
    }

    return head;
  }
}
