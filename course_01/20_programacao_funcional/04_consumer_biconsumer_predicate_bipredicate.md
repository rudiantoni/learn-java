# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Consumer, BiConsumer, Predicate e BiPredicate: teoria e prática
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [04_arquivos](./04_arquivos/)
- Projetos
  - [Projeto 1](./04_arquivos/proj_01/) [(iniciado em)](#interface-consumer)
  - [Projeto 2](./04_arquivos/proj_02/) [(iniciado em)](#interface-predicate)
- Conteúdo
- [Interface Consumer](#interface-consumer)
- [Interface BiConsumer](#interface-biconsumer)
- [Métodos comuns para Consumer ou BiConsumer](#métodos-comuns-para-consumer-ou-biconsumer)
- [Interface Predicate](#interface-predicate)
- [Interface BiPredicate](#interface-bipredicate)
- [Combinando Predicates](#combinando-predicates)
- [Métodos comuns para Predicate ou BiPredicate](#métodos-comuns-para-predicate-ou-bipredicate)

### Interface Consumer
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./04_arquivos/proj_01/)

A interface `Consumer` em Java 8 é uma parte fundamental da programação funcional no Java, introduzida com as Expressões Lambda e a API de Streams. Essa interface pertence ao pacote `java.util.function` e é usada para operações que aceitam um único argumento de entrada e não retornam nenhum resultado. Isso é útil em cenários onde você deseja executar alguma ação sobre os objetos fornecidos.

A interface `Consumer` é uma interface funcional, o que significa que ela tem um único método abstrato. No caso de `Consumer`, este método é `accept(T t)`. Aqui está um exemplo básico:

```java
import java.util.function.Consumer;

public class ConsumerExample {
  public static void main(String[] args) {
    Consumer<String> consumer = (s) -> System.out.println(s.toUpperCase());

    consumer.accept("Hello, World!");
  }
}
```

Neste exemplo, um `Consumer<String>` é criado usando uma expressão lambda que aceita uma `String` e imprime sua versão em maiúsculas. Quando `accept` é chamado com `"Hello, World!"`, ele imprime `"HELLO, WORLD!"`.

Outro exemplo comum de `Consumer` é em operações de stream, como no uso do método `forEach`:

```java
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerWithStreams {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("a", "b", "c", "d");

    Consumer<String> action = (s) -> System.out.println(s.toUpperCase());

    list.stream().forEach(action);
  }
}
```

Neste exemplo, uma lista de strings é transformada em um stream e o método `forEach` é usado para aplicar o `Consumer` a cada elemento do stream, imprimindo cada elemento da lista em maiúsculas.

`Consumer` é amplamente utilizado na programação Java moderna, especialmente em conjunto com streams e expressões lambda, para criar código mais conciso e legível.

### Interface BiConsumer
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./04_arquivos/proj_01/)

A interface `BiConsumer` em Java 8, assim como a interface `Consumer`, é uma parte integral da programação funcional no Java. Ela está no pacote `java.util.function` e representa uma operação que aceita dois argumentos de entrada e não retorna nenhum resultado. A diferença principal entre `Consumer` e `BiConsumer` é que `BiConsumer` aceita dois argumentos para operação, ao invés de um.

A interface `BiConsumer` é uma interface funcional e tem um único método abstrato chamado `accept(T t, U u)`. Aqui estão alguns exemplos de como usar `BiConsumer` em Java:

#### Exemplo básico de BiConsumer

```java
import java.util.function.BiConsumer;

public class BiConsumerExample {
  public static void main(String[] args) {
    BiConsumer<String, String> biConsumer = (a, b) -> System.out.println(a + b);

    biConsumer.accept("Hello ", "World!");
  }
}
```

Neste exemplo, um `BiConsumer<String, String>` é criado usando uma expressão lambda que aceita duas strings e as concatena. Quando `accept` é chamado com `"Hello "` e `"World!"`, ele imprime `"Hello World!"`.

#### Exemplo de BiConsumer com mapa

`BiConsumer` é frequentemente usado com mapas, especialmente com o método `forEach`:

```java
import java.util.Map;
import java.util.HashMap;
import java.util.function.BiConsumer;

public class BiConsumerWithMap {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();
    map.put("Um", 1);
    map.put("Dois", 2);
    map.put("Três", 3);

    BiConsumer<String, Integer> biConsumer = (key, value) -> System.out.println(key + " = " + value);

    map.forEach(biConsumer);
  }
}
```

Neste exemplo, um mapa é criado e um `BiConsumer<String, Integer>` é usado para imprimir cada chave e valor do mapa. O método `forEach` do mapa aceita um `BiConsumer` e aplica-o a cada par chave-valor no mapa.

Esses exemplos mostram como `BiConsumer` é útil para realizar operações que envolvem dois parâmetros, especialmente em contextos onde as operações não precisam retornar um valor.

### Métodos comuns para Consumer ou BiConsumer
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./04_arquivos/proj_01/)

Em Java 8, várias novas funcionalidades foram introduzidas para melhorar a manipulação de coleções e mapas, tornando o código mais conciso e legível. Entre essas funcionalidades estão `Iterator.forEachRemaining()`, `Map.forEach()`, e `Collection.removeIf()`. Vamos explorar cada uma delas com exemplos de código.

#### Iterator.forEachRemaining()

O método `forEachRemaining()` foi adicionado à interface `Iterator` em Java 8. Este método permite que você execute uma ação para cada elemento restante na iteração, até que todos os elementos tenham sido processados. É particularmente útil quando você já começou a iteração usando `next()` e deseja continuar processando os elementos restantes.

**Exemplo:**

```java
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ForEachRemainingExample {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
    Iterator<String> iterator = list.iterator();

    // Processando um elemento manualmente
    if (iterator.hasNext()) {
      System.out.println("Processando: " + iterator.next());
    }

    // Processando os elementos restantes
    iterator.forEachRemaining(element -> System.out.println("Processando: " + element));
  }
}
```

#### Map.forEach()

O método `forEach()` em `Map` permite que você itere sobre pares de chave-valor do mapa de maneira concisa. Este método aceita um `BiConsumer` que você pode usar para processar as chaves e valores.

**Exemplo:**

```java
import java.util.HashMap;
import java.util.Map;

public class MapForEachExample {
  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();
    map.put(1, "Um");
    map.put(2, "Dois");
    map.put(3, "Três");

    map.forEach((key, value) -> System.out.println(key + " -> " + value));
  }
}
```



### Interface Predicate
[[Topo]](#)<br />

- Ver projeto: [Projeto 2](./04_arquivos/proj_02/)

A interface `Predicate` em Java 8 é uma parte importante da programação funcional no Java, introduzida juntamente com as expressões lambda e a API de Streams. Ela pertence ao pacote `java.util.function` e é usada principalmente para avaliar uma condição (um teste booleano) sobre um objeto. 

A interface `Predicate<T>` é uma interface funcional, o que significa que ela tem um único método abstrato. No caso de `Predicate`, este método é `test(T t)`, que retorna um valor booleano.

#### Exemplo básico de Predicate

```java
import java.util.function.Predicate;

public class PredicateExample {
  public static void main(String[] args) {
    Predicate<Integer> isPositive = n -> n > 0;

    System.out.println(isPositive.test(5));  // true
    System.out.println(isPositive.test(-5)); // false
  }
}
```

Neste exemplo, um `Predicate<Integer>` é criado para verificar se um número é positivo. A expressão lambda `n -> n > 0` define o teste para o predicado.

A interface `Predicate` é uma ferramenta poderosa no Java para criar condições de teste reutilizáveis e compostas, facilitando a escrita de código mais limpo e modular, especialmente ao trabalhar com coleções e streams.

### Interface BiPredicate
[[Topo]](#)<br />

- Ver projeto: [Projeto 2](./04_arquivos/proj_02/)

A interface `BiPredicate` em Java 8, assim como a interface `Predicate`, é uma parte da programação funcional no Java, introduzida com as expressões lambda e a API de Streams. Enquanto `Predicate` testa um único valor, `BiPredicate` é uma interface funcional que testa dois valores - ou seja, aceita dois argumentos para o teste.

A interface `BiPredicate<T, U>` possui um único método abstrato chamado `test(T t, U u)`, que retorna um valor booleano. Vamos explorar o uso de `BiPredicate` com alguns exemplos.

#### Exemplo básico de BiPredicate

```java
import java.util.function.BiPredicate;

public class BiPredicateExample {
  public static void main(String[] args) {
    BiPredicate<Integer, Integer> compare = (a, b) -> a > b;

    System.out.println(compare.test(5, 3));  // true
    System.out.println(compare.test(2, 3));  // false
  }
}
```

Neste exemplo, um `BiPredicate<Integer, Integer>` é criado para comparar dois números e verificar se o primeiro é maior que o segundo.

#### BiPredicate com Strings

```java
import java.util.function.BiPredicate;

public class BiPredicateStringExample {
  public static void main(String[] args) {
    BiPredicate<String, String> startsWith = (string, prefix) -> string.startsWith(prefix);

    System.out.println(startsWith.test("hello", "he")); // true
    System.out.println(startsWith.test("hello", "a"));  // false
  }
}
```

Aqui, um `BiPredicate<String, String>` é usado para verificar se uma string começa com um determinado prefixo.

### Combinando Predicates
[[Topo]](#)<br />

#### Predicate.and()

O método `and()` combina dois predicados usando um operador lógico E (AND). Se ambos os predicados retornam `true`, o resultado combinado também será `true`.

**Exemplo:**

```java
import java.util.function.Predicate;

public class PredicateAndExample {
  public static void main(String[] args) {
    Predicate<Integer> greaterThanTen = (i) -> i > 10;
    Predicate<Integer> lessThanTwenty = (i) -> i < 20;

    Predicate<Integer> betweenTenAndTwenty = greaterThanTen.and(lessThanTwenty);

    System.out.println(betweenTenAndTwenty.test(15)); // true
    System.out.println(betweenTenAndTwenty.test(5));  // false
  }
}
```

#### Predicate.or()

O método `or()` combina dois predicados usando um operador lógico OU (OR). Se qualquer um dos predicados retornar `true`, o resultado combinado será `true`.

**Exemplo:**

```java
import java.util.function.Predicate;

public class PredicateOrExample {
  public static void main(String[] args) {
    Predicate<Integer> lessThanTen = (i) -> i < 10;
    Predicate<Integer> greaterThanTwenty = (i) -> i > 20;

    Predicate<Integer> lessThanTenOrGreaterThanTwenty = lessThanTen.or(greaterThanTwenty);

    System.out.println(lessThanTenOrGreaterThanTwenty.test(5));  // true
    System.out.println(lessThanTenOrGreaterThanTwenty.test(15)); // false
  }
}
```

#### Predicate.negate()

O método `negate()` inverte o resultado de um predicado.

**Exemplo:**

```java
import java.util.function.Predicate;

public class PredicateNegateExample {
  public static void main(String[] args) {
    Predicate<Integer> isEven = (i) -> i % 2 == 0;

    Predicate<Integer> isOdd = isEven.negate();

    System.out.println(isOdd.test(3)); // true
  }
}
```

#### Predicate.isEqual()

O método estático `isEqual()` retorna um predicado que testa a igualdade de um objeto com o valor fornecido.

**Exemplo:**

```java
import java.util.function.Predicate;

public class PredicateIsEqualExample {
  public static void main(String[] args) {
    Predicate<String> isHello = Predicate.isEqual("Hello");

    System.out.println(isHello.test("Hello")); // true
    System.out.println(isHello.test("Hi"));    // false
  }
}
```

#### Predicate.not() (Java 11+)

O método estático `not()` (introduzido no Java 11) inverte um predicado. Funciona de maneira similar a `negate()`, mas pode ser mais legível em alguns contextos.

**Exemplo:**

```java
import java.util.function.Predicate;

public class PredicateNotExample {
  public static void main(String[] args) {
    Predicate<String> isNull = Predicate.isNull();

    Predicate<String> isNotNull = Predicate.not(isNull);

    System.out.println(isNotNull.test("Hello")); // true
    System.out.println(isNotNull.test(null));    // false
  }
}
```

Note que `Predicate.not()` foi introduzido no Java 11. Se estiver usando o Java 8, você precisará usar o método `negate()`.

Esses métodos ajudam a escrever condições complexas de forma mais clara e concisa, aproveitando a capacidade das expressões lambda e da programação funcional em Java.

### Métodos comuns para Predicate ou BiPredicate
[[Topo]](#)<br />

- Ver projeto: [Projeto 2](./04_arquivos/proj_02/)

Em Java 8, a interface `Predicate` oferece várias operações padrão, como `and()`, `or()`, `negate()`, `isEqual()` e `not()`, que permitem combinar, modificar e inverter predicados de maneiras úteis. Esses métodos facilitam a construção de condições complexas de maneira fluente e legível. Vamos explorar cada um desses métodos com exemplos de código.

#### Collection.removeIf()

Em Java 8, a interface `Collection` foi enriquecida com o método `removeIf()`. Este método facilita a remoção de elementos de uma coleção com base em uma condição específica, expressa como um predicado (um teste booleano). O método `removeIf()` aceita um `Predicate` como argumento, que define a condição para a remoção de elementos.

O método `removeIf()` é particularmente útil porque elimina a necessidade de iterações explícitas e verificações condicionais para remover elementos, tornando o código mais limpo e mais legível.

Vamos ver um exemplo simples usando `List`:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfExample {
  public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    names.add("Alice");
    names.add("Bob");
    names.add("Charlie");
    names.add("David");

    // Criando um Predicate para testar a condição
    Predicate<String> filter = name -> name.startsWith("A");

    // Removendo todos os nomes que começam com "A"
    names.removeIf(filter);

    names.forEach(System.out::println); // Imprime Bob, Charlie, David
  }
}
```

Neste exemplo, um `Predicate<String>` é criado para filtrar os nomes que começam com a letra "A". O método `removeIf` é usado para remover todos os nomes que satisfazem esta condição da lista.

Aqui está um exemplo usando `List<Integer>` para remover números com base em uma condição:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfNumberExample {
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);

    // Removendo números ímpares
    numbers.removeIf(n -> n % 2 != 0);

    numbers.forEach(System.out::println); // Imprime 2, 4
  }
}
```

Neste exemplo, `removeIf` é usado para remover todos os números ímpares da lista. A condição para remoção é especificada por uma expressão lambda que define um `Predicate<Integer>`.

O método `removeIf()` é uma maneira eficaz e expressiva de manipular coleções em Java 8, permitindo operações de remoção baseadas em condições de maneira concisa e funcional.
