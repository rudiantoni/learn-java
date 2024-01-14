@FunctionalInterface
interface MyInterface {
  // Abstract method (traditional interface method)
  void regularMethod();

  // Default method with a default implementation
  default void defaultMethod() {
    System.out.println("Default implementation of defaultMethod in MyInterface");
  }

  static void staticMethod() {
    System.out.println("Static method in MyInterface");
  }
}