public class InterfacePrivateMethodsDemo {
  public static void main(String[] args) {
    Calculator calculator = new CalculatorImpl();

    // Using public methods
    System.out.println("Addition: " + calculator.add(5, 3));
    System.out.println("Subtraction: " + calculator.subtract(5, 3));
    System.out.println("Multiplication: " + calculator.multiply(5, 3));
  }
}
