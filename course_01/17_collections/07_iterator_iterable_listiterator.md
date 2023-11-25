# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Iterator, Iterable e ListIterator
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [07_arquivos](./07_arquivos/)
- Homework
  - [Arquivo: HW - Iterator and ListIterator](./07_arquivos/homework/HW%20-%20Iterator%20and%20ListIterator.pdf)
  - [Iterator personalizado](#iterator-personalizado)
  - [ListIterator personalizado](#listiterator-personalizado)
- Projetos
  - [Projeto 1](./07_arquivos/proj_01/) [(iniciado em)](#iterable)
  - [Projeto 2](./07_arquivos/proj_02/) [(iniciado em)](#listiterator)
- Exercícios
  - [Exercício 1](./07_arquivos/exercicio_01/) ([enunciado](#iterator-personalizado))
  - [Exercício 2](./07_arquivos/exercicio_02/) ([enunciado](#listiterator-personalizado))
- Conteúdo
  - [Iterable](#iterable)
  - [Iterator](#iterator)
  - [Exceções](#exceções)
  - [Categorias de iteradores pela resposta as modificações](#categorias-de-iteradores-pela-resposta-as-modificações)
  - [Iterator fail-fast](#iterator-fail-fast)
  - [Iterator fail-safe](#iterator-fail-safe)
  - [Iterator weakly consistent](#iterator-weakly-consistent)
  - [ListIterator](#listiterator)
  - [Iterator personalizado](#iterator-personalizado)
  - [ListIterator personalizado](#listiterator-personalizado)

### Iterable
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./07_arquivos/proj_01/)

Em Java, a interface Iterable é uma parte fundamental do framework de coleções e é usada para representar qualquer objeto cujos elementos podem ser iterados. A interface Iterable define um método importante, iterator(), que deve ser implementado por qualquer classe que queira permitir a iteração de seus elementos.

Aqui estão alguns aspectos importantes sobre a interface Iterable em Java:

**Método iterator()**

Este é o único método definido na interface Iterable. Ele retorna um iterador sobre os elementos do objeto. O iterador retornado é uma instância de uma classe que implementa a interface Iterator.

**Interface Iterator**

A interface Iterator é usada em conjunto com Iterable. Ela define métodos para percorrer elementos, principalmente hasNext() (que verifica se há mais elementos a serem iterados) e next() (que retorna o próximo elemento na iteração).

**Uso em Loops for-each**
A interface Iterable torna uma classe compatível com o loop for-each em Java. Isso significa que você pode usar uma estrutura de loop for-each para iterar sobre os elementos de qualquer coleção que implemente Iterable.

**Coleções do Java**

A maioria das classes de coleções no Java Collections Framework, como ArrayList, LinkedList, HashSet e TreeSet, implementam a interface Iterable. Isso permite iterar sobre essas coleções de maneira fácil e padronizada.

**Benefícios**

A interface Iterable padroniza a forma como os objetos podem ser percorridos, tornando o código mais limpo e mais fácil de manter.

**Uso com Lambda e Streams**

Com a introdução de lambdas e streams no Java 8, a iteração sobre coleções que implementam Iterable tornou-se ainda mais flexível e poderosa, permitindo operações mais complexas e concisas.

  - [Iterable](#iterable)
  - [Iterator](#iterator)
  - [Exceções](#exceções)
  - [Categorias de iteradores pela resposta as modificações](#categorias-de-iteradores-pela-resposta-as-modificações)
  - [Iterator fail-fast](#iterator-fail-fast)
  - [Iterator fail-safe](#iterator-fail-safe)
  - [Iterator weakly consistent](#iterator-weakly-consistent)
  - [ListIterator](#listiterator)
  - [Iterator personalizado](#iterator-personalizado)
  - [ListIterator personalizado](#listiterator-personalizado)

### Iterator
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./07_arquivos/proj_01/)

Iterator é um padrão de design e uma interface fundamental em várias linguagens de programação, incluindo Java. O objetivo principal de um Iterator é fornecer uma maneira de acessar elementos de uma coleção (como listas, conjuntos, mapas, etc.) de maneira sequencial e sem expor a estrutura subjacente da coleção.

Aqui estão os principais aspectos da interface Iterator em Java:

**Interface Iterator**
Em Java, Iterator é uma interface que faz parte do Java Collections Framework. Ela define métodos para iterar sobre coleções.

Métodos Principais:

**hasNext()**: Retorna true se a iteração tiver mais elementos. Isso é usado para verificar se ainda há elementos a serem percorridos na coleção.
**next()**: Retorna o próximo elemento na iteração. Esse método avança o iterador para o próximo elemento.
**remove()**: (Opcional) Remove o último elemento retornado pelo iterador. Esse método pode ser chamado apenas uma vez por chamada para next() e lança uma exceção se essa regra for violada.

**Iteração Segura**

Um dos benefícios de usar um Iterator é que ele pode fornecer uma maneira segura de modificar uma coleção durante a iteração, algo que geralmente não é seguro ou possível usando loops padrões.

**Uso com a Interface Iterable**

Classes que implementam a interface Iterable (como a maioria das coleções) devem fornecer um método iterator() que retorna um Iterator. Isso permite que os objetos dessas classes sejam usados em loops for-each.

**Concorrência**

Enquanto um Iterator fornece uma maneira de iterar sobre elementos, ele não garante comportamento seguro em ambientes concorrentes a menos que a coleção subjacente seja projetada para suportar tal uso.

**Variações de Iteradores**

Além do Iterator básico, existem variações como ListIterator (que permite iteração bidirecional em listas e modificação de elementos) e iteradores em bibliotecas de fluxo de dados, como Stream.iterator() no Java 8.

  - [Iterable](#iterable)
  - [Iterator](#iterator)
  - [Exceções](#exceções)
  - [Categorias de iteradores pela resposta as modificações](#categorias-de-iteradores-pela-resposta-as-modificações)
  - [Iterator fail-fast](#iterator-fail-fast)
  - [Iterator fail-safe](#iterator-fail-safe)
  - [Iterator weakly consistent](#iterator-weakly-consistent)
  - [ListIterator](#listiterator)
  - [Iterator personalizado](#iterator-personalizado)
  - [ListIterator personalizado](#listiterator-personalizado)

### Exceções
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./07_arquivos/proj_01/)

Em Java, a interface Iterator pode lançar principalmente as seguintes exceções:

- **NoSuchElementException**: Esta exceção é lançada pelo método next() quando não há mais elementos para iterar. Isso geralmente ocorre se next() é chamado sem verificar primeiro se há um próximo elemento disponível usando hasNext().
- **ConcurrentModificationException**: Embora não seja uma parte obrigatória da especificação do Iterator, esta exceção é comumente lançada se a coleção subjacente for modificada enquanto um iterador estiver em uso, de uma maneira que não seja permitida. Por exemplo, se você estiver usando um iterador em uma lista e, ao mesmo tempo, modificar essa lista diretamente (não através do próprio iterador), isso pode resultar em ConcurrentModificationException.
- **UnsupportedOperationException**: Esta exceção é lançada pelo método remove() se a operação de remoção não for suportada pela implementação do iterador. Nem todos os iteradores suportam a remoção de elementos.
  - [Iterable](#iterable)
  - [Iterator](#iterator)
  - [Exceções](#exceções)
  - [Categorias de iteradores pela resposta as modificações](#categorias-de-iteradores-pela-resposta-as-modificações)
  - [Iterator fail-fast](#iterator-fail-fast)
  - [Iterator fail-safe](#iterator-fail-safe)
  - [Iterator weakly consistent](#iterator-weakly-consistent)
  - [ListIterator](#listiterator)
  - [Iterator personalizado](#iterator-personalizado)
  - [ListIterator personalizado](#listiterator-personalizado)


### Categorias de iteradores pela resposta as modificações
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./07_arquivos/proj_01/)

Os iteradores em Java podem ser categorizados com base em como eles respondem às modificações na coleção subjacente enquanto estão sendo utilizados. Três categorias comuns são "fail-fast", "fail-safe" e "weakly consistent". Aqui está um resumo de cada tipo:

**Fail-Fast Iterator**

- **Comportamento**: Esses iteradores lançam uma ConcurrentModificationException se detectarem que a coleção foi modificada de qualquer forma, exceto pelo próprio iterador, após a criação do iterador.
- **Implementações comuns**: Muitas das classes do Java Collections Framework, como ArrayList e HashMap, fornecem iteradores fail-fast.
- **Uso**: São úteis para detectar bugs, pois eles falham rapidamente e de forma limpa, evitando comportamentos imprevisíveis devido a modificações concorrentes.

**Fail-Safe Iterator**

- **Comportamento**: Esses iteradores não lançam ConcurrentModificationException se a coleção for modificada enquanto a iteração está em andamento. Eles operam em uma cópia da coleção, portanto, as modificações na coleção original não afetam a iteração.
- **Implementações Comuns**: Encontrados em classes de coleções do pacote java.util.concurrent, como CopyOnWriteArrayList e ConcurrentHashMap.
- **Uso**: São úteis em ambientes multithread onde a coleção pode ser modificada por vários threads simultaneamente.

**Weakly Consistent Iterator**

- **Comportamento**: Esses iteradores são uma forma de iteradores fail-safe. Eles refletem algumas, mas não necessariamente todas, as modificações na coleção desde o início da iteração. Eles garantem que não lançarão ConcurrentModificationException e que retornarão elementos que ainda não foram removidos.
- **Implementações Comuns**: Também presentes em estruturas de dados do java.util.concurrent, como ConcurrentHashMap.newKeySet().iterator().
- **Uso**: Adequados para coleções que são frequentemente acessadas por múltiplos threads e onde a consistência total durante a iteração não é uma exigência crítica.

  - [Iterable](#iterable)
  - [Iterator](#iterator)
  - [Exceções](#exceções)
  - [Categorias de iteradores pela resposta as modificações](#categorias-de-iteradores-pela-resposta-as-modificações)
  - [Iterator fail-fast](#iterator-fail-fast)
  - [Iterator fail-safe](#iterator-fail-safe)
  - [Iterator weakly consistent](#iterator-weakly-consistent)
  - [ListIterator](#listiterator)
  - [Iterator personalizado](#iterator-personalizado)
  - [ListIterator personalizado](#listiterator-personalizado)


### Iterator fail-fast
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./07_arquivos/proj_01/)

O conceito de um iterador "fail-fast" refere-se a um tipo específico de implementação de iterador em Java, que reage imediatamente ("falha rapidamente") se detectar que a estrutura da coleção subjacente foi alterada enquanto a iteração está em andamento. Essa alteração pode ser qualquer modificação, como adição, remoção ou atualização de elementos, que não seja feita através do próprio iterador.

```java
List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
Iterator<Integer> iterator = integers.iterator();
while(iterator.hasNext()) {
  integers.remove(0);
  int nextElement = iterator.next(); // Throws java.util.ConcurrentModificationException
  System.out.println(nextElement);
}
```

**Características principais dos iteradores fail-fast**:

- **Detecção de Modificações Concurentes**: Iteradores fail-fast são capazes de detectar mudanças na coleção durante a iteração. Se uma coleção é modificada enquanto um iterador fail-fast está sendo utilizado, o iterador lançará uma ConcurrentModificationException.
- **Mecanismo de Detecção**: Essa detecção é normalmente realizada por meio de um contador de modificações na coleção. Quando o iterador é criado, ele armazena o valor desse contador. Se, durante a iteração, o iterador detecta que o contador de modificações da coleção difere do valor que ele armazenou inicialmente, isso indica que a coleção foi modificada e a exceção é lançada.
- **Uso Comum em Coleções**: Muitas coleções do Java Collections Framework, como ArrayList, HashMap, e HashSet, utilizam iteradores fail-fast.
- **Objetivo**: O principal objetivo desses iteradores é evitar comportamentos indefinidos e erros sutis que podem ocorrer devido a modificações concorrentes em uma coleção durante a iteração.
- **Limitações**: Enquanto os iteradores fail-fast ajudam a identificar erros, eles não são apropriados para uso em ambientes multithread onde as coleções são esperadas para serem modificadas concorrentemente, pois a exceção ConcurrentModificationException será frequentemente lançada nesses cenários.
- **Não são uma Garantia**: A falha rápida não é garantida. O Java não fornece qualquer garantia forte de que um iterador fail-fast sempre lançará essa exceção em face de modificações concorrentes. É uma tentativa de melhor esforço.
  - [Iterable](#iterable)
  - [Iterator](#iterator)
  - [Exceções](#exceções)
  - [Categorias de iteradores pela resposta as modificações](#categorias-de-iteradores-pela-resposta-as-modificações)
  - [Iterator fail-fast](#iterator-fail-fast)
  - [Iterator fail-safe](#iterator-fail-safe)
  - [Iterator weakly consistent](#iterator-weakly-consistent)
  - [ListIterator](#listiterator)
  - [Iterator personalizado](#iterator-personalizado)
  - [ListIterator personalizado](#listiterator-personalizado)


### Iterator fail-safe
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./07_arquivos/proj_01/)

Iteradores fail-safe em Java são aqueles que não lançam ConcurrentModificationException quando a coleção subjacente é modificada durante a iteração. Eles são projetados para lidar de forma segura com a modificação da coleção enquanto ela está sendo iterada, daí o termo "fail-safe" (à prova de falhas).

```java
List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
List<Integer> threadSafeList = new CopyOnWriteArrayList<>(integers);
Iterator<Integer> iterator = threadSafeList.iterator();
threadSafeList.add(100);
while (iterator.hasNext()) {
  threadSafeList.remove(0);
  int nextElement = iterator.next();
  System.out.println(nextElement);
}
```

**Principais características dos iteradores fail-safe**

- **Cópia da Coleção**: Em muitos casos, um iterador fail-safe opera em uma cópia da coleção original. Portanto, as modificações feitas na coleção original não afetam a iteração. Isso significa que os elementos adicionados, removidos ou alterados na coleção original após a criação do iterador não serão refletidos durante a iteração.
- **Uso em Ambientes Concorrentes**: Iteradores fail-safe são úteis em ambientes multithread, onde é comum que várias threads modifiquem a coleção simultaneamente.
- **Implementações Comuns**: Um exemplo comum de uma coleção fail-safe é a CopyOnWriteArrayList do pacote java.util.concurrent. Quando o iterador é criado, ele mantém uma referência para o estado atual da coleção, e todas as modificações subsequentes são feitas em uma cópia separada.
- **Desvantagens**: Embora os iteradores fail-safe evitem ConcurrentModificationException e sejam mais seguros em ambientes concorrentes, eles têm a desvantagem de usar mais memória, já que mantêm uma cópia da coleção. Além disso, eles não refletem as alterações feitas na coleção após a criação do iterador, o que pode ser um problema, dependendo do caso de uso específico.
- **Performance**: Em termos de performance, os iteradores fail-safe podem ser mais lentos em coleções grandes devido ao custo de manter uma cópia separada da coleção.
- **Não Refletem Mudanças**: É importante notar que, uma vez que os iteradores fail-safe podem operar em uma cópia da coleção, as mudanças feitas na coleção original durante a iteração não serão visíveis para o iterador.
  - [Iterable](#iterable)
  - [Iterator](#iterator)
  - [Exceções](#exceções)
  - [Categorias de iteradores pela resposta as modificações](#categorias-de-iteradores-pela-resposta-as-modificações)
  - [Iterator fail-fast](#iterator-fail-fast)
  - [Iterator fail-safe](#iterator-fail-safe)
  - [Iterator weakly consistent](#iterator-weakly-consistent)
  - [ListIterator](#listiterator)
  - [Iterator personalizado](#iterator-personalizado)
  - [ListIterator personalizado](#listiterator-personalizado)


### Iterator weakly consistent
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./07_arquivos/proj_01/)

Um iterador "weakly consistent" (fracamente consistente) é um tipo de iterador em Java que oferece um compromisso entre os iteradores fail-fast e fail-safe. Este tipo de iterador é usado principalmente em coleções do pacote java.util.concurrent.

```java
List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
Collection<Integer> deque = new ConcurrentLinkedDeque<>(integers);
Iterator<Integer> iterator = integers.iterator();
deque.add(100);
while (iterator.hasNext()) {
  int nextElement = iterator.next();
  System.out.println(nextElement);
}
System.out.println(deque);
```

**Características principais dos iteradores weakly consistent**

- **Comportamento Concorrente**: Os iteradores weakly consistent não lançam ConcurrentModificationException se a coleção subjacente for modificada durante a iteração. Eles podem tolerar modificações concorrentes da coleção.
- **Consistência Fraca**: Eles garantem a consistência fraca, o que significa que eles refletem algumas, mas não necessariamente todas, as modificações na coleção desde o início da iteração. Isso é diferente dos iteradores fail-safe, que normalmente trabalham em uma cópia da coleção e não refletem nenhuma modificação após a criação do iterador.
- **Visibilidade das Modificações**: Com um iterador weakly consistent, é possível que algumas das modificações feitas na coleção depois da criação do iterador sejam visíveis durante a iteração, mas não há garantia de que todas serão.
- **Uso em Coleções do java.util.concurrent**: Esses iteradores são comuns em coleções projetadas para uso concorrente, como ConcurrentHashMap e ConcurrentSkipListMap.
- **Vantagens**: Eles são úteis em ambientes multithread, onde a coleção pode ser acessada e modificada por vários threads simultaneamente. Oferecem um bom equilíbrio entre performance e consistência de dados em tais cenários.
- **Performance**: Geralmente, oferecem melhor desempenho em comparação com iteradores fail-safe que operam em cópias da coleção, especialmente para coleções grandes.
  - [Iterable](#iterable)
  - [Iterator](#iterator)
  - [Exceções](#exceções)
  - [Categorias de iteradores pela resposta as modificações](#categorias-de-iteradores-pela-resposta-as-modificações)
  - [Iterator fail-fast](#iterator-fail-fast)
  - [Iterator fail-safe](#iterator-fail-safe)
  - [Iterator weakly consistent](#iterator-weakly-consistent)
  - [ListIterator](#listiterator)
  - [Iterator personalizado](#iterator-personalizado)
  - [ListIterator personalizado](#listiterator-personalizado)


### ListIterator
[[Topo]](#)<br />

- Ver projeto: [Projeto 2](./07_arquivos/proj_02/)

O ListIterator é uma interface em Java que estende a interface Iterator, fornecendo funcionalidades adicionais para iterar sobre listas. Ela é específica para coleções do tipo List e oferece mais flexibilidade do que o iterador padrão, permitindo a iteração bidirecional (tanto para frente quanto para trás) e a modificação da lista durante a iteração.

**Características e funcionalidades do ListIterator**
- **Iteração Bidirecional**: Além dos métodos hasNext() e next() encontrados na interface Iterator, o ListIterator inclui os métodos hasPrevious() e previous(). hasPrevious() verifica se há elementos antes do atual na lista, e previous() retorna o elemento anterior.
- **Índices de Elementos**: O ListIterator fornece métodos nextIndex() e previousIndex() para retornar os índices do elemento que seria retornado por uma chamada subsequente a next() ou previous(), respectivamente.
- **Modificação da Lista**: Ele permite modificar a lista durante a iteração através dos métodos add(E e), set(E e) e remove().
  - **add(E e)**: insere o elemento especificado na lista (opcionalmente).
  - **set(E e)**: substitui o último elemento retornado por next() ou previous() pelo elemento especificado (opcionalmente).
  - **remove()**: remove da lista o último elemento retornado por next() ou previous().
- **Uso**: O ListIterator é comumente usado quando é necessário iterar sobre uma lista em ambas as direções, ou quando há necessidade de modificar a lista durante a iteração.
**Obtenção do ListIterator**: Pode ser obtido chamando o método listIterator() em uma instância de List. Também é possível obter um ListIterator que começa a partir de um índice específico na lista.
**Cuidados com Concorrência**: Assim como com outros iteradores, é importante considerar questões de concorrência. Se a lista for modificada por outra thread enquanto estiver sendo iterada, pode resultar em comportamento inesperado.

  - [Iterable](#iterable)
  - [Iterator](#iterator)
  - [Exceções](#exceções)
  - [Categorias de iteradores pela resposta as modificações](#categorias-de-iteradores-pela-resposta-as-modificações)
  - [Iterator fail-fast](#iterator-fail-fast)
  - [Iterator fail-safe](#iterator-fail-safe)
  - [Iterator weakly consistent](#iterator-weakly-consistent)
  - [ListIterator](#listiterator)
  - [Iterator personalizado](#iterator-personalizado)
  - [ListIterator personalizado](#listiterator-personalizado)

### Iterator personalizado
[[Topo]](#)<br />

- Ver homework: [HW - Iterator and ListIterator](./07_arquivos/homework/HW%20-%20Iterator%20and%20ListIterator.pdf)

**Implemente um iterador personalizado**

- Extender a interface MyList que foi implementada durante a tarefa anterior
  - Link: https://docs.google.com/document/d/1g5GRLOU4XRDCIp50n_-Dmnok-2EdoDTlAQdVm6XyBLo/edit?usp=sharing
  - Veja a tarefa número 3.
  - Com uma interface Iterable como essa:
```java
interface MyList extends Iterable<Object>
```
- Na classe DefaultMyList implemente o método iterador()
```java
public Iterator<Object> iterator() {
  return new IteratorImpl();
}
```
- Implemente a classe interna que deve implementar a interface Iterator
```java
private class IteratorImpl implements Iterator<Object> {
  public boolean hasNext() {
    // retorna true se a iteração ainda possui mais elementos
  }
  public Object next() {
    // retorna o próximo elemento na iteração
  }
  public void remove() {
    // remove da coleção interna o último elemento retornado por este iterador
  }
}
```
- O método remove() deve lançar uma exceção IllegalStateException no caso do método remove ter sido chamado sem chamar o método next(). Ou no caso dele ter sido chamado 2 vezes em sequência.
  - Nota técnica: para lançar uma exceção IllegalStateException escreva o seguinte código
```java
throw new IllegalStateException();
```
- No caso de não houver elementos: Deve ser lançado NoSuchElementException.
  - Nota técnica: para lançar uma exceção NoSuchElementException escreva o seguinte código
```java
throw new NoSuchElementException();
```
- O iterador deve funcionar com tipos Integer e String.
  - [Iterable](#iterable)
  - [Iterator](#iterator)
  - [Exceções](#exceções)
  - [Categorias de iteradores pela resposta as modificações](#categorias-de-iteradores-pela-resposta-as-modificações)
  - [Iterator fail-fast](#iterator-fail-fast)
  - [Iterator fail-safe](#iterator-fail-safe)
  - [Iterator weakly consistent](#iterator-weakly-consistent)
  - [ListIterator](#listiterator)
  - [Iterator personalizado](#iterator-personalizado)
  - [ListIterator personalizado](#listiterator-personalizado)

### ListIterator personalizado
[[Topo]](#)<br />

- Ver homework: [HW - Iterator and ListIterator](./07_arquivos/homework/HW%20-%20Iterator%20and%20ListIterator.pdf)

**Implemente um ListIterator personalizado**

- Declare a interface ListIterator dessa maneira
```java
interface ListIterator extends Iterator<Object> { // java.util.Iterator
  boolean hasPrevious(); // retorna true se o list iterator tem mais elementos ao atravessar a lista na direção inversa
  Object previous(); // retorna o elemento anterior na lista e move a posição do cursor para trás
  void set(Object e); // substitui o último elemento retornado por next ou previous
  void remove(); // remove da lista o último elemento retornado por next ou previous
}
```
- Os métodos set() ou remove() devem ser chamados apenas após a invocação de next() ou previous(), caso contrário, lançar IllegalStateException.
- Declare a interface ListIterable
```java
interface ListIterable {
  ListIterator listIterator();
}
```
- Adicione a implementação de ListIterable na classe DefaultMyList
```java
class DefaultMyList implements MyList, ListIterable {...}
```
- Adicione o método a classe DefaultMyList
```java
public ListIterator listIterator() {
  return new ListIteratorImpl();
}
```
- Crie uma classe interna ListIteratorImpl
```java
private class ListIteratorImpl extends IteratorImpl implements ListIterator {
  // Implemente todos os métodos aqui
}
```
- Implemente todos os métodos da interface personalizada de ListIterator na classe interna
- Commit para verificar apenas as alterações realizadas: https://github.com/AndriiPiatakha/learnit_java_core/commit/a3fedfdc067b969bcfdd1159956d14ec0b3b0e6f

> Exercício 2 (Iterator, Iterable e ListIterator): [07_arquivos/exercicio_02](./07_arquivos/exercicio_02/)
