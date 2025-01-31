package cn.hjmao.leetcode.a448findallnumbersdisappearedinanarray;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 *
 * Desc:
 * =====
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array),
 * some elements appear twice and others appear once.
 *
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 *
 * Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra
 * space.
 *
 * Example:
 *
 * Input:
 * [4,3,2,7,8,2,3,1]
 *
 * Output:
 * [5,6]
 */

class Solution {
  public List<Integer> findDisappearedNumbers(int[] nums) {
    List<Integer> missing = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] < 0) {
        continue;
      }

      int pos = nums[i] - 1;
      nums[i] = 0;
      while (nums[pos] > 0) {
        int nextPos = nums[pos] - 1;
        nums[pos] = -1;
        pos = nextPos;
      }
      nums[pos]--;
    }

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        missing.add(i + 1);
      }
    }
    return missing;
  }
}
