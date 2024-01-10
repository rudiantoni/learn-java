# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## 20.3. Function e BiFunction: teoria e prática
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [03_arquivos](./03_arquivos/)
- Projetos
  - [Projeto 1](./03_arquivos/proj_01/) [(iniciado em)](#interface-function)
- Conteúdo
  - [Interface Function](#interface-function)
  - [Interface BiFunction](#interface-bifunction)
  - [Métodos andThen(), compose(), identity() e Comparator.comparing()](#métodos-andthen-compose-identity-e-comparatorcomparing)

### Interface Function
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./03_arquivos/proj_01/)

No Java 8, a interface `Function<T,R>` é uma interface funcional que faz parte do pacote `java.util.function`. Ela representa uma função que aceita um argumento de um tipo `T` e produz um resultado de um tipo `R`. Esta interface é amplamente utilizada para transformar dados, especialmente ao trabalhar com streams e coleções.

#### Características principais da interface Function

- **Método abstrato `apply`**: O método `apply(T t)` é o único método abstrato da interface `Function` e define a operação a ser realizada na função.
- **Métodos default e estáticos**: A interface `Function` também inclui métodos default e estáticos úteis, como `compose`, `andThen`, e `identity`.

#### Exemplo de uso da interface Function

##### Função básica

Vamos criar uma função simples que converte um número inteiro em uma string formatada.

```java
Function<Integer, String> intParaString = num -> "Número: " + num;
String resultado = intParaString.apply(5);
System.out.println(resultado);  // Saída: Número: 5
```

#### Benefícios da interface Function
- **Transformação de dados**: Útil para transformar dados de um tipo para outro.
- **Reutilização de código**: Promove a reutilização de código e a programação funcional.
- **Uso com streams e coleções**: Muito útil ao trabalhar com streams e coleções, permitindo operações como mapeamento.

A interface `Function` é um componente poderoso na programação funcional com Java 8, proporcionando flexibilidade e eficiência para operações de transformação de dados.

### Interface BiFunction
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./03_arquivos/proj_01/)

No Java 8, a interface `BiFunction<T,U,R>` é uma interface funcional que faz parte do pacote `java.util.function`. Ela representa uma função que aceita dois argumentos, um do tipo `T` e outro do tipo `U`, e retorna um resultado do tipo `R`. Esta interface é útil para operações ou cálculos que requerem dois argumentos de entrada.

#### Características principais da interface BiFunction

- **Método abstrato `apply`**: O método `apply(T t, U u)` é o único método abstrato da interface `BiFunction`. Ele define a operação a ser realizada sobre os dois argumentos fornecidos.
- **Métodos default**: A interface `BiFunction` inclui métodos default como `andThen`, que permite combinar operações.

#### Exemplos de uso da interface BiFunction

##### Função básica com dois argumentos

Vamos criar uma BiFunction que soma dois números inteiros.

```java
BiFunction<Integer, Integer, Integer> soma = (a, b) -> a + b;
int resultado = soma.apply(5, 3);
System.out.println(resultado);  // Saída: 8
```

##### BiFunction para manipulação de objetos

BiFunction pode ser usada para manipular ou combinar objetos.

```java
BiFunction<String, String, String> concatenar = (a, b) -> a + " " + b;
String cumprimento = concatenar.apply("Olá", "Mundo!");
System.out.println(cumprimento); // Saída: Olá Mundo!
```

#### Benefícios da interface BiFunction
- **Flexibilidade**: Permite a passagem de dois argumentos de tipos diferentes, aumentando a flexibilidade.
- **Operações complexas**: Útil para realizar operações mais complexas que dependem de dois argumentos.
- **Uso com streams e coleções**: Embora não seja tão comum quanto `Function` ou `Predicate` em operações de stream, ainda pode ser útil em operações personalizadas.

A interface `BiFunction` no Java 8 é uma ferramenta poderosa para a criação de funções que necessitam de dois argumentos, oferecendo suporte para programação funcional avançada e operações personalizadas.

### Métodos andThen(), compose(), identity() e Comparator.comparing()
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./03_arquivos/proj_01/)

No Java 8, vários métodos foram introduzidos para facilitar a programação funcional e a manipulação de dados de forma mais declarativa e fluente. Vou explicar cada um dos métodos mencionados com exemplos de código.

#### andThen()

O método `andThen()` é usado principalmente com interfaces funcionais, como `Function` e `Consumer`. Ele permite compor duas funções: executa a primeira função e, em seguida, passa seu resultado para a segunda função.

##### Exemplo de andThen() com Function

```java
Function<Integer, Integer> multiplicarPorDois = a -> a * 2;
Function<Integer, Integer> elevarAoQuadrado = a -> a * a;

Function<Integer, Integer> composta = multiplicarPorDois.andThen(elevarAoQuadrado);
System.out.println(composta.apply(3)); // Saída: 36 (3*2=6, 6*6=36)
```

#### compose()

O método `compose()` é semelhante a `andThen()`, mas executa as funções na ordem inversa. Primeiro executa a função passada como argumento e depois a função sobre a qual é chamada.

##### Exemplo de compose() com Function

```java
Function<Integer, Integer> composta2 = elevarAoQuadrado.compose(multiplicarPorDois);
System.out.println(composta2.apply(3)); // Saída: 18 (3*3=9, 9*2=18)
```

#### identity()

O método `identity()` é um método estático na interface `Function` que retorna uma função que sempre retorna seu argumento de entrada. É útil quando uma identidade de transformação é necessária em operações de transformação de dados.

##### Exemplo de identity() com Function

```java
Function<String, String> identityFunction = Function.identity();
System.out.println(identityFunction.apply("Java")); // Saída: Java
```

#### Comparator.comparing()

O método `Comparator.comparing()` é usado na API de Streams e em outras APIs que utilizam comparação. Ele cria um `Comparator` baseado em uma função que extrai uma chave para comparação.

##### Exemplo de Comparator.comparing()

```java
List<String> palavras = Arrays.asList("Java", "Python", "C++", "Rust");
palavras.sort(Comparator.comparing(String::length));
System.out.println(palavras); // Saída: [C++, Java, Rust, Python]
```

Neste exemplo, as palavras são ordenadas de acordo com seu comprimento.

Esses métodos são parte integrante da programação funcional no Java, proporcionando meios poderosos e flexíveis para compor funções, transformar dados e realizar comparações complexas de maneira concisa e expressiva.
