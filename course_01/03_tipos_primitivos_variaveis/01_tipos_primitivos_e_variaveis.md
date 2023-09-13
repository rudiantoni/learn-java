# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

# Tipos Primitivos e Variáveis
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [01_arquivos](./01_arquivos/)
- Homework
  - [Arquivo: HW - Primitive Types](./01_arquivos/homework/HW%20-%20Primitive%20Types.pdf)
  - [Homework: Palavras-chave do Java](#homework-palavras-chave-do-java)
  - [Homework: Conversões e promoções](#homework-conversões-e-promoções)
- Projetos
  - [Projeto 1](./01_arquivos/proj_01/) [(iniciado em)](#variáves)
- Conteúdo
  - [Quais tipos de dados existem em Java?](#quais-tipos-de-dados-existem-em-java)
  - [Tipos primitivos](#tipos-primitivos)
  - [Variáves](#variáves)

### Quais tipos de dados existem em Java?
[[Topo]](#)<br />

Existem 2 grupos principais de tipos de dados em Java: os *primitive types* e os *reference types*.

**Primitive Types**
- Integers
- Números Floating-point
- Booleans
- Characters

**Reference Types**
- Classes
- Annotations
- Interfaces
- Enumerations
- Arrays

A principal diferença é que os tipos primitivos armazenam um valor, e os tipos de referência armazenam um endereço de um objeto a que ele se refere.

### Tipos primitivos
[[Topo]](#)<br />

| Tipo | Tamanho | Valor mínimo | Valor máximo | Tipo encapsulador |
|---|---|---|---|---|
| Integers |  |  |  |  |
| byte | 1 byte | -128 | 127 | Byte |
| short | 2 bytes | -2^15 (-32768) | -2^15 -1(-32767) | Short |
| int | 4 bytes | -2^31 (-2147483648) | -2^31 (-2147483647) | Integer |
| long | 8 bytes | -2^63 (-9223372036854755808) | -2^63 (-9223372036854755807) | Long |
| Floating-Point |  |  |  |  |
| float | 4 bytes | Nota 1 | Nota 1 | Float |
| double | 8 bytes | Nota 2 | Nota 2 | Double |
| Boolean |  |  |  |  |
| boolean | Dependente da máquina virtual | false | true | Boolean |
| Characters |  |  |  |  |
| char | 2 bytes | 0 | 65535 | Character |
- *Nota 1*: Aproximadamente +- 3.40282347e+38F (6 - 7 dígitos decimais significativos). Java implemente o padrão Float IEEE 754.
- *Nota 2*: Aproximadamente +- 1.79769313486231570e+308 (15 dígitos decimais significativos).

### Variáves
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./01_arquivos/proj_01/)

Java é uma linguagem fortemente tipada (strongly typed)

- Cada variável tem um tipo
- Cada expressão tem um tipo
- Cada tipo é extritamente definido

- Uma variávei em Java é uma parte da memória que pode conter um valor
- Java é uma linguagem fortemente tipada: Cada variável tem um tipo
- Uma variável é definida pela combinação entre um identificador e um tipo
- *Para Java >= 10*: Você pode declarar uma variável com a palavra chave *var* - neste caso o tipo da variável será definido pelo compilador.
- Todas as variáveis têm um escopo, o qual define a sua visibilidade.
- Você não pode nomear uma variável com uma palavra-chave Java.

### Homework: Palavras-chave do Java

- Ver homework: [HW - Primitive Types.pdf](./01_arquivos/homework/HW%20-%20Primitive%20Types.pdf)
- Ver na wikipédia: https://en.wikipedia.org/wiki/List_of_Java_keywords

Na linguagem de programação Java, uma palavra-chave é qualquer uma das 48 palavras reservadas que têm um significado predefinido na linguagem. Devido a isso, os programadores não podem usar palavras-chave em alguns contextos, como nomes de variáveis, métodos, classes ou como qualquer outro identificador. Dessas 67 palavras-chave, 16 delas são apenas contextualmente reservadas e às vezes podem ser usadas como identificadores, ao contrário das palavras reservadas padrão. Devido às suas funções especiais na linguagem, a maioria dos ambientes de desenvolvimento integrado para Java usa destaque de sintaxe para exibir palavras-chave em uma cor diferente para fácil identificação.

#### Lista de palavras-chave

**_**: Adicionado no Java 9, o sublinhado se tornou uma palavra-chave e não pode mais ser usado como nome de variável.

**abstract**: Um método sem definição deve ser declarado como abstrato e a classe que o contém também deve ser declarada como abstrata. Classes abstratas não podem ser instanciadas. Métodos abstratos devem ser implementados nas subclasses. A palavra-chave "abstract" não pode ser usada com variáveis ou construtores. Note que uma classe abstrata não é obrigada a ter um método abstrato.

**assert** (adicionado no J2SE 1.4): O "assert" descreve um predicado (uma afirmação verdadeira-falsa) colocado em um programa Java para indicar que o desenvolvedor acredita que o predicado é sempre verdadeiro naquele ponto. Se uma afirmação avaliar como falsa em tempo de execução, ocorre uma falha na afirmação, o que geralmente causa a interrupção da execução. As asserções estão desativadas por padrão em tempo de execução, mas podem ser habilitadas por meio de uma opção de linha de comando ou programaticamente por meio de um método no carregador de classes.

**boolean**: Define uma variável booleana para os valores "verdadeiro" ou "falso" apenas. Por padrão, o valor do tipo primitivo booleano é falso. Essa palavra-chave também é usada para declarar que um método retorna um valor do tipo primitivo booleano.

**break**: Usado para encerrar a execução no corpo do loop atual. Usado para sair de um bloco "switch".

**byte**: A palavra-chave "byte" é usada para declarar um campo que pode conter um número inteiro de 8 bits com complemento de dois. Essa palavra-chave também é usada para declarar que um método retorna um valor do tipo primitivo "byte".

**case**: Uma declaração no bloco "switch" pode ser rotulada com um ou mais rótulos "case" ou "default". A instrução "switch" avalia sua expressão e, em seguida, executa todas as instruções que seguem o rótulo "case" correspondente; consulte "switch".

**catch**: Usado em conjunto com um bloco "try" e, opcionalmente, um bloco "finally". As instruções no bloco "catch" especificam o que fazer se um tipo específico de exceção for lançado pelo bloco "try".

**char**: Define uma variável de caractere capaz de armazenar qualquer caractere do conjunto de caracteres do arquivo-fonte Java.

**class**: Um tipo que define a implementação de um tipo específico de objeto. A definição de uma classe define campos de instância e de classe, métodos e classes internas, além de especificar as interfaces que a classe implementa e a superclasse imediata da classe. Se a superclasse não for explicitamente especificada, a superclasse será implicitamente "Object". A palavra-chave "class" também pode ser usada na forma "Class.class" para obter um objeto de classe sem precisar de uma instância dessa classe. Por exemplo, "String.class" pode ser usado em vez de criar uma nova instância de "String().getClass()".

**const**: Não utilizado, mas reservado.

**continue**: Usado para retomar a execução no final do corpo do loop atual. Se seguido por um rótulo, "continue" retoma a execução no final do corpo do loop rotulado.

**default**: A palavra-chave "default" pode ser usada opcionalmente em uma instrução "switch" para rotular um bloco de instruções a ser executado se nenhum caso corresponder ao valor especificado; consulte "switch". Alternativamente, a palavra-chave "default" também pode ser usada para declarar valores padrão em uma anotação Java. A partir do Java 8, a palavra-chave "default" pode ser usada para permitir que uma interface forneça uma implementação de um método.

**do**: A palavra-chave "do" é usada em conjunto com "while" para criar um loop "do-while", que executa um bloco de instruções associado ao loop e, em seguida, testa uma expressão booleana associada ao "while". Se a expressão avaliar como verdadeira, o bloco será executado novamente; isso continua até que a expressão avalie como falsa.

**double**: A palavra-chave "double" é usada para declarar uma variável que pode armazenar um número de ponto flutuante IEEE 754 de precisão dupla de 64 bits. Essa palavra-chave também é usada para declarar que um método retorna um valor do tipo primitivo "double".

**else**: A palavra-chave "else" é usada em conjunto com "if" para criar uma instrução "if-else", que testa uma expressão booleana; se a expressão avaliar como verdadeira, as instruções associadas ao "if" são executadas; se avaliar como falsa, as instruções associadas ao "else" são executadas.

**enum** (adicionado no J2SE 5.0): Uma palavra-chave do Java usada para declarar um tipo enumerado. Enumerações estendem a classe base "Enum".

**extends**: Usado em uma declaração de classe para especificar a superclasse; usado em uma declaração de interface para especificar uma ou mais superinterfaces. A classe X estende a classe Y para adicionar funcionalidade, seja adicionando campos ou métodos à classe Y, ou substituindo métodos da classe Y. Uma interface Z estende uma ou mais interfaces adicionando métodos. A classe X é considerada uma subclasse da classe Y; a interface Z é considerada uma subinterface das interfaces que ela estende. Também é usado para especificar um limite superior em um tipo de parâmetro em Generics.

**final**: Define uma entidade uma vez que não pode ser alterada nem derivada posteriormente. Mais especificamente: uma classe final não pode ser subclassificada, um método final não pode ser substituído e uma variável final pode ocorrer no máximo uma vez como uma expressão à esquerda em um comando executado. Todos os métodos em uma classe final são implicitamente finais.

**finally**: Usado para definir um bloco de instruções para um bloco definido anteriormente pela palavra-chave "try". O bloco "finally" é executado após a saída do bloco "try" e quaisquer cláusulas "catch", independentemente de uma exceção ter sido lançada ou capturada, ou de a execução ter deixado o método no meio das cláusulas "try" ou "catch" usando a palavra-chave "return".

**float**: A palavra-chave "float" é usada para declarar uma variável que pode armazenar um número de ponto flutuante IEEE 754 de precisão única de 32 bits. Essa palavra-chave também é usada para declarar que um método retorna um valor do tipo primitivo "float".

**for**: A palavra-chave "for" é usada para criar um loop "for", que especifica uma inicialização de variável, uma expressão booleana e uma incrementação. A inicialização da variável é realizada primeiro, e então a expressão booleana é avaliada. Se a expressão avaliar como verdadeira, as instruções associadas ao loop são executadas e, em seguida, a incrementação é realizada. A expressão booleana é avaliada novamente; isso continua até que a expressão avalie como falsa. A partir do J2SE 5.0, a palavra-chave "for" também pode ser usada para criar um "enhanced for loop", que especifica um array ou um objeto Iterable; cada iteração do loop executa o bloco de instruções associado a um elemento diferente no array ou Iterable.

**goto**: Não utilizado, mas reservado.

**if**: A palavra-chave "if" é usada para criar uma instrução "if", que testa uma expressão booleana; se a expressão avaliar como verdadeira, as instruções associadas à instrução "if" são executadas. Essa palavra-chave também pode ser usada para criar uma instrução "if-else"; consulte "else".

**implements**: Incluído em uma declaração de classe para especificar uma ou mais interfaces implementadas pela classe atual. Uma classe herda os tipos e métodos abstratos declarados pelas interfaces.

**import**: Usado no início de um arquivo-fonte para especificar classes ou pacotes inteiros do Java que podem ser referenciados posteriormente sem incluir seus nomes de pacote na referência. Desde o J2SE 5.0, as declarações "import" podem importar membros estáticos de uma classe.

**instanceof**: Um operador binário que aceita uma referência de objeto como seu primeiro operando e uma classe ou interface como seu segundo operando, e produz um resultado booleano. O operador "instanceof" avalia como verdadeiro se e somente se o tipo de tempo de execução do objeto for compatível com a classe ou interface.

**int**: A palavra-chave "int" é usada para declarar uma variável que pode armazenar um número inteiro de 32 bits com complemento de dois. Essa palavra-chave também é usada para declarar que um método retorna um valor do tipo primitivo "int".

**interface**: Usada para declarar um tipo especial de classe que contém apenas métodos abstratos ou métodos padrão, campos constantes (estáticos finais) e interfaces estáticas. Pode posteriormente ser implementada por classes que declaram a interface com a palavra-chave "implements". Como a múltipla herança não é permitida no Java, as interfaces são usadas para contorná-la. Uma interface pode ser definida dentro de outra interface.

**long**: A palavra-chave "long" é usada para declarar uma variável que pode armazenar um número inteiro de 64 bits com complemento de dois. Essa palavra-chave também é usada para declarar que um método retorna um valor do tipo primitivo "long".

**native**: Usada em declarações de método para especificar que o método não é implementado no mesmo arquivo-fonte Java, mas sim em outra linguagem

**new**: Usado para criar uma instância de uma classe ou objeto de array. Usar a palavra-chave para esse fim não é totalmente necessário (como exemplificado pelo Scala), embora ela tenha dois propósitos: permite a existência de namespaces diferentes para nomes de métodos e classes, define estaticamente e localmente que um novo objeto foi criado e de que tipo de tempo de execução ele é (introduzindo possivelmente uma dependência no código).

**package**: Um pacote Java é um grupo de classes e interfaces semelhantes. Os pacotes são declarados com a palavra-chave "package".

**private**: A palavra-chave "private" é usada na declaração de um método, campo ou classe interna; membros privados só podem ser acessados por outros membros de sua própria classe.

**protected**: A palavra-chave "protected" é usada na declaração de um método, campo ou classe interna; membros protegidos só podem ser acessados por membros de sua própria classe, subclasses dessa classe ou classes do mesmo pacote.

**public**: A palavra-chave "public" é usada na declaração de uma classe, método ou campo; classes, métodos e campos públicos podem ser acessados por membros de qualquer classe.

**return**: Usado para encerrar a execução de um método. Pode ser seguido por um valor exigido pela definição do método, que é retornado ao chamador.

**short**: A palavra-chave "short" é usada para declarar um campo que pode conter um número inteiro de 16 bits com complemento de dois. Essa palavra-chave também é usada para declarar que um método retorna um valor do tipo primitivo "short".

**static**: Usado para declarar um campo, método ou classe interna como campo de classe. As classes mantêm uma única cópia de campos de classe, independentemente de quantas instâncias dessa classe existam. "Static" também é usado para definir um método como método de classe. Métodos de classe estão vinculados à classe em vez de a uma instância específica e só podem operar em campos de classe. Classes e interfaces declaradas como membros estáticos de outra classe ou interface são, na verdade, classes de nível superior e não classes internas.

**super**: A herança é basicamente usada para alcançar a ligação dinâmica ou o polimorfismo em tempo de execução em Java. Usada para acessar membros de uma classe herdada pela classe em que aparece. Permite que uma subclasse acesse métodos substituídos e membros ocultos de sua superclasse. A palavra-chave "super" também é usada para encaminhar uma chamada de um construtor para um construtor na superclasse. Também é usada para especificar um limite inferior em um tipo de parâmetro em Generics.

**switch**: A palavra-chave "switch" é usada em conjunto com "case" e "default" para criar uma instrução "switch", que avalia uma variável, corresponde seu valor a um caso específico e executa o bloco de instruções associado a esse caso. Se nenhum caso corresponder ao valor, o bloco opcional rotulado como "default" é executado, se estiver incluído

**synchronized**: Usada na declaração de um método ou bloco de código para adquirir o bloqueio do mutex para um objeto enquanto a thread atual executa o código. Para métodos estáticos, o objeto bloqueado é a Classe da classe. Garante que, no máximo, uma thread por vez operando no mesmo objeto executa esse código. O bloqueio do mutex é liberado automaticamente quando a execução sai do código sincronizado. Campos, classes e interfaces não podem ser declarados como sincronizados.

**this**: Usado para representar uma instância da classe em que aparece. "this" pode ser usado para acessar membros da classe e como uma referência à instância atual. A palavra-chave "this" também é usada para encaminhar uma chamada de um construtor para outro construtor na mesma classe.

**throw**: Faz com que a instância de exceção declarada seja lançada. Isso faz com que a execução continue com o primeiro manipulador de exceção circundante declarado pela palavra-chave "catch" para lidar com um tipo de exceção compatível com a atribuição. Se nenhum manipulador de exceção desse tipo for encontrado no método atual, o método retorna e o processo é repetido no método de chamada. Se nenhum manipulador de exceção for encontrado em qualquer chamada de método na pilha, a exceção é passada para o manipulador de exceção não capturada da thread.

**throws**: Usado em declarações de método para especificar quais exceções não são tratadas dentro do método, mas sim passadas para o próximo nível mais alto do programa. Todas as exceções não capturadas em um método que não são instâncias de RuntimeException devem ser declaradas usando a palavra-chave "throws".

**transient**: Declara que um campo de instância não faz parte da forma serializada padrão de um objeto. Quando um objeto é serializado, apenas os valores de seus campos não-transientes de instância são incluídos na representação serializada padrão. Quando um objeto é desserializado, os campos transitórios são inicializados apenas com seu valor padrão. Se a forma padrão não for usada, por exemplo, quando uma tabela serialPersistente é declarada na hierarquia de classes, todas as palavras-chave "transient" são ignoradas.

**try**: Define um bloco de instruções que têm tratamento de exceção. Se uma exceção for lançada dentro do bloco "try", um bloco "catch" opcional pode lidar com os tipos de exceção declarados. Além disso, um bloco "finally" opcional pode ser declarado e será executado quando a execução sair do bloco "try" e das cláusulas "catch", independentemente de uma exceção ter sido lançada ou não. Um bloco "try" deve ter pelo menos uma cláusula "catch" ou um bloco "finally".

**void**: A palavra-chave "void" é usada para declarar que um método não retorna nenhum valor.

**volatile**: Usada em declarações de campo para garantir a visibilidade de alterações em variáveis entre threads. Cada leitura de uma variável volátil será feita na memória principal e não na cache da CPU, e cada gravação em uma variável volátil será escrita na memória principal, e não apenas na cache da CPU. Métodos, classes e interfaces não podem ser declarados como voláteis, nem variáveis locais ou parâmetros.

**while**: A palavra-chave "while" é usada para criar um loop "while", que testa uma expressão booleana e executa o bloco de instruções associado ao loop se a expressão avaliar como verdadeira; isso continua até que a expressão avalie como falsa. Essa palavra-chave também pode ser usada para criar um loop "do-while"; consulte "do".

#### Identificadores reservados
Os seguintes identificadores são palavras-chave contextuais e só são restritos em alguns contextos:

- **exports**
- **module**
- **non-sealed**: Usado para declarar que uma classe ou interface que estende uma classe selada pode ser estendida por classes desconhecidas.
- **open**
- **opens**
- **permits**: A cláusula "permits" especifica as classes que têm permissão para estender uma classe selada.
- **provides**
- **record**
- **requires**
- **sealed**: Uma classe ou interface selada só pode ser estendida ou implementada por classes e interfaces autorizadas a fazê-lo.
- **to**
- **transitive**
- **uses**
- **var**: Um identificador especial que não pode ser usado como nome de tipo (desde o Java 10).
- **with**
- **yield**: Usado para definir um valor para uma expressão "switch", ao usar grupos de declarações rotuladas (por exemplo, case L:).

#### Palavras reservadas para valores literais
- **true**: Um valor booleano literal
- **false**: Um valor booleano literal
- **null**: Uma valor de referência literal

#### Não utilizadas
- **const**: Mesmo sendo uma palavra reservada no Java, const não é utilizado e não há função. Para definir constantes no Java, veja a palavra chave final.
- **goto**: Mesmo sendo uma palavra reservada no Java, const não é utilizado e não há função.
- **strictfp**: Mesmo sendo uma palavra reservada no Java, strictfp está obsoleto, e não possui mais função. Anteriormente esta palavra-chave era usada para restringir a precisão e arredondamento em cálculos com pontos flutuantes para se certificar da portabilidade.

### Homework: Conversões e promoções

- Ver homework: [HW - Primitive Types.pdf](./01_arquivos/homework/HW%20-%20Primitive%20Types.pdf)
- Ver na Oracle: https://docs.oracle.com/javase/specs/jls/se7/html/jls-5.html

Cada expressão escrita na linguagem de programação Java possui um tipo que pode ser deduzido a partir da estrutura da expressão e dos tipos dos literais, variáveis e métodos mencionados na expressão. No entanto, é possível escrever uma expressão em um contexto onde o tipo da expressão não seja apropriado. Em alguns casos, isso leva a um erro na compilação. Em outros casos, o contexto pode ser capaz de aceitar um tipo relacionado ao tipo da expressão; como conveniência, em vez de exigir que o programador indique uma conversão de tipo explicitamente, a linguagem de programação Java realiza uma conversão implícita do tipo da expressão para um tipo aceitável para seu contexto circundante.

Uma conversão específica do tipo S para o tipo T permite que uma expressão do tipo S seja tratada, na compilação, como se tivesse o tipo T. Em alguns casos, isso exigirá uma ação correspondente em tempo de execução para verificar a validade da conversão ou para traduzir o valor em tempo de execução da expressão em uma forma apropriada para o novo tipo T.

#### Exemplo 5.0-1. Conversões em Tempo de Compilação e Tempo de Execução

> Uma conversão do tipo Object para o tipo Thread requer uma verificação em tempo de execução para garantir que o valor em tempo de execução seja realmente uma instância da classe Thread ou de uma de suas subclasses; se não for, uma exceção é lançada.<br />
> Uma conversão do tipo Thread para o tipo Object não requer nenhuma ação em tempo de execução; Thread é uma subclasse de Object, então qualquer referência produzida por uma expressão do tipo Thread é um valor de referência válido do tipo Object.<br />
> Uma conversão do tipo int para o tipo long requer a extensão de sinal em tempo de execução de um valor inteiro de 32 bits para a representação longa de 64 bits. Nenhuma informação é perdida.<br />
> Uma conversão do tipo double para o tipo long requer uma tradução não trivial de um valor de ponto flutuante de 64 bits para a representação inteira de 64 bits. Dependendo do valor real em tempo de execução, informações podem ser perdidas.

Em cada contexto de conversão, apenas conversões específicas são permitidas. Por conveniência na descrição, as conversões específicas possíveis na linguagem de programação Java são agrupadas em várias categorias amplas:

- Conversões de identidade
- Conversões primitivas de alargamento (widening)
- Conversões primitivas de estreitamento (narrowing)
- Conversões de referência de alargamento (widening)
- Conversões de referência de estreitamento (narrowing)
- Conversões de "boxing"
- Conversões de "unboxing"
- Conversões não verificadas
- Conversões de captura
- Conversões de strings
- Conversões de conjunto de valores

Existem cinco contextos de conversão nos quais a conversão de expressões pode ocorrer. Cada contexto permite conversões em algumas das categorias mencionadas acima, mas não em outras. O termo "conversão" também é usado para descrever o processo de escolher uma conversão específica para esse contexto. Por exemplo, dizemos que uma expressão que é um argumento real em uma chamada de método está sujeita a uma "conversão de chamada de método", o que significa que uma conversão específica será implicitamente escolhida para essa expressão de acordo com as regras para o contexto de argumento de chamada de método.

Um contexto de conversão é o operando de um operador numérico, como + ou *. O processo de conversão para tais operandos é chamado de promoção numérica. A promoção é especial porque, no caso de operadores binários, a conversão escolhida para um operando pode depender, em parte, do tipo da outra expressão do operando.

Este capítulo descreve primeiro as onze categorias de conversões, incluindo as conversões especiais para String permitidas para o operador de concatenação de strings +. Em seguida, são descritos os cinco contextos de conversão:
- Conversão de atribuição
- Conversão de chamada de método
- Conversão de "casting"
- Conversão de string
- Promoção numérica

#### Conversão de atribuição

A conversão de atribuição converte o tipo de uma expressão para o tipo de uma variável especificada.

A conversão de atribuição pode causar um OutOfMemoryError (como resultado da conversão "boxing"), uma NullPointerException (como resultado da conversão "unboxing") ou uma ClassCastException (como resultado de uma conversão não verificada) a ser lançada em tempo de execução.

#### Conversão de chamada de método

A conversão de chamada de método é aplicada a cada argumento em uma chamada de método ou construtor e, exceto em um caso, realiza as mesmas conversões que a conversão de atribuição.

A conversão de chamada de método pode causar um OutOfMemoryError (como resultado da conversão "boxing"), uma NullPointerException (como resultado da conversão "unboxing") ou uma ClassCastException (como resultado de uma conversão não verificada) a ser lançada em tempo de execução.

#### Conversão de "casting"

A conversão de "casting" converte o tipo de uma expressão para um tipo explicitamente especificado por um operador de "casting".

É mais inclusiva do que a conversão de atribuição ou chamada de método, permitindo qualquer conversão específica, exceto uma conversão de string, mas certos "casts" para um tipo de referência podem causar uma exceção em tempo de execução.

#### Conversão de string

A conversão de string se aplica apenas a um operando do operador binário + que não é uma String quando o outro operando é uma String.

A conversão de string pode causar um OutOfMemoryError (como resultado da criação de instância de classe) a ser lançada em tempo de execução.

#### Promoção numérica

A promoção numérica traz os operandos de um operador numérico para um tipo comum, de modo que uma operação possa ser realizada.

```java
class Test {   
  public static void main(String[] args) {
    // Uma conversão de casting de um literal float para o tipo int.
    // Sem o operador de cast, isto seria um erro em compilação,
    // porque é uma conversão de estreitamento
    int i = (int)12.5f;
    // Conversão de string do valor int de i.
    System.out.println("(int)12.5f==" + i);
    // Conversão de atribuição do valor de i para o tipo float.
    // Esta é uma conversão de alargamento.
    float f = i;
    // Conversão de string do valor float de f.
    System.out.println("after float widening: " + f);
    // Promoção numérica do valor de i para o tipo float.
    // Esta é uma promoção numérica binária.
    // Após a promoção, a operação é float * float.
    System.out.print(f);
    f = f * i;
    // Duas conversões de strings de i e f.
    System.out.println("*" + i + "==" + f);
    // Conversão de invocação de método do valor de f para o tipo double.
    // Necessário porque o método Math.sin aceita apenas um argumento double.
    double d = Math.sin(f);
    // Two string conversions of f and d:
    System.out.println("Math.sin(" + f + ")==" + d);
  }
}
```
