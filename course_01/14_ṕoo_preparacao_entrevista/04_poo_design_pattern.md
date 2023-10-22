# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## POO e Design Patterns: Perguntas e respostas
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Conteúdo
  - [Perguntas e respostas](#perguntas-e-respostas)

### Perguntas e respostas
[[Topo]](#)<br />

- **O QUE SÃO DESIGN PATTERNS?**

Padroes de projeto (design patterns)  são soluções reutilizáveis para problemas comuns encontrados no desenvolvimento de software.

- **DE QUE ELEMENTOS O DESIGN PATTERN É COMPOSTO?**

Em geral, um modelo de um design pattern consiste em quatro elementos principais:

- Nome. O nome exato fornece a oportunidade de entender imediatamente o problema e determinar a solução.
- Objetivo. O escopo dentro do quadro da resolução de um problema específico;
- Solução. Uma descrição abstrata dos elementos de design do problema de design e como resolvê-lo usando um conjunto generalizado de classes;
- Resultados.

- **QUE TIPOS DE PADRÕES GOF (GANG-OF-FOUR) VOCÊ CONHECE?**

São distinguíveis os padrões de criação, padrões estruturais, padrões de comportamento, bem como as antipadrões.

- **NOMEIE OS PADRÕES DE CRIAÇÃO E DESCREVA-OS BREVEMENTE**

Os padrões de criação têm como objetivo organizar o processo de criação de objetos em desenvolvimento de software. Os padrões mais comuns nesta categoria incluem:

- Abstract Factory (Fábrica Abstrata): Fornece uma interface para criar objetos relacionados de famílias de classes sem especificar suas implementações específicas (famílias de objetos de produto).
- Factory Method (Método de Fábrica): Define uma interface para a criação de objetos a partir de uma família hierárquica de classes com base nos dados fornecidos (subclasse de objeto que é instanciada).
- Builder (Construtor): Cria um objeto de uma classe específica de várias maneiras (como um objeto composto é criado).
- Singleton: Garante a existência de apenas uma única instância da classe (a única instância de uma classe).
- Prototype (Protótipo): Usado na criação de objetos complexos. Com base no protótipo, objetos são armazenados e recriados, por exemplo, por meio de cópia.

- **NOMEIE OS PADRÕES DE COMPORTAMENTO E DESCREVA-OS BREVEMENTE**

Os padrões de comportamento do GoF (Gang of Four) caracterizam as maneiras pelas quais as classes ou objetos interagem entre si em um sistema de software. Aqui está uma breve descrição dos padrões de comportamento mencionados:

- Chain of Responsibility (Corrente de Responsabilidade): Organiza uma cadeia de objetos receptores que não conhecem as capacidades uns dos outros, são independentes do objeto remetente e passam a solicitação uns para os outros (objeto que pode cumprir uma solicitação).
- Command (Comando): Usado para determinar, por algum atributo, um objeto de uma classe específica ao qual uma solicitação será passada para processamento (quando e como uma solicitação é cumprida).
- Iterator (Iterador): Permite percorrer sequencialmente todos os elementos de uma coleção ou outro objeto composto, sem conhecer os detalhes da representação interna dos dados (como os elementos de um agregado são acessados e percorridos).
- Mediator (Mediador): Permite reduzir o número de conexões entre classes com um grande número delas, destacando uma classe que sabe tudo sobre os métodos de outras classes.
- Memento (Memento): Salva o estado atual de um objeto para posterior restauração.
- Observer (Observador): Permite uma relação um-para-muitos entre objetos para rastrear mudanças em objetos observados.
- State (Estado): Permite que um objeto mude seu comportamento alterando o estado interno do objeto.
- Strategy (Estratégia): Especifica um conjunto de algoritmos com a capacidade de selecionar uma das classes para executar uma tarefa específica durante a criação do objeto (um algoritmo).
- Template Method (Método de Modelo): Cria uma classe pai que utiliza vários métodos, cuja implementação é atribuída às classes derivadas (etapas de um algoritmo).
- Visitor (Visitante): Representa uma operação em uma ou mais classes relacionadas de alguma estrutura, que é chamada por um método específico de cada classe em outra classe (operações que podem ser aplicadas a objeto(s) sem alterar sua(s) classe(s)).
- Interpreter (Intérprete): Define regras para uma determinada forma de apresentação de informações, incluindo a gramática e a interpretação de uma linguagem específica.
