package cn.hjmao.leetcode.a206reverselinkedlist;

import cn.hjmao.utils.list.ListNode;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/reverse-linked-list/
 *
 * Desc:
 * =====
 * Reverse a singly linked list.
 *
 * Example:
 *
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 * Follow up:
 *
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 */

public class Solution {

  public ListNode reverseList(ListNode head) {
    ListNode newHead = null;
    while (head != null) {
      ListNode thisNode = head;
      head = head.next;
      thisNode.next = newHead;
      newHead = thisNode;
    }

    return newHead;
  }
}
