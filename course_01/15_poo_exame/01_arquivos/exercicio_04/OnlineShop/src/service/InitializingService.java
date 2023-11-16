package service;

import config.AppContext;
import util.ConsoleUtil;

import java.util.Objects;
import java.util.Scanner;

public class InitializingService {
  private boolean canClear = false;

  public void initialize() {
    ConsoleUtil.printDivider();
    startScanner();
    defineOS();
    clearingConsoleTest();
    System.out.println("Initializing...");
    if (this.canClear) {
      System.out.println("TEST PASSED: Your terminal supports text clearing");
    } else {
      System.out.println("WARNING: Detected your current terminal session doesn't support clear. No text will be removed from screen.");
    }
    AppContext.setCleanable(this.canClear);
    ConsoleUtil.printDivider();
  }

  private void startScanner() {
    AppContext.setSc(new Scanner(System.in));
  }
  private void defineOS() {
    String os = System.getProperty("os.name");
    if (os.contains("Windows")) {
      AppContext.setOsName("windows");
    } else if (os.contains("Linux")) {
      AppContext.setOsName("linux");
    }
  }

  private void clearingConsoleTest() {
    String envTerm = System.getenv("TERM");
    if (Objects.nonNull(envTerm)) {
      try {
        ConsoleUtil.clean();
        this.canClear = true;
      } catch (Exception ignored) {
        this.canClear = false;
      }
    }
  }

}
