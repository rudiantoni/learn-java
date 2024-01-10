# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## 17.3. Visão geral: Interface List, Set e Queue
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Conteúdo
  - [Interface List](#interface-list)
  - [Interface Set](#interface-set)
  - [Interface Queue](#interface-queue)
  - [Princípio FIFO (First In, First Out)](#princípio-fifo-first-in-first-out)

### Interface List
[[Topo]](#)<br />

A List é uma coleção ordenada (também conhecida como sequência). As listas podem conter elementos duplicados e mantêm a ordem de inserção dos elementos.

É ideal para casos em que é necessário acesso sequencial ou baseado em índice, como em listas de espera, pilhas de navegação, e assim por diante.

Cada elemento na lista tem um índice (posição na lista), começando do zero. Isso permite acesso posicional preciso e busca de elementos na lista.

Além dos métodos herdados da interface Collection, a List inclui métodos para manipulação baseada em índice (como get(int index), set(int index, E element), add(int index, E element) e remove(int index)).

Implementações Comuns: ArrayList, que é implementado como um array redimensionável, e LinkedList, que é implementada como uma lista encadeada.

### Interface Set
[[Topo]](#)<br />

Um Set é uma coleção que não permite elementos duplicados. Ele modela o conceito matemático de um conjunto.

A principal característica do Set é que ele impede a duplicação de elementos. Isso é útil para operações como a eliminação de duplicatas, teste de pertencimento, e operações de conjuntos como união, interseção, diferença, etc.

Usado quando é importante manter um conjunto único de elementos e a ordem de inserção não é uma preocupação (exceto em LinkedHashSet).

Implementações Comuns: HashSet (baseado em tabela de hash), LinkedHashSet (mantém a ordem de inserção) e TreeSet (ordenado naturalmente ou por um comparador).

### Interface Queue
[[Topo]](#)<br />

Queue representa uma coleção usada para armazenar elementos antes do processamento. Ela segue a ordem de processamento FIFO (First In, First Out), embora algumas implementações possam fornecer diferentes ordens.

É ideal para aplicações onde é necessário processar elementos na ordem em que foram adicionados, como sistemas de filas de espera e buffers.

Inclui métodos específicos para operações de fila, como offer(E e), poll(), peek(), entre outros.

Implementações Comuns: LinkedList, que pode ser usada como uma fila, e PriorityQueue, que ordena os elementos de acordo com a ordem natural ou um comparador.

### Princípio FIFO (First In, First Out)
[[Topo]](#)<br />

FIFO é um princípio de processamento e serviço em que os elementos são processados na ordem em que são inseridos. O primeiro elemento a ser inserido na fila é o primeiro a ser processado ou removido.

Este princípio é a base da maioria das implementações de fila (Queue). É um conceito fundamental em áreas como computação, fabricação e logística.

Exemplo: Em uma fila de impressão, por exemplo, o primeiro documento enviado para a impressora será o primeiro a ser impresso.

A compreensão dessas interfaces e do princípio FIFO é crucial para a manipulação eficaz de coleções de dados em Java, permitindo que os desenvolvedores escolham a estrutura de dados mais adequada para suas necessidades específicas.
