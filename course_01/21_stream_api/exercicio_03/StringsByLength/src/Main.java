import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite palavras quaisquer separadas por espaço:");
    String inpWords = sc.nextLine();
    System.out.println("Digite o comprimento para filtrar:");
    Integer inpMinLength = sc.nextInt();
    sc.close();
    String[] words = inpWords.split(" ");
    System.out.println(Arrays.toString(filterWordsByLength(inpMinLength, words)));
  }

  public static String[] filterWordsByLength(int minLength, String[] words) {
    return Arrays.stream(words)
      .filter(s -> s.length() >= minLength)
      .toArray(String[]::new);
  }
}