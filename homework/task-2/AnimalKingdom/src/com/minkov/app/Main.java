package com.minkov.app;

import com.minkov.app.models.Color;
import com.minkov.app.models.FoodType;
import com.minkov.app.models.creatures.Cat;
import com.minkov.app.models.creatures.Lion;
import com.minkov.app.models.creatures.Robot;
import com.minkov.app.models.eatables.Ball;
import com.minkov.app.models.eatables.Food;

public class Main {
  public static void main(String[] args) {
    // steak, lukanka
    // green, yellow green,
    Cat stamat = new Cat("Stamat", 2);

    Food lukanka = new Food("Lukanka", FoodType.MEAT);
    Ball ball = new Ball(Color.BLACK, 3);

    stamat.eat(ball);
    stamat.eat(lukanka);
//    stamat.eat(new Food("Zelena treva", FoodType.GRASS));
    Lion pesho = new Lion("Pesho", 4);
    stamat.eat(pesho);
    pesho.eat(stamat);

    Robot robot = new Robot("1235123");
    robot.eat(new Ball(Color.RED, 3));
    robot.eat(pesho);
  }
}
