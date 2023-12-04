# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Implementações de Set e a classe Collections
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [13_arquivos](./13_arquivos/)
- Projetos
  - [Projeto 1](./13_arquivos/proj_01/) [(iniciado em)](#classe-hashset)
- Conteúdo
  - [Hierarquia da interface Set](#hierarquia-da-interface-set)
  - [Classe HashSet](#classe-hashset)
  - [Classe LinkedHashSet](#classe-linkedhashset)
  - [Classe TreeSet](#classe-treeset)
  - [Implementações thread-safe de Set](#implementações-thread-safe-de-set)
  - [A classe EnumSet](#a-classe-enumset)
  - [A classe Collections](#a-classe-collections)
  - [Encapsuladores unmodifiable e syncronized](#encapsuladores-unmodifiable-e-syncronized)

### Hierarquia da interface Set
[[Topo]](#)<br />

A hierarquia da interface Set faz parte do Java Collections Framework e é projetada para representar uma coleção de elementos únicos, ou seja, sem duplicatas.

Em resumo, a hierarquia de Set no Java Collections Framework oferece várias implementações para diferentes necessidades, seja a necessidade de manter uma ordem específica, eficiência em operações de acesso, ou a manipulação de conjuntos ordenados.

#### Interface Set

- É a interface de nível superior na hierarquia Set.
- Define as operações básicas para trabalhar com conjuntos, como adicionar, remover, e verificar a existência de elementos.
- Não permite elementos duplicados.

#### Implementações da interface Set

- **HashSet**
  - Baseado em tabela hash.
  - Oferece operações de inserção, remoção e busca em tempo constante (O(1)) na média.
  - Não mantém os elementos em nenhuma ordem específica.
- **LinkedHashSet**
  - Extensão de HashSet, com uma lista encadeada através dos elementos.
  - Mantém a ordem de inserção dos elementos.
  - Um pouco mais lenta que HashSet para operações de adição e remoção devido à manutenção da ordem dos elementos.
- **TreeSet**
  - Implementa NavigableSet, que é uma subinterface de SortedSet.
  - Baseado em árvore vermelho-preto.
  - Mantém os elementos ordenados de acordo com a ordem natural ou um Comparator fornecido.
  - As operações de busca, inserção e remoção têm tempo de execução logarítmico (O(log n)).

#### Subinterfaces da interface Set

- **SortedSet**
  - Estende Set e define o comportamento de um conjunto que mantém seus elementos em uma ordem de classificação.
  - Fornece métodos adicionais para trabalhar com subconjuntos e elementos de extremidade.
- **NavigableSet**
  - Estende SortedSet.
  - Fornece métodos para navegação precisa, como encontrar o elemento mais próximo maior ou menor que um dado valor.

#### Uso e seleção

A escolha de qual implementação de Set usar depende dos requisitos específicos da aplicação:
- Se a ordem de inserção ou a velocidade de acesso é importante, LinkedHashSet pode ser a escolha certa.
- Para uma coleção ordenada com buscas eficientes, TreeSet é apropriado.
- Para a máxima eficiência em operações básicas sem preocupação com a ordem, HashSet é geralmente o melhor.

### Classe HashSet
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./13_arquivos/proj_01/)

O HashSet em Java é uma implementação da interface Set que usa uma tabela hash para armazenar seus elementos.

O HashSet é uma escolha eficiente para conjuntos de dados onde a identificação rápida de duplicatas, a pesquisa de elementos e a inserção e remoção de elementos são importantes, e onde a ordem de armazenamento não é uma preocupação.

Ele é parte do Java Collections Framework e está localizado no pacote java.util. A seguir estão algumas características e detalhes importantes sobre o HashSet.

#### Características

- **Armazenamento único**: Como uma implementação de Set, o HashSet não permite elementos duplicados. Cada elemento deve ser único.
- **Baseado em HashMap**: Internamente, HashSet é implementado usando um HashMap. Ele armazena os elementos como chaves do HashMap e usa um objeto dummy como valor para todas as entradas.
- **Ordem dos elementos**: O HashSet não garante a manutenção da ordem dos elementos. Os elementos são armazenados com base no seu hash, o que significa que a ordem de iteração pode variar.
- - **Desempenho**: Oferece um desempenho constante para as operações básicas (adicionar, remover, e verificar se um elemento existe), assumindo que a função hash dispersa os elementos adequadamente entre os baldes. Em termos de complexidade de tempo, estas operações são O(1) na média.
- **Elementos nulos**: HashSet permite a inserção de um elemento nulo.
- **Não sincronizado**: Por padrão, HashSet não é sincronizado (não é thread-safe). Se um HashSet thread-safe for necessário, deve-se sincronizá-lo externamente ou usar Collections.synchronizedSet(new HashSet(...)).
- **Inicialização e capacidade**: Ao criar um HashSet, você pode especificar sua capacidade inicial e fator de carga. A capacidade é o número de baldes na tabela hash, e o fator de carga é uma medida de quão cheia a tabela hash pode estar antes de sua capacidade ser automaticamente aumentada.
- **Iteração**: A velocidade de iteração pelo HashSet depende do número de baldes e do número de entradas no HashSet.

#### Usos comuns

HashSet é frequentemente usado em aplicações onde a presença única de elementos é importante, e a ordem dos elementos não é relevante.

### Classe LinkedHashSet
[[Topo]](#)<br />

O LinkedHashSet é uma implementação híbrida da interface Set que combina as características de HashSet e LinkedList. Ele faz parte do Java Collections Framework e está localizado no pacote java.util.

O LinkedHashSet é uma boa escolha quando é necessário um compromisso entre a garantia de elementos únicos, o desempenho rápido de operações de conjunto e a manutenção da ordem de inserção dos elementos.

A seguir alguns pontos chave sobre o LinkedHashSet.

#### Características

- **Ordem de inserção**: O principal recurso do LinkedHashSet é que ele mantém a ordem de inserção dos elementos. Quando você itera sobre um LinkedHashSet, os elementos serão retornados na ordem em que foram inseridos no conjunto.
- **Baseado em HashMap e LinkedList**: Internamente, o LinkedHashSet é implementado como uma tabela hash com uma lista encadeada que percorre os elementos. Ele usa um HashMap para armazenar elementos e uma lista encadeada para manter a ordem de inserção.
- **Desempenho**: Assim como o HashSet, o LinkedHashSet oferece um desempenho constante para as operações básicas (adicionar, remover, e verificar se um elemento existe), assumindo que a função hash dispersa os elementos adequadamente entre os baldes. Estas operações têm uma complexidade de tempo de O(1) na média.
- **Sem duplicatas**: Como uma implementação do Set, o LinkedHashSet não permite elementos duplicados.
- **Permite elementos nulos**: Assim como HashSet, o LinkedHashSet permite a inserção de um elemento nulo.
- **Não sincronizado**: Por padrão, LinkedHashSet não é sincronizado (não é thread-safe). Se um LinkedHashSet thread-safe for necessário, deve-se sincronizá-lo externamente ou usar Collections.synchronizedSet(new LinkedHashSet(...)).
- **Inicialização e ccapacidade**: Assim como o HashSet, você pode especificar a capacidade inicial e o fator de carga ao criar um LinkedHashSet.
- **Iteração**: A iteração sobre um LinkedHashSet é ligeiramente mais lenta do que sobre um HashSet devido à sobreposição adicional da lista encadeada, mas ainda é eficiente.

#### Usos comuns

LinkedHashSet é útil em situações onde é importante manter a ordem de inserção dos elementos, mas também são necessárias as operações rápidas de acesso e pesquisa que uma tabela hash oferece.

### Classe TreeSet
[[Topo]](#)<br />

O TreeSet em Java é uma implementação da interface Set que usa uma árvore para armazenar seus elementos. Ele faz parte do Java Collections Framework e está localizado no pacote java.util.

O TreeSet é uma escolha eficiente para conjuntos de dados onde a identificação rápida de duplicatas, a busca de elementos e a inserção e remoção de elementos são importantes, e onde a ordem dos elementos é uma preocupação chave.

O TreeSet tem várias características importantes.

#### Ordenação dos elementos

No TreeSet, os elementos são armazenados de forma ordenada. A ordem pode ser a ordem natural dos elementos (se eles implementam a interface Comparable) ou pode ser definida por um Comparator fornecido no momento da criação do TreeSet.

#### Baseado em TreeMap

Internamente, o TreeSet é implementado usando um TreeMap. No entanto, ele armazena apenas as chaves no TreeMap e usa um valor constante para todos os elementos.

#### Performance

As operações de adição, remoção e busca têm um tempo de execução logarítmico, O(log n), devido à estrutura de árvore.

#### Elementos únicos

Como uma implementação de Set, o TreeSet não permite elementos duplicados. Tentar adicionar um elemento duplicado não terá efeito.

#### Elementos nulos

Por padrão, um TreeSet não permite elementos nulos. No entanto, se um Comparator personalizado que aceita nulos for fornecido, então o TreeSet pode conter elementos nulos.

#### Não sincronizado

Um TreeSet não é sincronizado, o que significa que não é thread-safe por padrão. Se um TreeSet thread-safe for necessário, deve-se sincronizá-lo manualmente usando Collections.synchronizedSortedSet(new TreeSet(...)).

#### Subconjuntos

O TreeSet oferece métodos convenientes para obter subconjuntos de um conjunto, como headSet, tailSet e subSet.

#### Usos comuns

O TreeSet é comumente usado quando é necessário manter um conjunto ordenado, como em sistemas que necessitam de busca rápida com chaves ordenadas, ordenação de elementos ou intervalos de chaves, como agendas, índices e algoritmos de roteamento.

### Implementações thread-safe de Set
[[Topo]](#)<br />

Em Java, se você precisa de uma implementação thread-safe de um Set, existem várias opções disponíveis, cada uma adequada para diferentes cenários de uso.

Ao escolher a implementação apropriada, considere fatores como a frequência de operações de leitura versus escrita, a necessidade de ordenação dos elementos e o desempenho geral esperado em um ambiente multithread. Cada uma dessas implementações oferece um equilíbrio diferente entre a garantia de segurança em threads e eficiência em termos de desempenho e uso de memória.

A seguir algumas das implementações thread-safe de Set..

#### `Collections.synchronizedSet(Set<T> s)`

- Esta é uma maneira simples de tornar qualquer conjunto existente thread-safe.
- Ela retorna uma versão sincronizada do conjunto especificado.
- Cada método é sincronizado, garantindo a segurança em ambientes multithread.
- Exemplo: `Set<T> safeSet = Collections.synchronizedSet(new HashSet<T>());`

#### ConcurrentSkipListSet
- Esta é uma implementação thread-safe e escalável de SortedSet.
- É baseada em ConcurrentSkipListMap e oferece operações concorrentes sem bloqueio.
- Mantém os elementos ordenados e é particularmente útil em programas que requerem um conjunto ordenado com acesso concorrente.
- Oferece operações de inserção, remoção, e acesso em tempo logarítmico.

#### CopyOnWriteArraySet

- Baseado em CopyOnWriteArrayList.
- É muito eficiente se você tem um conjunto que será frequentemente lido, mas raramente modificado, pois cada mutação resulta em uma cópia fresca do conjunto subjacente.
- Devido à sua natureza de cópia na escrita, a iteração não requer sincronização e não lança ConcurrentModificationException.

#### `Collections.newSetFromMap(Map<T, Boolean> map)`

- Esta é uma técnica mais genérica que permite criar um conjunto thread-safe a partir de qualquer mapa thread-safe.
- Por exemplo, você pode usar um ConcurrentHashMap para criar um conjunto: `Set<T> concurrentSet = Collections.newSetFromMap(new ConcurrentHashMap<T, Boolean>());`

### A classe EnumSet
[[Topo]](#)<br />

EnumSet em Java é uma implementação especializada da interface Set para uso com tipos enum. Esta classe é uma das implementações de conjuntos mais eficientes disponíveis no Java e é projetada especificamente para uso com chaves enum.

EnumSet é uma escolha ideal para conjuntos quando você está lidando exclusivamente com enums, oferecendo altíssima performance e eficiência de memória. É amplamente utilizado em aplicações Java onde é necessário agrupar, comparar ou realizar operações com conjuntos de enums.

A seguir algumas características e detalhes importantes sobre o EnumSet.

#### Especificamente para enums

O EnumSet é projetado exclusivamente para elementos do tipo enum. Ele usa uma representação de bit vector (ou bitfields) internamente, o que o torna extremamente eficiente em termos de desempenho e uso de memória.

#### Performance

Devido à sua implementação interna usando bit vectors, operações como adicionar, remover, e verificar a presença de um item são extremamente rápidas. A complexidade destas operações é tipicamente O(1).

#### Elementos únicos e ordem

Como qualquer outro Set, o EnumSet não permite duplicatas. Ele mantém os elementos na ordem em que são declarados no tipo enum.

#### Métodos de fábrica

O EnumSet fornece métodos de fábrica estáticos convenientes para criar instâncias e outros:
- **EnumSet.allOf(EnumType.class)**: cria um conjunto contendo todos os elementos do tipo enum especificado.
- **EnumSet.noneOf(EnumType.class)**: cria um conjunto vazio do tipo enum especificado.
- **EnumSet.of(EnumType.E1, EnumType.E2, ...)**: cria um conjunto inicialmente contendo os elementos especificados.
- **EnumSet.range(EnumType.E1, EnumType.E2)** cria um conjunto contendo o intervalo dos elementos especificados.
- **EnumSet.complementOf(EnumSet s)** cria um conjunto com todos os elementos do tipo enum especificado que não estão no conjunto especificado.

#### Não sincronizado

EnumSet não é sincronizado. Se um conjunto enumerado thread-safe for necessário, deve-se sincronizá-lo externamente.

#### Iteração e modificação

A iteração sobre um EnumSet é significativamente mais rápida do que sobre um HashSet convencional. Além disso, a ordem de iteração é a ordem em que os elementos enum são declarados.

#### Uso limitado a enums

EnumSet não pode ser usado para armazenar objetos que não são do tipo enum. Tentar inserir um objeto não enum resultará em um erro de tempo de execução.

### A classe Collections
[[Topo]](#)<br />

A classe Collections em Java é uma parte do Java Collections Framework, fornecendo métodos estáticos utilitários para coleções — como listas, conjuntos e mapas. Localizada no pacote java.util, essa classe não pode ser instanciada, pois todos os seus métodos são estáticos.

A classe Collections é extremamente útil para manipular coleções de dados em Java, oferecendo uma variedade de métodos para realizar operações comuns de forma eficiente e concisa. Ela é frequentemente usada para simplificar tarefas de manipulação de coleções, como ordenação, busca, sincronização e transformação de coleções em imutáveis ou não modificáveis.

A seguir algumas das funcionalidades e características importantes da classe Collections.

#### Operações de ordenação e embaralhamento

- **`sort(List<T> list)`**: Ordena uma lista em ordem crescente.
- **`shuffle(List<?> list)`**: Embaralha aleatoriamente os elementos de uma lista.

#### Pesquisa e encontrar extremos

- **`binarySearch(List<? extends Comparable<? super T>> list, T key)`**: Realiza uma busca binária de um elemento em uma lista ordenada.
- **`max(Collection<? extends T> coll)`**: Retorna o maior elemento de uma coleção, conforme a ordem natural dos seus elementos.
- **`min(Collection<? extends T> coll)`**: Retorna o menor elemento de uma coleção.

#### Operações de inversão e substituição

- **`reverse(List<?> list)`**: Inverte a ordem dos elementos em uma lista.
- **`fill(List<? super T> list, T obj)`**: Substitui todos os elementos de uma lista por um elemento específico.
- **`copy(List<? super T> dest, List<? extends T> src)`**: Copia todos os elementos de uma lista origem para uma lista destino.
- **`replaceAll(List<T> list, T oldVal, T newVal)`**: Substitui todas as ocorrências de um valor específico em uma lista.

#### Operações para conjuntos e mapas

- **`singleton(T o), singletonList(T o), singletonMap(K key, V value)`**: Cria um conjunto, lista ou mapa imutável que contém apenas um elemento ou uma entrada.
- **`emptySet(), emptyList(), emptyMap()`**: Cria versões imutáveis e vazias de um conjunto, lista ou mapa.

#### Sincronização de coleções

- **`synchronizedCollection(Collection<T> c), synchronizedList(List<T> list), synchronizedSet(Set<T> s), synchronizedMap(Map<K,V> m)`**: Retorna versões sincronizadas (thread-safe) das coleções, listas, conjuntos e mapas.

#### Operações imutáveis e não modificáveis

- **`unmodifiableCollection(Collection<? extends T> c), unmodifiableList(List<? extends T> list), unmodifiableSet(Set<? extends T> s), unmodifiableMap(Map<? extends K, ? extends V> m)`**: Retorna versões não modificáveis das coleções, listas, conjuntos e mapas.

#### Operações de adição e checagem

- **`addAll(Collection<? super T> c, T... elements)`**: Adiciona todos os elementos especificados a uma coleção.
- **`disjoint(Collection<?> c1, Collection<?> c2)`**: Verifica se duas coleções são disjuntas (não têm elementos em comum).

### Encapsuladores unmodifiable e syncronized
[[Topo]](#)<br />

Em Java, os encapsuladores unmodifiable e synchronized da classe Collections são utilizados para modificar o comportamento de coleções existentes, oferecendo imutabilidade e sincronização, respectivamente.

Estes encapsuladores são importantes para garantir a segurança dos dados e a correta manipulação de coleções em diferentes contextos, como em ambientes multithread ou quando se quer prevenir a modificação de uma coleção.

Usar esses encapsuladores proporciona uma camada adicional de segurança e robustez ao trabalhar com coleções em Java, mas é crucial entender suas implicações e escolher o encapsulador adequado para cada situação.

Vamos explorar cada um deles em detalhes.

#### Encapsuladores unmodifiable

Os métodos unmodifiable da classe Collections fornecem uma visão imutável de uma coleção existente. Quando você encapsula uma coleção com um desses métodos, a coleção resultante não pode ser modificada, ou seja, nenhum elemento pode ser adicionado, removido ou alterado. Tentativas de modificar a coleção resultarão em uma UnsupportedOperationException.

Exemplos de métodos:
- `Collections.unmodifiableList(List<? extends T> list)`
- `Collections.unmodifiableSet(Set<? extends T> set)`
- `Collections.unmodifiableMap(Map<? extends K, ? extends V> map)`

Esses métodos são frequentemente usados para criar uma coleção "somente leitura" que protege os dados originais de alterações indesejadas, proporcionando segurança adicional em seu código.

#### Encapsuladores synchronized

Os métodos synchronized da classe Collections são usados para tornar as coleções thread-safe, ou seja, seguras para serem usadas por múltiplas threads simultaneamente sem causar inconsistências de dados.

Quando uma coleção é encapsulada com um desses métodos, todos os métodos da coleção são sincronizados. Isso significa que apenas uma thread pode acessar a coleção de cada vez, evitando condições de corrida e outros problemas de concorrência.

Exemplos de métodos:
- `Collections.synchronizedList(List<T> list)`
- `Collections.synchronizedSet(Set<T> set)`
- `Collections.synchronizedMap(Map<K,V> map)`

Esses métodos são úteis em situações onde você está trabalhando em um ambiente multithread e precisa garantir a consistência dos dados entre as threads. No entanto, é importante notar que, embora garantam a segurança da thread, podem ter um impacto no desempenho devido à sobrecarga da sincronização.

#### Considerações de uso

- **Imutabilidade vs. sincronização**: A escolha entre unmodifiable e synchronized depende do seu objetivo. Se você precisa garantir que uma coleção não seja modificada, use unmodifiable. Se você precisa de acesso seguro em um ambiente multithread, use synchronized.
- **Desempenho**: Ambos os encapsuladores podem ter impacto no desempenho. As coleções unmodifiable evitam a sobrecarga da sincronização, mas lançam exceções em tentativas de modificação. As coleções synchronized introduzem a sobrecarga da sincronização para cada operação de acesso.
