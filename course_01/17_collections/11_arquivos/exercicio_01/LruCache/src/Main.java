import java.util.LinkedHashMap;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    DefaultLruCache cache = new DefaultLruCache(3);
    cache.put(1, 10);
    System.out.println(cache);
    cache.put(2, 10);
    System.out.println(cache);
    cache.put(3, 10);
    System.out.println(cache);

    cache.get(1);
    System.out.println(cache);
    cache.get(2);
    System.out.println(cache);
    cache.put(4, 10);
    System.out.println(cache);
  }
}