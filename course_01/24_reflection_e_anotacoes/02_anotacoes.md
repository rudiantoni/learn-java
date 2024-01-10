# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Anotações
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [02_arquivos](./02_arquivos/)
- Projetos
  - [Projeto 1](./02_arquivos/proj_01/) [(iniciado em)](#exemplos-de-uso)
- Conteúdo
 - [O que é uma anotação](#o-que-é-uma-anotação)
 - [Alvo das anotações](#alvo-das-anotações)
 - [Retenção das anotações](#retenção-das-anotações)
 - [Exemplos de uso](#exemplos-de-uso)


### O que é uma anotação
[[Topo]](#)<br />

Uma anotação em Java, particularmente no Java 8, é uma forma de adicionar metadados ao código-fonte. Elas podem ser aplicadas a declarações de classes, métodos, variáveis, parâmetros, e pacotes. As anotações não têm efeito direto sobre a operação do código que elas anotam, mas podem ser usadas por ferramentas de software e bibliotecas para processar esse código de maneiras específicas, o que pode afetar a execução do programa.

As anotações em Java são introduzidas pela palavra-chave `@interface`. Aqui estão algumas características importantes:

- **Anotações predefinidas**: Java já vem com algumas anotações predefinidas. Por exemplo, `@Override` indica que um método está sobrescrevendo um método da superclasse. Outras anotações comuns incluem `@Deprecated` (para indicar que um elemento está obsoleto) e `@SuppressWarnings` (para suprimir determinados avisos do compilador).
- **Meta-anotações**: Estas são anotações usadas para anotar outras anotações. Por exemplo, `@Target` e `@Retention` são meta-anotações que definem onde uma anotação pode ser usada e quanto tempo a anotação é retida, respectivamente.
- **Anotações customizadas**: Os desenvolvedores podem criar suas próprias anotações. Isso é útil para fornecer informações adicionais que podem ser usadas por bibliotecas de processamento de anotações. Por exemplo, uma anotação personalizada pode ser criada para validar inputs de um método ou para fornecer informações de configuração.
- **Processamento de anotações**: As anotações podem ser processadas em tempo de compilação ou em tempo de execução. Ferramentas como o processador de anotações do Java podem ser usadas para gerar código, XML, e outros arquivos com base em anotações no código-fonte.
- **Uso com lambdas e streams**: No contexto do Java 8, as anotações são particularmente úteis quando usadas com expressões lambda e a API Stream, permitindo uma maior clareza e concisão no código, além de fornecer metadados úteis para essas construções.

Em resumo, as anotações são um poderoso recurso do Java que permite aos desenvolvedores escrever código mais limpo, mais legível e mais fácil de manter, além de habilitar uma ampla gama de funcionalidades relacionadas ao processamento desses metadados.

### Alvo das anotações
[[Topo]](#)<br />

No Java 8, as anotações podem ser usadas em diversas partes do código para diferentes propósitos. Vou detalhar alguns dos lugares mais comuns onde as anotações são aplicadas e seus usos típicos:

- **Classes**: As anotações em nível de classe são frequentemente usadas para fornecer metadados que se aplicam a toda a classe. Por exemplo, em frameworks como Spring ou Hibernate, anotações como `@Entity`, `@Controller`, ou `@Service` são usadas para definir o papel da classe no contexto da aplicação.
- **Métodos**: Anotações em métodos são muito comuns. Por exemplo:
   - `@Test` (em frameworks de teste como JUnit) para indicar que um método é um método de teste.
   - `@Override` para indicar que o método está sobrescrevendo um método da superclasse.
   - `@GetMapping`, `@PostMapping` (em frameworks web como Spring MVC) para mapear métodos a endpoints HTTP específicos.
- **Parâmetros de métodos**: Anotações em parâmetros podem ser usadas para fornecer informações adicionais sobre como um parâmetro deve ser tratado. Por exemplo, em APIs REST, anotações como `@PathVariable` ou `@RequestParam` (Spring MVC) são usadas para mapear parâmetros de métodos para partes de uma requisição HTTP.
- **Campos de classe**: Em campos de classe, as anotações são frequentemente usadas para definir como esses campos devem ser tratados por frameworks. Por exemplo:
   - `@Autowired` (Spring) para injeção de dependências.
   - `@Column`, `@Id` (JPA, Hibernate) para mapear campos a colunas de uma base de dados.
- **Construtores**: Embora menos comum, anotações também podem ser aplicadas a construtores. Por exemplo, `@Autowired` em construtores é usado para injeção de dependências em Spring.
- **Anotações locais de variáveis**: Introduzidas no Java 8, permitem anotar as declarações de variáveis locais. Isso é útil, por exemplo, em ferramentas de análise de código estático para verificar certas condições ou impor restrições ao uso dessas variáveis.
- **Anotações de tipo**: Também introduzidas no Java 8, permitem anotar qualquer uso de um tipo. Isso inclui, por exemplo, o uso em declarações de classes, métodos, e até mesmo em castings. São úteis para ferramentas de análise de código e para fornecer informações adicionais sobre o uso dos tipos.

Esses são os lugares mais comuns para o uso de anotações no Java 8. Elas são parte integrante de muitas bibliotecas e frameworks modernos, facilitando a configuração, validação, e o mapeamento de dados, além de fornecer uma maneira de estender a linguagem de programação com metadados personalizados.

### Retenção das anotações
[[Topo]](#)<br />

Em Java, a política de retenção de uma anotação é definida pela meta-anotação `@Retention`. Essa meta-anotação determina em que ponto do ciclo de vida do software a anotação é descartada. Existem três tipos de políticas de retenção, cada uma representando um estágio diferente em que a anotação pode ser mantida:
- **`RetentionPolicy.SOURCE`**
  - **Descrição**: Esta política indica que a anotação será descartada pelo compilador durante a compilação e, portanto, não estará presente no bytecode. Ela só é visível no código fonte.
  - **Uso comum**: Anotações com essa política são geralmente usadas para fins que são relevantes apenas durante o desenvolvimento, como supressão de avisos (`@SuppressWarnings`) ou marcação de elementos que devem ser removidos no futuro (`@Deprecated`). Ferramentas de processamento de código-fonte, como os geradores de código Lombok, também usam anotações `SOURCE`.

- **`RetentionPolicy.CLASS`**
  - **Descrição**: Com esta política, a anotação é gravada no arquivo de classe pelo compilador, mas não é mantida pela Máquina Virtual Java (JVM) em tempo de execução. Isso significa que a anotação pode ser usada por ferramentas que leem arquivos de classe, mas não está disponível em tempo de execução através de reflexão.
  - **Uso comum**: É a política de retenção padrão se nenhuma política de retenção for explicitamente definida. Pode ser útil para ferramentas que realizam a análise de bytecode.

- **`RetentionPolicy.RUNTIME`**
   - **Descrição**: Anotações com essa política são mantidas pelo compilador no arquivo de classe e também são mantidas pela JVM em tempo de execução, de modo que podem ser acessadas em tempo de execução através de reflexão.
   - **Uso comum**: Essa política é usada quando a informação da anotação precisa ser acessada em tempo de execução. Por exemplo, frameworks como Spring e Hibernate utilizam anotações `RUNTIME` para injetar dependências (`@Autowired`), mapear entidades a tabelas de banco de dados (`@Entity`), e configurar mapeamentos de rotas em APIs REST (`@GetMapping`, `@PostMapping`).

Escolher a política de retenção correta é importante, pois impacta na disponibilidade da anotação durante as diferentes fases do ciclo de vida do software, desde a escrita do código até a execução do programa.


### Exemplos de uso
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./02_arquivos/proj_01/)

Para criar suas próprias anotações em Java 8, você precisa entender alguns conceitos básicos. Anotações personalizadas podem ter elementos que se comportam como métodos, e você pode usar meta-anotações para definir como sua anotação deve ser tratada. Vou fornecer exemplos cobrindo vários casos de uso, incluindo a definição de anotações e a aplicação de meta-anotações.

#### Definindo uma anotação básica

```java
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
  public @interface MyAnnotation {
}
```

#### Anotação com elementos

```java
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MethodInfo {
  String author() default "Unknown";
  String date();
  int version() default 1;
}
```

#### Anotação aplicada em nível de classe

```java
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Configurable {
  String value();
}
```

#### Anotação para validação de parâmetro

```java
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
public @interface NotEmpty {
  // Sem elementos adicionais necessários
}
```

#### Anotação com meta-anotações

```java
import java.lang.annotation.Documented;

@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface DocumentedAnnotation {
  String description() default "";
}
```

#### Anotação com política de retenção SOURCE

```java
@Retention(RetentionPolicy.SOURCE)
public @interface Todo {
  String description();
}
```

#### Anotação de anotação (meta-anotação)

```java
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
public @interface Validator {
  // Elementos para definir o comportamento do validador
}
```

Esses exemplos abrangem uma gama de casos de uso para a criação de anotações personalizadas em Java 8, incluindo diferentes tipos de meta-anotações, anotações para classes, métodos, parâmetros e até anotações de anotações. Você pode estender esses exemplos para criar anotações mais complexas conforme necessário para seus projetos.
