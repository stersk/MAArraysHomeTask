package com.mainacad.Services;

public class IntProcessingService {
  public static int getDigitsSumByChars(int number) {
    int sum = 0;
    char[] chars = Integer.toString(number).toCharArray();
    for (int i = 0; i < chars.length; i++) {
      sum += Integer.parseInt(String.valueOf(chars[i]));
    }

    return sum;
  }

  public static int getDigitsSumArithmetically(int number) {
    int sum = 0;
    while (number > 10) {
      sum += number % 10;
      number = number / 10;
    }

    sum += number;
    return sum;
  }
}
