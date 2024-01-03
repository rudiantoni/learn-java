# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Interface funcional, funções lambda e referência de métodos
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [02_arquivos](./02_arquivos/)
- Projetos
  - [Projeto 1](./02_arquivos/proj_01/) [(iniciado em)](#interface-funcional)
- Conteúdo
  - [Interface funcional](#interface-funcional)
  - [Interface funcional personalizada](#interface-funcional-personalizada)
  - [Funções lambda](#funções-lambda)
  - [Referências de métodos](#referências-de-métodos)

### Interface funcional
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./02_arquivos/proj_01/)

Uma interface funcional no Java 8 é uma interface que contém exatamente um método abstrato. Essas interfaces são usadas como base para as expressões lambda e os métodos de referência, o que permite uma programação mais funcional e concisa no Java. Vamos explorar mais sobre interfaces funcionais com alguns exemplos:

#### Características de uma interface funcional

- **Exatamente um método abstrato**: Uma interface funcional deve ter apenas um método abstrato. Ela pode ter métodos default ou métodos estáticos, mas apenas um método abstrato é permitido.
- **Anotação `@FunctionalInterface`**: Embora não seja obrigatória, é uma boa prática usar a anotação `@FunctionalInterface`. Esta anotação ajuda na legibilidade do código e garante que a interface não tenha mais de um método abstrato.

#### Exemplos de interfaces funcionais no Java 8

- **Interface Predicate**:
```java
import java.util.function.Predicate;

public class Main {
  public static void main(String[] args) {
    // Usando a interface funcional Predicate
    Predicate<String> isLongerThan5 = str -> str.length() > 5;
    System.out.println("Teste: " + isLongerThan5.test("Hello World"));  // Saída: Teste: true
  }
}
```

- **Interface Runnable**:
```java
public class Main {
  public static void main(String[] args) {
    // Usando Runnable com expressão lambda
    new Thread(() -> System.out.println("Thread executando")).start();
  }
}
```

**Interface Consumer**:
```java
import java.util.function.Consumer;

public class Main {
  public static void main(String[] args) {
    // Usando Consumer para imprimir um valor
    Consumer<String> print = System.out::println;
    print.accept("Testando Consumer");  // Saída: Testando Consumer
  }
}
```

#### Benefícios das interfaces funcionais

- **Código conciso**: Reduz a verbosidade, especialmente para implementações de interfaces com um único método.
- **Uso com lambda e método de referência**: Facilita o uso de expressões lambda e métodos de referência, tornando o código mais legível e expressivo.
- **Integração com APIs funcionais do Java 8**: Como `Stream`, `Predicate`, `Function`, `Consumer`, etc., que são construídas em torno de interfaces funcionais.

As interfaces funcionais são um componente crucial da programação funcional no Java 8 e ajudam a tornar o código mais funcional, limpo e expressivo.

### Interface funcional personalizada
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./02_arquivos/proj_01/)

Criar uma interface funcional personalizada no Java é um processo bastante simples. Uma interface funcional é qualquer interface que tenha exatamente um método abstrato. Vamos ver um exemplo detalhado:

#### Passo 1: Definir a interface funcional

Primeiro, você define a interface e marca com a anotação `@FunctionalInterface`. Embora esta anotação não seja obrigatória (o compilador trata qualquer interface com um único método abstrato como uma interface funcional), ela é útil para clareza e consistência, e ajuda a evitar erros, como adicionar métodos abstratos adicionais acidentalmente.

```java
@FunctionalInterface
public interface Calculadora {
  int operacao(int a, int b);
}
```

Neste exemplo, `Calculadora` é uma interface funcional com um único método abstrato `operacao`.

#### Passo 2: Implementar a interface funcional com uma lambda

Você pode implementar a interface funcional usando uma expressão lambda. Por exemplo, você pode implementar o método `operacao` para realizar uma soma, subtração, multiplicação, etc.

```java
public class Main {
  public static void main(String[] args) {
    // Implementação com lambda para soma
    Calculadora soma = (a, b) -> a + b;
    System.out.println("Soma: " + soma.operacao(5, 3));  // Saída: Soma: 8

    // Implementação com lambda para subtração
    Calculadora subtracao = (a, b) -> a - b;
    System.out.println("Subtração: " + subtracao.operacao(5, 3));  // Saída: Subtração: 2
  }
}
```

#### Passo 3: Usar a interface funcional

Você pode usar a interface funcional em qualquer lugar onde deseja passar um bloco de código como argumento, o que é especialmente útil para operações de alta ordem, como em APIs de coleções ou streams.

#### Benefícios de interfaces funcionais personalizadas

- **Especificidade**: Você pode criar interfaces funcionais que se encaixem exatamente na lógica de negócios ou nos requisitos específicos do seu aplicativo.
- **Legibilidade**: Usar uma interface funcional personalizada pode tornar seu código mais legível, pois o nome da interface e do método pode refletir claramente sua função.
- **Reutilização**: Você pode reutilizar a mesma interface funcional em diferentes partes do seu aplicativo.

Lembrando que o uso de interfaces funcionais é muito potencializado com as expressões lambda, que foram introduzidas no Java 8, facilitando a implementação de código funcional e tornando o código mais limpo e expressivo.

### Funções lambda
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./02_arquivos/proj_01/)

As funções lambda, introduzidas no Java 8, representam um grande passo em direção à programação funcional no Java. Uma função lambda é basicamente uma forma concisa de representar uma função anônima (ou seja, uma função sem nome) que pode ser passada como argumento para métodos ou usada em qualquer lugar onde uma interface funcional é esperada.

#### Características
- **Sintaxe concisa**: Uma lambda é mais concisa do que uma implementação de classe anônima.
- **Anônima**: Não possui um nome como um método normal.
- **Passagem de comportamento**: Lambdas permitem que você passe comportamento (código) como argumento para um método.
- **Funcional**: Funciona bem com interfaces funcionais (interfaces com um único método abstrato).

#### Sintaxe Básica

A sintaxe de uma função lambda no Java é:

```java
(parametros) -> { corpo da expressão }
```

#### Exemplos

##### Sem Parâmetros

```java
Runnable r = () -> System.out.println("Uma lambda sem parâmetros!");
r.run();
```

#### Com um Parâmetro

```java
Consumer<String> consumer = (String s) -> System.out.println(s);
consumer.accept("Hello, World!");
```

#### Com múltiplos parâmetros

```java
BiFunction<Integer, Integer, Integer> somar = (a, b) -> a + b;
System.out.println(somar.apply(5, 3)); // Saída: 8
```

#### Uso como argumento de método

Vamos usar a interface `List` com o método `forEach` que aceita uma lambda como argumento:

```java
List<String> nomes = Arrays.asList("Ana", "Carlos", "Bia");
nomes.forEach(nome -> System.out.println(nome));
```

#### Lambda com corpo de bloco

Quando a lambda contém mais de uma instrução, você usa chaves `{}`:
```java
BiFunction<Integer, Integer, Integer> subtrair = (a, b) -> {
  int resultado = a - b;
  return resultado;
};
System.out.println(subtrair.apply(5, 3)); // Saída: 2
```

#### Benefícios

- **Menos código verbose**: Reduz a quantidade de código necessária para implementar interfaces funcionais.
- **Expressividade**: Melhora a legibilidade e expressividade do código.
- **Uso com APIs funcionais**: Integra-se perfeitamente com APIs funcionais do Java 8, como `Stream`, `Optional`, etc.
- **Paralelismo**: Facilita a programação paralela, especialmente com Streams.

Lambdas são uma poderosa ferramenta em Java 8 e acima, permitindo uma programação mais funcional, limpa e concisa. Elas são particularmente úteis em operações que envolvem coleções, e sua sintaxe curta e capacidade de passar comportamento como argumento tornam-nas ideais para programação moderna em Java.

### Referências de métodos
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./02_arquivos/proj_01/)

No Java 8, referências de métodos são uma forma concisa de representar um método como uma expressão lambda. Elas são úteis quando você quer passar a implementação de um método existente como um argumento para um método de ordem superior ou para uma interface funcional. As referências de métodos proporcionam uma maneira de referenciar métodos sem executá-los diretamente.

#### Formatos de referências de métodos

- **Referência a um método estático**: `Classe::metodoEstatico`
- **Referência a um método de instância de um objeto particular**: `instancia::metodoDeInstancia`
- **Referência a um método de instância de um objeto de um tipo particular**: `Classe::metodoDeInstancia`
- **Referência a um construtor**: `Classe::new`

#### Exemplos de referência de métodos

##### Referência a um método estático

Suponha que você tenha um método estático `somar` em uma classe `Matematica`:
```java
public class Matematica {
  public static int somar(int a, int b) {
    return a + b;
  }
}
```

Você pode usar uma referência de método para passá-lo a um `BiFunction`:

```java
BiFunction<Integer, Integer, Integer> somar = Matematica::somar;
System.out.println(somar.apply(5, 3)); // Saída: 8
```

##### Referência a um método de instância de um objeto particular

Suponha que você tenha o seguinte método de instância em uma classe `Impressora`:

```java
public class Impressora {
  public void imprimir(String mensagem) {
    System.out.println(mensagem);
  }
}
```

Você pode referenciar este método a partir de uma instância da classe `Impressora`:

```java
Impressora impressora = new Impressora();
Consumer<String> metodoImprimir = impressora::imprimir;
metodoImprimir.accept("Hello, World!"); // Saída: Hello, World!
```

##### Referência a um método de instância de um objeto de um tipo particular

Você pode referenciar um método de instância para ser aplicado em um tipo particular de objeto:

```java
List<String> nomes = Arrays.asList("Ana", "Carlos", "Bia");
nomes.forEach(System.out::println);
```

##### Referência a um construtor

Você pode usar referências de método para criar uma instância de um objeto. Por exemplo, para a classe `String`:

```java
Function<String, String> construtorString = String::new;
String str = construtorString.apply("Hello");
System.out.println(str); // Saída: Hello
```

#### Benefícios das referências de métodos

- **Concisão**: Reduz a verbosidade, especialmente quando comparado com expressões lambda completas.
- **Legibilidade**: Torna o código mais legível e limpo, facilitando a compreensão de sua finalidade.
- **Reutilização de métodos existentes**: Permite a reutilização de implementações de métodos existentes de forma funcional.

Referências de métodos são uma adição útil ao Java 8, proporcionando uma maneira elegante e eficiente de referenciar métodos diretamente em expressões lambda e interfaces funcionais. Elas são particularmente úteis em operações que envolvem coleções e APIs funcionais, melhorando a legibilidade e a eficiência do código.
