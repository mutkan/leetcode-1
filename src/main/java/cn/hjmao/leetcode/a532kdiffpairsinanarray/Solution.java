package cn.hjmao.leetcode.a532kdiffpairsinanarray;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/contest/leetcode-weekly-contest-22/problems/k-diff-pairs-in-an-array/
 *
 * Desc:
 * =====
 * Given an array of integers and an integer k, you need to find the number of unique k-diff pairs in the array.
 * Here a k-diff pair is defined as an integer pair (i, j),
 * where i and j are both numbers in the array and their absolute difference is k.
 *
 * Example 1:
 * Input: [3, 1, 4, 1, 5], k = 2
 * Output: 2
 * Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
 * Although we have two 1s in the input, we should only return the number of unique pairs.
 *
 * Example 2:
 * Input:[1, 2, 3, 4, 5], k = 1
 * Output: 4
 * Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).
 *
 * Example 3:
 * Input: [1, 3, 1, 5, 4], k = 0
 * Output: 1
 * Explanation: There is one 0-diff pair in the array, (1, 1).
 *
 * Note:
 * The pairs (i, j) and (j, i) count as the same pair.
 * The length of the array won't exceed 10,000.
 * All the integers in the given input belong to the range: [-1e7, 1e7].
 */

public class Solution {
  public int findPairs(int[] nums, int k) {
    Set<Integer> unique = new HashSet<>();
    Set<Integer> duplicated = new HashSet<>();
    for (int num: nums) {
      if (unique.contains(num)) {
        duplicated.add(num);
      } else {
        unique.add(num);
      }
    }

    int count = 0;
    if (k == 0) {
      return duplicated.size();
    } else if (k > 0) {
      for (int num : unique) {
        if (unique.contains(num - k)) {
          count++;
        }
      }
    }

    return count;
  }
}
