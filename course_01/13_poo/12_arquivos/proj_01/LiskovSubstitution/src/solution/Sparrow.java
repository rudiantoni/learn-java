package solution;

public class Sparrow implements FlyingBird {
  @Override
  public void eat() {
    System.out.println("Sparrow eats");
  }

  @Override
  public void fly() {
    System.out.println("Sparrow flies");
  }
}
