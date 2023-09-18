# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Construção de if-else
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [01_arquivos](./01_arquivos/)
- Homework
  - [Arquivo: HW - if-else](./01_arquivos/homework/HW%20-%20if-else.pdf)
  - [Homework: Admin e convidado](#homework-admin-e-convidado)
  - [Homework: Soma de inteiro ou decimal](#homework-soma-de-inteiro-ou-decimal)
- Projeto
  - [Projeto 1](./01_arquivos/proj_01/) [(iniciado em)](#instruções-if-else)
- Exercícios
  - [Exercício 1](./01_arquivos/exercicio_01/) ([enunciado](#homework-admin-e-convidado))
  - [Exercício 2](./01_arquivos/exercicio_02/) ([enunciado](#homework-soma-de-inteiro-ou-decimal))
- Conteúdo
  - [Instruções if-else](#instruções-if-else)
  - [Uso do if-else sem chaves](#uso-do-if-else-sem-chaves)
  - [Instruções if-else aninhadas](#instruções-if-else-aninhadas)
  - [Instruções if-else-if](#instruções-if-else-if)

### Instruções if-else
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./01_arquivos/proj_01/)

Os comandos if e else são fundamentais em qualquer linguagem de programação, incluindo Java, para controlar o fluxo de execução do programa com base em condições lógicas.

O comando if é usado para executar um bloco de código somente se uma condição for verdadeira. A sintaxe básica é a seguinte:

```java
if (condicao) {
    // Código a ser executado se a condição for verdadeira
}
```

Exemplo de código:

```java
int idade = 25;

if (idade >= 18) {
  System.out.println("Você é maior de idade.");
}
```

Neste exemplo, o código dentro do bloco if será executado apenas se a variável idade for maior ou igual a 18.

O comando else é usado em conjunto com o if para executar um bloco de código alternativo quando a condição do if for falsa. A sintaxe é a seguinte:

```java
if (condicao) {
  // Código a ser executado se a condição for verdadeira
} else {
  // Código a ser executado se a condição for falsa
}
```

Exemplo de código:

```java
int idade = 15;

if (idade >= 18) {
  System.out.println("Você é maior de idade.");
} else {
  System.out.println("Você é menor de idade.");
}
```

Neste exemplo, o programa verifica se a variável idade é maior ou igual a 18. Se for verdadeira, ele imprime "Você é maior de idade." Caso contrário, ele imprime "Você é menor de idade."

### Uso do if-else sem chaves
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./01_arquivos/proj_01/)

É comum usar chaves ({}) para delimitar blocos de código que são executados condicionalmente dentro de um if ou else. No entanto, em situações específicas, você pode usar o if e o else sem chaves quando deseja que apenas uma única instrução seja executada condicionalmente. Isso é especialmente útil quando a instrução condicional é simples e consiste em apenas uma linha de código.

```java
int numero = 10;
if (numero > 5)
  System.out.println("O número é maior que 5.");
else
  System.out.println("O número não é maior que 5.");
```

Neste exemplo, o if e o else são usados sem chaves. A única instrução associada a cada bloco if ou else é uma única linha System.out.println(). O Java permite que você faça isso quando há apenas uma instrução em um bloco condicional. Se a condição for verdadeira, a instrução no if será executada; caso contrário, a instrução no else será executada.

No entanto, é importante observar que o uso de chaves é recomendado para melhorar a legibilidade do código e evitar problemas de ambiguidade. Usar chaves torna mais claro qual bloco de código está associado a cada if ou else, especialmente quando há várias instruções em um bloco condicional.

```java
int numero = 10;

if (numero > 5) {
  System.out.println("O número é maior que 5.");
} else {
  System.out.println("O número não é maior que 5.");
}
```

Usar chaves é uma prática recomendada porque torna o código mais legível e menos propenso a erros quando novas instruções são adicionadas aos blocos condicionais no futuro.

### Instruções if-else aninhadas
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./01_arquivos/proj_01/)

É possível aninhar instruções if e else para criar estruturas condicionais mais complexas. Isso significa que você pode colocar um if dentro de outro if ou dentro de um else para lidar com várias condições sequenciais.

Essa técnica é útil quando você precisa avaliar condições em camadas para determinar o fluxo de execução do programa.

**Aninhamento simples de if-else**

Neste exemplo, usamos instruções if e else aninhadas para determinar a categoria de uma nota escolar:

```java
int nota = 85;

if (nota >= 90) {
  System.out.println("A");
} else {
  if (nota >= 80) {
    System.out.println("B");
  } else {
    if (nota >= 70) {
      System.out.println("C");
    } else {
      System.out.println("D");
    }
  }
}
```

Este código avalia a nota e imprime a categoria da nota (A, B, C ou D) com base em várias condições aninhadas.

**Aninhamento de if-else para avaliação de múltiplas condições**

Neste exemplo, usamos instruções if-else aninhadas para verificar as condições de elegibilidade para um empréstimo bancário com base na renda e na idade:

```java
double rendaAnual = 50000.0;
int idade = 30;

if (idade >= 18) {
  if (rendaAnual >= 30000.0) {
    System.out.println("Elegível para empréstimo.");
  } else {
    System.out.println("Renda insuficiente.");
  }
} else {
  System.out.println("Idade insuficiente.");
}
```

Este código verifica primeiro se o requerente tem idade suficiente e, em seguida, avalia a renda para determinar a elegibilidade para um empréstimo.

### Instruções if-else-if
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./01_arquivos/proj_01/)

Você pode usar as instruções if e else if para criar estruturas condicionais mais complexas, onde você pode avaliar várias condições em sequência. 

O if inicial é usado para verificar a primeira condição, e os else if subsequentes são usados para verificar condições adicionais se o if anterior for falso.

**Estrutura Básica do if-else-if**

A estrutura básica do if-else-if se parece com isto:

```java
if (condicao1) {
  // Código a ser executado se a condicao1 for verdadeira
} else if (condicao2) {
  // Código a ser executado se a condicao2 for verdadeira
} else if (condicao3) {
  // Código a ser executado se a condicao3 for verdadeira
} else {
  // Código a ser executado se nenhuma das condições for verdadeira
}
```

O programa verifica cada condição na ordem em que são apresentadas, executando o primeiro bloco de código cuja condição seja verdadeira. Se nenhuma condição for verdadeira e houver um bloco else no final, o código dentro desse bloco será executado.

**Exemplo de if e else if**

Aqui está um exemplo simples usando if-else-if para determinar o estado da água com base na sua temperatura:

```java
int temperatura = 75;

if (temperatura <= 0) {
  System.out.println("A água está congelada.");
} else if (temperatura >= 100) {
  System.out.println("A água está fervendo.");
} else {
  System.out.println("A água está no estado líquido.");
}
```

Neste exemplo, o programa verifica a temperatura da água e imprime uma mensagem de acordo com a condição que for verdadeira.

**Importante Consideração**

É importante observar que, uma vez que uma condição seja avaliada como verdadeira e o código dentro do bloco correspondente for executado, **os blocos else if subsequentes não serão verificados**. Portanto, a ordem das condições é crucial. Coloque as condições mais específicas ou restritivas no topo e as condições mais gerais no final. Se você inverter a ordem das condições, poderá obter resultados inesperados.

O uso de if e else if é útil quando você precisa lidar com várias condições diferentes e deseja escolher uma única ação com base na primeira condição que for verdadeira.

### Homework: Admin e convidado
[[Topo]](#)<br />

- Ver homework: [HW - if-else](./01_arquivos/homework/HW%20-%20if-else.pdf)

Implemente um programa de console que atenda aos seguintes requisitos:

1. O programa pode ser iniciado no modo 'admin' e 'guest'.
2. Para iniciar o programa no modo 'admin', qualquer um dos vários argumentos de string deve ser igual a '--admin'.
3. Para iniciar o programa no modo 'guest', qualquer um dos vários argumentos de string deve ser igual a '--guest'.
4. O programa não pode ser iniciado com argumentos '--admin' e '--guest' simultaneamente.
5. Se o programa for iniciado no modo 'admin', ele imprimirá "Olá, Administrador!" no console.
6. Se o programa for iniciado no modo 'guest', ele imprimirá "Olá, Convidado!" no console.
7. Se o programa for iniciado com os argumentos '--admin' e '--guest', então o programa imprime "Por favor, selecione o modo 'ADMIN' ou 'GUEST' para este programa" no console.

> Exercício 1 (Construção de if-else): [01_arquivos/exercicio_01](./01_arquivos/exercicio_01/)

### Homework: Soma de inteiro ou decimal
[[Topo]](#)<br />

- Ver homework: [HW - if-else](./01_arquivos/homework/HW%20-%20if-else.pdf)

Implemente um programa de console que atenda aos seguintes requisitos:

1. O programa é iniciado com dois argumentos (números).
2. O programa adiciona esses dois números.
3. No caso de um dos argumentos de entrada ser um número de ponto flutuante, o resultado da adição também é um número de ponto flutuante.
4. No caso de ambos os argumentos serem números inteiros, o resultado da adição é um número inteiro.

> Exercício 2 (Construção de if-else): [01_arquivos/exercicio_02](./01_arquivos/exercicio_02/)
