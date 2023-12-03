import java.util.NavigableMap;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
    System.out.println("===== TreeMap =====");

    NavigableMap<Integer, String> treeMap = new TreeMap<>();
    treeMap.put(1, "one");
    treeMap.put(5, "five");
    treeMap.put(2, "two");
    treeMap.put(4, "four");
    treeMap.put(3, "three");
    System.out.println(treeMap);

    System.out.println();
    System.out.println("Primeira entrada (first): " + treeMap.firstEntry());
    System.out.println("Última entrada (last): " + treeMap.lastEntry());

    System.out.println();
    System.out.println("Menor entrada para 3 (lower): " + treeMap.lowerEntry(3));
    System.out.println("Piso de entrada para 3 (floor): " + treeMap.floorEntry(3));
    System.out.println("Maior entrada para 3 (higher): " + treeMap.higherEntry(3));
    System.out.println("Teto de entrada para 3 (ceiling): " + treeMap.ceilingEntry(3));

    System.out.println();
    System.out.println("TreeMap ordenado (crescente): " +treeMap);
    System.out.println("TreeMap ordenado (decrescente): " +treeMap.descendingMap());

    System.out.println();
    System.out.println("*** Chaves são ordenadas de acordo com o Comparator ***");
    NavigableMap<Product, User> productUserMap = new TreeMap<>(new CustomProductComparator());
    productUserMap.put(new DefaultProduct(2, "Oregon Cottage Interior Oak Door", "Doors", 109.98), new DefaultUser());
    productUserMap.put(new DefaultProduct(1, "Hardwood Oak Suffolk Internal Door", "Doors", 109.98), new DefaultUser());

    for (Product product: productUserMap.keySet()) {
      System.out.println(product);
    }

  }
}