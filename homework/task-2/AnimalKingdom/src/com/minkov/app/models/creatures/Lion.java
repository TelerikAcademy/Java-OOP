package com.minkov.app.models.creatures;

import com.minkov.app.models.FoodType;
import com.minkov.app.models.base.Animal;

import java.util.Arrays;

public class Lion extends Animal {
  private static final FoodType[] EATABLE_FOODS = {FoodType.ANIMAL};

  public Lion(String name, int age) {
    super(name, age, Arrays.asList(EATABLE_FOODS));
  }
}
