# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## 23.1. Padrões de tempo (GMT, UTC), Date, Calendar e TimeZone
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [01_arquivos](./01_arquivos/)
- Projetos
  - [Projeto 1](./01_arquivos/proj_01/) [(iniciado em)](#javautilcalendar)
- Conteúdo
  - [Tempo GMT e UTC](#tempo-gmt-e-utc)
  - [Unix Time e Unix Epoch](#unix-time-e-unix-epoch)
  - [java.util.Calendar](#javautilcalendar)
  - [java.util.Date](#javautildate)
  - [java.text.SimpleDateFormat](#javatextsimpledateformat)
  - [java.util.TimeZone](#javautiltimezone)
  - [Desvantagens ao usar Calendar e Date](#desvantagens-ao-usar-calendar-e-date)

### Tempo GMT e UTC
[[Topo]](#)<br />

GMT (Greenwich Mean Time) e UTC (Coordinated Universal Time) são dois sistemas de tempo amplamente usados que têm funções semelhantes, mas são conceitualmente diferentes.

#### GMT (Greenwich Mean Time)

- **Definição**: GMT é um fuso horário que é usado como referência de tempo em muitas partes do mundo. Era o padrão internacional de tempo civil até ser substituído pelo UTC em 1972.
- **Base**: GMT é baseado no movimento do Sol. Especificamente, é o tempo médio solar no Meridiano de Greenwich, em Londres.
- **Uso**: Antes da adoção do UTC, o GMT era usado como padrão para tempo civil. Hoje, ainda é usado em alguns contextos, principalmente no Reino Unido durante o inverno e como referência em alguns fuso horários.
- **Características**: Não sofre ajustes por segundos intercalares. É efetivamente o mesmo que UTC para a maioria dos propósitos práticos.

#### UTC (Coordinated Universal Time)

- **Definição**: UTC é o padrão de tempo atualmente usado para a hora civil em todo o mundo. É o sucessor do GMT.
- **Base**: UTC é baseado no Tempo Atômico Internacional (TAI), com segundos intercalares adicionados em intervalos irregulares para compensar a desaceleração da rotação da Terra.
- **Uso**: UTC é usado para a coordenação de tempo e frequência em todo o mundo. Todos os fuso horários são definidos em relação ao UTC.
- **Características**: É mais preciso que o GMT, pois é baseado em relógios atômicos. Segundos intercalares são adicionados (ou subtraídos) para manter o UTC dentro de 0,9 segundos do tempo solar médio.

#### Diferenças chave

1. **Base Científica**: GMT é baseado no tempo solar médio, enquanto UTC é baseado no tempo atômico mais preciso e estável, ajustado por segundos intercalares.
2. **Precisão**: UTC é mais preciso devido ao uso de relógios atômicos.
3. **Adoção internacional**: UTC substituiu o GMT como o padrão de tempo civil e é o sistema usado para a maioria das aplicações mundiais.

Em resumo, enquanto o GMT tem suas raízes na astronomia e foi usado historicamente como um padrão de tempo, o UTC é um sistema de tempo mais preciso, baseado em relógios atômicos e ajustado para acompanhar as variações na rotação da Terra.

### Unix Time e Unix Epoch
[[Topo]](#)<br />

O "Unix Time" e a "Unix Epoch" são conceitos fundamentais no mundo da computação, relacionados à forma como os sistemas operacionais Unix (e muitos outros sistemas) medem o tempo.

#### Unix Time

- **Definição**: Unix Time, também conhecido como POSIX time ou Epoch time, é um sistema para descrever instâncias de tempo, definido como o número total de segundos decorridos desde a Unix Epoch, excluindo os segundos intercalares. É uma forma muito comum de rastrear o tempo em computadores e sistemas de programação.
- **Formato**: É geralmente representado como um número inteiro longo (em algumas linguagens de programação), que conta os segundos.
- **Uso**: O Unix Time é amplamente utilizado em sistemas operacionais e aplicações para representar pontos no tempo. É útil para calcular diferenças de tempo e para armazenar ou representar timestamps de forma eficiente.

#### Unix Epoch

- **Definição**: A Unix Epoch é o ponto de partida usado para calcular o tempo Unix. É o momento em que o tempo Unix começa a contar.
- **Data e hora da epoch**: A época do Unix é definida como 00:00:00 UTC em 1º de janeiro de 1970. Não é uma data escolhida arbitrariamente, mas sim uma convenção padrão adotada para marcar o início da era Unix.
- **Importância**: A escolha da Unix Epoch facilita a representação de datas/horas, pois permite representar qualquer ponto no tempo como um único número inteiro - o número de segundos desde a Epoch.

#### Considerações adicionais

- **Segundos intercalares**: O Unix Time não leva em consideração os segundos intercalares (segundos adicionados ocasionalmente para sincronizar os relógios com a rotação da Terra). Isso significa que o Unix Time pode estar ligeiramente fora de sincronia com o tempo solar médio.
- **Limitações**: O formato mais comum do Unix Time, um inteiro de 32 bits, terá o problema conhecido como "Problema do Ano 2038", onde o valor máximo que pode ser representado (2^31-1) será alcançado em 19 de janeiro de 2038. Após este ponto, sem uma atualização para um formato de 64 bits (já em uso em muitos sistemas), o contador retornará para valores negativos, potencialmente causando falhas em softwares não atualizados.

O Unix Time é um conceito fundamental na computação e continua sendo uma maneira padrão de gerenciar e calcular o tempo em sistemas de software.

### java.util.Calendar
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./01_arquivos/proj_01/)

A classe `Calendar` em Java é uma classe abstrata que fornece métodos para converter tempo entre um momento específico e um conjunto de campos de calendário, como ANO, MÊS, DIA, HORA, etc. Ela também manipula a data e a hora com base no calendário específico do sistema.

A partir do Java 8, embora a classe `Calendar` ainda seja usada, é recomendável usar as novas classes do pacote `java.time`, como `LocalDateTime`, `ZonedDateTime`, `Instant`, etc., por serem mais robustas e menos propensas a erros. No entanto, se você precisa trabalhar com `Calendar`, aqui estão alguns exemplos básicos de seu uso:

#### Criando uma instância de Calendar

```java
import java.util.Calendar;

public class CalendarExample {
  public static void main(String[] args) {
    // Obtém uma instância de Calendar
    Calendar calendar = Calendar.getInstance();

    // Imprime a data e a hora atual
    System.out.println("Data e Hora Atual: " + calendar.getTime());
  }
}
```

#### Acessando campos de Calendar

```java
import java.util.Calendar;

public class CalendarExample {
  public static void main(String[] args) {
    Calendar calendar = Calendar.getInstance();

    // Acessando campos individuais
    int year = calendar.get(Calendar.YEAR);
    int month = calendar.get(Calendar.MONTH); // Mês começa do 0 (Janeiro)
    int day = calendar.get(Calendar.DAY_OF_MONTH);

    System.out.println("Ano: " + year);
    System.out.println("Mês: " + month);
    System.out.println("Dia: " + day);
  }
}
```

#### Configurando data/hora em um Calendar

```java
import java.util.Calendar;

public class CalendarExample {
  public static void main(String[] args) {
    Calendar calendar = Calendar.getInstance();

    // Definindo uma data específica: 1º de Janeiro de 2022
    calendar.set(Calendar.YEAR, 2022);
    calendar.set(Calendar.MONTH, Calendar.JANUARY); // Mês é baseado em 0
    calendar.set(Calendar.DAY_OF_MONTH, 1);

    System.out.println("Data Configurada: " + calendar.getTime());
  }
}
```

#### Manipulando data/hora

```java
import java.util.Calendar;

public class CalendarExample {
  public static void main(String[] args) {
    Calendar calendar = Calendar.getInstance();

    // Adiciona 5 dias à data atual
    calendar.add(Calendar.DAY_OF_MONTH, 5);

    // Subtrai 2 meses da data atual
    calendar.add(Calendar.MONTH, -2);

    System.out.println("Data Manipulada: " + calendar.getTime());
  }
}
```
Lembre-se de que a classe `Calendar` é menos intuitiva e mais propensa a erros do que as classes do pacote `java.time`. Sempre que possível, prefira usar `LocalDate`, `LocalDateTime`, `ZonedDateTime` ou outras classes do pacote `java.time` introduzidas no Java 8.

### java.util.Date
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./01_arquivos/proj_01/)

A classe `java.util.Date` em Java representa um ponto específico no tempo, com precisão de milissegundos. No entanto, desde o Java 8, a classe `Date` foi em grande parte substituída pelas classes do pacote `java.time`, como `LocalDate`, `LocalDateTime`, e `ZonedDateTime`, por serem mais robustas, imutáveis e fornecerem uma API mais clara para trabalhar com datas e horas.

Ainda assim, a classe `Date` é utilizada, especialmente em códigos mais antigos ou para fins de compatibilidade. Abaixo estão alguns exemplos básicos do uso da classe `Date`:

#### Criando uma instância de Date

```java
import java.util.Date;

public class DateExample {
  public static void main(String[] args) {
    // Cria uma instância representando o momento atual
    Date now = new Date();
    System.out.println("Data e Hora Atual: " + now);
  }
}
```

#### Date representando um momento específico

```java
import java.util.Date;

public class DateExample {
  public static void main(String[] args) {
    // Cria uma instância de Date para um momento específico
    // 1000000000000L representa um ponto no tempo (em milissegundos desde 1 de janeiro de 1970, 00:00:00 GMT)
    Date specificTime = new Date(1000000000000L);
    System.out.println("Data Específica: " + specificTime);
  }
}
```

#### Comparando duas datas

```java
import java.util.Date;

public class DateExample {
  public static void main(String[] args) {
    Date date1 = new Date();
    Date date2 = new Date(System.currentTimeMillis() + 1000); // 1 segundo no futuro

    boolean isBefore = date1.before(date2);
    boolean isAfter = date1.after(date2);

    System.out.println("date1 é antes de date2? " + isBefore);
    System.out.println("date1 é depois de date2? " + isAfter);
  }
}
```

Esses exemplos mostram operações básicas com a classe `Date`. No entanto, recomenda-se usar as classes do pacote `java.time` para novos projetos ou quando estiver fazendo refatoração, devido à sua maior flexibilidade e precisão.

### java.text.SimpleDateFormat
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./01_arquivos/proj_01/)

A classe `SimpleDateFormat` em Java é uma subclasse concreta de `DateFormat` e é usada para formatar e analisar datas em um contexto sensível ao idioma. Ela permite a formatação (data para texto), a análise (texto para data) e a normalização.

A `SimpleDateFormat` permite que você escolha qualquer padrão de formatação de data e hora ao criar um objeto. No entanto, como a classe `Date` e outras classes de data e hora do pacote `java.util`, `SimpleDateFormat` é problemática em relação à thread-safety, e seu uso não é recomendado em novos projetos onde as classes do pacote `java.time` (introduzido no Java 8) podem ser usadas. Apesar disso, ainda é amplamente utilizada em projetos mais antigos.

Aqui estão alguns exemplos básicos do uso da classe `SimpleDateFormat`:

#### Formatando um Date

```java
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {
  public static void main(String[] args) {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    String date = sdf.format(new Date()); // Formata a data de hoje
    System.out.println("Data Formatada: " + date);
  }
}
```

#### Analisando uma String para um Data

```java
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {
  public static void main(String[] args) {
    try {
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      Date date = sdf.parse("31/12/2020"); // Analisa a string para uma data
      System.out.println("Data Analisada: " + date);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
```

#### Padrões de data e hora complexos

```java
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {
  public static void main(String[] args) {
    SimpleDateFormat sdf = new SimpleDateFormat("EEEE, MMMM dd, yyyy HH:mm:ss");
    String formattedDate = sdf.format(new Date()); // Formata a data e hora atuais
    System.out.println("Data e Hora Formatadas: " + formattedDate);
  }
}
```

#### Definindo localidade (locale)

```java
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatExample {
  public static void main(String[] args) {
    SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd MMMM yyyy", new Locale("pt", "BR"));
    String formattedDate = sdf.format(new Date()); // Formata a data atual em português do Brasil
    System.out.println("Data Formatada em Português: " + formattedDate);
  }
}
```

Esses exemplos mostram como formatar e analisar datas usando diferentes padrões com `SimpleDateFormat`. Lembre-se de que `SimpleDateFormat` não é thread-safe, portanto, deve-se ter cuidado ao usá-lo em ambientes multithread. Para novos projetos, é recomendado usar a API `java.time`, como `DateTimeFormatter`, para operações relacionadas a data e hora.

### java.util.TimeZone
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./01_arquivos/proj_01/)

A classe `java.util.TimeZone` em Java é usada para representar fusos horários. Ela é útil para manipular datas e horas em diferentes fusos horários e é um componente fundamental no processamento de datas e horas, especialmente em aplicações que operam em múltiplas regiões geográficas.

Aqui estão alguns exemplos básicos do uso da classe `TimeZone`:

#### Obtendo o fuso horário padrão

```java
import java.util.TimeZone;

public class TimeZoneExample {
  public static void main(String[] args) {
    // Obtém o fuso horário padrão do sistema
    TimeZone timeZone = TimeZone.getDefault();
    System.out.println("Fuso Horário Padrão: " + timeZone.getID());
  }
}
```

#### Definindo um fuso horário específico

```java
import java.util.TimeZone;

public class TimeZoneExample {
  public static void main(String[] args) {
    // Define um fuso horário específico
    TimeZone timeZone = TimeZone.getTimeZone("America/New_York");
    System.out.println("Fuso Horário de Nova York: " + timeZone.getID());
  }
}
```

#### Listando todos os fusos horários disponíveis

```java
import java.util.TimeZone;

public class TimeZoneExample {
  public static void main(String[] args) {
    // Lista todos os fusos horários disponíveis
    String[] availableIDs = TimeZone.getAvailableIDs();
    for (String id : availableIDs) {
      System.out.println(id);
    }
  }
}
```

#### Trabalhando com offset de fuso horário

```java
import java.util.TimeZone;

public class TimeZoneExample {
  public static void main(String[] args) {
    TimeZone timeZone = TimeZone.getTimeZone("Europe/London");
    
    // Obtém o offset de fuso horário em relação ao UTC
    int offset = timeZone.getRawOffset();
    int hours = offset / (60 * 60 * 1000);
    int minutes = (offset % (60 * 60 * 1000)) / (60 * 1000);

    System.out.println("Offset de Londres: " + hours + " horas e " + minutes + " minutos");
  }
}
```

#### Convertendo entre fusos horários

```java
import java.util.Calendar;
import java.util.TimeZone;

public class TimeZoneExample {
  public static void main(String[] args) {
    // Cria um calendário com a hora atual no fuso horário padrão
    Calendar calendar = Calendar.getInstance();

    // Define o fuso horário para Nova York
    TimeZone timeZoneNY = TimeZone.getTimeZone("America/New_York");
    calendar.setTimeZone(timeZoneNY);

    System.out.println("Hora em Nova York: " + calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE));
  }
}
```

Esses exemplos mostram como usar a classe `TimeZone` para manipular fusos horários em Java. É importante notar que, assim como a classe `Date`, `TimeZone` foi complementada pelas novas classes de data e hora no Java 8, como `ZonedDateTime` e `ZoneId`, que oferecem uma API mais robusta e flexível para trabalhar com datas e horas em diferentes fusos horários.

### Desvantagens ao usar Calendar e Date
[[Topo]](#)<br />

Embora as classes `Date` e `Calendar` do Java sejam amplamente utilizadas e façam parte do JDK há muito tempo, elas possuem várias desvantagens, especialmente quando comparadas às classes do pacote `java.time` introduzido no Java 8. As desvantagens mais significativas incluem:

#### Desvantagens da lasse Date

1. **Problemas de design**: A classe `Date` representa tanto um ponto no tempo quanto um formato de data, o que pode ser confuso. Além disso, muitos dos seus métodos originais foram depreciados, tornando-a menos intuitiva para novos desenvolvedores.

2. **Mutabilidade**: Objetos `Date` são mutáveis, o que pode causar problemas em aplicações multithread. Uma data mutável pode ser alterada por um thread enquanto outro está lendo, levando a dados inconsistentes.

3. **Fuso horário**: A classe `Date` representa internamente a data e hora em UTC, mas seus métodos de toString() frequentemente representam a data e hora no fuso horário local. Isso pode levar a confusões e erros ao lidar com fusos horários.

4. **API limitada**: A classe `Date` oferece funcionalidades limitadas em comparação com as classes modernas de data/hora. Por exemplo, não possui métodos para operações de data/hora, como adição de dias, cálculo de diferenças entre datas, etc.

#### Desvantagens da classe Calendar

1. **Complexidade e inconsistência**: A classe `Calendar` é mais poderosa que `Date`, mas é mais complexa e inconsistente em sua API. Por exemplo, os meses começam em 0 (Janeiro = 0), o que é contra-intuitivo e propenso a erros.

2. **Mutabilidade**: Assim como `Date`, `Calendar` também é mutável, o que pode causar problemas de segurança e consistência em aplicações multithread.

3. **Uso de constantes mágicas**: `Calendar` usa constantes inteiras para representar meses, dias da semana, etc., o que torna o código menos legível e mais propenso a erros.

4. **Performance**: A classe `Calendar` é mais lenta em comparação com as novas APIs devido à sua complexidade e ao overhead de lidar com internacionalização e suporte a diferentes calendários.
