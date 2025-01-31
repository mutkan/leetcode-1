package cn.hjmao.leetcode.a405convertanumbertohexadecimal;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/convert-a-number-to-hexadecimal/
 *
 * Desc:
 * =====
 * Given an integer, write an algorithm to convert it to hexadecimal.
 * For negative integer, two’s complement method is used.
 *
 * Note:
 *
 * All letters in hexadecimal (a-f) must be in lowercase.
 * The hexadecimal string must not contain extra leading 0s.
 * If the number is zero, it is represented by a single zero character '0';
 * otherwise, the first character in the hexadecimal string will not be the zero character.
 * The given number is guaranteed to fit within the range of a 32-bit signed integer.
 * You must not use any method provided by the library which converts/formats the number to hex directly.
 * Example 1:
 *
 * Input:
 * 26
 *
 * Output:
 * "1a"
 * Example 2:
 *
 * Input:
 * -1
 *
 * Output:
 * "ffffffff"
 */

public class Solution {
  public String toHex(int num) {
    String hex = "";
    do {
      int thisHex = num & 15;
      char thisChar;
      if (thisHex >= 10) {
        thisChar = (char) (thisHex - 10 + 'a');
      } else {
        thisChar = (char)('0' + thisHex);
      }
      num >>>= 4;
      hex = thisChar + hex;
    } while (num != 0);
    return hex;
  }
}
