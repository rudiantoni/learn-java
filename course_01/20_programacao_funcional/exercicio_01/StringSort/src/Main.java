import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite as palavras separadas por espaço:");
    String inp = sc.nextLine();
    sc.close();
    List<String> words = new ArrayList<>(Arrays.asList(inp.split(" ")));
    words.sort(
      Comparator
        .comparingInt((String s) -> s.length()).reversed()
        .thenComparing(String.CASE_INSENSITIVE_ORDER)
    );
    System.out.println(words);
  }
}