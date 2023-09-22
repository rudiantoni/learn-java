import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o tamanho do primeiro array:");
    int baseArraySize = sc.nextInt();
    sc.close();
    int[] firstArr = generateRandomArray(baseArraySize);
    int[] secondArr = extendArray(firstArr);

    System.out.println("Primeiro array: " + Arrays.toString(firstArr));
    System.out.println("Segundo array: " + Arrays.toString(secondArr));

  }
  public static int[] generateRandomArray(int amountOfElements) {
    Random rdm = new Random();
    int maxRandomNumber = amountOfElements * 5;
    int[] arr = new int[amountOfElements];
    for (int i = 0; i < amountOfElements; i++) {
      arr[i] = rdm.nextInt(maxRandomNumber) + 1;
    }
    return arr;
  }

  public static int[] extendArray(int[] arr) {
    int[] newArr = new int[arr.length * 2];
    for (int i = 0; i < newArr.length; i++) {
      if (i < arr.length) {
        newArr[i] = arr[i];
      } else {
        int idxToMultiply = i - arr.length;
        int extendedValue = arr[idxToMultiply] * 2;
        newArr[i] = extendedValue;
      }
    }
    return newArr;
  }

}