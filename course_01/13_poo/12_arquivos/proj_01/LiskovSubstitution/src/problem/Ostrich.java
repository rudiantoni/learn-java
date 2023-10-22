package problem;

public class Ostrich implements Bird {
  @Override
  public void fly() {
    throw new UnsupportedOperationException("Ostrich falls while trying to fly");
  }

  @Override
  public void eat() {
    System.out.println("Ostrich eats");
  }
}
