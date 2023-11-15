package util;

import config.AppConfig;
import pojo.BiValue;
import pojo.InputValidationConfig;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputUtil {

  private InputUtil() {
  }

  public static String waitForAllowedOption(String requestMessage, List<String> allowedOptions) {
    Scanner sc = AppConfig.getSc();
    boolean keepAskingOption = true;
    String chosenOption = "";
    do {
      System.out.print(requestMessage);
      chosenOption = sc.nextLine();
      if (!allowedOptions.contains(chosenOption)) {
        System.out.printf("Opção inválida, digite apenas uma das opções possíveis: %s.\n", allowedOptions);
      } else {
        keepAskingOption = false;
      }
    } while (keepAskingOption);
    return chosenOption;
  }

  public static String waitForAnyInput(String requestMessage) {
    Scanner sc = AppConfig.getSc();
    System.out.print(requestMessage);
    String input = sc.nextLine();
    return input;
  }

  public static void pause() {
    System.out.print("Pressione enter para continuar...");
    try {
      AppConfig.getSc().nextLine();
    } catch (Exception e) {}
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
