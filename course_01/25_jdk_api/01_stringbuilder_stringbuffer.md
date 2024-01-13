# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## 25.1. StringBuilder e StringBuffer
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [01_arquivos](./01_arquivos/)
- Projetos
  - [Projeto 1](./01_arquivos/proj_01/) [(iniciado em)](#o-que-é-stringbuilder)
- Conteúdo
 - [O que é StringBuilder](#o-que-é-stringbuilder)
 - [O que é StringBuffer](#o-que-é-stringbuffer)
 - [StringBuilder vs StringBuffer](#stringbuilder-vs-stringbuffer)
 - [A interface CharSequence](#a-interface-charsequence)

### O que é StringBuilder
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./01_arquivos/proj_01/)

`StringBuilder` é uma classe em Java que fornece uma maneira eficiente de construir sequências de caracteres mutáveis. Essa classe é uma alternativa ao `StringBuffer` e é mais rápida porque não é sincronizada. Em outras palavras, `StringBuilder` é mais apropriado para uso em ambientes onde a sincronização não é necessária, como em operações de string de um único thread.

Aqui estão alguns exemplos de como usar `StringBuilder` em Java 8:

#### Criação e adição de Texto

```java
StringBuilder sb = new StringBuilder();
sb.append("Hello");
sb.append(" ");
sb.append("World");

String result = sb.toString(); // Converte o StringBuilder para String
System.out.println(result); // Saída: Hello World
```

#### Inserção de texto em uma posição específica

```java
StringBuilder sb = new StringBuilder("Hello World");
sb.insert(6, "Java "); // Insere "Java " na posição 6

String result = sb.toString();
System.out.println(result); // Saída: Hello Java World
```

#### Substituição de parte do texto

```java
StringBuilder sb = new StringBuilder("Hello Planet");
sb.replace(6, 12, "World"); // Substitui "Planet" por "World"

String result = sb.toString();
System.out.println(result); // Saída: Hello World
```

#### Remoção de parte do texto

```java
StringBuilder sb = new StringBuilder("Hello Java World");
sb.delete(5, 10); // Remove o texto do índice 5 ao 9

String result = sb.toString();
System.out.println(result); // Saída: Hello World
```

#### Invertendo o conteúdo

```java
StringBuilder sb = new StringBuilder("Hello");
sb.reverse(); // Inverte a sequência de caracteres

String result = sb.toString();
System.out.println(result); // Saída: olleH
```

Esses exemplos demonstram as operações básicas que você pode realizar com `StringBuilder`. A principal vantagem do uso do `StringBuilder` é a melhoria no desempenho, especialmente em situações onde há necessidade de fazer muitas modificações em strings, como em loops ou em processamento de texto pesado. Isso se deve ao fato de que, ao contrário de objetos `String`, que são imutáveis, `StringBuilder` permite modificar a mesma instância sem criar novos objetos a cada operação, reduzindo assim a sobrecarga de memória e processamento.

### O que é StringBuffer
[[Topo]](#)<br />

`StringBuffer` é uma classe em Java utilizada para criar sequências de caracteres que podem ser modificadas. Assim como o `StringBuilder`, o `StringBuffer` permite criar uma string mutável, mas com uma diferença fundamental: o `StringBuffer` é sincronizado, o que significa que é thread-safe. Isso o torna uma escolha adequada em ambientes multi-threaded, onde múltiplas threads podem modificar a mesma instância de `StringBuffer` simultaneamente sem causar problemas de concorrência.

Aqui estão alguns exemplos do uso de `StringBuffer` em Java 8:

#### Criação e adição de texto

```java
StringBuffer sb = new StringBuffer();
sb.append("Hello");
sb.append(" ");
sb.append("World");

String result = sb.toString(); // Converte o StringBuffer para String
System.out.println(result); // Saída: Hello World
```

#### Inserção de texto em uma posição específica

```java
StringBuffer sb = new StringBuffer("Hello World");
sb.insert(6, "Java "); // Insere "Java " na posição 6

String result = sb.toString();
System.out.println(result); // Saída: Hello Java World
```

#### Substituição de parte do texto

```java
StringBuffer sb = new StringBuffer("Hello Planet");
sb.replace(6, 12, "World"); // Substitui "Planet" por "World"

String result = sb.toString();
System.out.println(result); // Saída: Hello World
```

#### Remoção de parte do texto

```java
StringBuffer sb = new StringBuffer("Hello Java World");
sb.delete(5, 10); // Remove o texto do índice 5 ao 9

String result = sb.toString();
System.out.println(result); // Saída: Hello World
```

#### Invertendo o conteúdo

```java
StringBuffer sb = new StringBuffer("Hello");
sb.reverse(); // Inverte a sequência de caracteres

String result = sb.toString();
System.out.println(result); // Saída: olleH
```

Esses exemplos demonstram as operações básicas que você pode realizar com `StringBuffer`. Embora `StringBuffer` seja semelhante ao `StringBuilder` em funcionalidade, ele é ligeiramente mais lento devido à sua natureza sincronizada. Portanto, a escolha entre `StringBuffer` e `StringBuilder` geralmente se baseia em considerações de segurança de thread.

### StringBuilder vs StringBuffer
[[Topo]](#)<br />

Em Java, tanto `StringBuilder` quanto `StringBuffer` são usados para criar strings mutáveis, mas existem diferenças significativas entre eles, principalmente relacionadas à sincronização e performance. Aqui estão as principais diferenças:

#### Sincronização

- **`StringBuffer`**: É sincronizado. Isso significa que é thread-safe. Se múltiplas threads acessam um `StringBuffer` simultaneamente, elas o fazem de forma segura sem correr o risco de inconsistências de dados. Porém, essa sincronização tem um custo de performance.
- **`StringBuilder`**: Não é sincronizado. Portanto, não é thread-safe. Isso significa que se múltiplas threads acessarem e modificarem o mesmo `StringBuilder`, poderão ocorrer problemas de inconsistência de dados. No entanto, como não há sobrecarga de sincronização, o `StringBuilder` é mais rápido.

#### Performance

- **`StringBuffer`**: Devido à sua natureza sincronizada, é menos eficiente em termos de performance quando comparado ao `StringBuilder`. A sincronização implica em uma sobrecarga adicional, que pode afetar o desempenho em cenários onde a alta performance é crítica.
- **`StringBuilder`**: Mais eficiente em termos de performance devido à ausência de sincronização. É a escolha preferida quando a manipulação da string está confinada a um único thread.

#### Uso recomendado

- **`StringBuffer`**: Recomendado para uso em ambientes multi-thread onde a manipulação de string pode ser realizada por várias threads simultaneamente.
- **`StringBuilder`**: Ideal para uso em ambientes de thread único ou em situações onde a segurança de thread não é uma preocupação.

#### API e funcionalidades

- Ambas as classes têm APIs e funcionalidades muito similares. Métodos como `append()`, `insert()`, `delete()`, `reverse()`, entre outros, estão disponíveis em ambas as classes.

#### Conclusão

- Escolha `StringBuilder` quando precisar de velocidade e estiver trabalhando em um ambiente de thread único.
- Escolha `StringBuffer` quando a segurança em ambientes multi-thread for uma prioridade.

Ambas as classes fazem parte do pacote `java.lang` e são usadas para manipular strings de forma mais eficiente do que concatenando strings imutáveis com o operador `+`.

### A interface CharSequence
[[Topo]](#)<br />

Em Java, a interface `CharSequence` representa uma sequência de caracteres. É uma interface abstrata que fornece uma visão de leitura de uma sequência de caracteres e é implementada por várias classes, incluindo `String`, `StringBuilder`, `StringBuffer`, e `CharBuffer`. Sendo uma parte fundamental do pacote `java.lang`, `CharSequence` permite que métodos aceitem qualquer tipo de sequência de caracteres, tornando-os mais flexíveis e reutilizáveis.

Aqui estão alguns dos principais métodos definidos pela interface `CharSequence`:

- **`charAt(int index)`**: Retorna o caractere na posição especificada.
- **`length()`**: Retorna o número de caracteres na sequência.
- **`subSequence(int start, int end)`**: Retorna uma nova sequência de caracteres que é uma subsequência da sequência atual, começando no índice especificado `start` e terminando no índice `end - 1`.
- **`toString()`**: Retorna uma string contendo os caracteres da sequência.

#### Exemplos de uso da interface CharSequence

Vamos ver exemplos de como a interface `CharSequence` pode ser usada com diferentes classes que a implementam:

##### Exemplo com String

```java
CharSequence charSeqString = "Hello World";
char ch1 = charSeqString.charAt(0); // H
int len = charSeqString.length(); // 11
CharSequence subSeq = charSeqString.subSequence(0, 5); // "Hello"
System.out.println(subSeq.toString()); // Hello
```

##### Exemplo com StringBuilder

```java
CharSequence charSeqBuilder = new StringBuilder("Hello");
charSeqBuilder = ((StringBuilder) charSeqBuilder).append(" World");
System.out.println(charSeqBuilder); // Hello World
```

##### Exemplo com StringBuffer

```java
CharSequence charSeqBuffer = new StringBuffer("Hello");
((StringBuffer) charSeqBuffer).reverse();
System.out.println(charSeqBuffer); // olleH
```

#### Por que Usar CharSequence?

- **Flexibilidade**: Ao usar `CharSequence` como o tipo de parâmetro de um método, você pode aceitar qualquer implementação de `CharSequence`, tornando seu código mais flexível.
- **Reutilização de código**: Isso permite que você escreva métodos que podem trabalhar com qualquer tipo de sequência de caracteres, sem se comprometer com uma implementação específica como `String`, `StringBuilder` ou `StringBuffer`.
- **Compatibilidade com APIs**: Muitas APIs em Java usam `CharSequence` para permitir uma maior flexibilidade no manuseio de texto.

Em resumo, `CharSequence` é uma interface útil para lidar com sequências de caracteres de maneira genérica, permitindo que as classes que a implementam sejam utilizadas de maneira intercambiável em diferentes contextos.
