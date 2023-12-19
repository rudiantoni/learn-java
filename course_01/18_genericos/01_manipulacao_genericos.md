# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Manipulação de genéricos
[[Home - Curso 1]](../../README.md#curso-1)<br />

- (se existir diretório de arquivos com documentos, etc) Diretório de arquivos: [folder_name-nn_arquivos](folder_link)
- (se existir homework) Homework
  - [Arquivo: file_name_no_extension](file_link)
  - [content_title](content_link)
  - ...
- Projetos
  - [Projeto 1](./01_arquivos/proj_01/GenericsDemo/) [(iniciado em)](#para-que-precisamos-de-generics)
  - ...
- (se existir exercícios) Exercícios
  - [Exercício N](folder_link-exercicio_nn) ([enunciado](#statement_content_link))
  - ...
- Conteúdo
  - []()
  - ...

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

- Ver projeto: [Projeto 1](./01_arquivos/proj_01/GenericsDemo/)

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

#### Apagamento de tipo (type erasure)

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

### (nome do vídeo, aula, etc)
[[Topo]](#)<br />



### (nome do vídeo, aula, etc)
[[Topo]](#)<br />



### (nome do vídeo, aula, etc)
[[Topo]](#)<br />



### (nome do vídeo, aula, etc)
[[Topo]](#)<br />



### (nome do vídeo, aula, etc)
[[Topo]](#)<br />



### (nome do vídeo, aula, etc)
[[Topo]](#)<br />



### (nome do vídeo, aula, etc)
[[Topo]](#)<br />



### (nome do vídeo, aula, etc)
[[Topo]](#)<br />



### (nome do vídeo, aula, etc)
[[Topo]](#)<br />


Se homework:
- Ver homework: [file_name_no_extension](file_link)
Se projeto:
- Ver projeto: [Projeto N](folder_link-proj_nn)

Lista ordenada
1. Lista item 1
2. Lista item 2
3. Lista item 3

Lista desordenada
- Lista item 1
- Lista item 2
- Lista item 3

`linha de codigo`

Bloco de código

```
bloco de código {

}
```

Se exercício:
> Exercício N ((nome do vídeo, aula, etc)): [caminho](pasta_exercicio-exercicio_nn)

Enunciado de pesquisa:
- Para Que Precisamos de Generics
- Generics em Java
- Operador Diamond
- Como os Generics Funcionam
- Método Generic
- Classe Generic
- Genérics Limitados
- Limites Múltiplos
- Coringas (Wildcards)
- Coringas Com Limite Superior (Upper Bounded Wildcard)
- Coringas Com Limite Inferior (Lower Bounded Wildcard)
- Tipos Brutos (Raw Types)
- Apagamento de Tipo (Type Erasure)