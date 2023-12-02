import java.util.LinkedHashMap;
import java.util.Map;

public class MyLinkedHashMap extends LinkedHashMap<Integer, String> {
  private int capacity = 3;

  @Override
  protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
    if (size() > this.capacity) {
      return true;
    }
    return false;
  }
}
