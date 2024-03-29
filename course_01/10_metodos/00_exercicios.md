# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Exercícios - 10. Métodos
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Homework
  - [10.4. Argumentos de comprimento variável](#104-argumentos-de-comprimento-variável)
    - [Arquivo: HW - Methods](./04_arquivos/homework/HW%20-%20Methods.pdf)
- Exercícios
  - [10.4. Argumentos de comprimento variável](#104-argumentos-de-comprimento-variável)
    - [Exercício 1](./exercicio_01/) ([enunciado](#maior-inteiro-em-array))
    - [Exercício 2](./exercicio_02/) ([enunciado](#retângulo-no-console))
    - [Exercício 3](./exercicio_03/) ([enunciado](#contar-palavras))
    - [Exercício 4](./exercicio_04/) ([enunciado](#filtrar-palavras))
    - [Exercício 5](./exercicio_05/) ([enunciado](#girar-matriz))
    - [Exercício 6](./exercicio_06/) ([enunciado](#arrays-dinâmicos))
    - [Exercício 7](./exercicio_07/) ([enunciado](#maior-divisor-comum))
    - [Exercício 8](./exercicio_08/) ([enunciado](#soma-de-dígitos))
    - [Exercício 9](./exercicio_09/) ([enunciado](#formatar-e-mails))
    - [Exercício 10](./exercicio_10/) ([enunciado](#formatar-títulos))
    - [Exercício 11](./exercicio_11/) ([enunciado](#converter-decimais-e-romanos))

### 10.4. Argumentos de comprimento variável
[[Topo]](#)<br />

#### Maior inteiro em array
[[Topo]](#)<br />

- Ver homework: [HW - Methods](./04_arquivos/homework/HW%20-%20Methods.pdf)

Implemente um programa de console que atenda aos seguintes requisitos:
- O programa inicia e solicita ao usuário que insira números inteiros separados por espaço.
- O programa cria um objeto de array com os números inseridos.
- O programa chama um método específico que recebe um int[] como parâmetro e retorna o valor máximo nesse array.

O método deve se parecer com isto:

```java
public static int findMaxIntInArray(int[] intArray) {
  // <write your code here>
}
```

> Exercício 1 (Argumentos de comprimento variável): [exercicio_01](./exercicio_01)

#### Retângulo no console
[[Topo]](#)<br />

- Ver homework: [HW - Methods](./04_arquivos/homework/HW%20-%20Methods.pdf)

Implemente um programa de console que atenda aos seguintes requisitos:
- O programa inicia e solicita ao usuário que insira a altura do retângulo.
- Após o usuário inserir a altura do retângulo, o programa solicita que ele insira a largura do retângulo.
- O programa chama um método específico que recebe dois parâmetros do tipo int e imprime o retângulo no console.

Exemplo:

- Entradas do usuário
  - Altura: 3
  - Largura: 6
- Saída do console do programa:
```
******
*    *
******
```
- Observação: o retângulo é vazio por dentro.

O método deve se parecer com isto:

```java
public static void drawRectangle(int height, int width) {
  // <write your code here>
}
```

> Exercício 2 (Argumentos de comprimento variável): [exercicio_02](./exercicio_02)

#### Contar palavras
[[Topo]](#)<br />

- Ver homework: [HW - Methods](./04_arquivos/homework/HW%20-%20Methods.pdf)

Implemente um programa de console que atenda aos seguintes requisitos:
- O programa inicia e pede ao usuário para inserir um texto.
- O programa chama uma função específica que recebe um parâmetro do tipo String e retorna a quantidade de palavras no texto.
- O programa imprime a quantidade de palavras no console.

O método deve ser semelhante a isto:

```java
public static int getWordsAmount(String text) {
  // <write your code here>
}
```

> Exercício 3 (Argumentos de comprimento variável): [exercicio_03](./exercicio_03)

#### Filtrar palavras
[[Topo]](#)<br />

- Ver homework: [HW - Methods](./04_arquivos/homework/HW%20-%20Methods.pdf)

Implemente um programa de console que atenda aos seguintes requisitos:
- O programa inicia e pede ao usuário para inserir palavras aleatórias separadas por espaço.
- O programa pede ao usuário para inserir o comprimento mínimo das palavras para filtrar as palavras que foram inseridas.
- O programa cria um objeto de array a partir das palavras inseridas.
- O programa chama um método específico que recebe um parâmetro do tipo String[] e retorna um array de strings que contém palavras com comprimento maior ou igual ao valor especificado pelo usuário.
- O programa imprime o array filtrado na saída do console.

O método deve ser semelhante a isto:

```java
public static String[] filterWordsByLength(int minLength, String[] words) {
  // <write your code here>
}
```

> Exercício 4 (Argumentos de comprimento variável): [exercicio_04](./exercicio_04)

#### Girar matriz
[[Topo]](#)<br />

- Ver homework: [HW - Methods](./04_arquivos/homework/HW%20-%20Methods.pdf)

Implemente um programa de console que atenda aos seguintes requisitos:
- O programa inicia e pergunta ao usuário para especificar o tamanho da matriz. Por exemplo, se o usuário inserir '5', o programa gerará a seguinte matriz:

```
0.0   0.1   0.2   0.3   0.4
1.0   1.1   1.2   1.3   1.4
2.0   2.1   2.2   2.3   2.4
3.0   3.1   3.2   3.3   3.4
4.0   4.1   4.2   4.3   4.4
```
- O programa pergunta ao usuário a seguinte pergunta com opções:
  - Quanto você deseja girar a matriz?
  - Pressione 1 para girar a matriz 90 graus
  - Pressione 2 para girar a matriz 180 graus
  - Pressione 3 para girar a matriz 270 graus
- Quando o usuário escolhe o modo de rotação, o programa imprime a matriz inicial e a matriz girada.
- Rotação de 90 graus se parece com isto
  ```
  4.0   3.0   2.0   1.0   0.0
  4.1   3.1   2.1   1.1   0.1
  4.2   3.2   2.2   1.2   0.2
  4.3   3.3   2.3   1.3   0.3
  4.4   3.4   2.4   1.4   0.4
  ```
- Rotação de 180 graus se parece com isto
  ```
  4.4   4.3   4.2   4.1   4.0
  3.4   3.3   3.2   3.1   3.0
  2.4   2.3   2.2   2.1   2.0
  1.4   1.3   1.2   1.1   1.0
  0.4   0.3   0.2   0.1   0.0
  ```
- Rotação de 270 graus se parece com isto
  ```
  0.4   1.4   2.4   3.4   4.4
  0.3   1.3   2.3   3.3   4.3
  0.2   1.2   2.2   3.2   4.2
  0.1   1.1   2.1   3.1   4.1
  0.0   1.0   2.0   3.0   4.0
  ```
- Você deve implementar os seguintes métodos

```java
public static void rotate90(double[][] matrix) {
  // <write your code here>
}

public static void rotate180(double[][] matrix) {
  // <write your code here>
}

public static void rotate270(double[][] matrix) {
  // <write your code here>
}
```

> Exercício 5 (Argumentos de comprimento variável): [exercicio_05](./exercicio_05)

#### Arrays dinâmicos
[[Topo]](#)<br />

- Ver homework: [HW - Methods](./04_arquivos/homework/HW%20-%20Methods.pdf)

Implemente um programa de console que atenda aos seguintes requisitos:
- O programa inicia e pergunta ao usuário para inserir o comprimento de um array.
- O programa gera um array de números inteiros aleatórios (use java.util.Random) com o comprimento da matriz especificado pelo usuário.
- O programa cria o segundo array com o dobro do tamanho do primeiro array.
- Os primeiros elementos do novo array são os mesmos elementos do array antigo. A outra metade dos elementos são os elementos do primeiro array multiplicados por dois.

Exemplo:

- Entrada do usuário: 10
- O primeiro array deve ser: `{1, 3, 5, 7, 10, 11, 12, 15, 17, 20}` (gerado aleatoriamente)
- O segundo array deve ser: `{1, 3, 5, 7, 10, 11, 12, 15, 17, 20, 2, 6, 10, 14, 20, 22, 24, 30, 34, 40}`

O método para gerar array deve ser semelhante a isto:

```java
public static int[] generateRandomArray(int amountOfElements) {
  // <write your code here>
}
```

O método para criar o array com o tamanho igual ao dobro deve ser semelhante a isto:

```java
public static int[] extendArray(int[] arr) {
  // <write your code here>
}
```

> Exercício 6 (Argumentos de comprimento variável): [exercicio_06](./exercicio_06)

#### Maior divisor comum
[[Topo]](#)<br />

- Ver homework: [HW - Methods](./04_arquivos/homework/HW%20-%20Methods.pdf)

Implemente um programa de console que atenda aos seguintes requisitos:
- O programa inicia e pede ao usuário para inserir dois números separados por espaço.
- O programa chama um método específico para encontrar o maior divisor comum.
- O programa imprime o maior divisor comum no console.

```java
public static int gcdRecursive(int firstNumber, int secondNumber) {
  // <write your code here>
}
```

> Exercício 7 (Argumentos de comprimento variável): [exercicio_07](./exercicio_07)

#### Soma de dígitos
[[Topo]](#)<br />

- Ver homework: [HW - Methods](./04_arquivos/homework/HW%20-%20Methods.pdf)

Implemente um programa de console que atenda aos seguintes requisitos:
- O programa inicia e pede ao usuário para inserir um número.
- O programa chama um método que recebe um inteiro como argumento e retorna a soma de todos os dígitos desse número.
- O programa imprime a soma de todos os dígitos no console.

O método deve ser semelhante a isto:

```java
public static int sumDigitsInPositiveNumber(int number) {
  // <write your code here>
}
```

> Exercício 8 (Argumentos de comprimento variável): [exercicio_08](./exercicio_08)

#### Formatar e-mails
[[Topo]](#)<br />

- Ver homework: [HW - Methods](./04_arquivos/homework/HW%20-%20Methods.pdf)

Implemente um programa de console que atenda aos seguintes requisitos:
- O programa contém métodos que podem processar uma string de entrada de acordo com os requisitos abaixo.
- Você tem uma string de entrada como esta:
```
Login;Name;Email
peterson;Chris Peterson;peterson@outlook.com
james;Derek James;james@gmail.com
jackson;Walter Jackson;jackson@gmail.com
gregory;Mike Gregory;gregory@yahoo.com
```
- Seu programa possui o seguinte método:
```java
public static String convert1(String input) {
  // <write your code here>
}
```
- Que formata os dados de entrada da seguinte forma:
```
peterson ==> peterson@outlook.com
james ==> james@gmail.com
jackson ==> jackson@gmail.com
gregory ==> gregory@yahoo.com
```
- Seu programa possui o seguinte método:
```java
public static String convert2(String input) {
  // <write your code here>
}
```
- Que formata os dados de entrada da seguinte forma:
```
Chris Peterson (email: peterson@outlook.com)
Derek James (email: james@gmail.com)
Walter Jackson (email: jackson@gmail.com)
Mike Gregory (email: gregory@yahoo.com)
```

> Exercício 9 (Argumentos de comprimento variável): [exercicio_09](./exercicio_09)

#### Formatar títulos
[[Topo]](#)<br />

- Ver homework: [HW - Methods](./04_arquivos/homework/HW%20-%20Methods.pdf)

Implemente um programa de console que atenda aos seguintes requisitos:
- O programa inicia e pede ao usuário que insira um texto.
- O programa formata o texto com as seguintes regras:
  - Todos os caracteres em uma palavra devem ser convertidos para letras minúsculas.
  - A primeira letra na palavra deve ser convertida para maiúscula.
- O programa imprime o resultado da formatação no console.
- Para formatar o texto, o programa utiliza o seguinte método:
```java
public static String firstCharToTitleCase(String string) {
  // <write your code here>
}
```

> Exercício 10 (Argumentos de comprimento variável): [exercicio_10](./exercicio_10)

#### Converter decimais e romanos
[[Topo]](#)<br />

- Ver homework: [HW - Methods](./04_arquivos/homework/HW%20-%20Methods.pdf)

Implemente um programa de console que atenda aos seguintes requisitos:
- O programa inicia e pede ao usuário que selecione uma das seguintes opções:
  - Para converter de decimal para número romano, o usuário deve inserir "D2R".
  - Para converter de número romano para decimal, o usuário deve inserir "R2D".
- No caso em que o usuário insira texto aleatório, o programa pedirá ao usuário novamente que insira "D2R" ou "R2D".
- Se o usuário inserir "R2D", o programa pedirá ao usuário que insira um número romano.
  - Se o número romano inserido não for válido, o programa pedirá ao usuário que insira o número romano novamente.
  - Se o número romano for válido, o programa o converterá para decimal e o imprimirá no console.
- Se o usuário inserir "D2R", o programa pedirá ao usuário que insira um número inteiro.
  - Se o número inteiro inserido for negativo, maior que 100 ou igual a zero, o programa pedirá ao usuário que insira o número inteiro novamente.
  - Se o número inteiro inserido for válido, o programa o converterá para número romano e o imprimirá no console.

O programa funciona corretamente com números no intervalo de 1 a 100, inclusive, e o mesmo intervalo para números romanos.

Não é permitido usar uma abordagem "brute force" com uma declaração switch que mapeie todos os números romanos para inteiros. Tente criar um algoritmo. Para entender o algoritmo, você pode usar esta página da Wikipedia: https://en.wikipedia.org/wiki/Roman_numerals.

Você deve implementar os seguintes métodos:


```java
public static String decimal2Roman(int number) {
  // <write your code here>
}

public static int roman2Decimal(String romanNumber) {
  // <write your code here>
}

public static boolean isRomanNumberValid(String romanNumber) {
  // <write your code here>
}

public static boolean isDecimalNumberValid(int decimalNumber) {
  // <write your code here>
}
```

> Exercício 11 (Argumentos de comprimento variável): [exercicio_11](./exercicio_11)
