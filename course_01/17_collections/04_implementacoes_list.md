# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## 17.4. Implementações de List: ArrayList, Vector, CopyOnWriteArrayList e Stack

[[Home - Curso 1]](../../README.md#curso-1)<br />

- Conteúdo
 - [ArrayList](#arraylist)
 - [Vector](#vector)
 - [CopyOnWriteArrayList](#copyonwritearraylist)
 - [Stack](#stack)
 - [Interfaces Marker](#interfaces-marker)
 - [Interface RandomAccess](#interface-randomaccess)

### ArrayList
[[Topo]](#)<br />

ArrayList é uma implementação redimensionável de array da interface List. É equivalente a um array dinâmico e permite acesso aleatório rápido.

Amplamente usado em situações onde é frequente a leitura de dados e menos frequente a inserção ou remoção de elementos, especialmente no meio da lista.

- **add(E e)**: Adiciona o elemento especificado ao final da lista.
- **remove(Object o)**: Remove a primeira ocorrência do elemento especificado da lista, se estiver presente.
- **get(int index)**: Retorna o elemento na posição especificada na lista.
- **set(int index, E element)**: Substitui o elemento na posição especificada na lista pelo elemento especificado.
- **ensureCapacity(int minCapacity)**: Aumenta a capacidade do ArrayList para garantir que ele possa armazenar pelo menos o número de elementos especificado.
- **trimToSize()**: Reduz o tamanho do array de armazenamento do ArrayList para o tamanho atual da lista.

Internamente, ArrayList usa um array de objetos para armazenar os elementos.

### Vector
[[Topo]](#)<br />

Vector é semelhante ao ArrayList, mas com dois diferenciais principais: é sincronizado e cada vez que cresce, dobra o tamanho do seu array interno.

Usado em ambientes multithread onde é necessário acesso sincronizado, embora seja menos popular hoje em dia devido à sua natureza sincronizada que leva a uma performance mais lenta em comparação com ArrayList.

- **addElement(E obj)**: Adiciona o objeto especificado como o último elemento do vetor.
- **removeElement(Object obj)**: Remove a primeira ocorrência do objeto especificado do vetor.
- **get(int index)**: Retorna o elemento na posição especificada no vetor.
- **set(int index, E element)**: Substitui o elemento na posição especificada no vetor pelo elemento especificado.
- **ensureCapacity(int minCapacity)**: Aumenta a capacidade do Vector para garantir que ele possa armazenar pelo menos o número de elementos especificado.
- **trimToSize()**: Reduz o tamanho do array de armazenamento do Vector para o tamanho atual do vetor.

Usa um array de objetos para armazenamento, semelhante ao ArrayList, mas com métodos sincronizados para acesso e modificação.

### CopyOnWriteArrayList
[[Topo]](#)<br />

É uma versão thread-safe de ArrayList onde todas as operações mutáveis, como add e set, são implementadas fazendo uma cópia fresca do array subjacente.

Utilizado em ambientes multithread onde a iteração é muito mais frequente do que a modificação. É muito útil para evitar a ConcurrentModificationException.

- **add(E e)**: Adiciona o elemento especificado ao final da lista.
- **remove(Object o)**: Remove a primeira ocorrência do elemento especificado da lista.
- **get(int index)**: Retorna o elemento na posição especificada na lista.
- **set(int index, E element)**: Substitui o elemento na posição especificada na lista pelo elemento especificado.
- **addIfAbsent(E e)**: Adiciona o elemento especificado à lista se ele ainda não estiver presente.
- **addAllAbsent(Collection<? extends E> c)**: Adiciona todos os elementos na coleção especificada que ainda não estão presentes na lista.

Mantém um array de objetos que é copiado a cada modificação.

### Stack
[[Topo]](#)<br />

Stack é uma classe que estende Vector e implementa a estrutura de dados de pilha last-in, first-out (LIFO).

É usado principalmente para tarefas que necessitam desta natureza LIFO, como desfazer operações, navegar entre páginas ou processar elementos em ordem inversa.

- **push(E item)**: Empurra um item para o topo da pilha.
- **pop()**: Remove o objeto no topo da pilha e o retorna.
- **peek()**: Olha o objeto no topo da pilha sem removê-lo da pilha.
- **empty()**: Testa se a pilha está vazia.
- **search(Object o)**: Retorna a posição baseada em 1 do objeto na pilha, com a posição 1 sendo o topo da pilha.

Sendo uma subclasse de Vector, herda seu armazenamento baseado em array e métodos sincronizados.

### Interfaces Marker
[[Topo]](#)<br />

Uma interface de marcação não tem métodos a serem implementados.

Elas indicam que uma classe que implementa a interface possui ou está sujeita a um comportamento ou propriedade particular.

Funcionam como metadados para informar algo sobre a classe.

O Java inclui várias interfaces de marcação. Dois exemplos notáveis são:

- **Serializable**: Ao implementar esta interface, uma classe indica que seus objetos podem ser serializados, ou seja, convertidos em um formato que pode ser armazenado ou transmitido e posteriormente reconstruído.
- **Cloneable**: Uma classe que implementa esta interface indica que permite a clonagem de seus objetos, ou seja, criar cópias exatas dos objetos por meio do método clone() da classe Object.

**Por que Usar Interfaces Marker?**

As interfaces de marcação são uma maneira de adicionar informações sobre uma classe em tempo de compilação sem a necessidade de métodos adicionais. Elas são úteis quando um aspecto de uma classe precisa ser identificado ou verificado sem alterar o comportamento da classe.

**Críticas e Alternativas**

Embora úteis em alguns cenários, as interfaces de marcação foram criticadas por não serem a forma mais transparente ou robusta de adicionar metadados a uma classe. Alternativas modernas incluem anotações em Java, introduzidas a partir do Java 5. As anotações oferecem uma maneira mais flexível e poderosa de adicionar metadados às classes, métodos e campos, e são agora o meio preferido de adicionar esse tipo de informação.

### Interface RandomAccess
[[Topo]](#)<br />

A interface RandomAccess é uma parte do Java Collection Framework. Ela é uma interface de marcação (marker interface) que é usada para indicar que uma determinada classe de lista suporta acesso rápido e eficiente a seus elementos em qualquer posição (acesso aleatório). Aqui estão alguns pontos-chave sobre a interface RandomAccess:

**Características**

- **Interface de Marcação**: Assim como outras interfaces de marcação, RandomAccess não define nenhum método. Sua presença em uma classe de lista apenas indica que a lista suporta acesso aleatório eficiente.
- **Uso com Listas**: É comumente implementada por classes de lista, como ArrayList, que têm uma sobreposição de tempo constante para o método get(int index).
- **Otimização**: A presença da interface RandomAccess pode ser usada para escolher algoritmos que são mais eficientes para listas que suportam acesso aleatório. Por exemplo, um algoritmo pode optar por usar um loop baseado em índice em vez de um iterador se a lista implementar RandomAccess.

**Propósito**

O propósito principal da RandomAccess é servir como um indicador para algoritmos que podem alterar seu comportamento com base no tipo de acesso da lista. Isso é particularmente útil para bibliotecas ou métodos que podem ter um desempenho melhorado em listas que suportam acesso aleatório.

**Exemplos de Uso**

Quando você tem um código que pode operar de forma diferente em uma lista com base em sua capacidade de acesso aleatório, você pode verificar a presença desta interface. Por exemplo:

```java
if (list instanceof RandomAccess) {
  // Use um algoritmo otimizado para acesso aleatório
} else {
  // Use um algoritmo otimizado para acesso sequencial
}
```

**Implementações Comuns**

- **ArrayList**: Uma implementação típica de uma lista que suporta acesso aleatório. ArrayList fornece operações de tempo constante para o método get(int index), tornando-o adequado para algoritmos que utilizam acesso aleatório.
- **LinkedList**: Em contraste, LinkedList não implementa RandomAccess, pois seu tempo de acesso é linear com a posição do elemento.

A interface RandomAccess é um exemplo clássico de como uma interface de marcação pode ser usada em Java para influenciar o comportamento e a escolha do algoritmo, proporcionando uma maneira de otimizar o desempenho sem exigir herança de classes ou implementação de métodos adicionais.
