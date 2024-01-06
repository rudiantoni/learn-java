import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String text;
    System.out.println("Digite um texto:");
    text = sc.nextLine();
    sc.close();

    System.out.println("O texto possui " + getWordsAmount(text) + " palavras.");
  }
  public static int getWordsAmount(String text) {
    text = text.replaceAll("\\s+", " ");
    String[] words = text.split(" ");
    return words.length;
  }
}