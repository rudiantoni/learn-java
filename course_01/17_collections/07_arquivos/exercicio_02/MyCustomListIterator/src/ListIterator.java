import java.util.Iterator;

public interface ListIterator extends Iterator<Object> {
  boolean hasPrevious(); // retorna true se o list iterator tem mais elementos ao atravessar a lista na direção inversa
  Object previous(); // retorna o elemento anterior na lista e move a posição do cursor para trás
  void set(Object e); // substitui o último elemento retornado por next ou previous
  void remove(); // remove da lista o último elemento retornado por next ou previous
}
