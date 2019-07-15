package com.mainacad.Services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntProcessingServiceTest {

  @Test
  void testGetDigitsSumByChars() {
    int testValue = 12345;
    int resultValue = IntProcessingService.getDigitsSumArithmetically(testValue);

    assertEquals(15, resultValue);
  }

  @Test
  void testGetDigitsSumArithmetically() {
    int testValue = 12345;
    int resultValue = IntProcessingService.getDigitsSumArithmetically(testValue);

    assertEquals(15, resultValue);
  }
}