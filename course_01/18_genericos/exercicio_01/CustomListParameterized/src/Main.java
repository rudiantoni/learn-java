import java.util.Iterator;

public class Main {
  public static void main(String[] args) {
    System.out.println("=========================================");
    System.out.println("===== TESTING MY LIST PARAMETERIZED =====");
    System.out.println("=========================================");
    DefaultMyListParameterized<Integer> myListParameterized = new DefaultMyListParameterized<>();
    myListParameterized.add(1);
    myListParameterized.add(2);
    myListParameterized.add(3);
    myListParameterized.add(4);
    myListParameterized.add(5);
    myListParameterized.add(6);
    myListParameterized.add(7);
    myListParameterized.add(8);
    myListParameterized.add(9);
    myListParameterized.add(10);
    System.out.println("===== Created MyListParameterized =====");
    list(myListParameterized);

    ListIteratorParameterized<Integer> listIterator = myListParameterized.listIterator();
    next(listIterator); // 1
    next(listIterator); // 2
    next(listIterator); // 3
    previous(listIterator); // 2
    previous(listIterator); // 1
    list(myListParameterized);
    listIterator.set(10); // 1 -> 10
    list(myListParameterized, "after setting to 10:");

    next(listIterator); // 2
    next(listIterator); // 3
    next(listIterator); // 4
    list(myListParameterized);
    listIterator.set(40); // 4 -> 40
    list(myListParameterized, "after setting to 40:");

    next(listIterator); // 5
    next(listIterator); // 6
    next(listIterator); // 7
    list(myListParameterized);
    listIterator.remove(); // removes 7
    list(myListParameterized, "after removing once:");

    next(listIterator); // 8
    listIterator.remove(); // removes 8
    list(myListParameterized, "after removing once:");

    try {
      listIterator.remove(); // tries to remove 9
    } catch (Exception e) {
      System.out.println(e.getMessage());
      System.out.println("ERROR when trying to remove twice.");
    }

    previous(listIterator); // 6
    previous(listIterator); // 5
    previous(listIterator); // 40
    listIterator.remove(); // removes 40
    list(myListParameterized, "after removing once:");

    next(listIterator); // 5
    previous(listIterator); // 3
    listIterator.remove(); // removes 3
    list(myListParameterized, "after removing once:");
    try {
      listIterator.remove(); // tries to remove 1
    } catch (Exception e) {
      System.out.println(e.getMessage());
      System.out.println("ERROR when trying to remove twice.");
    }

    System.out.println("Final list: " + myListParameterized);


  }

  private static <T> void next(ListIteratorParameterized<T> listIterator) {
    System.out.println("\t next: " + listIterator.next());
  }

  private static <T> void previous(ListIteratorParameterized<T> listIterator) {
    System.out.println("\t previous: " + listIterator.previous());
  }

  private static <T> void list(DefaultMyListParameterized<T> list) {
    System.out.println("base list: " + list);
  }

  private static <T> void list(DefaultMyListParameterized<T> list, String msg) {
    System.out.println(msg + " " + list);
  }
//    DefaultMyListParameterized<Integer> myListParameterized = new DefaultMyListParameterized<Integer>();
//    myListParameterized.add(1);
//    myListParameterized.add(2);
//    myListParameterized.add(3);
//    myListParameterized.add(4);
//    myListParameterized.add(5);
//    System.out.println("===== Created MyList =====");
//    System.out.println(myListParameterized);
//
//    myListParameterized.clear();
//    System.out.println("after clear");
//    System.out.println(myListParameterized);
//
//    myListParameterized.add(1);
//    myListParameterized.add(2);
//    myListParameterized.add(3);
//    myListParameterized.add(4);
//    myListParameterized.add(5);
//    myListParameterized.add(6);
//    myListParameterized.add(7);
//    myListParameterized.add(8);
//    myListParameterized.add(9);
//    myListParameterized.add(10);
//    System.out.println("after adding more elements");
//    System.out.println(myListParameterized);
//
//    myListParameterized.remove(6);
//    myListParameterized.remove(6);
//    myListParameterized.remove(6);
//    System.out.println("after removing number 6 by 3 times");
//    System.out.println(myListParameterized);
//
//
//    System.out.println("\n===== Basic .hasNext() and .next() iteration =====");
//    Iterator<Integer> iterator = myListParameterized.iterator();
//    while (iterator.hasNext()) {
//      System.out.println(iterator.next());
//    }
//
//    System.out.println("\n===== Trying to use .next() without more elements =====");
//    try {
//      // throw NoSuchElementException
//      iterator.next();
//    } catch (Exception e) {
//      System.out.println(e.getMessage());
//      System.out.println("*** End error ***");
//    }
//
//    System.out.println("\n===== Reseting the iterator by getting a new one =====");
//    iterator = myListParameterized.iterator();
//    while (iterator.hasNext()) {
//      Integer obj = iterator.next();
//      System.out.println(obj);
//    }
//
//    System.out.println("\n===== Removing an element 3 and 7 from the collection =====");
//    iterator = myListParameterized.iterator();
//    while (iterator.hasNext()) {
//      Integer obj = iterator.next();
//      System.out.println(obj);
//      if (obj.equals(new Integer(3)) || obj.equals(7)) {
//        iterator.remove();
//      }
//    }
//    System.out.println("After removing 3 and 7");
//    System.out.println(myListParameterized);
//
//    System.out.println("\n===== Calling .remove() twice after calling .next() =====");
//    iterator = myListParameterized.iterator();
//    try {
//      if (iterator.hasNext()) {
//        Integer next = iterator.next();
//        iterator.remove();
//        iterator.remove();
//      }
//    } catch (Exception e) {
//      System.out.println(e.getMessage());
//      System.out.println("*** End error ***");
//    }
//
//    System.out.println("\n===== Calling .remove() without calling .next() before =====");
//    iterator = myListParameterized.iterator();
//    try {
//      if (iterator.hasNext()) {
//        iterator.remove();
//      }
//    } catch (Exception e) {
//      System.out.println(e.getMessage());
//      System.out.println("*** End error ***");
//    }


}