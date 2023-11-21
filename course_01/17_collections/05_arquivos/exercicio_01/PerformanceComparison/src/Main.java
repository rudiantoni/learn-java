import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Integer> arrayList = new ArrayList<>();
    List<Integer> linkedList = new LinkedList<>();

    resetList(arrayList);
    resetList(linkedList);

    testListPerformance(arrayList, "ArrayList");
    testListPerformance(linkedList, "LinkedList");
  }
  private static void resetList(List<Integer> list) {
    list.clear();
    for (int i = 0; i < 1000000; i++) {
      list.add(Integer.MAX_VALUE);
    }
  }
  private static void testListPerformance(List<Integer> list, String listType) {
    System.out.println("Testando " + listType);
    int[] elementsToAddOrRemove = {100, 10000, 100000};
    for (int number : elementsToAddOrRemove) {
      // Adicionar elementos
      measureTime(() -> addElementsToEnd(list, number), "Adicionar ao fim: " + number);
      resetList(list);
      measureTime(() -> addElementsToMiddle(list, number), "Adicionar ao meio: " + number);
      resetList(list);
      measureTime(() -> addElementsToBeginning(list, number), "Adicionar ao início: " + number);
      resetList(list);

      // Remover elementos
      measureTime(() -> removeElementsFromEnd(list, number), "Remover do fim: " + number);
      resetList(list);
      measureTime(() -> removeElementsFromMiddle(list, number), "Remover do meio: " + number);
      resetList(list);
      measureTime(() -> removeElementsFromBeginning(list, number), "Remover do início: " + number);
      resetList(list);
    }

  }
  public static void measureTime(Runnable task, String taskDescription) {
    long start = System.nanoTime();
    task.run();
    long delta = (System.nanoTime() - start) / 10000;
    System.out.println(taskDescription + " levou " + delta + " microsegundos.");
  }
  public static void addElementsToBeginning(List<Integer> list, int numberOfElementsToAdd) {
    for (int i = 0; i < numberOfElementsToAdd; i++) {
      list.add(0, Integer.MAX_VALUE);
    }
  }
  public static void addElementsToMiddle(List<Integer> list, int numberOfElementsToAdd) {
    int middle = list.size() / 2;
    for (int i = 0; i < numberOfElementsToAdd; i++) {
      list.add(middle, Integer.MAX_VALUE);
    }
  }
  public static void addElementsToEnd(List<Integer> list, int numberOfElementsToAdd) {
    for (int i = 0; i < numberOfElementsToAdd; i++) {
      list.add(Integer.MAX_VALUE);
    }
  }
  public static void removeElementsFromBeginning(List<Integer> list, int numberOfElementsToRemove) {
    for (int i = 0; i < numberOfElementsToRemove; i++) {
      list.remove(0);
    }
  }
  public static void removeElementsFromMiddle(List<Integer> list, int numberOfElementsToRemove) {
    int middle = list.size() / 2;
    for (int i = 0; i < numberOfElementsToRemove; i++) {
      list.remove(middle);
    }
  }
  public static void removeElementsFromEnd(List<Integer> list, int numberOfElementsToRemove) {
    int size = list.size();
    for (int i = size - 1; i >= size - numberOfElementsToRemove; i--) {
      list.remove(i);
    }
  }
}