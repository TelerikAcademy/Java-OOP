package geometry;

public class Romb {
  private int size;

  protected Romb(int x, int y) {
    //super(x, y);
  }

  public void setSize(int size) {
    if (Shape.Validator.isPositive(size)) {

    }
    this.size = size;
  }

}