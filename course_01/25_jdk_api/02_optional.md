# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## 25.2. Optional no Java
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [02_arquivos](./02_arquivos/)
- Projetos
  - [Projeto 1](./02_arquivos/proj_01/) [(iniciado em)](#a-classe-optional)
- Conteúdo
  - [A classe Optional](#a-classe-optional)
  - [Objetivo](#objetivo)

### A classe Optional
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./02_arquivos/proj_01/)

Em Java 8, a classe `Optional` foi introduzida como uma maneira de evitar `NullPointerException` e para lidar com valores que podem ser `null` de uma forma mais limpa e expressiva. `Optional` é uma classe de contêiner que pode conter ou não um valor não-nulo. Ela oferece métodos para verificar a presença de um valor, obter o valor (se presente) e fornecer um valor alternativo (fallback) caso o valor original seja `null`.

Vamos explorar alguns exemplos para entender melhor o uso de `Optional` em Java 8:

#### Criação de um objeto Optional

```java
Optional<String> optionalString = Optional.of("Hello");
Optional<String> emptyOptional = Optional.empty();
Optional<String> nullableOptional = Optional.ofNullable(null);
```

#### Verificando se um valor está presente

```java
if (optionalString.isPresent()) {
  System.out.println("Valor disponível");
} else {
  System.out.println("Valor não disponível");
}
```

#### Obtendo o valor de um Optional

```java
String value = optionalString.get(); // Retorna o valor se presente, caso contrário lança NoSuchElementException
```

#### Usando orElse para fornecer um valor padrão

```java
String nullSafeValue = nullableOptional.orElse("Valor padrão");
System.out.println(nullSafeValue); // Saída: Valor padrão
```

#### Usando orElseGet com uma expressão lambda

```java
String computedFallback = nullableOptional.orElseGet(() -> "Computed Value");
System.out.println(computedFallback); // Saída: Computed Value
```

#### Usando ifPresent para executar ação se valor presente

```java
optionalString.ifPresent(value -> System.out.println("O valor é: " + value));
```

#### Transformando o valor com map

```java
Optional<Integer> stringLength = optionalString.map(String::length);
stringLength.ifPresent(length -> System.out.println("O comprimento da string é: " + length));
```

#### Encadeando métodos com flatMap

```java
Optional<Optional<String>> optionalOfOptional = Optional.of(optionalString);
String result = optionalOfOptional.flatMap(value -> value).orElse("Valor padrão");
System.out.println(result); // Saída: Hello
```

#### Benefícios de usar Optional

- **Prevenção de NullPointerException**: `Optional` ajuda a evitar `NullPointerException` explicitando a possibilidade de um valor ser `null`.
- **APIs mais claras**: Ao usar `Optional` no retorno de métodos, fica claro que o método pode não retornar um valor.
- **Encadeamento de operações**: `Optional` permite encadear operações de uma maneira limpa e expressiva.

#### Cuidados

- Não use `Optional` em campos de classe, especialmente em classes serializáveis, pois isso pode levar a problemas de desempenho e incompatibilidade. `Optional` é mais adequado para uso em assinaturas de métodos e variáveis locais.
- Evite usar `Optional.get()` sem antes verificar se o valor está presente com `isPresent()`, pois isso pode levar a `NoSuchElementException` se o `Optional` estiver vazio.
- Use `Optional` como uma alternativa para retornar `null` de métodos e não como um substituto universal para todos os usos de `null`.

Em resumo, `Optional` é uma ferramenta poderosa em Java 8 para lidar com a ausência de valores de maneira mais segura e clara. Seu uso adequado pode melhorar a qualidade do código e reduzir a probabilidade de erros relacionados a `null`.

### Objetivo
[[Topo]](#)<br />

A classe `Optional` em Java 8 foi introduzida com o objetivo de proporcionar uma melhor abordagem para lidar com valores que podem ser `null`. Antes de `Optional`, o `null` era frequentemente utilizado para representar a ausência de um valor, mas isso trazia vários problemas, como a falta de expressividade, a dificuldade em entender a intenção do código e, mais criticamente, o risco de `NullPointerExceptions`. A classe `Optional` visa resolver esses problemas oferecendo uma alternativa mais robusta e clara.

#### Objetivos principais da classe Optional

- **Expressar a opcionalidade**: `Optional` torna explícito que um valor pode estar ausente. Isso melhora a legibilidade e a compreensão do código, já que fica claro que o uso de `Optional` é uma indicação de que o valor pode ser `null`.
- **Reduzir `NullPointerExceptions`**: Ao forçar os desenvolvedores a lidar com a possibilidade de valores ausentes, o uso de `Optional` ajuda a prevenir `NullPointerExceptions`, um dos erros mais comuns em Java.
- **Encorajar boas práticas de programação**: `Optional` incentiva o desenvolvedor a pensar sobre o caso em que um valor pode não estar presente e a lidar com essa situação de forma explícita. Isso promove práticas de codificação mais seguras e robustas.
- **Prover uma API rica para manipulação de valores nulos**: `Optional` vem com vários métodos úteis para verificar a presença de um valor (`isPresent`), obter o valor (`get`), fornecer um valor padrão (`orElse`), executar ações condicionais (`ifPresent`), e transformar o valor de forma segura (`map`, `flatMap`).
- **Melhorar a semântica das interfaces de API**: Quando um método retorna um `Optional`, ele sinaliza claramente que o retorno pode ser vazio. Isso é mais expressivo do que apenas documentar que o método pode retornar `null`.

#### Exemplo de uso

Considere um método que pode retornar um valor `null`:

```java
public String getNomeUsuario(User user) {
  if (user != null) {
    return user.getName();
  }
  return null;
}
```

Usando `Optional`, isso pode ser reescrito para:

```java
public Optional<String> getNomeUsuario(User user) {
  if (user != null) {
    return Optional.ofNullable(user.getName());
  }
  return Optional.empty();
}
```

Este segundo exemplo é mais claro e força quem chama o método a lidar com a possibilidade de não haver um nome de usuário.

#### Conclusão

A introdução de `Optional` em Java 8 representa uma evolução importante na maneira como os desenvolvedores lidam com valores nulos, encorajando práticas mais seg

uras e claras. Ao invés de deixar a possibilidade de um valor `null` implícita e sujeita a erros, `Optional` torna essa possibilidade explícita e fornece ferramentas para lidar com ela de maneira adequada. Isso ajuda a criar um código mais robusto, menos propenso a erros inesperados, e mais fácil de entender.
