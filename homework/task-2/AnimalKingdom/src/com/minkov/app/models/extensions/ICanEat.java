package com.minkov.app.models.extensions;

import com.minkov.app.models.FoodType;
import com.minkov.app.models.base.Eatable;
import com.minkov.app.models.eatables.Food;

import java.security.InvalidParameterException;
import java.util.List;

public interface ICanEat {

  List<FoodType> getEatableFoods();

  void printEating(Eatable eatable);

  default void eat(Eatable eatable) {
    if (eatable instanceof Food) {
      Food food = (Food) eatable;

      if (!getEatableFoods().contains(food.getType())) {
        throw new InvalidParameterException(String.format("Does not like %s", eatable));
      }
    }

    printEating(eatable);
  }

}
