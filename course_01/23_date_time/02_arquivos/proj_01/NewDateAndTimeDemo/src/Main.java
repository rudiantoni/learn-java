import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
  public static void main(String[] args) {

    // Exemplo de Instant
    System.out.println("========== Exemplo de Instant ==========");
    instantDemo();

    // Exemplo de LocalDateTime
    System.out.println("========== Exemplo de LocalDateTime ==========");
    localDateTimeDemo();

  }

  public static void instantDemo() {
    System.out.println("========================================");
    System.out.println("\n*** Criação e leituras ***");
    Instant instant = Instant.now();
    System.out.println("instant: " + instant);

    Instant instant1 = Instant.now(Clock.systemUTC());
    System.out.println("instant1: " + instant1);

    long nowMillis = System.currentTimeMillis();
    Instant instant2 = Instant.ofEpochMilli(nowMillis);
    System.out.println("instant2: " + instant2);

    long nowSeconds = nowMillis / 1000;
    Instant instant3 = Instant.ofEpochSecond(nowSeconds);
    System.out.println("instant3: " + instant3);

    Instant instant4 = Instant.ofEpochSecond(nowSeconds, 345000000);
    System.out.println("instant4: " + instant4);

    // DateTimeFormatter.ISO_INSTANT - é usado para análise
    Instant instant5 = Instant.parse("1994-07-08T11:16:42.08Z");
    System.out.println("instant5: " + instant5);
    System.out.println("instant5 nanossegundos: " + instant5.getNano());
    System.out.println("instant5 nanossegundos (usando ChronoField): " + instant5.getLong(ChronoField.NANO_OF_SECOND));
    System.out.println("instant5 para milissegundos epoch: " + instant5.toEpochMilli());
    System.out.println("instant5 para segundos epoch: " + instant5.getEpochSecond());
    System.out.println("instant5 para segundos epoch (usando ChronoField): " + instant5.getLong(ChronoField.INSTANT_SECONDS));

    Instant instant6 = new Date().toInstant();
    System.out.println("instant6: " + instant6);

    System.out.println("\n*** Adição e subtração ***");
    Instant instant7 = Instant.parse("1984-08-13T10:15:30.345Z");
    System.out.println("instant7                      : " + instant7);

    System.out.println("\tOperações nativas do Instant");
    // Adicionar/subtrair nanossegundos
    System.out.println("Menos 45123456 nanossegundos  : " + instant7.minusNanos(45123456));
    System.out.println("Mais 111234567 nanossegundos  : " + instant7.plusNanos(111234567));
    // Adicionar/subtrair milissegundos
    System.out.println("Menos 45000 milissegundos     : " + instant7.minusMillis(45000));
    System.out.println("Mais 10000 milissegundos      : " + instant7.plusMillis(10000));
    // Adicionar/subtrair segundos
    System.out.println("Menos 15 segundos             : " + instant7.minusSeconds(15));
    System.out.println("Mais 10 segundos              : " + instant7.plusSeconds(10));
    System.out.println("\tTemporalUnit - ChronoUnit");
    // Adicionar/subtrair minutos usando TemporalUnit - ChronoUnit
    System.out.println("Menos 45 minutos              : " + instant7.minus(45, ChronoUnit.MINUTES));
    System.out.println("Mais 20 minutos               : " + instant7.plus(45, ChronoUnit.MINUTES));
    // Adicionar/subtrair horas usando TemporalUnit - ChronoUnit
    System.out.println("Menos 3 horas                 : " + instant7.minus(3, ChronoUnit.HOURS));
    System.out.println("Mais 6 horas                  : " + instant7.plus(6, ChronoUnit.HOURS));
    // Adicionar/subtrair milissegundos usando TemporalUnit - ChronoUnit
    System.out.println("Menos 90000 milissegundos     : " + instant7.minus(30000, ChronoUnit.MILLIS));
    System.out.println("Mais 30000 milissegundos      : " + instant7.plus(30000, ChronoUnit.MILLIS));
    // Adicionar/subtrair dias usando TemporalUnit - ChronoUnit
    System.out.println("Menos 2 dias                  : " + instant7.minus(2, ChronoUnit.DAYS));
    System.out.println("Mais 5 dias                   : " + instant7.plus(5, ChronoUnit.DAYS));
    System.out.println("\tTemporalAmount - Duration");
    // Adicionar/subtrair segundos TemporalAmount - Duration
    System.out.println("Menos 10 segundos             : " + instant7.minus(Duration.ofSeconds(10)));
    System.out.println("Mais 25 segundos              : " + instant7.plus(Duration.ofSeconds(25)));
    System.out.println("\tTemporalAmount - Period");
    // Adicionar/subtrair segundos TemporalAmount - Period
    System.out.println("Menos 16 dias                 : " + instant7.minus(Period.ofDays(16)));
    System.out.println("Mais 5 dias                   : " + instant7.plus(Period.ofDays(5)));

    System.out.println("\n*** Comparação de ordem ***");
    System.out.println("\tInstant");
    Instant instant8 = Instant.parse("1994-07-08T11:16:43.08Z");
    Instant instant9 = Instant.parse("1994-07-08T11:16:44.08Z");
    System.out.println("instant8                         : " + instant8);
    System.out.println("instant9                         : " + instant9);
    System.out.println("instant8 depois de instant9      : " + instant8.isAfter(instant9));
    System.out.println("instant9 depois de instant8      : " + instant9.isAfter(instant8));
    System.out.println("instant8 antes de instant9       : " + instant8.isBefore(instant9));
    System.out.println("instant9 antes de instant8       : " + instant9.isBefore(instant8));
    System.out.println("instant8 comparar ao instant9    : " + instant8.compareTo(instant9));
    System.out.println("instant9 comparar ao instant8    : " + instant9.compareTo(instant8));

    System.out.println("\tCalendar");
    Calendar calendar1 = new GregorianCalendar(1013, 1, 28, 13, 24, 55);
    Calendar calendar2 = new GregorianCalendar(1013, 1, 28, 13, 24, 56);
    System.out.println("calendar1                        : " + calendar1);
    System.out.println("calendar2                        : " + calendar2);
    System.out.println("calendar1 depois de calendar2    : " + calendar1.after(calendar2));
    System.out.println("calendar2 depois de calendar1    : " + calendar2.after(calendar1));
    System.out.println("calendar1 antes de calendar2     : " + calendar1.before(calendar2));
    System.out.println("calendar2 antes de calendar1     : " + calendar2.before(calendar1));

    System.out.println("\tDate");
    Date date1 = new Date(1090215021581L);
    Date date2 = new Date(1090215021582L);
    System.out.println("date1                            : " + date1);
    System.out.println("date2                            : " + date2);
    System.out.println("date1 depois de date2            : " + date1.after(date2));
    System.out.println("date2 depois de date1            : " + date2.after(date1));
    System.out.println("date1 antes de date2             : " + date1.before(date2));
    System.out.println("date2 antes de date1             : " + date2.before(date1));

    System.out.println("\n*** Conversão de tipo ***");
    Instant instant10 = Instant.parse("1997-05-07T10:15:30.00Z");
    System.out.println("Instant: " + instant10);

    LocalDateTime localDateTime = LocalDateTime.ofInstant(instant10, ZoneId.systemDefault());
    System.out.println("LocalDateTime: " + localDateTime);

    ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant10, ZoneId.systemDefault());
    System.out.println("ZonedDateTime: " + zonedDateTime);

    ZonedDateTime zonedDateTime1 = instant10.atZone(ZoneId.of("Asia/Tokyo"));
    System.out.println("ZonedDateTime1: " + zonedDateTime1);

    OffsetDateTime offsetDateTime = instant10.atOffset(ZoneOffset.UTC);
    System.out.println("OffsetDateTime: " + offsetDateTime);

    OffsetDateTime offsetDateTime2 = instant10.atOffset(ZoneOffset.of("+5"));
    System.out.println("OffsetDateTime2: " + offsetDateTime2);

    System.out.println("========================================");
  }

  public static void localDateTimeDemo() {
    System.out.println("==============================================");
    System.out.println("\n*** Criação e leituras ***");
    LocalDateTime localDT = LocalDateTime.parse("1981-10-18T10:20:45");
    System.out.println("localDT                          : " + localDT);

    System.out.println("\n*** Adição e subtração ***");
    System.out.println("Menos 10 dias                    : " + localDT.minusDays(10));
    System.out.println("Mais 15 dias                     : " + localDT.plusDays(15));
    System.out.println("Menos 3 horas                    : " + localDT.minus(3, ChronoUnit.HOURS));
    System.out.println("Mais 8 horas                     : " + localDT.plus(8, ChronoUnit.HOURS));

    System.out.println("\n*** Comparação de ordem ***");
    LocalDateTime localDT1 = LocalDateTime.parse("1981-10-18T10:20:45");
    LocalDateTime localDT2 = LocalDateTime.parse("1981-10-18T10:20:46");
    System.out.println("localDT1                         : " + localDT1);
    System.out.println("localDT2                         : " + localDT2);
    System.out.println("localDT1 depois de localDT2      : " + localDT1.isAfter(localDT2));
    System.out.println("localDT2 depois de localDT1      : " + localDT2.isAfter(localDT1));
    System.out.println("localDT1 antes de localDT2       : " + localDT1.isBefore(localDT2));
    System.out.println("localDT2 antes de localDT1       : " + localDT2.isBefore(localDT1));
    System.out.println("localDT1 comparar ao localDT2    : " + localDT1.compareTo(localDT2));
    System.out.println("localDT2 comparar ao localDT1    : " + localDT2.compareTo(localDT1));

    System.out.println("==============================================");
  }
}