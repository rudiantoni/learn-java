import java.util.Scanner;

/**
 * Implemente um programa de console que atenda aos seguintes requisitos:
 *
 * 1. O programa inicia e pede ao usuário para inserir o raio do círculo.
 * 2. O programa calcula a circunferência do círculo e a exibe para o usuário.
 */
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Por favor, digite qual o raio do círculo:");
    Double radius = sc.nextDouble();
    sc.close();
    Double result = 2 * Math.PI * radius;
    System.out.println(result);
  }
}