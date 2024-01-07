import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    // Exemplo de filter(), map() e collect()
    System.out.println("========== Exemplo de filter(), map() e collect() ==========");
    List<Product> products = new ArrayList<>(Arrays.asList(
      new Product("iPhone", 1099.99, 1345),
      new Product("Boots", 49.99, 15200),
      new Product("HP Laptop", 2599.99, 876),
      new Product("SSD", 239.99, 900),
      new Product("Sony PlayStation", 2009.99, 1001)
    ));
    System.out.println("*** Antes do filter(...), map(...) and collect(...) ***");
    printList(products);

    System.out.println("*** Depois do filter(...), map(...) and collect(...) ***");
    List<Product> modifiedProducts = products.stream()
      .filter(product -> product.getItemsInWarehouse() > 1000)
      .map(product -> {
        product.setPrice(product.getPrice() - (product.getPrice() * 0.1));
        return product;
      })
      .collect(Collectors.toList());
    modifiedProducts.stream().forEach(System.out::println);

    // Exemplo de flatMap()
    System.out.println("\n========== Exemplo de flatMap() ==========");
    Warehouse warehouse1 = new Warehouse();
    Warehouse warehouse2 = new Warehouse();
    Warehouse warehouse3 = new Warehouse();

    warehouse1.setProducts(Arrays.asList(
      new Product("iPhone", 1099.99, 1345)
    ));
    warehouse2.setProducts(Arrays.asList(
      new Product("Boots", 49.99, 15200),
      new Product("HP Laptop", 2599.99, 876)
    ));
    warehouse3.setProducts(Arrays.asList(
      new Product("SSD", 239.99, 900),
      new Product("Sony PlayStation", 2009.99, 1001)
    ));

    List<Warehouse> warehouses = new ArrayList<>(Arrays.asList(warehouse1, warehouse2, warehouse3));
    System.out.println("*** Antes do flatMap(...) e outros ***");
    warehouses.forEach(System.out::println);

    Product[] productsArray = warehouses.stream()
      .flatMap(warehouse -> warehouse.getProducts().stream())
      .filter(product -> product.getItemsInWarehouse() > 1000)
      .map(product -> {
        product.setPrice(product.getPrice() - (product.getPrice() * 0.1));
        return product;
      })
      .toArray(Product[]::new);
    System.out.println("*** Depois do flatMap(...) e outros ***");
    Arrays.stream(productsArray).forEach(System.out::println);

    // Exemplo de toMap()
    System.out.println("\n========== Exemplo de toMap() ==========");
    Map<String, Product> productMap = products.stream()
      .collect(Collectors.toMap(Product::getName, Function.identity()));
    printMap(productMap);

    // Exemplo de mapToInt() e sum()
    System.out.println("\n========== Exemplo de mapToInt() e sum() ==========");
    int totalItemsAmount = products.stream()
      .mapToInt(value -> value.getItemsInWarehouse())
      .sum();
    System.out.println("Quantidade total de itens: " +totalItemsAmount);
  }

  private static void printList(Collection<?> list) {
    for (Object item : list) {
      System.out.println(item);
    }
  }
  private static void printMap(Map<?, ?> map) {
    List<?> list = map.entrySet().stream()
      .map(entry -> entry.getKey().toString() + " : " + entry.getValue().toString())
      .collect(Collectors.toList());
    printList(list);
  }

}