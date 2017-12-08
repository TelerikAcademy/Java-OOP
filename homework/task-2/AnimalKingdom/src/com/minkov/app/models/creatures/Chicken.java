package com.minkov.app.models.creatures;

import com.minkov.app.models.FoodType;
import com.minkov.app.models.base.Animal;

import java.util.Arrays;

public class Chicken extends Animal {
  private static final FoodType[] EATABLE_FOODS = {FoodType.GRASS};

  public Chicken(String name, int age) {
    super(name, age, Arrays.asList(EATABLE_FOODS));
  }
}
