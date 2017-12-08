package com.minkov.app.models.eatables;

import com.minkov.app.models.Color;
import com.minkov.app.models.base.Eatable;

public class Ball implements Eatable {
  private Color color;
  private int size;

  public Ball(Color color, int size) {
    setColor(color);
    setSize(size);
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return color;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public int getSize() {
    return size;
  }

  @Override
  public String toString() {
    return getColor() + " ball";
  }
}
