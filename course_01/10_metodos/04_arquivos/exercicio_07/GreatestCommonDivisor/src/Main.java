import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite dois números separados por espaço:");
    String input = sc.nextLine();
    String[] numbers = input.split(" ");
    int firstNumber = Integer.parseInt(numbers[0]);
    int secondNumber = Integer.parseInt(numbers[1]);

    // Usando fatorização por primos
    if (firstNumber > 0 && secondNumber > 0) {
      int[] commonFactors = getFactorsTwoNumbers(firstNumber, secondNumber, true);
      int mdc = 1;
      if (commonFactors.length > 0) {
         mdc = mult(commonFactors);
      }
      System.out.println(String.format("MDC entre %d e %d é %d.", firstNumber, secondNumber, mdc));
    } else {
      System.out.println("Cálculo não pode ser realizado, ambos os números devem ser maiores que zero.");
    }

    // Usando divisão longa
    //int gcd = gcdRecursive(firstNumber, secondNumber);
//    System.out.println(String.format("O número %d %s é primo.", firstNumber, isPrime ? "SIM" : "NÃO"));
  }

  // Usando fatorização por primos
  private static int gcdPrimeFactorisation(int firstNumber) {
    return 0;
  }
  private static int[] getFactorsTwoNumbers(int firstNumber, int secondNumber, boolean commonOnly) {
    String factors = "";
    int evalFirstNumber = firstNumber;
    int evalSecondNumber = secondNumber;
    int currentDivisor = 2;
    while(evalFirstNumber >= 1 || evalSecondNumber >= 1) {
      int tempFirst = evalFirstNumber;
      int tempSecond = evalSecondNumber;
      if (evalFirstNumber == 1 && evalSecondNumber == 1) {
//        System.out.println(String.format("%d\t|\t%d\t|", tempFirst, tempSecond));
        break;
      }
      boolean firstDivided = false;
      boolean secondDivided = false;
      if (isDivisorOf(evalFirstNumber, currentDivisor)) {
        evalFirstNumber = evalFirstNumber / currentDivisor;
        firstDivided = true;
      }
      if (isDivisorOf(evalSecondNumber, currentDivisor)) {
        evalSecondNumber = evalSecondNumber / currentDivisor;
        secondDivided = true;
      }
      if (!firstDivided && !secondDivided) {
        currentDivisor = getNextPrime(currentDivisor);
      }
      if (firstDivided || secondDivided) {
        if (commonOnly) {
          if (firstDivided && secondDivided) {
            factors += currentDivisor + ",";
          }
        } else {
          factors += currentDivisor + ",";
        }
//        System.out.println(String.format("%d\t|\t%d\t|\t%d", tempFirst, tempSecond, currentDivisor));
      }
    }
    if (!factors.isEmpty()) {
      int[] factorArr = toIntArr(factors.split(","));
      return factorArr;
    } else {
      return new int[0];
    }
  }
  private static int getNextPrime(int number) {
    if (number < 2) {
      return 2;
    } else {
      int currentNumber = number;
      boolean isPrime;
      do {
        currentNumber++;
        isPrime = isPrimeNumber(currentNumber);
      } while (!isPrime);
      return currentNumber;
    }
  }
  private static boolean isPrimeNumber(int number) {
    if (number < 2) {
      return false;
    } else {
      int divisorCount = 0;
      for (int i = 1; i <= number; i ++) {
        boolean isDivisor = isDivisorOf(number, i);
        if (isDivisor) {
          divisorCount++;
        }
        if (i < number && divisorCount >= 3) {
          return false;
        }

      }
      if (divisorCount > 2) {
        return false;
      } else {
        return true;
      }
    }
  }
  private static boolean isDivisorOf(int number, int divisor) {
    if (divisor == 0) {
      return false;
    }
    return number % divisor == 0;
  }
  private static int[] toIntArr(String[] strArr) {
    int[] intArr = new int[strArr.length];
    for (int i = 0; i < intArr.length; i++) {
      intArr[i] = Integer.parseInt(strArr[i]);
    }
    return intArr;
  }
  private static int mult(int[] intArr) {
    int result = 1;
    for (int i = 0; i < intArr.length; i++) {
      result *= intArr[i];
    }
    return result;
  }

  // Usando divisão longa
  private static int gcdRecursive(int firstNumber, int secondNumber) {
    if (secondNumber == 0) {
      return Math.abs(firstNumber);
    } else {
      return gcdRecursive(secondNumber, firstNumber % secondNumber);
    }
  }
}