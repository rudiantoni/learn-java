# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Comparator e Comparable
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [06_arquivos](./06_arquivos/)
- Projetos
  - [Projeto 1](./06_arquivos/proj_01/) [(iniciado em)](#comparator)
- Conteúdo
  - [Comparator](#comparator)
  - [Ordenar elementos em List](#ordenar-elementos-em-list)
  - [Comparable](#comparable)
  - [compareTo VS compare](#compareto-vs-compare)
  - [Algoritmo de ordenação rápida (quick sort)](#algoritmo-de-ordenação-rápida-quick-sort)

### Comparator
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./06_arquivos/exercicio_01/)

É uma interface funcional em Java, que permite definir uma ordem de classificação personalizada para objetos de uma coleção. Ela é particularmente útil quando você quer ordenar objetos com base em algum critério que não seja sua ordem natural, ou quando os objetos a serem ordenados não implementam a interface Comparable.

O método principal na interface Comparator é compare(T o1, T o2), que recebe dois objetos do tipo T como parâmetros e retorna:
- Um número negativo se o1 for menor que o2.
- Zero se o1 e o2 forem iguais.
- Um número positivo se o1 for maior que o2.

```java
Comparator<String> stringLengthComparator = (String s1, String s2) -> s1.length() - s2.length();
```

### Ordenar elementos em List
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./06_arquivos/exercicio_01/)

Para ordenar elementos em uma List em Java, você pode utilizar o método sort da própria lista (disponível a partir do Java 8) ou a classe Collections. Aqui estão duas abordagens principais para ordenar uma lista:

**Usando o método sort de List**

A partir do Java 8, a interface List possui um método sort que aceita um Comparator. Este método é útil para ordenar listas com base em critérios customizados.

Exemplo: Ordenando uma lista de strings por comprimento.

```java
import java.util.*;

public class Main {
  public static void main(String[] args) {
    List<String> fruits = Arrays.asList("Apple", "Pineapple", "Banana", "Orange");

    fruits.sort((s1, s2) -> s1.length() - s2.length());

    fruits.forEach(System.out::println); // Imprime as frutas ordenadas por comprimento
  }
}
```

**Usando a classe Collections**

Para versões do Java antes do Java 8, ou se você preferir um método estático, use Collections.sort. Este método também aceita uma lista e um Comparator.

Exemplo: Ordenando uma lista de números em ordem decrescente.

```java
import java.util.*;

public class Main {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9);

    Collections.sort(numbers, Collections.reverseOrder());

    numbers.forEach(System.out::println); // Imprime os números em ordem decrescente
  }
}
```

### Comparable
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./06_arquivos/exercicio_01/)

É uma interface em Java que é usada para impor uma ordem natural sobre os objetos de cada classe que a implementa. Ela faz parte do pacote java.lang e define um único método, compareTo, que as classes que implementam Comparable devem definir. Este método é usado para comparar o objeto atual com outro objeto do mesmo tipo.

O método compareTo(T o) é usado para comparar o objeto atual (this) com outro objeto o do mesmo tipo. Ele retorna:
- Um número negativo se o objeto atual é menor que o.
- Zero se o objeto atual é igual a o.
- Um número positivo se o objeto atual é maior que o.

Ao implementar Comparable, você define uma ordem natural para os objetos da classe. Por exemplo, para uma classe Person, você pode decidir que a ordem natural é pela idade ou pelo nome.

Classes que implementam Comparable podem ser automaticamente ordenadas por coleções como Arrays.sort e Collections.sort, e podem ser usadas em coleções ordenadas como TreeSet e TreeMap.

```java
public class Person implements Comparable<Person> {
  private String name;
  private int age;

  // Construtores, getters e setters são omitidos para brevidade

  @Override
  public int compareTo(Person other) {
    return this.name.compareTo(other.name);
  }
}
```

Neste exemplo, se você tiver uma lista de objetos Person, poderá ordená-la usando Collections.sort sem precisar especificar um Comparator, pois a classe Person já definiu sua ordem natural através do compareTo.

### compareTo VS compare
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./06_arquivos/exercicio_01/)

A diferença fundamental entre os métodos compare e compareTo em Java reside em suas respectivas interfaces e propósitos de uso:
- **compareTo (Interface Comparable)**
  - **Interface**: Comparable
  - **Método**: public int compareTo(T o)
  - **Uso**: Utilizado para definir a ordem natural de objetos de uma classe. Quando uma classe implementa Comparable, ela deve definir este método.
  - **Funcionamento**: Compara o objeto atual (this) com o objeto especificado (o). Deve retornar:
    - Um número negativo se o objeto atual é menor que o.
    - Zero se são iguais.
    - Um número positivo se o objeto atual é maior que o.
  - **Exemplo de implementação**: Classes como String, Integer e outras classes wrapper implementam Comparable para fornecer uma ordem natural (por exemplo, ordem alfabética para strings, ordem numérica para inteiros).
- **compare (Interface Comparator)**
  - **Interface**: Comparator
  - **Método**: public int compare(T o1, T o2)
  - **Uso**: Utilizado para definir uma ordem de comparação externa, que é independente da ordem natural dos objetos. Útil quando queremos ordenar objetos com base em diferentes critérios.
  - **Funcionamento**: Compara dois objetos (o1 e o2). Deve retornar:
    - Um número negativo se o1 é menor que o2.
    - Zero se são iguais.
    - Um número positivo se o1 é maior que o2.
  - **Exemplo de implementação**: Pode ser implementado de forma para esta finalidade para ordenar listas ou arrays de objetos que não implementam Comparable, ou quando se deseja uma ordem diferente da ordem natural.

**Resumo das diferenças**
  - **Contexto de uso**: Comparable é usado para definir uma comparação "interna" ou natural da classe, enquanto Comparator é para criar uma comparação "externa" ou personalizada.
  - **Método de implementação**: Com Comparable, o método compareTo é implementado dentro da classe dos objetos a serem comparados. Com Comparator, o método compare é implementado em uma classe separada.
  - **Flexibilidade**: Comparator oferece mais flexibilidade, permitindo múltiplas implementações de comparação para a mesma classe, enquanto Comparable limita a classe a uma única ordem natural.
  
Ambas as interfaces são amplamente utilizadas em coleções e APIs de streaming do Java para ordenar e classificar objetos. A escolha entre Comparable e Comparator depende da necessidade específica de ordenação e da estrutura dos objetos.

### Algoritmo de ordenação rápida (quick sort)
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./06_arquivos/exercicio_01/)

O algoritmo de ordenação rápida, ou Quick Sort, é um dos métodos de ordenação mais eficientes e amplamente usados, conhecido por sua abordagem de dividir para conquistar. A eficácia do Quick Sort vem da sua capacidade de dividir a lista a ser ordenada em partes menores, e depois ordenar essas partes independentemente.

**Funcionamento do Quick Sort**

O algoritmo segue estes passos básicos:
- **Escolha de um pivô**: Seleciona um elemento da lista para ser o pivô. A escolha do pivô pode ser feita de várias maneiras, como escolher o primeiro elemento, o último, o meio, ou até um elemento aleatório da lista.
- **Particionamento**: Rearranja a lista de modo que todos os elementos menores que o pivô venham antes dele, e todos os elementos maiores venham depois. Após o particionamento, o pivô está em sua posição final ordenada. Esta etapa é a chave para o Quick Sort.
- **Recursão para sublistas**: Aplica o mesmo processo de forma recursiva para as duas sublistas geradas pelo particionamento - a sublista dos elementos menores que o pivô e a sublista dos elementos maiores.
- **Base da recursão**: A recursão termina quando a sublista a ser ordenada tem tamanho 1 ou 0, pois uma lista com um único elemento já está ordenada.

**Complexidade**

- **Média e melhor caso**: O(n log n) - onde n é o número de elementos na lista.
- **Pior caso**: O(n²) - onde ocorre quando o pivô escolhido é sempre o menor ou o maior elemento da lista, levando a um desbalanceamento nas subdivisões.

**Vantagens e desvantagens**

- **Vantagens**:
  - Eficiente para listas grandes.
  - Não requer espaço adicional, ao contrário de outros algoritmos como o Merge Sort.
- **Desvantagens**:
  - Pode ser ineficiente ou até mesmo perigoso (devido ao estouro da pilha de chamadas) se a escolha dos pivôs não for adequada, levando ao pior caso de complexidade.

Aqui está um exemplo básico de implementação do Quick Sort em Java:

```java
public class QuickSort {
  void quickSort(int[] array, int low, int high) {
    if (low < high) {
      int pi = partition(array, low, high);
      quickSort(array, low, pi - 1);
      quickSort(array, pi + 1, high);
    }
  }

  int partition(int[] array, int low, int high) {
    int pivot = array[high];
    int i = (low - 1);
    for (int j = low; j < high; j++) {
      if (array[j] < pivot) {
        i++;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
    }
    int temp = array[i + 1];
    array[i + 1] = array[high];
    array[high] = temp;
    return i + 1;
  }

  public static void main(String args[]) {
    int[] data = { 8, 7, 2, 1, 0, 9, 6 };
    int size = data.length;
    QuickSort qs = new QuickSort();
    qs.quickSort(data, 0, size - 1);
    System.out.println(Arrays.toString(data));
  }
}
```

Este exemplo ilustra a implementação básica do Quick Sort. No entanto, em ambientes de produção, detalhes adicionais como a escolha do pivô e o tratamento de listas pequenas podem ser otimizados para melhor desempenho.
