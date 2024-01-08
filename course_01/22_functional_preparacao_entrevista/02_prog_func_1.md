# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Programação funcional parte 1: Perguntas e respostas
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Conteúdo
  - [Perguntas e respostas](#perguntas-e-respostas)

### Perguntas e respostas
[[Topo]](#)<br />

**QUAL É A ESTRUTURA DE UMA EXPRESSÃO LAMBDA?**

A expressão lambda tem a seguinte estrutura:

- (params do método) -> {corpo da expressão lambda}

Onde:

- params do método - uma lista de parâmetros de entrada separados por vírgulas (se houver mais de um parâmetro, eles são colocados entre parênteses).
- operador "->" - serve como um separador entre a lista de parâmetros do nosso método e o corpo em que sua implementação ocorre.
- corpo da expressão lambda - corpo do método, consistindo de uma ou mais expressões cercadas por chaves.

**A QUAIS VARIÁVEIS AS EXPRESSÕES LAMBDA TÊM ACESSO?**

As expressões lambda têm acesso às variáveis do escopo no qual são definidas. Mas o acesso é possível apenas se as variáveis forem efetivamente finais, ou seja, ou explicitamente têm o modificador final, ou no caso de não mudarem seu valor após a inicialização, se a variável receber um valor pela segunda vez, a expressão lambda causa um erro de compilação.

**O QUE SÃO REFERÊNCIAS DE MÉTODOS?**

Referências de métodos são expressões lambda compactas que permitem passar referências a métodos ou construtores. Para fazer isso, use a palavra-chave "::".

Métodos de referência implementam uma sintaxe útil para se referir a métodos ou construtores existentes de classes Java ou objetos (instâncias). Juntamente com expressões lambda, métodos de referência tornam construções de linguagem compactas e concisas, tornando-as padronizadas.


**QUAIS TIPOS DE REFERÊNCIAS A MÉTODOS VOCÊ CONHECE?**

Existem três tipos de referências a métodos:

Referência a um método estático (ContainingClass::staticMethodName)

Referência a um método de objeto concreto (containingObject::instanceMethodName)

Referência a construtor (ClassName::new), para genéricos (generics) Class<T>::new.

**EXPLIQUE A EXPRESSÃO System.out::println**

A expressão System.out::println é uma referência ao método estático println do objeto out da classe System, que é equivalente à expressão lambda x -> System.out.println(x).

**O QUE SÃO INTERFACES FUNCIONAIS?**

Uma interface funcional é aquela que define exatamente um método abstrato.

O Java 8 introduziu uma nova anotação @FunctionalInterface para marcar uma interface como funcional, esta anotação é usada para evitar a adição acidental de métodos abstratos a uma interface funcional. Não é obrigatório, mas é uma boa prática de codificação.

Interfaces funcionais nos permitem usar expressões lambda para instanciar tais interfaces.

O melhor exemplo de uma interface funcional seria a interface java.lang.Runnable com um único método abstrato run(). Observe que uma interface pode incluir qualquer número de métodos padrão ou estáticos e ainda ser funcional, pois métodos padrão e estáticos não são abstratos.

**O QUE SÃO STREAMS NO JAVA?**

java.util.stream - introduzido para apoiar a paralelização de cálculos em streams. Fornece a capacidade de processar uma sequência de elementos executando uma ou mais operações, que podem ser realizadas sequencialmente ou em paralelo. Streams são divididos em seriais e paralelos. O maior benefício disso é ao trabalhar com coleções.

Operações em um stream são ou intermediárias ou terminais. Todas as operações intermediárias retornam um stream, então podemos combinar várias operações intermediárias sem usar ponto e vírgula. Operações terminais retornam void ou um resultado não-stream.

**PARA QUE SERVE O MÉTODO COLLECT?**

A maioria das operações da classe Stream que modificam um conjunto de dados retorna esse conjunto como um stream. No entanto, há situações em que você gostaria de receber dados não como um stream, mas como uma coleção regular, por exemplo, ArrayList ou HashSet. E para isso, a classe Stream tem um método collect. O método recebe como parâmetro uma função de conversão para uma coleção:

```java
<R,A> R collect(Collector<? super T,A,R> collector)
```

O parâmetro R representa o tipo de resultado do método, o parâmetro T é o tipo do elemento no stream, e o parâmetro A é o tipo dos dados acumulados intermediários. Como resultado, o parâmetro collector representa a função de conversão do stream em uma coleção.

**QUAL É A DIFERENÇA ENTRE UMA COLEÇÃO E UM STREAM?**

A diferença entre uma Coleção (Collection) de dados e um stream (Stream) do novo JDK8 é que coleções permitem que você trabalhe com elementos individualmente, enquanto um stream (Stream) não. Por exemplo, com coleções, você pode adicionar itens, remover itens e inserir no meio. Um Stream não permite que você manipule elementos individuais de um conjunto de dados, mas permite que você execute funções nos dados como um todo.

**PARA QUE SERVE O MÉTODO FOREACH EM STREAMS?**

Método void forEach(Consumer<? super T> action) - a ação é realizada para cada elemento. forEach é uma operação terminal, usada para iterar sobre cada elemento do stream.

forEach não garante a sequência de exibição de elementos em um stream paralelo, para isso o método forEachOrdered é usado - ele garante a ordem.

**PARA QUE SERVE O MÉTODO MAP EM STREAMS?**

Método `<R> Stream<R> map(Function<? super T,? extends R> mapper)` - converte elementos do tipo T em elementos do tipo R e retorna um stream com elementos de R.

map() é uma operação intermediária, o método é usado para converter elementos para outro objeto usando a função passada.

**QUAL É O PROPÓSITO DO MÉTODO FILTER EM STREAMS?**

Método `Stream<T> filter(Predicate<? super T> predicate)` - filtra elementos de acordo com a condição no predicado. filter é uma operação intermediária, usada para filtrar um array por meio de uma função.

Na verdade, filter não realiza a filtragem, em vez disso, cria um novo stream, que, quando concluído, contém os elementos do stream original que correspondem ao predicado dado.

**PARA QUE SERVE O MÉTODO LIMIT EM STREAMS?**

Método `Stream<T> limit(long maxSize)` - deixa apenas maxSize elementos no stream. limit é uma operação intermediária, usada para buscar os primeiros maxSize elementos do stream. Este método também retorna um stream modificado que não tem mais de maxSize elementos.

**PARA QUE SERVE O MÉTODO SORTED EM STREAMS?**

O método `Stream<T> sorted()/Stream<T> sorted(Comparator<? super T> comparator)` retorna um stream ordenado. sorted() é uma operação intermediária, um método usado para ordenar um stream usando a ordem natural de comparação de seus elementos. Há também um segundo método sorted() que aceita uma instância de Comparable ou sua expressão lambda correspondente.

**PROCESSAMENTO PARALELO DE STREAM NO JAVA?**

Para tornar um stream serial normal paralelo, chame o método parallel no objeto Stream.

Alternativamente, você também pode usar o método parallelStream() da interface Collection para criar um stream paralelo a partir de uma coleção.

Ao mesmo tempo, se a máquina de trabalho não for multi-core, então a thread será executada como serial.
