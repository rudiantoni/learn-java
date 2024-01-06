import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite qualquer texto:");
    String inp = sc.nextLine();
    System.out.println("Você digitou o seguinte texto: " + inp);
    String[] splittedWords = inp.split("[^A-Za-z0-9_]+");
    // Código da solução, usa inp.split("[\\p{P}\\s]+");
    System.out.println(Arrays.toString(splittedWords));
  }
}