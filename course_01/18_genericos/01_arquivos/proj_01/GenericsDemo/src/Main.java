public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    String[] strings = {"one", "two", "three"};
    printArray(strings);

    Integer[] ints = {1, 2, 3};
    /**
     * Generates a compilation error
     * java: incompatible types: java.lang.Integer[] cannot be converted to java.lang.String[]
     *
     * because printArray(String[] arr) works only with String array but not with other arrays.
     */
    printArray(ints);

  }

  private static void printArray(String[] arr) {
    for (String elem : arr) {
      System.out.println("Element: " + elem);
    }
  }

  private static <E> void printArray(E[] arr) {
    for (E elem : arr) {
      System.out.println("Element: " + elem);
    }
  }


}