public class Main {
  public static void main(String[] args) {
    System.out.println("===== Loop Foreach =====");
    int[] arr = {1,2,3};
    int sum = 0;
    for (int number: arr) {
      sum += number;
      System.out.println("Número: " + number);
    }
    System.out.println("Soma: " + sum);
  }
}