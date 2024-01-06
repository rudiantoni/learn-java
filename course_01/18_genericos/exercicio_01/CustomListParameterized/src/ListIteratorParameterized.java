import java.util.Iterator;

public interface ListIteratorParameterized<T> extends Iterator<T> {
  boolean hasPrevious(); // retorna true se o list iterator tem mais elementos ao atravessar a lista na direção inversa
  T previous(); // retorna o elemento anterior na lista e move a posição do cursor para trás
  void set(T e); // substitui o último elemento retornado por next ou previous
  void remove(); // remove da lista o último elemento retornado por next ou previous
}
