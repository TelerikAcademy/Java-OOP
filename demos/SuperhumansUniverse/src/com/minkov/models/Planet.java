package com.minkov.models;

import com.minkov.models.base.ModelBase;

public class Planet extends ModelBase {
  private static final int MIN_NAME_LENGTH = 2;
  private static final int MAX_NAME_LENGTH = 30;

  private String name;

  public Planet(String name) {
    setName(name);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    checkForNull(name, "Planet name cannot be null");
    String lengthErrorMessage = String.format("",
      MIN_NAME_LENGTH, MAX_NAME_LENGTH);
    checkStringValidity(name, MIN_NAME_LENGTH, MAX_NAME_LENGTH, lengthErrorMessage);
    this.name = name;
  }
}
