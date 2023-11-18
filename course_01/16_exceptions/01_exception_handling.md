# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Manipulação de exceptions
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [01_arquivos](./01_arquivos/)
- Projetos
  - [Projeto 1](./01_arquivos/proj_01/) [(iniciado em)](#conceitos-básicos)
- Conteúdo
  - [Conceitos básicos](#conceitos-básicos)
  - [Tipos de Exceptions](#tipos-de-exceptions)
  - [Manipulando Exceptions](#manipulando-exceptions)
  - [Detecção e Tratamento Específico de Exceptions](#detecção-e-tratamento-específico-de-exceptions)
  - [Uso Avançado de Exceptions](#uso-avançado-de-exceptions)
  - [Customização e API de Exceptions](#customização-e-api-de-exceptions)

### Conceitos básicos
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./01_arquivos/proj_01/)

**O que é uma Exception?**: Uma Exception é um evento que ocorre durante a execução de um programa, interrompendo o fluxo normal de instruções. É um objeto que representa um erro ou condição inesperada que surge enquanto um programa está rodando. Exceções em Java são usadas para indicar que algo inesperado aconteceu que precisa ser tratado, geralmente algo que o programa normalmente não esperaria ou não poderia lidar por conta própria.

Elas são usadas para lidar com erros como problemas de entrada/saída, falhas de rede, tentativas de acessar elementos fora dos limites de um array, etc. O mecanismo de exceção fornece uma maneira estruturada e controlada de lidar com esses erros e exceções, permitindo que o programa recupere ou pelo menos encerre graciosamente.

**Hierarquia de Exceptions**: A hierarquia de exceções é uma estrutura de classes que organiza diferentes tipos de exceções. Todas as classes de exceção em Java são derivadas da classe base java.lang.Throwable. A partir daí, a hierarquia se divide em duas categorias principais:
- **Exception** que podem ser checked como IOException e SQLException ou unchecked como NullPointerException e IndexOutOfBoundsException.
- **Error**: que também é uma subclasse de Throwable. Os erros são condições graves que normalmente não são esperadas para serem capturadas pelo aplicativo. Exemplos incluem OutOfMemoryError e StackOverflowError.

### Tipos de Exceptions
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./01_arquivos/proj_01/)

**Checked Exceptions (java.lang.Exception)**
- São exceções que são verificadas pelo compilador no momento da compilação.
- O programador é obrigado a tratar estas exceções, seja com um bloco try-catch ou propagando-as com a palavra-chave throws.
- Exemplos incluem IOException, SQLException, entre outras.

**Unchecked Exceptions (java.lang.RuntimeException)**
- São exceções que não são verificadas pelo compilador.
- Geralmente, representam erros na lógica do programa, que poderiam ter sido evitados pelo programador.
- Exemplos incluem NullPointerException, IndexOutOfBoundsException, entre outras.

### Manipulando Exceptions
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./01_arquivos/proj_01/)

**Estrutura Básica do try-catch**: A estrutura básica do bloco try-catch em Java é usada para capturar exceções que podem ser lançadas durante a execução de um trecho de código. Ela se divide em duas partes principais: o bloco try, onde o código potencialmente perigoso é executado, e o bloco catch, onde a exceção é capturada e tratada.

```java
try {
  // Código que pode lançar uma exceção
} catch (TipoException e) {
  // Código para tratar a exceção
}
```

No bloco try, você coloca o código que pode lançar uma exceção. Se uma exceção ocorrer, o fluxo de execução é transferido para o bloco catch correspondente, onde TipoException é o tipo da exceção que você espera capturar. Dentro do bloco catch, você pode tratar a exceção de maneira adequada.

**Bloco try-catch com Múltiplas Cláusulas catch**: É possível ter múltiplas cláusulas catch associadas a um único bloco try. Isso é útil quando diferentes tipos de exceções podem ser lançadas, e você deseja tratá-las de maneira diferente.

```java
try {
  // Código que pode lançar diferentes tipos de exceções
} catch (TipoException1 | TipoException2 | TipoException3 e) {
  // Tratamento para TipoException1, TipoException2 e TipoException3
}

try {
  // Código que pode lançar diferentes tipos de exceções
} catch (TipoException1 e) {
  // Tratamento para TipoException1
} catch (TipoException2 e) {
  // Tratamento para TipoException2
} catch (TipoException3 e) {
  // Tratamento para TipoException3
}
```

**Bloco try-catch com Múltiplos Blocos**: Em alguns casos, pode ser necessário aninhar blocos try-catch, especialmente quando se trabalha com operações que podem lançar exceções em diferentes pontos.

```java
try {
  // Código que pode lançar uma exceção

  try {
    // Código aninhado que também pode lançar uma exceção
  } catch (TipoExceptionInterna e) {
    // Tratamento para a exceção do bloco aninhado
  }

} catch (TipoExceptionExterna e) {
  // Tratamento para a exceção do bloco externo
}
```

Neste exemplo, um bloco try-catch está aninhado dentro de outro. Isso pode ser útil quando uma seção do código dentro do bloco try externo requer seu próprio tratamento de exceção especializado.

Cada um desses padrões de try-catch serve a diferentes necessidades na manipulação de exceções, permitindo que os desenvolvedores escrevam códigos mais robustos e seguros.

### Detecção e Tratamento Específico de Exceptions
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./01_arquivos/proj_01/)

**Como detectar Exceptions**: Exceptions são detectadas durante a execução do programa quando uma condição anormal ocorre. O Java usa um mecanismo de "throw" para lançar uma exceção e um mecanismo de "catch" para capturá-la.

Apesar disso, detectar exceptions envolve entender como e onde uma exceção pode ocorrer em seu código. Uma exceção é geralmente lançada (thrown) quando o Java encontra uma situação anormal em um trecho do código. Estas situações podem variar desde operações ilegais (como dividir por zero), até falhas externas (como falha na leitura de um arquivo).

Identificando Situações Potenciais para Exceções:
- Operações de Entrada/Saída: Operações de leitura/escrita de arquivos, comunicação de rede, etc., podem falhar por várias razões (arquivo não encontrado, permissões insuficientes, problemas de rede).
- Conversões de Tipo: Tentativas de conversão de tipos incompatíveis (por exemplo, de String para int) podem resultar em NumberFormatException.
- Acesso a Arrays ou Coleções: Acessar um índice fora dos limites de um array ou coleção gera ArrayIndexOutOfBoundsException ou IndexOutOfBoundsException.
- Operações Aritméticas: Como divisão por zero que resulta em ArithmeticException.
- Chamadas de Métodos em Referências Nulas: Tentar acessar um método ou propriedade de um objeto nulo resulta em NullPointerException.

**Bloco try-catch-finally**: O tratamento de exceptions em Java é feito principalmente através dos blocos try, catch, e finally. Estes blocos permitem escrever código robusto que pode lidar com condições excepcionais sem falhar completamente. O bloco try contém código que pode potencialmente gerar uma exceção. O Java executa o código dentro do bloco try até que uma exceção seja lançada ou até que o bloco seja completado com sucesso. O bloco catch é usado para capturar e tratar exceções. Se uma exceção for lançada dentro do bloco try, o fluxo de execução será transferido para o bloco catch correspondente que pode tratar essa exceção específica. O bloco finally é opcional e é executado após a execução dos blocos try e catch, independentemente de uma exceção ter sido lançada ou não. É comumente usado para código de limpeza, como fechar conexões de arquivo ou de rede.

```java
try {
  // Código que pode lançar uma exceção
} catch (TipoException e) {
  // Tratamento da exceção
} finally {
  // Código de limpeza
}
```

**Casos onde o finally não é executado**: O bloco finally não é executado se o JVM sai abruptamente enquanto o bloco try ou catch está sendo executado. Isso pode acontecer, por exemplo, se o sistema chama System.exit() ou se ocorre uma falha grave na máquina virtual.

### Uso Avançado de Exceptions
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./01_arquivos/proj_01/)

**Instrução throws**: A palavra-chave throws é usada em assinaturas de métodos para indicar que este método pode lançar uma exceção do tipo especificado.

**Throws e herança**: Quando uma classe é herdada, o método sobrescrito na classe filha não pode lançar exceções de tipos mais amplos do que o método na classe pai.

**Uso da palavra-chave throw**: A palavra-chave throw é usada para lançar explicitamente uma exceção. Você cria um objeto de exceção e o lança usando throw. Isso é comumente usado para indicar que um método encontrou uma situação anormal que não pode lidar.

```java
public void checkAge(int age) {
  if (age < 18) {
    throw new IllegalArgumentException("Acesso negado - Você deve ter pelo menos 18 anos.");
  }
}
// Este método lança uma IllegalArgumentException se a idade é menor que 18.
```

**Throw de Checked Exception Wrapped**: Uma prática comum é "embrulhar" uma exceção verificada (checked exception) em uma exceção personalizada (custom exception), especialmente quando você quer passar a exceção para cima na pilha de chamadas sem forçar o código cliente a tratar a exceção específica original. Aqui está como você pode fazer isso:

- **Embrulhar a Exceção Checked em uma RuntimeException**: A abordagem mais comum é "embrulhar" a exceção checked dentro de uma RuntimeException. Isso é feito capturando a exceção checked e lançando uma nova exceção não verificada, geralmente com a exceção original como causa.
```java
try {
  // Código que pode lançar uma exceção checked
  // Qualquer exception que herde Exception
} catch (IOException e) {
  throw new RuntimeException("Erro de IO", e);
  // Qualquer exception que herde RuntimeException
}
```

Neste exemplo, uma IOException (uma exceção verificada) é capturada e embrulhada em uma RuntimeException (uma exceção não verificada). Isso permite propagar a exceção sem a necessidade de declará-la ou tratá-la explicitamente em todos os níveis da pilha de chamadas.

- **Criar uma Subclasse de RuntimeException**: Outra abordagem é criar sua própria classe de exceção que estende RuntimeException e usá-la para encapsular a exceção checked.

```java
public class MinhaUncheckedException extends RuntimeException {
  public MinhaUncheckedException(String message, Throwable cause) {
    super(message, cause);
  }
}

// Uso
try {
  // Código que pode lançar uma exceção checked
} catch (IOException e) {
  throw new MinhaUncheckedException("Erro de IO", e);
}
```

Neste caso, você cria uma exceção personalizada que estende RuntimeException e a usa para embrulhar a exceção original. Isso pode ser útil se você quiser adicionar informações adicionais ou comportamento específico à exceção.

- Considerações
  - Ao converter exceções checked em unchecked, é importante considerar as implicações para os usuários do seu código. As exceções não verificadas não precisam ser declaradas ou capturadas, o que pode ser tanto uma vantagem quanto um risco, dependendo de como a exceção é esperada para ser tratada.
  - Além disso, sempre inclua a exceção original como a causa da nova exceção não verificada. Isso preserva a pilha de chamadas e facilita a depuração, pois a causa original do erro não é perdida.
  - Lembre-se de que essa prática deve ser usada com cautela e compreensão do fluxo de exceções em sua aplicação para evitar surpresas indesejadas no tratamento de erros.

### Customização e API de Exceptions
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./01_arquivos/proj_01/)

**Throwable API**: A classe Throwable é a superclasse de todas as exceções e erros. Ela fornece vários métodos úteis para obter informações sobre a exceção que ocorreu, como getMessage(), getCause(), printStackTrace(), entre outros.

Principais métodos:

- **getMessage()**: Retorna a mensagem detalhada da exceção.
- **getCause()**: Retorna a causa da exceção, se disponível.
- **printStackTrace()**: Imprime o rastreamento de pilha para o fluxo de erro padrão.

**Criar a própria Exception**: Você pode criar suas próprias classes de exceção em Java estendendo a classe Exception (para exceções checked) ou RuntimeException (para exceções unchecked).

Exemplo de uma exceção customizada:

```java
public class MinhaExcecao extends Exception {
  public MinhaExcecao(String message) {
    super(message);
  }
}

// Para usar:
throw new MinhaExcecao("Isso é um erro personalizado.");
```

Criar uma exceção personalizada é útil quando você quer expressar um erro específico do seu domínio de aplicação e quando deseja fornecer informações adicionais para os manipuladores de exceção.
