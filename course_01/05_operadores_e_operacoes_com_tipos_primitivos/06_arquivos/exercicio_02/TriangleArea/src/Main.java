import java.util.Scanner;

/**
 * Implemente um programa de console que atenda aos seguintes requisitos:
 *
 * 1. O programa inicia e pede ao usuário que insira o comprimento do lado A do triângulo.
 * 2. O programa pede ao usuário que insira o comprimento do lado B do triângulo.
 * 3. O programa pede ao usuário que insira o comprimento do lado C do triângulo.
 * 4. Usando a fórmula de Heron (https://www.mathopenref.com/heronsformula.html), o programa calcula a área do triângulo e a exibe para o usuário.
 * 5. Caso esse triângulo não exista, imprima 'NaN' no console.
 */
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Por favor, digite o comprimento do lado A do triângulo:");
    Float a = sc.nextFloat();
    System.out.println("Por favor, digite o comprimento do lado B do triângulo:");
    Float b = sc.nextFloat();
    System.out.println("Por favor, digite o comprimento do lado C do triângulo:");
    Float c = sc.nextFloat();
    sc.close();

    if (a > 0 && b > 0 && c > 0 && isPossibleTriangle(a, b, c)) {
      Float p = (a + b + c) / 2;
      Float pA = p - a;
      Float pB = p - b;
      Float pC = p - c;
      Float allMult = p * pA * pB * pC;
      Double result = Math.sqrt(allMult);
      System.out.println(result);
    }
    else {
      System.out.println("NaN");
    }

  }

  static boolean isPossibleTriangle(Float sideA, Float sideB, Float sideC) {
    Boolean isValid = sideA + sideB > sideC && sideB + sideC > sideA && sideA + sideC > sideB;
    return isValid;
  }
}