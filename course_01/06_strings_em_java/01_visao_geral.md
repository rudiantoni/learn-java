# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Visão geral
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [01_arquivos](./01_arquivos/)
- Projetos
  - [Projeto 1](./01_arquivos/proj_01/) [(iniciado em)](#declaração-e-inicialização-de-strings)
- Conteúdo
  - [Visão geral de Strings](#visão-geral-de-strings)
  - [Declaração e inicialização de Strings](#declaração-e-inicialização-de-strings)
  - [Imutabilidade](#imutabilidade)
  - [Concatenação de Strings](#concatenação-de-strings)
  - [Métodos](#métodos)

### Visão geral de Strings
[[Topo]](#)<br />

As strings são objetos que representam sequências de caracteres. Elas são usadas para armazenar e manipular texto, sendo uma das estruturas de dados mais comuns e fundamentais em programação. As strings em Java são imutáveis, o que significa que, uma vez criadas, não podem ser alteradas. Qualquer operação em uma string que parece modificá-la na verdade cria uma nova string.

### Declaração e inicialização de Strings
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./01_arquivos/)


Você pode criar uma string de várias maneiras em Java:

```java
String s1 = "Olá, mundo!"; // Usando literais de string
String s2 = new String("Java 8"); // Usando o construtor
```

### Imutabilidade
[[Topo]](#)<br />

Strings em Java são imutáveis, o que significa que não podem ser alteradas após a criação. Toda operação que parece modificar uma string na verdade cria uma nova string.

```java
String original = "Hello";
String modified = original.concat(", World!"); // Cria uma nova string
System.out.println(original); // Imprime "Hello"
System.out.println(modified); // Imprime "Hello, World!"
```

### Concatenação de Strings
[[Topo]](#)<br />

Você pode concatenar strings usando o operador + ou o método concat():

```java
String str1 = "Hello";
String str2 = "World";
String result = str1 + " " + str2; // Usando o operador +
String result2 = str1.concat(" ").concat(str2); // Usando o método concat()
```

### Métodos
[[Topo]](#)<br />

- **length()**: Retorna o número de caracteres na string.
- **charAt(int index)**: Retorna o caractere na posição especificada.
- **substring(int beginIndex)**: Retorna uma nova string que é uma subcadeia da string original a partir do índice especificado até o final da string.
- **substring(int beginIndex, int endIndex)**: Retorna uma nova string que é uma subcadeia da string original do índice beginIndex até endIndex - 1.
- **concat(String str)**: Concatena a string especificada com a string atual e retorna uma nova string.
- **equals(Object anObject)**: Compara duas strings quanto ao conteúdo. Retorna true se as strings tiverem o mesmo conteúdo, false caso contrário.
- **equalsIgnoreCase(String anotherString)**: Compara duas strings quanto ao conteúdo, ignorando maiúsculas e minúsculas.
- **compareTo(String anotherString)**: Compara duas strings lexicograficamente (em ordem alfabética) e retorna um valor negativo se a string atual for menor, um valor positivo se for maior ou zero se forem iguais.
- **compareToIgnoreCase(String str)**: Compara duas strings lexicograficamente, ignorando maiúsculas e minúsculas.
- **startsWith(String prefix)**: Verifica se a string começa com o prefixo especificado e retorna um valor booleano.
- **endsWith(String suffix)**: Verifica se a string termina com o sufixo especificado e retorna um valor booleano.
- **isEmpty()**: Verifica se a string está vazia (não contém caracteres) e retorna um valor booleano.
- **contains(CharSequence sequence)**: Verifica se a string contém a sequência especificada e retorna um valor booleano.
- **replace(char oldChar, char newChar)**: Substitui todas as ocorrências do caractere oldChar pelo caractere newChar na string e retorna uma nova string.
- **replace(CharSequence target, CharSequence replacement)**: Substitui todas as ocorrências da sequência target pela sequência replacement na string e retorna uma nova string.
- **toLowerCase()**: Converte todos os caracteres da string para minúsculas e retorna uma nova string.
- **toUpperCase()**: Converte todos os caracteres da string para maiúsculas e retorna uma nova string.
- **trim()**: Remove espaços em branco no início e no final da string e retorna uma nova string.
- **split(String regex) (Java 11+)**: Divide a string em um array de substrings com base no delimitador especificado pela expressão regular.
- **join(CharSequence delimiter, CharSequence... elements)**: Une os elementos fornecidos em uma única string, separando-os com o delimitador especificado.
