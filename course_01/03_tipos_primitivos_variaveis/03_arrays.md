# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

# Arrays
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [03_arquivos](./03_arquivos//)
- Homework
  - [Arquivo: HW - Arrays](./03_arquivos/homework/HW%20-%20Arrays.pdf)
  - [Homework: Informações adicionais sobre arrays](#homework-additional-information-about-arrays)
- Projetos
  - [Projeto 1](./03_arquivos/proj_01/) [(iniciado em)](#visão-geral)
- Conteúdo
  - [Visão geral](#visão-geral)
  - [Arrays Unidimensionais](#arrays-unidimensionais)
  - [Como Acessar Elementos em Arrays](#como-acessar-elementos-em-arrays)
  - [Valores Padrão para Elementos em Arrays](#valores-padrão-para-elementos-em-arrays)
  - [ArrayIndexOutOfBoundsException](#arrayindexoutofboundsexception)
  - [Array Literal](#array-literal)
  - [Arrays Multidimensionais](#arrays-multidimensionais)
2
### Visão geral
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./03_arquivos/proj_01/)

Um array em Java é uma estrutura de dados que permite armazenar um conjunto de elementos do mesmo tipo em uma única variável. Arrays são usados para armazenar e manipular dados de forma eficiente.

- Um array (vetor) é um objeto que contém elementos com tipos de dados similares e suportam acessá-los por um index.
- Os arrays no Java têm base 0, ou seja, o primeiro elemento corresponde ao index 0.
- Não permite dimensionamento dinâmico.
- Os arrays possuem um comprimento total (tamanho) por meio de um size ou length.

### Arrays Unidimensionais
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./03_arquivos/proj_01/)

Arrays unidimensionais são listas simples de elementos do mesmo tipo. Cada elemento é acessado por um índice que começa em 0 para o primeiro elemento e aumenta em 1 para cada elemento subsequente.

```java
int[] numeros = {1, 2, 3, 4, 5};
float[] precos = {10.5f, 20.0f, 15.75f};
boolean[] flags = {true, false, true};
char[] caracteres = {'a', 'b', 'c'};
```

### Como Acessar Elementos em Arrays
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./03_arquivos/proj_01/)

Para acessar elementos em um array, você utiliza o nome do array seguido de um índice entre colchetes. Os índices começam em 0 para o primeiro elemento.

Imagine um array de números inteiros onde cada elemento é separado por uma vírgula:
```text
[40, 55, 63, 17, 22]
 0 | 1 | 2 | 3 | 4    <- indexes
```
- O comprimento desse array é igual a quantidade total de itens nele, nesse caso, é 5.
- O primeiro index é 0, e o elemento nesse índice é o número 40.
- O último index é 4, e o elemento nesse índice é o número 22.

```java
int[] numeros = {1, 2, 3, 4, 5};
float[] precos = {10.5f, 20.0f, 15.75f};
boolean[] flags = {true, false, true};
char[] caracteres = {'a', 'b', 'c'};

int terceiroNumero = numeros[2]; // Obtém o valor 3
float primeiroPreco = precos[0]; // Obtém o valor 10.5
boolean segundaFlag = flags[1]; // Obtém o valor false
char ultimoCaractere = caracteres[2]; // Obtém o valor 'c'
```

### Valores Padrão para Elementos em Arrays
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./03_arquivos/proj_01/)

Quando você cria um array, os elementos são inicializados com valores padrão.
- Para tipos numéricos, o valor padrão é 0
- Para tipos booleanos, é false
- Para tipos de caracteres, é '\0'

```java
int[] valores = new int[3]; // Os valores são inicializados com 0
boolean[] flags = new boolean[2]; // As flags são inicializadas com false
char[] caracteres = new char[4]; // Os caracteres são inicializados com '\0'
```

### ArrayIndexOutOfBoundsException
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./03_arquivos/proj_01/)

Se você tentar acessar um índice fora dos limites do array, ocorrerá uma exceção *ArrayIndexOutOfBoundsException*. Certifique-se de acessar apenas índices válidos.

```java
int valor = numeros[10]; // Isso causará uma exceção ArrayIndexOutOfBoundsException
```

### Array Literal
[[Topo]](#)<br />

Você pode inicializar um array diretamente com valores usando um array literal.

- Ver projeto: [Projeto 1](./03_arquivos/proj_01/)

```java
int[] numeros = {1, 2, 3, 4, 5};
float[] precos = {10.5f, 20.0f, 15.75f};
boolean[] flags = {true, false, true};
char[] caracteres = {'a', 'b', 'c'};
```

### Arrays Multidimensionais
[[Topo]](#)<br />

Arrays multidimensionais são arrays que têm mais de uma dimensão. Em Java, você pode criar arrays bidimensionais, tridimensionais e assim por diante.

- Ver projeto: [Projeto 1](./03_arquivos/proj_01/)

```java
int[][] matriz = {{1, 2, 3}, {4, 5, 6}};
int valor = matriz[0][1]; // Obtém o valor 2
```

### Homework: Informações adicionais sobre arrays
[[Topo]](#)<br />

- Ver homework: [HW - Arrays](./03_arquivos/homework/HW%20-%20Arrays.pdf)
- Ver documentação na Oracle: https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html

Investigue o código-fonte da classe java.util.Arrays. Aprenda quais métodos ele possui e leia a documentação do java.

**asList(T... a)**: Converte um array (ou uma sequência de elementos) em uma lista do tipo List<T>.

**binarySearch(T[] a, T key)**: Realiza uma busca binária no array especificado para encontrar o elemento key e retorna o índice se encontrado; caso contrário, retorna um valor negativo.

**binarySearch(T[] a, int fromIndex, int toIndex, T key)**: Realiza uma busca binária em uma faixa específica do array.

**copyOf(T[] original, int newLength)**: Cria uma cópia do array original com um novo tamanho especificado.

**copyOfRange(T[] original, int from, int to)**: Cria uma cópia de uma parte específica do array original, delimitada pelos índices from (inclusive) e to (exclusive).

**equals(T[] a, T[] a2)**: Compara dois arrays para verificar se eles são iguais, ou seja, têm os mesmos elementos nas mesmas posições.

**fill(T[] a, T val)**: Preenche um array com o valor especificado.

**hashCode(T[] a)**: Retorna o código hash do array.

**toString(T[] a)**: Retorna uma representação em formato de string do array.

**sort(T[] a)**: Ordena os elementos de um array em ordem crescente usando uma implementação de classificação rápida.

**sort(T[] a, Comparator<? super T> c)**: Ordena os elementos de um array usando um comparador personalizado.

**parallelSort(T[] a)**: Realiza uma ordenação paralela dos elementos do array para melhorar o desempenho em máquinas multicore.

**parallelSort(T[] a, Comparator<? super T> c)**: Realiza uma ordenação paralela com um comparador personalizado.

**parallelPrefix(int[] array, IntBinaryOperator op)**: Calcula o prefixo paralelo de um array usando uma operação binária especificada.

**parallelPrefix(long[] array, LongBinaryOperator op)**: Calcula o prefixo paralelo de um array de longs usando uma operação binária especificada.

**parallelPrefix(double[] array, DoubleBinaryOperator op)**: Calcula o prefixo paralelo de um array de doubles usando uma operação binária especificada.

**stream(T[] array)**: Converte um array em um fluxo (Stream<T>) para facilitar a manipulação de elementos usando programação funcional.

**stream(T[] array, int startInclusive, int endExclusive)**: Cria um fluxo limitado a uma faixa específica do array.

**spliterator(T[] array)**: Retorna um Spliterator para o array especificado.

**spliterator(T[] array, int startInclusive, int endExclusive)**: Retorna um Spliterator limitado a uma faixa específica do array.

**setAll(T[] array, IntFunction<? extends T> generator)**: Preenche um array com valores gerados por uma função especificada.

**parallelSetAll(T[] array, IntFunction<? extends T> generator)**: Preenche um array com valores gerados em paralelo por uma função especificada.

**parallelPrefix(T[] array, BinaryOperator<T> op)**: Calcula o prefixo paralelo de um array usando uma operação binária especificada.

Lembrando que esses métodos estão disponíveis na classe java.util.Arrays e são amplamente utilizados para manipulação de arrays e coleções.
