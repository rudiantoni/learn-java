package solution;

public class Vortex implements Drivable, Sailable {
  @Override
  public void drive() {
    System.out.println("Vortex drives");
  }

  @Override
  public void sail() {
    System.out.println("Vortex sails");
  }
}
