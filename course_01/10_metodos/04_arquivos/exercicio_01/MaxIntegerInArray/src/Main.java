import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite números inteiros separados por espaço:");
    String numbersStr = sc.nextLine();
    String[] numbersStrArr = numbersStr.split(" ");
    int nums[] = new int[numbersStrArr.length];
    for (int i = 0; i < numbersStrArr.length; i++) {
      nums[i] = Integer.parseInt(numbersStrArr[i]);
    }
    int maxInt = findMaxIntInArray(nums);
    System.out.println("O maior número no array " + Arrays.toString(nums) + " é " + maxInt + ".");
  }
  public static int findMaxIntInArray(int[] intArray) {
    int currentMax = intArray[0];
    for (int i = 1; i < intArray.length; i++) {
      if (intArray[i] > currentMax) {
        currentMax = intArray[i];
      }
    }
    return currentMax;
  }
}