# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Instant, LocalDateTime e ZonedDateTime
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [02_arquivos](./02_arquivos/)
- Projetos
  - [Projeto 1](./02_arquivos/proj_01/) [(iniciado em)](#javatimeinstant)
- Conteúdo
  - [JSR 310](#jsr-310)
  - [Visão geral do pacote java.time](#visão-geral-do-pacote-javatime)
  - [Classificação](#classificação)
  - [Visão geral do pacote java.time.temporal](#visão-geral-do-pacote-javatimetemporal)
  - [java.time.Instant](#javatimeinstant)
  - [java.time.Clock](#javatimeclock)
  - [java.time.LocalDateTime](#javatimelocaldatetime)
  - [java.time.ZonedDateTime](#javatimezoneddatetime)
  - [java.time.OffsetDateTime](#javatimeoffsetdatetime)
  - [java.time.Duration](#javatimeduration)
  - [java.time.Period](#javatimeperiod)

### JSR 310
[[Topo]](#)<br />

JSR 310 é uma especificação para a API de data e hora no Java, conhecida oficialmente como "Date and Time API". Foi introduzida no Java 8 e é um dos avanços mais significativos na linguagem Java para o tratamento de datas e horas. O principal objetivo da JSR 310 era superar as limitações e problemas das classes de data e hora antigas (`java.util.Date` e `java.util.Calendar`) e fornecer uma API mais robusta, imutável, clara e eficiente.

#### Principais características da JSR 310

- **Imutabilidade**: As principais classes da API são imutáveis e thread-safe, evitando muitos dos problemas associados à mutabilidade das classes `Date` e `Calendar`.
- **Clareza e facilidade de uso**: A API é projetada para ser mais intuitiva e fácil de entender e usar, com métodos bem definidos para operações comuns de data e hora.
- **Separando preocupações**: A API separa claramente as preocupações entre as várias funcionalidades, como data, hora, data e hora, zonas de tempo, instantes (timestamps), durações e períodos.
- **Suporte a fusos Horários e localidades**: Fornece classes e métodos extensivos para lidar com diferentes fusos horários e localidades, tornando o trabalho com datas e horas em contextos internacionais muito mais simples.
- **Precisão e flexibilidade**: Oferece suporte para segundos e nanossegundos, oferecendo maior precisão. Também fornece flexibilidade para definir e trabalhar com diferentes calendários.

#### Principais classes da JSR 310

Algumas das principais classes introduzidas pela JSR 310 são:

- `LocalDate`: Representa uma data sem hora e fuso horário (ano, mês, dia).
- `LocalTime`: Representa uma hora sem data e fuso horário (hora, minuto, segundo, nanossegundo).
- `LocalDateTime`: Combina `LocalDate` e `LocalTime`, representando uma data e hora sem fuso horário.
- `ZonedDateTime`: Representa uma data e hora completa com fuso horário.
- `Instant`: Representa um ponto específico no tempo na linha do tempo GMT/UTC.
- `Duration` e `Period`: Representam quantidades de tempo. `Duration` é usada para quantidades de tempo baseadas em horas, minutos e segundos, enquanto `Period` lida com anos, meses e dias.

#### Importância da JSR 310

A introdução da JSR 310 no Java 8 foi uma mudança significativa e muito necessária para o trabalho com datas e horas na linguagem Java. Ela endereçou as deficiências das abordagens anteriores e alinhou o Java com outras linguagens modernas em termos de fornecer uma API de data e hora poderosa e fácil de usar. Além disso, ela tem sido fundamental para aplicações que requerem manipulação precisa e complexa de datas e horas, especialmente aquelas que operam em um contexto global.

### Visão geral do pacote java.time
[[Topo]](#)<br />

O pacote `java.time`, introduzido no Java 8, é uma vasta melhoria na manipulação de data e hora em Java. Ele foi projetado para superar as limitações e problemas das antigas classes `Date` e `Calendar`, oferecendo uma abordagem mais clara, consistente e imutável. Aqui está uma visão geral das principais características e classes do pacote `java.time`.

#### Características do pacote java.time

- **Imutabilidade**: As classes no pacote `java.time` são imutáveis e thread-safe, evitando problemas comuns com mutabilidade.
- **Clareza na API**: A API é intuitiva e bem projetada, tornando operações com data e hora mais claras e menos propensas a erros.
- **Separação de conceitos**: Diferentes aspectos de datas e horas são claramente separados, como data, hora, fuso horário, duração e períodos.
- **Precisão de nanossegundos**: Suporte a datas e horas com precisão de nanossegundos.
- **Adequação para novas e velhas aplicações**: Projetada tanto para novas aplicações quanto para melhorar o código legado.

#### Principais classes do pacote java.time

- **LocalDate**: Representa uma data sem hora e fuso horário (apenas ano, mês, dia). Útil para aniversários, dias de feriado, etc.
- **LocalTime**: Representa uma hora sem data e fuso horário (hora, minuto, segundo, nanossegundo).
- **LocalDateTime**: Combina `LocalDate` e `LocalTime`, representando uma data e hora sem fuso horário.
- **ZonedDateTime**: Extende `LocalDateTime` com suporte a fuso horário. É útil para todas as situações onde o fuso horário é importante.
- **Instant**: Representa um ponto específico no tempo na linha do tempo UTC. Pode ser usado para marcar eventos no tempo.
- **Duration e Period**: `Duration` é usada para quantidades de tempo baseadas em horas, minutos e segundos, enquanto `Period` lida com quantidades baseadas em anos, meses e dias.
- **ZoneId e ZoneOffset**: `ZoneId` representa um fuso horário, enquanto `ZoneOffset` é a diferença de tempo (offset) de Greenwich/UTC.
- **DateTimeFormatter**: Para formatação e análise de datas e horas. É flexível e substitui a `SimpleDateFormat`.

#### Exemplo de uso

```java
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class JavaTimeExample {
  public static void main(String[] args) {
    LocalDate date = LocalDate.now();
    LocalTime time = LocalTime.now();
    LocalDateTime dateTime = LocalDateTime.now();
    ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    System.out.println("Date: " + date);
    System.out.println("Time: " + time);
    System.out.println("DateTime: " + dateTime);
    System.out.println("ZonedDateTime: " + zonedDateTime);
    System.out.println("Formatted DateTime: " + dateTime.format(formatter));
  }
}
```

O pacote `java.time` é uma parte essencial do Java moderno para trabalhar com datas e horas, oferecendo uma solução abrangente e robusta para uma ampla gama de necessidades de manipulação de tempo.

### Classificação
[[Topo]](#)<br />

Para melhorar nosso entendimento sobre as classes no pacote java.time, é possível classificá-la em duas categorias, tempo em escala de máquina, e tempo em escala humana.

#### Tempo em escala de máquina

- **Instant**: Um instante em uma linha do tempo
- **Duration**: Uma duração de tempo

#### Tempo em escala humana

- **LocalDate**: Uma data, sem hora
- **LocalTime**: Uma hora, sem data
- **LocalDateTime**: Uma data e hora
- **OffsetTime**: Uma hora e deslocalmento de fuso horário sem data (exemplo 13:45:30.123456789+02:00).
- **OffsetDateTime**: Uma data e hora com deslocamento de fuso horário.
- **ZonedDateTime**: Uma data e hora com deslocamento de fuso horário e fuso horário (exemplo 2007-12-03T10:15:30+01:00 Europe/Paris).
- **ZoneOffset**: Um deslocamento de hora em UTC/GMT.
- **ZoneId**: Um identificador de fuso horário, usado para localizar as regras subjacentes.

### Visão geral do pacote java.time.temporal
[[Topo]](#)<br />

O pacote `java.time.temporal` do Java 8 faz parte da nova API de data e hora e oferece funcionalidades adicionais e de baixo nível para o trabalho com data e hora. Ele é projetado para permitir uma manipulação mais avançada e flexível de datas e horas, indo além das capacidades básicas fornecidas pelo pacote `java.time`.

#### Principais componentes do pacote java.time.temporal

- **Temporal**: É uma interface que define a leitura de um valor temporal, como uma data ou hora. As classes do pacote `java.time`, como `LocalDate`, `LocalTime`, `LocalDateTime`, e `ZonedDateTime`, implementam esta interface.
- **TemporalAdjuster**: Uma interface que representa um algoritmo para ajustar objetos temporais. É útil para realizar cálculos complexos e ajustes de datas, como "próxima quarta-feira" ou "primeiro dia do próximo mês".
- **TemporalField**: Uma interface que representa um campo de uma unidade de tempo, como dia, mês ou ano. Estes campos são usados para obter e definir valores de componentes específicos de uma data ou hora.
- **TemporalUnit**: Uma interface que representa uma unidade de tempo na qual o tempo é medido, como dias, semanas, meses, anos, etc. É usada principalmente em operações de adição ou subtração de tempo.
- **TemporalAmount**: Uma interface para quantidades de tempo, como duração ou período. Ela fornece métodos para adicionar ou subtrair essas quantidades de um objeto temporal.
- **TemporalQuery**: Uma interface que define uma consulta de um objeto temporal. É uma forma poderosa de extrair informações de objetos temporais de forma abstrata.
- **ChronoField e ChronoUnit**: São implementações padrão de `TemporalField` e `TemporalUnit`, respectivamente. `ChronoField` inclui campos como `DAY_OF_MONTH`, enquanto `ChronoUnit` inclui unidades como `DAYS` e `MONTHS`.

#### Exemplo de uso

```java
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class TemporalExample {
  public static void main(String[] args) {
    LocalDate date = LocalDate.now();

    // Adicionando dias usando ChronoUnit
    LocalDate nextWeek = date.plus(1, ChronoUnit.WEEKS);
    System.out.println("Data da próxima semana: " + nextWeek);

    // Ajustando para o primeiro dia do próximo mês
    LocalDate firstDayOfNextMonth = date.with(TemporalAdjusters.firstDayOfNextMonth());
    System.out.println("Primeiro dia do próximo mês: " + firstDayOfNextMonth);
  }
}
```

Este pacote é particularmente útil para desenvolvedores que precisam realizar operações complexas e precisas de data e hora, indo além das operações básicas de data e hora. Ele oferece um alto grau de flexibilidade e permite um controle mais detalhado sobre os aspectos temporais, como ajuste de datas, cálculos baseados em unidades de tempo específicas, e definição e obtenção de campos de data e hora específicos.

### java.time.Instant
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./02_arquivos/proj_01/)

A classe `java.time.Instant` no Java 8 é parte da nova API de data e hora e representa um momento instantâneo na linha do tempo, com precisão de nanossegundos. Essencialmente, é um ponto específico no tempo medido a partir da Epoch do Unix (1 de janeiro de 1970, 00:00:00 UTC). `Instant` é imutável e thread-safe, sendo útil em contextos onde é necessário um registro preciso de um momento no tempo (como timestamps em logs ou para medir duração de eventos).

Aqui estão alguns exemplos de como usar a classe `java.time.Instant`:

#### Obtendo o Instant atual

```java
import java.time.Instant;

public class InstantExample {
  public static void main(String[] args) {
    // Obtém o momento atual
    Instant now = Instant.now();
    System.out.println("Instant Atual: " + now);
  }
}
```

#### Adicionando e subtraindo tempo de um Instant

```java
import java.time.Instant;
import java.time.Duration;

public class InstantExample {
  public static void main(String[] args) {
    Instant now = Instant.now();

    // Adiciona 10 segundos
    Instant later = now.plusSeconds(10);
    System.out.println("10 segundos depois: " + later);

    // Subtrai 5 minutos
    Instant earlier = now.minus(Duration.ofMinutes(5));
    System.out.println("5 minutos antes: " + earlier);
  }
}
```

#### Convertendo entre Instant e outras classes de data e hora

```java
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class InstantExample {
  public static void main(String[] args) {
    Instant now = Instant.now();

    // Convertendo de Instant para LocalDateTime
    LocalDateTime localDateTime = LocalDateTime.ofInstant(now, ZoneId.systemDefault());
    System.out.println("LocalDateTime: " + localDateTime);

    // Convertendo de LocalDateTime para Instant
    Instant instantFromDateTime = localDateTime.atZone(ZoneId.systemDefault()).toInstant();
    System.out.println("Instant: " + instantFromDateTime);
  }
}
```

#### Diferença entre dois Instant

```java
import java.time.Instant;
import java.time.Duration;

public class InstantExample {
  public static void main(String[] args) {
    Instant start = Instant.now();

    // Simula algum processamento
    try {
        Thread.sleep(2000); // 2 segundos
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    Instant end = Instant.now();

    // Calcula a duração entre dois instants
    Duration duration = Duration.between(start, end);
    System.out.println("Duração: " + duration.getSeconds() + " segundos");
  }
}
```

#### Convertendo Instant para timestamp de epoch

```java
import java.time.Instant;

public class InstantExample {
  public static void main(String[] args) {
    Instant now = Instant.now();

    // Converte Instant para timestamp de Epoch (em segundos)
    long epochSecond = now.getEpochSecond();
    System.out.println("Epoch Second: " + epochSecond);

    // Converte Instant para timestamp de Epoch (em milissegundos)
    long epochMilli = now.toEpochMilli();
    System.out.println("Epoch Millisecond: " + epochMilli);
  }
}
```

Esses exemplos demonstram várias operações comuns com `Instant`. Esta classe é fundamental para trabalhar com pontos no tempo em aplicações Java, especialmente para cálculos precisos de duração e registro de eventos.

### java.time.Clock
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./02_arquivos/proj_01/)

A classe `java.time.Clock` no Java 8 é parte da nova API de data e hora e fornece acesso a data e hora corrente. O `Clock` é especialmente útil para testar, pois ele pode ser usado para substituir a data e hora corrente com uma data e hora específica, permitindo que você simule condições de teste específicas.

Um `Clock` abstrai o acesso à fonte de tempo atual, podendo ser usada para obter a data e hora atual de acordo com uma regra, que pode ser o tempo do sistema, uma regra fixa ou uma regra modificada.

Aqui estão alguns exemplos de como usar a classe `java.time.Clock`:

#### Obtendo a hora atual com o relógio padrão

```java
import java.time.Clock;
import java.time.Instant;

public class ClockExample {
  public static void main(String[] args) {
    Clock clock = Clock.systemUTC();
    
    // Obtém a hora atual
    Instant now = clock.instant();
    System.out.println("Hora Atual: " + now);
  }
}
```

#### Usando um relógio fixo para testes

```java
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

public class ClockExample {
  public static void main(String[] args) {
    // Cria um relógio fixo com uma data e hora específica
    Instant specificTime = Instant.parse("2021-01-01T12:00:00Z");
    Clock fixedClock = Clock.fixed(specificTime, ZoneId.of("UTC"));

    // Usa o relógio fixo
    Instant now = fixedClock.instant();
    System.out.println("Hora Fixa: " + now);
  }
}
```

#### Relógio com zona horária específica

```java
import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ClockExample {
  public static void main(String[] args) {
    Clock clock = Clock.system(ZoneId.of("America/New_York"));

    // Obtém a hora atual na zona horária especificada
    ZonedDateTime zonedDateTime = ZonedDateTime.now(clock);
    System.out.println("Hora em Nova York: " + zonedDateTime);
  }
}
```

#### Usando um relógio offset para testes

```java
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;

public class ClockExample {
  public static void main(String[] args) {
    Clock baseClock = Clock.systemUTC();
    // Cria um relógio que está cinco minutos à frente
    Clock offsetClock = Clock.offset(baseClock, Duration.ofMinutes(5));

    Instant baseInstant = baseClock.instant();
    Instant offsetInstant = offsetClock.instant();
    
    System.out.println("Hora Base: " + baseInstant);
    System.out.println("Hora Offset: " + offsetInstant);
  }
}
```

#### Comparando dois relógios

```java
import java.time.Clock;
import java.time.Instant;

public class ClockExample {
  public static void main(String[] args) {
    Clock clock1 = Clock.systemUTC();
    Clock clock2 = Clock.systemDefaultZone();

    Instant instant1 = clock1.instant();
    Instant instant2 = clock2.instant();

    System.out.println("Instante 1: " + instant1);
    System.out.println("Instante 2: " + instant2);

    boolean isSameInstant = instant1.equals(instant2);
    System.out.println("Mesmo Instante? " + isSameInstant);
  }
}
```

Esses exemplos demonstram o uso da classe `java.time.Clock` para obter a data e hora atual, para testes com tempos fixos ou offsets, e para trabalhar com zonas horárias. A flexibilidade do `Clock` torna-o uma ferramenta valiosa, especialmente em ambientes de teste onde a manipulação do tempo é necessária.

### java.time.LocalDateTime
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./02_arquivos/proj_01/)

A classe `java.time.LocalDateTime` no Java 8 faz parte da nova API de data e hora e representa uma data e hora sem informações de fuso horário. Essa classe é usada quando você precisa trabalhar com data e hora, mas o fuso horário não é relevante ou necessário. Ela combina a funcionalidade das classes `LocalDate` e `LocalTime`.

Aqui estão alguns exemplos de como usar a classe `java.time.LocalDateTime`:

#### Obtendo a data e hora atuais

```java
import java.time.LocalDateTime;

public class LocalDateTimeExample {
  public static void main(String[] args) {
    // Obtém a data e hora atuais
    LocalDateTime now = LocalDateTime.now();
    System.out.println("Data e Hora Atuais: " + now);
  }
}
```

#### Criando uma instância de localdatetime

```java
import java.time.LocalDateTime;

public class LocalDateTimeExample {
  public static void main(String[] args) {
    // Cria uma instância específica de LocalDateTime
    LocalDateTime dateTime = LocalDateTime.of(2021, 1, 1, 12, 0);
    System.out.println("Data e Hora Específicas: " + dateTime);
  }
}
```

#### Adicionando e subtraindo tempo

```java
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeExample {
  public static void main(String[] args) {
    LocalDateTime dateTime = LocalDateTime.now();

    // Adiciona 5 dias e 2 horas à data e hora atuais
    LocalDateTime futureDateTime = dateTime.plusDays(5).plusHours(2);
    System.out.println("Data e Hora Futuras: " + futureDateTime);

    // Subtrai 1 mês da data e hora atuais
    LocalDateTime pastDateTime = dateTime.minus(1, ChronoUnit.MONTHS);
    System.out.println("Data e Hora Passadas: " + pastDateTime);
  }
}
```

#### Alterando componentes específicos

```java
import java.time.LocalDateTime;

public class LocalDateTimeExample {
  public static void main(String[] args) {
    LocalDateTime dateTime = LocalDateTime.now();

    // Altera o ano e o mês
    LocalDateTime changedDateTime = dateTime.withYear(2023).withMonth(12);
    System.out.println("Data e Hora Alteradas: " + changedDateTime);
  }
}
```

#### Convertendo entre LocalDateTime e LocalDate/LocalTime

```java
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class LocalDateTimeExample {
  public static void main(String[] args) {
    LocalDate date = LocalDate.now();
    LocalTime time = LocalTime.now();

    // Combina LocalDate e LocalTime para formar LocalDateTime
    LocalDateTime dateTime = LocalDateTime.of(date, time);
    System.out.println("LocalDateTime Combinado: " + dateTime);
  }
}
```

#### Formatação e análise de data e hora

```java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {
  public static void main(String[] args) {
    LocalDateTime dateTime = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    // Formata a data e hora
    String formattedDateTime = dateTime.format(formatter);
    System.out.println("Data e Hora Formatadas: " + formattedDateTime);

    // Analisa a string para LocalDateTime
    LocalDateTime parsedDateTime = LocalDateTime.parse(formattedDateTime, formatter);
    System.out.println("Data e Hora Analisadas: " + parsedDateTime);
  }
}
```

`LocalDateTime` é uma das classes mais importantes na API de data e hora do Java 8, oferecendo uma ampla gama de funcionalidades para trabalhar com datas e horas de maneira eficiente e precisa.

### java.time.ZonedDateTime
[[Topo]](#)<br />

A classe `java.time.ZonedDateTime` do Java 8, parte do pacote `java.time`, representa uma data e hora completa com informações de fuso horário. Ela é essencial para situações onde você precisa lidar com datas e horas considerando diferentes fusos horários, por exemplo, em aplicações que operam globalmente.

#### Características principais

- **Data e hora com fuso horário**: Combina `LocalDateTime` com `ZoneId` para lidar com fusos horários.
- **Imutabilidade**: Objetos `ZonedDateTime` são imutáveis e thread-safe.
- **Conversão de fuso horário**: Permite manipular a data e hora em um fuso horário e converter facilmente para outro.

#### Exemplos de uso da classe ZonedDateTime

##### Obtendo a data e hora atual em um fuso horário específico

```java
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class ZonedDateTimeExample {
  public static void main(String[] args) {
    // Obtém a data e hora atuais no fuso horário de Nova York
    ZonedDateTime zonedDateTimeNY = ZonedDateTime.now(ZoneId.of("America/New_York"));
    System.out.println("Data e Hora em Nova York: " + zonedDateTimeNY);
  }
}
```

##### Convertendo entre fusos horários

```java
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class ZonedDateTimeExample {
  public static void main(String[] args) {
    ZonedDateTime zonedDateTimeLondon = ZonedDateTime.now(ZoneId.of("Europe/London"));

    // Converte de Londres para o fuso horário de Tóquio
    ZonedDateTime zonedDateTimeTokyo = zonedDateTimeLondon.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
    System.out.println("Hora em Tóquio: " + zonedDateTimeTokyo);
  }
}
```

##### Criando uma instância de ZonedDateTime a partir de componentes

```java
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.LocalDateTime;

public class ZonedDateTimeExample {
  public static void main(String[] args) {
    // Cria um objeto LocalDateTime
    LocalDateTime localDateTime = LocalDateTime.of(2021, 1, 1, 15, 30);

    // Cria um ZonedDateTime a partir do LocalDateTime e ZoneId
    ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("Europe/Paris"));
    System.out.println("Data e Hora em Paris: " + zonedDateTime);
  }
}
```

##### Formatação de ZonedDateTime

```java
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;

public class ZonedDateTimeExample {
  public static void main(String[] args) {
    ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss z");

    // Formata a data e hora com o fuso horário
    String formattedDateTime = zonedDateTime.format(formatter);
    System.out.println("Data e Hora Formatada em Los Angeles: " + formattedDateTime);
  }
}
```

##### Manipulando ZonedDateTime

```java
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class ZonedDateTimeExample {
  public static void main(String[] args) {
    ZonedDateTime zonedDateTime = ZonedDateTime.now();

    // Adiciona 5 horas à data e hora
    ZonedDateTime fiveHoursLater = zonedDateTime.plusHours(5);

    // Subtrai 30 dias
    ZonedDateTime thirtyDaysEarlier = zonedDateTime.minus(30, ChronoUnit.DAYS);

    System.out.println("5 horas depois: " + fiveHoursLater);
    System.out.println("30 dias antes: " + thirtyDaysEarlier);
  }
}
```

`ZonedDateTime` é uma das classes-chave para o trabalho com data e hora em aplicações Java, especialmente quando se lida com fusos horários diferentes. Ela oferece funcionalidades robustas para representar, manipular e converter datas e horas em diferentes zonas geográficas.

### java.time.OffsetDateTime
[[Topo]](#)<br />

A classe `java.time.OffsetDateTime` no Java 8, parte do pacote `java.time`, representa uma data e hora com um deslocamento de fuso horário (offset) do UTC/Greenwich. Diferente de `ZonedDateTime`, que é uma combinação de `LocalDateTime` e `ZoneId`, `OffsetDateTime` combina `LocalDateTime` com `ZoneOffset`. É útil quando você precisa manter o offset do UTC em suas operações de data e hora, como no armazenamento de timestamps em bancos de dados ou na comunicação entre diferentes sistemas que requerem o offset.

#### características principais

- **Data e hora com offset**: Armazena a data e a hora junto com o offset do UTC, mas sem um identificador de zona horária.
- **Imutabilidade**: Assim como outras classes do pacote `java.time`, `OffsetDateTime` é imutável e thread-safe.
- **Adequado para armazenamento de timestamps**: Muito usado para registrar timestamps em aplicações e sistemas.

#### Exemplos de uso da classe OffsetDateTime

##### Obtendo a data e hora atuais com offset

```java
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeExample {
  public static void main(String[] args) {
    // Obtém a data e hora atuais com o offset padrão do sistema
    OffsetDateTime now = OffsetDateTime.now();
    System.out.println("Data e Hora Atuais com Offset: " + now);
  }
}
```

##### Especificando um offset

```java
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeExample {
  public static void main(String[] args) {
    // Cria um OffsetDateTime com um offset específico (+02:00 horas do UTC)
    OffsetDateTime dateTimeWithOffset = OffsetDateTime.now(ZoneOffset.ofHours(2));
    System.out.println("Data e Hora com Offset Específico: " + dateTimeWithOffset);
  }
}
```

##### Convertendo entre OffsetDateTime e LocalDateTime

```java
import java.time.OffsetDateTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeExample {
  public static void main(String[] args) {
    OffsetDateTime offsetDateTime = OffsetDateTime.now();

    // Converte OffsetDateTime para LocalDateTime (perdendo informações do offset)
    LocalDateTime localDateTime = offsetDateTime.toLocalDateTime();
    System.out.println("LocalDateTime: " + localDateTime);

    // Converte LocalDateTime para OffsetDateTime
    OffsetDateTime fromLocalDateTime = localDateTime.atOffset(ZoneOffset.UTC);
    System.out.println("OffsetDateTime: " + fromLocalDateTime);
  }
}
```

##### Manipulação de OffsetDateTime

```java
import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;

public class OffsetDateTimeExample {
  public static void main(String[] args) {
    OffsetDateTime offsetDateTime = OffsetDateTime.now();

    // Adiciona horas e dias ao OffsetDateTime
    OffsetDateTime futureDateTime = offsetDateTime.plusHours(2).plusDays(1);
    System.out.println("Data e Hora Futuras: " + futureDateTime);

    // Subtrai meses do OffsetDateTime
    OffsetDateTime pastDateTime = offsetDateTime.minus(1, ChronoUnit.MONTHS);
    System.out.println("Data e Hora Passadas: " + pastDateTime);
  }
}
```

##### Formatação de OffsetDateTime

```java
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class OffsetDateTimeExample {
  public static void main(String[] args) {
    OffsetDateTime offsetDateTime = OffsetDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss O");

    // Formata OffsetDateTime
    String formattedDateTime = offsetDateTime.format(formatter);
    System.out.println("Data e Hora Formatadas: " + formattedDateTime);
  }
}
```

`OffsetDateTime` é uma escolha ideal para aplicações que necessitam rastrear a data e hora junto com o offset do UTC, mantendo a precisão temporal em contextos globais.

### java.time.Duration
[[Topo]](#)<br />

A classe `java.time.Duration` no Java 8, parte do pacote `java.time`, é usada para modelar uma quantidade de tempo em termos de segundos e nanossegundos. `Duration` é principalmente usada para trabalhar com tempo baseado em máquina, como duração de eventos ou medidas de tempo. É uma forma eficaz de representar diferenças de tempo com alta precisão.

#### características principais

- **Precisão**: Armazena a duração em segundos e nanossegundos, fornecendo alta precisão.
- **Imutabilidade**: Assim como outras classes do pacote `java.time`, `Duration` é imutável.
- **Manipulação de tempo**: Permite adicionar, subtrair, e calcular a duração entre objetos de tempo.

#### Exemplos de uso da classe Duration

##### Criando uma duração

```java
import java.time.Duration;

public class DurationExample {
  public static void main(String[] args) {
    // Cria uma duração de 5 horas
    Duration duration = Duration.ofHours(5);
    System.out.println("Duração: " + duration);

    // Cria uma duração de 30 minutos
    Duration thirtyMinutes = Duration.ofMinutes(30);
    System.out.println("30 minutos: " + thirtyMinutes);
  }
}
```

##### Convertendo duração para diferentes unidades

```java
import java.time.Duration;

public class DurationExample {
  public static void main(String[] args) {
    duration duration = duration.ofminutes(90);

    // converte para horas
    long hours = duration.tohours();
    system.out.println("horas: " + hours);

    // converte para minutos
    long minutes = duration.tominutes();
    system.out.println("minutos: " + minutes);
  }
}
```

##### Adicionando e subtraindo duração

```java
import java.time.Duration;

public class DurationExample {
  public static void main(String[] args) {
    Duration duration = Duration.ofHours(2);

    // Adiciona 30 minutos
    Duration moreDuration = duration.plusMinutes(30);
    System.out.println("Mais 30 minutos: " + moreDuration);

    // Subtrai 15 minutos
    Duration lessDuration = duration.minusMinutes(15);
    System.out.println("Menos 15 minutos: " + lessDuration);
}
}
```

##### Calculando a duração entre dois momentos

```java
import java.time.Duration;
import java.time.Instant;

public class DurationExample {
  public static void main(String[] args) {
    Instant start = Instant.now();

    // Simula algum processamento
    try {
        Thread.sleep(5000); // 5 segundos
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    Instant end = Instant.now();

    // Calcula a duração entre os dois instantes
    Duration duration = Duration.between(start, end);
    System.out.println("Duração: " + duration.getSeconds() + " segundos");
  }
}
```

##### Negando uma duração

```java
import java.time.Duration;

public class DurationExample {
  public static void main(String[] args) {
    Duration duration = Duration.ofMinutes(10);

    // Negando a duração
    Duration negativeDuration = duration.negated();
    System.out.println("Duração Negada: " + negativeDuration);
  }
}
```

`Duration` é uma ferramenta poderosa para trabalhar com medidas de tempo, especialmente útil em aplicações que requerem cálculos de tempo precisos, como cronômetros, temporizadores, ou para medir a duração de eventos.

### java.time.Period
[[Topo]](#)<br />

A classe `java.time.Period` no Java 8, que faz parte do pacote `java.time`, é usada para representar uma quantidade de tempo em termos de anos, meses e dias. Diferente da classe `Duration`, que é usada para quantidades de tempo baseadas em horas, minutos e segundos, `Period` é mais adequada para medir quantidades de tempo em um contexto de calendário.

#### Características principais

- **Medição de tempo baseada em calendário**: Representa uma duração em termos de anos, meses e dias.
- **Imutabilidade**: Assim como outras classes do pacote `java.time`, `Period` é imutável.
- **Adequada para trabalhar com datas**: Ideal para cálculos de datas, como diferença entre datas ou adicionar/subtrair períodos a uma data.

#### Exemplos de uso da classe Period

##### Criando um Period

```java
import java.time.Period;

public class PeriodExample {
  public static void main(String[] args) {
    // Cria um período de 1 ano, 2 meses e 3 dias
    Period period = Period.of(1, 2, 3);
    System.out.println("Período: " + period);
  }
}
```

##### Adicionando um Period a uma data

```java
import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {
  public static void main(String[] args) {
    LocalDate date = LocalDate.now();
    Period period = Period.ofDays(10); // 10 dias

    // Adiciona o período à data
    LocalDate newDate = date.plus(period);
    System.out.println("Nova Data: " + newDate);
  }
}
```

##### Calculando a diferença entre duas datas

```java
import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {
  public static void main(String[] args) {
    LocalDate start = LocalDate.of(2020, 1, 1);
    LocalDate end = LocalDate.of(2021, 1, 1);

    // Calcula o período entre duas datas
    Period period = Period.between(start, end);
    System.out.println("Período: " + period.getYears() + " anos");
  }
}
```

##### Negando um Period

```java
import java.time.Period;

public class PeriodExample {
  public static void main(String[] args) {
    Period period = Period.ofMonths(6);

    // Negando o período
    Period negativePeriod = period.negated();
    System.out.println("Período Negado: " + negativePeriod);
  }
}
```

##### Obtendo componentes de um Period

```java
import java.time.Period;

public class PeriodExample {
  public static void main(String[] args) {
    Period period = Period.of(2, 5, 10); // 2 anos, 5 meses e 10 dias

    // Obtendo componentes do período
    System.out.println("Anos: " + period.getYears());
    System.out.println("Meses: " + period.getMonths());
    System.out.println("Dias: " + period.getDays());
  }
}
```

`Period` é útil para cálculos que envolvem datas em um calendário, como idade, aniversários, ou intervalos de tempo expressos em termos de dias, meses e anos. É uma ferramenta essencial para situações onde a precisão baseada em calendário é necessária.
