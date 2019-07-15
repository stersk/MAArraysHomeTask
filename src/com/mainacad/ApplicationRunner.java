package com.mainacad;

import com.mainacad.Services.IntProcessingService;
import com.mainacad.Services.StringProcessingService;

import java.util.logging.Logger;

public class ApplicationRunner {
  private static Logger logger = Logger.getLogger(ApplicationRunner.class.getName());

  public static void main(String[] args) {
    /* int value = 12345;
    logger.info("Digit sum by chars " + String.valueOf(value) + " : " + IntProcessingService.getDigitsSumByChars(value));
    logger.info("Digit sum arithmetically " + String.valueOf(value) + " : " + IntProcessingService.getDigitsSumArithmetically(value));
    */
    String initialValue = "ab1cd2 3ef4g ij5k";
    logger.info(initialValue + " -> " + StringProcessingService.reverseCharSequenceInRowElements(initialValue));
  }
}