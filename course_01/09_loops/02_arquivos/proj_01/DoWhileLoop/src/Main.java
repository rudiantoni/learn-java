public class Main {
  public static void main(String[] args) {
    System.out.println("===== Loop do-while =====");
    int counter = 0;
    do {
      System.out.println("Contador: " + counter++);
    } while (counter < 5);

    do {
      System.out.println("Contador já é cinco: " + counter);
    } while (counter < 5);
  }
}