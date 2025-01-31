package cn.hjmao.leetcode.a070climbingstairs;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/climbing-stairs/
 *
 * Desc:
 * =====
 * You are climbing a stair case. It takes n steps to reach to the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * Note: Given n will be a positive integer.
 */

public class Solution {

  // First 1 step + First 2 steps
  public int climbStairs(int n) {
    if (n == 1) {
      return 1;
    }
    int fib1 = 1;
    int fib2 = 2;
    int i = 2;
    while (i < n) {
      fib2 = fib1 + fib2;
      fib1 = fib2 - fib1;
      ++i;
    }
    return fib2;
  }
}
