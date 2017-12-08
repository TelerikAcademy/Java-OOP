package com.minkov.app.models.eatables;

import com.minkov.app.models.FoodType;
import com.minkov.app.models.base.Eatable;

import java.text.MessageFormat;

public class Food implements Eatable {
  private FoodType type;
  private String name;

  public Food(String name, FoodType type) {
    setName(name);
    setType(type);
  }

  public FoodType getType() {
    return type;
  }

  public void setType(FoodType type) {
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return MessageFormat.format("{0} ({1})", getName(), getType());
  }
}
