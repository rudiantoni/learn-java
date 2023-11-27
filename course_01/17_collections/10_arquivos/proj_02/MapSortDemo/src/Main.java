import java.util.*;
import java.util.Map.Entry;

public class Main {
  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();
    map.put(2, "two");
    map.put(1, "one");
    map.put(3, "three");

    System.out.println("===== Ordenando Map por chave Comparable =====");
    List<Entry<Integer, String>> list = new ArrayList<>(map.entrySet());

    Collections.shuffle(list);
    System.out.println("Entradas antes de ordenar: " +list);

    list.sort(Entry.comparingByKey());
    System.out.println("Entradas após ordenar: " +list);

    System.out.println("\n===== Ordenando Map por chave Comparable com TreeMap =====");
    Map<Integer, String> sortedMap = new TreeMap<>(map);
    System.out.println("Elementos no TreeMap: " + sortedMap);

    System.out.println("\n===== Ordenando Map por valor Comparable =====");
    Collections.shuffle(list);
    System.out.println("Entradas antes da ordenação: " +list);

    list.sort(Entry.comparingByValue());
    System.out.println("Entradas após ordenar: " + list);
    Collections.sort(list, Entry.comparingByValue());
    System.out.println("Entradas após ordenar: " + list);

    // Java 9+
    // Map<Integer, String> map2 = Map.ofEntries(list.toArray(Entry[]::new));

  }
}