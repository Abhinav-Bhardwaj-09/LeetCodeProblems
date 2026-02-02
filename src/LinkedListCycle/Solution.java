package LinkedListCycle;

// Created by Abhinav Bhardwaj on 02/02/2026 21:37 using IntelliJ IDEA


public class Solution {

  // Floyd's Cycle detection approach (tortoise and hare)
  public boolean hasCycle(ListNode head) {
    if (head == null) return false;

    ListNode tortoise = head; // moves one steps
    ListNode hare = head; // moves two steps

    while (hare != null && hare.next != null) {
      tortoise = tortoise.next;
      hare = hare.next.next;

      if (tortoise == hare) return true;
    }

    return false;
  }
}
