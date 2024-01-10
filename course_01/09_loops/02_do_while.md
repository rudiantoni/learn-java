# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## 9.2. Do-while
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [02_arquivos](./02_arquivos/)
- Projetos
  - [Projeto 1](./02_arquivos/proj_01/) [(iniciado em)](#o-loop-do-while)
- Conteúdo
  - [O loop do-while](#o-loop-do-while)
  - [Loop infinito](#loop-infinito)

### O loop do-while
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./02_arquivos/proj_01/)

O loop do-while é uma estrutura de controle em Java que permite executar um bloco de código pelo menos uma vez e, em seguida, repeti-lo enquanto uma condição específica for verdadeira.

A principal diferença entre o do-while e o while é que no do-while, o bloco de código é executado antes de verificar a condição.

Aqui está um exemplo de código Java que utiliza um loop do-while para imprimir números de 1 a 5:

```java
int contador = 1;

do {
  System.out.println(contador);
  contador++;
} while (contador <= 5);
```

Neste exemplo, o bloco de código dentro do do é executado primeiro, imprimindo o valor de contador, que começa em 1. Após a execução do bloco, a condição contador <= 5 é verificada. Se a condição for verdadeira, o loop continuará a ser executado, incrementando o valor de contador e imprimindo os números até que a condição se torne falsa.

### Loop infinito
[[Topo]](#)<br />

Assim como em outros tipos de loops, é possível criar um loop infinito com do-while se a condição nunca se tornar falsa. Aqui está um exemplo de um loop do-while infinito em Java:

```java
do {
  System.out.println("Este é um loop do-while infinito!");
} while (true);
```

Neste exemplo, o bloco dentro do do é executado primeiro e, em seguida, a condição true é verificada. Como true é sempre verdadeiro, o loop nunca será encerrado e continuará a imprimir a mensagem "Este é um loop do-while infinito!" indefinidamente.

É importante tomar cuidado ao usar do-while para garantir que você tenha uma maneira de sair do loop, seja definindo uma condição de parada apropriada ou usando instruções como break para interromper a execução do loop quando necessário. Caso contrário, seu programa pode entrar em um loop infinito indesejado.
