package com.minkov.tests;

import com.minkov.app.models.creatures.Cat;
import com.minkov.app.models.creatures.Lion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnimalsEatingAnimalsTests {

  @Test
  void lion_eatsOtherAnimal_shouldBeOk() {
    Lion lion = new Lion("Pesho", 3);
    Cat cat = new Cat("Gosho", 2);

    lion.eat(cat);
  }

  @Test
  void cat_eatsOtherAnimal_shouldThrow() {
    Cat cat = new Cat("Gosho", 2);
    Lion lion = new Lion("Pesho", 3);

    Assertions.assertThrows(Exception.class, () -> cat.eat(lion));
  }
}
