import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um número inteiro:");
    int num = sc.nextInt();
    sc.close();
    int sum = sumDigitsInPositiveNumber(num);

    System.out.println(String.format("A soma dos dígitos de %d é %d.", num, sum));
  }

  public static int sumDigitsInPositiveNumber(int number) {
    String numStr = String.valueOf(number).replaceAll("\\D", "");
    String[] numStrArr = numStr.split("");
    int sum = 0;
    for (String numItem: numStrArr) {
      int sumNumber = Integer.parseInt(numItem);
      sum += sumNumber;
    }
    return sum;
  }
}