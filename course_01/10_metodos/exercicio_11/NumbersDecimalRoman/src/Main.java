import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String inputOption = "";
    do {
      System.out.println("Digite uma opção válida:");
      System.out.println("D2R - Para converter números decimais para números romanos");
      System.out.println("R2D - Para converter números romanos para números decimais");
      inputOption = sc.nextLine();
      if (!inputOption.equals("D2R") && !inputOption.equals("R2D")) {
        System.out.println("Entrada inválida, são permitidos apenas \"D2R\" ou \"R2D\".");
      }
    } while (!inputOption.equals("D2R") && !inputOption.equals("R2D"));

    int inputDecimalNumber = 0;
    String inputRomanNumber = "";
    boolean isValidInput = false;

    do {
      if (inputOption.equals("D2R")) {
        System.out.println("Digite um número inteiro (base decimal):");
        inputDecimalNumber = sc.nextInt();
        if (isDecimalNumberValid(inputDecimalNumber)) {
          isValidInput = true;
        } else {
          System.out.println("Número digitado inválido.");
        }
      }
      else if (inputOption.equals("R2D")) {
        System.out.println("Digite um número romano:");
        inputRomanNumber = sc.nextLine();
        if (isRomanNumberValid(inputRomanNumber)) {
          isValidInput = true;
        } else {
          System.out.println("Número digitado inválido.");
        }
      }
    } while(!isValidInput);
    sc.close();

    if (inputOption.equals("R2D")) {
      int dec = roman2Decimal(inputRomanNumber);
      System.out.println(String.format("%s em romano é %d em decimal.", inputRomanNumber, dec));
    } else if (inputOption.equals("D2R")) {
      String rom = decimal2Roman(inputDecimalNumber);
      System.out.println(String.format("%d em decimal é %s em romano.", inputDecimalNumber, rom));
    }

  }
  /*
  Funções de implementação obrigatória
   */
  // Validação de números decimais
  public static boolean isDecimalNumberValid(int decimalNumber) {
    return decimalNumber >= 1 && decimalNumber <= 100;
  }

  // Validação de números romanos
  public static boolean isRomanNumberValid(String romanNumber) {
    String[] validRomanAlgarisms = new String[]{"I", "V", "X", "L", "C", "D", "M"};
    boolean firstValidation = containsOnlyValidCharacters(validRomanAlgarisms, romanNumber);
    boolean secondValidation = hasNoMoreThenMaxRepetition(validRomanAlgarisms, 3, romanNumber);
    return firstValidation && secondValidation;
  }

  // Converter decimal para romano
  public static String decimal2Roman(int number) {
    int currentEvalNumber = number;
    String romanNumbers = "";
    while (currentEvalNumber > 0) {
      if (currentEvalNumber >= 1000) {
        romanNumbers += "M";
        currentEvalNumber -= 1000;
      } else if (currentEvalNumber >= 900) {
        romanNumbers += "CM";
        currentEvalNumber -= 900;
      } else if (currentEvalNumber >= 500) {
        romanNumbers += "D";
        currentEvalNumber -= 500;
      } else if (currentEvalNumber >= 400) {
        romanNumbers += "CD";
        currentEvalNumber -= 400;
      } else if (currentEvalNumber >= 100) {
        romanNumbers += "C";
        currentEvalNumber -= 100;
      } else if (currentEvalNumber >= 90) {
        romanNumbers += "XC";
        currentEvalNumber -= 90;
      } else if (currentEvalNumber >= 50) {
        romanNumbers += "L";
        currentEvalNumber -= 50;
      } else if (currentEvalNumber >= 40) {
        romanNumbers += "XL";
        currentEvalNumber -= 40;
      } else if (currentEvalNumber >= 10) {
        romanNumbers += "X";
        currentEvalNumber -= 10;
      } else if (currentEvalNumber >= 9) {
        romanNumbers += "IX";
        currentEvalNumber -= 9;
      } else if (currentEvalNumber >= 5) {
        romanNumbers += "V";
        currentEvalNumber -= 5;
      } else if (currentEvalNumber >= 4) {
        romanNumbers += "IV";
        currentEvalNumber -= 4;
      } else if (currentEvalNumber >= 1) {
        romanNumbers += "I";
        currentEvalNumber -= 1;
      }
    }
    return romanNumbers;
  }

  // Converter romano para decimal
  public static int roman2Decimal(String romanNumber) {
    String newRomanNumber = romanNumber
      .replaceAll("IV", "(4)")
      .replaceAll("IX", "(9)")
      .replaceAll("XL", "(40)")
      .replaceAll("XC", "(90)")
      .replaceAll("CD", "(400)")
      .replaceAll("CM", "(900)")
      .replaceAll("I", "(1)")
      .replaceAll("V", "(5)")
      .replaceAll("X", "(10)")
      .replaceAll("L", "(50)")
      .replaceAll("C", "(100)")
      .replaceAll("D", "(500)")
      .replaceAll("M", "(1000)");

    String numbersStrAggr = "";
    Pattern pattern = Pattern.compile("\\d+");
    Matcher matcher = pattern.matcher(newRomanNumber);
    while (matcher.find()) {
      String currentMatch = matcher.group(0);
      numbersStrAggr = addItemToStrAggregation(numbersStrAggr, currentMatch, ",");
    }
    String[] numberStrArr = numbersStrAggr.split(",");
    int[] numbers = toIntArr(numberStrArr);
    int res = sumIntArr(numbers);
    return res;
  }

  // Funções auxiliares específicas
  public static boolean containsOnlyValidCharacters(String[] allowedCharacters, String str) {
    String joined = String.join("", allowedCharacters);
    String regExp = String.format("[^%s]", joined);
    Pattern pattern = Pattern.compile(regExp);
    Matcher matcher = pattern.matcher(str);
    String finalMatches = "";
    while (matcher.find()) {
      String currentMatch = matcher.group(0);
      finalMatches = addItemToStrAggregation(finalMatches, currentMatch, ",");
    }
    return finalMatches.isEmpty();
  }

  public static boolean hasNoMoreThenMaxRepetition(String[] allowedCharacters, int max, String str) {
    String regExp = "";
    for (int i = 0; i < allowedCharacters.length; i++) {
      String item = allowedCharacters[i];
      String curRegExpItem = String.format("[%s]{%d,}", item, (max + 1));
      regExp = addItemToStrAggregation(regExp, curRegExpItem, "|");
    }
    Pattern pattern = Pattern.compile(regExp);
    Matcher matcher = pattern.matcher(str);
    String finalMatches = "";
    while (matcher.find()) {
      String currentMatch = matcher.group(0);
      finalMatches = addItemToStrAggregation(finalMatches, currentMatch, ",");
    }
    return finalMatches.isEmpty();
  }

  // Funções auxiliares gerais
  public static String addItemToStrAggregation(String aggregation, String item, String separator) {
    if (aggregation.isEmpty()) {
      return item;
    } else if (!item.isEmpty()) {
      return aggregation + separator + item;
    } else {
      return aggregation;
    }
  }

  public static int[] toIntArr(String[] strings) {
    int[] ints = new int[strings.length];
    for (int i = 0; i < ints.length; i++) {
      int num = Integer.parseInt(strings[i]);
      ints[i] = num;
    }
    return ints;
  }

  public static int sumIntArr(int[] ints) {
    int res = 0;
    for (int item : ints) {
      res += item;
    }
    return res;
  }
}