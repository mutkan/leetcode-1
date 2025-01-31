package cn.hjmao.leetcode.a434numberofsegmentsinastring;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/number-of-segments-in-a-string/
 *
 * Desc:
 * =====
 * Count the number of segments in a string,
 * where a segment is defined to be a contiguous sequence of non-space characters.
 *
 * Please note that the string does not contain any non-printable characters.
 *
 * Example:
 *
 * Input: "Hello, my name is John"
 * Output: 5
 */

class Solution {
  public int countSegments(String s) {
    boolean newStart = false;
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) != ' ') {
        if (!newStart) {
          newStart = true;
        }
      } else {
        if (newStart) {
          count++;
        }
        newStart = false;
      }
    }

    return newStart ? count + 1 : count;
  }
}
