package cn.hjmao.leetcode.a766toeplitzmatrix;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testIsToeplitzMatrix1() {
    int[][] matrix = {{1, 2, 3, 4},
                      {5, 1, 2, 3},
                      {9, 5, 1, 2}};
    boolean actual = solution.isToeplitzMatrix(matrix);
    assertTrue(actual);
  }

  @Test
  public void testIsToeplitzMatrix2() {
    int[][] matrix = {{1, 2},
                      {2, 2}};
    boolean actual = solution.isToeplitzMatrix(matrix);
    assertFalse(actual);
  }

  @Test
  public void testIsToeplitzMatrix3() {
    int[][] matrix = {{1}};
    boolean actual = solution.isToeplitzMatrix(matrix);
    assertTrue(actual);
  }

  @Test
  public void testIsToeplitzMatrix4() {
    int[][] matrix = {{1},
                      {2}};
    boolean actual = solution.isToeplitzMatrix(matrix);
    assertTrue(actual);
  }

  @Test
  public void testIsToeplitzMatrix5() {
    int[][] matrix = {{1, 2}};
    boolean actual = solution.isToeplitzMatrix(matrix);
    assertTrue(actual);
  }

  @Test
  public void testIsToeplitzMatrix6() {
    int[][] matrix = {{1, 2, 3}, {1, 1, 1}};
    boolean actual = solution.isToeplitzMatrix(matrix);
    assertFalse(actual);
  }
}