# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Argumentos de comprimento variável
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [04_arquivos](./04_arquivos/)
- Homework
  - [Arquivo: HW - Methods](./04_arquivos/homework/HW%20-%20Methods.pdf)
  - [Homework: Maior inteiro em array](#homework-maior-inteiro-em-array)
  - [Homework: Retângulo no console](#homework-retângulo-no-console)
  - [Homework: Contar palavras](#homework-contar-palavras)
  - [Homework: Filtrar palavras](#homework-filtrar-palavras)
  - [Homework: Girar matriz](#homework-girar-matriz)
  - [Homework: Arrays dinâmicos](#homework-arrays-dinâmicos)
  - [Homework: Maior divisor comum](#homework-maior-divisor-comum)
  - [Homework: Soma de dígitos](#homework-soma-de-dígitos)
  - [Homework: Formatar e-mails](#homework-formatar-e-mails)
  - [Homework: Formatar títulos](#homework-formatar-títulos)
  - [Homework: Converter decimais e romanos](#homework-converter-decimais-e-romanos)
- Projetos
  - [Projeto 1](./04_arquivos/proj_01/) [(iniciado em)](#varargs)
- Exercícios
  - [Exercício 1](./04_arquivos/exercicio_01) ([enunciado](#homework-maior-inteiro-em-array))
  - [Exercício 2](./04_arquivos/exercicio_02) ([enunciado](#homework-retângulo-no-console))
  - [Exercício 3](./04_arquivos/exercicio_03) ([enunciado](#homework-contar-palavras))
  - [Exercício 4](./04_arquivos/exercicio_04) ([enunciado](#homework-filtrar-palavras))
  - [Exercício 5](./04_arquivos/exercicio_05) ([enunciado](#homework-girar-matriz))
  - [Exercício 6](./04_arquivos/exercicio_06) ([enunciado](#homework-arrays-dinâmicos))
  - [Exercício 7](./04_arquivos/exercicio_07) ([enunciado](#homework-maior-divisor-comum))
  - [Exercício 8](./04_arquivos/exercicio_08) ([enunciado](#homework-soma-de-dígitos))
  - [Exercício 9](./04_arquivos/exercicio_09) ([enunciado](#homework-formatar-e-mails))
  - [Exercício 10](./04_arquivos/exercicio_10) ([enunciado](#homework-formatar-títulos))
  - [Exercício 11](./04_arquivos/exercicio_11) ([enunciado](#homework-converter-decimais-e-romanos))
- Conteúdo
  - [Varargs](#varargs)

### Varargs
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./04_arquivos/proj_01/)

Em Java, você pode criar métodos que aceitam um número variável de argumentos usando o recurso de "Argumentos de Comprimento Variável", ou Varargs.

Isso permite que você chame um método com um número arbitrário de argumentos do mesmo tipo.

Os argumentos de comprimento variável são representados como um array no interior do método.

```java
public class ExemploArgumentosVariaveis {
  public static void main(String[] args) {
    imprimirNomes("Alice", "Bob", "Carol");
    imprimirNomes("David", "Eva");
  }

  public static void imprimirNomes(String... nomes) {
    System.out.print("Nomes: ");
    for (String nome : nomes) {
      System.out.print(nome + " ");
    }
    System.out.println();
  }
}
```

Neste exemplo, a função imprimirNomes aceita um número variável de argumentos do tipo String.

Você pode chamar essa função com qualquer número de argumentos de string, separados por vírgulas.

A função itera sobre os argumentos e os imprime na saída.

Aqui estão algumas chamadas possíveis para o método imprimirNomes:

```java
imprimirNomes("Alice", "Bob", "Carol");
// Saída: Nomes: Alice Bob Carol

imprimirNomes("David", "Eva");
// Saída: Nomes: David Eva

imprimirNomes(); // Você também pode chamar o método sem argumentos
// Saída: Nomes:
```

Observe que os argumentos de comprimento variável devem ser o último parâmetro na lista de parâmetros de um método, e você pode ter apenas um único parâmetro de comprimento variável em um método.

Além disso, o parâmetro de comprimento variável é tratado como um array dentro do método, permitindo que você acesse os valores individualmente.

### Homework: Maior inteiro em array
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

> Exercício 1 (Argumentos de comprimento variável): [04_arquivos/exercicio_01](./04_arquivos/exercicio_01)

### Homework: Retângulo no console
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

> Exercício 2 (Argumentos de comprimento variável): [04_arquivos/exercicio_02](./04_arquivos/exercicio_02)

### Homework: Contar palavras
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

> Exercício 3 (Argumentos de comprimento variável): [04_arquivos/exercicio_03](./04_arquivos/exercicio_03)

### Homework: Filtrar palavras
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

> Exercício 4 (Argumentos de comprimento variável): [04_arquivos/exercicio_04](./04_arquivos/exercicio_04)

### Homework: Girar matriz
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

> Exercício 5 (Argumentos de comprimento variável): [04_arquivos/exercicio_05](./04_arquivos/exercicio_05)

### Homework: Arrays dinâmicos
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

> Exercício 6 (Argumentos de comprimento variável): [04_arquivos/exercicio_06](./04_arquivos/exercicio_06)

### Homework: Maior divisor comum
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

> Exercício 7 (Argumentos de comprimento variável): [04_arquivos/exercicio_07](./04_arquivos/exercicio_07)

### Homework: Soma de dígitos
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

> Exercício 8 (Argumentos de comprimento variável): [04_arquivos/exercicio_08](./04_arquivos/exercicio_08)

### Homework: Formatar e-mails
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

> Exercício 9 (Argumentos de comprimento variável): [04_arquivos/exercicio_09](./04_arquivos/exercicio_09)

### Homework: Formatar títulos
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

> Exercício 10 (Argumentos de comprimento variável): [04_arquivos/exercicio_10](./04_arquivos/exercicio_10)

### Homework: Converter decimais e romanos
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

> Exercício 11 (Argumentos de comprimento variável): [04_arquivos/exercicio_11](./04_arquivos/exercicio_11)
