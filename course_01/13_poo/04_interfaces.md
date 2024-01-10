# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## 13.4. Interfaces
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [04_arquivos](./04_arquivos/)
- Projetos
  - [Projeto 1](./04_arquivos/proj_01/) [(iniciado em)](#o-que-são)
- Conteúdo
  - [O que são](#o-que-são)
  - [Conteúdos de interfaces](#conteúdos-de-interfaces)
  - [Classe abstrata vs interface](#classe-abstrata-vs-interface)
  - [Interface vs classes vs tipos](#interface-vs-classes-vs-tipos)

### O que são
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./04_arquivos/proj_01/)

Em Java 8, assim como nas versões anteriores, interfaces são uma parte fundamental da linguagem e são usadas para definir contratos que as classes devem seguir.

Uma interface em Java é uma coleção de métodos abstratos (sem implementação) e constantes (variáveis que são implicitamente public, static, e final) que podem ser implementados por classes que as "implementam".

As interfaces definem contratos que as classes devem obedecer, especificando os métodos que devem ser implementados.

Para declarar uma interface, você usa a palavra-chave interface. Por exemplo:

```java
public interface MinhaInterface {
  void metodoAbstrato();
  int CONSTANTE = 42;
}
```

- *Implementação*: Neste exemplo, *MinhaInterface* declara um método abstrato metodoAbstrato() e uma constante CONSTANTE.

Uma classe pode implementar uma ou várias interfaces usando a palavra-chave implements.

Uma vez que uma classe implementa uma interface, ela deve fornecer implementações concretas para todos os métodos abstratos definidos na interface.

```java
public class MinhaClasse implements MinhaInterface {
  @Override
  public void metodoAbstrato() {
    // Implementação do método abstrato
  }
}
```

- *Múltiplas implementações*: Uma classe pode implementar várias interfaces, permitindo a herança múltipla de tipos em Java.

Isso significa que a classe pode fornecer implementações para vários conjuntos de métodos definidos em diferentes interfaces.

```java
public class MinhaClasse implements Interface1, Interface2 {
  // Implementações de métodos de ambas as interfaces
}
```

- *Interfaces Funcionais*: Desde o Java 8, as interfaces podem conter métodos com implementação padrão (default methods) e métodos estáticos. Isso permitiu a introdução de interfaces funcionais, que são interfaces com um único método abstrato (conhecido como método funcional). As expressões lambda podem ser usadas com interfaces funcionais para criar implementações de forma mais concisa.

```java
@FunctionalInterface
public interface Calculadora {
  int calcular(int a, int b);

  // Métodos default podem ser adicionados sem quebrar a funcionalidade
  default int somar(int a, int b) {
    return a + b;
  }
}
```

*Referências de Método*: As interfaces funcionais também permitem o uso de referências de método, tornando mais fácil passar métodos como argumentos para outros métodos.

```java
Calculadora calculadora = (a, b) -> a + b;
// Pode ser escrito como
Calculadora calculadora = Integer::sum;
```

Em resumo, interfaces em Java 8 são usadas para definir contratos que as classes devem seguir, permitindo a implementação de métodos e a definição de constantes. A introdução de métodos com implementação padrão e interfaces funcionais tornou as interfaces mais flexíveis e poderosas, especialmente no contexto de programação funcional.

### Conteúdos de interfaces
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./04_arquivos/proj_01/)

Em Java, interfaces podem conter os seguintes elementos:

- *Métodos Abstratos*: Métodos sem implementação que as classes que implementam a interface devem fornecer. Os métodos em interfaces não têm corpos e não podem ser final ou static.

```java
public interface MinhaInterface {
  void metodoAbstrato();
}
```

- *Métodos com Implementação Padrão (default methods)*: A partir do Java 8, interfaces podem conter métodos com implementações padrão, que fornecem uma implementação padrão para um método. As classes que implementam a interface podem optar por usar a implementação padrão ou fornecer sua própria implementação.

```java
public interface MinhaInterface {
  void metodoAbstrato();

  default void metodoComImplementacaoPadrao() {
    System.out.println("Método com implementação padrão.");
  }
}
```

- *Métodos Estáticos*: A partir do Java 8, interfaces podem conter métodos estáticos que podem ser chamados diretamente na interface, sem a necessidade de instanciar uma classe que a implementa.

```java
public interface MinhaInterface {
  static void metodoEstatico() {
    System.out.println("Método estático na interface.");
  }
}
```

- *Constantes*: Variáveis que são implicitamente public, static e final. Elas são usadas para definir valores constantes que podem ser acessados através da interface.

```java
public interface MinhaInterface {
  int CONSTANTE = 42;
}
```

- *Assinaturas de Tipos*: Interfaces podem declarar tipos (ou seja, nomes de classes, interfaces ou tipos genéricos) que podem ser usados em seus métodos. Isso é útil para especificar tipos de retorno de métodos ou parâmetros.

```java
public interface Comparavel<T> {
  int comparar(T outro);
}
```

- *Marcadores (Marker Interfaces)*: Interfaces vazias (sem métodos) que servem apenas para marcar classes com uma característica específica. Um exemplo é a interface java.io.Serializable que indica que uma classe pode ser serializada.


```java
import java.io.Serializable;

public class MinhaClasse implements Serializable {
  // Implementação da classe
}
```

Em resumo, interfaces em Java podem conter métodos abstratos, métodos com implementação padrão, métodos estáticos, constantes, assinaturas de tipos e até mesmo servir como marcadores para indicar características especiais. A introdução de métodos com implementação padrão e métodos estáticos nas interfaces tornou-as mais flexíveis e poderosas em comparação com versões anteriores do Java.

### Classe abstrata vs interface
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./04_arquivos/proj_01/)

Em Java 8, tanto as classes abstratas quanto as interfaces são usadas para definir contratos e abstrair comportamentos, mas existem diferenças significativas entre elas.

**Implementação de Métodos**

- *Classe Abstrata*: Pode conter métodos abstratos (sem implementação) e métodos concretos (com implementação). As subclasses são obrigadas a fornecer implementações para os métodos abstratos.

```java
public abstract class ClasseAbstrata {
  public abstract void metodoAbstrato();

  public void metodoConcreto() {
    System.out.println("Método concreto na classe abstrata.");
  }
}
```

- *Interface*: Pode conter apenas métodos abstratos ou métodos com implementações padrão (default methods). As classes que implementam a interface devem fornecer implementações para os métodos abstratos, mas podem optar por usar ou sobrescrever os métodos com implementações padrão.

```java
public interface MinhaInterface {
  void metodoAbstrato();

  default void metodoComImplementacaoPadrao() {
    System.out.println("Método com implementação padrão na interface.");
  }
}
```

**Herança**

- *Classe Abstrata*: Pode ser estendida por uma única classe. Java não suporta herança múltipla de classes.

```java
public abstract class Animal {
  // Conteúdo da classe abstrata Animal
}

public class Cachorro extends Animal {
  // Conteúdo da classe Cachorro
}
```

- *Interface*: Uma classe pode implementar várias interfaces, permitindo herança múltipla de tipos em Java. Isso permite que a classe compartilhe comportamentos de várias fontes.

```java
public interface Voador {
  void voar();
}

public interface Nadador {
  void nadar();
}

public class Pato implements Voador, Nadador {
  // Implementação de voar() e nadar()
}
```

**Construtores**

- *Classe Abstrata*: Pode ter construtores, e as subclasses devem chamar explicitamente o construtor da classe abstrata usando super().

- *Interface*: Não pode ter construtores. Interfaces não podem ser instanciadas, portanto, não têm construtores.

**Variáveis**

- *Classe Abstrata*: Pode conter campos (variáveis de instância) que podem ser herdados pelas subclasses.

```java
public abstract class Pessoa {
  protected String nome;
}
```

- *Interface*: Pode conter apenas constantes (variáveis public, static, e final) que são implicitamente public, static, e final.

```java
public interface Constantes {
  int VALOR = 42;
}
```

Em resumo, as classes abstratas são usadas para definir uma estrutura comum e compartilhar implementações, enquanto as interfaces definem contratos que as classes devem seguir. A escolha entre usar uma classe abstrata ou uma interface depende das necessidades do projeto e da estrutura de herança desejada. O Java 8 trouxe a capacidade de adicionar métodos com implementações padrão nas interfaces, tornando-as mais flexíveis em comparação com as versões anteriores do Java.

### Interface vs classes vs tipos
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./04_arquivos/proj_01/)

Em Java 8, há diferenças significativas entre interfaces, classes e tipos. Vamos detalhar essas diferenças e fornecer exemplos de código para ilustrá-las:

**Interfaces**: Interfaces em Java definem contratos que as classes devem seguir. Elas podem conter métodos abstratos (métodos sem implementação) e métodos com implementações padrão (default methods).

```java
public interface Animal {
  void fazerSom(); // Método abstrato

  default void mover() {
    System.out.println("O animal se move.");
  }
}
```

**Classes**: Classes em Java são usadas para criar objetos e definir estruturas de dados. Elas podem conter campos, métodos, construtores, e implementar interfaces.

```java
public class Cachorro implements Animal {
  private String nome;

  public Cachorro(String nome) {
    this.nome = nome;
  }

  @Override
  public void fazerSom() {
    System.out.println(nome + " faz woof!");
  }
}
```

**Tipos**: Tipos se referem aos tipos de dados que uma variável pode conter. Em Java, tipos incluem tipos primitivos (int, float, boolean, etc.) e tipos de referência (classes, interfaces, arrays, etc.).

```java
Animal animal = new Cachorro("Rex"); // 'animal' é do tipo 'Animal'
```

Agora, vamos detalhar as diferenças:

**Interfaces vs. Classes**
- Interfaces definem contratos que as classes devem seguir, enquanto as classes fornecem implementações concretas.
- As interfaces podem ser implementadas por múltiplas classes, permitindo herança múltipla de tipos.
- Classes podem estender apenas uma única classe (herança única), mas podem implementar múltiplas interfaces.

**Classes vs. Tipos**
- Classes são usadas para criar objetos e definir comportamentos e estruturas de dados.
- Tipos se referem ao tipo de dados que uma variável pode conter, incluindo primitivos e tipos de referência (classes, interfaces).
- Uma variável em Java possui um tipo, que pode ser uma classe, interface, ou um tipo primitivo.

**Interfaces vs. Tipos**
- Interfaces são tipos de referência que definem contratos para classes.
- Tipos se referem ao tipo de dados que uma variável pode conter.
- Uma variável de tipo de interface pode conter uma referência para qualquer objeto de uma classe que implemente essa interface.

Em resumo, interfaces definem contratos para classes, classes são usadas para criar objetos e definir comportamentos, e tipos se referem ao tipo de dados que uma variável pode conter. Esses conceitos são fundamentais para a programação em Java e são essenciais para a criação de estruturas de código eficientes e legíveis.
