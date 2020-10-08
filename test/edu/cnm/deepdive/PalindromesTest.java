package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromesTest {

  static final String[] inputValues = {
      "radar",
      "sonar",
      "abba",
      "abb",
      "x",
      ""
  };

  static final boolean[] expectedValues = {
      true,
      false,
      true,
      false,
      true,
      true
  };

  static final String[] inputDenormValues = {
      "radar",
      "Radar",
      "A man, a plan, a canal - Panama!",
      "A man, a plan, a dam - Hoover!",
      "aBbA"
  };

  static final boolean[] expectedDenormValues = {
      true,
      true,
      true,
      false,
      true
  };


  @Test
  void testRecursive() {
    for (int i = 0; i < inputValues.length; i++) {
      String input = inputValues[i];
      boolean expected = expectedValues[i];
      boolean actual = Palindromes.testRecursive(input);
      assertEquals(expected, actual);
    }
  }

  @Test
  void testDenormalized() {
    for (int i = 0; i < inputDenormValues.length; i++) {
      String input = inputDenormValues[i];
      boolean expected = expectedDenormValues[i];
      boolean actual = Palindromes.testDenormalized(input);
      assertEquals(expected, actual);
    }
  }

  @Test
  void testIterative() {
    for (int i = 0; i < inputValues.length; i++) {
      String input = inputValues[i];
      boolean expected = expectedValues[i];
      boolean actual = Palindromes.testIterative(input);
      assertEquals(expected, actual);
    }
  }
}