import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
  public static void main(String[] args) {
    List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

    System.out.println("===== Iterator hasNext() e next() =====");
    Iterator<Integer> iterator = integers.iterator();
    while(iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    System.out.println("*** Iterator - não pode ser resetado automaticamente ***");
    if (!iterator.hasNext()){
      System.out.println("Se nós estamos nesta seção, significa que não há outros elementos neste iterador.");
    }

    System.out.println("*** Iterator - resetando ***");
    iterator = integers.iterator();
    if (iterator.hasNext()){
      System.out.println("Se nós estamos nesta seção, significa que há SIM outros elementos neste iterador.");
    }

    System.out.println("===== Iterator remove() =====");
    iterator = integers.iterator();
    while (iterator.hasNext()) {
      int nextInt = iterator.next();
      if (nextInt % 2 == 0) {
        iterator.remove();
      }
    }
    System.out.println(integers);

    System.out.println("*** Iterator remove() - erro IllegalStateException ***");
//    iterator = integers.iterator();
//    iterator.remove(); // Throws java.lang.IllegalStateException

    System.out.println("===== Iterator - fail-fast iterator");
    System.out.println("*** Iterator next() - erro ConcurrentModificationException ***");
//    iterator = integers.iterator();
//    while(iterator.hasNext()) {
//      integers.remove(0);
//      int nextElement = iterator.next(); // Throws java.util.ConcurrentModificationException
//      System.out.println(nextElement);
//    }

    System.out.println("===== Iterator - fail-safe iterator demo =====");
    List<Integer> threadSafeList = new CopyOnWriteArrayList<>(integers);
    iterator = threadSafeList.iterator();
    threadSafeList.add(100);
    while (iterator.hasNext()) {
      threadSafeList.remove(0);
      int nextElement = iterator.next();
      System.out.println(nextElement);
    }
    System.out.println(threadSafeList);

    System.out.println("===== Iterator - weakly consistent iterator =====");
    Collection<Integer> deque = new ConcurrentLinkedDeque<>(integers);
    iterator = deque.iterator();
    deque.add(100);
    while (iterator.hasNext()) {
      int nextElement = iterator.next();
      System.out.println(nextElement);
    }
    System.out.println(deque);


  }
}