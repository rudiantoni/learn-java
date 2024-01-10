# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## 13.12. SOLID: Liskov Substitution
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [12_arquivos](./12_arquivos/)
- Projetos
  - [Projeto 1](./12_arquivos/proj_01/) [(iniciado em)](#liskov-substitution)
- Conteúdo
  - [Liskov Substitution](#liskov-substitution)
  - [Exemplo sem a aplicação do princípio](#exemplo-sem-a-aplicação-do-princípio)
  - [Exemplo com a aplicação do princípio](#exemplo-com-a-aplicação-do-princípio)

### Liskov Substitution
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./12_arquivos/proj_01/)

O Princípio da Substituição de Liskov, em inglês "Liskov Substitution Principle" (LSP), é um dos cinco princípios do SOLID, um conjunto de diretrizes de design de software que visam criar sistemas de software mais robustos e flexíveis. O LSP foi formulado por Barbara Liskov em 1987 e é uma extensão do Princípio de Subtipos.

O LSP estabelece o seguinte princípio fundamental: "Se uma classe S é um subtipo de uma classe T, então os objetos de classe T podem ser substituídos por objetos de classe S sem afetar a corretude do programa."

Em termos mais simples, isso significa que uma subclasse (ou classe derivada) deve ser capaz de substituir sua classe base (ou classe pai) sem alterar o comportamento esperado do programa. Em outras palavras, os objetos da classe base devem poder ser substituídos pelos objetos da subclasse sem que isso quebre a funcionalidade do programa.

Principais conceitos do Princípio da Substituição de Liskov (LSP):

- **Herança e Polimorfismo**: O LSP faz uso da herança e do polimorfismo para garantir que as subclasses mantenham o contrato (ou seja, a assinatura de métodos e comportamento) da classe base.
- **Contrato Implícito**: Quando uma classe herda de outra, ela está concordando implicitamente em manter o mesmo contrato, garantindo que os métodos da classe base possam ser chamados na subclasse sem surpresas.
- **Correção do Programa**: O LSP visa manter a correção do programa ao permitir a substituição de objetos de uma classe base por objetos de subclasses sem introduzir erros ou comportamentos inesperados.

### Exemplo sem a aplicação do princípio
[[Topo]](#)<br />

Vamos criar uma interface Bird com 2 métodos fly() e eat() que será implementada por outras classes.

```java
public interface Bird {
  public void fly();
  public void eat();
}

public class Crow implements Bird {
  @Override
  public void fly() {
    System.out.println("Crow flies");
  }
  @Override
  public void eat() {
    System.out.println("Crow eats");
  }
}

public class Ostrich implements Bird {
  @Override
  public void fly() {
    throw new UnsupportedOperationException("Ostrich falls while trying to fly");
  }
  @Override
  public void eat() {
    System.out.println("Ostrich eats");
  }
}

public class Sparrow implements Bird {
  @Override
  public void fly() {
    System.out.println("Sparrow flies");
  }

  @Override
  public void eat() {
    System.out.println("Sparrow eats");
  }
}
```

Neste exemplo, temos uma interface Bird que é implementada por 3 classes: Crow, Ostrich e Sparrow.

Porém na implementação da classe Ostrich, o método fly() lança um erro em tempo de execução, mas ele ainda está acessível normalmente.

```java
public class Main {
  public static void main(String[] args) {
    Bird[] birds = new Bird[] {new Crow(), new Sparrow(), new Ostrich()};
    for (Bird bird: birds) {
      bird.fly();
    }
  }
}
```

### Exemplo com a aplicação do princípio
[[Topo]](#)<br />

Agora, vamos criar 2 interfaces: Bird apenas com o método eat() e FlyingBird (que extende a interface Bird) apenas com o método fly()

```java
public interface Bird {
  void eat();
}

public interface FlyingBird extends Bird {
  void fly();
}

public class Crow implements FlyingBird {
  @Override
  public void eat() {
    System.out.println("Crow eats");
  }
  @Override
  public void fly() {
    System.out.println("Crow flies");
  }
}

public class Ostrich implements Bird {
  @Override
  public void eat() {
    System.out.println("Ostrich eats");
  }
}

public class Sparrow implements FlyingBird {
  @Override
  public void eat() {
    System.out.println("Sparrow eats");
  }
  @Override
  public void fly() {
    System.out.println("Sparrow flies");
  }
}
```

Agora, é impossível chamar o método fly na classe Ostrich, já que não implementa nenhuma interface que contenha esse método.

```java
public class Main {
  public static void main(String[] args) {
    FlyingBird[] flyingBirds = new FlyingBird[]{new Crow(), new Sparrow()};
    for (FlyingBird bird: flyingBirds) {
      bird.fly();
    }

    System.out.println("\n==========\n");

    Bird[] birds = new Bird[]{new Crow(), new Sparrow(), new Ostrich()};
    for (Bird bird: birds) {
      bird.eat();
    }
  }
}
```
