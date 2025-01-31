package cn.hjmao.leetcode.a225implementstackusingqueues;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/implement-stack-using-queues/
 *
 * Desc:
 * =====
 * Implement the following operations of a stack using queues.
 *
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * empty() -- Return whether the stack is empty.
 * Example:
 *
 * MyStack stack = new MyStack();
 *
 * stack.push(1);
 * stack.push(2);
 * stack.top();   // returns 2
 * stack.pop();   // returns 2
 * stack.empty(); // returns false
 * Notes:
 *
 * You must use only standard operations of a queue
 * -- which means only push to back, peek/pop from front, size, and is empty operations are valid.
 * Depending on your language, queue may not be supported natively.
 * You may simulate a queue by using a list or deque (double-ended queue),
 * as long as you use only standard operations of a queue.
 * You may assume that all operations are valid
 * (for example, no pop or top operations will be called on an empty stack).
 */

public class MyStack {
  /** Initialize your data structure here. */
  private List<Integer> queue = new ArrayList<>();

  /** Push element x onto stack. */
  public void push(int x) {
    queue.add(0, x);
  }

  /** Removes the element on top of the stack and returns that element. */
  public int pop() {
    List<Integer> temp = new ArrayList<>();
    Integer value = 0;
    while (!queue.isEmpty()) {
      value = queue.remove(queue.size() - 1);
      if (queue.isEmpty()) {
        break;
      } else {
        temp.add(0, value);
      }
    }
    queue = temp;
    return value;
  }

  /** Get the top element. */
  public int top() {
    int value = this.pop();
    this.push(value);
    return value;
  }

  /** Returns whether the stack is empty. */
  public boolean empty() {
    return queue.isEmpty();
  }
}
