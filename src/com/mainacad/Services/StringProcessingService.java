package com.mainacad.Services;

import java.util.Arrays;

public class StringProcessingService {
  public static String reverseCharSequenceInRowElements(String rowValue) {
    String[] rowElements = rowValue.split(" ");
    for (int i = 0; i < rowElements.length; i++) {
      rowElements[i] = reverseCharsInElement(rowElements[i]);
    }

    return String.join(" ", rowElements);
  }

  private static String reverseCharsInElement(String element) {
    char[] initialArray = element.toCharArray();
    char[] lettersArray = new char[initialArray.length];

    int lettersCount = 0;

    for (int i = 0; i < initialArray.length; i++) {
      if (Character.isAlphabetic(initialArray[i])) {
        lettersArray[lettersCount] = initialArray[i];
        lettersCount++;
      }
    }

    lettersArray = Arrays.copyOf(lettersArray, lettersCount);

    lettersCount--;
    for (int i = 0; i < initialArray.length; i++) {
      if (Character.isAlphabetic(initialArray[i])) {
        initialArray[i] = lettersArray[lettersCount];
        lettersCount--;
      }
    }

    return String.valueOf(initialArray);
  }
}
