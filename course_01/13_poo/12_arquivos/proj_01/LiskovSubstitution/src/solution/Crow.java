package solution;

public class Crow implements FlyingBird {

  @Override
  public void eat() {
    System.out.println("Crow eats");
  }

  @Override
  public void fly() {
    System.out.println("Crow flies");
  }
}
