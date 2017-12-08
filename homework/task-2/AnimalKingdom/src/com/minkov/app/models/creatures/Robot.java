package com.minkov.app.models.creatures;

import com.minkov.app.models.FoodType;
import com.minkov.app.models.base.Eatable;
import com.minkov.app.models.extensions.ICanEat;

import java.util.Arrays;
import java.util.List;

public class Robot implements ICanEat {
  private static final FoodType[] EATABLE_FOODS = {FoodType.NUTS_AND_BOLTS, FoodType.ELECTRICITY};
  private String serialNumber;

  public Robot(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  @Override
  public List<FoodType> getEatableFoods() {
    return Arrays.asList(EATABLE_FOODS);
  }

  @Override
  public void printEating(Eatable eatable) {
    System.out.println("THe robot is eating");
  }
}

