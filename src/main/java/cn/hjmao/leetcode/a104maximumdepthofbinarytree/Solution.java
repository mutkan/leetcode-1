package cn.hjmao.leetcode.a104maximumdepthofbinarytree;

import cn.hjmao.utils.tree.TreeNode;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 *
 * Desc:
 * =====
 * Given a binary tree, find its maximum depth.
 *
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 * Note: A leaf is a node with no children.
 *
 * Example:
 *
 * Given binary tree [3,9,20,null,null,15,7], return its depth = 3.
 */

public class Solution {
  public int maxDepth(TreeNode root) {
    int depth = 0;

    if (root != null) {
      depth += 1;
      depth += Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    return depth;
  }
}
