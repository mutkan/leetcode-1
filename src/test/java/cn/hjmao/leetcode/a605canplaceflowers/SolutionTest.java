package cn.hjmao.leetcode.a605canplaceflowers;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testCanPlaceFlowers1() {
    int[] flowerbed = {1, 0, 0, 0, 1};
    int n = 1;
    boolean actual = solution.canPlaceFlowers(flowerbed, n);
    assertTrue(actual);
  }

  @Test
  public void testCanPlaceFlowers2() {
    int[] flowerbed = {1, 0, 0, 0, 1};
    int n = 2;
    boolean actual = solution.canPlaceFlowers(flowerbed, n);
    assertFalse(actual);
  }
}