package com.minkov.app.models.creatures;

import com.minkov.app.models.FoodType;
import com.minkov.app.models.base.Animal;
import com.minkov.app.models.base.Eatable;

import java.util.Arrays;

public class Cat extends Animal implements Eatable {
  private static final FoodType[] EATABLE_FOODS = {FoodType.MEAT};

  public Cat(String name, int age) {
    super(name, age, Arrays.asList(EATABLE_FOODS));
  }
}
