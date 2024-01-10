# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## 13.14. SOLID: Dependency Inversion
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [14_arquivos](./14_arquivos/)
- Projetos
  - [Projeto 1](./14_arquivos/proj_01/) [(iniciado em)](#dependency-inversion)
- Conteúdo
  - [Dependency Inversion](#dependency-inversion)
  - [Exemplo sem a aplicação do princípio](#exemplo-sem-a-aplicação-do-princípio)
  - [Exemplo com a aplicação do princípio](#exemplo-com-a-aplicação-do-princípio)

### Dependency Inversion
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./14_arquivos/proj_01/)

O Dependency Inversion Principle (Princípio da Inversão de Dependência, em português) é um dos cinco princípios do SOLID, um conjunto de diretrizes para o design de software que visa criar sistemas mais flexíveis, escaláveis e fáceis de manter. O Dependency Inversion Principle (DIP) é representado pela letra "D" no acrônimo SOLID.

O DIP estabelece duas regras fundamentais:

- Módulos de alto nível não devem depender de módulos de baixo nível. Ambos devem depender de abstrações.
- Abstrações não devem depender de detalhes. Detalhes devem depender de abstrações.

Em termos simples, o DIP incentiva a criação de código que dependa de abstrações e interfaces em vez de classes concretas e detalhes de implementação. Isso promove uma arquitetura mais flexível e desacoplada, permitindo que você substitua facilmente componentes sem afetar todo o sistema.

Existem duas partes principais na aplicação do DIP:

- **Módulos de Alto Nível**: São os módulos ou classes que fornecem funcionalidades de nível superior em seu sistema. Esses módulos não devem depender diretamente de implementações concretas ou detalhes de baixo nível.
- **Módulos de Baixo Nível**: São os módulos ou classes que fornecem funcionalidades de baixo nível ou detalhes de implementação. Eles também não devem depender diretamente de implementações de baixo nível.

Em vez disso, ambas as partes devem depender de abstrações ou interfaces. Isso permite que você altere as implementações de baixo nível sem afetar os módulos de alto nível e, inversamente, permite que você crie novas implementações de baixo nível sem afetar os módulos de alto nível existentes.

### Exemplo sem a aplicação do princípio
[[Topo]](#)<br />

Suponha que estamos construindo uma classe Carro que depende diretamente de uma classe concreta Motor. Neste caso, o Carro está fortemente acoplado ao Motor, o que viola o princípio da inversão de dependência.

```java
class Motor {
  public void ligar() {
    System.out.println("Motor ligado");
  }
}

class Carro {
  private Motor motor;

  public Carro() {
    this.motor = new Motor(); // Acoplamento direto à classe concreta Motor
  }

  public void dirigir() {
    motor.ligar();
    System.out.println("Carro em movimento");
  }
}
```

Este código não segue o princípio da inversão de dependência porque o Carro está diretamente dependente da classe concreta Motor. Se decidirmos mudar para um motor elétrico, por exemplo, teríamos que fazer alterações na classe Carro, o que viola o princípio.

### Exemplo com a aplicação do princípio
[[Topo]](#)<br />

Vamos refatorar o exemplo anterior para seguir o Princípio da Inversão de Dependência, introduzindo uma interface Motor que será a abstração que o Carro dependerá. Isso permitirá que diferentes implementações de motores sejam usadas sem afetar o Carro.

```java
interface Motor {
  void ligar();
}

class MotorConvencional implements Motor {
  @Override
  public void ligar() {
    System.out.println("Motor convencional ligado");
  }
}

class MotorEletrico implements Motor {
  @Override
  public void ligar() {
    System.out.println("Motor elétrico ligado");
  }
}

class Carro {
  private Motor motor;

  public Carro(Motor motor) {
    this.motor = motor; // Injeção de dependência
  }

  public void dirigir() {
    motor.ligar();
    System.out.println("Carro em movimento");
  }
}
```
