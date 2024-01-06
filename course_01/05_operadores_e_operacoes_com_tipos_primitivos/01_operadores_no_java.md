# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## 5.1. Operadores no Java
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [01_arquivos](./01_arquivos/)
- Homework
  - [Arquivo: HW - Operators - Theory](./01_arquivos/homework/HW%20-%20Operators%20-%20Theory.pdf)
- Projetos
  - [Projeto 1](./01_arquivos/proj_01/) [(iniciado em)](#tipos-de-operadores)
- Conteúdo
  - [O que são operadores?](#o-que-são-operadores)
  - [Tipos de operadores](#tipos-de-operadores)
  - [Operadores aritméticos](#operadores-aritméticos)
  - [Operadores de atribuição](#operadores-de-atribuição)
  - [Operadores relacionais](#operadores-relacionais)
  - [Operadores lógicos](#operadores-lógicos)
  - [Operadores bit-a-bit](#operadores-bit-a-bit)
  - [Operador ternário](#operador-ternário)
  - [Precedência de operadores](#precedência-de-operadores)

### O que são operadores?
[[Topo]](#)<br />

Operadores em Java são símbolos especiais que são usados para realizar operações em variáveis e valores. Eles permitem a execução de ações como cálculos matemáticos, atribuições de valores, comparações entre valores e avaliação de expressões lógicas.

Se um operador necessita de um operando, ele é chamado de operador unário.

Se um operador necessita de dois operandos, ele é chamado de operador binário.

Se um operador necessita de três operandos, ele é chamado de operador ternário.

### Tipos de operadores
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./01_arquivos/proj_01/)

Em Java, os operadores são categorizados em vários tipos principais, incluindo:
- **Operadores aritméticos**: Usados para realizar cálculos matemáticos, como adição, subtração, multiplicação e divisão.
- **Operadores de atribuição**: Usados para atribuir valores a variáveis, com operadores como '=' (atribuição simples) e operadores combinados.
- **Operadores relacionais**: Utilizados para comparar valores e determinar relações, como igualdade, desigualdade, maior que e menor que.
- **Operadores lógicos**: Usados para realizar operações lógicas em valores booleanos, como AND, OR e NOT.
- **Operadores bit-a-bit**: Utilizados para realizar manipulações de bits, incluindo operadores AND bit-a-bit, OR bit-a-bit e deslocamento de bits.
- **Operador ternário**: É uma forma condicional de expressão que permite fazer uma escolha com base em uma condição.
- **Operador de precedência**: Define a ordem em que os operadores são avaliados em uma expressão, ajudando a determinar a prioridade das operações.

### Operadores aritméticos
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./01_arquivos/proj_01/)

- **Adição (+)**: Usado para somar dois valores.
- **Subtração (-)**: Usado para subtrair o segundo valor do primeiro.
- **Multiplicação (*)**: Usado para multiplicar dois valores.
- **Divisão (/)**: Usado para dividir o primeiro valor pelo segundo. Isso produz um resultado em ponto flutuante, a menos que ambos os operandos sejam inteiros.
- **Módulo (%)**: Usado para encontrar o resto da divisão do primeiro valor pelo segundo. Retorna um valor inteiro representando o resto da divisão.

Além desses operadores básicos, existem também operadores de incremento e decremento:

- **Incremento (++)**: Usado para aumentar o valor de uma variável em 1.
- **Decremento (--)**: Usado para diminuir o valor de uma variável em 1.

Os operadores de incremento e decremento podem ser usados da seguinte maneira: `x++`, `++x`, `x--` e `--x`.

As diferenças entre `x++`, `++x`, `x--` e `--x` estão relacionadas ao comportamento dos operadores de incremento e decremento.

**x++ (pós-incremento)**
- O valor atual de x é usado na expressão antes de ser incrementado.
- Primeiro, a expressão com o valor atual de x é avaliada.
- Em seguida, x é incrementado em 1.
- O resultado da expressão é o valor original de x antes da incrementação.
```java
int x = 5;
int result = x++; // result é 5, x agora é 6
```

**++x (pré-incremento)**
- x é incrementado em 1 antes de seu valor ser usado na expressão.
- Primeiro, x é incrementado em 1.
- Em seguida, a expressão com o novo valor de x é avaliada.
- O resultado da expressão é o novo valor de x após a incrementação.

```java
int x = 5;
int result = ++x; // result é 6, x agora é 6
```

**x-- (pós-decremento)**
- O valor atual de x é usado na expressão antes de ser decrementado.
- Primeiro, a expressão com o valor atual de x é avaliada.
- Em seguida, x é decrementado em 1.
- O resultado da expressão é o valor original de x antes da decrementação.
```java
int x = 5;
int result = x--; // result é 5, x agora é 4
```

**--x (pré-decremento)**
- x é decrementado em 1 antes de seu valor ser usado na expressão.
- Primeiro, x é decrementado em 1.
- Em seguida, a expressão com o novo valor de x é avaliada.
- O resultado da expressão é o novo valor de x após a decrementação.
```java
int x = 5;
int result = --x; // result é 4, x agora é 4
```

Em resumo, a diferença principal entre `x++`/`x--` e `++x`/`--x` está na ordem em que a operação de incremento ou decremento ocorre em relação à avaliação da expressão. O pós-incremento e o pós-decremento usam o valor atual de x na expressão antes de alterá-lo, enquanto o pré-incremento e o pré-decremento alteram x antes de usá-lo na expressão.

### Operadores de atribuição
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./01_arquivos/proj_01/)

Os operadores de atribuição facilitam a modificação de variáveis de forma concisa e eficiente em Java, permitindo que você realize várias operações em uma única linha de código.

- **Atribuição simples (=)**: Usado para atribuir o valor do lado direito a uma variável do lado esquerdo.
- **Atribuição de adição (+=)**: Usado para somar o valor do lado direito ao valor da variável do lado esquerdo e atribuir o resultado à variável do lado esquerdo.
- **Atribuição de subtração (-=)**: Usado para subtrair o valor do lado direito do valor da variável do lado esquerdo e atribuir o resultado à variável do lado esquerdo.
- **Atribuição de multiplicação (*=)**: Usado para multiplicar o valor da variável do lado esquerdo pelo valor do lado direito e atribuir o resultado à variável do lado esquerdo.
- **Atribuição de divisão (/=)**: Usado para dividir o valor da variável do lado esquerdo pelo valor do lado direito e atribuir o resultado à variável do lado esquerdo.
- **Atribuição de módulo (%=)**: Usado para calcular o módulo do valor da variável do lado esquerdo em relação ao valor do lado direito e atribuir o resultado à variável do lado esquerdo.
- **Atribuição de deslocamento à esquerda (<<=)**: Usado para realizar um deslocamento à esquerda do valor da variável do lado esquerdo pelo número de posições especificado no valor do lado direito e atribuir o resultado à variável do lado esquerdo.
- **Atribuição de deslocamento à direita (>>=)**: Usado para realizar um deslocamento à direita do valor da variável do lado esquerdo pelo número de posições especificado no valor do lado direito e atribuir o resultado à variável do lado esquerdo.
- **Atribuição de deslocamento à direita não assinado (>>>=)**: Usado para realizar um deslocamento à direita não assinado do valor da variável do lado esquerdo pelo número de posições especificado no valor do lado direito e atribuir o resultado à variável do lado esquerdo.

### Operadores relacionais
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./01_arquivos/proj_01/)

Os operadores relacionais são usados para comparar valores e expressões, geralmente retornando um valor booleano (verdadeiro ou falso) que indica se a condição é verdadeira ou falsa.

Eles são amplamente utilizados em estruturas de controle de fluxo, como condicionais (if, else if, else) e loops (while, for), para tomar decisões com base nas relações entre valores. Eles ajudam a criar lógica condicional em programas Java.

- **Igual a (==)**: Verifica se dois valores são iguais.
- **Diferente de (!=)**: Verifica se dois valores não são iguais.
- **Maior que (>)**: Verifica se o valor da esquerda é maior que o valor da direita.
- **Menor que (<)**: Verifica se o valor da esquerda é menor que o valor da direita.
- **Maior ou igual a (>=)**: Verifica se o valor da esquerda é maior ou igual ao valor da direita.
- **Menor ou igual a (<=)**: Verifica se o valor da esquerda é menor ou igual ao valor da direita.

### Operadores lógicos
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./01_arquivos/proj_01/)

Os operadores lógicos são usados para realizar operações lógicas em valores booleanos ou expressões, retornando um valor booleano como resultado. 

Eles são frequentemente usados em estruturas condicionais e em avaliações de expressões booleanas para controlar o fluxo do 
programa com base em condições específicas. Eles são fundamentais para criar lógica condicional em Java.

- **AND lógico (&&)**: Retorna verdadeiro (true) se ambos os operandos forem verdadeiros. Caso contrário, retorna falso (false).
- **OR lógico (||)**: Retorna verdadeiro (true) se pelo menos um dos operandos for verdadeiro. Retorna falso (false) apenas se ambos forem falsos.
- **NOT lógico (!)**: Inverte o valor de um operando booleano. Se o operando for verdadeiro, retorna falso; se for falso, retorna verdadeiro.

### Operadores bit-a-bit
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./01_arquivos/proj_01/)

Os operadores bit-a-bit são usados para realizar operações de manipulação de bits em números inteiros.

Eles são utilizados para realizar operações de baixo nível na manipulação de bits, como configurações de máscaras de bits, cálculos de hash e outras operações relacionadas a bits. Eles são comuns em programação de sistemas e em situações em que é necessário trabalhar diretamente com representações binárias de números.

- **AND bit-a-bit (&)**: Realiza uma operação "E" bit-a-bit em dois números. Cada bit no resultado será 1 se ambos os bits correspondentes nos operandos forem 1.
- **OR bit-a-bit (|)**: Realiza uma operação "OU" bit-a-bit em dois números. Cada bit no resultado será 1 se pelo menos um dos bits correspondentes nos operandos for 1.
- **XOR bit-a-bit (^)**: Realiza uma operação "OU exclusivo" bit-a-bit em dois números. Cada bit no resultado será 1 se exatamente um dos bits correspondentes nos operandos for 1.
- **NOT bit-a-bit (~)**: Inverte todos os bits em um número, transformando 0 em 1 e 1 em 0.
- **Deslocamento à esquerda (<<)**: Move todos os bits de um número para a esquerda por um número especificado de posições, preenchendo os bits vazios com zeros.
- **Deslocamento à direita (>>)**: Move todos os bits de um número para a direita por um número especificado de posições. O bit mais à esquerda (o bit de sinal) é preenchido com o mesmo valor que o bit de sinal original (0 para valores positivos e 1 para valores negativos).
- **Deslocamento à direita não assinado (>>>)**: Move todos os bits de um número para a direita por um número especificado de posições, preenchendo os bits vazios com zeros. Diferentemente do operador ">>", este operador sempre preenche com zero o bit mais à esquerda, não importa o sinal do número.

### Operador ternário
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./01_arquivos/proj_01/)

Há apenas um operador ternário, que é frequentemente chamado de "operador condicional ternário." Este operador é representado da seguinte forma:

```java
condição ? expressão1 : expressão2
```

Aqui está como funciona:

- A "condição" é uma expressão booleana que é avaliada primeiro.
- Se a condição for verdadeira, "expressão1" será avaliada e seu resultado será retornado.
- Se a condição for falsa, "expressão2" será avaliada e seu resultado será retornado.

Este operador é útil para escolher entre duas opções com base em uma condição. Por exemplo, você pode usá-lo para atribuir diferentes valores a uma variável com base em uma condição ou para retornar diferentes resultados de uma função com base em uma condição. É uma forma compacta de expressar decisões condicionais em uma única linha de código.

### Precedência de operadores
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./01_arquivos/proj_01/)

Os operadores têm diferentes níveis de precedência, o que determina a ordem em que eles são avaliados em uma expressão.

Os parênteses **()** podem ser usados para alterar a ordem de avaliação e controlar a precedência em expressões complexas. Os operadores com maior precedência são avaliados antes dos operadores com menor precedência.

Abaixo estão os operadores de precedência em Java, listados em ordem da mais alta precedência (ou seja, os operadores de maior prioridade) para a mais baixa precedência:

1. Operadores de membro
- **.** (acesso a membros de objetos)
- **[]** (índices de arrays)

2. Operadores unários
- **++** (pós-incremento)
- **--** (pós-decremento)
- **+** (positivo)
- **-** (negativo)
- **!** (negação lógica)
- **~** (complemento de bits)

3. Operadores de multiplicação e divisão
- **\*** (multiplicação)
- **/** (divisão)
- **%** (módulo)

4. Operadores de adição e subtração
- **+** (adição)
- **-** (subtração)

5. Operadores de deslocamento
- **<<** (deslocamento à esquerda)
- **>>** (deslocamento à direita)
- **>>>** (deslocamento à direita não assinado)

6. Operadores relacionais
- **<** (menor que)
- **>** (maior que)
- **<=** (menor ou igual a)
- **>=** (maior ou igual a)
- **instanceof** (verificação de instância)

7. Operadores de igualdade
- **==** (igual a)
- **!=** (diferente de)

8. Operadores bit-a-bit:
- **&** (AND bit-a-bit)
- **^** (XOR bit-a-bit)
- **|** (OR bit-a-bit)

9. Operadores lógicos
- **&&** (AND lógico)
- **||** (OR lógico)

10. Operador condicional ternário
- **? :** (operador ternário)

11. Operadores de atribuição
- **=** (atribuição simples)
- **+=** (atribuição de adição)
- **-=** (atribuição de subtração)
- ***=** (atribuição de multiplicação)
- **/=** (atribuição de divisão)
- **%=** (atribuição de módulo)
- **&=** (atribuição de AND bit-a-bit)
- **^=** (atribuição de XOR bit-a-bit)
- **|=** (atribuição de OR bit-a-bit)
- **<<=** (atribuição de deslocamento à esquerda)
- **>>=** (atribuição de deslocamento à direita)
- **>>>=** (atribuição de deslocamento à direita não assinado)
