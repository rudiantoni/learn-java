public class Main {
  public static void main(String[] args) {
    System.out.println();
    System.out.println("===== Comparação de Strings =====");
    System.out.println();
    String s = " Hello ";
    String s2 = " Hello ";
    System.out.println("s == s2: " + (s == s2)); // true

    String s3 = new String(" Hello ");
    System.out.println("s == s3: " + (s == s3)); // false
    System.out.println("s.equals(s3): " + s.equals(s3)); // true
    System.out.println("s == s3.intern(): " + (s == s3.intern())); // true

    String firstName = "Andrii";
    String firstName2 = "andrii";
    System.out.println("firstName.equals(firstName2): " + firstName.equals(firstName2)); // false
    System.out.println("firstName.equalsIgnoreCase(firstName2): " + firstName.equalsIgnoreCase(firstName2)); // true

  }
}