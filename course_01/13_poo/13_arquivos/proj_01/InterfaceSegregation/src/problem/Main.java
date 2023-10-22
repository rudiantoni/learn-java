package problem;

public class Main {
  public static void main(String[] args) {
    Vehicle car = new Car();
    Vehicle plane = new Plane();
    Vehicle boat = new Boat();

    car.drive();
//    car.fly(); // Throws UnsupportedOperationException
//    car.sail(); // Throws UnsupportedOperationException

    plane.drive();
    plane.fly();
//    plane.sail(); // Throws UnsupportedOperationException

//    boat.drive(); // Throws UnsupportedOperationException
//    boat.fly(); // Throws UnsupportedOperationException
    boat.sail();
  }
}
