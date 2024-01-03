# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

##  Visão geral: programação funcional
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Conteúdo
  - [Programação funcional](#programação-funcional)
  - [Vantagens e desvantagens](#vantagens-e-desvantagens)
  - [Programação imperativa vs programação declarativa](#programação-imperativa-vs-programação-declarativa)
  - [Função vs método](#função-vs-método)
  - [Programação funcional no Java](#programação-funcional-no-java)

### Programação funcional
[[Topo]](#)<br />

A programação funcional, no contexto do Java 8, é um paradigma de programação que enfatiza o uso de funções e imutabilidade dos dados. Diferente da programação orientada a objetos, que se concentra em objetos e suas interações, a programação funcional trata os cálculos principalmente como avaliação de funções matemáticas e evita mudar estados e dados mutáveis. Aqui estão alguns pontos chave da programação funcional no Java 8:

- **Funções como cidadãos de primeira classe**: Em programação funcional, as funções são tratadas como "cidadãos de primeira classe". Isso significa que as funções podem ser atribuídas a variáveis, passadas como argumentos e retornadas de outras funções, semelhante a qualquer outro valor ou objeto.
- **Expressões Lambda**: O Java 8 introduziu expressões lambda, que são essencialmente funções anônimas (funções sem nome) que podem ser usadas para implementar interfaces com um único método abstrato (SAM - Single Abstract Method) de uma maneira concisa. Por exemplo, `(a, b) -> a + b` é uma expressão lambda que recebe dois parâmetros e retorna sua soma.
- **Streams**: Streams são uma abstração que permite processar sequências de elementos (como coleções) de forma declarativa. Eles podem ser usados para realizar operações em dados de maneira funcional, como mapear, filtrar, reduzir, etc. Por exemplo, você pode transformar uma lista de números em seus quadrados e depois filtrar apenas os que são pares.
- **Imutabilidade**: Na programação funcional, é incentivado o uso de dados imutáveis. Isso significa que, uma vez que um objeto é criado, seu estado não pode ser alterado. Qualquer modificação leva à criação de um novo objeto. Isso reduz os efeitos colaterais e torna o código mais previsível e fácil de depurar.
- **Métodos de interface Default e Static**: O Java 8 também introduziu métodos default e static em interfaces, permitindo que as interfaces forneçam implementações concretas. Isso ajuda na criação de bibliotecas ricas e extensíveis, alinhando-se bem com conceitos funcionais.
- **Higher-order functions**: São funções que recebem outras funções como argumentos ou retornam uma função. Isso é facilitado pelas expressões lambda e pelas interfaces funcionais do Java 8.
- **Evitar efeitos colaterais**: Um aspecto importante da programação funcional é evitar efeitos colaterais, ou seja, mudanças de estado que ocorrem fora da função atual. Funções em programação funcional, idealmente, devem depender apenas dos argumentos passados a elas e não modificar estados externos.

Em resumo, a programação funcional no Java 8 traz um estilo de programação mais expressivo e eficiente, especialmente para operações em coleções e para lidar com concorrência de forma mais segura, aproveitando os benefícios da imutabilidade e das funções de alta ordem.

#### Conceitos

Os principais conceitos da programação funcional são fundamentais para entender como essa abordagem difere da programação imperativa ou orientada a objetos. Aqui estão os conceitos mais importantes:

- **Imutabilidade**: Em programação funcional, os dados são imutáveis. Uma vez criado um objeto ou estrutura de dados, ele não pode ser alterado. Qualquer modificação resulta em um novo objeto ou estrutura. Isso ajuda a evitar efeitos colaterais e torna o código mais previsível e fácil de manter.
- **Funções puras**: Uma função é considerada pura se satisfizer duas condições: não causa efeitos colaterais (como modificar variáveis globais ou estados fora de seu escopo) e seu retorno é determinado apenas pelos seus argumentos de entrada. Isso significa que dadas as mesmas entradas, a função sempre retornará o mesmo resultado.
- **Expressões Lambda e closures**: As expressões lambda são funções anônimas, que podem ser passadas em torno e usadas como qualquer outro valor. Closures são funções que podem capturar variáveis de seu ambiente de criação.
- **Funções de alta ordem (higher-order functions)**: Estas são funções que podem receber outras funções como argumentos ou que retornam uma função. Esse conceito é crucial para muitas operações em programação funcional, como mapeamento, redução e filtragem.
- **Avaliação preguiçosa (lazy evaluation)**: Em vez de calcular os resultados assim que são pedidos, a avaliação preguiçosa adia o cálculo até que o resultado seja estritamente necessário. Isso pode melhorar a eficiência do programa, evitando cálculos desnecessários.
- **Recursão**: Na programação funcional, a recursão é frequentemente usada em vez de laços (loops) para repetir operações. A recursão favorece a imutabilidade e a definição de funções puras.
- **Padrões de projeto funcional**: Diferentemente dos padrões de projeto orientados a objetos, a programação funcional tem seus próprios padrões, como funtores, monads e applicatives, que ajudam a lidar com composição de funções, operações assíncronas e manipulação de erros.
- **Transparência referencial**: Este conceito diz que uma expressão pode ser substituída pelo seu valor sem alterar o comportamento do programa. Isso é uma consequência direta do uso de funções puras e imutabilidade.
- **Composição de funções**: Na programação funcional, as funções podem ser compostas para criar novas funções. Composição de funções é o processo de combinar duas ou mais funções para formar uma nova função.
- **Tipagem funcional**: Embora não seja exclusivo da programação funcional, esse paradigma frequentemente enfatiza um sistema de tipos forte e estático, o que ajuda a evitar erros e facilita o raciocínio sobre o código.

Esses conceitos são fundamentais na programação funcional e ajudam a criar códigos que são mais concisos, fáceis de testar e menos propensos a erros em comparação com a programação imperativa ou orientada a objetos.

### Vantagens e desvantagens
[[Topo]](#)<br />

A programação funcional, como qualquer outro paradigma de programação, tem suas vantagens e desvantagens. É importante entender esses aspectos para determinar quando a aplicação desse paradigma é mais apropriada.

#### Vantagens

- **Facilidade de teste e depuração**: Devido à natureza das funções puras e à imutabilidade, é mais fácil testar e depurar programas funcionais. Como as funções puras são independentes de estados externos, cada função pode ser testada isoladamente.
- **Menos efeitos colaterais**: A imutabilidade e o uso de funções puras ajudam a evitar mudanças de estado não intencionais e outros efeitos colaterais, tornando o código mais estável e previsível.
- **Facilidade de paralelização**: Programas funcionais são mais fáceis de paralelizar devido à ausência de efeitos colaterais. Isso é particularmente útil em sistemas com múltiplos processadores ou em ambientes de computação distribuída.
- **Código conciso e expressivo**: A programação funcional frequentemente leva a um código mais conciso e expressivo. Construções como expressões lambda e streams em Java 8 facilitam a escrita de operações complexas em poucas linhas de código.
- **Reusabilidade e composição de funções**: A capacidade de compor funções de maneira simples e a reusabilidade das funções são características fortes da programação funcional.
- **Ordenação de operações facilitada**: A avaliação preguiçosa e outros conceitos funcionais facilitam o gerenciamento da ordem de operações, o que pode melhorar a eficiência do programa.

#### Desvantagens

- **Curva de aprendizado**: A programação funcional pode ser menos intuitiva para quem está acostumado apenas com a programação imperativa ou orientada a objetos. Seus conceitos, como imutabilidade e funções de alta ordem, podem ser difíceis de entender inicialmente.
- **Performance**: Dependendo do caso, a programação funcional pode levar a um uso mais intenso de memória (devido à criação de muitos objetos imutáveis) e a uma performance inferior em algumas operações quando comparada com a abordagem imperativa, especialmente em linguagens que não foram originalmente projetadas para o paradigma funcional.
- **Verbosidade em códigos complexos**: Enquanto a programação funcional pode tornar o código mais conciso, ela também pode levar a uma maior complexidade e verbosidade em certas situações, especialmente em operações que são mais naturalmente expressas de forma imperativa.
- **Integração com códigos imperativos**: Integrar código funcional em sistemas existentes baseados em paradigmas imperativos ou orientados a objetos pode ser desafiador, tanto em termos de compatibilidade quanto de desempenho.
- **Recursão e gerenciamento de memória**: A programação funcional se apoia fortemente em recursão, que pode levar a problemas de estouro de pilha e uso ineficiente de memória se não for bem gerenciada ou otimizada (como pela técnica de recursão de cauda).
- **Escassez de recursos e comunidade**: Embora esteja crescendo, a comunidade de programação funcional e os recursos de aprendizagem podem ser mais limitados em comparação com paradigmas mais estabelecidos, como a programação orientada a objetos.

Em resumo, a programação funcional oferece vantagens significativas, principalmente em termos de simplicidade, testabilidade e paralelização. No entanto, esses benefícios vêm com desafios, incluindo uma curva de aprendizado íngreme e questões de desempenho em determinados contextos. A escolha de usar programação funcional deve ser baseada na natureza do projeto, na experiência da equipe e nos requisitos específicos do sistema.

### Programação imperativa vs programação declarativa
[[Topo]](#)<br />

A programação imperativa e a programação declarativa são dois paradigmas fundamentais que oferecem abordagens distintas para o desenvolvimento de software. Ambos têm suas características, vantagens e desvantagens. Entender essas diferenças é crucial para escolher a abordagem mais adequada para um determinado problema.

#### Programação imperativa

##### Conceito

A programação imperativa é baseada em uma sequência de comandos para o computador executar. Neste paradigma, o foco é no "como" realizar as operações: o programador escreve código que especifica passo a passo os procedimentos necessários para alcançar o resultado desejado.

##### Características

- **Controle de estado**: A programação imperativa gerencia ativamente o estado do programa. Ela modifica frequentemente variáveis e usa estruturas de controle como laços e condicionais.
- **Instruções sequenciais**: O código é geralmente escrito em uma série de instruções que são executadas na ordem em que aparecem.
- **Abordagem procedural ou orientada a objetos**: Comumente se enquadra em paradigmas como programação procedural ou orientada a objetos.
- **Exemplos**: Linguagens como C, C++, Java (quando usada de forma não funcional) e Python são frequentemente usadas de maneira imperativa.

#### Programação declarativa

##### Conceito

A programação declarativa, por outro lado, foca no "o que" deve ser feito, em vez de como. O programador especifica o resultado desejado, e o computador determina como alcançá-lo. Em outras palavras, a programação declarativa abstrai o fluxo de controle e deixa a lógica de execução para a própria linguagem ou ambiente de execução.

##### Características

- **Abstração de controle**: Menos preocupação com o controle de fluxo e mais com a definição de lógica e regras.
- **Expressões ao invés de comandos**: O código tende a ser mais expressivo e próximo da linguagem natural ou matemática.
- **Imutabilidade**: Mudanças de estado são frequentemente evitadas ou gerenciadas de maneira mais controlada.
- **Exemplos de paradigmas**: Programação funcional (como em Haskell ou em aspectos do JavaScript e Scala) e programação lógica (como em Prolog).
- **Exemplos**: SQL para consulta de bases de dados e HTML para definição de estruturas de páginas web são exemplos de linguagens declarativas.

#### Comparação e conclusão

- **Controle**: Enquanto a programação imperativa dá ao programador controle detalhado sobre quase todos os aspectos de como o código é executado, a programação declarativa abstrai esses detalhes, permitindo ao programador se concentrar em descrever o que deve ser feito.
- **Legibilidade e manutenção**: Códigos declarativos tendem a ser mais legíveis e fáceis de manter, pois descrevem intenções ao invés de detalhes específicos de implementação.
- **Eficiência**: A programação imperativa pode ser mais eficiente em termos de uso de recursos do computador, mas isso pode vir à custa de maior complexidade de código.
- **Aplicabilidade**: A escolha entre imperativo e declarativo depende da natureza do problema. Problemas que são bem definidos e entendidos podem se beneficiar da abordagem declarativa, enquanto problemas que requerem controle detalhado dos processos podem se adequar melhor à abordagem imperativa.

Em suma, a escolha entre programação imperativa e declarativa depende do problema específico, dos requisitos de desempenho, da legibilidade e manutenção do código e das preferências ou experiência do programador.

### Função vs método
[[Topo]](#)<br />

A diferença entre uma função e um método é uma questão fundamental em programação e está intimamente relacionada ao contexto em que ambos são usados. Vamos explorar as características distintivas de cada um:

#### Função

- **Definição geral**: Uma função é um bloco de código independente que realiza uma tarefa específica. Funções são definidas uma vez e podem ser chamadas em diferentes partes do programa quantas vezes forem necessárias.
- **Independência**: Em muitas linguagens de programação, especialmente aquelas que seguem o paradigma funcional, as funções são entidades independentes. Elas podem existir e serem chamadas sem estar associadas a um objeto.
- **Retorno de valor**: Geralmente, uma função recebe zero ou mais valores de entrada (argumentos), executa uma série de operações e pode retornar um valor.
- **Exemplo em Python**:
```python
def somar(a, b):
  return a + b
resultado = somar(5, 3)
```

#### Método

- **Definição geral**: Um método é um bloco de código que é definido dentro de uma classe e associado a um objeto. Métodos são usados para expressar o comportamento dos objetos e podem operar nos dados (estado) que são parte do objeto.
- **Associação com objetos**: Métodos são chamados em contexto de objetos. Eles são utilizados para acessar ou modificar o estado interno de um objeto ou para fornecer funcionalidades específicas do objeto.
- **Vinculação com a classe**: Em linguagens orientadas a objetos, como Java ou C++, métodos são funções que pertencem a uma classe e são definidos dentro dessa classe.
- **Exemplo em Java**:
```java
public class Calculadora {
  public int somar(int a, int b) {
    return a + b;
  }
}

Calculadora calc = new Calculadora();
int resultado = calc.somar(5, 3);
```

#### Comparação e contexto

- **Contexto de uso**: A principal diferença está no contexto em que são usados. Funções são independentes, enquanto métodos são associados a objetos e classes.
- **Orientação a objetos**: Em linguagens orientadas a objetos, o conceito de método é fundamental, pois encapsula o comportamento dos objetos.
- **Paradigma funcional**: Em linguagens funcionais, como Haskell, o foco está nas funções e não há conceito de objeto como na orientação a objetos.

Em resumo, a diferença entre função e método é principalmente conceitual e contextual. Métodos são funções associadas a objetos e classes, enquanto funções são blocos de código independentes que realizam uma tarefa específica.

### Programação funcional no Java
[[Topo]](#)<br />

A programação funcional no Java foi significativamente aprimorada com a introdução do Java 8, que trouxe várias novas funcionalidades inspiradas neste paradigma. Antes do Java 8, a programação em Java era predominantemente imperativa e orientada a objetos. Com as novidades do Java 8, tornou-se possível escrever código de uma maneira mais funcional, o que trouxe benefícios como código mais conciso, fácil de ler e de manter. Vamos explorar os principais aspectos da programação funcional no Java:

#### Expressões lambda

As expressões lambda (ou lambdas) são uma das adições mais significativas ao Java 8. Elas permitem que você escreva funções anônimas de uma maneira concisa. Por exemplo:
```java
List<String> names = Arrays.asList("Ana", "Paulo", "Maria");
Collections.sort(names, (String a, String b) -> b.compareTo(a));
```

#### Interfaces funcionais

Uma interface funcional é uma interface que contém exatamente um método abstrato (além de quaisquer métodos default ou estáticos). Elas são usadas como base para lambdas. O Java 8 inclui várias interfaces funcionais prontas para uso, como `Function`, `Predicate`, `Consumer`, e `Supplier`.

#### Streams

Os streams fornecem uma maneira de processar sequências de elementos de maneira declarativa. Eles podem ser utilizados para realizar operações como mapeamento, filtragem, redução, e coleta, muitas vezes em paralelo, sem a necessidade de manipulação manual de iterações e estruturas de dados. Por exemplo:
```java
List<String> filtered = names.stream()
  .filter(s -> s.startsWith("A"))
  .collect(Collectors.toList());
```

#### Métodos de referência

Os métodos de referência são atalhos de sintaxe para expressar lambdas que chamam um método existente. Por exemplo, `System.out::println` é uma referência de método para o método `println` do objeto `System.out`.

#### Optional

A classe `Optional` é um container que pode ou não conter um valor não nulo. Ela fornece uma maneira melhor de lidar com valores que podem ser nulos, reduzindo a possibilidade de `NullPointerExceptions`.

#### Imutabilidade e efeitos colaterais

A programação funcional enfatiza imutabilidade e operações sem efeitos colaterais. No Java, isso geralmente é alcançado usando variáveis finais e evitando mudar o estado dos objetos.

#### Recursão de cauda

Embora o Java não otimize chamadas de recursão de cauda (tail call recursion), você pode usar a recursão de cauda para escrever algoritmos eficientes em um estilo funcional.

#### Benefícios da programação funcional em Java

- **Código mais conciso e legível**: Lambdas e streams podem reduzir a verbosidade e aumentar a clareza do código.
- **Paralelismo**: Streams paralelos facilitam a execução de operações em paralelo, aproveitando múltiplos núcleos do processador.
- **Manutenção**: O código funcional é muitas vezes mais fácil de entender e manter.
- **Segurança**: Imutabilidade e ausência de efeitos colaterais reduzem erros comuns relacionados a estados mutáveis.

#### Limitações

- **Curva de aprendizado**: Pode ser desafiador para programadores acostumados apenas com paradigmas imperativos.
- **Performance**: Operações em streams, especialmente streams paralelos, podem não ser sempre mais eficientes do que seus equivalentes imperativos.
- **Recursão de cauda**: A falta de otimização de recursão de cauda no Java pode limitar alguns padrões funcionais.

A programação funcional no Java não substitui a orientação a objetos, mas oferece uma alternativa poderosa e complementar, especialmente para operações em coleções, processamento de dados e para escrever código mais limpo e menos propenso a erros.
