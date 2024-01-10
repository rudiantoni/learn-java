# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## 17.12. SortedMap, NavigableMap e TreeMap
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [12_arquivos](./12_arquivos/)
- Projetos
  - [Projeto 1](./12_arquivos/proj_01/) [(iniciado em)](#interface-sortedmap)
- Conteúdo
  - [Interface SortedMap](#interface-sortedmap)
  - [Interface NavigableMap](#interface-navigablemap)
  - [Classe TreeMap](#classe-treemap)
  - [Árvore binária](#árvore-binária)
  - [Árvore binária red-black](#árvores-binárias-balanceadas)

### Interface SortedMap
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./12_arquivos/proj_01/)

Em Java 8, a interface SortedMap é uma extensão da interface Map que garante uma ordem de classificação dos seus elementos. Ela faz parte do pacote java.util e possui as seguintes características:

A interface SortedMap é útil quando é necessário manter uma coleção de pares chave-valor com uma ordem específica, seja natural ou definida por um comparador customizado.

#### Ordenação dos elementos

O SortedMap mantém suas chaves ordenadas de acordo com a ordem natural dos elementos ou por um Comparator fornecido na criação do mapa. Isso significa que ao iterar sobre as chaves, valores ou entradas do mapa, eles serão retornados em uma ordem de classificação consistente.

#### Métodos específicos

Além de todos os métodos herdados da interface Map, o SortedMap adiciona métodos específicos para lidar com a ordenação, como:
- **comparator()**: Retorna o comparador usado para ordenar o mapa, ou null se o mapa usa a ordem natural dos seus elementos.
- **subMap(K fromKey, K toKey)**: Retorna uma visão do mapa cujas chaves estão no intervalo entre fromKey e toKey.
- **headMap(K toKey)**: Retorna uma visão do mapa cujas chaves são menores que toKey.
- **tailMap(K fromKey)**: Retorna uma visão do mapa cujas chaves são maiores ou iguais a fromKey.
- **firstKey()**: Retorna a menor chave no mapa.
- **lastKey()**: Retorna a maior chave no mapa.

#### Implementações comuns

As implementações mais comuns da interface SortedMap são TreeMap e ConcurrentSkipListMap. O TreeMap garante uma ordem dos elementos e fornece um desempenho eficiente para operações de inserção, remoção e busca. O ConcurrentSkipListMap é uma versão thread-safe que também mantém os elementos ordenados.

#### Uso em streams

Com o Java 8, o uso do SortedMap se torna mais poderoso em combinação com Streams, permitindo operações funcionais e de agregação sobre os dados de maneira eficiente e expressiva.

### Interface NavigableMap
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./12_arquivos/proj_01/)

A interface NavigableMap é uma subinterface da interface SortedMap e oferece uma funcionalidade de navegação adicional para mapas ordenados.

A adição da interface NavigableMap ao Java proporciona uma maneira mais flexível e poderosa de trabalhar com mapas ordenados, especialmente quando se trata de busca e recuperação de elementos com base em suas chaves.

Faz parte do pacote java.util e apresenta as seguintes características.

#### Extensão de SortedMap

Como uma extensão da interface SortedMap, NavigableMap herda todas as características desta, incluindo a manutenção das chaves em uma ordem de classificação.

#### Métodos de navegação avançada

A NavigableMap fornece métodos específicos que permitem uma maior flexibilidade na recuperação e manipulação de elementos. Estes métodos incluem:
- **lowerEntry(K key), lowerKey(K key)**: Retorna a entrada ou chave respectivamente que é menor do que a chave especificada.
- **floorEntry(K key), floorKey(K key)**: Retorna a entrada ou chave respectivamente que é menor ou igual à chave especificada.
- **ceilingEntry(K key), ceilingKey(K key)**: Retorna a entrada ou chave respectivamente que é maior ou igual à chave especificada.
- **higherEntry(K key), higherKey(K key)**: Retorna a entrada ou chave respectivamente que é maior do que a chave especificada.
- **pollFirstEntry(), pollLastEntry()**: Remove e retorna a primeira ou a última entrada do mapa, respectivamente.

#### Métodos para submapas

Além dos métodos para submapas encontrados em SortedMap, a NavigableMap oferece versões que incluem ou excluem as chaves de limite:
- **subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive)**
- **headMap(K toKey, boolean inclusive)**
- **tailMap(K fromKey, boolean inclusive)**

#### Implementações comuns

A implementação mais comum da interface NavigableMap é TreeMap. Além disso, ConcurrentSkipListMap implementa tanto NavigableMap quanto ConcurrentMap, fornecendo um mapa ordenado que também é thread-safe.

#### Uso em aplicações

A NavigableMap é particularmente útil em aplicações onde é necessário realizar buscas detalhadas dentro de mapas, como encontrar o valor mais próximo de uma chave específica, ou iterações que precisam ser feitas em uma ordem específica (ascendente ou descendente).

### Classe TreeMap
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./12_arquivos/proj_01/)

A classe TreeMap em Java é uma implementação concreta das interfaces Map, SortedMap e NavigableMap.

Em resumo, TreeMap é uma escolha robusta e eficiente para armazenar pares chave-valor em uma ordem específica, com suporte para operações de navegação avançada, tornando-o útil para uma variedade de aplicações em Java.

Faz parte do pacote java.util e é baseada na estrutura de dados da árvore vermelho-preta (Red-Black tree), oferecendo várias funcionalidades importantes.

#### Ordenação dos elementos

Em um TreeMap, as chaves são armazenadas de forma ordenada. A ordem pode ser a ordem natural das chaves (se elas implementam a interface Comparable) ou pode ser definida por um Comparator fornecido no momento da criação do TreeMap.

#### Eficiência nas operações

Operações como inserção, remoção e busca têm um tempo de execução logarítmico, ou seja, O(log n), o que torna o TreeMap uma escolha eficiente para conjuntos de dados grandes.

#### Métodos específicos da interface NavigableMap

Além dos métodos herdados das interfaces Map e SortedMap, o TreeMap implementa métodos da interface NavigableMap, como lowerKey, floorKey, ceilingKey, higherKey, pollFirstEntry e pollLastEntry.

#### Nulo como chave

Por padrão, um TreeMap não permite chaves nulas. No entanto, se um Comparator personalizado que aceita nulos for fornecido, então o TreeMap pode conter chaves nulas.

#### Não sincronizado

Um TreeMap não é sincronizado, o que significa que não é thread-safe por padrão. Se um TreeMap thread-safe for necessário, deve-se sincronizá-lo manualmente usando Collections.synchronizedSortedMap(new TreeMap(...)).

#### Iteração ordem

A iteração sobre as chaves, valores ou entradas de um TreeMap é feita na ordem de classificação das chaves. Isso é útil quando é necessário processar elementos em uma ordem específica.

#### Uso comum

TreeMap é frequentemente usado em aplicações que exigem um mapa ordenado, como em sistemas que necessitam de busca rápida com chaves ordenadas ou intervalos de chaves, como agendas, índices, e algoritmos de roteamento.

### Árvore binária
[[Topo]](#)<br />

Uma árvore binária é uma estrutura de dados fundamental em ciência da computação, usada para representar dados de forma hierárquica. É composta por nós, onde cada nó possui no máximo dois filhos.

Árvores binárias são amplamente usadas em aplicações de computação, incluindo implementação de estruturas de dados básicas, como mapas e conjuntos, e para algoritmos de ordenação e busca. Elas são a base para estruturas de dados mais complexas, como árvores B, árvores AVL, árvores vermelho-preto e árvores de segmento.

#### Características

- **Nó**: Cada elemento da árvore é chamado de nó. Um nó típico contém dados e dois ponteiros para seus filhos.
- **Raiz**: O nó no topo da árvore é chamado de raiz. Ele não tem um pai.
- **Folha**: Um nó sem filhos é chamado de folha ou nó terminal.
- **Subárvore**: Cada filho de um nó com seus descendentes forma uma subárvore.
- **Profundidade de um nó**: A profundidade de um nó é o número de arestas desde a raiz até o nó.
- **Altura da árvore**: A altura de uma árvore é a maior profundidade de qualquer nó na árvore.

#### Árvores binárias balanceadas

Em árvores balanceadas, a altura das duas subárvores de qualquer nó difere no máximo por um. Balanceamento é crucial para manter a eficiência de operações de busca, inserção e remoção.

#### Tipos de árvores binárias:

- **Árvore Binária de Busca (ABB)**: Para cada nó, todos os elementos na subárvore esquerda são menores que o nó, e todos na subárvore direita são maiores.
- **Árvore AVL**: Uma ABB balanceada onde a diferença entre alturas das subárvores esquerda e direita de qualquer nó é no máximo um.
- **Árvore Vermelho-Preto**: Uma ABB balanceada com regras adicionais sobre "cores" dos nós, usadas para garantir um balanceamento eficiente.

#### Travessias

- **Em ordem (In-order)**: Visita primeiro a subárvore esquerda, depois o nó atual, e por fim a subárvore direita.
- **Pré-ordem (Pre-order)**: Visita primeiro o nó atual, depois as subárvores esquerda e direita.
- **Pós-ordem (Post-order)**: Visita as subárvores esquerda e direita, e depois o nó atual.
- **Por níveis (Level-order)**: Visita os nós nível por nível, da esquerda para a direita.

### Árvore binária red-black
[[Topo]](#)<br />

Uma árvore vermelho-preto (red-black tree) é um tipo especial de árvore binária de busca que é auto-balanceada. Essa estrutura de dados é usada em várias bibliotecas de coleções de dados de alto desempenho devido à sua habilidade de manter as operações de inserção, remoção e busca em tempo logarítmico.

Em resumo, árvores vermelho-preto são essenciais para garantir operações eficientes em estruturas de dados que dependem de uma árvore binária de busca, especialmente quando a quantidade de dados é grande e as operações de inserção e remoção são frequentes.

As árvores vermelho-preto são complexas, mas eficientes.

#### Características

- **Cores dos nós**: Cada nó da árvore é colorido de vermelho ou preto.

#### Propriedades

- **Propriedade 1**: Todo nó é vermelho ou preto.
- **Propriedade 2**: A raiz é sempre preta.
- **Propriedade 3**: Todas as folhas (NIL ou nulos) são pretas.
- **Propriedade 4**: Se um nó é vermelho, então ambos os seus filhos são pretos (não há dois nós vermelhos consecutivos na mesma linha de descendência).
- **Propriedade 5**: Para cada nó, todos os caminhos simples daquele nó às folhas descendentes contêm o mesmo número de nós pretos.

#### Balanceamento

As operações de inserção e remoção podem exigir um reequilíbrio da árvore. Isso é realizado através de rotações e mudanças de cores. As rotações são operações que alteram a estrutura da árvore mas mantêm suas propriedades de árvore de busca. Existem dois tipos de rotações: rotação à esquerda e rotação à direita.

#### Complexidade de tempo

Devido ao balanceamento rigoroso, as operações de inserção, remoção e busca têm complexidade de tempo O(log n), onde n é o número de nós na árvore.

#### Aplicações

Árvores vermelho-preto são usadas em muitos sistemas de computação para implementar estruturas de dados básicas, como mapas, conjuntos e listas de prioridades. Por exemplo, são usadas nas implementações padrão de TreeMap e TreeSet no Java.

#### Vantagens

A principal vantagem de uma árvore vermelho-preto é que ela garante que a árvore permaneça balanceada, o que significa que nenhuma ramificação da árvore será desproporcionalmente longa em relação às outras. Isso é crucial para manter operações eficientes, mesmo no pior cenário.
