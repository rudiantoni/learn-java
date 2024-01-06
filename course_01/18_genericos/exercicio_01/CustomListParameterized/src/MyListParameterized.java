public interface MyListParameterized<T> extends Iterable<T> {
  void add(T e);
  void clear();
  boolean remove(T o);
  T[] toArray();
  int size();
  boolean contains(T o);
  boolean containsAll(MyListParameterized<T> c);
}
