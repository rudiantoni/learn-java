public class Main {
  public static void main(String[] args) {
    Integer[][] matrix = {
      {1, 2, 3, 4, 5},
      {6, 7},
      {8, 9, 10}
    };

    for (Integer[] row: matrix) {
      for (Integer data: row) {
        System.out.printf("\t%d", data);
      }
      System.out.println();
    }
  }
}