# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## 18.1. Manipulação de genéricos
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [01_arquivos](./01_arquivos/)
- Projetos
  - [Projeto 1](./01_arquivos/proj_01/GenericsDemo/) [(iniciado em)](#para-que-precisamos-de-generics)
  - [Projeto 2](./01_arquivos/proj_02/GenericsDemo02/) [(iniciado em)](#o-operador-diamond)
  - [Projeto 3](./01_arquivos/proj_03/GenericsDemo03/) [(iniciado em)](#classe-genérica)
  - [Projeto 4](./01_arquivos/proj_04/GenericsDemo04/) [(iniciado em)](#curingas-wildcards)
  - [Projeto 5](./01_arquivos/proj_05/GenericsDemo05/) [(iniciado em)](#apagamento-de-tipo-type-erasure)
- Conteúdo
  - [Para que precisamos de generics](#para-que-precisamos-de-generics)
  - [O que são generics](#o-que-são-generics)
  - [O operador diamond](#o-operador-diamond)
  - [Como os generics funcionam](#como-os-generics-funcionam)
  - [Método genérico](#método-genérico)
  - [Classe genérica](#classe-genérica)
  - [Curingas (wildcards)](#curingas-wildcards)
  - [Apagamento de tipo (type erasure)](#apagamento-de-tipo-type-erasure)

### Para que precisamos de generics
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./01_arquivos/proj_01/GenericsDemo/)

Os generics no Java são importantes por várias razões, principalmente porque eles permitem a criação de classes, interfaces e métodos que são independentes de tipos específicos de dados. Isso traz vantagens significativas, como:

- **Segurança de Tipo**: Com generics, os erros podem ser detectados em tempo de compilação, em vez de em tempo de execução, o que aumenta a confiabilidade do código.
- **Reutilização de Código**: Você pode escrever um código que é independente de tipos de dados, tornando-o mais reutilizável.
- **Legibilidade e Manutenção**: O uso de generics torna o código mais legível e facilita a manutenção, pois o uso de tipos é mais claro e explícito.
- **Redução de Casting**: Generics reduzem a necessidade de casting explícito, o que torna o código mais limpo e menos propenso a erros de ClassCastException.

Considere a tarefa de criar uma caixa que pode conter qualquer tipo de objeto. Sem generics, você teria que definir a caixa para conter um tipo de objeto específico ou usar o tipo Object, o que implica em casting e falta de segurança de tipo.

```java
class Box {
  private Object object;

  public void set(Object object) {
    this.object = object;
  }

  public Object get() {
    return object;
  }
}

// Uso
Box box = new Box();
box.set("Hello World");
String str = (String) box.get(); // Casting necessário
```

Com Generics:

```java
class Box<T> {
  private T object;

  public void set(T object) {
    this.object = object;
  }

  public T get() {
    return object;
  }
}

// Uso
Box<String> stringBox = new Box<>();
stringBox.set("Hello World");
String str = stringBox.get(); // Sem casting, com segurança de tipo
```

Neste exemplo com generics, `Box<T>` é uma classe genérica, onde T é um placeholder para o tipo de objeto que a caixa pode conter. Quando você cria uma instância de Box, você especifica o tipo de objeto que ela conterá, como `Box<String>`. Isso garante que apenas strings sejam colocadas na caixa, e não há necessidade de casting quando você recupera o objeto da caixa.

### O que são generics
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./01_arquivos/proj_01/GenericsDemo/)

Generics são um recurso da linguagem de programação Java que permite aos desenvolvedores escrever e usar classes, interfaces e métodos de uma maneira que seja independente de tipos específicos de dados. Introduzido no Java 5, o conceito de generics aumenta significativamente a flexibilidade e a segurança do código. Aqui estão alguns aspectos fundamentais dos generics:

- **Tipagem parametrizada**: Generics permitem a criação de classes, interfaces e métodos com parâmetros de tipo. Isso significa que você pode definir uma classe ou método que pode operar com diferentes tipos de dados, especificados em tempo de uso.
- **Segurança de tipo em tempo de compilação**: Generics aumentam a segurança do código ao impor verificações de tipo mais rígidas em tempo de compilação. Isso reduz o risco de erros em tempo de execução relacionados a tipos incompatíveis.
- **Reutilização de código**: Com generics, é possível escrever código que é independente de tipos específicos, tornando-o mais reutilizável. Por exemplo, uma única implementação de uma lista genérica pode ser usada para listas de Strings, Integers ou qualquer outro tipo de objeto.
- **Redução de casting explícito**: Sem generics, muitas vezes é necessário realizar castings explícitos ao lidar com tipos de dados genéricos. Com generics, o casting é minimizado, tornando o código mais limpo e fácil de entender.
- **Uso de tipos comodin (wildcards)**: Generics também permitem o uso de wildcards (?), o que oferece maior flexibilidade ao trabalhar com tipos genéricos. Por exemplo, você pode escrever um método que aceita uma lista de qualquer tipo de subclasse de um determinado tipo.
- **Limites de tipo (bounded types)**: Generics permitem a definição de limites superiores e inferiores em parâmetros de tipo, restringindo os tipos que podem ser usados com um tipo genérico.

### O operador diamond
[[Topo]](#)<br />

- Ver projeto: [Projeto 2](./01_arquivos/proj_02/GenericsDemo02/)

O operador Diamond, introduzido no Java 7, é uma funcionalidade de simplificação para a instanciação de objetos de classes genéricas. Este operador, representado por um par de colchetes angulares vazios `<>`, permite ao compilador inferir automaticamente os tipos de argumentos genéricos necessários em uma expressão, com base no contexto.

#### Funcionamento do operador diamond

Quando você instancia um objeto de uma classe genérica sem o operador diamond, precisa repetir os tipos genéricos na declaração e na instanciação. Por exemplo:

```java
Map<String, List<String>> myMap = new HashMap<String, List<String>>();
```

Com o operador Diamond, você pode omitir esses tipos genéricos na instanciação, já que o compilador é capaz de inferi-los. O mesmo exemplo acima se torna:

```java
Map<String, List<String>> myMap = new HashMap<>();
```

Neste caso, o compilador Java infere os tipos genéricos da variável myMap (String e  `List<String>`) e os aplica automaticamente ao HashMap que está sendo instanciado.

#### Benefícios do operador diamond

- **Redução de redundância**: Diminui a necessidade de repetir informações de tipo, tornando o código mais limpo e fácil de ler.
- **Manutenção melhorada**: Ao modificar o tipo de uma variável genérica, você não precisa atualizar o tipo em vários locais.
- **Evita erros**: Como o compilador infere os tipos, há menos risco de inconsistências ou erros de tipo.

O operador Diamond é um exemplo de como os recursos de inferência de tipos do Java podem simplificar a codificação e melhorar a legibilidade do código.

### Como os generics funcionam
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./01_arquivos/proj_01/GenericsDemo/)

Os generics no Java funcionam com base em alguns conceitos-chave que permitem a programação genérica, ou seja, a escrita de classes, interfaces e métodos que podem operar em diferentes tipos de dados. Aqui estão os princípios fundamentais de como os generics funcionam:

#### Tipagem parametrizada

- **Parâmetros de Ripo**: Generics usam parâmetros de tipo para definir classes, interfaces e métodos genéricos. Um parâmetro de tipo, representado por uma letra dentro de colchetes angulares (por exemplo, <T>), é um tipo placeholder que será substituído por um tipo real quando o código for utilizado.
- **Exemplo**: `class Box<T> { private T content; ... }` – Aqui, T é um parâmetro de tipo.

#### Instanciação de tipos genéricos

- **Especificação de tipo**: Ao criar um objeto de uma classe genérica, você especifica o tipo real para o parâmetro genérico.
- **Exemplo**: `Box<Integer> intBox = new Box<>()`; – Integer substitui T na classe Box.

#### Segurança de tipo

- **Verificações em tempo de compilação**: O compilador garante que o código genérico seja usado de forma segura, verificando se os tipos são compatíveis e correspondem aos parâmetros genéricos especificados.
- **Exemplo**: Se `Box<T>`é instanciado como `Box<Integer>`, então apenas objetos Integer podem ser passados para os métodos dessa instância.

#### Inferência de tipo
- **Operador diamond**: Desde o Java 7, com o operador diamond <>, o compilador pode inferir o tipo genérico apropriado, simplificando a declaração de instâncias de objetos genéricos.
- **Exemplo**:` Box<Integer> intBox = new Box<>();` – O compilador infere que <> é Integer.

#### Limites de tipo (bounded types)

- **Limites superiores e inferiores**: Você pode restringir os tipos que podem ser usados com um tipo genérico. Limites superiores (extends) permitem usar tipos que são subclasses de um tipo específico. Limites inferiores (super) são usados em wildcards para especificar um tipo mínimo.
- **Exemplo**: `<T extends Number>` permite que T seja qualquer classe que herde de Number.

#### Wildcards

- **Uso de ?**: Os wildcards permitem maior flexibilidade ao usar tipos genéricos em métodos ou coleções, onde o tipo exato não é conhecido ou relevante.
- **Exemplo**: List<? extends Number> aceita listas de qualquer tipo que seja uma subclasse de Number.

#### Exemplo sobre apagamento de tipo (type erasure)

- **Remoção de informações genéricas em tempo de execução**: Para manter a compatibilidade com versões anteriores do Java, as informações de tipo genérico são removidas pelo compilador após a verificação de tipo (type erasure), substituindo todos os parâmetros de tipo por seus limites ou por Object se os parâmetros são não limitados.
- **Consequência**: Em tempo de execução, uma instância de `Box<Integer>` e **Box<String>** são ambas tratadas como Box.

```java
class Box<T> {
  private T content;

  public void set(T content) {
    this.content = content;
  }

  public T get() {
    return content;
  }
}
// Uso
Box<String> stringBox = new Box<>();
stringBox.set("Hello World");
String str = stringBox.get(); // Nenhum casting necessário
```

Neste exemplo, `Box<T>` é uma classe genérica onde T pode ser qualquer tipo. Ao usar a classe, você especifica o tipo de dado que deseja armazenar, como String no exemplo acima. Graças aos generics, o código se torna mais reutilizável, seguro e fácil de manter.

### Método genérico
[[Topo]](#)<br />

Se projeto:
- Ver projeto: [Projeto 1](./01_arquivos/proj_02/)

Um método genérico é um método que é declarado com um ou mais parâmetros de tipo, permitindo que seja usado com uma variedade de tipos de dados. Esses parâmetros de tipo são especificados dentro de um par de chaves angulares (<>) antes do tipo de retorno do método. Vamos explorar isso com mais detalhes:

#### Definição de um método genérico

Um método genérico começa com a declaração de um ou mais parâmetros de tipo. Por exemplo:

```java
public <T> void printArray(T[] array) {
  for (T element : array) {
    System.out.println(element);
  }
}
```

Neste exemplo, `<T>` é o parâmetro de tipo genérico. Ele indica que o método printArray pode trabalhar com um array de qualquer tipo (como Integer, String, Double, etc.).

#### Vantagens dos métodos genéricos

- **Flexibilidade**: Permite escrever um método que pode ser utilizado com diferentes tipos de dados, evitando a necessidade de criar múltiplos métodos para cada tipo de dado.
- **Segurança de tipo**: Os genéricos fornecem segurança de tipo em tempo de compilação. Isso significa que você pode pegar erros de tipo incompatível durante a compilação ao invés de enfrentar problemas em tempo de execução.

#### Restrições e características

- **Parâmetros de tipo**: Os nomes comuns para parâmetros de tipo são letras únicas como T (Type), E (Element), K (Key), V (Value), etc., mas você pode usar qualquer nome válido de identificador.
- **Apagamento de tipo (typo erasure)**: Em tempo de execução, o Java trata os genéricos como se fossem objetos do tipo Object devido ao processo conhecido como "type erasure". Isso é feito para manter a compatibilidade com versões anteriores do Java.
- **Não podem ser primitivos**: Os tipos usados com genéricos devem ser classes (tipos de referência). Tipos primitivos, como int ou double, não podem ser usados diretamente. Em vez disso, você deve usar suas classes correspondentes, como Integer e Double.

#### Uso em conjunto com coleções

Os métodos genéricos são frequentemente usados com coleções da API Collections do Java, como List<T>, Map<K, V>, etc., para proporcionar segurança de tipo e flexibilidade.

#### Exemplo de uso

```java
Integer[] intArray = {1, 2, 3, 4, 5};
String[] stringArray = {"hello", "world"};

printArray(intArray);   // Funciona com um array de Integer
printArray(stringArray); // Funciona com um array de String
```

Neste exemplo, o mesmo método printArray é usado para imprimir arrays de diferentes tipos, demonstrando a flexibilidade dos métodos genéricos.

### Classe genérica
[[Topo]](#)<br />

- Ver projeto: [Projeto 3](./01_arquivos/proj_03/GenericsDemo03/)

Uma classe genérica uma classe que é definida com um ou mais parâmetros de tipo. Esses parâmetros de tipo permitem que a classe seja utilizada com diferentes tipos de dados, tornando-a mais flexível e reutilizável. As classes genéricas são uma parte fundamental da linguagem, especialmente quando se trata de coleções e frameworks relacionados.

#### Definição de uma classe genérica

Para definir uma classe genérica, você utiliza chaves angulares (<>) para especificar um ou mais parâmetros de tipo. Aqui está um exemplo básico de uma classe genérica:


```java
public class Box<T> {
  private T t;

  public void set(T t) {
    this.t = t;
  }

  public T get() {
    return t;
  }
}
```

Neste exemplo, T é um parâmetro de tipo que será substituído por um tipo real quando a classe for usada. A classe Box pode ser instanciada para armazenar objetos de qualquer tipo.

#### Características das classes genéricas

- **Flexibilidade**: Podem ser usadas com diferentes tipos de dados. Por exemplo, Box<Integer> pode armazenar Integer, enquanto Box<String> pode armazenar String.
- **Segurança de tipo**: Assegura que somente objetos do tipo especificado sejam adicionados à instância da classe, reduzindo a probabilidade de erros em tempo de execução devido a conversões de tipo incorretas.
- **Reutilização de código**: Com classes genéricas, você pode escrever um código que é independente do tipo de dados, evitando a redundância.
- **Restrições de tipo**: Você pode restringir os tipos que podem ser usados com uma classe genérica usando curingas e limites de tipo. Por exemplo, `class NumberBox<T extends Number>` só pode ser instanciada com classes que são subtipos de Number.
- **Type erasure**: Java usa o conceito de type erasure para compatibilidade com versões mais antigas. Isso significa que as informações de tipo genérico são removidas em tempo de execução, e todos os tipos genéricos são tratados como Object.

#### Exemplo de uso

```java
Box<Integer> integerBox = new Box<>();
integerBox.set(10); // Armazenando um Integer
Integer intValue = integerBox.get();

Box<String> stringBox = new Box<>();
stringBox.set("Hello World"); // Armazenando um String
String stringValue = stringBox.get();
```

Neste exemplo, a mesma classe Box é usada para armazenar tipos de dados completamente diferentes (Integer e String), ilustrando a flexibilidade e reutilização de código proporcionadas por classes genéricas.

As classes genéricas são um recurso poderoso em Java, especialmente útil na implementação de coleções, frameworks e algoritmos que operam de maneira independente do tipo de dados.

### Curingas (wildcards)
[[Topo]](#)<br />

- Ver projeto: [Projeto 4](./01_arquivos/proj_04/GenericsDemo04/)

Os curingas (wildcards) são um conceito fundamental ao trabalhar com genéricos. Eles permitem que você escreva código mais flexível e reutilizável ao lidar com tipos genéricos.

#### O que são wildcards

Wildcards, representados pelo símbolo de interrogação (?), são usados em declarações de tipos genéricos para indicar tipos desconhecidos ou variáveis. Eles tornam as classes, interfaces e métodos genéricos mais flexíveis, permitindo que trabalhem com diferentes tipos, ao invés de um único tipo fixo.

#### Tipos de wildcards

- **Wildcard não limitado (?)**: Representa qualquer tipo. É útil quando você está interessado em objetos de um tipo genérico, mas o tipo exato não importa. Por exemplo, `List<?>` pode ser uma lista de qualquer tipo.
- **Wildcard com limite superior (? extends Tipo)**: Ou upper bounded wildcard, restringe o tipo desconhecido a um determinado tipo ou a qualquer subtipo desse tipo. Isso é chamado de "covariância". Por exemplo, List<? extends Number> significa uma lista de objetos que são instâncias de Number ou de suas subclasses (como Integer, Float). Quando usado com collections, é recomendado usar este wildcard quando se pretende apenas ler elementos da collection.
- **Wildcard com limite inferior (? super Tipo)**: Ou lower bounded wildcard, restringe o tipo desconhecido a um determinado tipo ou a qualquer super tipo desse tipo. Isso é conhecido como "contravariância". Por exemplo, List<? super Integer> significa uma lista de objetos que são instâncias de Integer ou de seus super tipos (como Number ou Object). Quando usado com collections, é recomendado usar este wildcard quando se pretende apenas escrever elementos na collection.

#### por que usar wildcards

Wildcards são úteis em várias situações, como:
- **Aumento da flexibilidade**: Eles permitem que você escreva métodos que podem aceitar ou retornar tipos genéricos mais flexíveis.
- **Compatibilidade com diferentes tipos**: Permitem a interoperabilidade entre diferentes tipos genéricos, útil em APIs e bibliotecas.
- **Leitura e escrita em estruturas genéricas**: Por exemplo, se você tem uma lista de Number, você pode querer ler valores dela como Number (usando ? extends Number) ou adicionar valores específicos, como Integer ou Double (usando ? super Integer).

#### Considerações importantes

- **Segurança de tipo**: Wildcards ajudam a manter a segurança de tipo em Java, garantindo que operações incorretas sejam detectadas em tempo de compilação.
- **Limitações**: Você não pode instanciar uma lista com um wildcard. Por exemplo, `new ArrayList<?>()` é inválido.
- **Regras de leitura e escrita**: Com um wildcard de limite superior (extends), você pode ler itens da lista, mas geralmente não pode escrever neles. Com um wildcard de limite inferior (super), você pode escrever na lista, mas há limitações na leitura.

Wildcards são um aspecto avançado dos genéricos em Java, oferecendo flexibilidade e segurança de tipo para operações complexas com coleções e outros tipos genéricos.

### Apagamento de tipo (type erasure)
[[Topo]](#)<br />

- Ver projeto: [Projeto 5](./01_arquivos/proj_05/GenericsDemo05/)

#### o que é o apagamento de tipo

O apagamento de tipo é um processo realizado pelo compilador Java para garantir que os programas que utilizam genéricos sejam compatíveis com versões mais antigas do Java que não suportam genéricos. Essencialmente, o apagamento de tipo remove todas as informações sobre os tipos genéricos durante a compilação e as substitui por seus limites ou por Object se os tipos não forem limitados.

#### Como funciona o apagamento de tipo

Quando você escreve código usando genéricos em Java, você está, na verdade, adicionando uma camada de segurança de tipo em tempo de compilação. No entanto, em tempo de execução, essa informação de tipo genérico é apagada.

```java
List<Integer> list = new ArrayList<>();
list.add(1);
```

Em tempo de compilação, o compilador verifica e garante que apenas objetos Integer sejam adicionados à lista.
Em tempo de execução, no entanto, o apagamento de tipo transforma a declaração acima em algo como:

```java
List list = new ArrayList();
list.add(1);
```

Aqui, `List<Integer>` é transformado em um simples List sem informação de tipo.

#### Implicações do apagamento de tipo

- **compatibilidade com versões anteriores**: Permite que código escrito com genéricos seja compatível com versões mais antigas do Java que não suportam genéricos.
- **Restrições de tipo em tempo de execução**: Uma vez que a informação de tipo é apagada, não é possível, em tempo de execução, saber se uma lista era originalmente uma `List<Integer>` ou uma `List<String>`, por exemplo.
- **Tipo de ponte**: Em classes genéricas que estendem outras classes ou implementam interfaces, o compilador pode precisar gerar métodos de "ponte" para manter a polimorfia.
- **Não pode usar tipos primitivos com genéricos**: Como o tipo é apagado para Object, você não pode usar tipos primitivos (como int, long, double) com genéricos, pois eles não são subtipos de Object.
- **Reflexão**: A informação de tipo apagada pode tornar certas operações de reflexão mais complexas ou impossíveis.

O apagamento de tipo é um mecanismo fundamental para entender como os genéricos funcionam em Java e como eles são implementados no nível do compilador e do runtime.
