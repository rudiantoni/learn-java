public class Main {
  public static void main(String[] args) {
    System.out.println("===== continue =====");
    for (int i = 0; i < 5 ; i++) {
      if (i % 2 == 0) {
        continue;
      }
      System.out.println("Contador: " + i);
    }

    System.out.println("===== break");
    for (int i = 0; i < 5; i++) {
      if (i == 3) {
        break;
      }
      System.out.println("Contador: " + i);
    }

    System.out.println("===== break em loop aninhado =====");
    for (int i = 0; i < 5 ; i++) {
      for (int j = 0; j < 5; j++) {
        if (j == 3) {
          break;
        }
        System.out.print(j + " ");
      }
      System.out.println("Contador: " + i);
    }
  }
}