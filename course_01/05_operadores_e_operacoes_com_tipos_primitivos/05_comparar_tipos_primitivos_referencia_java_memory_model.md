# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Comparar tipos primitivos e tipos de referência e Java Memory Model (Modelo de Memória Java)
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [05_arquivos](./05_arquivos/)
- Projetos
  - [Projeto 1](./05_arquivos/proj_01/) [(iniciado em)](#comparação-entre-tipos-primitivos)
- Conteúdo
  - [Comparação entre tipos primitivos](#comparação-entre-tipos-primitivos)
  - [Comparação entre tipos por referência](#comparação-entre-tipos-por-referênciaomp)
  - [Java Memory Model: Heap e Stack](#java-memory-model-heap-e-stack)
  - [Heap](#heap)
  - [Stack](#stack)
  - [Integer pool](#integer-pool)
  - [Método equals()](#método-equals)
  - [Comparação de arrays](#comparação-de-arrays)

### Comparação entre tipos primitivos
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./05_arquivos/proj_01/)

A comparação de tipos primitivos é direta e não envolve objetos. Os tipos primitivos armazenam valores diretamente em vez de referências a objetos. Portanto, você pode usar os operadores de comparação padrão para comparar valores.

Aqui estão exemplos de comparação de tipos primitivos em Java:
```java
int a = 5;
int b = 10;

// Igualdade
boolean igual = (a == b); // Retorna false

// Desigualdade
boolean diferente = (a != b); // Retorna true

// Maior que
boolean maior = (a > b); // Retorna false

// Menor que
boolean menor = (a < b); // Retorna true

// Maior ou igual a
boolean maiorOuIgual = (a >= b); // Retorna false

// Menor ou igual a
boolean menorOuIgual = (a <= b); // Retorna true
```

Note que as comparações com tipos primitivos não envolvem métodos equals() ou objetos. Eles são operações diretas em valores numéricos, booleanos ou de caracteres, dependendo do tipo primitivo envolvido.

### Comparação entre tipos por referência
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./05_arquivos/proj_01/)

A comparação entre tipos por referência envolve a comparação de objetos em vez de valores primitivos. Quando você compara objetos por referência, você está verificando se duas variáveis de referência se referem ao mesmo objeto na memória, ou seja, se ambas apontam para a mesma instância de objeto. Para fazer isso, você pode usar o operador `==`.

Vamos considerar um exemplo de comparação entre tipos por referência usando Java 8:
```java
public class Pessoa {
  private String nome;

  public Pessoa(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }
}

public class Exemplo {
  public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa("Alice");
    Pessoa pessoa2 = new Pessoa("Bob");
    Pessoa pessoa3 = pessoa1; // Duas variáveis referem-se ao mesmo objeto

    // Comparação por referência usando o operador ==
    boolean saoIguais1 = (pessoa1 == pessoa2); // Retorna false, pois apontam para objetos diferentes
    boolean saoIguais2 = (pessoa1 == pessoa3); // Retorna true, pois apontam para o mesmo objeto

    System.out.println("pessoa1 e pessoa2 são iguais por referência? " + saoIguais1);
    System.out.println("pessoa1 e pessoa3 são iguais por referência? " + saoIguais2);
  }
}
```

Neste exemplo, pessoa1 e pessoa2 são duas variáveis de referência que se referem a objetos diferentes da classe Pessoa. Quando comparamos pessoa1 e pessoa2 usando ==, a comparação retorna false, porque eles apontam para objetos diferentes na memória.

Por outro lado, pessoa1 e pessoa3 são duas variáveis de referência que apontam para o mesmo objeto. Portanto, a comparação pessoa1 == pessoa3 retorna true, indicando que eles se referem ao mesmo objeto.

Lembre-se de que a comparação por referência verifica se duas variáveis apontam para a mesma instância de objeto, enquanto a comparação por valor (por exemplo, usando o método equals()) verifica se o conteúdo dos objetos é igual.

### Java Memory Model: Heap e Stack
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./05_arquivos/proj_01/)

O Java Memory Model (JMM) é um modelo que define como a memória é organizada e acessada em programas Java multithreaded. Ele estabelece as regras e garantias para a sincronização e comunicação entre threads em um ambiente de memória compartilhada.

### Heap
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./05_arquivos/proj_01/)

O heap é uma região da memória usada para armazenar objetos alocados dinamicamente em tempo de execução. Ele é compartilhado por todas as threads em um aplicativo Java e é gerenciado pelo coletor de lixo. Aqui estão alguns pontos importantes sobre o heap:

- Alocação Dinâmica: No heap, os objetos são alocados dinamicamente usando new. Por exemplo:
```java
String mensagem = new String("Olá, mundo!");
```
- Objetos Persistentes: Os objetos no heap são persistentes e podem ser acessados por várias partes do programa durante sua vida útil.
- Coleta de Lixo: O Java gerencia automaticamente a recuperação de memória no heap, removendo objetos que não são mais referenciados por nenhum código do programa.

### Stack
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./05_arquivos/proj_01/)

A pilha (stack) é uma região de memória usada para armazenar frames de pilha que contêm informações sobre a execução de métodos. Cada thread Java possui sua própria pilha de chamadas. Aqui estão alguns pontos importantes sobre a pilha:

- Frames de Pilha: Cada método invocado cria um frame de pilha que contém informações sobre as variáveis locais, parâmetros e o estado de execução do método.
- LIFO (Last-In-First-Out): A pilha segue a regra LIFO, onde o método mais recentemente invocado é o primeiro a ser concluído.
- Alocação e Liberação Rápida: Os frames de pilha são alocados e liberados rapidamente, o que torna a pilha eficiente para gerenciar a execução de métodos.
- Recursão: A pilha é usada para gerenciar chamadas de métodos recursivos. Cada chamada recursiva cria um novo frame de pilha.

A relação entre o heap e a pilha é que as variáveis de referência a objetos são armazenadas na pilha, enquanto os objetos reais (incluindo seus dados) são armazenados no heap. A pilha contém endereços de referência para os objetos no heap. Quando uma variável de referência é criada, seu valor é o endereço do objeto no heap.

O JMM define regras para garantir a consistência e a sincronização correta entre threads ao acessar o heap e a pilha. Isso é fundamental para garantir a segurança e a corretude de programas Java multithreaded.

### Integer pool
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./05_arquivos/proj_01/)

O "Integer pool" (ou cache de Integer) é uma otimização implementada no Java para economizar memória e melhorar o desempenho ao lidar com objetos Integer. Ela se aplica a objetos Integer que representam valores inteiros na faixa de -128 a 127 (inclusive).

A ideia por trás do Integer pool é reutilizar os mesmos objetos Integer para representar valores comuns em vez de criar um novo objeto para cada ocorrência do mesmo valor. Isso economiza memória, pois objetos Integer geralmente têm uma sobrecarga de memória significativa em comparação com tipos primitivos inteiros.

Aqui está um exemplo que ilustra como o Integer pool funciona:
```java
Integer a = 100; // Um objeto Integer é criado e colocado no pool para representar o valor 100
Integer b = 100; // Em vez de criar um novo objeto, a referência b é configurada para apontar para o objeto existente no pool

System.out.println(a == b); // Isso imprimirá "true" porque a e b se referem ao mesmo objeto no pool

Integer x = 200; // Um objeto Integer é criado e colocado no heap para representar o valor 200
Integer y = 200; // Um objeto Integer é criado e colocado no heap para representar o valor 200

System.out.println(x == y); // Isso imprimirá "false" porque x e y se referem a objetos diferentes no heap
```

Observe que o comportamento do Integer pool se aplica apenas a valores inteiros na faixa de -128 a 127. Valores fora dessa faixa resultarão na criação de novos objetos Integer, mesmo que os valores sejam iguais.

É importante entender o Integer pool ao trabalhar com objetos Integer em Java, pois pode afetar o consumo de memória e o desempenho do seu código, especialmente em operações que envolvem valores comuns na faixa suportada pelo pool.

Objetos Integer com valores que estão fora da faixa de atuação do Integer pool (-128 a 127) têm seus valores armazenados no heap, e suas referências na stack do método normalmente, como qualquer outro objeto.

### Método equals()
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./05_arquivos/proj_01/)

O método equals() é usado para comparar se dois objetos são iguais em termos de conteúdo, em oposição à comparação por referência, que verifica se eles são a mesma instância de objeto na memória.

Ele é herdado da classe Object e deve ser sobrescrito em classes personalizadas, se necessário, para fornecer uma implementação significativa de igualdade.

A assinatura do método equals() na classe Object é a seguinte:
```java
public boolean equals(Object obj)
```

O método equals() retorna um valor booleano (true se os objetos são iguais, false caso contrário) e recebe um argumento do tipo Object, que é o objeto a ser comparado com o objeto atual.

Aqui está um exemplo de como você pode sobrescrever o método equals() em uma classe personalizada:
```java
public class Pessoa {
  private String nome;
  private int idade;

  public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true; // Os objetos são a mesma instância
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false; // O objeto é nulo ou não é uma instância da mesma classe
    }
    Pessoa outraPessoa = (Pessoa) obj; // Conversão segura, pois já verificamos a classe
    return idade == outraPessoa.idade && nome.equals(outraPessoa.nome);
  }

  // Outros métodos e construtores da classe Pessoa
}
```

Neste exemplo, a classe Pessoa sobrescreve o método equals() para comparar duas instâncias da classe com base no nome e na idade. Primeiro, ele verifica se os objetos são a mesma instância (o que é uma verificação de igualdade por referência) e, em seguida, compara os campos nome e idade para verificar a igualdade de conteúdo.

É importante seguir as diretrizes do contrato de igualdade ao sobrescrever o método equals(), que incluem a reflexividade, a simetria, a transitividade e a consistência. Além disso, é recomendável também sobrescrever o método hashCode() sempre que você sobrescrever o equals() para garantir a consistência na utilização de objetos em estruturas de dados baseadas em hash, como HashSet e HashMap.

### Comparação de arrays
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./05_arquivos/proj_01/)

A comparação de arrays em Java pode ser realizada de várias maneiras, dependendo do que você deseja comparar. Vou abordar três cenários comuns: igualdade de referência, igualdade de conteúdo e uso da classe Arrays.

**Igualdade de Referência**

Para verificar se dois arrays têm a mesma referência de objeto, você pode usar o operador ==. Isso verifica se os dois arrays são a mesma instância na memória.

```java
int[] array1 = {1, 2, 3};
int[] array2 = array1; // array2 aponta para o mesmo objeto que array1

boolean saoIguaisPorReferencia = (array1 == array2); // Retorna true
```

Neste exemplo, saoIguaisPorReferencia será true porque array1 e array2 referem-se à mesma instância de array na memória.

**Igualdade de Conteúdo**

Para verificar se dois arrays têm o mesmo conteúdo, você pode usar o método Arrays.equals(). Este método compara os elementos dos arrays.

```java
int[] array1 = {1, 2, 3};
int[] array2 = {1, 2, 3};

boolean saoIguaisPorConteudo = Arrays.equals(array1, array2); // Retorna true
```

Neste exemplo, saoIguaisPorConteudo será true porque array1 e array2 contêm os mesmos elementos nas mesmas posições.

**Comparação de Igualdade Personalizada**

Se você deseja realizar uma comparação de igualdade personalizada, ou seja, verificar se dois arrays têm conteúdos equivalentes, mas não necessariamente a mesma instância de objeto, você pode fazer isso manualmente percorrendo os elementos dos arrays.

```java
int[] array1 = {1, 2, 3};
int[] array2 = {3, 2, 1};

boolean saoEquivalentes = true;
if (array1.length == array2.length) {
  for (int i = 0; i < array1.length; i++) {
    if (array1[i] != array2[i]) {
      saoEquivalentes = false;
      break; // Se encontrarmos elementos diferentes, não precisamos mais verificar
    }
  }
} else {
  saoEquivalentes = false; // Os arrays têm comprimentos diferentes
}
```

Neste exemplo, saoEquivalentes será false porque os arrays não apresentam os valores nas mesmas posições.

Lembre-se de que a igualdade de referência (==) verifica se os dois arrays são a mesma instância na memória, enquanto a igualdade de conteúdo verifica se os elementos dos arrays são iguais. Escolha o método apropriado com base no que você deseja comparar.
