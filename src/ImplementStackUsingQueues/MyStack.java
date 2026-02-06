package ImplementStackUsingQueues;

import java.util.ArrayDeque;

// Created by Abhinav Bhardwaj on 06/02/2026 21:12 using IntelliJ IDEA

public class MyStack {
  ArrayDeque<Integer> queue;

  public MyStack() {
    queue = new ArrayDeque<>();
  }

  public void push(int x) {
    queue.addLast(x);
  }

  public int pop() {
    return queue.removeLast();
  }

  public int top() {
    return queue.getLast();
  }

  public boolean empty() {
    return queue.isEmpty();
  }
}
