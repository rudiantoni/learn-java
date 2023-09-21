import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um número inteiro:");
    Integer num = sc.nextInt();
    sc.close();
    String numAsStr = num.toString();
    String[] splittedNum = numAsStr.split("");

    for (String number : splittedNum) {
      System.out.println(number);
    }
  }
}