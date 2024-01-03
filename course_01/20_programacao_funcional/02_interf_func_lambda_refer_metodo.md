# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Interface funcional, funções lambda e referência de métodos
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [02_arquivos](./02_arquivos/)
- (se existir projeto) Projetos
  - [Projeto N](folder_link-proj_nn) [(iniciado em)](#started_in_content_link)
  - ...
- (se existir exercícios) Exercícios
  - [Exercício N](folder_link-exercicio_nn) ([enunciado](#statement_content_link))
  - ...
- Conteúdo
  - []()
  - ...

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

### (nome do vídeo, aula, etc)
[[Topo]](#)<br />



### (nome do vídeo, aula, etc)
[[Topo]](#)<br />



### (nome do vídeo, aula, etc)
[[Topo]](#)<br />



### (nome do vídeo, aula, etc)
[[Topo]](#)<br />



### (nome do vídeo, aula, etc)
[[Topo]](#)<br />



### (nome do vídeo, aula, etc)
[[Topo]](#)<br />



### (nome do vídeo, aula, etc)
[[Topo]](#)<br />



### (nome do vídeo, aula, etc)
[[Topo]](#)<br />



### (nome do vídeo, aula, etc)
[[Topo]](#)<br />



### (nome do vídeo, aula, etc)
[[Topo]](#)<br />



### (nome do vídeo, aula, etc)
[[Topo]](#)<br />


Se homework:
- Ver homework: [file_name_no_extension](file_link)
Se projeto:
- Ver projeto: [Projeto N](folder_link-proj_nn)

Lista ordenada
1. Lista item 1
2. Lista item 2
3. Lista item 3

Lista desordenada
- Lista item 1
- Lista item 2
- Lista item 3

`linha de codigo`

Bloco de código

```
bloco de código {

}
```

Se exercício:
> Exercício N ((nome do vídeo, aula, etc)): [caminho](pasta_exercicio-exercicio_nn)

Enunciado de pesquisa:
- Usando Java 8 como base, me explique o que é interface funcional? com exemplos de código
- Como criar uma interface funcional personalizada com exemplos de código
- Funções lambda com exemplos de código
- Referência de método com exemplos de código
