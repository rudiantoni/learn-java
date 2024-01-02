import java.util.Comparator;

public class Main {
  public static void main(String[] args) {
    System.out.printf("O máximo de %d, %d e %d é %d.\n\n", 1, 2, 3, maxValue(1,2,3));
    System.out.printf("O máximo de %.1f, %.1f e %.1f é %.1f.\n\n", 1.1, 2.2, 3.3, maxValue(1.1,2.2,3.3));
    System.out.printf("O máximo de %s, %s e %s é %s.\n", "Audi", "Acura", "Aston Martin", maxValue("Audi", "Acura", "Aston Martin"));
  }

  public static <T extends Comparable<T>> T maxValue(T x, T y, T z) {
    T max = x; // Assume que o x é o maior
    if (y.compareTo(max) > 0) {
      max = y; // y é o maior até aqui
    }
    if (z.compareTo(max) > 0) {
      max = z; // z é o maior até aqui
    }
    return max;
  }
}