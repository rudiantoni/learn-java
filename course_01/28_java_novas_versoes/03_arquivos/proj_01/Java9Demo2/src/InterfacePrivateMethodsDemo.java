public class InterfacePrivateMethodsDemo {
  public static void main(String[] args) {
    // Exemplo dos métodos privados de interfaces
    System.out.println("========== Exemplo dos métodos privados de interfaces ==========");
    Calculator calculator = new CalculatorImpl();
    // Using public methods
    System.out.println("Addition: " + calculator.add(5, 3));
    System.out.println("Multiplication: " + calculator.multiply(5, 3));

    // Exemplo da definição de @Deprecated
    System.out.println("========== Exemplo da definição de @Deprecated ==========");
    System.out.println("Subtraction: " + calculator.subtract(5, 3));
  }
}
