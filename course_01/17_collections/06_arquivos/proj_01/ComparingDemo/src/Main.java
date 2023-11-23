import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    // Demo - Sorting integers (type that implements Comparable)
    System.out.println("===== Integers =====");

    List<Integer> integers = new ArrayList<>(Arrays.asList(1, 15, 2, 37, 100));
    System.out.println("Original list: " + integers);

    integers.sort(Comparator.reverseOrder());
    System.out.println("Reversed order: " + integers);

    integers.sort(Comparator.naturalOrder());
    System.out.println("Natural order: " + integers);

    // Demo - Sorting Products (type that doesn't implement Comparable)
    System.out.println("===== Products =====");
    List<Product> products = new ArrayList<>(Arrays.asList(
      new Product(1, "Hardwood Oak Suffolk Internal Door", "Doors", 109.99),
      new Product(2, "Oregon Cottage Interior Oak Door", "Doors", 179.99),
      new Product(3, "Oregon Cottage Horizontal Interior White Oak Door", "Doors", 189.99),
      new Product(4, "4 Panel Oak Deco Interior Door", "Doors", 209.09)
    ));

    for (Product product: products) {
      System.out.println(product);
    }

//    products.sort(Comparator.naturalOrder()); // Compilation error in case Product is not Comparable

    // Demo - Sorting products (type that implements Comparable)
    System.out.println("===== Comparable Products =====");
    ComparableProduct cp1 = new ComparableProduct(1, "Product 1", "Category 2", 310d);
    ComparableProduct cp2 = new ComparableProduct(2, "Product 2", "Category 1", 200d);
    ComparableProduct cp3 = new ComparableProduct(3, "Product 3", "Category 2", 259d);
    List<ComparableProduct> comparableProducts = new ArrayList<>(Arrays.asList(cp3, cp1, cp2));
    System.out.println("*** Original list ***");
    for (ComparableProduct comparableProduct: comparableProducts) {
      System.out.println(comparableProduct);
    }

    comparableProducts.sort(Comparator.naturalOrder());
    System.out.println("*** Natural order ***");
    for (ComparableProduct comparableProduct: comparableProducts) {
      System.out.println(comparableProduct);
    }

    comparableProducts.sort(Comparator.reverseOrder());
    System.out.println("*** Reverse order ***");
    for (ComparableProduct comparableProduct: comparableProducts) {
      System.out.println(comparableProduct);
    }

    // Demo - Comparator implementation
    /**
     * We can implement Comparator in four ways:
     * 1. Anonymous class
     * 2. Separate class
     * 3. Lambda expression
     * 4. Method reference
     */
    System.out.println("===== Products sorted with dedicated Comparators =====");
    // Using anonymous class
    products.sort(new Comparator<Product>() {
      @Override
      public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
      }
    });

    // Using separate class
    products.sort(new ProductNameComparator());

    System.out.println("*** Sorted Products ***");
    for (Product product: products) {
      System.out.println(product);
    }
  }

}