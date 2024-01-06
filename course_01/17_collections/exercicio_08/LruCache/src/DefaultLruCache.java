import java.util.LinkedHashMap;
import java.util.Map;

public class DefaultLruCache extends LinkedHashMap<Integer, Integer> implements LruCache {
  public int capacity;

  public DefaultLruCache() {
    super(16, 0.75f, true);
    this.capacity = 16;
  }
  public DefaultLruCache(int capacity) {
    super(capacity, 0.75f, true);
    this.capacity = capacity;
  }
  public DefaultLruCache(int capacity, float loadFactor) {
    super(capacity, loadFactor, true);
    this.capacity = capacity;
  }
  @Override
  public int get(int key) {
    return super.get(key);
  }

  @Override
  public void put(int key, int value) {
    super.put(key, value);
  }

  @Override
  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  @Override
  protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
    return super.size() > this.capacity;
  }
}
