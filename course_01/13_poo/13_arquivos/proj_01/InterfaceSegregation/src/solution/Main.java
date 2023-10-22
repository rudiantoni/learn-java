package solution;

public class Main {
  public static void main(String[] args) {
    Flyable plane = new Plane();
    Drivable plane1 = new Plane();

    plane.fly();
    plane1.drive();

    Sailable vortex = new Vortex();
    if (vortex instanceof Drivable) {
      ((Drivable) vortex).drive();
    }
  }
}
