# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## 28.1. Java 8
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [01_arquivos](./01_arquivos/)
- Projetos
  - [Projeto 1](./01_arquivos/proj_01/) [(iniciado em)](#métodos-default-e-static-em-interfaces)
- Conteúdo
  - [Métodos default e static em interfaces](#métodos-default-e-static-em-interfaces)
  - [Interfaces funcionais](#interfaces-funcionais)
  - [Expressões lambda](#expressões-lambda)
  - [Variáveis "effectively final"](#variáveis-effectively-final)
  - [Referências de métodos](#referências-de-métodos)
  - [Stream API](#stream-api)
  - [Optional](#optional)
  - [Anotações repetíveis](#anotações-repetíveis)
  - [Nova API de data/hora](#nova-api-de-datahora)
  - [Processo de descontinuação (deprecate)](#processo-de-descontinuação-deprecate)

### Métodos default e static em interfaces
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./01_arquivos/proj_01/)

Na Java 8, duas novas funcionalidades foram introduzidas nas interfaces: métodos `default` e métodos `static`. Estes recursos ajudam a tornar as interfaces mais flexíveis e poderosas. Vamos entender cada um deles:

#### Métodos default

Os métodos `default` são métodos não-abstratos em uma interface. Eles permitem que você defina um comportamento padrão para um método dentro da interface. Antes do Java 8, as interfaces só podiam ter métodos abstratos (sem corpo). Com os métodos `default`, é possível adicionar novos métodos a uma interface sem quebrar as classes que a implementam.

**Exemplo de Código**:

```java
interface Veiculo {
  default void print() {
    System.out.println("Eu sou um veículo!");
  }
}

class Carro implements Veiculo {
  // Carro agora tem acesso ao método print() por padrão
}

public class Main {
  public static void main(String[] args) {
    Carro carro = new Carro();
    carro.print(); // Saída: Eu sou um veículo!
  }
}
```

#### Métodos static

Métodos estáticos em interfaces são semelhantes aos métodos estáticos em classes. Eles pertencem à interface e não à instância de uma classe que implementa esta interface. Portanto, eles podem ser chamados independentemente de uma instância de classe.

**Exemplo de Código:**
```java
interface Veiculo {
  static void buzinar() {
    System.out.println("Beep beep!");
  }
}

public class Main {
  public static void main(String[] args) {
    Veiculo.buzinar(); // Saída: Beep beep!
  }
}
```

Essas novidades do Java 8 trouxeram mais versatilidade para as interfaces, permitindo implementações padrão e métodos estáticos, o que antes era exclusivo das classes. Isso também ajuda na evolução das APIs, permitindo adicionar novos métodos às interfaces sem afetar as implementações existentes.

### Interfaces funcionais
[[Topo]](#)<br />

As interfaces funcionais são um conceito central no Java 8, especialmente no contexto da programação funcional e dos lambdas. Uma interface funcional é uma interface que contém exatamente um método abstrato. Elas são projetadas para fornecer uma funcionalidade específica e podem ser usadas, entre outras coisas, para instanciar lambdas de maneira concisa.

#### Características das interfaces funcionais
- **Um Único Método Abstrato**: A principal característica de uma interface funcional é que ela deve ter apenas um método abstrato.
- **Anotação `@FunctionalInterface`**: Esta anotação é opcional, mas é uma boa prática usá-la. Ela ajuda a documentar a interface como funcional e também causa um erro de compilação se a interface não atender aos critérios (ou seja, ter mais de um método abstrato).

#### Exemplos de interfaces funcionais
- **`Runnable`**: Esta é uma interface funcional bem conhecida no Java, utilizada para definir um bloco de código que pode ser executado por threads.

```java
Runnable r = () -> System.out.println("Hello from a thread!");
new Thread(r).start();
```

- **`Consumer`**: Uma interface funcional que aceita um único argumento e não retorna nenhum resultado.
```java
Consumer<String> consumer = s -> System.out.println(s);
consumer.accept("Hello, World!"); // Saída: Hello, World!
```

- **`Function`**: Aceita um argumento e produz um resultado.
```java
Function<String, Integer> lengthFunction = s -> s.length();
int length = lengthFunction.apply("Hello"); // length é 5
```

- **Criando sua própria interface funcional**: 
```java
@FunctionalInterface
interface StringToIntMapper {
  int map(String s);
}

StringToIntMapper mapper = s -> s.length();
System.out.println(mapper.map("Hello")); // Saída: 5
```

As interfaces funcionais são um pilar importante do Java 8, pois permitem a programação funcional e o uso eficiente de expressões lambda. Elas são amplamente utilizadas nas Streams API, em operações de coleções e onde quer que seja necessário passar comportamento como um argumento.

### Expressões lambda
[[Topo]](#)<br />

As expressões lambda, introduzidas no Java 8, são uma forma poderosa e concisa de representar uma instância de uma interface funcional. Uma expressão lambda é essencialmente uma função anônima - ela não tem um nome, mas tem uma lista de parâmetros, um corpo, um tipo de retorno e, potencialmente, uma lista de exceções que podem ser lançadas.

#### Características das expressões lambda

1. **Sintaxe concisa**: Reduz a verbosidade do código, tornando-o mais legível.
2. **Facilita a programação funcional**: Permite tratar a funcionalidade como um método de argumento, ou código como dados.
3. **Utilização com interfaces funcionais**: Podem ser usadas em qualquer lugar onde uma interface funcional é esperada.

#### Sintaxe básica

A sintaxe de uma expressão lambda é:
```java
(argumentos) -> { corpo }
```

#### Exemplos de uso de expressões lambda
- **Implementando uma Interface Funcional `Runnable`**:
```java
Runnable r = () -> System.out.println("Hello World!");
new Thread(r).start();
```

- **Utilizando com `Collections`**:
```java
List<String> list = Arrays.asList("a", "b", "c");
list.forEach(element -> System.out.println(element));
```

- **Trabalhando com Streams**:
```java
List<String> list = Arrays.asList("apple", "banana", "cherry");
list.stream()
  .filter(s -> s.startsWith("a"))
  .forEach(System.out::println); // Imprime "apple"
```

- **Operações com `Comparator`**:
```java
List<String> list = Arrays.asList("banana", "apple", "cherry");
Collections.sort(list, (s1, s2) -> s1.compareTo(s2));
```

- **Uso em interfaces personalizadas**:
```java
@FunctionalInterface
interface StringFunction {
  String apply(String s);
}

StringFunction exclaim = s -> s + "!";
StringFunction ask = s -> s + "?";
System.out.println(exclaim.apply("Hello")); // Hello!
System.out.println(ask.apply("Hello")); // Hello?
```

As expressões lambda trazem um estilo de programação mais funcional para o Java, permitindo escrever código mais limpo e conciso, especialmente quando se trabalha com coleções, threads e APIs funcionais.

### Variáveis "effectively final"
[[Topo]](#)<br />

No Java 8, o conceito de "effectively final" foi introduzido. Uma variável é considerada "effectively final" quando seu valor não é modificado após a inicialização. Mesmo que a variável não seja explicitamente declarada como `final`, ela é tratada como tal se nunca for alterada depois de inicializada. Esse conceito é especialmente importante no contexto de expressões lambda e classes anônimas.

#### Por que "effectively final" é importante?

Em Java, as variáveis locais acessadas de uma classe interna anônima ou lambda devem ser finais ou effectively final. Antes do Java 8, as variáveis precisavam ser explicitamente declaradas como `final`. No entanto, a partir do Java 8, se uma variável é modificada apenas uma vez, o compilador a trata como final, mesmo sem a palavra-chave `final`.

#### Exemplo com lambda

```java
String message = "Hello"; // A variável 'message' é effectively final
Runnable r = () -> System.out.println(message); // Usando em lambda
// message = "World"; // Descomente esta linha causará um erro de compilação
```

Neste exemplo, `message` é effectively final porque é atribuída uma vez e nunca é modificada depois disso. Portanto, ela pode ser usada dentro da expressão lambda.

#### Exemplo com classe anônima

```java
String greeting = "Hello"; // A variável 'greeting' é effectively final
new Thread(new Runnable() {
  @Override
  public void run() {
    System.out.println(greeting); // Usando em uma classe anônima
  }
}).start();
// greeting = "Goodbye"; // Descomente esta linha causará um erro de compilação
```

Aqui, a variável `greeting` é utilizada dentro de uma classe anônima. Se tentarmos modificar o valor de `greeting` após sua utilização na classe anônima, o compilador gerará um erro.

#### Benefícios

A regra de effectively final permite um uso mais flexível de variáveis locais em expressões lambda e classes anônimas, mantendo a integridade e segurança da programação funcional e concorrente. Isso ajuda a evitar erros comuns em ambientes multithread, onde a mutabilidade de variáveis compartilhadas pode levar a condições de corrida e outros problemas de sincronização.

### Referências de métodos
[[Topo]](#)<br />

As referências de métodos no Java 8 são uma forma concisa de expressar uma expressão lambda que invoca um método existente. Em vez de fornecer uma implementação de um método diretamente em uma expressão lambda, você pode referenciar um método existente que realiza a ação desejada. Essa funcionalidade ajuda a tornar o código mais claro e mais reutilizável.

#### Sintaxe Básica

A sintaxe para referências de métodos é:
```
NomeDaClasse::nomeDoMétodo
```

Existem quatro tipos principais de referências de métodos:
1. **Referência a um método estático**: `Classe::métodoEstático`
2. **Referência a um método de instância de um objeto particular**: `instância::métodoDeInstância`
3. **Referência a um método de instância de um objeto de um tipo particular**: `Classe::métodoDeInstância`
4. **Referência a um construtor**: `Classe::new`

#### Exemplos de referências de métodos

- **Referência a um método estático**
```java
List<String> list = Arrays.asList("a", "b", "c");
list.forEach(System.out::println); // Referência ao método estático println
```

- **Referência a um método de instância de um objeto particular**
```java
String str = "Hello";
Supplier<Integer> lengthSupplier = str::length; // Referência ao método de instância length
System.out.println(lengthSupplier.get()); // Saída: 5
```

- **Referência a um método de instância de um objeto de um tipo particular**
```java
List<String> strings = Arrays.asList("one", "two", "three");
strings.replaceAll(String::toUpperCase); // Referência ao método toUpperCase
```

- **Referência a um construtor**
```java
List<String> names = Arrays.asList("John", "Doe", "Jane");
Stream<User> userStream = names.stream().map(User::new); // Referência ao construtor User(String)
```

Neste último exemplo, supomos que a classe `User` tenha um construtor que aceita um `String`.

As referências de métodos são úteis para tornar o código mais legível e expressivo, especialmente ao trabalhar com APIs funcionais, como Streams em Java. Elas permitem que você reuse métodos existentes em vez de escrever lambdas para operações que já foram definidas.

### Stream API
[[Topo]](#)<br />

A Stream API em Java 8 é uma nova abstração que permite processar sequências de elementos de forma declarativa. Ela é particularmente útil para realizar operações em coleções de maneira eficiente e concisa. As Streams são diferentes das coleções tradicionais, pois elas são projetadas para suportar operações de alto nível baseadas em expressões lambda e métodos de referência.

Aqui estão alguns pontos-chave sobre a Stream API:

1. **Não armazenam dados**: Streams não armazenam elementos. Eles obtêm elementos de uma fonte, como coleções, arrays ou I/O channels.
2. **Operações funcionais**: Streams suportam muitas operações que são funcionalmente orientadas, como map, filter, reduce, find, match, e sort.
3. **Pode ser infinita**: Streams pode ser finita ou infinita.
4. **Lazyness e consumíveis**: Operações de stream são lazy (preguiçosas), o que significa que elas são executadas apenas quando necessário. Streams são consumidos uma vez e não podem ser reutilizados.

Vamos ver alguns exemplos:

#### Exemplo 1: filtrar e coletar

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
  public static void main(String[] args) {
    List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
    
    // Filtrar strings não vazias e coletar em uma lista
    List<String> filtered = strings.stream()
      .filter(string -> !string.isEmpty())
      .collect(Collectors.toList());
    System.out.println(filtered);
  }
}
```

#### Exemplo 2: Uso de map para transformar elementos

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

    // Aplicar a função quadrada em cada elemento da lista
    List<Integer> squaresList = numbers.stream()
      .map(i -> i * i)
      .distinct()
      .collect(Collectors.toList());
    System.out.println(squaresList);
  }
}
```

#### Exemplo 3: Uso de reduce para reduzir a um resultado

```java
import java.util.Arrays;
import java.util.List;

public class StreamReduceExample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6);

    // Reduzir para a soma dos elementos
    int result = numbers.stream().reduce(0, (subtotal, element) -> subtotal + element);
    System.out.println(result);
  }
}
```

Estes exemplos mostram como a Stream API pode tornar seu código mais legível e eficiente, especialmente ao lidar com conjuntos de dados grandes ou operações complexas de processamento de dados.

### Optional
[[Topo]](#)<br />

A classe `Optional` em Java 8 é um contêiner de objeto que pode ou não conter um valor não-nulo. Seu principal propósito é fornecer um meio para expressar a presença opcional de um valor, evitando assim o uso de `null`. Isso ajuda a prevenir erros comuns de `NullPointerException` em Java.

Aqui estão alguns pontos-chave sobre `Optional`:

1. **Evita `NullPointerException`**: `Optional` ajuda a tratar de forma explícita a ausência de valor, reduzindo a probabilidade de `NullPointerException`.
2. **Não é um substituto para tudo**: `Optional` não deve ser usado em todos os lugares; seu uso é mais adequado para retornos de método onde há uma chance clara de que possa não haver um valor a retornar.
3. **Métodos de apoio**: Inclui vários métodos úteis como `orElse`, `ifPresent`, e `orElseThrow`, que facilitam o trabalho com valores que podem ou não estar presentes.

Abaixo estão alguns exemplos de como usar a classe `Optional`.

#### Exemplo 1: Criando Optional e verificando valor

```java
import java.util.Optional;

public class OptionalExample {
  public static void main(String[] args) {
    // Cria um Optional vazio
    Optional<String> empty = Optional.empty();

    // Cria um Optional com valor
    Optional<String> value = Optional.of("Hello World");

    // Verifica se um valor está presente
    if (value.isPresent()) {
      System.out.println("Valor disponível.");
    } else {
      System.out.println("Valor não disponível.");
    }
  }
}
```

#### Exemplo 2: Usando orElse e orElseGet

```java
import java.util.Optional;

public class OptionalOrElseExample {
  public static void main(String[] args) {
    Optional<String> optional = Optional.ofNullable(null);

    // Usa orElse para fornecer um valor padrão se não houver valor presente
    String result = optional.orElse("Valor padrão");
    System.out.println(result);

    // Usa orElseGet para fornecer um valor padrão por meio de um lambda/supplier
    result = optional.orElseGet(() -> "Valor gerado");
    System.out.println(result);
  }
}
```

#### Exemplo 3: Usando ifPresent e orElseThrow

```java
import java.util.Optional;

public class OptionalIfPresentExample {
  public static void main(String[] args) {
    Optional<String> optional = Optional.ofNullable("Hello");

    // Executa uma ação se o valor estiver presente
    optional.ifPresent(value -> System.out.println("Valor encontrado: " + value));

    // Lança uma exceção se o valor não estiver presente
    String result = Optional.ofNullable(null)
      .orElseThrow(() -> new IllegalStateException("Valor não encontrado"));
  }
}
```

Esses exemplos ilustram como `Optional` pode ser usado para lidar com valores que podem ou não estar presentes, tornando o código mais robusto e legível.

### Anotações repetíveis
[[Topo]](#)<br />

As anotações repetíveis, introduzidas no Java 8, permitem que a mesma anotação seja usada várias vezes no mesmo local de declaração. Antes do Java 8, não era possível aplicar a mesma anotação mais de uma vez ao mesmo elemento. Com as anotações repetíveis, você pode fazer isso, o que aumenta a expressividade e a flexibilidade do código.

Para criar uma anotação repetível, você precisa seguir três etapas principais:

1. **Definir a anotação**: Crie a anotação que deseja tornar repetível.
2. **Definir o contêiner da anotação**: Crie uma anotação contêiner que armazenará várias instâncias da anotação repetível.
3. **Usar `@Repeatable`**: Marque a anotação original com `@Repeatable`, referenciando a anotação contêiner.

Aqui está um exemplo detalhado:

#### Passo 1: Definir a anotação

```java
import java.lang.annotation.Repeatable;

// Anotação que pode ser repetida
@Repeatable(Roles.class)
public @interface Role {
  String value();
}
```

#### Passo 2: Definir o contêiner da anotação

```java
public @interface Roles {
  Role[] value();
}
```

Neste exemplo, `Roles` é o contêiner para a anotação `Role`. Ele contém um array de `Role`.

#### Passo 3: Aplicar a anotação repetível

```java
public class User {

  @Role("ADMIN")
  @Role("USER")
  public void doSomething() {
    // Código aqui
  }
}
```

Neste exemplo, a anotação `Role` é aplicada duas vezes ao método `doSomething`. Graças ao uso de anotações repetíveis, é possível atribuir múltiplos "papéis" a este método.

#### Recuperando as anotações repetíveis

Você pode recuperar anotações repetíveis de um elemento usando métodos de reflexão:

```java
import java.lang.reflect.Method;

public class TestAnnotations {
  public static void main(String[] args) throws Exception {
    Method method = User.class.getMethod("doSomething");

    // Obtendo todas as anotações Role
    Role[] roles = method.getAnnotationsByType(Role.class);
    for (Role role : roles) {
      System.out.println("Role: " + role.value());
    }
  }
}
```

Esse código recupera e imprime todas as anotações `Role` aplicadas ao método `doSomething`.

O uso de anotações repetíveis torna o código mais limpo e claro, evitando a necessidade de anotações de contêiner desnecessariamente complexas. Isso é particularmente útil em configurações e definições de metadados, onde um elemento pode precisar ser associado a múltiplas configurações ou propriedades.

### Nova API de data/hora
[[Topo]](#)<br />

A API de Data e Hora introduzida no Java 8 representa uma melhoria significativa em relação às antigas classes `java.util.Date` e `java.util.Calendar`. Esta nova API, localizada no pacote `java.time`, é imutável e thread-safe, oferecendo uma abordagem mais clara e mais flexível para trabalhar com data e hora.

Principais características:

1. **Imutabilidade**: As classes são imutáveis e thread-safe, o que facilita o manuseio em ambientes multi-thread.
2. **Clareza**: Nomes e funções das classes são mais claros e descritivos, tornando a API mais intuitiva.
3. **Separar data e hora**: Data (`LocalDate`), hora (`LocalTime`), e a combinação de ambos (`LocalDateTime`) são representados por classes separadas.
4. **Fuso horário e offset**: Trabalha com fusos horários (`ZonedDateTime`) e offset de tempo (`OffsetDateTime`).
5. **Precisão de nanossegundos**: Suporta precisão de até nanossegundos.
6. **Operações de data e hora**: Facilita operações como adição, subtração, comparação, formatação e parsing de datas e horas.

Vamos ver alguns exemplos de como usar esta API:

#### Exemplo 1: Trabalhando com LocalDate, LocalTime e LocalDateTime

```java
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class DateTimeExample {
  public static void main(String[] args) {
    // Data atual
    LocalDate date = LocalDate.now();
    System.out.println("Data atual: " + date);

    // Hora atual
    LocalTime time = LocalTime.now();
    System.out.println("Hora atual: " + time);

    // Data e hora atuais
    LocalDateTime dateTime = LocalDateTime.now();
    System.out.println("Data e hora atuais: " + dateTime);
  }
}
```

#### Exemplo 2: Manipulação de data e hora

```java
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class DateTimeManipulationExample {
  public static void main(String[] args) {
    LocalDate date = LocalDate.now();

    // Adiciona 1 semana à data atual
    LocalDate nextWeek = date.plusWeeks(1);
    System.out.println("Data da próxima semana: " + nextWeek);

    // Subtrai 2 horas da hora atual
    LocalTime time = LocalTime.now();
    LocalTime twoHoursBefore = time.minusHours(2);
    System.out.println("Duas horas atrás: " + twoHoursBefore);

    // Adiciona 6 meses e 4 horas à data e hora atuais
    LocalDateTime dateTime = LocalDateTime.now();
    LocalDateTime futureDateTime = dateTime.plusMonths(6).plusHours(4);
    System.out.println("Futuro data e hora: " + futureDateTime);
  }
}
```

#### Exemplo 3: Trabalhando com ZonedDateTime

```java
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class ZonedDateTimeExample {
  public static void main(String[] args) {
    // Data e hora atual com fuso horário
    ZonedDateTime zonedDateTime = ZonedDateTime.now();
    System.out.println("ZonedDateTime atual: " + zonedDateTime);

    // Data e hora em um fuso horário específico
    ZonedDateTime zonedDateTimeInTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
    System.out.println("Data e hora em Tóquio: " + zonedDateTimeInTokyo);
  }
}
```

Estes exemplos ilustram a facilidade e flexibilidade da nova API de Data e Hora do Java 8, proporcionando uma maneira robusta e intuitiva de trabalhar com datas, horas, e fusos horários.

### Processo de descontinuação (deprecate)
[[Topo]](#)<br />

O deprecating no Java é um processo pelo qual a Oracle e a comunidade de desenvolvedores Java sinalizam que um método, classe, interface ou outro membro da API do Java está obsoleto, ou seja, não é mais recomendado para uso. Isso geralmente ocorre porque foi substituído por uma opção melhor e mais eficiente ou porque não é mais considerado uma boa prática.

#### Como funciona o deprecating no Java 8

1. **Anotação `@Deprecated`**: 
  - Quando um elemento da API (método, classe, interface, etc.) é considerado obsoleto, ele é marcado com a anotação `@Deprecated`.
  - Isso serve como um aviso para os desenvolvedores de que o elemento não deve mais ser usado e que existem alternativas preferíveis.
2. **Documentação Javadoc**:
  - É uma boa prática documentar o motivo da deprecação no Javadoc do elemento, explicando por que ele foi depreciado e fornecendo alternativas recomendadas.
  - O Javadoc para um item depreciado geralmente inclui uma tag `@deprecated`, que fornece detalhes adicionais.
3. **Compilação com avisos**:
  - Ao compilar um código que usa elementos descontinuados, o compilador Java emite avisos.
  - Esses avisos não impedem a compilação ou execução do programa, mas servem como um alerta para que os desenvolvedores atualizem seu código.

#### Propósito do deprecating

- **Transição suave**: A descontinuação permite uma transição suave para novas práticas ou APIs sem interromper o código existente. Isso fornece tempo para os desenvolvedores ajustarem seus códigos.
- **Manutenção e evolução**: Permite que a linguagem Java e suas bibliotecas evoluam, removendo ou substituindo funcionalidades antigas ou problemáticas.
- **Segurança e performance**: Muitas vezes, elementos são descontinuados devido a preocupações com segurança, performance ou ambos.

#### Exemplo de uso

```java
/**
 * @deprecated As of Java 8, replaced by {@link java.time.LocalDate}
 */
@Deprecated
public class Date {...}
```

#### Importante

- **Deprecating não é remoção**: Um elemento descontinuado ainda está presente e funcional na linguagem, mas pode ser removido em versões futuras.
- **Atualização de código**: É uma boa prática atualizar o código para não utilizar elementos depreciados para garantir a compatibilidade futura e aderir às melhores práticas atuais.

A deprecação é uma ferramenta vital na gestão do ciclo de vida de uma linguagem de programação, permitindo que ela cresça e melhore ao longo do tempo enquanto fornece um caminho claro para os desenvolvedores se adaptarem às mudanças.
