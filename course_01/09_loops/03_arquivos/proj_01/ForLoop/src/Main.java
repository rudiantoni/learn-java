public class Main {
  public static void main(String[] args) {
    System.out.println("===== Loop for =====");
    for (int i = 0; i < 5; i++) {
      System.out.println("Contador: " + i);
    }

//    Loop infinito
//    for(;;) {
//
//    }

    System.out.println("===== Loop for - Exemplo de uso da vírgula =====");
    for (int i = 0, j = 10; i < j; i++, j--) {
      System.out.println("Countadores: i = " + i + ", j = " +j);
    }
  }
}