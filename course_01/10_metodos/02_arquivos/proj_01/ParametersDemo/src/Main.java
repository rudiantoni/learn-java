import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int i = 10;
    System.out.println("i antes de changeIntValue():\t" +i );
    changeIntValue(i);
    System.out.println("i depois de changeIntValue():\t" +i );

    System.out.println("i antes de changeInt():\t" +i );
    i = changeInt(i);
    System.out.println("i depois de changeInt():\t" +i );

    int[] array = {1, 2, 3};
    System.out.println("array antes do changeArray():\t" + Arrays.toString(array));
    changeArray(array);
    System.out.println("array depois do changeArray():\t" + Arrays.toString(array));

    System.out.println("array antes do clearArray():\t" + Arrays.toString(array));
    clearArray(array);
    System.out.println("array depois do clearArray():\t" + Arrays.toString(array));
  }
  private static void changeIntValue(int i) {
    i += 100;
  }
  private static int changeInt(int i) {
    i += 100;
    return i;
  }
  private static void changeArray(int[] array) {
    array[1] = 200;
  }
  private static void clearArray(int[] array) {
    array = null;
  }
}