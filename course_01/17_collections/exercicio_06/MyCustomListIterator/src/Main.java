public class Main {
  public static void main(String[] args) {
    DefaultMyList myList = new DefaultMyList();
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
    System.out.println("===== Created MyList =====");
    list(myList);

    ListIterator listIterator = myList.listIterator();
    next(listIterator); // 1
    next(listIterator); // 2
    next(listIterator); // 3
    previous(listIterator); // 2
    previous(listIterator); // 1
    list(myList);
    listIterator.set(10); // 1 -> 10
    list(myList, "after setting to 10:");

    next(listIterator); // 2
    next(listIterator); // 3
    next(listIterator); // 4
    list(myList);
    listIterator.set(40); // 4 -> 40
    list(myList, "after setting to 40:");

    next(listIterator); // 5
    next(listIterator); // str6
    next(listIterator); // str7
    list(myList);
    listIterator.remove(); // removes str7
    list(myList, "after removing once:");

    next(listIterator); // str8
    listIterator.remove(); // removes str8
    list(myList, "after removing once:");

    try {
      listIterator.remove(); // tries to remove str9
    } catch (Exception e) {
      System.out.println(e.getMessage());
      System.out.println("ERROR when trying to remove twice.");
    }

    previous(listIterator); // str6
    previous(listIterator); // 5
    previous(listIterator); // 40
    listIterator.remove(); // removes 40
    list(myList, "after removing once:");

    next(listIterator); // 5
    previous(listIterator); // 3
    listIterator.remove(); // removes 3
    list(myList, "after removing once:");
    try {
      listIterator.remove(); // tries to remove 1
    } catch (Exception e) {
      System.out.println(e.getMessage());
      System.out.println("ERROR when trying to remove twice.");
    }

    System.out.println("Final list: " +myList);


  }
  private static void next(ListIterator listIterator){
    System.out.println("\t next: " + listIterator.next());
  }
  private static void previous(ListIterator listIterator){
    System.out.println("\t previous: " + listIterator.previous());
  }
  private static void list(DefaultMyList list) {
    System.out.println("base list: " + list);
  }
  private static void list(DefaultMyList list, String msg) {
    System.out.println(msg + " " + list);
  }
}