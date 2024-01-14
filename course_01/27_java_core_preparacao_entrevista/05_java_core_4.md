# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## 27.5. Java Core parte 4: Perguntas e respostas
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Conteúdo
  - [Perguntas e respostas](#perguntas-e-respostas)

### Perguntas e respostas
[[Topo]](#)<br />

**SOBRE A CLONAGEM DE OBJETOS: QUAL É A DIFERENÇA ENTRE CLONAGEM SUPERFICIAL E PROFUNDA?**

Para que um objeto seja clonável, ele deve implementar a interface Cloneable (marcadora). O uso desta interface afeta o comportamento do método "clone" da classe Object. Dessa forma, `myObj.clone()` criará um clone do nosso objeto, mas esse clone será superficial.

O que significa superficial? Significa que apenas os campos primitivos da classe são clonados, campos de referência não são clonados!

Para realizar a clonagem profunda, é necessário sobrescrever o método `clone()` na classe clonada e clonar os campos variáveis do objeto.

**REGRAS PARA REDEFINIÇÃO DO MÉTODO Object.clone()**

O método `clone()` em Java é usado para clonar objetos. Como o Java trabalha com objetos usando referências, uma simples atribuição não é suficiente, pois nesse caso apenas o endereço é copiado, e teríamos duas referências para o mesmo objeto, o que não é o desejado. O mecanismo de cópia é fornecido pelo método `clone()` da classe Object.

`clone()` age como um construtor de cópia. Normalmente, chama o método `clone()` da superclasse, e assim por diante, até chegar ao Object.

O método `clone()` da classe Object cria e retorna uma cópia do objeto com os mesmos valores de campo. `Object.clone()` lança `CloneNotSupportedException` se você estiver tentando clonar um objeto que não implementa a interface Cloneable. A implementação padrão do método `Object.clone()` realiza uma cópia superficial. Se você precisar de uma cópia completa/profunda (deep) de uma classe, então no método `clone()` desta classe, após obter um clone da superclasse, você precisa copiar os campos necessários.

Um dos inconvenientes do método `clone()` é o fato de que o tipo retornado é `Object`, então um downcast é necessário. No entanto, desde o Java 1.5, ao sobrescrever um método, você pode restringir o tipo de retorno.

**SOBRE clone() E CAMPOS FINAL**

O método `clone()` é incompatível com campos finais. Se você tentar clonar um campo final, o compilador irá impedir. A única solução é remover a finalidade do campo.

**ONDE E COMO VOCÊ PODE USAR UM CONSTRUTOR PRIVADO?**

Por exemplo, você precisa usar um construtor privado no padrão Singleton. Na mesma classe, cria-se um método estático onde uma instância da classe é criada, claro, se ela ainda não tiver sido criada, então ela é simplesmente retornada pelo método.

**O QUE É UM CONSTRUTOR PADRÃO?**

Em Java, se não houver construtores explicitamente definidos em uma classe, o compilador usa um construtor padrão implicitamente definido, que é semelhante a um construtor padrão "puro". O construtor padrão é uma construção bastante simples, que se resume a criar um construtor para um tipo sem parâmetros. Assim, por exemplo, se um construtor definido pelo usuário não for declarado ao declarar uma classe não estática (não importa se tem parâmetros ou não), o compilador gerará independentemente um construtor sem parâmetros. Alguns programadores explicitamente definem um construtor padrão por hábito para não esquecerem mais tarde, mas isso não é necessário.

Em Java, se a classe derivada não chamar explicitamente o construtor da classe base (em Java, usando `super()` na primeira linha), então o construtor padrão é implicitamente chamado. Se a classe base não tiver um construtor padrão, isso é considerado um erro.

**QUAL É A DIFERENÇA ENTRE final, finally E finalize?**

- **final**: Não se pode herdar de uma classe final. Não se pode sobrescrever o método final. Não se pode alterar o valor de um campo final.
- **finally**: Usado no tratamento de erros, sempre chamado mesmo que ocorra um erro (exceto `System.exit(0)`). Útil para liberar recursos.
- **finalize()**: A partir do Java 9, é um método obsoleto da classe Object. É chamado antes do coletor de lixo liberar a memória. Não é recomendado usá-lo para liberar recursos do sistema, pois não se sabe quando o coletor de lixo fará a limpeza. Em geral, poucas pessoas usam este método. A única coisa que você pode usar este método é para fechar um recurso que deve funcionar durante a duração do programa e fechar quando ele terminar. Você também pode usar o método para se proteger contra os chamados "erros bobos", verificando se os recursos estão liberados, se não, então fechá-los.

**DESCREVA A HIERARQUIA DE EXCEÇÕES**

Todas as classes de exceção estendem a classe Throwable, que é uma extensão direta da classe Object.

A classe Throwable e todas as suas extensões têm tradicionalmente dois construtores:
- Throwable() - construtor padrão;
- Throwable(String message) - o objeto criado conterá uma mensagem arbitrária.

A mensagem escrita no construtor pode ser recuperada usando o método `getMessage()`. Se o objeto foi criado pelo construtor padrão, então este método retornará `null`.

O método `toString()` retorna uma breve descrição do evento.

Três métodos imprimem mensagens sobre todos os métodos encontrados ao longo do caminho da "viagem" da exceção:
- `printStackTrace()` - imprime mensagens na saída padrão, geralmente o console;
- `printStackTrace(PrintStream stream)` - imprime mensagens no stream de bytes;
- `printStackTrace(PrintWriter stream)` - imprime mensagens no stream de caracteres.

A classe Throwable tem dois descendentes diretos, as classes Error e Exception. Eles não adicionam novos métodos, mas servem para separar as classes de exceção em duas grandes famílias - a família das classes de erro (error) e a família das próprias classes de exceção (exception).

As classes de erro que estendem a classe Error indicam situações difíceis na Máquina Virtual Java. Não é recomendado manipulá-las em um programa regular.

As classes de exceção que estendem a classe Exception marcam a ocorrência de uma situação anormal comum que pode e deve ser tratada. Tais exceções devem ser lançadas com o comando `throw`. Entre as classes de exceção, destaca-se a classe RuntimeException - uma extensão direta da classe Exception. Nela e em suas subclasses, são notadas exceções que ocorreram durante a operação da JVM, mas não são tão graves quanto os erros.

**QUAIS TIPOS DE EXCEÇÕES EM JAVA VOCÊ CONHECE, COMO ELAS DIFEREM?**

Todas as situações excepcionais podem ser divididas em duas categorias: verificadas (checked) e não verificadas (unchecked).

Exceções que descendem da classe Exception (e não são descendentes de RuntimeException) são verificáveis (checked). Ou seja, no momento da compilação, é verificado se o tratamento de possíveis exceções é fornecido. Geralmente, esses são erros relacionados ao ambiente do programa (rede, I/O de arquivos, etc.), que podem ocorrer independentemente de o código estar correto ou não.

Exceções lançadas a partir de RuntimeException são não verificáveis (unchecked) e não são obrigadas a serem tratadas pelo compilador. Geralmente, são erros de programação que não deveriam ocorrer se o código estivesse correto (por exemplo, IndexOutOfBoundsException, ArithmeticException). 

Exceções lançadas a partir de Error também não são verificadas. Elas destinam-se a notificar a aplicação sobre a ocorrência de uma situação fatal, que é quase impossível de eliminar programaticamente. São problemas geralmente irrecuperáveis no nível da JVM.

**O QUE É EXCEÇÃO VERIFICADA E NÃO VERIFICADA?**

Exceções verificadas (checked) são aquelas que devem ser tratadas pelo bloco catch ou descritas na assinatura do método. Exceções não verificadas (unchecked) podem não ser tratadas e declaradas.

Exceções não verificadas em Java são heranças de RuntimeException, enquanto as verificadas são heranças de Exception.

**COMO CRIAR SUA PRÓPRIA EXCEÇÃO NÃO VERIFICADA?**

Herdar de RuntimeException.

**DESCREVA O FUNCIONAMENTO DO BLOCO try-catch-finally**

Se um dos blocos catch for acionado, os blocos restantes neste construto try-catch não serão executados.

O bloco finally é executado mesmo em caso de erro no bloco catch, ou mesmo se não houver bloco catch. Há exceções quando o bloco finally não será executado até o fim, como por exemplo em chamadas ao `System.exit(0)` ou se o bloco finally fizer parte da execução de um thread daemon e o thread pai for interrompido.

**É POSSÍVEL USAR UM BLOCO try-finally (SEM catch)?**

Sim, try pode ser emparelhado com finally, sem catch. Funciona exatamente da mesma forma - após sair do bloco try, o bloco finally é executado. Isso pode ser útil, por exemplo, quando você precisa executar alguma ação ao sair do método.

**O BLOCO finally É SEMPRE EXECUTADO?**

Não sempre. Por exemplo, em situações como threads daemon (que fornecem serviços em segundo plano, mas não são parte integral do programa), o bloco finally não é executado se todos os threads não-daemon terminarem e o programa encerrar. Também não será executado se `System.exit(0)` for chamado ou se uma exceção ocorrer no bloco finally e não houver um manipulador para ela, fazendo com que o código restante no bloco finally possa não ser executado.
