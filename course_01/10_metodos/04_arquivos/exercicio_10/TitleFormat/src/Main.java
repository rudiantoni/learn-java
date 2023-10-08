import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite uma frase:");
    String inputPhrase = sc.nextLine();
    sc.close();
    String capitalized = firstCharToTitleCase(inputPhrase);
    System.out.println("Frase digitada: " +inputPhrase);
    System.out.println("Frase formatada: " +capitalized);
  }

  public static String firstCharToTitleCase(String string) {
    String[] words = string.split(" ");
    for (int i = 0; i < words.length; i++) {
      String word = words[i];
      String newWord = toUpper(word);
      words[i] = newWord;
    }
    String result = String.join(" ", words);
    return result;
  }

  private static String toUpper(String word) {
    int firstLetterIndex = -1;
    for (int i = 0; i < word.length(); i++) {
      if (Character.isAlphabetic(word.charAt(i))) {
        firstLetterIndex = i;
        break;
      }
    }

    if (firstLetterIndex > -1) {
      String upperLetter = String.valueOf(word.charAt(firstLetterIndex)).toUpperCase();
      String wordStart = word.substring(0, firstLetterIndex);
      String wordEnd = word.substring(firstLetterIndex + 1);
      String finalWord = String.format("%s%s%s", wordStart, upperLetter, wordEnd);
      return finalWord;
    }
    return word;
  }
}