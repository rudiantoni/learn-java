# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## 13.5. Herança
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [05_arquivos](./05_arquivos/)
- Projetos
  - [Projeto 1](./05_arquivos/proj_01/) [(iniciado em)](#conceito)
- Conteúdo
  - [Conceito](#conceito)
  - [Palavra-chave super](#palavra-chave-super)
  - [O operador instanceof](#o-operador-instanceof)
  - [Estender (herdar) uma class](#estender-herdar-uma-class)
  - [Regras](#regras)

### Conceito
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./05_arquivos/proj_01/)

Herança refere-se a um dos princípios fundamentais da programação orientada a objetos (POO).

A herança permite que uma classe (chamada de classe filha ou subclasse) herde características (métodos e campos) de outra classe (chamada de classe pai ou superclasse).

A subclasse pode então estender ou especializar a funcionalidade da superclasse, adicionando novos métodos e campos ou substituindo os já existentes.

Aqui está um exemplo simples de como a herança funciona em Java:

```java
// Classe pai ou superclasse
class Animal {
  String nome;

  public Animal(String nome) {
    this.nome = nome;
  }

  public void fazerSom() {
    System.out.println("O animal faz um som");
  }
}

// Classe filha ou subclasse
class Cachorro extends Animal {
  public Cachorro(String nome) {
    super(nome);
  }

  // Sobrescrevendo o método fazerSom da classe pai
  @Override
  public void fazerSom() {
    System.out.println("O cachorro late");
  }

  public void abanarRabo() {
    System.out.println("O cachorro abana o rabo");
  }
}

public class ExemploHeranca {
  public static void main(String[] args) {
    Cachorro meuCachorro = new Cachorro("Rex");
    meuCachorro.fazerSom(); // Isso chama o método da subclasse
    meuCachorro.abanarRabo(); // Isso chama o método da subclasse
}
}
```

Neste exemplo, a classe Cachorro é uma subclasse da classe Animal. A subclasse herda o campo nome e o método fazerSom da superclasse, mas também define seu próprio método abanarRabo. Através da herança, você pode reutilizar código e criar hierarquias de classes que modelam relacionamentos do mundo real de forma eficiente. O polimorfismo também é uma característica importante da herança, pois permite que você trate objetos das subclasses como objetos da superclasse, facilitando a criação de código genérico e flexível.

### Palavra-chave super
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./05_arquivos/proj_01/)

A palavra-chave "super" em Java é usada principalmente em contextos de herança para acessar membros (campos ou métodos) da classe pai (superclasse) a partir de uma classe filha (subclasse).

Ela permite que você chame os métodos ou acesse os campos da superclasse quando há uma sobreposição (override) de membros na subclasse.

Aqui estão dois usos comuns da palavra-chave "super" em Java:

**Chamada de construtor da superclasse**: Você pode usar "super" para chamar explicitamente o construtor da superclasse a partir do construtor da subclasse. Isso é útil quando a superclasse possui um construtor personalizado que precisa ser chamado para inicializar partes específicas do objeto.

```java
class Animal {
  String nome;

  public Animal(String nome) {
    this.nome = nome;
  }
}

class Cachorro extends Animal {
  String raca;

  public Cachorro(String nome, String raca) {
    super(nome); // Chama o construtor da superclasse
    this.raca = raca;
  }
}
```

**Acessando métodos ou campos da superclasse**: Você pode usar "super" para acessar métodos ou campos da superclasse quando eles foram sobrepostos (override) na subclasse. Isso é útil quando você deseja executar a implementação da superclasse antes de adicionar funcionalidade adicional na subclasse.

```java
class Animal {
  public void fazerSom() {
    System.out.println("O animal faz um som");
  }
}

class Cachorro extends Animal {
  @Override
  public void fazerSom() {
    super.fazerSom(); // Chama o método da superclasse
    System.out.println("O cachorro late");
  }
}
```

Em ambos os casos, "super" permite que você acesse e utilize funcionalidades da superclasse em conjunto com a implementação específica da subclasse. Isso é importante para garantir que a funcionalidade da superclasse seja mantida e estendida, conforme necessário, na subclasse.

### O operador instanceof
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./05_arquivos/proj_01/)

O operador instanceof em Java é usado para verificar se um objeto é uma instância de uma determinada classe, de uma classe pai (superclasse) ou de uma interface.

Ele retorna um valor booleano, true se o objeto for uma instância do tipo especificado e false caso contrário.

O operador é frequentemente utilizado em estruturas de controle condicional, como if ou switch, para tomar decisões com base no tipo de objeto.

Aqui está um exemplo simples de como usar o operador instanceof:

```java
class Animal {
}

class Cachorro extends Animal {
}

class Gato extends Animal {
}

public class ExemploInstanceOf {
  public static void main(String[] args) {
    Animal meuAnimal = new Cachorro();

    if (meuAnimal instanceof Cachorro) {
      System.out.println("É um cachorro");
    } else if (meuAnimal instanceof Gato) {
      System.out.println("É um gato");
    } else if (meuAnimal instanceof Animal) {
      System.out.println("É um animal genérico");
    } else {
      System.out.println("Não sei que tipo de animal é");
    }
  }
}
```

Neste exemplo, meuAnimal é uma instância da classe Cachorro, mas é declarado como uma variável do tipo Animal. Usando o operador instanceof, verificamos primeiro se meuAnimal é uma instância de Cachorro. Como é verdadeiro, a mensagem "É um cachorro" é impressa. Você também pode ver que, se o objeto não for uma instância de Cachorro ou Gato, ele ainda é considerado uma instância de Animal.

O operador instanceof é útil quando você deseja tomar decisões com base no tipo de objeto em tempo de execução e executar código específico dependendo do tipo de objeto que está lidando.

### Estender (herdar) uma class
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./05_arquivos/proj_01/)

Para estender (herdar) uma classe, você pode criar uma nova classe (classe filha ou subclasse) que herda campos e métodos de outra classe (classe pai ou superclasse).

A subclasse estende a funcionalidade da superclasse, permitindo adicionar novos campos, métodos e até mesmo sobrescrever métodos da superclasse.

Aqui está como você pode extender classes em Java:

Suponha que você tenha uma classe pai chamada Animal:

```java
public class Animal {
  String nome;

  public Animal(String nome) {
    this.nome = nome;
  }

  public void fazerSom() {
    System.out.println("O animal faz um som");
  }
}
```

Agora, você pode criar uma classe filha chamada Cachorro que estende a classe Animal:

```java
public class Cachorro extends Animal {
  String raca;

  public Cachorro(String nome, String raca) {
    super(nome); // Chama o construtor da superclasse
    this.raca = raca;
  }

  // Você pode adicionar métodos adicionais à subclasse
  public void abanarRabo() {
    System.out.println("O cachorro abana o rabo");
  }

  // Você também pode sobrescrever métodos da superclasse
  @Override
  public void fazerSom() {
    System.out.println("O cachorro late");
  }
}
```

Neste exemplo, a classe Cachorro estende a classe Animal. Ela herda o campo nome e o método fazerSom da superclasse Animal. A subclasse Cachorro também adiciona seu próprio campo raca e seu próprio método abanarRabo. Além disso, ela sobrescreve o método fazerSom da superclasse para fornecer uma implementação específica para cachorros.

Quando você cria uma instância da classe Cachorro, você pode acessar os campos e métodos herdados da superclasse Animal e também os campos e métodos definidos na própria classe Cachorro. Isso permite que você estenda a funcionalidade da classe pai de acordo com suas necessidades específicas.

### Regras
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./05_arquivos/proj_01/)

As regras de herança em Java são fundamentais para garantir a integridade e o funcionamento adequado das classes e objetos em uma hierarquia de herança. Aqui estão algumas das principais regras de herança em Java:
- *Herança Única*: Em Java, uma classe pode estender apenas uma classe pai (superclasse). Não é permitido herdar de múltiplas classes ao mesmo tempo. Isso é conhecido como herança única, o que significa que Java não suporta herança múltipla de classes.
- *Todas as Classes herdam de Object*: Todas as classes em Java, direta ou indiretamente, herdam da classe Object. Isso significa que mesmo que você não especifique explicitamente uma classe pai para sua classe, ela ainda herda os métodos e comportamentos definidos na classe Object, como equals(), hashCode(), toString(), entre outros.
- *Acesso a membros herdados*: As subclasses podem acessar os membros (campos e métodos) herdados da superclasse, desde que esses membros tenham visibilidade adequada (por exemplo, sejam declarados como public ou protected). Os membros privados da superclasse não podem ser acessados diretamente pelas subclasses.
- *Sobrescrita de métodos*: As subclasses podem sobrescrever (override) os métodos herdados da superclasse. A sobrescrita permite que a subclasse forneça uma implementação diferente do método que está sendo substituído. Para isso, a assinatura (nome, tipo de retorno e parâmetros) do método na subclasse deve ser compatível com a da superclasse. A anotação @Override é frequentemente usada para indicar que um método está sendo sobrescrito.
- *Chamando o construtor da superclasse*: O construtor da superclasse pode ser chamado explicitamente a partir do construtor da subclasse usando a palavra-chave super(). Isso é necessário para garantir que a inicialização adequada da parte da superclasse seja feita antes da inicialização da parte da subclasse.
- *Referência de variáveis*: Uma variável de referência de tipo de superclasse pode ser usada para referenciar um objeto da subclasse. Isso é conhecido como polimorfismo. No entanto, a variável de referência só pode acessar os membros da superclasse, a menos que seja explicitamente convertida para o tipo da subclasse usando casting.
- *Construtores na herança*: Quando uma subclasse é criada, o construtor da superclasse é chamado automaticamente antes do construtor da subclasse. Isso ocorre implicitamente, mesmo se você não chamar super() explicitamente no construtor da subclasse. Certifique-se de que os construtores da superclasse sejam acessíveis (ou seja, não sejam privados) para que a herança funcione corretamente.
- *Membros privados na superclasse*: Os membros privados (declarados como private) na superclasse não são herdados pelas subclasses e não podem ser acessados diretamente por elas.
- *Final e herança*: Se uma classe é declarada como final, ela não pode ser estendida por outras classes. Isso impede a herança a partir dessa classe.
- *Construtores em classes abstratas*: Uma classe abstrata pode ter construtores, mas eles não podem ser usados para criar objetos diretamente. Eles podem ser chamados apenas por construtores de subclasses durante a inicialização das subclasses.

Respeitar essas regras de herança é importante para criar hierarquias de classes coesas e evitar problemas de herança que podem tornar o código difícil de entender e manter.
