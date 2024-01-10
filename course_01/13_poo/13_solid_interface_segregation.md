# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## 13.13. SOLID: Interface Segregation
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [13_arquivos](./13_arquivos/)
- Projetos
  - [Projeto 1](./13_arquivos/proj_01/) [(iniciado em)](#interface-segregation)
- Conteúdo
  - [Interface Segregation](#interface-segregation)
  - [Exemplo sem a aplicação do princípio](#exemplo-sem-a-aplicação-do-princípio)
  - [Exemplo com a aplicação do princípio](#exemplo-com-a-aplicação-do-princípio)

### Interface Segregation
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./13_arquivos/proj_01/)

A Interface Segregation é um dos princípios fundamentais do design de software, especialmente na programação orientada a objetos. Esse princípio faz parte do conjunto de princípios conhecidos como SOLID, que foi introduzido por Robert C. Martin para criar código mais legível, extensível e de fácil manutenção.

O Interface Segregation Principle (ISP), o quarto princípio do SOLID, enfoca o seguinte conceito: "Clientes não devem ser forçados a depender de interfaces que não utilizam". Em outras palavras, ele sugere que as interfaces de uma classe devem ser coesas e específicas para as necessidades dos clientes que a utilizam, em vez de serem grandes e genéricas.

Isso significa que uma classe não deve ser obrigada a implementar métodos que não são relevantes para sua funcionalidade, apenas para cumprir os requisitos de uma interface genérica. Se uma classe depende de uma interface que possui métodos que ela não utiliza, isso pode levar a um acoplamento desnecessário e complicar a manutenção e extensão do código.

A aplicação do ISP envolve a criação de interfaces pequenas e específicas que contenham apenas os métodos necessários para um conjunto particular de comportamentos ou funcionalidades. Dessa forma, as classes podem implementar apenas as interfaces que são relevantes para suas responsabilidades, evitando a dependência de métodos não utilizados.

A observância do ISP ajuda a manter o código mais modular, coeso e flexível, facilitando a adição e a manutenção de funcionalidades no sistema sem impactar outras partes do código.

### Exemplo sem a aplicação do princípio
[[Topo]](#)<br />

Suponha que estamos trabalhando com uma interface Trabalhador que define métodos para realizar tarefas em uma empresa.

Essa interface inicialmente contém três métodos: trabalhar(), comer() e dormir().

```java
interface Trabalhador {
  void trabalhar();
  void comer();
  void dormir();
}
```

Agora, criamos uma classe Engenheiro que implementa a interface Trabalhador:

```java
class Engenheiro implements Trabalhador {
  @Override
  public void trabalhar() {
    System.out.println("Engenheiro está trabalhando.");
  }

  @Override
  public void comer() {
    throw new UnsupportedOperationException("O engenheiro não pode comer.");
  }

  @Override
  public void dormir() {
    throw new UnsupportedOperationException("O engenheiro não pode dormir.");
  }
}
```

O problema com este exemplo é que nem todos os métodos da interface Trabalhador fazem sentido para um engenheiro.

Por exemplo, um engenheiro não precisa dos métodos comer() e dormir() em sua interface.

Isso viola o Princípio da Segregação de Interfaces, pois força a classe Engenheiro a implementar métodos que são irrelevantes para ela.

### Exemplo com a aplicação do princípio
[[Topo]](#)<br />

Vamos corrigir o exemplo anterior aplicando o Princípio da Segregação de Interfaces.

Primeiro, vamos criar interfaces separadas para representar as diferentes ações:

```java
interface Trabalhador {
  void trabalhar();
}

interface Comedor {
  void comer();
}

interface Dorminhoco {
  void dormir();
}
```

Agora, a classe Engenheiro pode implementar apenas a interface relevante, que é Trabalhador:

```java
class Engenheiro implements Trabalhador {
  @Override
  public void trabalhar() {
    System.out.println("Engenheiro está trabalhando.");
  }
}

```

Dessa forma, a classe Engenheiro não é forçada a implementar métodos que não são relevantes para sua funcionalidade.

Cada interface representa um conjunto específico de comportamentos, seguindo o Princípio da Segregação de Interfaces.

Isso torna o código mais coeso e flexível, facilitando futuras modificações sem afetar partes não relacionadas do sistema.
