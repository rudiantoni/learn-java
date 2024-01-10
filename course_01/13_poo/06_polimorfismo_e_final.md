# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## 13.6. Polimorfismo e final
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [06_arquivos](./06_arquivos/)
- Projetos
  - [Projeto 1](./06_arquivos/proj_01/) [(iniciado em)](#o-que-é-polimorfismo)
- Conteúdo
  - [O que é polimorfismo](#o-que-é-polimorfismo)
  - [Dynamic binding (vinculação tardia)](#dynamic-binding-vinculação-tardia)
  - [Override (sobrescrita de métodos)](#override-sobrescrita-de-métodos)
  - [Overload (sobrecarga de métodos)](#overload-sobrecarga-de-métodos)
  - [Override vs Overload](#override-vs-overload)
  - [Palavra-chave final](#palavra-chave-final)

### O que é polimorfismo
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./06_arquivos/proj_01/)

Polimorfismo é um conceito importante em programação e ciência da computação que se relaciona com a capacidade de objetos de diferentes classes responderem a uma mesma mensagem ou método de forma única. Isso significa que objetos de classes diferentes podem implementar o mesmo método de maneiras distintas, de acordo com a sua própria lógica interna.

Existem dois principais tipos de polimorfismo:

**Polimorfismo de Subtipo (ou Polimorfismo de Herança)**: Esse tipo de polimorfismo ocorre quando classes relacionadas por herança (uma classe filha ou subclasse e uma classe mãe ou superclasse) implementam um método com o mesmo nome e assinatura (tipo de parâmetros) e o comportamento desse método é sobrescrito (redefinido) na classe filha.

O polimorfismo de subtipo permite tratar objetos da classe filha como se fossem objetos da classe mãe, desde que a classe filha seja um subtipo da classe mãe.

```java
class Animal {
  void fazerSom() {
    System.out.println("Animal fazendo som");
  }
}

class Cachorro extends Animal {
  @Override
  void fazerSom() {
    System.out.println("Cachorro fazendo som");
  }
}

public class Main {
  public static void main(String[] args) {
    Animal animal = new Cachorro();
    animal.fazerSom(); // Chama o método da classe Cachorro
  }
}
```

**Polimorfismo de Interface (ou Polimorfismo de Composição)**: Esse tipo de polimorfismo ocorre quando objetos de diferentes classes implementam a mesma interface (um conjunto de métodos que devem ser implementados pelas classes que a adotam). 

O polimorfismo de interface permite que objetos de classes diferentes sejam tratados de maneira semelhante, desde que implementem a mesma interface.

```java
interface Animal {
  void fazerSom();
}

class Cachorro implements Animal {
  @Override
  public void fazerSom() {
    System.out.println("Cachorro fazendo som");
  }
}

class Gato implements Animal {
  @Override
  public void fazerSom() {
    System.out.println("Gato fazendo som");
  }
}

public class Main {
  public static void main(String[] args) {
    Animal animal1 = new Cachorro();
    Animal animal2 = new Gato();
    animal1.fazerSom(); // Chama o método da classe Cachorro
    animal2.fazerSom(); // Chama o método da classe Gato
  }
}
```

O polimorfismo torna o código mais flexível, reutilizável e extensível, permitindo que novas classes sejam adicionadas ao sistema sem a necessidade de alterar o código existente, desde que sigam as interfaces ou heranças adequadas. Isso é fundamental em programação orientada a objetos e facilita a implementação de princípios como o encapsulamento, a abstração e a modularidade.


### Dynamic binding (vinculação tardia)
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./06_arquivos/proj_01/)

A Ligação Dinâmica (dynamic binding) é um conceito fundamental na programação orientada a objetos que se relaciona com a resolução de qual método deve ser chamado em tempo de execução, com base no tipo real do objeto em questão, em vez do tipo declarado da variável que o referencia. Esse processo também é chamado de "vinculação tardia" ou "polimorfismo de tempo de execução".

Em linguagens de programação que suportam ligação dinâmica, como Java e C++, quando você chama um método em um objeto, o sistema determina qual implementação do método (método concreto) deve ser executada com base no tipo do objeto real ao qual a variável se refere, em vez de apenas considerar o tipo da variável de referência.

Isso é particularmente importante em situações em que você tem uma hierarquia de classes com métodos sobrescritos (métodos com o mesmo nome e assinatura em classes diferentes) e deseja que o método correto seja chamado para um objeto, independentemente de sua classe específica.

A ligação dinâmica permite alcançar o polimorfismo, onde objetos de diferentes classes podem responder a uma mesma mensagem (chamada de método) de maneira única, de acordo com a implementação específica de cada classe. Isso torna o código mais flexível e extensível, pois você pode adicionar novas classes que se encaixam em uma hierarquia existente sem alterar o código que usa essas classes.

```java
class Animal {
  void fazerSom() {
    System.out.println("Animal fazendo som");
  }
}

class Cachorro extends Animal {
  @Override
  void fazerSom() {
    System.out.println("Cachorro fazendo som");
  }
}

public class Main {
  public static void main(String[] args) {
    Animal animal = new Cachorro();
    animal.fazerSom(); // Chama o método da classe Cachorro, não importa o tipo declarado (Animal)
  }
}
```

Neste exemplo, a ligação dinâmica garante que o método fazerSom() apropriado da classe Cachorro seja chamado, mesmo que a variável animal seja declarada como do tipo Animal. Isso ocorre porque a ligação do método é resolvida em tempo de execução, com base no tipo real do objeto em animal.

### Override (sobrescrita de métodos)
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./06_arquivos/proj_01/)

A sobrescrita de métodos (method overriding) é um conceito na programação orientada a objetos que permite que uma classe derivada (subclasse ou classe filha) forneça uma implementação específica para um método que já foi definido em sua classe base (superclasse ou classe mãe). Essa técnica permite substituir a implementação original do método na classe base pelo comportamento personalizado da classe derivada.

A sobrescrita de métodos é frequentemente usada em situações em que uma classe filha precisa fornecer uma implementação diferente para um método que é herdado da classe mãe, a fim de atender às necessidades específicas da classe filha. Para realizar uma sobrescrita de método, você deve seguir algumas regras:
- O método na classe filha deve ter o mesmo nome, tipo de retorno e parâmetros (assinatura) que o método na classe mãe que está sendo sobrescrito.
- O modificador de acesso do método na classe filha não pode ser mais restritivo do que o modificador de acesso do método na classe mãe. Por exemplo, se o método na classe mãe for público, o método na classe filha também deve ser público ou mais acessível.
- A classe filha deve usar a anotação `@Override` para indicar explicitamente que está sobrescrevendo o método da classe mãe. Isso é útil para detectar erros de compilação se você cometer erros na assinatura do método.

Aqui está um exemplo em Java que ilustra a sobrescrita de métodos:

```java
class Animal {
  void fazerSom() {
    System.out.println("Animal fazendo som");
  }
}

class Cachorro extends Animal {
  @Override
  void fazerSom() {
    System.out.println("Cachorro fazendo som");
  }
}

public class Main {
  public static void main(String[] args) {
    Animal animal = new Cachorro();
    animal.fazerSom(); // Chama o método sobrescrito na classe Cachorro
  }
}
```

Neste exemplo, a classe Cachorro herda o método fazerSom() da classe Animal, mas ele é sobrescrito para fornecer uma implementação específica para a classe Cachorro. Quando você chama animal.fazerSom(), a ligação dinâmica (polimorfismo de tempo de execução) garante que o método apropriado da classe Cachorro seja chamado, em vez do método da classe Animal. Isso demonstra como a sobrescrita de métodos permite que classes derivadas personalizem o comportamento dos métodos herdados.

### Overload (sobrecarga de métodos)
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./06_arquivos/proj_01/)

A sobrecarga de métodos (method overloading) é um conceito na programação orientada a objetos que permite que uma classe tenha vários métodos com o mesmo nome, mas com diferentes listas de parâmetros. Em outras palavras, métodos sobrecarregados têm o mesmo nome, mas diferentes assinaturas de parâmetros. A escolha do método a ser chamado é determinada pelo número, tipo e ordem dos argumentos passados durante a chamada do método.

A sobrecarga de métodos é útil quando você deseja fornecer funcionalidades semelhantes em uma classe, mas com diferentes formas de entrada. Por exemplo, você pode ter um método calcular que realiza operações matemáticas, e você pode sobrecarregar esse método para aceitar diferentes tipos de dados, como inteiros, números de ponto flutuante, etc.

```java
public class Calculadora {
  int somar(int a, int b) {
    return a + b;
  }

  double somar(double a, double b) {
    return a + b;
  }
  
  // Sobrecarga para somar três números inteiros
  int somar(int a, int b, int c) {
    return a + b + c;
  }

  public static void main(String[] args) {
    Calculadora calc = new Calculadora();
    System.out.println(calc.somar(5, 10));         // Chama o primeiro método
    System.out.println(calc.somar(3.5, 2.7));      // Chama o segundo método
    System.out.println(calc.somar(1, 2, 3));       // Chama o terceiro método
  }
}
```

Aqui, a classe Calculadora possui vários métodos somar, cada um com uma assinatura de parâmetros diferente, permitindo que você realize adições de diferentes tipos de dados.

### Override vs Overload
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./06_arquivos/proj_01/)

**Sobrescrita de Método (Override)**

- A sobrescrita de método ocorre quando uma classe derivada (subclasse) fornece uma implementação específica para um método que já foi definido em sua classe base (superclasse).
- A assinatura do método na classe derivada deve ser idêntica à do método na classe base (mesmo nome, tipo de retorno e parâmetros).
- A intenção da sobrescrita é substituir o comportamento da classe base pelo comportamento personalizado da classe derivada.
- A resolução do método a ser chamado é determinada em tempo de execução com base no tipo real do objeto.

**Sobrecarga de Método (Overload)**

- A sobrecarga de método ocorre quando uma classe tem vários métodos com o mesmo nome, mas com assinaturas de parâmetros diferentes.
- A assinatura de parâmetros de métodos sobrecarregados deve ser diferente, ou seja, deve haver diferenças no número, tipo ou ordem dos parâmetros.
- A intenção da sobrecarga é fornecer funcionalidades semelhantes com diferentes formas de entrada.
- A resolução do método a ser chamado é determinada em tempo de compilação com base nos argumentos passados durante a chamada do método.

A sobrescrita de método está relacionada à substituição de implementações em classes derivadas, enquanto a sobrecarga de método está relacionada à criação de métodos com o mesmo nome, mas diferentes assinaturas em uma mesma classe. Ambos os conceitos são importantes na programação orientada a objetos e contribuem para a flexibilidade e reutilização de código.


### Palavra-chave final
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./06_arquivos/proj_01/)

A palavra-chave "final" é utilizada para indicar que algo é constante, imutável ou não pode ser alterado, dependendo do contexto em que é aplicada. Ela pode ser usada com variáveis, métodos, classes e até mesmo com argumentos de métodos.

**Variáveis Finais (Final Variables)**: Quando você declara uma variável como "final", está indicando que o valor da variável não pode ser alterado após sua inicialização.

```java
final int numero = 42;
// Qualquer tentativa de atribuir um novo valor a "numero" resultará em erro de compilação.
```

**Métodos Finais (Final Methods)**: Quando um método é declarado como "final" em uma classe, isso significa que ele não pode ser sobrescrito (substituído) por subclasses.

```java
class ClasseBase {
  final void metodoFinal() {
    // Implementação do método final
  }
}
```

**Classes Finais (Final Classes)**: Quando uma classe é declarada como "final", ela não pode ser estendida por outras classes (ou seja, não pode ter subclasses).

```java
final class ClasseFinal {
  // Conteúdo da classe final
}
```

**Argumentos de Método Finais (Final Method Parameters)**: Quando um argumento de um método é declarado como "final", isso significa que o valor do argumento não pode ser modificado dentro do corpo do método.

```java
void imprimirMensagemFinal(final String mensagem) {
  // O valor de "mensagem" não pode ser alterado aqui.
  System.out.println(mensagem);
}
```

**Variáveis de Referência Finais (Final Reference Variables)**: Quando uma variável de referência (não o objeto em si) é declarada como "final", a referência não pode ser alterada para apontar para outro objeto após a inicialização. No entanto, o objeto ao qual a referência se refere ainda pode ser modificado.

```java
final MinhaClasse objeto = new MinhaClasse();
// A referência "objeto" não pode ser alterada para apontar para outro objeto.
// No entanto, os atributos do objeto podem ser modificados.
```

O uso da palavra-chave "final" em Java ajuda a tornar o código mais seguro, legível e previsível, indicando que certas partes do código não devem ser alteradas. Isso também pode ser útil para otimizações pelo compilador, uma vez que ele sabe que certos valores não mudarão ao longo da execução do programa.
