package com.minkov.models;

import com.minkov.models.base.ModelBase;

public class Power extends ModelBase {
  private static final int MIN_NAME_LENGTH = 3;
  private static final int MAX_NAME_LENGTH = 35;

  private String name;
  private PowerType powerType;

  public Power(String name, PowerType powerType) {
    setName(name);
    setPowerType(powerType);
  }

  public String getName() {
    return name;
  }

  private void setName(String name) {
    checkForNull(name, "Power name cannot be null");
    String lengthErrorMessage =
      String.format("Power name must be between %d and %d", MIN_NAME_LENGTH, MAX_NAME_LENGTH);
    checkStringValidity(name, MIN_NAME_LENGTH, MAX_NAME_LENGTH, lengthErrorMessage);
    this.name = name;
  }

  public PowerType getPowerType() {
    return powerType;
  }

  private void setPowerType(PowerType powerType) {
    checkForNull(powerType, "Power type cannot be null");
    this.powerType = powerType;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }

    if (!(obj instanceof Power)) {
      return false;
    }

    Power other = (Power) obj;

    return getName().toLowerCase().equals(other.getName().toLowerCase()) &&
      getPowerType() == other.getPowerType();
  }

  @Override
  public int hashCode() {
    return (getName().hashCode() << 13) * 23 +
      (getPowerType().hashCode() >> 7) * 29;
  }
}
