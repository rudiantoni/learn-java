public interface LruCache {
  /**
   * @return o valor da chave se a chave existir
   * caso contrário retorna -1
   */
  int get(int key);

  /**
   * Atualize o valor da cheve se a chave existir,
   * Caso contrário, adicionar o par chave-valor no cache.
   * Se o número de chaves exceder a capacidade nesta operação,
   * remova a chave menos usada recentemente.
   */
  void put(int key, int value);


  /**
   * Define a capacidade máxima do cache
   */
  void setCapacity(int capacity);
}
