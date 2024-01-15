public interface Calculator {
  int add(int a, int b);

  @Deprecated(since = "2.0", forRemoval = true)
    // Another public method
  int subtract(int a, int b);

  // Default method using private helper method
  default int multiply(int a, int b) {
    return multiplyHelper(a, b);
  }

  // Private helper method
  private int multiplyHelper(int a, int b) {
    return a * b;
  }
}
