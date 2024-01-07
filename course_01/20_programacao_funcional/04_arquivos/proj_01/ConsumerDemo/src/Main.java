import java.util.*;

public class Main {
  public static void main(String[] args) {

    // Exemplo de Consumer
    System.out.println("========== Exemplo de Consumer ==========");
    List<Product> products = new ArrayList<>(Arrays.asList(
      new DefaultProduct(1, "Product 1", "Category 1", 99.99),
      new DefaultProduct(2, "Product 2", "Category 2", 149.99),
      new DefaultProduct(3, "Product 3", "Category 3", 39.99)
    ));
    System.out.println("Antes de alterar o valor");
    printList(products);

    increasePriceForProductList(products, 10);
    System.out.println("Depois de alterar o valor");
    printList(products);

    // Exemplo de BiConsumer
    System.out.println("\n========== Exemplo de BiConsumer ==========");
    Map<Integer, Product> idProductMap = new HashMap<>();
    idProductMap.put(1, new DefaultProduct(1, "Product 1", "Category 1", 99.99));
    idProductMap.put(2, new DefaultProduct(2, "Product 2", "Category 2", 149.99));
    idProductMap.put(3, new DefaultProduct(3, "Product 3", "Category 3", 39.99));
    System.out.println("Antes de alterar o valor");
    printList(idProductMap.values());

    increasePriceForProductMap(idProductMap, 50);
    System.out.println("Depois de alterar o valor");
    printList(idProductMap.values());
  }
  private static void printList(Collection<?> list) {
    for (Object item: list){
      System.out.println(item);
    }
  }
  private static void increasePriceForProductList(List<? extends Product> products, double priceToIncrease) {
    products.iterator().forEachRemaining(product -> product.setPrice(product.getPrice() + priceToIncrease));
  }

  private static void increasePriceForProductMap(Map<Integer, ? extends Product> idProductMap, double priceToIncrease) {
    idProductMap.forEach((id, product) -> product.setPrice(product.getPrice() + priceToIncrease));
  }
}