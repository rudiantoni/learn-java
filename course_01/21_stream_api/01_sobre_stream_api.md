# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## 21.1. Sobre a Stream API
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [01_arquivos](./01_arquivos/)
- Projetos
  - [Projeto 1](./01_arquivos/proj_01/) [(iniciado em)](#casos-de-uso)
- Conteúdo
  - [O que é a Stream API](#o-que-é-a-stream-api)
  - [Esteira transportadora (conveyor belt)](#esteira-transportadora-conveyor-belt)
  - [Pacote java.util.stream](#pacote-javautilstream)
  - [Casos de uso](#casos-de-uso)
  - [Como criar uma Stream](#como-criar-uma-stream)
  - [Operações intermediárias](#operações-intermediárias)
  - [Operações terminais](#operações-terminais)

### O que é a Stream API
[[Topo]](#)<br />

A Stream API, introduzida no Java 8, é uma das mudanças mais significativas na linguagem Java, pois ela traz uma nova abordagem para processar coleções de dados de forma declarativa e funcional. A ideia central da Stream API é proporcionar uma maneira de realizar operações sequenciais e paralelas sobre esses dados de maneira eficiente e legível.

#### Conceitos chave da Stream API

- **Stream**: Uma stream é uma sequência de elementos suportando operações de agregação sequenciais e paralelas. Ela não armazena os dados. Em vez disso, as streams transportam dados de uma fonte (como uma coleção, um array, um gerador de dados ou operações de E/S) através de um pipeline de operações.
- **Pipeline de operações**: As operações com streams são compostas em um pipeline, que consiste em uma fonte (por exemplo, uma coleção), operações intermediárias (como filtrar ou mapear) e operações terminais (como reduzir ou coletar). 
- **Operações não terminais (intermediárias)**: São operações que transformam uma stream em outra stream, como `filter`, `map`, e `sorted`. Elas são preguiçosas, o que significa que elas não são executadas até que uma operação terminal seja invocada.
- **Operações terminais**: São operações que produzem um resultado ou um efeito colateral, como `forEach`, `reduce`, `collect`, e `toArray`. Quando uma operação terminal é realizada, o pipeline de stream é consumido e não pode ser usado novamente.
- **Paralelismo**: Uma das grandes vantagens da Stream API é a capacidade de processar dados de forma paralela sem a necessidade de código multithread explícito. Isso é feito através da criação de streams paralelas, que podem dividir o processamento de dados em múltiplas threads, aproveitando os recursos de CPUs multicore.
- **Não-mutabilidade**: As operações realizadas em streams não alteram a fonte de dados, proporcionando segurança em ambientes concorrentes e evitando efeitos colaterais.

#### Vantagens da Stream API:

- **Legibilidade e concisão**: A Stream API permite escrever código mais conciso e legível, especialmente ao trabalhar com coleções.
- **Expressões lambda**: Trabalha em conjunto com as expressões lambda para proporcionar uma sintaxe clara e expressiva.
- **Paralelismo transparente**: Facilita o processamento paralelo de dados, o que pode levar a um melhor desempenho em operações computacionalmente intensivas.
- **Estilo funcional de programação**: Encoraja um estilo de programação mais funcional, o que ajuda a evitar bugs comuns relacionados ao estado mutável e ao acesso concorrente.

Em resumo, a Stream API no Java 8 introduz uma nova e poderosa forma de processar coleções de dados de forma declarativa, eficiente e paralela, promovendo um estilo de programação mais funcional e expressivo.

Na Stream API do Java 8, as operações aplicadas a streams são classificadas em dois tipos principais: operações terminais e operações intermediárias (não terminais). Essa distinção é fundamental para entender como as streams funcionam e como são processadas.

#### Operações intermediárias (não terminais)

As operações intermediárias são aquelas que transformam uma stream em outra stream. Essas operações são "preguiçosas", o que significa que elas não são executadas imediatamente. Em vez disso, elas são executadas apenas quando uma operação terminal é invocada. Durante a execução de uma operação terminal, todas as operações intermediárias configuradas anteriormente são processadas em sequência. Exemplos comuns de operações intermediárias incluem `filter`, `map`, `sorted`, `distinct`, `limit`, entre outras.

- **filter**: Retorna uma stream incluindo elementos que correspondem a um predicado dado.
- **map**: Transforma os elementos de uma stream usando uma função de mapeamento.
- **sorted**: Produz uma stream cujos elementos são ordenados de acordo com um critério especificado.

#### Operações Terminais

As operações terminais são aquelas que produzem um resultado ou um efeito colateral a partir do conteúdo da stream. Quando uma operação terminal é executada, o pipeline da stream é consumido, e a stream não pode mais ser utilizada para operações adicionais. As operações terminais são "eager", ou seja, elas são executadas imediatamente e processam todos os elementos da stream. Exemplos comuns de operações terminais incluem `forEach`, `collect`, `reduce`, `anyMatch`, `allMatch`, `noneMatch`, `findFirst`, `findAny`, entre outras.

- **forEach**: Executa uma ação para cada elemento da stream.
- **collect**: Agrega os elementos da stream em uma coleção ou outro tipo de agregado.
- **reduce**: Combina os elementos da stream usando uma operação binária para produzir um único resultado cumulativo.
- **anyMatch**, **allMatch**, **noneMatch**: São operações de curto-circuito que retornam um valor booleano com base em predicados aplicados aos elementos da stream.

Essencialmente, as operações intermediárias preparam o pipeline de processamento, definindo como os dados devem ser transformados ou filtrados, mas não realizam nenhum processamento até que uma operação terminal seja chamada. A operação terminal, por outro lado, desencadeia o processamento e produz um resultado final ou um efeito colateral.

### Esteira transportadora (conveyor belt)
[[Topo]](#)<br />

O conceito de "esteira transportadora" na Stream API é uma analogia usada para descrever como as streams operam, funcionando como uma linha de montagem em uma fábrica, onde cada operação intermediária e terminal na stream manipula os elementos de dados sequencialmente, semelhante a como objetos são processados em uma esteira transportadora.

#### Como funciona a esteira transportadora em streams

- **Fonte de dados**: A esteira começa com a fonte de dados, que pode ser uma coleção, um array, um gerador, entre outros. Esta fonte alimenta os dados na stream.
- **Operações intermediárias (não terminal)**: Em seguida, os dados passam por uma ou mais operações intermediárias, como `filter`, `map`, e `sorted`. Cada operação intermediária é como uma estação na linha de montagem, onde uma transformação específica ou filtragem é aplicada aos elementos. Importante notar que estas operações são preguiçosas - elas não são executadas até que uma operação terminal seja invocada.
- **Operação terminal**: No final da esteira, uma operação terminal é aplicada. Esta operação pode ser a coleta dos elementos processados em uma nova coleção, a redução dos elementos a um valor único, ou uma iteração sobre cada elemento. A operação terminal inicia o processamento de todas as operações intermediárias e consome a stream.
- **Processamento sequencial ou paralelo**: Durante o trajeto na esteira, os elementos podem ser processados sequencialmente (um por vez) ou em paralelo (múltiplos elementos simultaneamente, aproveitando múltiplos núcleos do processador).

#### Analogia com a esteira transportadora

A analogia da esteira transportadora ajuda a entender o fluxo de dados em uma stream. Assim como em uma fábrica onde cada estação na linha de montagem modifica ou inspeciona um produto antes de passá-lo para a próxima estação, em uma stream, cada operação modifica ou inspeciona os elementos antes de passá-los adiante no pipeline. E assim como uma esteira transportadora em uma fábrica só começa a se mover quando um produto é colocado nela e uma ação final é necessária (como embalar o produto), uma stream só inicia seu processamento quando uma operação terminal é invocada. 

Essa abordagem promove um estilo de programação mais declarativo e funcional, onde você descreve o que quer fazer com os dados (as operações intermediárias) e o que quer como resultado final (a operação terminal), sem se preocupar com os detalhes de como os dados são percorridos e processados.

### Pacote java.util.stream
[[Topo]](#)<br />

O pacote `java.util.stream` no Java 8 representa uma das principais adições à linguagem Java, introduzindo um novo modelo de programação funcional para processar sequências de elementos de forma declarativa. Este pacote permite manipular coleções e outras formas de fluxos de dados de maneira mais eficiente e legível. Abaixo está um resumo das principais características do pacote `java.util.stream`:

#### Principais componentes

- **Streams**: Representa uma sequência de elementos e oferece várias operações para realizar computações sobre esses elementos. Os tipos principais são `Stream<T>`, `IntStream`, `LongStream`, e `DoubleStream`.
- **Operações intermediárias**: Operações que transformam uma stream em outra stream, tais como `filter`, `map`, e `sorted`. Essas operações são preguiçosas, o que significa que elas são avaliadas apenas quando uma operação terminal é invocada.
- **Operações terminais**: Operações que produzem um resultado ou um efeito colateral, finalizando o pipeline de processamento da stream. Exemplos incluem `forEach`, `collect`, `reduce`, e `toArray`.
- **Collectors**: Classes e métodos em `java.util.stream.Collectors` que fornecem funcionalidades comuns de redução, tais como agrupar elementos, somar elementos, etc.

#### Funcionalidades chave

- **Processamento paralelo e concorrente**: Capacidade de processar dados de maneira paralela, dividindo o trabalho entre múltiplas threads, o que é especialmente útil para operações em grandes volumes de dados e aproveitamento de CPUs multicore.
- **Operações de agregação**: Facilidade para realizar operações como min, max, sum, average, e contagem, em streams de elementos.
- **Redução e coleta de dados**: Capacidade de transformar streams em coleções ou outros tipos de dados agregados.
- **Operações de filtragem e mapeamento**: Métodos para filtrar e transformar elementos em streams, incluindo a capacidade de mapear elementos para diferentes tipos.

#### Benefícios

- **Programação funcional**: Encoraja um estilo de programação mais funcional e declarativo, que pode levar a código mais limpo e menos propenso a erros.
- **Legibilidade e concisão**: Reduz a complexidade do código e aumenta a legibilidade, especialmente ao trabalhar com coleções.
- **Eficiência**: Permite processamento de dados de maneira eficiente, especialmente com grandes volumes de dados e em sistemas multicore.

O pacote `java.util.stream` é um elemento crucial do Java 8, pois traz um novo paradigma para processar dados de maneira funcional, declarativa e eficiente, representando um avanço significativo na linguagem Java.

### Casos de uso
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./01_arquivos/proj_01/)

A Stream API em Java 8 é uma ferramenta poderosa para processamento de coleções de forma funcional e eficiente. Vamos explorar diferentes cenários de uso, desde os mais básicos até os mais avançados.

#### Criação de Streams

Antes de entrar nos casos de uso, é importante saber como criar uma Stream. Você pode criar Streams a partir de várias fontes, como coleções:

```java
List<String> list = Arrays.asList("a", "b", "c");
Stream<String> stream = list.stream();
```

#### Operações básicas

##### forEach

Usado para iterar sobre cada elemento da stream.

```java
stream.forEach(System.out::println);
```

##### map

Transforma cada elemento da stream. Por exemplo, para converter todas as strings em maiúsculas:

```java
list.stream().map(String::toUpperCase).forEach(System.out::println);
```

##### filter

Filtra elementos baseados em uma condição. Por exemplo, filtrar apenas strings que são iguais a "a":

```java
list.stream().filter(s -> s.equals("a")).forEach(System.out::println);
```

#### Operações intermediárias avançadas

##### flatMap

Transforma cada elemento da stream em zero ou mais elementos.

```java
List<List<String>> list = Arrays.asList(Arrays.asList("a"), Arrays.asList("b"));
list.stream().flatMap(Collection::stream).forEach(System.out::println);
```

##### distinct

Remove elementos duplicados.

```java
Arrays.asList("a", "b", "a").stream().distinct().forEach(System.out::println);
```

##### sorted

Ordena os elementos da stream.

```java
Arrays.asList("b", "a", "c").stream().sorted().forEach(System.out::println);
```

#### Operações terminais complexas

##### collect

Coleta os elementos da stream em uma coleção.

```java
List<String> collected = stream.collect(Collectors.toList());
```

##### reduce

Combina todos os elementos da stream em um único resultado.

```java
String concatenated = list.stream().reduce("", (a, b) -> a + b);
```

##### anyMatch, allMatch, noneMatch

Estas operações ajudam a verificar condições na stream.

```java
boolean anyMatch = list.stream().anyMatch(s -> s.contains("a"));
boolean allMatch = list.stream().allMatch(s -> s.contains("a"));
boolean noneMatch = list.stream().noneMatch(s -> s.contains("a"));
```

#### Operações paralelas

Para processamento paralelo, você pode usar `parallelStream()`:

```java
list.parallelStream().map(String::toUpperCase).forEach(System.out::println);
```

#### Uso avançado

##### Combinação de operações

Streams podem ser combinadas para formar operações complexas.

```java
list.stream()
  .filter(s -> s.length() > 1)
  .map(String::toUpperCase)
  .sorted()
  .forEach(System.out::println);
```

##### Streams infinitos

Streams infinitos podem ser criados com `Stream.iterate` ou `Stream.generate`.

```java
Stream.iterate(0, n -> n + 1)
  .limit(10)
  .forEach(System.out::println);
```

##### Uso de Optional com Streams

Optional pode ser usado com Streams para operações mais seguras.

```java
Optional<String> result = list.stream().findFirst();
result.ifPresent(System.out::println);
```

Estes são alguns dos casos de uso básicos e avançados da Stream API em Java 8. Com a prática, você descobrirá ainda mais maneiras poderosas de manipular e processar dados com Streams.

### Como criar uma Stream
[[Topo]](#)<br />

- A partir de uma Collection

```java
List<String> myList = Arrays.asList("apple", "banana", "cherry");
Stream<String> stream = myList.stream();
```

- A partir de um Array

```java
String[] myArray = new String[]{"apple", "banana", "cherry"};
Stream<String> stream = Arrays.stream(myArray);
```

- A partir de um arquivo

```java
Path path = Paths.get("myFile.txt");
try (Stream<String> stream = Files.lines(path)) {
    stream.forEach(System.out::println);
}
```

- A partir de uma String

```java
String str = "apple";
IntStream stream = str.chars();
```

- Usando Stream.of()

```java
Stream<String> stream = Stream.of("apple", "banana", "cherry");
```

- Usando StreamBuilder

```java
Stream.Builder<String> builder = Stream.builder();
builder.accept("apple");
builder.accept("banana");
builder.accept("cherry");
Stream<String> stream = builder.build();
```

- Usando parallelStream()

```java
List<String> myList = Arrays.asList("apple", "banana", "cherry");
Stream<String> parallelStream = myList.parallelStream();
```

- Usando Stream.iterate()

Para criar uma Stream infinita usando iteração:

```java
Stream<Integer> infiniteStream = Stream.iterate(0, n -> n + 1);
```

- Usando Stream.generate()

Para criar uma Stream infinita usando um Supplier:

```java
Stream<Double> randomNumbers = Stream.generate(Math::random);
```

Lembre-se que as Streams criadas pelos métodos `Stream.iterate()` e `Stream.generate()` são infinitas. Você geralmente vai querer usar operações como `limit()` para restringir o número de elementos processados.

### Operações intermediárias
[[Topo]](#)<br />

Vamos explorar as operações intermediárias na Stream API do Java 8, fornecendo exemplos para cada uma. Primeiro, criaremos uma Stream a partir de uma Collection para usar nos exemplos:

- **filter()**: Filtra elementos com base em uma condição.

```java
stream.filter(s -> s.startsWith("b")).forEach(System.out::println);  // banana
```

- **map()**: Transforma cada elemento da Stream.

```java
stream.map(String::toUpperCase).forEach(System.out::println);  // APPLE, BANANA, CHERRY, ...
```

- **mapToInt(), mapToDouble(), mapToLong()**: Converte a Stream para uma Stream de tipos primitivos.

```java
list.stream().mapToInt(String::length).forEach(System.out::println);  // Comprimento de cada string
```

- **flatMap(), flatMapToInt(), flatMapToDouble(), flatMapToLong()**: Achata Streams de Streams em uma única Stream.

```java
List<List<String>> list = Arrays.asList(
  Arrays.asList("apple", "banana"),
  Arrays.asList("cherry", "date")
);
list.stream().flatMap(Collection::stream).forEach(System.out::println);  // apple, banana, cherry, date
```

- *skip()*: Pula os primeiros N elementos da Stream.

```java
stream.skip(2).forEach(System.out::println);  // cherry, date, elderberry
```

- **distinct()**: Remove elementos duplicados.

```java
Arrays.asList("apple", "banana", "apple").stream().distinct().forEach(System.out::println);  // apple, banana
```

- **peek()**: Executa uma ação para cada elemento sem alterar a Stream.

```java
stream.peek(System.out::println).map(String::toUpperCase).forEach(System.out::println);  // Imprime cada elemento e depois o transforma
```

- **limit()**: Limita o número de elementos.

```java
stream.limit(3).forEach(System.out::println);  // apple, banana, cherry
```

- **sorted()**: Ordena os elementos da Stream.

```java
stream.sorted().forEach(System.out::println);  // Ordena alfabeticamente
```

Estas operações intermediárias podem ser encadeadas para criar pipelines de processamento de dados complexos e eficientes. Lembre-se de que as operações intermediárias são preguiçosas, ou seja, elas não são executadas até que uma operação terminal (como `forEach()`) seja invocada na Stream.

### Operações terminais
[[Topo]](#)<br />

As operações terminais nas Streams do Java 8 são aquelas que produzem um resultado final ou um efeito colateral (como a impressão de elementos). Vou apresentar exemplos para cada uma dessas operações, utilizando a seguinte Stream como base:

```java
List<String> list = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
Stream<String> stream = list.stream();
```

- **collect()**: Agrupa elementos da Stream em uma coleção ou outra estrutura de dados.

```java
List<String> collectedList = stream.collect(Collectors.toList());
```

- **forEach()**: Executa uma ação para cada elemento da Stream.

```java
stream.forEach(System.out::println);
```

- **toArray()**: Converte a Stream em um array.

```java
Object[] array = stream.toArray();
String[] array = stream.toArray(String[]::new);
```

- **findFirst()**: Retorna o primeiro elemento da Stream, se presente.

```java
Optional<String> first = stream.findFirst();
first.ifPresent(System.out::println);
```

- **findAny()**: Retorna qualquer elemento da Stream, se presente. Útil em Streams paralelas.

```java
Optional<String> any = stream.findAny();
any.ifPresent(System.out::println);
```

- **count()**: Retorna o número de elementos na Stream.

```java
long count = stream.count();
```

- **anyMatch()**: Verifica se algum elemento da Stream corresponde ao predicado fornecido.

```java
boolean anyMatch = stream.anyMatch(s -> s.startsWith("a"));
```

- **noneMatch()**: Verifica se nenhum elemento da Stream corresponde ao predicado fornecido.

```java
boolean noneMatch = stream.noneMatch(s -> s.startsWith("z"));
```

- **allMatch()**: Verifica se todos os elementos da Stream correspondem ao predicado fornecido.

```java
boolean allMatch = stream.allMatch(s -> s.length() > 3);
```

- **min() e max()**: Encontra o menor e o maior elemento, respectivamente, com base em um comparador.

```java
Optional<String> min = list.stream().min(Comparator.naturalOrder());
min.ifPresent(System.out::println);

Optional<String> max = list.stream().max(Comparator.naturalOrder());
max.ifPresent(System.out::println);
```

- **forEachOrdered()**: Semelhante a `forEach`, mas respeita a ordem dos elementos, importante em Streams paralelas.

```java
list.parallelStream().forEachOrdered(System.out::println);
```

- **reduce()**: Combina os elementos da Stream usando uma operação binária para produzir um único resultado.

```java
Optional<String> reduced = stream.reduce((a, b) -> a + "|" + b);
reduced.ifPresent(System.out::println);
```

Essas operações terminais são essenciais para extrair informações e realizar ações com os dados processados pelas Streams. Cada uma tem seu papel específico e é escolhida com base nas necessidades do processamento de dados em questão.
