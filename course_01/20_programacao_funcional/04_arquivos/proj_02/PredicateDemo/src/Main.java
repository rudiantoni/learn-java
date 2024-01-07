import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    // Exemplo de Predicate
    System.out.println("========== Exemplo de Predicate ==========");
    List<Product> baseProducts = new ArrayList<>(Arrays.asList(
      new DefaultProduct(1, "Product 1", "Category 1", 99.99),
      new DefaultProduct(2, "Product 2", "Category 2", 149.99),
      new DefaultProduct(3, "Product 3", "Category 3", 39.99)
    ));
    List<Product> products = productsDeepCopy(baseProducts);
    System.out.println("*** Antes do removeProductsIfPriceIsMoreThan(...) ****");
    printList(products);

    System.out.println("*** Depois do removeProductsIfPriceIsMoreThan(...) ***");
    removeProductsIfPriceIsMoreThan(products, 100);
    printList(products);

    // Exemplo de BiPredicate
    System.out.println("\n========== Exemplo de BiPredicate ==========");
    products = productsDeepCopy(baseProducts);
    Map<Integer, Product> idProductMap = IntStream.range(0, products.size())
      .boxed()
      .collect(Collectors.toMap(i -> i, products::get));
    System.out.println("*** Antes do increaseMapProductsPrice(...) ***");
    printList(idProductMap.values());

    increaseMapProductsPrice(idProductMap, 500);
    System.out.println("*** Depois do increaseMapProductsPrice(...) ***");
    printList(idProductMap.values());

    // Exemplo de Predicate.and()
    System.out.println("\n========== Exemplo de Predicate.and() ==========");
    products = productsDeepCopy(baseProducts);
    System.out.println("*** Antes do removeProductsIfPriceIsMoreThanAndCategoryIsEqualTo(...) ***");
    printList(products);

    System.out.println("*** Depois do removeProductsIfPriceIsMoreThanAndCategoryIsEqualTo(...) ***");
    removeProductsIfPriceIsMoreThanAndCategoryIsEqualTo(products, 90, "Category 1");
    printList(products);

    // Exemplo de Predicate.negate()
    System.out.println("\n========== Exemplo de Predicate.negate() ==========");
    products = productsDeepCopy(baseProducts);
    System.out.println("*** Antes do removeProductsIfNotPriceIsMoreThanAndCategoryIsEqualTo(...) ***");
    printList(products);

    System.out.println("*** Depois do removeProductsIfNotPriceIsMoreThanAndCategoryIsEqualTo(...) ***");
    removeProductsIfNotPriceIsMoreThanAndCategoryIsEqualTo(products, 90, "Category 1");
    printList(products);

    // Exemplo de Predicate.isEqual()
    System.out.println("\n========== Exemplo de Predicate.isEqual() ==========");
    products = productsDeepCopy(baseProducts);
    System.out.println("*** Antes do removeProducsIfEqualsTo(products, new DefaultProduct(...)) ***");
    printList(products);

    System.out.println("*** Depois do removeProducsIfEqualsTo(products, new DefaultProduct(...)) ***");
    removeProducsIfEqualsTo(products, new DefaultProduct(2, "Product 2", "Category 2", 149.99));
    printList(products);

  }

  private static void printList(Collection<?> list) {
    for (Object item : list) {
      System.out.println(item);
    }
  }

  private static List<Product> productsDeepCopy(List<? extends Product> products) {
    List<Product> newProducts = new ArrayList<>();
    for (Product product : products) {
      Product newProduct = new DefaultProduct(product.getId(), product.getProductName(), product.getCategoryName(), product.getPrice());
      newProducts.add(newProduct);
    }
    return newProducts;
  }

  private static void increaseMapProductsPrice(Map<Integer, ? extends Product> products, double price) {
    products.forEach((key, product) -> product.setPrice(product.getPrice() + price));
  }

  private static void removeProductsIfPriceIsMoreThan(List<? extends Product> products, double price) {
    products.removeIf(product -> product.getPrice() > price);
  }

  private static void removeProductsIfPriceIsMoreThanAndCategoryIsEqualTo(
    List<? extends Product> products, double price, String categoryName
  ) {
    Predicate<Product> isPriceMoreThanPredicate = (product -> product.getPrice() > price);
    Predicate<Product> isCategoryEqualToPredicate = (product -> product.getCategoryName().equals(categoryName));

    products.removeIf(isPriceMoreThanPredicate.and(isCategoryEqualToPredicate));
  }

  private static void removeProductsIfNotPriceIsMoreThanAndCategoryIsEqualTo(
    List<? extends Product> products, double price, String categoryName
  ) {
    Predicate<Product> isPriceMoreThanPredicate = (product -> product.getPrice() > price);
    Predicate<Product> isCategoryEqualToPredicate = (product -> product.getCategoryName().equals(categoryName));

    products.removeIf(isPriceMoreThanPredicate.and(isCategoryEqualToPredicate).negate());
  }

  private static void removeProducsIfEqualsTo(List<? extends Product> products, Product product) {
    products.removeIf(Predicate.isEqual(product));
  }

}