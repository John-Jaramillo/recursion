package edu.cnm.deepdive;

public class Palindromes {

  public static boolean testRecursive(String phrase) {
    return (phrase.length() <= 1)
        || (phrase.charAt(0) == phrase.charAt(phrase.length() - 1)
            && testRecursive(phrase.substring(1, phrase.length() - 1))
    );
  }

  public static boolean testDenormalized(String denormPhrase) {
    String replacementString = denormPhrase.toLowerCase().replaceAll("[\\W_]+", "");
    return (testRecursive(replacementString));
  }

  public static boolean testIterative(String phrase) {
    int index = phrase.length() -1;
    for (int i = 0; i < phrase.length() / 2; i++) {
      if (phrase.charAt(i) != phrase.charAt(index - i)) {
        return false;
      }
    }
    return true;
   }

}
