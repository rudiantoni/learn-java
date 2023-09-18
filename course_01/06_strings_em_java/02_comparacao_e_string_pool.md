# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Comparação de strings e o String pool
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [02_arquivos](./02_arquivos/)
- Projetos
  - [Projeto 1](./02_arquivos/proj_01/) [(iniciado em)](#comparação-de-strings)
- Conteúdo
  - [Comparação de Strings](#comparação-de-strings)
  - [String pool](#string-pool)
  - [Método intern()](#método-intern)

### Comparação de Strings
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./02_arquivos/proj_01/)

#### Comparação de igualdade

A comparação com == em Java é utilizada para verificar se duas referências de objetos apontam para o mesmo objeto na memória, não para comparar o conteúdo das strings. Portanto, usar == para comparar strings não é recomendado para verificar igualdade de conteúdo. No entanto, é importante

Para verificar se duas strings são iguais em termos de conteúdo, você pode usar o método equals() ou equalsIgnoreCase() para ignorar diferenças de maiúsculas e minúsculas:

```java
String str1 = "Hello";
String str2 = "hello";

boolean areEqual = str1.equals(str2); // Retorna false
boolean areEqualIgnoreCase = str1.equalsIgnoreCase(str2); // Retorna true
```

#### Comparação lexicográfica

A comparação lexicográfica (em ordem alfabética) verifica a ordem das strings em um dicionário. Você pode usar o método compareTo() ou compareToIgnoreCase():

```java
String str1 = "apple";
String str2 = "banana";

int result = str1.compareTo(str2); // Retorna um valor negativo (-ve)
int resultIgnoreCase = str1.compareToIgnoreCase(str2); // Retorna um valor negativo (-ve)
```
- Se result é negativo, str1 é menor que str2.
- Se result é positivo, str1 é maior que str2.
- Se result é zero, str1 é igual a str2.

#### Verificar prefixos e sufixos

Você pode verificar se uma string começa ou termina com um prefixo ou sufixo específico usando os métodos startsWith() e endsWith():

```java
String text = "Hello, World!";
boolean startsWithHello = text.startsWith("Hello"); // Retorna true
boolean endsWithWorld = text.endsWith("World!"); // Retorna true
```
**Comparação de Números**
Para comparar strings que representam números, você pode convertê-las em tipos numéricos e compará-las:

```java
String num1 = "123";
String num2 = "45";

int int1 = Integer.parseInt(num1);
int int2 = Integer.parseInt(num2);

int compareResult = Integer.compare(int1, int2); // Retorna um valor positivo (+ve)
```

#### Comparação de conteúdo substring

Para verificar se uma string contém outra como substring, você pode usar o método contains():

```java
String text = "Java 8 is great!";
boolean containsIsGreat = text.contains("is great"); // Retorna true
```

#### Comparação de null e vazia

É importante verificar se uma string é nula ou vazia antes de usá-la para evitar exceções. Você pode usar isEmpty() e comparar com null:

```java
String str = null;

if (str != null && !str.isEmpty()) {
  // Faça algo com a string
} else {
  // Trate o caso em que a string é nula ou vazia
}
```

Essas são algumas das maneiras comuns de realizar comparações de strings em Java. Lembre-se de escolher o método mais apropriado para o tipo de comparação que você deseja realizar.

### String pool
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./02_arquivos/proj_01/)

O "String Pool" (piscina de strings) é uma área especial de memória na qual o Java armazena literais de strings. O objetivo principal do String Pool é otimizar o uso de memória, garantindo que várias referências a strings idênticas apontem para a mesma instância de string na memória. Isso evita a criação de múltiplas cópias de strings com o mesmo conteúdo, economizando memória.

Strings literais são criadas diretamente no código-fonte e são automaticamente adicionadas ao String Pool.

```java
String str1 = "Hello"; // Adicionado ao String Pool
String str2 = "Hello"; // Referência ao mesmo objeto no String Pool
```

No exemplo acima, str1 e str2 apontam para a mesma instância de string no String Pool, economizando memória.

Você pode usar o método intern() para adicionar explicitamente uma string ao String Pool, ele será explicado mais a frente.

Ao comparar strings usando o operador ==, você está verificando se as referências das strings são as mesmas, ou seja, se elas apontam para a mesma instância no String Pool:

```java
String str1 = "Hello";
String str2 = "Hello";
boolean referenceEquality = (str1 == str2); // Retorna true (mesma referência)
```

### Método intern()
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./02_arquivos/proj_01/)

O método intern() é um método da classe java.lang.String em Java que é usado para otimizar o uso de memória ao adicionar uma string ao "String Pool". O String Pool é uma área especial de memória onde o Java armazena literais de strings para evitar a duplicação de strings idênticas.

Quando você chama o método intern() em uma string, o Java verifica se uma string com o mesmo conteúdo já existe no String Pool. Se existir, ele retorna uma referência a essa string. Caso contrário, ele adiciona a string atual ao String Pool e retorna uma referência para a nova string adicionada.

```java
String str1 = new String("Olá"); // Criando uma nova string
String str2 = "Olá"; // Obtendo uma referência do String Pool

// Usando intern() para adicionar str1 ao String Pool (se já não estiver lá)
String str3 = str1.intern();

// Verificando se str2 e str3 apontam para a mesma instância no String Pool
boolean areNotEqual = (str1 == str2); // Retorna false
boolean areEqual = (str2 == str3); // Retorna true
```

Neste exemplo, str1 é criado como uma nova instância de string, enquanto str2 obtém uma referência do String Pool. Em seguida, usamos o método intern() em str1, o que faz com que ela seja adicionada ao String Pool se já não estiver lá. Como resultado, str3 se torna uma referência para a mesma instância no String Pool que str2, economizando memória.

O método intern() é útil quando você deseja economizar memória ao garantir que várias referências a strings com o mesmo conteúdo apontem para a mesma instância no String Pool. No entanto, você deve usá-lo com moderação, pois pode aumentar o uso de memória se usado indiscriminadamente. Além disso, normalmente não é necessário chamar intern() em strings literais, pois elas já são adicionadas ao String Pool automaticamente.

Embora o String Pool seja uma otimização útil para economia de memória, você deve usá-lo com cuidado. Adicionar muitas strings ao String Pool pode levar a um aumento no uso de memória, pois as strings permanecerão na memória até que a JVM seja encerrada.

Além disso, ao usar o método intern(), lembre-se de que ele pode ser mais lento em comparação com a comparação direta de strings com equals(). Portanto, use intern() com moderação, apenas quando necessário.

O String Pool é uma parte importante do gerenciamento de memória em Java e pode ser uma ferramenta valiosa para economizar memória ao trabalhar com strings. No entanto, é importante entender como ele funciona e usá-lo de maneira adequada para evitar problemas de desempenho e consumo excessivo de memória.
