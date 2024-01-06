import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o tamanho da matriz:");
    int maxSize = sc.nextInt();
    double[][] matrix = generateMatrix(maxSize);
    System.out.println("Quanto você deseja girar a matriz?");
    System.out.println("1 - 90 graus");
    System.out.println("2 - 180 graus");
    System.out.println("3 - 270 graus");
    int rotateOption = sc.nextInt();

    switch (rotateOption) {
      case 1:
        rotate90(matrix);
        break;
      case 2:
        rotate180(matrix);
        break;
      case 3:
        rotate270(matrix);
        break;
      default:
        System.out.println("Opção inválida.");
    }

  }

  private static double[][] generateMatrix(int maxSize) {
    double[][] resMatrix = new double[maxSize][maxSize];
    for (int i = 0; i < resMatrix.length; i++) {
      for (int j = 0; j < resMatrix[i].length; j++) {
        double cellValue = Double.parseDouble(i + "." + j);
        resMatrix[i][j] = cellValue;
      }
    }
    return resMatrix;
  }

  private static void rotate90(double[][] matrix) {
    // Se for necessário criar uma nova matriz com as novas posições
    // basta descomentar
    //double[][] newMatrix = new double[matrix.length][matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = matrix.length - 1; j >= 0; j--) {
        System.out.print(matrix[j][i] + "\t");
        //newMatrix[i][ Math.abs(j - (matrix.length - 1)) ] = matrix[j][i];
      }
      System.out.println();
    }
    //return newMatrix;
  }

  private static void rotate180(double[][] matrix) {
    // Se for necessário criar uma nova matriz com as novas posições
    // basta descomentar
    //double[][] newMatrix = new double[matrix.length][matrix.length];
    for (int i = matrix.length - 1; i >= 0; i--) {
      for (int j = matrix.length - 1; j >= 0; j--) {
        System.out.print(matrix[i][j] + "\t");
        //newMatrix[Math.abs(i - (matrix.length - 1))][ Math.abs(j - (matrix.length - 1)) ] = matrix[i][j];
      }
      System.out.println();
    }
    // return newMatrix;
  }

  private static void rotate270(double[][] matrix) {
    // Se for necessário criar uma nova matriz com as novas posições
    // basta descomentar
    //double[][] newMatrix = new double[matrix.length][matrix.length];
    for (int i = matrix.length - 1; i >= 0; i--) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[j][i] + "\t");
        //newMatrix[Math.abs(i - (matrix.length - 1))][j] = matrix[j][i];
      }
      System.out.println();
    }
    //return newMatrix;
  }

  private static void printMatrix(double[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        double cellValue = matrix[i][j];
        System.out.print(cellValue + "\t");
      }
      System.out.println();
    }
  }
}