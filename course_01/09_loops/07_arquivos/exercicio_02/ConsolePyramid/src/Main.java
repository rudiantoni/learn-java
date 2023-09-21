import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite a altura da pirâmide:");
    Integer maxHeight = sc.nextInt();
    sc.close();
    Integer maxLines = maxHeight * 2 - 1;
    for (int i = 0; i < maxLines; i++) {
      Integer charPrint = i + 1;
      if (charPrint > maxHeight) {
        Integer charDiff = ((charPrint - maxHeight) * 2);
        charPrint -= charDiff;
      }

      for (int j = 0; j < charPrint; j++) {
        System.out.print("*");
      }

      if (i + 1 < maxLines) {
        System.out.println();
      }
    }
  }
}