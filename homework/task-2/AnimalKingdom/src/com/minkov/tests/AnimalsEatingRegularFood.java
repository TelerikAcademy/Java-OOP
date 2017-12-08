package com.minkov.tests;

import com.minkov.app.models.FoodType;
import com.minkov.app.models.creatures.Cat;
import com.minkov.app.models.eatables.Food;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

class AnimalsEatingRegularFood {

  @Test
  void cat_eatsMeat_shouldBeOk() {
    Cat cat = new Cat("Pesho", 3);
    Food food = new Food("Lukanka", FoodType.MEAT);
    cat.eat(food);
  }

  @Test
  void cat_eatsGrass_shouldThrow() {
    Cat cat = new Cat("Pesho", 3);
    Food food = new Food("Yellow", FoodType.GRASS);

    Assertions.assertThrows(InvalidParameterException.class, () -> cat.eat(food));
  }
}
