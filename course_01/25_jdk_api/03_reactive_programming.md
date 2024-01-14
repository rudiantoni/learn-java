# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## 25.3. Programação Reativa (Java 9+)
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [03_arquivos](./03_arquivos/)
- Projetos
  - [Projeto 1](./03_arquivos/proj_01/) [(iniciado em)](#programação-reativa)
- Conteúdo
  - [Programação reativa](#programação-reativa)
  - [Quando usar programação reativa](#quando-usar-programação-reativa)
  - [Frameworks](#frameworks)
  - [Java Flow API](#java-flow-api)
  - [A interface Publisher](#a-interface-publisher)
  - [A interface Subscriber](#a-interface-subscriber)
  - [A interface Subscription](#a-interface-subscription)
  - [A interface Processor](#a-interface-processor)
  - [Quando usar o Processor](#quando-usar-o-processor)

### Programação reativa
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./03_arquivos/proj_01/)

A programação reativa em Java, e em geral, é um paradigma de programação focado na construção de sistemas assíncronos, não bloqueantes e orientados a eventos. Este paradigma é especialmente útil para desenvolver aplicações que interagem com fluxos de dados que mudam com o tempo, como aplicações web em tempo real, sistemas de processamento de eventos, aplicações que lidam com grandes volumes de dados (big data), e sistemas distribuídos.

No Java 8, não há suporte nativa para programação reativa, mas ainda é possível utilizar frameworks como RxJava e Project Reactor.

#### Características principais

- **Assíncrona e não bloqueante**: As operações reativas são realizadas de maneira assíncrona, o que significa que a thread principal não é bloqueada enquanto espera pelo resultado de uma operação. Isso melhora a escalabilidade e a eficiência do sistema.
- **Orientada a eventos**: Em programação reativa, o fluxo de dados e a propagação de mudanças são tratados como eventos. Os sistemas reativos são construídos em torno da reação a esses eventos.
- **Backpressure**: Um conceito importante na programação reativa é o "backpressure", que é a capacidade de controlar o fluxo de dados para que o consumidor não seja sobrecarregado por um produtor rápido demais.
- **Resiliente e responsiva**: Sistemas reativos são projetados para serem resilientes às falhas e responsivos sob várias condições de carga, garantindo uma experiência de usuário consistente.

#### Frameworks e bibliotecas em Java

- **Reactor e RxJava**: São bibliotecas populares para programação reativa em Java. Elas fornecem abstrações para lidar com fluxos de dados assíncronos e eventos.
- **Spring WebFlux**: Parte do Spring Framework 5, o WebFlux é um módulo para construir aplicações web reativas no servidor. Ele usa o Reactor para suportar a programação reativa.

#### Exemplo básico em java com RxJava

```java
import io.reactivex.Observable;

public class ReactiveExample {
  public static void main(String[] args) {
    // Criar um Observable (fonte de dados)
    Observable<String> source = Observable.just("Alpha", "Beta", "Gamma");

    // Definir a ação a ser realizada quando um item é emitido
    source.subscribe(System.out::println); // Imprimir cada item
  }
}
```

Neste exemplo, `Observable` é um fluxo de dados, e `subscribe` é usado para reagir aos dados à medida que eles são emitidos.

#### Conclusão

A programação reativa representa um modelo poderoso para lidar com operações assíncronas, fluxos de dados e sistemas distribuídos. Ela é particularmente adequada para cenários onde se requer alta escalabilidade, eficiência e um modelo de programação orientado a dados e eventos. Embora requeira uma mudança de mentalidade em relação à programação imperativa tradicional, a programação reativa oferece benefícios significativos em termos de desempenho e escalabilidade para certos tipos de aplicações.

### Quando usar programação reativa
[[Topo]](#)<br />

A programação reativa é particularmente útil em cenários onde você está lidando com fluxos de dados assíncronos, em sistemas altamente interativos e em situações onde a eficiência no uso de recursos e a capacidade de resposta são críticas. Aqui estão algumas situações específicas onde a programação reativa se mostra especialmente valiosa:

#### Sistemas de alto volume de dados

Quando você está trabalhando com grandes volumes de dados, especialmente em fluxos de dados (streams), a programação reativa pode ajudar a processar estes dados de forma eficiente e com uso eficaz de recursos. Isso é útil em big data, processamento de logs, e sistemas de telemetria.

#### Sistemas de alta concorrência

Em ambientes onde muitas operações ocorrem simultaneamente e há necessidade de lidar com muitas solicitações de clientes de forma simultânea, como em serviços web e APIs, a programação reativa pode aumentar a escalabilidade e eficiência.

#### Operações assíncronas e não bloqueantes

Quando você precisa realizar operações de I/O (como acessos a banco de dados, chamadas a serviços web ou leitura e escrita de arquivos) de maneira assíncrona, a programação reativa permite que essas operações sejam realizadas sem bloquear o thread principal, melhorando a capacidade de resposta e eficiência da aplicação.

#### Sistemas orientados a eventos

Em aplicações onde a lógica de negócios depende da reação a eventos em tempo real (como aplicações de trading financeiro, jogos, ou interfaces de usuário interativas), a programação reativa fornece um modelo onde os eventos podem ser manipulados e encadeados de maneira fluida e responsiva.

#### Aplicações em tempo real

Para aplicações que requerem atualizações em tempo real, como dashboards de monitoramento, chatbots, ou aplicações de redes sociais, a programação reativa permite o tratamento eficiente de fluxos contínuos de dados e eventos.

#### Gerenciamento de backpressure

Em sistemas onde é necessário controlar o fluxo de dados (como quando um produtor de dados é mais rápido do que o consumidor pode processar), a programação reativa oferece mecanismos integrados para lidar com backpressure, ajudando a evitar problemas de sobrecarga e perda de dados.

#### Integração de sistemas distribuídos

A programação reativa pode facilitar a integração de sistemas distribuídos, especialmente quando diferentes componentes do sistema precisam se comunicar de maneira eficiente e resiliente a falhas, como em microserviços e aplicações baseadas em nuvem.

#### Flexibilidade e escalabilidade

Em ambientes que exigem alta escalabilidade e flexibilidade, como aplicações baseadas em nuvem, a programação reativa permite que o sistema se ajuste dinamicamente à carga de trabalho e aos recursos disponíveis.

#### Conclusão

A escolha pela programação reativa deve ser baseada em uma avaliação cuidadosa das necessidades da sua aplicação. Se você está lidando com qualquer uma das situações acima, onde a eficiência na manipulação de fluxos de dados, a necessidade de operações assíncronas e não bloqueantes, e a capacidade de lidar com alta carga são importantes, a programação reativa pode ser uma abordagem adequada. No entanto, ela também introduz uma complexidade adicional, por isso é importante ponderar os benefícios em relação às necessidades do projeto.

### Frameworks
[[Topo]](#)<br />

Ao longo das versões Java 8, 11 e 17, a popularidade da programação reativa aumentou significativamente, e várias bibliotecas foram desenvolvidas ou aprimoradas para suportar este paradigma. Vou destacar algumas das bibliotecas mais comuns para programação reativa nessas versões do Java:

#### Java 8

1. **RxJava 2**: Esta é uma das bibliotecas mais populares para programação reativa em Java, especialmente adequada para Java 8. Ela fornece uma API rica para composição assíncrona e baseada em eventos de fluxos de dados.

2. **Project Reactor**: Embora tenha sido desenvolvido principalmente para uso com o Spring Framework (especificamente o Spring WebFlux), o Project Reactor é uma biblioteca reativa geral que funciona bem com o Java 8. Oferece duas principais abstrações reativas: `Flux` para 0..N elementos e `Mono` para 0..1 elementos.

#### Java 11

Com o Java 11, não houve mudanças significativas em termos de bibliotecas reativas em comparação com o Java 8, mas as bibliotecas existentes continuaram a evoluir:

1. **RxJava 3**: Esta versão foi um passo à frente da RxJava 2, oferecendo melhorias e novas funcionalidades. Continua sendo uma escolha popular para a programação reativa.

2. **Project Reactor**: Continua a ser uma escolha forte para programação reativa, especialmente para desenvolvedores que trabalham com o ecossistema Spring.

#### Java 17

Com o Java 17, que é uma versão LTS (Long Term Support), as bibliotecas reativas estabelecidas continuaram a ser usadas extensivamente, e novas funcionalidades foram adicionadas:

1. **RxJava 3**: Ainda dominante no espaço da programação reativa para Java, compatível com Java 17.

2. **Project Reactor**: Continua sendo uma parte fundamental do Spring Framework e é amplamente utilizado, especialmente no desenvolvimento de microserviços reativos com Spring Boot.

3. **Akka Streams**: Parte do ecossistema Akka, Akka Streams é uma biblioteca para processamento de fluxos reativos que pode ser usada com Java. Ela é especialmente popular para sistemas que requerem alta concorrência e escalabilidade.

4. **Java Flow API**: Introduzida no Java 9 (e disponível no Java 17), a API `java.util.concurrent.Flow` é a implementação Java do padrão Reactive Streams. Embora não seja uma biblioteca por si só, ela fornece uma base padrão sobre a qual outras bibliotecas podem construir.

#### Conclusão

Cada uma dessas bibliotecas tem suas próprias características e vantagens. RxJava é conhecida por sua rica API e ampla adoção. Project Reactor é integrado com o Spring Framework e é ideal para desenvolvedores que já estão trabalhando com esse ecossistema. Akka Streams se destaca em sistemas que requerem alta concorrência e escalabilidade. A escolha de uma biblioteca reativa depende das necessidades específicas do projeto, do ecossistema existente e da preferência dos desenvolvedores.

### Java Flow API
[[Topo]](#)<br />

A Java Flow API, introduzida no Java 9 como parte do pacote `java.util.concurrent`, é um conjunto de interfaces que implementam o padrão Reactive Streams. Este padrão visa padronizar a maneira como sistemas assíncronos com fluxos de dados processam dados de maneira não bloqueante. A principal motivação por trás da Java Flow API é fornecer uma base comum para construir sistemas reativos em Java, permitindo que diferentes bibliotecas reativas trabalhem juntas de maneira intercambiável.

#### Componentes principais

A Java Flow API consiste em quatro interfaces principais:
- **`Publisher<T>`**: Uma fonte de dados. O `Publisher` pode emitir um fluxo de itens do tipo `T` para os assinantes que ele possui.
- **`Subscriber<T>`**: O consumidor dos dados. Um `Subscriber` se inscreve em um `Publisher` e recebe notificações sobre novos itens, erros ou a conclusão do fluxo de dados.
- **`Subscription`**: Representa um contrato entre um `Publisher` e um `Subscriber` para transmitir um determinado número de itens, com métodos para controlar o fluxo de dados. Por exemplo, um `Subscriber` pode solicitar mais itens ou cancelar a assinatura através do seu `Subscription`.
- **`Processor<T,R>`**: Uma combinação de `Subscriber` e `Publisher` e atua como um intermediário que consome de um `Publisher`, processa os itens e emite para seus próprios `Subscribers`. Esta interface é útil para construir componentes que transformam ou manipulam o fluxo de dados.

#### Exemplo simples de uso

Aqui está um exemplo básico demonstrando como as interfaces da Java Flow API podem ser utilizadas:

```java
import java.util.concurrent.Flow.*;
import java.util.concurrent.SubmissionPublisher;

public class FlowApiExample {
  public static void main(String[] args) {
    // Criação do Publisher
    try (SubmissionPublisher<String> publisher = new SubmissionPublisher<>()) {
      // Criação do Subscriber
      Subscriber<String> subscriber = new Subscriber<>() {
        public void onSubscribe(Subscription subscription) {
          subscription.request(1); // Solicita um item
        }
        public void onNext(String item) {
          System.out.println("Recebido: " + item);
          subscription.request(1); // Solicita o próximo item
        }
        public void onError(Throwable throwable) {
          throwable.printStackTrace();
        }
        public void onComplete() {
          System.out.println("Concluído");
        }
      };

      // Conectando o Publisher e o Subscriber
      publisher.subscribe(subscriber);

      // Emitindo itens
      publisher.submit("Hello");
      publisher.submit("World");
    } // O publisher é fechado automaticamente aqui devido ao try-with-resources

    // O programa vai emitir "Hello" e "World", e então concluí
  }
}
```

Neste exemplo:

- Utilizamos `SubmissionPublisher`, que é uma implementação de `Publisher` fornecida pela API padrão do Java. Ela é usada para publicar itens para os `Subscribers`.
- O `Subscriber` é implementado para definir o que acontece quando um novo item é recebido (`onNext`), quando um erro ocorre (`onError`), quando a assinatura é estabelecida (`onSubscribe`) e quando todos os itens foram processados e a transmissão é concluída (`onComplete`).
- O método `request` no `Subscription` é chamado para solicitar itens do `Publisher`. É importante controlar essa chamada para evitar o consumo desenfreado de recursos, o que é uma parte essencial da implementação do backpressure.

#### Importância da Java Flow API

A Java Flow API é significativa pois:

- **Padronização**: Ela fornece um padrão para construir sistemas reativos em Java, compatível com o padrão Reactive Streams.
- **Interoperabilidade**: Permite a interoperabilidade entre diferentes bibliotecas reativas, como RxJava e Project Reactor, que aderem ao padrão Reactive Streams.
- **Controle de backpressure**: Facilita o controle de backpressure, que é a capacidade de lidar com situações onde diferentes partes de um sistema processam dados em velocidades diferentes.
- **Suporte a fluxos assíncronos**: Permite a construção de sistemas que lidam eficientemente com fluxos de dados assíncronos e grandes volumes de dados.

A Java Flow API é uma base fundamental para a programação reativa no ecossistema Java, fornecendo as interfaces necessárias para construir aplicações reativas robustas e eficientes.

### A interface Publisher
[[Topo]](#)<br />

A interface `Publisher` é um componente-chave da Java Flow API, que foi introduzida no Java 9 como parte do suporte à programação reativa. Ela está definida no pacote `java.util.concurrent.Flow` e é parte da implementação do padrão Reactive Streams no Java. O objetivo do `Publisher` é servir como uma fonte de dados em um modelo de programação reativa.

#### Função

A função principal de um `Publisher` é emitir uma sequência de itens para um ou mais `Subscribers`. Em um fluxo reativo, o `Publisher` é responsável por produzir ou emitir itens que os `Subscribers` irão consumir. O `Publisher` pode emitir um número finito ou infinito de itens.

#### Interface

A interface `Publisher` é definida da seguinte maneira:

```java
public interface Publisher<T> {
  void subscribe(Subscriber<? super T> subscriber);
}
```

Ela possui um único método, `subscribe`, que é usado para adicionar um `Subscriber` ao `Publisher`. Quando um `Subscriber` se inscreve, ele fornece uma instância de `Subscription` ao `Subscriber`, que é usada para controlar o fluxo de itens (por exemplo, solicitando mais itens ou cancelando a assinatura).

#### Processo de publicação

O processo de publicação geralmente segue estes passos:

- **Subscrição**: Um `Subscriber` se inscreve em um `Publisher` chamando `subscribe` no `Publisher`.
- **Estabelecimento da Subscription**: O `Publisher` chama `onSubscribe` no `Subscriber` com uma nova `Subscription`.
- **Processamento de dados**: O `Subscriber` pode solicitar dados do `Publisher` chamando `request` na `Subscription` fornecida. O `Publisher` então emite itens para o `Subscriber` chamando `onNext` no `Subscriber`.
-. **Conclusão ou Erro**: Quando todos os itens foram emitidos, o `Publisher` chama `onComplete` no `Subscriber`. Se ocorrer um erro, `onError` é chamado.

#### Exemplo simples

```java
import java.util.concurrent.Flow.*;

public class SimplePublisher implements Publisher<Integer> {
  public void subscribe(Subscriber<? super Integer> subscriber) {
    subscriber.onSubscribe(new SimpleSubscription(subscriber));
  }

  // Implementação simples de Subscription
  static class SimpleSubscription implements Subscription {
    private final Subscriber<? super Integer> subscriber;

    SimpleSubscription(Subscriber<? super Integer> subscriber) {
      this.subscriber = subscriber;
    }

    public void request(long n) {
      // Implementar lógica para emitir dados aqui
    }

    public void cancel() {
      // Implementar lógica de cancelamento aqui
    }
  }
}
```

#### Importância na programação reativa

O `Publisher` é fundamental na programação reativa, pois:

- Define a fonte de dados ou eventos no fluxo de dados reativo.
- Permite controle sobre como e quando os dados são emitidos, incluindo aspectos importantes como backpressure, que é a habilidade do `Subscriber` de sinalizar ao `Publisher` a quantidade de dados que ele está pronto para processar.
- Facilita a construção de sistemas reativos assíncronos e não bloqueantes, permitindo que aplicações lidem eficientemente com operações que envolvem latência, como E/S de rede ou acesso a banco de dados.

Em resumo, a interface `Publisher` desempenha um papel crucial em permitir que aplicações em Java adotem um modelo de programação reativa, facilitando a construção de sistemas mais responsivos, resilientes e escaláveis.

### A interface Subscriber
[[Topo]](#)<br />

A interface `Subscriber` é outro componente fundamental da Java Flow API, que faz parte da implementação do padrão Reactive Streams no Java. Esta interface representa o consumidor dos dados em um fluxo de processamento reativo. A `Subscriber` se inscreve em um `Publisher` para receber itens, e a comunicação entre eles é regulada por uma `Subscription`.

#### Estrutura

A interface `Subscriber` é definida no pacote `java.util.concurrent.Flow` e tem a seguinte forma:

```java
public interface Subscriber<T> {
  void onSubscribe(Subscription subscription);
  void onNext(T item);
  void onError(Throwable throwable);
  void onComplete();
}
```

Cada método tem um propósito específico:

- **`onSubscribe(Subscription subscription)`**: Este método é chamado quando o `Subscriber` se inscreve no `Publisher`. A `Subscription` que é passada como argumento é usada pelo `Subscriber` para controlar o fluxo de dados, como solicitar mais itens ou cancelar a subscrição.
- **`onNext(T item)`**: Chamado pelo `Publisher` para entregar um item ao `Subscriber`. Este método é chamado várias vezes conforme os itens são emitidos pelo `Publisher`.
- **`onError(Throwable throwable)`**: Chamado pelo `Publisher` se ocorrer um erro durante o processo de emissão de itens. Após este método ser chamado, não serão feitas mais chamadas para `onNext` ou `onComplete`.
- **`onComplete()`**: Chamado pelo `Publisher` para sinalizar que todos os itens previstos foram emitidos e o fluxo de dados foi concluído.

#### Exemplo de implementação de `Subscriber`

```java
public class SimpleSubscriber<T> implements Subscriber<T> {
  private Subscription subscription;

  @Override
  public void onSubscribe(Subscription subscription) {
    this.subscription = subscription;
    subscription.request(1); // Solicita o primeiro item
  }

  @Override
  public void onNext(T item) {
    System.out.println("Recebido: " + item);
    subscription.request(1); // Solicita o próximo item
  }

  @Override
  public void onError(Throwable t) {
    t.printStackTrace();
  }

  @Override
  public void onComplete() {
    System.out.println("Concluído");
  }
}
```

#### Importância na programação reativa

O `Subscriber` é essencial na programação reativa porque:

- Ele define como os dados serão consumidos e processados.
- Permite uma abordagem controlada para processamento de fluxos de dados, incluindo a capacidade de lidar com backpressure.
- Facilita a criação de aplicações que reagem a eventos de dados de forma assíncrona e não bloqueante.

### A interface Subscription
[[Topo]](#)<br />

A interface `Subscription` é uma parte crucial da Java Flow API e do padrão Reactive Streams. Ela atua como um contrato entre um `Publisher` e um `Subscriber` em um fluxo de processamento de dados reativo. Essencialmente, a `Subscription` permite que o `Subscriber` controle o fluxo de dados que recebe do `Publisher`, oferecendo mecanismos para gerenciar backpressure, ou seja, a capacidade de lidar com o excesso de dados que o `Subscriber` pode não ser capaz de processar imediatamente.

#### Estrutura

A interface `Subscription` é definida no pacote `java.util.concurrent.Flow` e tem a seguinte estrutura:

```java
public interface Subscription {
  void request(long n);
  void cancel();
}
```

Cada método tem um papel específico:

- **`request(long n)`**: Este método é usado pelo `Subscriber` para solicitar ao `Publisher` que envie mais `n` itens. Isso oferece ao `Subscriber` um meio de controlar a quantidade de dados que deseja receber e processar. O uso desse método é uma parte fundamental do controle de backpressure, pois permite que o `Subscriber` evite ser sobrecarregado por dados.
- **`cancel()`**: Este método permite que o `Subscriber` cancele a subscrição a qualquer momento. Isso é útil se o `Subscriber` não precisar de mais dados ou se desejar terminar a subscrição devido a uma condição de erro ou outra lógica de negócios.

#### Funcionamento

Quando um `Subscriber` se inscreve em um `Publisher`, o método `onSubscribe` do `Subscriber` é chamado, passando uma instância de `Subscription` como argumento. O `Subscriber` pode então usar essa `Subscription` para solicitar ou cancelar dados:
- **Solicitação de dados**: O `Subscriber` pode solicitar uma quantidade específica de itens do `Publisher` chamando `request(n)`. Isso dá ao `Subscriber` controle sobre a velocidade com que os dados são consumidos.
- **Cancelamento da subscrição**: Se o `Subscriber` não deseja mais receber dados, ele pode chamar `cancel()` para cancelar a subscrição. Após o cancelamento, o `Publisher` deve parar de enviar itens para esse `Subscriber`.

#### Exemplo de uso

```java
public class MySubscriber<T> implements Subscriber<T> {
  private Subscription subscription;

  @Override
  public void onSubscribe(Subscription subscription) {
    this.subscription = subscription;
    subscription.request(1); // Solicita um item inicialmente
  }

  @Override
  public void onNext(T item) {
    processItem(item);
    subscription.request(1); // Solicita mais um item após processar o atual
  }

  @Override
  public void onError(Throwable t) {
    t.printStackTrace();
  }

  @Override
  public void onComplete() {
    System.out.println("Processamento concluído");
  }

  private void processItem(T item) {
    // Lógica de processamento do item
  }
}
```

Neste exemplo, o `Subscriber` solicita itens um a um, processando cada um antes de solicitar o próximo. Isso demonstra o controle de fluxo e backpressure em ação.

#### Importância na programação reativa

A `Subscription` é fundamental na programação reativa, pois:

- Permite controle fino sobre o fluxo de dados, evitando que o `Subscriber` seja sobrecarregado.
- Facilita a implementação de backpressure, um aspecto crucial na construção de aplicações reativas eficientes e resilientes.
- Proporciona flexibilidade ao `Subscriber` para gerenciar dinamicamente como os dados são recebidos e processados.

### A interface Processor
[[Topo]](#)<br />

A interface `Processor` é uma parte da Java Flow API, incluída na implementação do padrão Reactive Streams no Java. Esta interface desempenha um papel duplo no modelo de programação reativa: ela atua tanto como `Subscriber` quanto como `Publisher`. Em outras palavras, um `Processor` se inscreve em um `Publisher`, processa os dados recebidos e, em seguida, publica ou emite esses dados processados para seus próprios `Subscribers`.

#### Estrutura

A interface `Processor` é definida no pacote `java.util.concurrent.Flow` e estende tanto a `Publisher` quanto a `Subscriber`:

```java
public interface Processor<T, R> extends Subscriber<T>, Publisher<R> {
  // Métodos de Subscriber e Publisher são herdados
}
```

Onde `T` representa o tipo de dado de entrada que o `Processor` vai receber (como um `Subscriber`) e `R` é o tipo de dado de saída que ele vai emitir (como um `Publisher`).

#### Função

A principal função de um `Processor` é atuar como um intermediário em um fluxo de dados reativo. Ele recebe dados de um `Publisher`, aplica algum tipo de transformação ou processamento a esses dados e, em seguida, passa os dados transformados adiante.

Por exemplo, um `Processor` pode receber inteiros, aplicar uma função que dobra seus valores e então emitir esses valores dobrados para os `Subscribers`.

#### Exemplo de implementação

Aqui está um exemplo simples de como um `Processor` pode ser implementado:

```java
import java.util.concurrent.Flow.*;

public class SimpleProcessor implements Processor<Integer, Integer> {
  private Subscriber<? super Integer> subscriber;

  @Override
  public void subscribe(Subscriber<? super Integer> subscriber) {
    this.subscriber = subscriber;
  }

  @Override
  public void onSubscribe(Subscription subscription) {
    // Delegar para o Subscriber
    subscriber.onSubscribe(subscription);
  }

  @Override
  public void onNext(Integer item) {
    // Processa o item (por exemplo, dobrando o valor)
    int processedItem = item * 2;

    // Publica o item processado
    subscriber.onNext(processedItem);
  }

  @Override
  public void onError(Throwable throwable) {
    // Delegar para o Subscriber
    subscriber.onError(throwable);
  }

  @Override
  public void onComplete() {
    // Delegar para o Subscriber
    subscriber.onComplete();
  }
}
```

Neste exemplo, o `SimpleProcessor` é um `Processor` que simplesmente dobra o valor dos inteiros recebidos e os repassa.

#### Importância na programação reativa

O `Processor` é importante na programação reativa pois:

- Fornece uma maneira de construir componentes que não só consomem dados, mas também os transformam e os emitem, facilitando a criação de cadeias de processamento de dados complexas.
- Permite a criação de abstrações de processamento personalizadas, onde a lógica específica pode ser encapsulada e reutilizada.
- Ajuda a manter a natureza reativa dos dados ao longo de todo o fluxo de processamento, assegurando que o padrão de backpressure e a natureza não bloqueante sejam mantidos.

### Quando usar o Processor
[[Topo]](#)<br />

A interface `Processor` na programação reativa, que atua tanto como `Subscriber` quanto como `Publisher`, deve ser usada em cenários onde você precisa de um componente que não apenas consuma dados de um fluxo, mas também os transforme ou manipule antes de passá-los adiante. Em outras palavras, um `Processor` é útil quando você precisa atuar como um intermediário em um pipeline de processamento de dados reativo.

#### Cenários para usar um Processor

- **Transformação de dados**: Quando você precisa aplicar uma transformação aos dados recebidos antes de enviá-los para o próximo estágio. Por exemplo, converter dados de um formato para outro, aplicar um filtro, ou realizar cálculos.
- **Agir como um buffer ou adaptador**: Em situações onde você precisa armazenar temporariamente dados ou adaptá-los de uma forma para outra para corresponder às expectativas do próximo `Subscriber` na cadeia.
- **Orquestração de fluxos de dados**: Quando você está combinando ou orquestrando múltiplos fluxos de dados, um `Processor` pode ser utilizado para gerenciar como esses fluxos interagem, como mesclar ou zipar múltiplos fluxos.
- **Controle de estado**: Em cenários onde é necessário manter e atualizar um estado com base nos dados recebidos, antes de emitir eventos ou dados subsequentes.
- **Condicional e lógica de negócios complexa**: Quando a lógica de processamento de dados é complexa ou condicional, o `Processor` permite encapsular essa complexidade e tomar decisões baseadas nos dados recebidos antes de passá-los adiante.

#### Considerações ao usar Processor

- **Complexidade adicional**: Embora `Processors` sejam poderosos, eles também adicionam complexidade ao seu fluxo de dados. É importante garantir que essa complexidade adicional seja justificada pela funcionalidade que o `Processor` traz.
- **Gerenciamento de backpressure**: Como um `Processor` é tanto um `Subscriber` quanto um `Publisher`, ele precisa lidar adequadamente com o backpressure, tanto na recepção de dados (como um `Subscriber`) quanto na emissão de dados (como um `Publisher`).
- **Alternativas**: Em muitos casos, as operações de transformação ou lógica de negócios podem ser realizadas usando operadores diretamente nos `Publishers` (como `map`, `filter`, `flatMap` em bibliotecas como RxJava ou Project Reactor). Nestes casos, pode ser mais simples e mais claro usar esses operadores em vez de criar um `Processor` personalizado. A escolha por um `Processor` deve ser feita quando essas abordagens mais diretas não são suficientes para atender suas necessidades.

#### Exemplo de uso

Um exemplo de uso de um `Processor` pode ser um cenário onde você está recebendo dados de um sensor em formato bruto, precisa processá-los (por exemplo, normalizar ou filtrar esses dados) e, em seguida, passar os dados processados para outro componente do sistema que realiza mais análises ou armazena os resultados.

```java
public class DataProcessor extends SubmissionPublisher<ProcessedData> implements Flow.Processor<RawData, ProcessedData> {
  private Subscription subscription;

  @Override
  public void onSubscribe(Subscription subscription) {
    this.subscription = subscription;
    subscription.request(1);
  }

  @Override
  public void onNext(RawData item) {
    ProcessedData processed = processItem(item);
    submit(processed); // Emitir dados processados para os subscribers
    subscription.request(1); // Solicitar o próximo item
  }

  private ProcessedData processItem(RawData item) {
    // Implementar lógica de processamento
  }

  // Implementar onError e onComplete conforme necessário
}
```

Neste exemplo, o `DataProcessor` é um `Processor` que recebe `RawData`, processa esses dados e emite `ProcessedData`.

#### Conclusão

O uso de um `Processor` deve ser considerado quando há uma necessidade clara de um componente que atue tanto como consumidor quanto como produtor em um fluxo de dados reativo, especialmente quando esse componente precisa realizar transformações ou manipulações nos dados que passam por ele. No entanto, sempre avalie se a complexidade adicional de um `Processor` é justificada em comparação com abordagens mais simples usando operadores reativos padrão.
