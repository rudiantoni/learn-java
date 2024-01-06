import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int height, width;
    System.out.println("Digite a altura:");
    height = sc.nextInt();
    System.out.println("Digite a largura:");
    width = sc.nextInt();
    sc.close();
    drawRectangle(height, width);
  }

  private static void drawRectangle(int height, int width) {

    for (int curLine = 1; curLine <= height; curLine ++) {
      if (curLine == 1) {
        // Linha cima
        for (int curCol = 1; curCol <= width; curCol++) {
          System.out.print("*");
        }
        System.out.println();
      } else if ( curLine == height) {
        for (int curCol = 1; curCol <= width; curCol++) {
          System.out.print("*");
        }
      } else {
        for (int curCol = 1; curCol <= width; curCol++) {
          if (curCol == 1 || curCol == width) {
            System.out.print("*");
          } else {
            System.out.print(" ");
          }
        }
        System.out.println();
      }
    }

  }

}