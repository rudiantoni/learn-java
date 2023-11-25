import java.util.Arrays;
import java.util.Iterator;

public class Main {
  public static void main(String[] args) {
    MyList myList = new DefaultMyList();
    myList.add(1);
    myList.add(2);
    myList.add(3);
    myList.add(4);
    myList.add(5);
    System.out.println("===== Created MyList =====");
    System.out.println(myList);

    myList.clear();
    System.out.println("after clear");
    System.out.println(myList);

    myList.add(1);
    myList.add(2);
    myList.add(3);
    myList.add(4);
    myList.add(5);
    myList.add("str6");
    myList.add("str7");
    myList.add("str8");
    myList.add("str9");
    myList.add("str10");
    System.out.println("after adding more elements");
    System.out.println(myList);

    myList.remove("str6");
    myList.remove("str6");
    myList.remove("str6");
    System.out.println("after removing str6 3 times");
    System.out.println(myList);


    System.out.println("\n===== Basic .hasNext() and .next() iteration =====");
    Iterator<Object> iterator = myList.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    System.out.println("\n===== Trying to use .next() without more elements =====");
    try {
      // throw NoSuchElementException
      iterator.next();
    } catch (Exception e) {
      System.out.println(e.getMessage());
      System.out.println("*** End error ***");
    }

    System.out.println("\n===== Reseting the iterator by getting a new one =====");
    iterator = myList.iterator();
    while (iterator.hasNext()) {
      Object obj = iterator.next();
      System.out.println(obj);
    }

    System.out.println("\n===== Removing an element 3 and str7 from the collection =====");
    iterator = myList.iterator();
    while (iterator.hasNext()) {
      Object obj = iterator.next();
      if (obj.equals(3) || obj.equals("str7")) {
        iterator.remove();
      }
    }
    System.out.println("After removing 3 and str7");
    System.out.println(myList);

    System.out.println("\n===== Calling .remove() twice after calling .next() =====");
    iterator = myList.iterator();
    try {
      if (iterator.hasNext()) {
        Object next = iterator.next();
        iterator.remove();
        iterator.remove();
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
      System.out.println("*** End error ***");
    }

    System.out.println("\n===== Calling .remove() without calling .next() before =====");
    iterator = myList.iterator();
    try {
      if (iterator.hasNext()) {
        iterator.remove();
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
      System.out.println("*** End error ***");
    }


  }
}