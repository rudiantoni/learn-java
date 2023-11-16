package util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {
  private DateUtil() {
  }

  private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

  public static String now() {
    return LocalDateTime.now().format(formatter);
  }

  public static String greeting() {
    LocalDateTime now = LocalDateTime.now();
    if (now.getHour() > 0 && now.getHour() <= 12) {
      return "Bom dia";
    } else if (now.getHour() > 12 && now.getHour() <= 18) {
      return "Boa tarde";
    } else {
      return "Boa noite";
    }
  }
}
