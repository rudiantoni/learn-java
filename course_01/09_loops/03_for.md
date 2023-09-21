# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## For
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [03_arquivos](./03_arquivos/)
- Projetos
  - [Projeto 1](./03_arquivos/proj_01/) [(iniciado em)](#o-loop-for)
- Conteúdo
  - [O loop for](#o-loop-for)
  - [Loop infinito](#loop-infinito)
  - [Declaração várias variáveis](#declaração-várias-variáveis)
  - [Diferentes maneiras de usar o loop for](#diferentes-maneiras-de-usar-o-loop-for)

### O loop for
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./03_arquivos/proj_01/)

O loop for é uma estrutura de controle em Java usada para executar um bloco de código várias vezes. Ele é frequentemente usado quando você sabe exatamente quantas vezes deseja que o bloco de código seja executado.

```java
for (int i = 1; i <= 5; i++) {
  System.out.println("Iteração " + i);
}
```
Neste exemplo:

- `int i = 1`: Inicializa a variável de controle i com o valor 1.
- `i <= 5`: Define a condição que determina quando o loop deve continuar a ser executado. Enquanto i for menor ou igual a 5, o loop continuará.
- `i++`: Incrementa a variável de controle i após cada iteração.

Isso resultará na impressão de "Iteração 1", "Iteração 2", ..., "Iteração 5".

### Loop infinito
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./03_arquivos/proj_01/)

Um loop infinito é um loop que nunca termina. Isso pode ocorrer se a condição que controla o loop nunca for falsa.

```java
for (;;) {
  System.out.println("Isso é um loop infinito!");
}
```

Neste exemplo, não há condição definida para sair do loop, então ele continuará sendo executado indefinidamente, imprimindo a mensagem repetidamente.

### Declaração várias variáveis
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./03_arquivos/proj_01/)

Você pode declarar e inicializar várias variáveis no cabeçalho de um loop for. Aqui está um exemplo:

```java
for (int i = 1, j = 10; i <= 5; i++, j--) {
  System.out.println("i = " + i + ", j = " + j);
}
```

Neste exemplo, declaramos duas variáveis, i e j, e as inicializamos com os valores 1 e 10, respectivamente. O loop continuará enquanto i for menor ou igual a 5. A cada iteração, i será incrementado em 1 e j será decrementado em 1.

### Diferentes maneiras de usar o loop for
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./03_arquivos/proj_01/)

**Iterando por um array**

```java
int[] numeros = {1, 2, 3, 4, 5};
for (int i = 0; i < numeros.length; i++) {
  System.out.println(numeros[i]);
}
```

**Iterando por uma coleção (Java 8+)**

```java
List<String> nomes = Arrays.asList("Alice", "Bob", "Charlie");
for (String nome : nomes) {
  System.out.println(nome);
}
```

**Iterando por uma sequência de números (Java 5+)**

```java
for (int numero : IntStream.range(1, 6).toArray()) {
  System.out.println(numero);
}
```
