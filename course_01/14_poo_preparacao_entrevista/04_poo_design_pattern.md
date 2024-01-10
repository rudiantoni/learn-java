# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## 14.4. POO e Design Patterns: Perguntas e respostas
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Conteúdo
  - [Perguntas e respostas](#perguntas-e-respostas)

### Perguntas e respostas
[[Topo]](#)<br />

- **O QUE SÃO DESIGN PATTERNS?**

Padroes de projeto (design patterns) são soluções reutilizáveis para problemas comuns encontrados no desenvolvimento de software.

- **DE QUE ELEMENTOS O DESIGN PATTERN É COMPOSTO?**

Em geral, um modelo de um design pattern consiste em quatro elementos principais:

- *Nome*: O nome exato fornece a oportunidade de entender imediatamente o problema e determinar a solução.
- *Objetivo*: O escopo dentro do quadro da resolução de um problema específico;
- *Solução*: Uma descrição abstrata dos elementos de design do problema de design e como resolvê-lo usando um conjunto generalizado de classes;
- *Resultados*.

- **QUE TIPOS DE PADRÕES GOF (GANG-OF-FOUR) VOCÊ CONHECE?**

São distinguíveis os *padrões de criação*, *padrões estruturais*, *padrões de comportamento* e os *antipadrões*.

- **NOMEIE OS PADRÕES DE CRIAÇÃO E DESCREVA-OS BREVEMENTE**

Os padrões de criação têm como objetivo organizar o processo de criação de objetos em desenvolvimento de software. Os padrões mais comuns nesta categoria incluem:

- *Abstract Factory (Fábrica Abstrata)*: Fornece uma interface para criar objetos relacionados de famílias de classes sem especificar suas implementações específicas (famílias de objetos de produto).
- *Factory Method (Método de Fábrica)*: Define uma interface para a criação de objetos a partir de uma família hierárquica de classes com base nos dados fornecidos (subclasse de objeto que é instanciada).
- *Builder (Construtor)*: Cria um objeto de uma classe específica de várias maneiras (como um objeto composto é criado).
- *Singleton*: Garante a existência de apenas uma única instância da classe (a única instância de uma classe).
- *Prototype (Protótipo)*: Usado na criação de objetos complexos. Com base no protótipo, objetos são armazenados e recriados, por exemplo, por meio de cópia.

- **NOMEIE OS PADRÕES DE COMPORTAMENTO E DESCREVA-OS BREVEMENTE**

Os padrões de comportamento do GoF (Gang of Four) caracterizam as maneiras pelas quais as classes ou objetos interagem entre si em um sistema de software. Aqui está uma breve descrição dos padrões de comportamento mencionados:

- *Chain of Responsibility (Corrente de Responsabilidade)*: Organiza uma cadeia de objetos receptores que não conhecem as capacidades uns dos outros, são independentes do objeto remetente e passam a solicitação uns para os outros (objeto que pode cumprir uma solicitação).
- *Command (Comando)*: Usado para determinar, por algum atributo, um objeto de uma classe específica ao qual uma solicitação será passada para processamento (quando e como uma solicitação é cumprida).
- *Iterator (Iterador)*: Permite percorrer sequencialmente todos os elementos de uma coleção ou outro objeto composto, sem conhecer os detalhes da representação interna dos dados (como os elementos de um agregado são acessados e percorridos).
- *Mediator (Mediador)*: Permite reduzir o número de conexões entre classes com um grande número delas, destacando uma classe que sabe tudo sobre os métodos de outras classes.
- *Memento (Memento)*: Salva o estado atual de um objeto para posterior restauração.
- *Observer (Observador)*: Permite uma relação um-para-muitos entre objetos para rastrear mudanças em objetos observados.
- *State (Estado)*: Permite que um objeto mude seu comportamento alterando o estado interno do objeto.
- *Strategy (Estratégia)*: Especifica um conjunto de algoritmos com a capacidade de selecionar uma das classes para executar uma tarefa específica durante a criação do objeto (um algoritmo).
- *Template Method (Método de Modelo)*: Cria uma classe pai que utiliza vários métodos, cuja implementação é atribuída às classes derivadas (etapas de um algoritmo).
- *Visitor (Visitante)*: Representa uma operação em uma ou mais classes relacionadas de alguma estrutura, que é chamada por um método específico de cada classe em outra classe (operações que podem ser aplicadas a objeto(s) sem alterar sua(s) classe(s)).
- *Interpreter (Intérprete)*: Define regras para uma determinada forma de apresentação de informações, incluindo a gramática e a interpretação de uma linguagem específica.

- **NOMEIE OS PADRÕES DE ESTRUTURA E DESCREVA-OS BREVEMENTE**

Os padrões estruturais GoF são responsáveis pela composição de objetos e classes, não apenas por reunir partes de uma aplicação, mas também por separá-las.

Os padrões estruturais incluem:

- *Adapter (Adaptador)*: É usado quando é necessário usar classes junto com interfaces não relacionadas. O comportamento da classe adaptável é alterado para o necessário (interface para um objeto).
- *Bridge (Ponte)*: Separa a representação da classe de sua implementação, permitindo alterar ambas independentemente (implementação de um objeto).
- *Composite (Composto)*: Agrupa objetos em estruturas hierárquicas de árvore e permite trabalhar com um único objeto da mesma forma que com um grupo de objetos (estrutura e composição de um objeto).
- *Decorator (Decorador)*: Representa uma maneira de alterar o comportamento de um objeto sem criar subclasses. Permite usar o comportamento de um objeto em outro (responsabilidades de um objeto sem subclasses).
- *Facade (Fachada)*: Cria uma classe com uma interface de alto nível comum para um certo número de interfaces em um subsistema (interface para um subsistema).
- *Flyweight (Peso-Leve)*: Separa as propriedades da classe para oferecer suporte ótimo a um grande número de pequenos objetos (custos de armazenamento de objetos).
- *Proxy (Proxi)*: Substitui um objeto complexo por um mais simples e controla o acesso a ele.

- **QUAIS ANTI-PADRÕES VOCÊ CONHECE?**

Aqui estão algumas anti-patterns (padrões anti) comuns no desenvolvimento de software:

- *Big Ball of Mud (Grande Bola de Lodo)*: Este termo é usado para descrever um sistema ou programa que não possui uma arquitetura discernível. Geralmente inclui mais de um anti-pattern. Isso afeta sistemas desenvolvidos por pessoas sem treinamento em arquitetura de software.
- *Yo-Yo Problem (Problema do Iô-iô)*: Surge quando é necessário entender o programa, a hierarquia de herança e a aninhamento de chamadas de método são muito longos e complexos. O programador precisa navegar entre muitas classes e métodos diferentes para controlar o comportamento do programa. O termo vem do brinquedo iô-iô.
- *Magic Button (Botão Mágico)*: Ocorre quando o código de processamento de formulários está concentrado em um único lugar e, claro, não está estruturado de forma alguma.
- *Magic Number (Número Mágico)*: A presença de números repetidos ou números no código cuja origem não está documentada.
- *Gas Factory (Fábrica de Gás)*: Design complexo para uma tarefa simples, ou seja, usar uma solução complicada para um problema que poderia ser resolvido de maneira mais simples.
- *Analysis Paralysis (Paralisia de Análise)*: No desenvolvimento de software, isso se manifesta por meio de fases extremamente longas de planejamento de projetos, coleta de artefatos necessários, modelagem de software e design, que não contribuem significativamente para alcançar o objetivo final.
- *Interface Bloat (Inchaço de Interface)*: Um termo usado para descrever interfaces que tentam abranger todas as operações possíveis em dados. Isso pode levar a interfaces complexas e difíceis de manter.
- *Accidental Complexity (Complexidade Acidental)*: Um problema de programação que poderia ter sido facilmente evitado. Isso ocorre devido a um mal entendido do problema ou planejamento ineficaz.

- **O QUE É OOAD?**

- OOAD = Object-Oriented Analysis and Design
- ADOO = Análise e Design Orientado a Objetos

OOAD é uma disciplina que descreve as maneiras (opções) de especificar (definir) objetos e suas interações para resolver um problema que é definido e descrito durante o processo de análise orientada a objetos.

A ideia principal da análise e design orientados a objetos é considerar a área de domínio (o contexto do problema) e a solução lógica do problema do ponto de vista dos objetos (conceitos e entidades). No processo de análise orientada a objetos, a atenção principal é dedicada à definição e descrição de objetos (ou conceitos) em termos da área de domínio. No processo de design orientado a objetos, objetos lógicos do programa são definidos, que serão implementados por meio de uma linguagem de programação orientada a objetos. Esses objetos de programa incluem atributos e métodos. E finalmente, no processo de design ou programação orientada a objetos, é fornecida a implementação dos componentes e classes desenvolvidos.

- **O QUE É OOD?**

- OOD = Object-Oriented Design
- DOO = Design Orientado a Objetos

OOD é uma metodologia de design que combina o processo de decomposição de objetos e técnicas para representar os modelos lógicos e físicos, bem como os modelos estáticos e dinâmicos do sistema sendo projetado.

- **O QUE É OOA?**

- OOA = Object-Oriented Analysis
- AOO = Análise Orientada a Objetos

OOA é uma metodologia na qual os requisitos do sistema são entendidos em termos de classes e objetos identificados na área de domínio do problema. Essa metodologia faz parte do processo geral de desenvolvimento de software orientado a objetos e é uma etapa crucial para entender e modelar o sistema antes de prosseguir com o design e implementação.

- **O QUE SÃO PRINCÍPIOS DRY?**

- DRY = Don't Repeat Yourself
- NSR = Não Se Repita

DRY, esse princípio é tão importante que não requer repetição. Este é um princípio de desenvolvimento de software destinado a reduzir a repetição de informações de vários tipos, especialmente em sistemas com muitas camadas de abstração. Em palavras simples, NÃO escreva código repetitivo, utilize o princípio da abstração, generalizando coisas simples em um único lugar.

- **O QUE É KISS?**

- KISS = Keep It Short and Simple
- MSD = Mantenha Simples e Direto
- KISS = Keep It Simple Stupid
- MSE = Mantenha Simples, Estúpido

KISS significa simplifique as coisas. É um princípio de design e programação que proíbe o uso de ferramentas mais complexas do que o necessário. O princípio declara a simplicidade do sistema como o principal objetivo e/ou valor.

- **WHAT IT YAGNI?**

- YAGNI = You Ain't Gonna Need It
- VNVPD = Você Não Vai Precisar Disso
- YWNI = You Won't Need It
- VNVP = Você Não Vai Precisar

YAGNI é um processo e princípio de design de software no qual a rejeição de funcionalidades redundantes é declarada como o principal objetivo e/ou valor. A ideia central é implementar apenas as tarefas definidas e abandonar funcionalidades redundantes.

- **O QUE SÃO CONDIÇÕES YODA?**

Condições YODA - Um estilo "seguro" de escrever expressões de comparação ao programar em linguagens com sintaxe C, que consiste em escrever um membro constante da expressão (constante ou chamada de função) à esquerda do operador de comparação (ou seja, 5 == a em vez do habitual a == 5).

Esse estilo é destinado a prevenir o erro comum em linguagens desse tipo - o uso do operador de atribuição "=" em vez do operador de comparação "==". O uso incorreto de atribuição transforma a notação Yoda em uma tentativa de alterar uma constante, causando um erro de compilação, o que elimina a possibilidade desse tipo de erro no programa finalizado e também torna mais fácil encontrá-los e corrigi-los em novo código.

- **O QUE SÃO OS CARDS CRC?**

- CRC = Class-Responsibility-Collaboration
- CRC = Classe-Responsabilidade-Colaboração

Cartões CRC, são um método de brainstorming para o design de software orientado a objetos. Como regra, os cartẽos CRC são usados nos casos em que as classes e suas formas de interação são definidas pela primeira vez no processo de design de software.

Os cartões CRC direcionam a atenção do designer para a essência da classe e ocultam os detalhes, cuja consideração nesta fase seria contraproducente. Eles também forçam o designer a evitar atribuir muitas responsabilidades a uma classe.

- **O QUE É SOLID?**

- SOLID = Single responsibility, Open/closed, Liskov substitution, Interface segregation, and Dependency inversion
- RASSI = Resposabilidade única, Aberto/fechado, Substituição de Liskov, Segregação de interface e Inversão de dependência.

SOLID, é um acrônimo que representa os cinco primeiros princípios fundamentais da programação e design orientados a objetos.

Esses princípios, quando aplicados em conjunto, têm o objetivo de aumentar a probabilidade de que um programador crie um sistema que seja fácil de manter e expandir ao longo do tempo. Os princípios SOLID são diretrizes que podem ser aplicadas durante o trabalho em software para eliminar o "código complicado", instruindo o programador a refatorar o código-fonte até que ele seja legível e extensível. Isso faz parte de uma estratégia geral de desenvolvimento ágil e adaptativo.

- **O QUE É O PRINCÍPIO SINGLE RESPONSIBILITY?**

Single Responsibility = Responsabilidade Única

O princípio da responsabilidade única (uma única responsabilidade deve ser atribuída a cada classe). Se uma classe Java implementa dois conjuntos de funções, sua interconexão cria uma situação na qual a alteração de uma delas pode quebrar a combinação.

- **O QUE É O PRINCÍPIO OPEN/CLOSED?**

O princípio aberto/fechado é um princípio da programação orientada a objetos que estabelece a seguinte posição: "entidades de programa (classes, módulos, funções, etc.) devem estar abertas para extensão, mas fechadas para modificação"; isso significa que essas entidades podem ser permitidas a mudar seu comportamento sem alterar seu código-fonte. Isso pode ser implementado permitindo a extensão do tipo. Nesse caso, podemos substituir o comportamento do tipo sem ajustar o código-fonte da classe original. E isso pode ser alcançado criando um nível suficiente de abstração que não obrigue os clientes do seu código a alterar o código-fonte da classe original.

- **O QUE É O PRINCÍPIO LISKOV SUBSTITUTION?**

O princípio da substituição de Liskov, proposto por Barbara Liskov, afirma que funções que usam um tipo base devem ser capazes de usar subtipos desse tipo base sem saber disso. Subclasses não podem substituir o comportamento das classes base. Os subtipos devem complementar os tipos base.

- **O QUE É O PRINCÍPIO INTERFACE SEGREGATION?**

O princípio da segregação de interfaces (muitas interfaces especializadas são melhores do que uma universal). Em outras palavras, interfaces extensas e volumosas devem ser divididas em interfaces menores de tal forma que os clientes das interfaces menores conheçam apenas os métodos de que precisam em seu trabalho. Dessa forma, ao alterar os métodos da interface, não precisamos modificar clientes que não dependem dos métodos que não usam.

- **O QUE É O PRINCÍPIO DEPENDENCY INVERSION?**

O princípio da inversão de dependência estabelece que as dependências dentro do sistema devem ser construídas com base em abstrações. Os módulos de alto nível não devem depender dos módulos de baixo nível. Abstrações não devem depender de detalhes. Os detalhes devem depender das abstrações.

- **O QUE É GRASP?**

- GRASP = General Responsibility Assignment Software Patterns
- PGARS = Padrões Gerais de Atribuição de Responsabilidade de Software

GRASP são padrões de design usados para resolver tarefas gerais de atribuição de responsabilidades a classes e objetos. São conhecidos nove padrões GRASP:

- *Information Expert*
- *Creator*
- *Controller*
- *Indirection*
- *Low Coupling*
- *High Cohesion*
- *Polymorphism*
- *Protected Variations*
- *Pure Fabrication*

- **DESCREVA BREVEMENTE OS MODELOS GRASP**

- *Information Expert (Especialista em Informações)*: Um especialista em informações descreve os princípios fundamentais para atribuir responsabilidades a classes e objetos. De acordo com a descrição, um especialista em informações (um objeto dotado de certas tarefas) é um objeto que possui as informações máximas necessárias para realizar as tarefas atribuídas.
- *Creator (Criador)*: A essência da responsabilidade de tal objeto é criar outros objetos. A analogia com fábricas imediatamente sugere a si mesma. Isso está correto. As fábricas também têm a responsabilidade de criação.
- *Controller (Controlador)*: É responsável por processar eventos do sistema de entrada, delegando a responsabilidade pelo processamento a classes competentes. Em geral, um controlador implementa um ou mais casos de uso. Usar controladores permite separar a lógica da apresentação, aumentando assim a reutilização de código.
- *Indirection (Indireção)*: O padrão de indireção implementa um baixo acoplamento entre classes atribuindo responsabilidades por sua interação a um objeto adicional - um intermediário.
- *Low Coupling (Baixo Acoplamento)*: Se objetos em uma aplicação estiverem fortemente acoplados, qualquer alteração neles causará alterações em todos os objetos relacionados. E isso é inconveniente e gera erros. Por isso, em toda a literatura de aprendizado, é mencionado que é necessário que o código seja fracamente acoplado e dependa apenas de abstrações.
- *High Cohesion (Alta Coesão)*: Alta coesão é um conceito de engenharia de software que se refere a quão de perto todas as rotinas em uma classe, ou todo o código em uma rotina, suportam um propósito central. Classes que contêm funcionalidades fortemente relacionadas são descritas como tendo alta coesão.
- *Polymorphism (Polimorfismo)*: Permite lidar com comportamentos alternativos com base no tipo e substituir componentes do sistema plug-in. Responsabilidades são alocadas a diferentes comportamentos usando operações polimórficas para essa classe. Todas as implementações alternativas são convertidas para uma interface comum.
- *Protected Variations (Variações Protegidas)*: Protege elementos de serem modificados por outros elementos (objetos ou subsistemas) tornando a interação uma interface fixa. Toda interação entre elementos deve ocorrer através dela. O comportamento só pode ser alterado criando uma implementação diferente da interface.
- *Pure Fabrication (Fabricação Pura)*: É uma classe que não representa nenhum objeto de domínio real, mas é especificamente projetada para aumentar a coesão, o desacoplamento ou aumentar a reutilização. A Fabricação Pura reflete o conceito de serviços no modelo de programação de domínio.
