import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    // Declare an array of int standard way (recommended)
    int[] arr;
    // Declare an array of int using C-way (not recommended)
    int arr2[];
    // Initializing an array setting its size, and setting all values to the default value
    // A int has a default value of 0
    arr = new int[10];
    // Print the array size
    System.out.println(arr.length);
    // Print the array first element value
    System.out.println(arr[0]);
    // A double has a default value of 0.0
    double[] arr3 = new double[10];
    System.out.println(arr3[0]);
    // A boolean has a default value of false
    boolean[] arr4 = new boolean[10];
    System.out.println(arr4[0]);
    // Throws ArrayIndexOutOfBoundsException exception
    // System.out.println(arr4[10]);
    // Array literals: Declare, initialize and assign value to a value and each of its elements
    int[] arr5 = {3, 2, 1};
    // Multidimensional arrays, you can have as many levels as you want
    int[][] matrix = {
      {1, 2, 3},
      {4, 5, 6}
    };
    // Print the index 2, inside the index 0
    System.out.println(matrix[0][2]);

    // Declare and initialize a multidimensional array
    int[][] matrix2 = new int [10][0];
    // Print the array object reference (not the values inside the array)
    System.out.println(matrix2[0]);
    // Print the array values
    System.out.println(Arrays.toString(arr5));
    // Sort the array in ascending order
    Arrays.sort(arr5);
    // Print the array values
    System.out.println(Arrays.toString(arr5));

  }
}