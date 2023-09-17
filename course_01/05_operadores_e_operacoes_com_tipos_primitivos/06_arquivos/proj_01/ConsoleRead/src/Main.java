import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Por favor, digite qualquer palavra:");
    String word = sc.next();
    System.out.println("Você digitou essa palavra: " + word);
    System.out.println("Por favor, digite qualquer número inteiro:");
    int i = sc.nextInt();
    System.out.println("Você digitou esse número: " + i);
    Integer x = 200;
  }
}