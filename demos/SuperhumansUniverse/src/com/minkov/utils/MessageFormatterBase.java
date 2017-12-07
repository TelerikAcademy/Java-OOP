package com.minkov.utils;

public interface MessageFormatterBase {
  String formatNullCheckMessage(String propertyName);

  String formatRangeCheckMessage(String propertyName, int min, int max);
}
