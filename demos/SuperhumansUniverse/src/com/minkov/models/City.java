package com.minkov.models;

import com.minkov.models.base.ModelBase;

public class City extends ModelBase {

  private static final int MIN_NAME_LENGTH = 3;
  private static final int MAX_NAME_LENGTH = 30;
  private String name;

  private Country country;

  public City(String name, Country country) {
    setName(name);
    setCountry(country);
  }

  public Country getCountry() {
    return country;
  }

  private void setCountry(Country country) {
    checkForNull(country, "Country cannot be null");

    this.country = country;
  }

  public String getName() {
    return name;
  }

  private void setName(String name) {
    checkForNull(name, "Name cannot be null");
    String lengthErrorMessage = String.format("Name must have length between %d and %d",
      MIN_NAME_LENGTH, MAX_NAME_LENGTH);
    checkStringValidity(name, MIN_NAME_LENGTH, MAX_NAME_LENGTH, lengthErrorMessage);

    this.name = name;
  }
}
