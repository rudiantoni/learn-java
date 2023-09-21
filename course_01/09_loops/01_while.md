# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Loop while
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [01_arquivos](./01_arquivos/)
- Projetos
  - [Projeto 1](./01_arquivos/proj_01/) [(iniciado em)](#o-loop-while)
- Conteúdo
  - [O que são loops](#o-que-são-loops)
  - [Quando precisamos usar loops](#quando-precisamos-usar-loops)
  - [O loop while](#o-loop-while)

### O que são loops
[[Topo]](#)<br />

Loops, também conhecidos como instruções de iteração, são estruturas de controle em programação que permitem executar um bloco de código repetidamente enquanto uma condição específica for atendida.

Eles são usados para automatizar tarefas que precisam ser executadas várias vezes.

### Quando precisamos usar loops
[[Topo]](#)<br />

Os loops são necessários sempre que temos tarefas que precisam ser repetidas um número específico de vezes ou enquanto uma condição específica for verdadeira.

Alguns cenários comuns onde os loops são úteis incluem:

- Processamento de elementos de uma lista ou array.
- Leitura e escrita de dados em arquivos.
- Interação com o usuário até que uma ação específica seja tomada.
- Realização de cálculos iterativos, como aproximar valores ou encontrar raízes.

### O loop while
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./01_arquivos/proj_01/)

O loop while é uma estrutura de controle que executa um bloco de código enquanto uma condição dada for verdadeira.

A condição é avaliada antes da execução do bloco de código, o que significa que o bloco pode nunca ser executado se a condição inicialmente for falsa.

Aqui está um exemplo de código Java que utiliza um loop while para imprimir números de 1 a 5:

```java
int contador = 1;
while (contador <= 5) {
  System.out.println(contador);
  contador++;
}
```

Neste exemplo, o loop while verifica se contador é menor ou igual a 5 antes de cada iteração. Enquanto essa condição for verdadeira, o bloco de código dentro do loop é executado e o valor de contador é incrementado em 1 após cada iteração. O loop continuará a ser executado até que a condição se torne falsa.

**Loop infinito**:

Um loop infinito é um loop que nunca termina, pois a condição de parada nunca é alcançada.

Eles podem resultar em programas que travam ou consomem todos os recursos da máquina. É importante evitá-los.


```java
while (true) {
  System.out.println("Este é um loop infinito!");
}
```

Neste exemplo, a condição true é sempre verdadeira, portanto, o loop nunca terminará. Certifique-se de que sua condição de parada seja definida adequadamente para evitar loops infinitos.
