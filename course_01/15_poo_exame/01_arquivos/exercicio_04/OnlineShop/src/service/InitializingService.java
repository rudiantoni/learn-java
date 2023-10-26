package service;

import java.time.LocalDateTime;

public class InitializingService {
  private static boolean canClear = false;

  private InitializingService() {}

  public static void initializeOS() {

    LocalDateTime dt = LocalDateTime.now();
    printDivider();
    clearingConsoleTest();
    System.out.println("Initializing...");
    if (canClear == true) {
      System.out.println("TEST PASSED: Your terminal supports text clearing");
    } else {
      System.out.println("WARNING: Detected your current terminal session doesn't support clear. No text will be removed from screen.");
    }
    System.out.println("Now is " + dt + ". Using " + System.getProperty("os.name") + " OS.");
    System.out.println("Welcome to the Online Shopping Application!");
    printDivider();
  }

  public static String divider() {
    return "--------------------------------------------------";
  }
  public static void printDivider() {
    System.out.println(divider());
  }

  static void clearingConsoleTest() {
    String os = System.getProperty("os.name");
    String envTerm = System.getenv("TERM");
    System.out.println("envterm");
    System.out.println(envTerm);
    try {
      if (os.contains("Windows")) {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        canClear = true;
      } else if (os.contains("Linux")){
        new ProcessBuilder("clear").inheritIO().start().waitFor();
        canClear = true;

      }
    } catch (Exception ignored){
      canClear = false;
    }

  }

}
