package com.mainacad.Services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringProcessingServiceTest {

  @Test
  void testReverseCharSequenceInRowElements() {
    String testString = "ab1cd2 3ef4g ij5k";
    String resultString = StringProcessingService.reverseCharSequenceInRowElements(testString);

    assertNotNull(resultString);
    assertEquals( "dc1ba2 3gf4e kj5i", resultString);
  }
}