# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## 6.3. Sequências de escape em Java
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [03_arquivos](./03_arquivos/)
- Projetos
  - [Projeto 1](./03_arquivos/proj_01/) [(iniciado em)](#escapando-strings)
- Conteúdo
  - [Escapando strings](#escapando-strings)
  - [Caracteres obrigatórios](#caracteres-obrigatórios)
  - [Outras sequencias de escape](#outras-sequencias-de-escape)
  - [Escapando caracteres unicode](#escapando-caracteres-unicode)

### Escapando strings
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./03_arquivos/proj_01/)

Escapar caracteres em strings é uma técnica fundamental em programação que permite incluir caracteres especiais ou representações especiais dentro de uma string. Isso é necessário porque, em muitas linguagens de programação, certos caracteres têm significados especiais ou são usados para formatação, então eles precisam ser tratados de maneira especial quando incluídos em strings.

Escapar caracteres em strings significa preceder um caractere especial com uma barra invertida \ para indicar que ele não deve ser tratado como seu valor literal, mas sim como um caractere especial com algum significado específico. Isso é necessário para que você possa incluir caracteres especiais, como aspas duplas ("), barra invertida (\\), aspas simples ('), entre outros, em suas strings sem confundir o compilador ou a linguagem.

A principal finalidade de escapar caracteres em strings é permitir que você inclua caracteres especiais ou representações especiais em suas strings sem que eles sejam interpretados de maneira errada pela linguagem. Isso é especialmente importante quando você precisa incluir as próprias aspas dentro de uma string delimitada por aspas, como em uma declaração de string.

A barra invertida \ é usada como caractere de escape. Quando você coloca uma barra invertida antes de um caractere especial em uma string, isso informa ao compilador que o caractere seguinte deve ser tratado como um caractere especial e não como seu valor literal.

Aspas Duplas (") em uma String Delimitada por Aspas Duplas:

```java
String exemplo = "Esta é uma string com aspas duplas: \"texto entre aspas\".";
```

### Caracteres obrigatórios
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./03_arquivos/proj_01/)

A necessidade de escapar caracteres em strings depende do contexto em que essas strings são usadas. Existem alguns caracteres que precisam ser escapados obrigatoriamente em determinados contextos para evitar erros de sintaxe ou problemas de interpretação. A seguir, estão alguns dos caracteres que geralmente precisam ser escapados em Java e os contextos em que isso é necessário:

**Aspas duplas (") em strings delimitadas por aspas duplas**

Quando você deseja incluir aspas duplas dentro de uma string delimitada por aspas duplas, é necessário escapá-las. Isso evita que a linguagem interprete as aspas internas como o término da string.

```java
String texto = "Isso é uma \"string\" com aspas duplas.";
```

**Barra invertida (\\) em strings**

A barra invertida \ em si também precisa ser escapada para ser usada como um caractere literal dentro de uma string.

```java
String caminhoDoArquivo = "C:\\Diretorio\\Arquivo.txt";
```

**Aspas simples (') em strings delimitadas por aspas simples**

Se você estiver usando aspas simples para delimitar uma string e desejar incluir uma aspas simples dentro dela, é necessário escapá-la.

```java
String texto = "Isso é uma 'string' com aspas simples.";
```

**Barra invertida (\) em expressões regulares**

Em expressões regulares, a barra invertida é um caractere de escape e precisa ser escapada duas vezes (\\) para representar uma única barra invertida literal.

```java
String regex = "\\d+"; // Expressão regular para encontrar um ou mais dígitos
```

### Outras sequencias de escape
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./03_arquivos/proj_01/)

Existem várias sequências de escape que você pode usar para representar caracteres especiais ou controlar o formato de texto em strings. A seguir, estão algumas das sequências de escape mais comuns:

- **\n**: Nova linha (ou line feed), representa uma quebra de linha, movendo o cursor para a próxima linha.
- **\t**: Tabulação (ou tab), representa um caractere de tabulação horizontal, criando um espaço horizontal.
- **\b**: Retrocesso (ou backspace), representa um caractere de retrocesso, movendo o cursor uma posição para trás.
- **\r**: Retorno de carro (ou carriage return), representa um caractere de retorno de carro, movendo o cursor para o início da linha atual.
- **\\**: Barra invertida (ou backlash), representa uma barra invertida literal. É usado para escapar a própria barra invertida em strings.
- **\"**: Aspas duplas (ou double quotes), representa um caractere de aspas duplas. É usado para incluir aspas duplas dentro de strings delimitadas por aspas duplas.
- **\'**: Aspas simples (ou single quotes), representa um caractere de aspas simples. É usado para incluir aspas simples dentro de strings delimitadas por aspas simples.

### Escapando caracteres unicode
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./03_arquivos/proj_01/)

Você pode escapar caracteres Unicode usando a notação Unicode, que envolve um caractere Unicode entre \u seguido de quatro dígitos hexadecimais que representam o valor do ponto de código Unicode. Isso é útil quando você precisa incluir caracteres especiais de outros idiomas em suas strings. 

Aqui está como você pode escapar caracteres Unicode em Java:


```java
public class ExemploEscapeUnicode {
  public static void main(String[] args) {
    // Escape de um caractere Unicode para representar o símbolo do coração (❤)
    String coracao = "\u2764";

    // Escape de caracteres Unicode para representar "Olá" em chinês (你好)
    String olaEmChines = "\u4F60\u597D";

    System.out.println("Símbolo do coração: " + coracao);
    System.out.println("Olá em chinês: " + olaEmChines);
  }
}
```

Neste exemplo, usamos a notação \u seguida de quatro dígitos hexadecimais para escapar caracteres Unicode. O caractere Unicode ❤ (coração) é representado por "\u2764" e "你好" (Olá em chinês) é representado por "\u4F60\u597D". Quando você imprime essas strings, verá os caracteres Unicode apropriados.

Lembre-se de que a notação Unicode é uma maneira útil de incluir caracteres especiais de vários idiomas em suas strings Java. Certifique-se de conhecer o valor Unicode correto do caractere que deseja incluir e use a notação \u para representá-lo em suas strings.
