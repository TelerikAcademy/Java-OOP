package com.minkov.app.models.base;

import com.minkov.app.models.FoodType;
import com.minkov.app.models.extensions.ICanEat;

import java.util.List;

public abstract class Animal implements ICanEat, Eatable {
  private String name;
  private int age;
  private List<FoodType> eatableFoods;

  protected Animal(String name, int age, List<FoodType> eatableFoods) {
    setName(name);
    setAge(age);
    setEatableFoods(eatableFoods);
  }

  public List<FoodType> getEatableFoods() {
    return eatableFoods;
  }

  private void setEatableFoods(List<FoodType> eatableFoods) {
    this.eatableFoods = eatableFoods;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public void printEating(Eatable eatable) {
    System.out.printf("%s eats %s%n", getName(), eatable);
  }
}
