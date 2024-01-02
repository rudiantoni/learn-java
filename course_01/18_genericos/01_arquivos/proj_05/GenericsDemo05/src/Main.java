import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Integer> integers = new ArrayList<>();

    List list = new ArrayList();
    list = integers;
    list.add("some string");

    // Throws ClassCastException
    // java.lang.String cannot be cast to java.lang.Integer
    Integer integer = integers.get(0);
    System.out.println(integer);
  }
}