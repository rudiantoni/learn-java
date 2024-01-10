# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## 13.7. Static
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [07_arquivos](./07_arquivos/)
- Projetos
  - [Projeto 1](./07_arquivos/proj_01/) [(iniciado em)](#o-que-é-a-palavra-chave-static)
- Conteúdo
  - [O que é a palavra-chave static](#o-que-é-a-palavra-chave-static)
  - [Onde usar](#onde-usar)
  - [Métodos estáticos](#métodos-estáticos)
  - [Campos estáticos](#campos-estáticos)
  - [Importação estática](#importação-estática)
  - [Ligação estática vs dinâmica (dynamic binding)](#ligação-estática-vs-dinâmica-dynamic-binding)

### O que é a palavra-chave static
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./07_arquivos/proj_01/)

A palavra-chave "static" é usada para criar membros (métodos e variáveis) que pertencem à classe em vez de pertencerem a uma instância específica dessa classe.

Em outras palavras, membros estáticos são compartilhados por todas as instâncias da classe e podem ser acessados diretamente através do nome da classe, em vez de exigir a criação de uma instância da classe (um objeto): variáveis estáticas e métodos estáticos.

Em resumo, a palavra-chave "static" é usada em Java para criar membros (variáveis e métodos) que pertencem à classe em vez de pertencerem a instâncias individuais da classe. Isso permite o compartilhamento de dados e funcionalidades entre todas as instâncias da classe e o acesso direto aos membros estáticos sem a necessidade de criar objetos da classe.

### Onde usar
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./07_arquivos/proj_01/)

- **Variáveis Estáticas (Static Variables)**: Você pode usar a palavra-chave "static" para declarar variáveis estáticas. Essas variáveis pertencem à classe em vez de pertencerem a instâncias específicas da classe. Variáveis estáticas são compartilhadas por todas as instâncias da classe e podem ser acessadas diretamente usando o nome da classe.

```java
public class Exemplo {
  public static int contador = 0;
}
```

- **Métodos Estáticos (Static Methods)**: Você pode usar a palavra-chave "static" para declarar métodos estáticos. Métodos estáticos pertencem à classe e não a instâncias individuais. Eles podem ser chamados diretamente usando o nome da classe, sem a necessidade de criar objetos da classe.

```java
public class Matematica {
  public static int soma(int a, int b) {
    return a + b;
  }
}
```

- **Blocos Estáticos (Static Initialization Blocks)**: Você pode usar blocos estáticos para inicializar variáveis estáticas ou realizar outras operações de inicialização estática. Blocos estáticos são executados quando a classe é carregada na memória, antes que qualquer instância seja criada.

```java
public class Exemplo {
  public static int contador;

  static {
    contador = 0;
  }
}
```

- **Classes Aninhadas Estáticas (Static Nested Classes)**: Você pode declarar classes aninhadas estáticas dentro de outras classes. As classes aninhadas estáticas não têm acesso aos membros não estáticos da classe externa e podem ser instanciadas sem a necessidade de uma instância da classe externa.

```java
public class ClasseExterna {
  public static class ClasseAninhada {
    // Conteúdo da classe aninhada estática
  }
}
```

Lembre-se de que o uso da palavra-chave "static" implica que o membro ou a classe pertence à classe em si e não a instâncias individuais da classe. Portanto, os membros estáticos podem ser acessados diretamente usando o nome da classe, sem a necessidade de criar objetos da classe. Isso os torna úteis para compartilhar dados e funcionalidades entre todas as instâncias da classe.

### Métodos estáticos
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./07_arquivos/proj_01/)

Métodos estático são métodos que pertencem a uma classe em vez de pertencerem a instâncias específicas dessa classe. Eles são declarados com a palavra-chave "static" e podem ser chamados diretamente usando o nome da classe, sem a necessidade de criar objetos da classe. Aqui estão algumas características e usos comuns de métodos estáticos:

- *Acessibilidade*: Métodos estáticos podem ser chamados diretamente a partir do nome da classe, mesmo sem criar uma instância dessa classe. Isso significa que você não precisa criar um objeto da classe para invocar um método estático.
- *Não podem acessar membros não estáticos*: Métodos estáticos não têm acesso a membros não estáticos (variáveis ou métodos) da classe. Eles só podem acessar outros membros estáticos da mesma classe.
- *Uso comum*: Métodos estáticos são frequentemente usados para fornecer funcionalidades utilitárias que não dependem do estado de instâncias da classe. Por exemplo, métodos matemáticos como Math.sqrt() ou Math.random() são métodos estáticos, pois não precisam de um objeto Math específico para funcionar.

Exemplo de declaração de um método estático:

```java
public class Matematica {
  public static int soma(int a, int b) {
    return a + b;
  }
}
```

Uso de um método estático:

```java
int resultado = Matematica.soma(5, 3); // Chamando o método estático diretamente pela classe
```

Os métodos estáticos são úteis para encapsular funcionalidades que não dependem do estado de objetos individuais, tornando-os acessíveis globalmente por meio do nome da classe. Eles são comuns em classes utilitárias, bibliotecas de funções auxiliares e em situações em que você precisa realizar operações que não precisam de um contexto de objeto específico.

### Campos estáticos
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./07_arquivos/proj_01/)

Campos estáticos são variáveis que pertencem à classe em vez de pertencerem a instâncias específicas da classe. Eles são declarados com a palavra-chave "static" e são compartilhados por todas as instâncias da classe. Aqui estão algumas características e usos comuns de campos estáticos:
- *Acessibilidade*: Campos estáticos podem ser acessados diretamente usando o nome da classe, sem a necessidade de criar um objeto da classe. Isso significa que eles são acessíveis globalmente por meio do nome da classe.
- *Compartilhamento de Dados*: Campos estáticos são úteis para armazenar dados que precisam ser compartilhados por todas as instâncias da classe. Em vez de criar uma cópia separada para cada instância, o valor é compartilhado entre todas elas.
- *Uso comum*: Campos estáticos são frequentemente usados para armazenar constantes, contadores, configurações globais, ou qualquer dado que deve ser consistente em todas as instâncias de uma classe.

Exemplo de declaração de um campo estático:

```java
public class Exemplo {
  public static int contador = 0;
}
```

Uso de um campo estático:

```java
Exemplo.contador++; // Acessando e modificando o campo estático diretamente pela classe
```

Neste exemplo, o campo contador é estático e pode ser acessado e modificado diretamente usando o nome da classe Exemplo, sem criar uma instância da classe.

Campos estáticos são úteis quando você deseja manter um estado compartilhado entre todas as instâncias de uma classe ou quando precisa armazenar informações globais que não dependem de objetos individuais. No entanto, deve-se ter cuidado ao usar campos estáticos, pois eles podem introduzir complexidade e problemas de concorrência em programas multi-threaded.

### Importação estática
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./07_arquivos/proj_01/)

A importação estática (static import) é uma funcionalidade em Java que permite que você importe membros (métodos e campos) estáticos de uma classe específica de forma que você possa acessá-los diretamente pelo nome, sem a necessidade de qualificar o acesso com o nome da classe. Isso é especialmente útil quando você está trabalhando com classes que contêm muitos membros estáticos e deseja economizar tempo e tornar o código mais legível.

- **Sintaxe de Importação Estática**: Para usar a importação estática, você deve usar a declaração import static seguida do nome da classe que contém os membros estáticos que você deseja importar. Você também pode usar o curinga * para importar todos os membros estáticos da classe.

Exemplo de importação estática de um membro específico:

```java
import static minhaClasse.MinhaClasseEstatica.meuMetodoEstatico;
```

Exemplo de importação estática de todos os membros estáticos de uma classe:

```java
import static minhaClasse.MinhaClasseEstatica.*;
```

- **Acesso a Membros Estáticos Importados**: Após importar membros estáticos, você pode acessá-los diretamente pelo nome, sem a necessidade de qualificar com o nome da classe.

Exemplo de acesso a um método estático importado:

```java
meuMetodoEstatico(); // Chama o método diretamente pelo nome
```

Exemplo de acesso a um campo estático importado:

```java
int valor = meuCampoEstatico; // Acessa o campo diretamente pelo nome
```

A importação estática pode tornar o código mais conciso e legível quando você está trabalhando com classes que possuem muitos membros estáticos. No entanto, deve ser usado com moderação, pois o uso excessivo pode tornar o código menos claro e criar confusão, especialmente quando há membros estáticos com nomes idênticos em classes diferentes. Portanto, é aconselhável usá-lo com cuidado e apenas quando for realmente benéfico para a clareza do código.

### Ligação estática vs dinâmica (dynamic binding)
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./07_arquivos/proj_01/)

A ligação estática (static binding) e a ligação dinâmica (dynamic binding) são dois conceitos importantes na programação que se referem à resolução de métodos (ou funções) em tempo de compilação e em tempo de execução, respectivamente. Vou explicar cada um deles e dar exemplos para melhor compreensão:

**Ligação Estática (Static Binding)**

- A ligação estática ocorre em tempo de compilação.
- O método a ser chamado é determinado com base no tipo da referência em tempo de compilação (ou seja, o tipo declarado da variável).
- É também conhecida como ligação cedo (early binding) ou ligação de compilação (compile-time binding).
- É mais eficiente em termos de desempenho, pois a decisão sobre qual método chamar é tomada antecipadamente.

```java
class Animal {
  static void fazerSom() {
    System.out.println("Animal faz um som");
  }
}

class Cachorro extends Animal {
  static void fazerSom() {
    System.out.println("Cachorro late");
  }
}

public class Exemplo {
  public static void main(String[] args) {
    Animal animal = new Cachorro();
    animal.fazerSom(); // Ligação estática: chamará o método da classe Animal em tempo de compilação
  }
}
```

Neste exemplo, embora a referência seja do tipo Animal, o método fazerSom() da classe Cachorro não será chamado porque a ligação é feita estaticamente com base no tipo declarado da variável animal.

**Ligação Dinâmica (Dynamic Binding)**

- A ligação dinâmica ocorre em tempo de execução.
- O método a ser chamado é determinado com base no tipo real do objeto em tempo de execução.
- É também conhecida como ligação tardia (late binding) ou ligação de tempo de execução (runtime binding).
- É mais flexível e permite a implementação de polimorfismo, onde diferentes objetos podem responder de maneira diferente ao mesmo método.

```java
class Animal {
  void fazerSom() {
    System.out.println("Animal faz um som");
  }
}

class Cachorro extends Animal {
  void fazerSom() {
    System.out.println("Cachorro late");
  }
}

public class Exemplo {
  public static void main(String[] args) {
    Animal animal = new Cachorro();
    animal.fazerSom(); // Ligação dinâmica: chamará o método da classe Cachorro em tempo de execução
  }
}
```

Neste exemplo, a ligação é feita dinamicamente em tempo de execução com base no tipo real do objeto (Cachorro). Portanto, o método fazerSom() da classe Cachorro será chamado, permitindo que o polimorfismo seja efetivo.

Em resumo, a diferença chave entre ligação estática e dinâmica está no momento em que a decisão sobre qual método chamar é tomada. A ligação estática ocorre em tempo de compilação, com base no tipo declarado da variável, enquanto a ligação dinâmica ocorre em tempo de execução, com base no tipo real do objeto. A ligação dinâmica é fundamental para a implementação de polimorfismo em Java e outras linguagens orientadas a objetos.
