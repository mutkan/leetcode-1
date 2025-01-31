package cn.hjmao.leetcode.a110balancedbinarytree;

import cn.hjmao.utils.tree.TreeNode;

/**
 * Created by hjmao.
 * <p>
 * URL:
 * =====
 * https://leetcode.com/problems/balanced-binary-tree/
 * <p>
 * Desc:
 * =====
 * Given a binary tree, determine if it is height-balanced.
 * <p>
 * For this problem, a height-balanced binary tree is defined as:
 * <p>
 * a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 * <p>
 * Example 1:
 * <p>
 * Given the following tree [3,9,20,null,null,15,7]:
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * Return true.
 * <p>
 * Example 2:
 * <p>
 * Given the following tree [1,2,2,3,3,null,null,4,4]:
 * <p>
 * 1
 * / \
 * 2   2
 * / \
 * 3   3
 * / \
 * 4   4
 * Return false.
 */

public class Solution {
  private boolean isBalanced = true;

  public boolean isBalanced(TreeNode root) {
    height(root);
    return isBalanced;
  }

  private int height(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int left = height(root.left);
    int right = height(root.right);
    if (Math.abs(left - right) > 1) {
      isBalanced = false;
    }
    return Math.max(left, right) + 1;
  }
}
