package com.minkov.app.models.creatures;

import com.minkov.app.models.FoodType;
import com.minkov.app.models.base.Animal;

import java.util.Arrays;

public class Pig extends Animal {
  private static final FoodType[] EATABLE_FOODS = {FoodType.MEAT, FoodType.GRASS};

  public Pig(String name, int age) {
    super(name, age, Arrays.asList(EATABLE_FOODS));
  }
}
