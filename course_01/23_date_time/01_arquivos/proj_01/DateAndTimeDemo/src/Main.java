import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.*;

public class Main {
  public static void main(String[] args) throws ParseException {
    // Exemplo de Calendar
    System.out.println("========== Exemplo de Calendar ==========");
    Calendar calendar = new GregorianCalendar(1988, 1, 28, 13, 24, 56);
    int year = calendar.get(Calendar.YEAR);
    int month = calendar.get(Calendar.MONTH);
    int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
    int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
    int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
    int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);

    int hour = calendar.get(Calendar.HOUR);
    int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);
    int minute = calendar.get(Calendar.MINUTE);
    int second = calendar.get(Calendar.SECOND);
    int millisecond = calendar.get(Calendar.MILLISECOND);

    System.out.println("Ano: " + year);
    System.out.println("Mês: " + month);
    System.out.println("Dia do mês: " + dayOfMonth);
    System.out.println("Dia da semana: " + dayOfWeek);
    System.out.println("Semana do ano: " + weekOfYear);
    System.out.println("Semana do mês: " + weekOfMonth);
    System.out.println("Hora: " + hour);
    System.out.println("Hora do dia: " + hourOfDay);
    System.out.println("Minuto: " + minute);
    System.out.println("Segundo: " + second);
    System.out.println("Milissegundo: " + millisecond);

    // Exemplo de Calendar com SimpleDateFormat
    System.out.println("\n========== Exemplo de Calendar com SimpleDateFormat ==========");
    SimpleDateFormat calendarSdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
    calendar = new GregorianCalendar(1013, 1, 28, 13, 24, 56);
    System.out.println(calendarSdf.format(calendar.getTime()));

    calendarSdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss", Locale.US);
    System.out.println(calendarSdf.format(calendar.getTime()));

    calendarSdf = new SimpleDateFormat("yy MM dd HH:mm:ss", Locale.US);
    System.out.println(calendarSdf.format(calendar.getTime()));

    // Exemplo de Date
    System.out.println("\n========== Exemplo de Date ==========");
    Date date = new Date(1988, 2, 1);
    Date date1 = new Date();
    Date date2 = new Date(1895215322137621581L);
    System.out.println(date2);

    SimpleDateFormat dateSdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date dateParsed = dateSdf.parse("1999/01/10 10:02:02");
    System.out.println(dateParsed);

    String dateString = dateSdf.format(dateParsed);
    System.out.println(dateString);

    // Exemplo de Date com TimeZone
    System.out.println("\n========== Exemplo de Date com TimeZone ==========");
    SimpleDateFormat sdfTz = new SimpleDateFormat("dd-M-yyyy hh:mm:s a");
    sdfTz.setTimeZone(TimeZone.getTimeZone("America/New_York"));
    Date date3 = new Date(1090215021581L);
    System.out.println(sdfTz.format(date3));

    sdfTz.setTimeZone(TimeZone.getTimeZone(ZoneId.of("+1")));
    System.out.println(sdfTz.format(date3));

    // Exemplo de ZoneId
    System.out.println("\n========== Exemplo de ZoneId ==========");
//    ZoneId.getAvailableZoneIds()
//      .forEach(System.out::println);

    // Exemplo de conversão Date <-> Calendar
    System.out.println("\n========== Exemplo de conversão Date <-> Calendar ==========");
    SimpleDateFormat sdfConv = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
    String dateInString = "22-01-2015 10:20:56";
    Date date4 = sdfConv.parse(dateInString);
    System.out.println("Data: " + date4);

    Calendar calendar1 = Calendar.getInstance();
    calendar.setTime(date4);

    date4 = calendar1.getTime();
    System.out.println("Data convertida do Calendar: " + date4);

  }
}