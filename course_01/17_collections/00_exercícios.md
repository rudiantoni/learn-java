# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Exercícios - 17. Java Collections
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Homework
  - [17.5. LinkedList vs ArrayList, e notação Big O](#175-linkedlist-vs-arraylist-e-notação-big-o)
    - [Arquivo: HW - List](./05_arquivos/homework/HW%20-%20List.pdf)
  - [17.6. Comparator e Comparable](#176-comparator-e-comparable)
    - [Arquivo: HW - Comparator](./06_arquivos/homework/HW%20-%20Comparator.pdf)
  - [17.7. Iterator, Iterable e ListIterator](#177-iterator-iterable-e-listiterator)
    - [Arquivo: HW - Iterator and ListIterator](./07_arquivos/homework/HW%20-%20Iterator%20and%20ListIterator.pdf)
  - [17.8. Queue e Deque](#178-queue-e-deque)
    - [Arquivo: HW - Queue](./08_arquivos/homework/HW%20-%20Queue.pdf)
- Exercícios
  - [17.5. LinkedList vs ArrayList, e notação Big O](#175-linkedlist-vs-arraylist-e-notação-big-o)
    - [Exercício 1](./exercicio_01/) ([enunciado](#comparação-de-desempenho))
    - [Exercício 2](./exercicio_02/) ([enunciado](#refatorar-array-para-collection))
    - [Exercício 3](./exercicio_03/) ([enunciado](#minha-implementação-personalizada-de-lista))
  - [17.6. Comparator e Comparable](#176-comparator-e-comparable)
    - [Exercício 4](./exercicio_04/) ([enunciado](#comparator-em-produtos))
  - [17.7. Iterator, Iterable e ListIterator](#177-iterator-iterable-e-listiterator)
    - [Exercício 5](./exercicio_05/) ([enunciado](#iterator-personalizado))
    - [Exercício 6](./exercicio_06/) ([enunciado](#listiterator-personalizado))
  - [17.8. Queue e Deque](#178-queue-e-deque)
    - [Exercício 7](./exercicio_07/) ([enunciado](#backend-para-um-help-desk))

### 17.5. LinkedList vs ArrayList, e notação Big O
[[Topo]](#)<br />

#### Comparação de desempenho

- Ver homework: [HW - List](./05_arquivos/homework/HW%20-%20List.pdf)

Para comparar a performance siga os próximos passos:

- Crie um objeto ArrayList e adicione 1000000 de elementos nele (adicione objetos Integer em um loop).
- Crie um objeto LinkedList e adicione 1000000 de elementos nele (adicione objetos Integer em um loop).
- Crie um método que recebe uma lista como um argumento e adicione uma quantidade específica de inteiros no início da lista.

Declaração do método:

```java
public static void addElementsToBeginning(List<Integer> list, int numberOfElementsToAdd)
```

- Crie um método que recebe uma lista como argumento e adicione uma quantidade específica de inteiros no meio da lista.

Declaração do método:

```java
public static void addElementsToMiddle(List<Integer> list, int numberOfElementsToAdd)
```

- Crie um método que recebe uma lista como argumento e adicione uma quantidade específica de inteiros no fim da lista.

Declaração do método:

```java
public static void addElementsToEnd(List<Integer> list, int numberOfElementsToAdd)
```

- Crie um método que recebe uma lista como argumento e remove uma quantidade específica de inteiros no início da lista.

Declaração do método:

```java
public static void removeElementsFromBeginning(List<Integer> list, int numberOfElementsToRemove)
```

- Crie um método que recebe uma lista como argumento e remove uma quantidade específica de inteiros no meio da lista.

Declaração do método:

```java
public static void removeElementsFromMiddle(List<Integer> list, int numberOfElementsToRemove)
```

- Crie um método que recebe uma lista como argumento e remove uma quantidade específica de inteiros no fim da lista.

Declaração do método:

```java
public static void removeElementsFromEnd(List<Integer> list, int numberOfElementsToRemove)
```

- Execute as seguintes operações para ambos: LinkedList e ArrayList:
  - Adicione 100 elementos no final da lista
  - Adicione 10000 elementos no final da lista
  - Adicione 100000 elementos no final da lista
  - Adicione 100 elementos no meio da lista
  - Adicione 10000 elementos no meio da lista
  - Adicione 100000 elementos no meio da lista
  - Adicione 100 elementos no início da lista
  - Adicione 10000 elementos no início da lista
  - Adicione 100000 elementos no início da lista
  - Remova 100 elementos no final da lista
  - Remova 10000 elementos no final da lista
  - Remova 100000 elementos no final da lista
  - Remova 100 elementos no meio da lista
  - Remova 10000 elementos no meio da lista
  - Remova 100000 elementos no meio da lista
  - Remova 100 elementos no início da lista
  - Remova 10000 elementos no início da lista
  - Remova 100000 elementos no início da lista
- Tome nota dos tempos necessários para fazer cada operação de teste
- Nota técnica 1: para medir o tempo você pode capturar o tempo em um momento específico, após isso executar o método específicado, e após isso calcular o delta em tempo dessa maneira:

```java
long mill = System.nanoTime();
removeElementsFromEnd(list, 100);
long delta = (System.nanoTime() - mill) / 10000;
```

- Nota técnica 2: É permitido adicionar alguns valores contantes como Integer.MAX_VALUE.
- Não se esqueça de resetar o estado dos elementos para 1000000 cada bez antes de testar um novo cenário.
- Preencha a tabela com os resultados:

- Inserção
  - No início
    - 100 -> ArrayList: 3516 - LinkedList: 7
    - 10000 -> ArrayList: 197938 - LinkedList: 146
    - 100000 -> ArrayList: 2014137 - LinkedList: 92
  - No meio
    - 100 -> ArrayList: 1716 - LinkedList: 10706
    - 10000 -> ArrayList: 104550 - LinkedList: 983179
    - 100000 -> ArrayList: 1056346 - LinkedList: 9748600
  - No fim
    - 100 -> ArrayList: 7 - LinkedList: 6
    - 10000 -> ArrayList: 89 - LinkedList: 22
    - 100000 -> ArrayList: 463 - LinkedList: 126
- Remoção
  - No início
    - 100 -> ArrayList: 2407 - LinkedList: 7
    - 10000 -> ArrayList: 190826 - LinkedList: 104
    - 100000 -> ArrayList: 1794962 - LinkedList: 64
  - No meio
    - 100 -> ArrayList: 1522 - LinkedList: 10065
    - 10000 -> ArrayList: 96516 - LinkedList: 949488
    - 100000 -> ArrayList: 849686 - LinkedList: 8892841
  - No fim
    - 100 -> ArrayList: 5 - LinkedList: 8
    - 10000 -> ArrayList: 50 - LinkedList: 37
    - 100000 -> ArrayList: 318 - LinkedList: 65

- Após ter completado todos os passos você pode comparar seus resultados com o do seu tutor. Preste atenção aos resultados e os números serão diferentes. Mas o padrão será o mesmo.

Dados do tutor:

- Inserção
  - No início
    - 100 -> ArrayList: 13947 - LinkedList: 4
    - 10000 -> ArrayList: 267291 - LinkedList: 178
    - 100000 -> ArrayList: 1759892 - LinkedList: 281
  - No meio
    - 100 -> ArrayList: 2290 - LinkedList: 22908
    - 10000 -> ArrayList: 67520 - LinkedList: 2146884
    - 100000 -> ArrayList: 706177 - LinkedList: 36050328
  - No fim
    - 100 -> ArrayList: 2 - LinkedList: 3
    - 10000 -> ArrayList: 81 - LinkedList: 47
    - 100000 -> ArrayList: 449 - LinkedList: 294
- Remoção
  - No início
    - 100 -> ArrayList: 8608 - LinkedList: 7
    - 10000 -> ArrayList: 211366 - LinkedList: 48
    - 100000 -> ArrayList: 1748510 - LinkedList: 269
  - No meio
    - 100 -> ArrayList: 2278 - LinkedList: 30275
    - 10000 -> ArrayList: 67952 - LinkedList: 2242008
    - 100000 -> ArrayList: 672554 - LinkedList: 22345702
  - No fim
    - 100 -> ArrayList: 7 - LinkedList: 8
    - 10000 -> ArrayList: 101 - LinkedList: 151
    - 100000 -> ArrayList: 292 - LinkedList: 310

> Exercício 1 (LinkedList vs ArrayList, e notação Big O): [./exercicio_01](./exercicio_01/)

#### Refatorar array para Collection

- Ver homework: [HW - List](./05_arquivos/homework/HW%20-%20List.pdf)

- Clone o projeto demo: https://github.com/AndriiPiatakha/learnit_java_core
- Investigue o código fonte de com.itbulls.learnit.javacore.jcf.hw.onlinestore.withoutlist
- Substitua os arrays com a implementação da interface Collections (qualquer implementação que você achar que é a mais apropriada) e coloque a solução no seguinte pacote: com.itbulls.learnit.javacore.jcf.hw.onlinestore.withlist
- Dica: faça alterações nos seguintes arquivos:
  - Cart
  - Default Cart
  - Order
  - Default Order
  - CustomerListMenu
  - MyOrdersMenu
  - ProductCatalogMenu
  - OrderManagementService
  - DefaultOrderManagementService
  - ProductManagementService
  - DefaultProductManagementService
  - UserManagementService
  - DefaultUserManagementService
- As funcionalidades existentes não devem ser alteradas
- Os cenários para testes estão localizados aqui: https://docs.google.com/document/d/1_j1MAEahsHMk7MpnGXGZLNyW6UPiVKfDhWLaHl47eg8/edit?usp=sharing (Tarefa 4 do exame)

> Exercício 2 (LinkedList vs ArrayList, e notação Big O): [./exercicio_02](./exercicio_02/)

#### Minha implementação personalizada de lista

- Ver homework: [HW - List](./05_arquivos/homework/HW%20-%20List.pdf)

Implemente sua própria implementação de cuma interface de lista personalizada. É proibido usar qualquer implementação existente do pacote java.util. Para o escopo desta tarefa os estudantes devem poder criar suas próprias implementações da interface MyList.

Para prosseguir com a tarefa, siga os próximos passos:

- Crie uma interface com o nome MyList com o conteúdo:

```java
public interface MyList {
  void add(Object e); // appends the specified element to the end of this list
  void clear(); // removes all of the elements from this list
  boolean remove(Object o); // removes the first occurrence of the specified element from this list
  Object[] toArray(); // returns an array containing all of the elements in this list in proper sequence
  int size(); // returns the number of elements in this list
  boolean contains(Object o); // returns true if this list contains the specified element.
  boolean containsAll(MyList c); // returns true if this list contains all of the elements of the specified list
}
```

- Crie a classe DefaultMyList que implementa a interface MyList.
- Sobrescreva o método toString() para que seja possível imprimir de acordo com o formato a seguir:

```text
{[result of the toString method for element #1], [result of the toString method for element #2], ... }
```

- É proibido usar qualquer implementação da interface List e delegar chamadas para essa implementação a partir da classe DefaultMuList.
- Você pode usar a implementação de ArrayList ou LinkedList como referência durante a implementação desta tarefa. A recomendação é realizar uma implementação de lista de double-link.
- Veja minha solução aqui se você quiser: https://github.com/AndriiPiatakha/learnit_java_core/tree/master/src/com/itbulls
/learnit/javacore/jcf/collections/list/hw
- Commit para verificar mudanças apenas nos arquivos afetados: https://github.com/AndriiPiatakha/learnit_java_core/commit/053bada1bb72a5
8f2f21d6b3023d4776522c3ffc

> Exercício 3 (LinkedList vs ArrayList, e notação Big O): [./exercicio_03](./exercicio_03/)

### 17.6. Comparator e Comparable
[[Topo]](#)<br />

#### Comparator em produtos

- Ver homework: [HW - Comparator](./06_arquivos/homework/HW%20-%20Comparator.pdf)

Crie um tipo Comparator para o tipo Product que ordenará por nome de categoria. No caso em que as categorias forem as mesmas, os produtos com o menor valor devem vir primeiro. No caso de o preço ser o mesmo, ordene pelos nomes dos produtos.

- Para implementar esta tarefa, por favor use o seguinte:
  - Interface Product: https://github.com/AndriiPiatakha/learnit_java_core/blob/master/src/com/itbulls/learnit/javacore/jcf/hw/onlinestore/withlist/enteties/Product.java
  - Implementação de Product: https://github.com/AndriiPiatakha/learnit_java_core/blob/master/src/com/itbulls/learnit/javacore/jcf/hw/onlinestore/withlist/enteties/impl/DefaultProduct.java
  - A lista de Product a seguir:
```java
new ArrayList<>(Arrays.asList(
new DefaultProduct(1, "Hardwood Oak Suffolk Internal Door", "Doors", 109.99),
new DefaultProduct(2, "Oregon Cottage Interior Oak Door", "Doors", 109.99),
new DefaultProduct(3, "Oregon Cottage Horizontal Interior White Oak Door", "Doors", 189.99),
new DefaultProduct(4, "4 Panel Oak Deco Interior Door", "Doors", 209.09),
new DefaultProduct(5, "Worcester 2000 30kW Ng Combi Boiler Includes Free Comfort+ II controller", "Boilers", 989.99),
new DefaultProduct(6, "Glow-worm Betacom 4 30kW Combi Gas Boiler ERP", "Boilers", 787.99),
new DefaultProduct(7, "Worcester 2000 25kW Ng Combi Boiler with Free Comfort+ II controller", "Boilers", 859.99),
new DefaultProduct(8, "Wienerberger Terca Class B Engineering Brick Red 215mm x 102.5mm x 65mm (Pack of 504)", "Bricks", 402.99),
new DefaultProduct(9, "Wienerberger Terca Engineering Brick Blue Perforated Class B 65mm (Pack of 400)", "Bricks", 659.99),
new DefaultProduct(10, "Wienerberger Engineering Brick Red Smooth Class B 73mm - Pack of 368", "Bricks", 523.99)
```
  - Nota técnica: o Comparator deve ser implementado em um arquivo separado, em uma classe separada com o nome CustomProductComparator.
  - Commit para verificar apenas as alterações realizadas: https://github.com/AndriiPiatakha/learnit_java_core/commit/eca9bbe5d1522b28b3aa3faf15e88607cfb2ba87

> Exercício 1 (Comparator e Comparable): [06_arquivos/exercicio_01](./06_arquivos/exercicio_01/)

### 17.7. Iterator, Iterable e ListIterator
[[Topo]](#)<br />

#### Iterator personalizado
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

> Exercício 5 (Iterator, Iterable e ListIterator): [exercicio_05](./exercicio_05/)

#### ListIterator personalizado
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

> Exercício 6 (Iterator, Iterable e ListIterator): [exercicio_06](./exercicio_06/)


### 17.8. Queue e Deque
[[Topo]](#)<br />

### Backend para um help-desk
[[Topo]](#)<br />

- Ver homework: [HW - Queue](./08_arquivos/homework/HW%20-%20Queue.pdf)

Implemente o back-end para um Help Desk

- Crie a seguinte interface
```java
public interface HelpDeskFacade {
  void addNewSupportTicket(SupportTicket supportTicket);
  SupportTicket getNextSupportTicket();
  /**
  * @return amount of tickets that are not processed
  */
  int getNumberOfTickets();
}
```
- Crie DefaultHelpDeskFacade que implementa HelpDeskFacade
- Crie a interface SupportTicket:
```java
public interface SupportTicket {
  Priority getPriority();
  /**
  * This method returns the unique sequential number of the support ticket.
  * This number can be used as an identifier.
  * Order is started from 1.
  * The less the return number is - that support ticket was created earlier.
  *
  * @return unique sequence number
  */
  int getSequentialNumber();
  RequestType getRequestType();
}
```
- Crie DefaultSupportTicket e implemente a interface SupportTicket
- O método getNextSupportTicket() deve retornar o ticket e removê-lo do HelpDesk na seguinte ordem:
  - Tickets com maior prioridade vêm primeiro
  - No caso de dois tickets terem a mesma prioridade - o que foi criado mais cedo deve ser retornado
- Aqui está o mapeamento do tipo de solicitação e prioridade. Usando esta pasta, implemente o enum RequestType e o enum Priority

| Enum RequestType | Enum Priority |
|-------------|:--------------|
| OTHER | LOW |
| CHANGE_ACCOUNT_DETAILS | LOW |
| CAN_NOT_LOGIN | MEDIUM |
| ACCOUNT_IS_BLOCKED | MEDIUM |
| COOPERATION | MEDIUM |
| ACCOUNT_IS_HACKED | HIGH |
| CAN_NOT_COMPLETE_PURCHASE | HIGH |
| ORDER_IS_NOT_RECEIVED | HIGH |

- Commit para verificar apenas as alterações realizadas: https://github.com/AndriiPiatakha/learnit_java_core/commit/9134c3ba126a753e6d79b82d547b391419c48c30

> Exercício 7 (Queue e Deque): [exercicio_07](./exercicio_07/)


#TODO: continuar a partir daqui

### 17.11. Hash tables e HashMap
[[Topo]](#)<br />