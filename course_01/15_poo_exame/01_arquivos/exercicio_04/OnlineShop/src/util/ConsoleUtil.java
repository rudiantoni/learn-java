package util;

import config.AppConfig;
import enums.Command;

import java.io.IOException;
import java.util.List;

public class ConsoleUtil {
  private static void cleanLinux(boolean force) {
    if (force || AppConfig.isCleanable()) {
      try {
        new ProcessBuilder("clear").inheritIO().start().waitFor();
      } catch (InterruptedException | IOException e) {
        System.out.println("Error when clearing linux console: Not executed");
      }
    }
  }

  private static void cleanWindows(boolean force) {
    if (force || AppConfig.isCleanable()) {
      try {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
      } catch (InterruptedException | IOException e) {
        System.out.println("Error when clearing windows console: Not executed");
      }
    }
  }

  public static void clean(boolean force) {
    if (AppConfig.isLinux()) {
      cleanLinux(force);
    } else if (AppConfig.isWindows()) {
      cleanWindows(force);
    }
  }

  public static void clean() {
    clean(false);
  }

  public static void printDivider() {
    System.out.println("--------------------------------------------------");
  }

  public static void printHeader() {
    System.out.println("Agora é " + DateUtil.now() + ".");
  }

  public static void printMainMenu() {
    printHeader();
    if (AppConfig.getLoggedUser() == null) {
      System.out.printf("Bem-vindo a %s!\n", Consts.APP_NAME);
    } else {
      System.out.printf("%s! %s %s, seja bem-vindo(a).\n", DateUtil.greeting(), AppConfig.getLoggedUser().getFirstName(), AppConfig.getLoggedUser().getLastName());
    }
    printDivider();
    System.out.println("1 - Registrar");
    if (AppConfig.getLoggedUser() == null) {
      System.out.println("2 - Entrar");
    } else {
      System.out.println("2 - Sair");
    }
    System.out.println("3 - Catálogo de produtos");
    System.out.println("4 - Meus pedidos");
    System.out.println("5 - Configurações");
    System.out.println("6 - Lista de clientes");
  }

  public static void printAllowedCommands(List<String> allowedCommands) {
    allowedCommands.forEach(it -> {
      Command command = Command.getCommandByName(it);
      if (command != Command.UNKNOWN) {
        System.out.printf("%s - %s\n", command.getName(), command.getDescription());
      }
    });
  }
}
