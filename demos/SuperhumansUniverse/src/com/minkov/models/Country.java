package com.minkov.models;

import com.minkov.models.base.ModelBase;

public class Country extends ModelBase {
  private static final int MIN_NAME_LENGTH = 2;
  private static final int MAX_NAME_LENGTH = 30;

  private String name;
  private Planet planet;

  public Country(String name, Planet planet) {
    setName(name);
    setPlanet(planet);
  }

  public Planet getPlanet() {
    return planet;
  }

  public void setPlanet(Planet planet) {
    checkForNull(planet, "Planet cannot be null");

    this.planet = planet;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    checkForNull(name, "Country name cannot be null");
    String lengthErrorMessage = String.format("Country name must have length between %d and %d",
      MIN_NAME_LENGTH, MAX_NAME_LENGTH);
    checkStringValidity(name, MIN_NAME_LENGTH, MAX_NAME_LENGTH, lengthErrorMessage);
    this.name = name;
  }
}
