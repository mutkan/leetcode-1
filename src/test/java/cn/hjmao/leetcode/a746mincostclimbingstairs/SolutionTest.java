package cn.hjmao.leetcode.a746mincostclimbingstairs;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  Solution solution = new Solution();

  @Test
  public void testMinCostClimbingStairs1() {
    int[] cost = {10, 15, 20};
    int expect = 15;
    int actual = solution.minCostClimbingStairs(cost);
    assertEquals(actual, expect);
  }

  @Test
  public void testMinCostClimbingStairs2() {
    int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
    int expect = 6;
    int actual = solution.minCostClimbingStairs(cost);
    assertEquals(actual, expect);
  }
}