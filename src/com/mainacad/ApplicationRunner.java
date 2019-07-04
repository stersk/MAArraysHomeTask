package com.mainacad;

import com.mainacad.Services.IntProcessingService;
import com.mainacad.Services.StringProcessingService;

public class ApplicationRunner {
  public static void main(String[] args) {
    int value = 12345;
    System.out.println("Digit sum by chars " + String.valueOf(value) + " : " + IntProcessingService.getDigitsSumByChars(value));
    System.out.println("Digit sum arithmetically " + String.valueOf(value) + " : " + IntProcessingService.getDigitsSumArithmetically(value));

    String initialValue = "ab1cd2 3ef4g ij5k";
    System.out.println(initialValue + " -> " + StringProcessingService.reverseCharSequenceInRowElements(initialValue));
  }
}