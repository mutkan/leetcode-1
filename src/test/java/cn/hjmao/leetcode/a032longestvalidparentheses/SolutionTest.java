package cn.hjmao.leetcode.a032longestvalidparentheses;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by hjmao on 26/02/2017.
 */
public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testLongestValidParentheses1() throws Exception {
    String s = "(()";
    int expected = 2;
    int actual = this.solution.longestValidParentheses(s);

    assertEquals(actual, expected);
  }

  @Test
  public void testLongestValidParentheses2() throws Exception {
    String s = ")()())";
    int expected = 4;
    int actual = this.solution.longestValidParentheses(s);

    assertEquals(actual, expected);
  }

  @Test
  public void testLongestValidParentheses3() throws Exception {
    String s = ")()()())()())";
    int expected = 6;
    int actual = this.solution.longestValidParentheses(s);

    assertEquals(actual, expected);
  }

  @Test
  public void testLongestValidParentheses4() throws Exception {
    String s = ")()()())((()()()())";
    int expected = 10;
    int actual = this.solution.longestValidParentheses(s);

    assertEquals(actual, expected);
  }

  @Test
  public void testLongestValidParentheses5() throws Exception {
    String s = ")";
    int expected = 0;
    int actual = this.solution.longestValidParentheses(s);

    assertEquals(actual, expected);
  }

  @Test
  public void testLongestValidParentheses6() throws Exception {
    String s = "((";
    int expected = 0;
    int actual = this.solution.longestValidParentheses(s);

    assertEquals(actual, expected);
  }

  @Test
  public void testLongestValidParentheses7() throws Exception {
    String s = ")()()())((()()()()))))))()()()()()()()()";
    int expected = 16;
    int actual = this.solution.longestValidParentheses(s);

    assertEquals(actual, expected);
  }

  @Test
  public void testLongestValidParentheses9() throws Exception {
    String s = "()(()";
    int expected = 2;
    int actual = this.solution.longestValidParentheses(s);

    assertEquals(actual, expected);
  }

  @Test
  public void testLongestValidParentheses10() throws Exception {
    String s = new String(new char[17172]).replaceAll("\0", "(");
    int expected = 0;
    int actual = this.solution.longestValidParentheses(s);

    assertEquals(actual, expected);
  }
}
