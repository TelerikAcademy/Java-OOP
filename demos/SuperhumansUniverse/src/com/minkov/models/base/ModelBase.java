package com.minkov.models.base;

import com.minkov.utils.MessageFormatterBase;

import java.security.InvalidParameterException;

public abstract class ModelBase {
  private MessageFormatterBase messageFormatter;

  protected void checkForNull(Object obj, String errorMessage) {
    if (obj == null) {
      throw new InvalidParameterException(errorMessage);
    }
  }

  protected void checkStringValidity(String value, int min, int max, String errorMessage) {
    if (value.length() < min || value.length() > max) {
      throw new InvalidParameterException(errorMessage);
    }
  }

  protected void checkStringValidity(String value, int min, String errorMessage) {
    if (value.length() < min) {
      throw new InvalidParameterException(errorMessage);
    }
  }


  public MessageFormatterBase getMessageFormatter() {
    return messageFormatter;
  }

  protected void setMessageFormatter(MessageFormatterBase messageFormatter) {
    this.messageFormatter = messageFormatter;
  }
}
