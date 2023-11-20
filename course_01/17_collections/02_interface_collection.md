# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Interface Collection
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Conteúdo
  - [Visão geral](#visão-geral)
  - [Métodos abstratos](#métodos-abstratos)
  - [Métodos padrão](#métodos-padrão)

### Visão geral
[[Topo]](#)<br />

A interface Collection é uma das mais fundamentais do Java Collection Framework, servindo como a raiz para a maioria das estruturas de dados de coleção. Aqui está uma visão geral desta interface:

**Características Básicas**

- **Interface Raiz**: Collection é a interface raiz na hierarquia de coleções, com várias subinterfaces e classes implementando suas funcionalidades.
- **Genérica**: `Collection<E>` usa generics, permitindo definir o tipo de objetos que a coleção pode armazenar, aumentando a segurança e a clareza do tipo.

**Principais Subinterfaces**

- **List**: Representa uma coleção ordenada (também conhecida como sequência). As listas podem conter elementos duplicados e são capazes de manter a ordem de inserção dos elementos. Exemplos: ArrayList, LinkedList.
- Set: Representa uma coleção que não permite elementos duplicados. É ótima para quando se quer evitar a repetição de elementos. Exemplos: HashSet, LinkedHashSet, TreeSet.
- **Queue**: Representa uma coleção usada para armazenar elementos antes do processamento. Tipicamente, elementos são processados na ordem FIFO (First-In-First-Out), mas outras ordens de processamento também são possíveis. Exemplo: PriorityQueue.
- **Deque**: Uma extensão da Queue que suporta inserção, remoção e inspeção de elementos em ambos os finais da fila.

**Java 8 - Melhorias e Recursos Adicionais**

Com o Java 8, algumas adições importantes foram feitas ao Collection Framework:

- **Streams**: Introdução das Streams, que permitem operações de estilo funcional em coleções, como mapeamento, filtragem e redução.
- **forEach(Consumer<? super T> action)**: Permite iteração simplificada e mais expressiva usando lambdas e métodos de referência.
- **removeIf(Predicate<? super E> filter)**: Remove todos os elementos da coleção que satisfazem o predicado fornecido.

A interface Collection e suas subinterfaces são componentes centrais na manipulação de conjuntos de dados no Java, oferecendo uma estrutura flexível e poderosa para armazenar e processar informações de maneira eficiente.

### Métodos abstratos
[[Topo]](#)<br />

A interface Collection no Java define um conjunto de métodos abstratos que devem ser implementados pelas classes que a implementam. Estes métodos fornecem as funcionalidades básicas que são comuns a todas as coleções, como adicionar, remover e iterar sobre elementos. Aqui estão os métodos abstratos essenciais da interface Collection:

- **add(E e)**: Adiciona o elemento especificado à coleção. Retorna true se a coleção mudou como resultado da chamada.
- **addAll(Collection<? extends E> c)**: Adiciona todos os elementos da coleção especificada à coleção atual. Retorna true se a coleção atual foi modificada como resultado da operação.
- **clear()**: Remove todos os elementos da coleção. A coleção estará vazia após este método ser executado.
- **contains(Object o)**: Retorna true se a coleção contém o elemento especificado.
- **containsAll(Collection<?> c)**: Verifica se a coleção contém todos os elementos da coleção especificada.
- **equals(Object o)**: Compara o objeto especificado com a coleção para igualdade.
- **hashCode()**: Retorna o hash code para a coleção.
- **isEmpty()**: Verifica se a coleção está vazia. Retorna true se a coleção não contiver elementos.
- **iterator()**: Retorna um iterador sobre os elementos na coleção. O iterador fornece métodos para percorrer a coleção.
- **remove(Object o)**: Remove uma única instância do elemento especificado da coleção, se estiver presente. Retorna true se o elemento foi removido.
- **removeAll(Collection<?> c)**: Remove todos os elementos desta coleção que também estão contidos na coleção especificada. Retorna true se a coleção foi modificada como resultado desta operação.
- **retainAll(Collection<?> c)**: Retém apenas os elementos nesta coleção que estão contidos na coleção especificada. Em outras palavras, remove da coleção todos os seus elementos que não estão contidos na coleção especificada.
- **size()**: Retorna o número de elementos na coleção.
- **toArray()**: Retorna um array contendo todos os elementos na coleção.
- **toArray(T[] a)**: Retorna um array contendo todos os elementos na coleção; o tipo de tempo de execução do array retornado é o do array especificado.

Esses métodos formam a base para todas as operações comuns que você pode querer realizar em uma coleção, independentemente de seu tipo específico (como List, Set, Queue, etc.). A implementação desses métodos varia dependendo da classe concreta que implementa a interface Collection.

### Métodos padrão
[[Topo]](#)<br />

No Java 8, a interface Collection foi enriquecida com a introdução de métodos padrão. Estes são métodos definidos na interface com uma implementação padrão, permitindo que as classes que implementam a interface Collection herdem esses métodos sem a necessidade de uma implementação adicional. Esses métodos padrão ajudam a melhorar a funcionalidade das coleções sem quebrar a compatibilidade com as implementações existentes. Aqui estão alguns dos métodos padrão importantes adicionados à interface Collection no Java 8:

- **forEach(Consumer<? super T> action)**: Executa uma ação para cada elemento da coleção. Este método aproveita as expressões lambda introduzidas no Java 8, permitindo operações mais expressivas e concisas.
- **removeIf(Predicate<? super E> filter)**: Remove todos os elementos da coleção que satisfazem a condição especificada pelo predicado. Isso é útil para filtrar coleções sem a necessidade de iteração explícita.
- **spliterator()**: Fornece um Spliterator sobre os elementos da coleção. Os Spliterators são usados para fornecer uma capacidade de iteração e divisão, que são especialmente úteis para operações paralelas usando o framework de Streams.
- **stream()**: Retorna um stream sequencial com esta coleção como sua fonte. Isso facilita a realização de operações de pipeline, como transformações e agregações, em coleções de maneira declarativa.
- **parallelStream()**: Similar ao método stream(), mas retorna um stream paralelo. Streams paralelos podem dividir o dataset e processar os elementos simultaneamente, aproveitando os recursos de multithreading.

Estes métodos padrão adicionam uma grande flexibilidade e poder às coleções em Java, permitindo uma manipulação mais fácil e eficiente dos dados com menos código e de maneira mais funcional. Eles são particularmente úteis para trabalhar com grandes conjuntos de dados e para operações que podem se beneficiar do processamento paralelo.
