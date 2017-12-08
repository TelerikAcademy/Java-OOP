package com.minkov.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SampleTests {

  @Test
  void sample_test() {
    int x = 9;
    int y = (int) Math.sqrt(x);

    Assertions.assertEquals(3, y);
  }
}
