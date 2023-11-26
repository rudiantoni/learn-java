# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Maps
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Conteúdo
  - [Hierarquia de Map](#hierarquia-de-map)
  - [Visão geral das implementações de Map](#visão-geral-das-implementações-de-map)
  - [Interface SortedMap](#interface-sortedmap)
  - [Interface NavigableMap](#interface-navigablemap)
  - [Dictionary](#dictionary)
  - [Hashtable VS HashMap](#hashtable-vs-hashmap)
  - [Tipo Entry](#tipo-entry)

### Hierarquia de Map
[[Topo]](#)<br />

A interface Map em Java é parte do Java Collections Framework e representa uma estrutura de dados que mapeia chaves para valores.

Um Map não pode conter chaves duplicadas e cada chave pode mapear para no máximo um valor.

Aqui está a hierarquia da interface Map:

#### Interface Map

É a interface base na hierarquia de mapas. Define operações básicas como put, get, remove, e métodos para consultas de tamanho, verificação de vazios, e visualizações de coleções para chaves, valores e entradas.

**Classes e Interfaces que estendem Map**
- **AbstractMap**: Uma classe abstrata que implementa a maior parte da interface Map.
- **HashMap**: Uma implementação de Map baseada em tabela hash. Permite valores nulos e não é sincronizada.
- **LinkedHashMap**: Uma subclasse de HashMap que mantém uma lista de entradas na ordem em que foram inseridas ou na ordem em que foram acessadas pela última vez.
**Hashtable**: Uma implementação de Map sincronizada, similar a HashMap, mas não permite chaves ou valores nulos.
**TreeMap**: Uma implementação de Map baseada em árvore vermelho-preta. As chaves são ordenadas de acordo com sua ordem natural ou por um Comparator fornecido.
**WeakHashMap**: Uma implementação de Map com chaves que são referências fracas. Uma entrada em um WeakHashMap é removida automaticamente quando sua chave não é mais utilizada.
**EnumMap**: Uma implementação especializada de Map para usar com chaves de tipo enum.

**Interfaces relacionadas**
- **SortedMap**: Uma interface que estende Map e garante que as chaves sejam mantidas em ordem ascendente.
- **NavigableMap**: Uma extensão de SortedMap que fornece métodos de navegação para retornar o maior ou menor chave de acordo com um critério de busca.
- **ConcurrentMap**: Uma subinterface de Map que define operações que esperam ser usadas em um contexto multithread, como putIfAbsent, remove, e replace.


**Implementações de SortedMap e NavigableMap**
- **TreeMap**: Implementa tanto SortedMap quanto NavigableMap.

**Implementações de ConcurrentMap**:
**ConcurrentHashMap**: Uma implementação de ConcurrentMap que permite operações concorrentes de alta performance.

#### Métodos de Map

A interface Map e suas implementações são usadas amplamente em Java para armazenar pares de chaves/valores de uma maneira que permite a rápida recuperação de valores com base em chaves.

A interface Map em Java define um contrato para objetos que mapeiam chaves para valores. Nenhuma chave pode ser duplicada, e cada chave mapeia para no máximo um valor. Aqui estão os métodos principais definidos na interface Map:

**Operações básicas**
- **put(K key, V value)**: Associa um valor específico com uma chave específica no mapa.
- **get(Object key)**: Retorna o valor ao qual a chave especificada está mapeada, ou null se o mapa não contiver a chave.
- **remove(Object key)**: Remove a associação da chave, se estiver presente, e retorna o valor ao qual a chave estava anteriormente mapeada.
- **containsKey(Object key)**: Retorna true se o mapa contém uma associação para a chave especificada.
- **containsValue(Object value)**: Retorna true se o mapa mapeia uma ou mais chaves para o valor especificado.
- **size()**: Retorna o número de pares chave-valor no mapa.
- **isEmpty()**: Retorna true se o mapa não contiver associações chave-valor.

**Operações em massa**
- **putAll(Map<? extends K,? extends V> m)**: Copia todas as associações do mapa especificado para este mapa.
- **clear()**: Remove todas as associações do mapa.

**Visualizações de coleção**
- **keySet()**: Retorna um conjunto de todas as chaves contidas neste mapa.
- **values()**: Retorna uma coleção de todos os valores contidos no mapa.
- **entrySet()**: Retorna um conjunto de todas as associações chave-valor contidas no mapa.

**Métodos padrão (Java 8 em diante)**
- **getOrDefault(Object key, V defaultValue)**: Retorna o valor ao qual a chave especificada está mapeada, ou defaultValue se o mapa não contém a chave.
- **forEach(BiConsumer<? super K,? super V> action)**: Realiza a ação especificada para cada entrada no mapa até que todas as entradas tenham sido processadas ou a ação lance uma exceção.
- **replaceAll(BiFunction<? super K,? super V,? extends V> function)**: Substitui cada entrada no mapa com o resultado da aplicação da função na entrada.
- **putIfAbsent(K key, V value)**: Se a chave especificada ainda não está associada a um valor (ou está mapeada para null), associa-a ao valor especificado.
- **remove(Object key, Object value)**: Remove a entrada para a chave e valor especificados apenas se atualmente mapeados para essa chave e valor.
- **replace(K key, V oldValue, V newValue)**: Substitui a entrada para a chave especificada apenas se atualmente mapeada para o valor especificado.
- **replace(K key, V value)**: Substitui a entrada para a chave especificada apenas se ela está atualmente mapeada para algum valor.
- **computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction)**: Se a chave especificada não está associada a um valor (ou está mapeada para null), tenta computar seu valor usando a função de mapeamento especificada e insere-o no mapa.
- **computeIfPresent(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)**: Se a chave especificada está associada a um valor (i.e., não null), tenta recomputar um novo mapeamento dado a chave e seu valor atual.
- **compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)**: Tenta computar um novo mapeamento dado a chave e seu valor atual (ou null se não houver valor atual).
- **merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)**: Se a chave especificada não está associada a um valor ou está associada a null, associa-a ao valor não nulo fornecido. Caso contrário, substitui o valor associado com o resultado da função de remapeamento.

Esses métodos fornecem um conjunto robusto de funcionalidades para manipular e acessar os dados armazenados em um Map. Cada implementação de Map (como HashMap, TreeMap, LinkedHashMap) fornece sua própria abordagem para armazenar e organizar esses pares de chaves e valores.

### Visão geral das implementações de Map
[[Topo]](#)<br />

As implementações da interface Map em Java são parte do Java Collections Framework e fornecem estruturas de dados para armazenar pares de chaves e valores.

Cada implementação tem características específicas que as tornam adequadas para diferentes casos de uso.

- **HashMap**
  - Armazena os pares chave-valor em uma tabela hash.
  - Oferece operações de inserção, remoção e busca de tempo constante médio (O(1)).
  - Não mantém a ordem dos elementos.
  - Permite uma chave nula e múltiplos valores nulos.
  - Não é sincronizada e, portanto, não é segura para uso em ambientes multithread sem sincronização externa.
- **LinkedHashMap**
  - Baseada em HashMap, mas também mantém uma lista duplamente encadeada das entradas.
  - Mantém a ordem de inserção dos elementos ou a ordem em que foram acessados pela última vez, dependendo do modo de construção.
  - Um pouco mais lenta que HashMap para inserção e remoção, mas mantém a ordem de inserção.
- **TreeMap**
  - Baseada em uma árvore vermelho-preta.
  - Mantém as chaves em ordem natural ou de acordo com um Comparator fornecido.
  - As operações de inserção, remoção e busca têm tempo logarítmico (O(log n)).
  - Não permite chaves nulas e é útil quando uma ordenação natural ou específica dos elementos é necessária.
- **Hashtable**
  - Similar a HashMap, mas é sincronizada.
  - Não permite chaves ou valores nulos.
  - Considerada obsoleta em comparação com ConcurrentHashMap, que oferece melhor escalabilidade em ambientes multithread.
- **WeakHashMap**
  - As chaves são mantidas como referências fracas, o que significa que se uma chave não é mais referenciada fora do WeakHashMap, ela pode ser coletada pelo coletor de lixo.
  - Útil em cenários específicos onde a vida útil das chaves deve ser determinada pela disponibilidade externa.
- **EnumMap**
  - Uma implementação especializada e eficiente de Map para chaves do tipo enum.
  - Todas as chaves devem ser do mesmo tipo enum.
  - Internamente, usa um array para armazenar valores, o que torna as operações muito eficientes.
- **ConcurrentHashMap**
  - Uma implementação de ConcurrentMap que permite acesso e atualizações concorrentes sem bloquear toda a coleção.
  - Oferece melhor escalabilidade do que Hashtable em ambientes multithread.
  - Não permite chaves ou valores nulos.
 
Cada uma dessas implementações tem seus próprios usos ideais, baseados em fatores como a necessidade de ordenação, se o uso será em um ambiente multithread, e a frequência e tipo de operações de acesso e atualização. A escolha da implementação correta depende dos requisitos específicos do caso de uso em questão.

### Interface SortedMap
[[Topo]](#)<br />

A interface SortedMap em Java é uma subinterface da interface Map que fornece uma garantia de que as chaves serão mantidas em uma ordem ascendente, seja pela ordem natural das chaves ou por um Comparator fornecido no momento da criação do mapa. Ela faz parte do Java Collections Framework.

**Características e métodos principais da interface SortedMap**
- **Ordenação das chaves**: As chaves em um SortedMap são ordenadas automaticamente. Isso é especialmente útil quando você precisa de um mapa cujas chaves são extraídas de maneira ordenada.
- **Primeiro e último elementos**
  - **firstKey()**: Retorna a menor chave presente no mapa.
  - **lastKey()**: Retorna a maior chave presente no mapa.
- **Visualizações de submapas**
  - **subMap(K fromKey, K toKey)**: Retorna uma visualização do mapa cujas chaves vão de fromKey inclusivo até toKey exclusivo.
  - **headMap(K toKey)**: Retorna uma visualização do mapa cujas chaves são menores que toKey.
  - **tailMap(K fromKey)**: Retorna uma visualização do mapa cujas chaves são maiores ou iguais a fromKey.
- **Conjuntos de chaves e coleções de valores**
  - **keySet()**: Retorna um conjunto de todas as chaves contidas no mapa.
  - **values()**: Retorna uma coleção de todos os valores contidos no mapa.
  - **entrySet()**: Retorna um conjunto de todas as associações chave-valor contidas no mapa.
- **Comparador**
  - **comparator()**: Retorna o comparador usado para ordenar as chaves neste mapa, ou null se este mapa usa a ordem natural das chaves.
- **Implementações**
  - TreeMap é a implementação mais comum de SortedMap. Ela usa uma árvore vermelho-preta internamente para manter as chaves ordenadas.

A interface SortedMap é ideal para aplicações onde a ordem das chaves é importante, como dicionários, mapas ordenados por data, e qualquer outro cenário onde a ordem natural ou uma ordem específica de chaves é necessária. Ao contrário de um HashMap padrão, um SortedMap mantém suas chaves em ordem, permitindo consultas eficientes baseadas em ordem de chave.

### Interface NavigableMap
[[Topo]](#)<br />

A interface NavigableMap em Java é uma subinterface da interface SortedMap e faz parte do Java Collections Framework. Ela estende a funcionalidade do SortedMap ao fornecer métodos convenientes para navegar no mapa, permitindo buscar chaves ou entradas de maneiras mais específicas, particularmente em relação a chaves mais próximas de um determinado ponto de referência.

**Características e métodos principais da interface NavigableMap**
- **Métodos de navegação**
  - **lowerEntry(K key)** e **lowerKey(K key)**: Retorna uma entrada ou chave com a maior chave estritamente menor que a chave especificada, ou null se não existir tal chave.
  - **floorEntry(K key)** e **floorKey(K key)**: Retorna uma entrada ou chave com a maior chave menor ou igual à chave especificada.
  - **ceilingEntry(K key)** e **ceilingKey(K key)**: Retorna uma entrada ou chave com a menor chave maior ou igual à chave especificada.
  - **higherEntry(K key)** e **higherKey(K key)**: Retorna uma entrada ou chave com a menor chave estritamente maior que a chave especificada.
- **Recuperando e removendo primeiro e último elementos**
  - **pollFirstEntry()** e **pollLastEntry()**: Remove e retorna a primeira ou a última entrada do mapa, respectivamente.
- **Visualizações reversas**
  - **descendingMap()**: Retorna um NavigableMap na ordem inversa.
  - **navigableKeySet()**: Retorna um NavigableSet das chaves contidas no mapa.
  - **descendingKeySet()**: Retorna um NavigableSet das chaves contidas no mapa, em ordem decrescente.
- **Submapas com limites**
  - **subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive)**: Retorna uma visualização do mapa cujas chaves vão de fromKey até toKey, podendo incluir ou não as chaves de limite.
  - **headMap(K toKey, boolean inclusive)**: Retorna uma visualização do mapa cujas chaves são menores que (ou igual a, se inclusive for true) toKey.
  - **tailMap(K fromKey, boolean inclusive)**: Retorna uma visualização do mapa cujas chaves são maiores que (ou igual a, se inclusive for true) fromKey.
- **Implementações**
  - TreeMap é a implementação mais comum de NavigableMap. Ela fornece uma implementação eficiente e ordenada de acordo com a ordem natural das chaves ou um Comparator fornecido.

A interface NavigableMap é útil em cenários onde é necessário não apenas manter as chaves ordenadas, mas também realizar buscas detalhadas e navegação dentro do mapa, como encontrar chaves mais próximas de um determinado valor, navegar em ordem reversa, ou trabalhar com subconjuntos de um mapa com base em limites de chave.

### Dictionary
[[Topo]](#)<br />

A classe Dictionary em Java é uma classe abstrata que representa uma estrutura de dados na forma de um dicionário (mapa) de chaves para valores.

No entanto, é importante notar que a partir do Java 2 (lançado em 1998 como parte do JDK 1.2), a classe Dictionary foi considerada obsoleta ou ultrapassada em favor das interfaces e classes do Java Collections Framework, como Map, HashMap, Hashtable, entre outras.

**Principais características da classe Dictionary**
- **Estrutura de dados de mapeamento**: Similar a um mapa, Dictionary é uma estrutura que armazena pares de chaves e valores. Cada chave é associada a um valor específico.
- **Métodos abstratos**
  - **`Enumeration<K>` keys()**: Retorna uma enumeração das chaves do dicionário.
  - **`Enumeration<V>` elements()**: Retorna uma enumeração dos valores do dicionário.
  - **V get(Object key)**: Retorna o valor associado a uma chave específica.
  - **boolean isEmpty()**: Verifica se o dicionário está vazio.
  - **V put(K key, V value)**: Insere um par chave-valor no dicionário.
  - **V remove(Object key)**: Remove a entrada para uma chave específica.
  - **int size()**: Retorna o número de entradas no dicionário.
- **Obsolescência**
  - Dictionary é considerada obsoleta e não é recomendada para uso em código novo. As interfaces e classes do Java Collections Framework, como Map e HashMap, oferecem funcionalidades mais ricas e são recomendadas em seu lugar.
  - A principal razão para a obsolescência de Dictionary é que ela não é parte do Java Collections Framework e, portanto, não possui as vantagens de interoperabilidade e padronização desse framework.
- **Subclasses**:
  - Hashtable é uma das subclasses concretas mais conhecidas de Dictionary. No entanto, Hashtable também foi em grande parte substituída por HashMap, que é uma parte do Java Collections Framework.

Em resumo, enquanto a classe Dictionary faz parte da biblioteca padrão do Java, seu uso é desencorajado em favor das implementações modernas de mapas fornecidas pelo Java Collections Framework. Estas implementações mais recentes oferecem uma maior flexibilidade, um melhor desempenho e uma integração mais fácil com outras coleções e estruturas de dados em Java.

### Hashtable VS HashMap
[[Topo]](#)<br />

Hashtable e HashMap são duas implementações comuns da interface Map em Java, mas com algumas diferenças significativas em seu funcionamento e uso.

#### Sincronização e segurança de threads

- **Hashtable**
  - É thread-safe. Todas as operações de modificação (como put, remove) são sincronizadas.
  - Devido à sincronização, é menos eficiente em ambientes single-threaded, pois o overhead da sincronização é desnecessário.
- **HashMap**
  - Não é thread-safe. Não há sincronização nas operações de modificação.
  - Mais eficiente em ambientes onde não há necessidade de preocupação com a concorrência de múltiplos threads.

#### Performance

- **Hashtable**
  - Geralmente é mais lento devido à sincronização de suas operações.
- **HashMap**
  - Tende a ser mais rápido em operações, pois não tem o overhead da sincronização.

#### Permissão para chaves e valores nulos
- **Hashtable**
  - Não permite chaves ou valores nulos.
- **HashMap**
  - Permite uma chave nula e vários valores nulos.

#### Iteração de Elementos

- **Hashtable**
  - Possui iterador, mas o iterador de Hashtable é considerado fail-safe. Se o Hashtable for modificado depois que o iterador for criado, exceto através do próprio iterador, o iterador lançará uma ConcurrentModificationException.
- **HashMap**
  - Possui iterador, mas o iterador de HashMap não é fail-safe e pode refletir as mudanças no mapa após a criação do iterador.

#### Herança

- **Hashtable**
  - É uma antiga classe que estende Dictionary, uma classe que foi substituída pelo Java Collections Framework.
- **HashMap**
  - É uma parte integrante do Java Collections Framework e implementa a interface Map.

#### Uso Recomendado

- **Hashtable**
  - Seu uso é desencorajado em código novo. Classes como ConcurrentHashMap são preferidas para programação concorrente.
- **HashMap**
  - É recomendado para uso em situações não concorrentes. Para ambientes multithread, deve-se considerar usar ConcurrentHashMap ou sincronizar explicitamente o HashMap.

Em resumo, HashMap é geralmente preferido devido à sua performance e flexibilidade. Hashtable pode ser útil em cenários legados onde a sincronização é desejada e a substituição por alternativas mais modernas, como ConcurrentHashMap, não é viável.

### Tipo Entry
[[Topo]](#)<br />

Dentro do contexto dos mapas (Map) em Java, o tipo Entry é uma interface aninhada dentro da interface Map. `Map.Entry<K,V>` representa um par chave-valor do mapa. Essa interface é crucial para trabalhar com mapas de maneira detalhada, pois cada objeto Entry contém uma chave única e o valor correspondente.

#### Principais características e métodos da interface `Map.Entry<K,V>`:

- **Chave e valor**: Cada Entry contém uma chave única e um valor associado a essa chave. Em um Map, todas as chaves são únicas, mas os valores podem se repetir.
- **Métodos mportantes**
  - **getKey()**: Retorna a chave correspondente ao Entry.
  - **getValue()**: Retorna o valor associado à chave no Entry.
  - **setValue(V value)**: Substitui o valor atual associado à chave por um novo valor. Retorna o valor antigo.
- **Uso em Iterações**: A interface Map.Entry é frequentemente usada em iterações sobre um Map. Quando você itera sobre um Map, pode acessar os objetos Entry para trabalhar com as chaves e valores individualmente.

Por exemplo, você pode usar o método entrySet() de um Map para obter um conjunto (Set) de Entry e então iterar sobre esse conjunto.
Exemplo de Código:

```java
Map<String, Integer> map = new HashMap<>();
map.put("chave1", 1);
map.put("chave2", 2);

for (Map.Entry<String, Integer> entry : map.entrySet()) {
  String key = entry.getKey();
  Integer value = entry.getValue();
  // Processa a chave e o valor
}
```
#### Uso com Streams (Java 8 em diante)

Com Java 8, é possível usar Stream e operações de fluxo sobre conjuntos de entradas, o que pode simplificar operações como filtragem, mapeamento e agregação de dados de um Map.

A interface Map.Entry é uma parte fundamental para trabalhar com mapas em Java, fornecendo uma maneira de acessar e modificar individualmente cada par chave-valor em um Map.
