package cn.hjmao.leetcode.a349intersectionoftwoarrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/intersection-of-two-arrays/
 *
 * Desc:
 * =====
 * Given two arrays, write a function to compute their intersection.
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 * Example 2:
 *
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4]
 * Note:
 *
 * Each element in the result must be unique.
 * The result can be in any order.
 */

public class Solution {
  public int[] intersection(int[] nums1, int[] nums2) {
    Set<Integer> set1 = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();

    for (int num: nums1) {
      set1.add(num);
    }

    for (int num: nums2) {
      if (set1.contains(num) && !set2.contains(num)) {
        set2.add(num);
      }
    }

    int[] result = new int[set2.size()];
    int i = 0;
    for (int num: set2) {
      result[i++] = num;
    }
    return result;
  }
}
