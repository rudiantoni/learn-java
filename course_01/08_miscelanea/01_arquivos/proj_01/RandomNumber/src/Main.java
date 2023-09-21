import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Random r = new Random();
    System.out.println(r.nextInt());           // Qualquer int
    System.out.println(r.nextInt(100));     // Qualquer int de 0 a 99
    System.out.println(r.nextInt(100) + 1); // Qualquer int de 1 a 100
  }
}