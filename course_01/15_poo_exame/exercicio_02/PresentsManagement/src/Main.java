public class Main {
  public static void main(String[] args) {
    Sweet candy = new Candy();
    candy.setName("Candy");
    candy.setWeight(0.3);
    candy.setSugarWeight(0.1);

    Sweet lollipop = new Lollipop();
    lollipop.setName("Lollipop");
    lollipop.setWeight(0.1);
    lollipop.setSugarWeight(0.05);

    Sweet cookie = new Cookie();
    cookie.setName("Cookie");
    cookie.setWeight(0.15);
    cookie.setSugarWeight(0.075);

    System.out.println("========== All Sweets ==========");
    System.out.println(candy);
    System.out.println(lollipop);
    System.out.println(cookie);

    Present present = new Present();
    present.addSweet(candy);
    present.addSweet(lollipop);
    present.addSweet(cookie);

    System.out.println("========== Get Sweets in Present As a Copy ==========");
    Sweet[] returnedSweets = present.getSweets();
    for (Sweet sweet: returnedSweets) {
      System.out.println(sweet);
    }

    System.out.println("\n========== Get Total Sweet Weight in Present ==========");
    double totalPresentWeight = present.calculateTotalWeight();
    System.out.println(totalPresentWeight);

    System.out.println("\n========== Get Sweets by Sugar Weight Range in Present ==========");
    double min = 0.01;
    double max = 0.2;
    System.out.println("Min = " + min + " Max = " + max);
    Sweet[] inRangeSweets = present.filterSweetsBySugarRange(min, max);
    for (Sweet sweet: inRangeSweets) {
      System.out.println(sweet);
    }

  }
}