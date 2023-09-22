import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite algumas palavras separadas por espaço:");
    String text = sc.nextLine();
    System.out.println("Digite o comprimento mínimo do filtro:");
    int minLength = sc.nextInt();
    sc.close();
    text = text.replaceAll("\\s+", " ");
    String[] words = text.split(" ");
    String[] filteredWords = filterWordsByLength(minLength, words);
    System.out.println("Foram localizadas " + (filteredWords.length) + " pelo filtro.");
    System.out.println("Palavras localizadas pelo filtro: " + String.join(", ", filteredWords));

  }

  public static String[] filterWordsByLength(int minLength, String[] words) {
    String[] dirtyFilteredWords = new String[words.length];
    int totalValidWords = 0;
    for (int i = 0; i < words.length; i++) {
      String curWord = words[i];
      if (curWord.length() >= minLength) {
        totalValidWords++;
        dirtyFilteredWords[i] = curWord;
      }
    }

    String[] result = new String[totalValidWords];
    int nextIdxToAdd = 0;
    for (int i = 0; i < dirtyFilteredWords.length ; i++) {
      if (dirtyFilteredWords[i] != null) {
        result[nextIdxToAdd] = dirtyFilteredWords[i];
        nextIdxToAdd++;
      }
    }
    return result;
  }
}