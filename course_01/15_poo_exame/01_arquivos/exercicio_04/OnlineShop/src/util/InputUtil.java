package util;

import config.AppContext;

import java.util.List;
import java.util.Scanner;

public class InputUtil {

  private InputUtil() {
  }

  public static String waitForAllowedOption(String requestMessage, String errorMessage, List<String> allowedOptions) {
    Scanner sc = AppContext.getSc();
    boolean keepAskingOption = true;
    String chosenOption = "";
    do {
      System.out.print(requestMessage);
      chosenOption = sc.nextLine();
      if (!allowedOptions.contains(chosenOption)) {
        if (errorMessage != null && !errorMessage.isEmpty()) {
          System.out.println(errorMessage);
        } else {
          System.out.printf("Opção inválida, digite apenas uma das opções possíveis: %s.\n", allowedOptions);
        }
      } else {
        keepAskingOption = false;
      }
    } while (keepAskingOption);
    return chosenOption;
  }

  public static String waitForAllowedOption(String requestMessage, List<String> allowedOptions) {
    return waitForAllowedOption(requestMessage, null, allowedOptions);
  }

  public static String waitForAnyInput(String requestMessage) {
    Scanner sc = AppContext.getSc();
    System.out.print(requestMessage);
    String input = sc.nextLine();
    return input;
  }

  public static void pause() {
    System.out.print("Pressione enter para continuar...");
    try {
      AppContext.getSc().nextLine();
    } catch (Exception e) {
    }
  }

  private static boolean isAllowedOption(String option, String[] allowedOptions) {
    for (String allowedOption : allowedOptions) {
      if (option.equalsIgnoreCase(allowedOption)) {
        return true;
      }
    }
    return false;
  }
}
