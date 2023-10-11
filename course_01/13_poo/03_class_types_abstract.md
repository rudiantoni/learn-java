# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Tipos de classes e abstract
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [03_arquivos](./03_arquivos/)
- Projetos
  - [Projeto 1](./03_arquivos/) [(iniciado em)](#classe-concreta)
- Conteúdo
  - [Classe concreta](#classe-concreta)
  - [Classes aninhadas](#classes-aninhadas)
  - [Classe final](#classe-final)
  - [Classe POJO](#classe-pojo)
  - [Classe abstrata](#classe-abstrata)
  - [Classe anônima](#classe-anônima)
  - [Palavra-chave abstrata](#palavra-chave-abstrata)

### Classe concreta
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./03_arquivos/proj_01/)

Uma classe concreta em Java é uma classe que pode ser instanciada diretamente, ou seja, você pode criar objetos a partir dela.

Ela fornece implementações para todos os seus métodos ou herda implementações de suas classes ancestrais.

Aqui está um exemplo de uma classe concreta em Java:

```java
public class Carro {
  private String marca;
  private String modelo;

  public Carro(String marca, String modelo) {
    this.marca = marca;
    this.modelo = modelo;
  }

  public void ligar() {
    System.out.println("O carro está ligado.");
  }
}
```

Neste exemplo, a classe Carro é uma classe concreta que pode ser instanciada para criar objetos que representam carros. Ela possui um construtor e um 

### Classes aninhadas
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./03_arquivos/proj_01/)

Uma classe aninhada em Java é uma classe definida dentro de outra classe.

Ela é usada para encapsular funcionalidades relacionadas e pode ter acesso aos membros da classe externa, incluindo campos e métodos privados.

Aqui está um exemplo de classe aninhada em Java:

```java
public class ClasseExterna {
  private int numeroExterno;

  public ClasseExterna(int numeroExterno) {
    this.numeroExterno = numeroExterno;
  }

  // Classe aninhada
  public class ClasseAninhada {
    public void exibirNumeroExterno() {
      System.out.println("Número externo: " + numeroExterno);
    }
  }
}
```

Neste exemplo, a classe ClasseAninhada é uma classe aninhada dentro da classe ClasseExterna. Ela pode acessar o campo numeroExterno da classe externa. 

### Classe final
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./03_arquivos/proj_01/)

Em Java, uma classe final é uma classe que não pode ser estendida por outras classes.

Quando uma classe é declarada como final, isso significa que ela não pode ser usada como superclasse para criar subclasses.

Em outras palavras, não é possível herdar ou estender uma classe final.

Para declarar uma classe como final em Java, você simplesmente usa a palavra-chave final antes da definição da classe. Aqui está um exemplo:

```java
public final class MinhaClasseFinal {
  // Conteúdo da classe
}
```

Neste exemplo, a classe MinhaClasseFinal é marcada como final, o que significa que nenhuma outra classe pode herdar dela. Isso é útil quando você deseja garantir que a implementação de uma classe não seja alterada ou estendida por classes derivadas. Classes finais são frequentemente usadas em situações em que a classe deve permanecer inalterada por questões de segurança, desempenho ou design. Por exemplo, a classe String em Java é uma 

### Classe POJO
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./03_arquivos/proj_01/)

Em Java, uma classe POJO (Plain Old Java Object) é uma classe simples que segue um conjunto de convenções específicas, mas não estende ou implementa classes ou interfaces específicas de um framework ou biblioteca.

As classes POJO são frequentemente usadas para representar objetos de domínio ou dados em um programa Java.

Elas devem ser simples, sem a necessidade de herança ou implementação de interfaces complexas.

As características de uma classe POJO geralmente incluem:
- *Atributos privados*: Os campos da classe devem ser definidos como privados para encapsular o estado do objeto.
- *Métodos de acesso*: A classe deve fornecer métodos públicos (getters e setters) para acessar e modificar os atributos privados.
- *Construtores*: A classe deve ter pelo menos um construtor padrão (sem argumentos) e pode ter outros construtores personalizados.
- *Falta de dependências externas*: As classes POJO não devem depender de frameworks específicos, como Spring, Hibernate, ou outros. Elas devem ser independentes e reutilizáveis.
- *Ser serializável (opcional)*: Se necessário, uma classe POJO pode implementar a interface Serializable para permitir a serialização em formatos como JSON ou persistência em banco de dados.

```java
public class Pessoa {
  private String nome;
  private int idade;

  // Construtor padrão
  public Pessoa() {
  }

  // Construtor personalizado
  public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  // Getters e setters
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }
}
```

Esta é uma classe POJO simples chamada Pessoa que representa informações sobre uma pessoa. Ela possui atributos privados, construtores e métodos de acesso (getters e setters), seguindo as convenções típicas de uma classe POJO. Essas classes são frequentemente usadas em aplicações Java para modelar 

### Classe abstrata
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./03_arquivos/proj_01/)

Em Java, uma classe abstrata é uma classe que não pode ser instanciada diretamente, ou seja, você não pode criar objetos diretamente a partir dela.

Ela é projetada para ser uma classe base para outras classes (subclasses) que estendem ou herdam dela.

Uma classe abstrata pode conter métodos abstratos (métodos sem implementação) que devem ser implementados pelas classes filhas. Além disso, uma classe abstrata também pode conter métodos concretos (métodos com implementação) e campos.

Para declarar uma classe como abstrata em Java, você usa a palavra-chave abstract antes da definição da classe. Aqui está um exemplo simples:

```java
public abstract class Forma {
  // Campos ou métodos concretos
  public abstract double calcularArea(); // Método abstrato
}
```

Neste exemplo, a classe *Forma* é declarada como abstrata e contém um método abstrato calcularArea(). Qualquer classe que herde de Forma deve implementar o método calcularArea(), fornecendo sua própria implementação específica.

Classes abstratas são úteis quando você deseja criar uma hierarquia de classes em que algumas funcionalidades são compartilhadas entre as subclasses, mas as subclasses também têm a flexibilidade de fornecer implementações personalizadas para métodos abstratos. Elas são especialmente comuns em 

### Classe anônima
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./03_arquivos/proj_01/)

Em Java, uma classe anônima é uma classe sem nome que é definida e criada no local onde é necessária, em vez de ser definida explicitamente em um arquivo separado.

Elas são usadas principalmente para implementar interfaces ou classes abstratas de forma concisa e geralmente são usadas em situações em que você precisa fornecer uma implementação rápida e única para um método ou interface específico.

Aqui está um exemplo de como criar uma classe anônima em Java 8:

```java
public class ExemploClasseAnonima {
  public static void main(String[] args) {
    // Criando uma classe anônima que implementa a interface Runnable
    Runnable runnable = new Runnable() {
      @Override
      public void run() {
        System.out.println("Método run() de uma classe anônima.");
      }
    };

    // Executando o método run() da classe anônima
    runnable.run();
  }
}
```

Neste exemplo, uma classe anônima é criada e implementa a interface Runnable. Ela fornece uma implementação do método run() diretamente no local onde é criada. Isso pode ser útil em situações em que você precisa passar uma implementação específica para uma interface ou classe abstrata, como em chamadas de método que esperam um objeto do tipo Runnable, ActionListener, ou outros.

Classes anônimas são convenientes, mas são limitadas em termos de reutilização, uma vez que não podem ser referenciadas novamente depois de sua criação. Com o Java 8 e versões posteriores, as expressões lambda fornecem uma sintaxe mais concisa e poderosa para criar implementações de interfaces 

### Palavra-chave abstrata
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./03_arquivos/proj_01/)

Em Java, a palavra-chave abstract é usada para declarar uma classe ou método como abstrato.

Ela indica que a classe ou método não tem uma implementação completa e requer que subclasses forneçam implementações concretas.

- *Classe Abstrata*: Uma classe abstrata é uma classe que não pode ser instanciada diretamente. Ela é usada como uma classe base para outras classes (subclasses) que estendem ou herdam dela. Uma classe abstrata pode conter campos, métodos abstratos e métodos concretos. Para declarar uma classe como abstrata, você usa a palavra-chave abstract antes da definição da classe. Exemplo:

```java
public abstract class Forma {
  public abstract double calcularArea(); // Método abstrato
  // Outros membros da classe
}
```

- *Método Abstrato*: Um método abstrato é um método que não tem uma implementação definida na classe atual. Ele é declarado com a palavra-chave abstract e não contém um corpo (chaves {}) em sua definição. Subclasses que herdam esse método devem fornecer uma implementação concreta. Exemplo:

```java
public abstract class Forma {
  public abstract double calcularArea(); // Método abstrato
}

public class Circulo extends Forma {
  @Override
  public double calcularArea() {
    // Implementação concreta do método
    return Math.PI * raio * raio;
  }
}
```

Em resumo, a palavra-chave abstract é usada para indicar que uma classe ou método não fornece uma implementação completa e deve ser estendido ou implementado por outras classes ou métodos concretos. Isso é útil quando você deseja definir uma estrutura básica ou contrato que as subclasses devem seguir, mas não deseja fornecer uma implementação completa nas classes base.
