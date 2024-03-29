# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## 6.5. Expressões regulares em Java
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [05_arquivos](./05_arquivos/)
- Projetos
  - [Projeto 1](./05_arquivos/proj_01/) [(iniciado em)](#expressões-regulares)
- Conteúdo
  - [Expressões regulares](#expressões-regulares)
  - [Uso de Pattern e Matcher](#uso-de-pattern-e-matcher)
  - [Métodos que usam regex](#métodos-que-usam-regex)
  - [Sequencias de escape](#sequencias-de-escape)

### Expressões regulares
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./05_arquivos/proj_01/)

Você pode usar expressões regulares (regex) para realizar operações de pesquisa, validação e manipulação de texto de maneira flexível e poderosa. As expressões regulares permitem definir padrões de texto que você deseja encontrar ou extrair de uma string.

**Sintaxe básica das expressões regulares**
- **.**: O ponto representa qualquer caractere, exceto quebras de linha.
- **\***: O asterisco representa zero ou mais ocorrências do caractere ou padrão anterior.
- **+**: O símbolo de adição representa uma ou mais ocorrências do caractere ou padrão anterior.
- **?**: O símbolo de interrogação representa zero ou uma ocorrência do caractere ou padrão anterior.
- **[]**: Os colchetes definem um conjunto de caracteres possíveis.
- **[^]**: Os colchetes com acento circunflexo definem um conjunto de caracteres excluídos.
- **|**: O pipe representa uma alternância entre padrões.
- **()**: O parênteses: Agrupa padrões para aplicar operadores a eles.

### Uso de Pattern e Matcher
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./05_arquivos/proj_01/)

O uso de Pattern e Matcher é fundamental quando se trabalha com expressões regulares (regex). Essas classes permitem que você compile padrões regex e encontre correspondências em strings.

**Compilando um padrão regex com pattern**

Para usar uma expressão regular em Java, primeiro você precisa compilar o padrão usando a classe Pattern. O método compile() da classe Pattern recebe a expressão regular como uma string.

```java
import java.util.regex.Pattern;

public class ExemploPatternMatcher {
  public static void main(String[] args) {
    String regex = "\\d+"; // Expressão regular para encontrar um ou mais dígitos
    Pattern pattern = Pattern.compile(regex);
  }
}
```

**Usando matcher para encontrar correspondências**

Após compilar o padrão, você pode criar um objeto Matcher usando o método matcher() da classe Pattern. Em seguida, use o método find() para encontrar correspondências na string.

```java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExemploPatternMatcher {
  public static void main(String[] args) {
    String texto = "12345 Java 6789 é uma linguagem de programação.";

    String regex = "\\d+"; // Expressão regular para encontrar um ou mais dígitos
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(texto);

    while (matcher.find()) {
      System.out.println("Encontrado: " + matcher.group());
    }
  }
}
```

Neste exemplo, a expressão regular "\d+" é usada para encontrar sequências de um ou mais dígitos na string texto. O método find() do Matcher encontra e imprime todas as correspondências.

**Outros métodos úteis do matcher**
- group(): Retorna a subsequência da string que correspondeu ao padrão mais recentemente encontrado.
- start(): Retorna a posição de início da correspondência mais recente.
- end(): Retorna a posição de fim da correspondência mais recente.

**Correspondência de grupos**

Você também pode usar grupos de captura em expressões regulares e acessá-los usando o método group() do Matcher. Grupos de captura permitem extrair partes específicas de uma correspondência.

```java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExemploPatternMatcher {
  public static void main(String[] args) {
    String texto = "João tem 30 anos e Maria tem 25 anos.";

    String regex = "(\\w+) tem (\\d+) anos"; // Usando grupos de captura
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(texto);

  while (matcher.find()) {
      String nome = matcher.group(1); // Grupo 1: Captura o nome
      String idade = matcher.group(2); // Grupo 2: Captura a idade
      System.out.println(nome + " tem " + idade + " anos.");
    }
  }
}
```

Neste exemplo, a expressão regular captura nomes e idades usando grupos de captura e imprime os resultados.

O uso de Pattern e Matcher é essencial quando se trabalha com expressões regulares em Java. Eles fornecem flexibilidade e controle sobre a correspondência de padrões em strings, permitindo que você realize tarefas complexas de pesquisa e extração de dados.

### Métodos que usam regex
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./05_arquivos/proj_01/)

Você pode usar expressões regulares (regex) em diversos métodos e classes para realizar operações de pesquisa e manipulação de texto.

- **String.matches(String regex)**: Esse método verifica se a string corresponde à expressão regular fornecida como argumento. Retorna true se houver uma correspondência completa, caso contrário, retorna false.
- **String.replaceAll(String regex, String replacement)**: Substitui todas as ocorrências da expressão regular na string original pelo texto especificado no argumento replacement.
- **String.replaceFirst(String regex, String replacement)**: Substitui a primeira ocorrência da expressão regular na string original pelo texto especificado no argumento replacement.
- **String.split(String regex)**: Divide a string em um array de substrings usando a expressão regular fornecida como separador.
- **Pattern.compile(String regex)**: Este método da classe Pattern compila a expressão regular em um padrão que pode ser usado para criar objetos Matcher.
- **Pattern.matcher(CharSequence input)**: O método matcher() da classe Pattern cria um objeto Matcher que pode ser usado para realizar operações de correspondência com base na expressão regular.
- **Matcher.find()**: Este método da classe Matcher verifica se a expressão regular corresponde a qualquer parte da sequência de caracteres de entrada e retorna true se encontrar uma correspondência.
- **Matcher.group()**: O método group() da classe Matcher retorna a subsequência da string que correspondeu ao padrão mais recentemente encontrado.
- **Matcher.start() e Matcher.end()**: Esses métodos da classe Matcher retornam as posições de início e fim da correspondência mais recente, respectivamente.
- **Matcher.replaceAll(String replacement)**: Substitui todas as ocorrências da expressão regular correspondente na sequência de entrada pelo texto especificado no argumento replacement.
- **Matcher.replaceFirst(String replacement)**: Substitui a primeira ocorrência da expressão regular correspondente na sequência de entrada pelo texto especificado no argumento replacement.
- **Matcher.lookingAt()**: Verifica se a expressão regular corresponde ao início da sequência de entrada, retornando true se houver uma correspondência no início.
- **Matcher.reset()**: O método reset() da classe Matcher redefine o estado do objeto Matcher, permitindo que você faça novas correspondências na mesma sequência de entrada.
- **Matcher.usePattern(Pattern newPattern)**: Permite alterar o padrão regex associado a um objeto Matcher existente.

Esses métodos e classes são amplamente utilizados para realizar tarefas de manipulação e pesquisa de texto. O uso de expressões regulares oferece uma maneira poderosa e flexível de lidar com padrões de texto complexos.

- Aprenda especificadores de formato e flags para formatação de strings. Link para a documentação oficial da Oracle: https://docs.oracle.com/javase/8/docs/api/java/util/Formatter.html
- Aprenda expressões regulares com este serviço: https://regexone.com/
- Use esta ferramenta online para praticar suas habilidades em expressões regulares - https://regex101.com/

### Sequencias de escape
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./05_arquivos/proj_01/)

Para criar expressões regulares (regex), você pode usar uma variedade de sequências de escape para representar classes de caracteres e metacaracteres. Aqui estão algumas das sequências de escape mais comuns que podem ser usadas em regex em Java:

- `\d`: Corresponde a qualquer dígito decimal (0-9).
- `\D`: Corresponde a qualquer caractere que não seja um dígito.
- `\s`: Corresponde a qualquer espaço em branco (espaço, tabulação, quebra de linha, retorno de carro, etc.).
- `\S`: Corresponde a qualquer caractere que não seja um espaço em branco.
- `\w`: Corresponde a qualquer caractere de palavra (letras maiúsculas e minúsculas, dígitos e sublinhados).
- `\W`: Corresponde a qualquer caractere que não seja um caractere de palavra.
- `\b`: Corresponde a uma borda de palavra (o início ou o fim de uma palavra).
- `\B`: Corresponde a uma posição que não seja uma borda de palavra.
- `\t`: Corresponde a um caractere de tabulação.
- `\n`: Corresponde a uma quebra de linha.
- `\r`: Corresponde a um retorno de carro.
- `\f`: Corresponde a um caractere de alimentação de formulário.
- `\\`: Corresponde a uma barra invertida literal.
- `\.`: Corresponde a um ponto literal.

Também há uma sequência especial que pode ser usada com Java: o `\p` é uma sequência de escape usada em expressões regulares para corresponder a caracteres com propriedades específicas, como categorias de caracteres Unicode. O \p é usado junto com um par de colchetes `{}` para definir uma classe de caracteres com base em propriedades Unicode.

- `\p{L}`: Corresponde a qualquer caractere Unicode que seja uma letra (alfabética).
- `\p{N}`: Corresponde a qualquer caractere Unicode que seja um dígito numérico.
- `\p{S}`: Corresponde a qualquer caractere Unicode que seja um símbolo.
- `\p{P}`: Corresponde a qualquer caractere Unicode que seja um caractere de pontuação.
- `\p{Z}`: Corresponde a qualquer caractere Unicode que seja um espaço em branco.
- `\p{C}`: Corresponde a qualquer caractere Unicode que seja um controle.
- `\p{M}`: Corresponde a qualquer caractere Unicode que seja um caractere de marca.
