# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Hash tables e HashMap
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [10_arquivos](./10_arquivos/)
- Projetos
  - [Projeto 1](./10_arquivos/proj_01) [(iniciado em)](#o-que-é-hash-table)
  - [Projeto 2](./10_arquivos/proj_02) [(iniciado em)](#ordenar-map-por-chaves)
- Conteúdo
  - [O que é hash table](#o-que-é-hash-table)
  - [Como uma hash table funciona](#como-uma-hash-table-funciona)
  - [equals() e hashCode()](#equals-e-hashcode)
  - [HashMap](#hashmap)
  - [Capacidade inicial e fator de carga](#capacidade-inicial-e-fator-de-carga)
  - [Chaves imutáveis e como perder um valor no mapa](#chaves-imutáveis-e-como-perder-um-valor-no-mapa)
  - [Ordenar Map por chaves](#ordenar-map-por-chaves)

### O que é hash table
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./10_arquivos/proj_01/)

Uma hash table, ou tabela de dispersão, é uma estrutura de dados muito usada em computação para implementar um array associativo, um tipo de estrutura que pode mapear chaves únicas a valores específicos.

A principal característica da hash table é sua eficiência na busca, inserção e remoção de elementos, que em média tem um tempo de execução constante, O(1).

Aqui estão alguns aspectos fundamentais das hash tables:

#### Funcionamento

Uma hash table usa uma função de hash para calcular um índice a partir da chave. Esse índice determina onde o valor associado à chave deve ser armazenado na tabela.

Idealmente, a função de hash distribui as chaves uniformemente pela tabela, minimizando as colisões (situações onde diferentes chaves são mapeadas para o mesmo índice).

#### Colisões

Colisões são inevitáveis em qualquer hash table devido ao princípio das gavetas (Pigeonhole Principle).

Existem várias técnicas para lidar com colisões, como encadeamento (onde cada posição da tabela contém uma lista de itens que colidiram nessa posição) e endereçamento aberto (onde uma colisão resulta em uma busca por outra posição na tabela para armazenar o item).

#### Performance

Em condições ideais, as operações básicas (inserção, busca e remoção) em uma hash table têm tempo de execução constante, O(1).

No entanto, a performance pode se degradar se muitas colisões ocorrerem, especialmente se as técnicas para lidar com colisões não forem eficientes.

#### Aplicações

Hash tables são amplamente usadas devido à sua eficiência. Elas são a base para muitas estruturas de dados de alto nível, como mapas, conjuntos (implementados como HashSet e HashMap em Java) e caches.

#### Escolha da função de hash

Uma boa função de hash é essencial para distribuir as chaves uniformemente pela tabela e reduzir o número de colisões. A escolha da função de hash depende dos tipos de chaves usados.

#### Implementações em Java

Em Java, a classe Hashtable é uma implementação sincronizada de uma hash table. No entanto, Hashtable é considerada obsoleta em favor de HashMap, que é uma implementação mais moderna e não sincronizada de hash table.

Em resumo, as hash tables são estruturas de dados cruciais e amplamente utilizadas em programação devido à sua eficiência em operações de mapeamento chave-valor. A escolha de uma função de hash adequada e a estratégia para lidar com colisões são fundamentais para manter sua eficiência.

### Como uma hash table funciona
[[Topo]](#)<br />

O núcleo de uma hash table é a função de hash. Esta função pega uma chave como entrada e calcula um índice baseado no valor da chave.

O índice calculado pela função de hash determina onde o par chave-valor será armazenado na tabela.

Uma boa função de hash distribui as chaves uniformemente pela tabela, minimizando as colisões.

#### Armazenamento de dados

A hash table usa um array para armazenar os dados.

Quando um par chave-valor é inserido, a função de hash calcula o índice baseado na chave e armazena o valor nesse índice no array.

#### Tratamento de colisões

Uma colisão ocorre quando duas chaves diferentes produzem o mesmo índice. Como não é possível armazenar ambos os valores no mesmo local, a hash table precisa de um método para resolver isso.

#### Métodos comuns de tratamento de colisões incluem

- **Encadeamento**: Cada posição do array contém um ponteiro para uma lista (ou outra estrutura de dados) que armazena todos os pares chave-valor mapeados para aquele índice.
- **Endereçamento aberto**: Se uma colisão ocorre, o algoritmo procura por outro índice vazio na tabela para armazenar o valor.

#### Busca

Para encontrar um valor, a função de hash calcula o índice da chave e o programa procura nesse índice.

Em caso de colisão e uso do encadeamento, pode ser necessário percorrer uma lista para encontrar o valor correto.

No endereçamento aberto, pode ser necessário procurar em diferentes índices.

#### Inserção e remoção

A inserção segue um processo similar à busca, onde o índice é calculado e o valor é armazenado lá.

Para a remoção, após encontrar o valor (usando a chave), o valor é removido da tabela.

### equals() e hashCode()
[[Topo]](#)<br />

Em Java, os métodos equals() e hashCode() são fundamentais para o funcionamento correto de coleções baseadas em hash, como HashSet, HashMap, e HashTable.

Esses métodos são definidos na classe Object, que é a superclasse de todas as classes em Java, e frequentemente são sobrescritos para garantir um comportamento apropriado e eficiente dessas coleções.

#### equals()

**Propósito**

- O método equals(Object obj) é usado para verificar se um objeto é igual a outro.
- A implementação padrão (Object.equals) verifica a igualdade de referência, ou seja, se ambos os objetos apontam para o mesmo endereço de memória.

**Sobrescrevendo equals()**
- Quando sobrescrito, o método equals() deve definir uma noção de igualdade específica para a classe.
- Por exemplo, duas instâncias de uma classe Person podem ser consideradas iguais se tiverem o mesmo ID, mesmo que sejam objetos diferentes na memória.

**Contrato de equals()**

- **Reflexivo**: Para qualquer referência x, x.equals(x) deve retornar true.
- **Simétrico**: Para quaisquer referências x e y, x.equals(y) deve retornar true se e somente se y.equals(x) retornar true.
- **Transitivo**: Para quaisquer referências x, y, e z, se x.equals(y) retorna true e y.equals(z) retorna true, então x.equals(z) deve retornar true.
- **Consistente**: Para quaisquer referências x e y, múltiplas invocações de x.equals(y) devem consistentemente retornar true ou false.
- Para qualquer referência x não nula, x.equals(null) deve retornar false.

#### hashCode()

**Propósito**

- O método hashCode() retorna um valor de hash inteiro para o objeto.
- Este valor é usado em coleções baseadas em hash para determinar a posição do objeto no array que armazena os elementos da coleção.

**Sobrescrevendo hashCode()**

- Quando equals() é sobrescrito, hashCode() também deve ser para manter o contrato geral de hashCode().
- O contrato diz que se dois objetos são iguais de acordo com o método equals(), então chamar o método hashCode() em cada um dos objetos deve produzir o mesmo valor inteiro.

**Contrato de hashCode()**

- **Consistência interna**: O valor de hash de um objeto não deve mudar durante a vida útil do objeto.
- **Igualdade de equals() e hashCode()**: Se dois objetos são iguais de acordo com o método equals(), eles devem retornar o mesmo valor de hash.
- **Colisões**: É possível que dois objetos não iguais tenham o mesmo valor de hash. No entanto, muitas colisões podem diminuir a eficiência de estruturas baseadas em hash.

Em resumo, equals() e hashCode() são métodos críticos para o correto funcionamento de estruturas de dados baseadas em hash. Eles devem ser sobrescritos de maneira consistente para manter o contrato estabelecido por Object.equals() e Object.hashCode(), garantindo assim que os objetos se comportem corretamente quando usados em coleções como HashSet, HashMap, e outras.

### HashMap
[[Topo]](#)<br />

HashMap é uma das implementações da interface Map no Java Collections Framework. Ela armazena dados na forma de pares chave-valor e é uma das estruturas de dados mais comuns e úteis em Java para mapeamento eficiente de chaves para valores.

#### Funcionamento interno

HashMap é baseada em uma tabela de hash. Ela usa a função de hash para calcular um índice para cada chave e armazena o par chave-valor nesse índice.

Em caso de colisões (quando diferentes chaves têm o mesmo índice calculado), HashMap as trata usando encadeamento. Neste caso, cada índice da tabela de hash contém uma lista de entradas.

#### Características chave

- Eficiência: Operações como get() e put() têm um tempo médio de execução constante, O(1), sob a suposição de que a função de hash dispersa as chaves uniformemente.
- Chaves e valores nulos: HashMap permite uma chave nula e vários valores nulos.
- Não sincronizado: HashMap não é sincronizado, o que significa que não é thread-safe. Se um HashMap for acessado por múltiplos threads, é necessário sincronizá-lo externamente ou usar ConcurrentHashMap.
- Ordem: HashMap não garante a ordem de iteração dos elementos. A ordem pode variar conforme a inserção e remoção de elementos.

#### Métodos importantes

- **put(K key, V value)**: Insere um par chave-valor no mapa.
- **get(Object key)**: Retorna o valor associado à chave especificada.
- **remove(Object key)**: Remove o par chave-valor associado à chave especificada.
- **containsKey(Object key)**: Verifica se o mapa contém a chave especificada.
- **keySet(), values(), entrySet()**: Fornecem conjuntos de chaves, valores e pares chave-valor, respectivamente.
- **size()**: Retorna o número de pares chave-valor no mapa.
- **clear()**: Remove todos os mapeamentos do mapa.

#### Caso de uso

HashMap é amplamente usado em aplicações onde buscas rápidas, inserções e deleções são frequentes, e a ordem dos elementos não é importante.
equals() e hashCode():

É crucial que os objetos usados como chaves em um HashMap tenham métodos equals() e hashCode() apropriadamente sobrescritos para garantir a unicidade e a eficiência na busca das chaves.

#### Capacidade e fator de carga

HashMap tem um conceito de "capacidade", que é o número de baldes na tabela de hash, e "fator de carga", que é uma medida de quão cheia a hash table pode ficar antes de ser redimensionada. O redimensionamento pode ser custoso, então o fator de carga e a capacidade inicial devem ser escolhidos com cuidado para otimizar a performance.

Em resumo, HashMap é uma implementação versátil e eficiente de um mapa em Java, adequada para situações em que a rapidez nas operações de mapeamento é crucial e a ordem dos elementos não é importante

### Capacidade inicial e fator de carga
[[Topo]](#)<br />

Em estruturas de dados baseadas em hash, como o HashMap em Java, os conceitos de capacidade inicial e fator de carga são importantes para entender e otimizar o desempenho.

#### Capacidade Inicial

**Definição**

A capacidade inicial é o número de "baldes" (slots) na tabela de hash no momento da criação do HashMap. Cada balde pode armazenar uma ou mais entradas (em caso de colisões).

**Importância**

Uma capacidade inicial maior pode melhorar o desempenho do HashMap reduzindo a necessidade de redimensionamento à medida que mais elementos são adicionados. No entanto, uma capacidade inicial muito alta pode desperdiçar memória se muitos baldes ficarem vazios.

**Padrão e customização**

Se não especificada, a capacidade inicial do HashMap tem um valor padrão (geralmente 16).

Você pode especificar uma capacidade inicial diferente ao criar um HashMap, dependendo das suas necessidades de desempenho e uso de memória.

#### Fator de Carga

**Definição**

O fator de carga é uma medida de quão cheia a tabela de hash é permitida ficar antes de seu tamanho ser automaticamente aumentado. É um valor decimal que representa a proporção entre o número de entradas no HashMap e o número total de baldes.

**Importância**

O fator de carga equilibra o uso de memória e o desempenho. Um valor baixo reduz as colisões, mas aumenta o uso de memória, enquanto um valor alto diminui o uso de memória, mas aumenta o risco de colisões.

**Padrão e customização**

O fator de carga padrão do HashMap é 0,75, considerado um bom compromisso entre tempo e espaço para a maioria dos casos.

Você pode especificar um fator de carga diferente ao criar um HashMap.

**Redimensionamento**

Quando o número de entradas no HashMap excede o produto da capacidade atual pelo fator de carga (ou seja, capacidade * fator de carga), a tabela de hash é redimensionada.

O redimensionamento envolve a criação de uma nova tabela de hash maior e a re-hashing de todas as entradas existentes, o que pode ser um processo custoso em termos de desempenho.

Ao configurar a capacidade inicial e o fator de carga, você pode otimizar o desempenho do HashMap para suas necessidades específicas. Um entendimento claro desses conceitos é importante para o uso eficiente de estruturas de dados baseadas em hash em aplicações Java.

### Chaves imutáveis e como perder um valor no mapa
[[Topo]](#)<br />

Em estruturas de dados baseadas em hash como HashMap em Java, é crucial usar chaves imutáveis para garantir a consistência e evitar a perda de valores no mapa.

Vamos explorar por que isso é importante e como a mutabilidade das chaves pode levar à perda de valores no mapa.

#### Por que usar chaves imutáveis?

**Consistência do valor de hash**

O HashMap usa o valor de hash da chave para determinar onde armazenar o par chave-valor no mapa. Se uma chave é mutável e seu conteúdo muda após ser adicionada ao mapa, seu valor de hash também pode mudar.

Se o valor de hash da chave muda enquanto a chave já está no mapa, isso pode desalinhar a posição onde o valor é armazenado com o valor de hash atual da chave, tornando impossível encontrar o par chave-valor usando o método get.

**Contrato entre equals() e hashCode()**

As chaves em um HashMap devem obedecer ao contrato que estabelece que se dois objetos são considerados iguais pelo método equals(), eles devem ter o mesmo valor de hash retornado por hashCode().

Se uma chave muda após ser colocada no mapa, ela pode violar esse contrato se sua igualdade com outras chaves ou seu valor de hash for alterado.

**Como a mutabilidade das chaves pode causar perda de valores**

Suponha que você tenha um HashMap onde a chave é um objeto mutável, como um StringBuilder ou uma classe com campos mutáveis. Veja o que pode acontecer:

- **Adicionar um par chave-valor**: Você adiciona um par chave-valor ao mapa. O HashMap calcula o valor de hash da chave e armazena o par na localização apropriada.
- **Modificar a chave**: Após adicionar o par ao mapa, você altera o objeto que está sendo usado como chave de uma maneira que altera seu valor de hash.
- **Buscar o valor**: Quando você tenta buscar o valor usando a chave modificada, o HashMap recalcula seu valor de hash.
  - Como o valor de hash agora é diferente do valor original, o HashMap procura em uma localização diferente, resultando em um retorno de null ou no valor errado, efetivamente fazendo com que você "perca" o acesso ao valor original.

#### Boas práticas

**Use objetos imutáveis como chaves**

Use tipos imutáveis (como String, Integer ou classes customizadas imutáveis) como chaves para evitar esse problema.
Se você precisar usar suas próprias classes como chaves, certifique-se de que elas sejam imutáveis e que os métodos equals() e hashCode() estejam corretamente implementados.

**Atenção com alterações indiretas**

Mesmo se você não modificar a chave diretamente, qualquer alteração indireta (como modificar um objeto referenciado pela chave) pode afetar o valor de hash.

Em resumo, usar chaves imutáveis em mapas baseados em hash é fundamental para garantir a consistência e evitar problemas de recuperação de valores. Chaves mutáveis podem levar a comportamentos inesperados e dificuldades para encontrar os valores armazenados.

### Ordenar Map por chaves
[[Topo]](#)<br />

- Ver projeto: [Projeto 2](./10_arquivos/proj_02/)

Ordenar um Map por suas chaves em Java pode ser realizado de várias maneiras, dependendo das suas necessidades específicas. A estrutura de dados mais comum utilizada para este fim é o TreeMap, que naturalmente mantém suas chaves em uma ordem ordenada.

Entretanto, se você precisar ordenar um Map que originalmente não mantém a ordem (como um HashMap), você pode seguir algumas abordagens diferentes:

#### Usando TreeMap

Se você deseja manter um mapa ordenado constantemente e suas chaves são comparáveis (ou você tem um Comparator personalizado), você pode usar diretamente um TreeMap:

```java
Map<String, Integer> map = new TreeMap<>();
map.put("banana", 3);
map.put("pera", 4);
map.put("maçã", 1);

// O TreeMap mantém as chaves ordenadas naturalmente.
for (Map.Entry<String, Integer> entry : map.entrySet()) {
  System.out.println(entry.getKey() + ": " + entry.getValue());
}
```

#### Ordenando um HashMap existente

Se você já tem um HashMap e deseja ordená-lo (por exemplo, para exibição), você pode inserir os dados em um TreeMap:

```java
Map<String, Integer> hashMap = new HashMap<>();
hashMap.put("banana", 3);
hashMap.put("pera", 4);
hashMap.put("maçã", 1);

Map<String, Integer> treeMap = new TreeMap<>(hashMap);
for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
  System.out.println(entry.getKey() + ": " + entry.getValue());
}
```

#### Usando Streams (Java 8+)

Com Java 8, você pode usar streams para ordenar um Map:

```java
Map<String, Integer> unsortedMap = new HashMap<>();
unsortedMap.put("banana", 3);
unsortedMap.put("pera", 4);
unsortedMap.put("maçã", 1);

LinkedHashMap<String, Integer> sortedMap = unsortedMap.entrySet()
  .stream()
  .sorted(Map.Entry.comparingByKey())
  .collect(Collectors.toMap(
    Map.Entry::getKey,
    Map.Entry::getValue,
    (oldValue, newValue) -> oldValue, LinkedHashMap::new));

sortedMap.forEach((key, value) -> System.out.println(key + ": " + value));
```

Neste exemplo, usamos sorted(Map.Entry.comparingByKey()) para ordenar o stream de entradas do mapa por suas chaves. O resultado é coletado em um LinkedHashMap, que mantém a ordem de inserção das entradas.

**Considerações**

A escolha entre esses métodos depende do seu caso de uso específico. Se a ordenação for uma operação única, um método baseado em stream ou a transferência para um TreeMap pode ser adequado.

Se você precisar manter um mapa ordenado constantemente, usar um TreeMap desde o início pode ser mais eficiente.

Lembre-se de que as chaves no TreeMap devem ser comparáveis. Elas devem implementar a interface Comparable ou você deve fornecer um Comparator personalizado.
