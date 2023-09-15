# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Tipo de expressão
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [04_arquivos](./04_arquivos/)
- Projetos
  - [Projeto 1](./01_arquivos/proj_01/) [(iniciado em)](#tipos-de-dados-de-expressões)
- Conteúdo
  - [Expression e statement](#expression-e-statement)
  - [Coerção (implicit casting)](#coerção-implicit-casting)
  - [Promoção (Widening)](#promoção-widening)
  - [Tipos de dados de expressões](#tipos-de-dados-de-expressões)

### Expression e statement
[[Topo]](#)<br />

*Expression* e *statement* são dois conceitos fundamentais em programação que descrevem ações e construções em um programa. Aqui está a diferença entre eles:

- **Expression (Expressão)**
  - Uma expressão é uma combinação de valores, operadores e chamadas de função que, quando avaliada, produz um valor.
  - Ela geralmente retorna um resultado ou um valor calculado.
  - Exemplos de expressões incluem: `5 + 3`, `x * y`, `Math.sqrt(16)`, e `a == b`.
- **Statement (Instrução)**:
  - Uma instrução é uma unidade independente de código que realiza uma ação.
  - Ela não retorna um valor por si só, mas pode modificar o estado do programa, como atribuir um valor a uma variável, controlar o fluxo de execução com estruturas condicionais (if, else, switch) ou laços (for, while, do-while), ou chamar funções/métodos.
  - Exemplos de declarações incluem: `int x = 5;`, `if (a > b) { /* faça algo */ }`, `for (int i = 0; i < 10; i++) { /* faça algo */ }`, e `return resultado;`.

Resumindo, a principal diferença é que uma expressão avalia e retorna um valor, enquanto uma instrução executa uma ação no programa e não retorna um valor por si só. Em muitas linguagens de programação, as expressões podem ser incorporadas em instruções, mas nem todas as instruções são expressões. A compreensão dessa diferença é fundamental para escrever código eficaz e compreensível.

### Coerção (implicit casting)
[[Topo]](#)<br />

A coerção envolve a conversão automática de um tipo de dado em outro tipo de dado quando necessário para que uma operação ou expressão seja válida.

Essa conversão pode ser entre tipos de dados diferentes, mas geralmente envolve tipos de dados relacionados, como inteiros e ponto flutuante.

A coerção geralmente é usada para tornar as operações compatíveis, mas pode resultar em perda de precisão ou informação, especialmente quando tipos de dados de alta precisão são convertidos em tipos de dados de menor precisão.

Um exemplo comum de coerção é quando você soma um inteiro com um número de ponto flutuante. O inteiro é convertido automaticamente em um número de ponto flutuante antes da operação.

A coerção é uma conversão automática de tipo que ocorre para tornar as operações válidas.

Ela é usada para garantir que as operações sejam realizadas corretamente.

### Promoção (Widening)
[[Topo]](#)<br />

A promoção é uma forma específica de coerção que envolve a conversão automática de um tipo de dado em outro tipo de dado maior ou mais preciso.

Ela ocorre quando você realiza uma operação em que os operandos têm tipos de dados de menor precisão, e o compilador faz a conversão automaticamente para um tipo de dado de maior precisão.

A promoção é usada para evitar a perda de informações, pois os tipos de dados de destino têm uma capacidade maior de representação.

Um exemplo típico de promoção ocorre quando você realiza operações com números inteiros e números de ponto flutuante. Os inteiros são promovidos automaticamente para números de ponto flutuante antes das operações para evitar a perda de precisão.

A promoção é um tipo específico de coerção que envolve a conversão de tipos de dados de menor precisão em tipos de dados de maior precisão para evitar a perda de informações.

Ela é usada para garantir que as operações sejam realizadas corretamente.

### Tipos de dados de expressões
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./04_arquivos/proj_01/)

Os tipos de dados de expressões se refere ao tipo de dado que uma expressão produz quando é avaliada. Em outras palavras, é o tipo de dado do valor resultante de uma expressão. O tipo de uma expressão é importante porque determina como o resultado pode ser usado e como as operações subsequentes podem ser realizadas com esse resultado.

Os tipos de dados têm regras de coerção e promoção que determinam o tipo resultante de uma expressão, dependendo dos tipos dos operandos envolvidos.

Será listado as combinações possíveis com os tipos int, byte, short, long, float, double, char e String, incluindo as regras de coerção e promoção:

- **int**
  - Combinações diretas com coerção: int + byte, int + short, int + int, int + char.
  - Promoção para long: int + long.
  - Promoção para float: int + float.
  - Promoção para double: int + double.
  - Não é possível fazer concatenação com String.
- **byte**
  - Combinações diretas com coerção: byte + byte.
  - Promoção para int: byte + short, byte + int, byte + char.
  - Promoção para long: byte + long.
  - Promoção para float: byte + float.
  - Promoção para double: byte + double.
  - Não é possível fazer concatenação com String.
- **short**
  - Combinações diretas com coerção: short + short.
  - Promoção para int: short + int, short + char.
  - Promoção para long: short + long.
  - Promoção para float: short + float.
  - Promoção para double: short + double.
  - Não é possível fazer concatenação com String.
- **long**
  - Combinações diretas com coerção: long + byte, long + short, long + int, long + char.
  - Promoção para float: long + float.
  - Promoção para double: long + double.
  - Não é possível fazer concatenação com String.
- **float**
  - Combinações diretas com coerção: float + byte, float + short, float + int, float + char, float + long, float + float.
  - Promoção para double: float + double.
  - Não é possível fazer concatenação com String.
- **double**
  - Combinações diretas com coerção: double + byte, double + short, double + int, double + char, double + long, double + float, double + double.
  - Não é possível fazer concatenação com String.
**char**
  - Combinações diretas com coerção: char + byte, char + short, char + int, char + char.
  - Promoção para int: char + long.
  - Promoção para float: char + float.
  - Promoção para double: char + double.
  - Não é possível fazer concatenação com String.
**String**
  - Concatenação de String com qualquer tipo: "Hello " + 5, "Value: " + 3.14, "Char: " + 'A'.
  - O resultado sempre será uma nova String.

Observe que as regras de coerção e promoção são aplicadas automaticamente pelo Java para garantir que as operações sejam compatíveis.

A concatenação de String é uma operação especial em Java, onde outros tipos são convertidos implicitamente para String e a concatenação resulta em uma nova String.
