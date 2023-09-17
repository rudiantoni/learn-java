/**
 * Implemente um programa de console que atenda aos seguintes requisitos:
 *
 * 1. O programa é iniciado com 2 argumentos de entrada.
 * 2. O programa converte os argumentos em números inteiros.
 * 3. O programa imprima no console o resultado da soma dos 2 números.
 *
 * Iniciar uma aplicação Java passando argumentos
 * - Usando a linha de comando: java nome_programa 3 4
 * - Usando o IntelliJ Idea: Run > Edit Configurations > Program Arguments: 3 4
 * - Lembre-se: Cada argumento se dá separando os valores com espaços em branco.
 */
public class Main {
  public static void main(String[] args) {
    Integer a = Integer.parseInt(args[0]);
    Integer b = Integer.parseInt(args[1]);
    Integer result = Integer.sum(a, b);
    System.out.println(result);
  }
}