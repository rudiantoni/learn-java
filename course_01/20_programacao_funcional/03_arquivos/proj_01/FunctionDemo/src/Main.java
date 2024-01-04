import java.util.*;
import java.util.function.Function;

public class Main {

  private static final double DISCOUNT_RATE = 0.95;

  public static void main(String[] args) {

    // Exemplo da interface Function
    System.out.println("========== Exemplo da interface Function ==========");
    Map<Integer, String> map = new HashMap<>();
    map.put(1, "one");
    map.put(2, "two");
    map.put(3, "three");

    // Usando expressão lambda
    System.out.println("Antes do computeIfAbsent(4, ...)");
    System.out.println("map.get(4): " + map.get(4));
    map.computeIfAbsent(4, key -> Integer.toString(key));
    System.out.println("Depois do computeIfAbsent(4, ...)");
    System.out.println("map.get(4): " + map.get(4));

    // Usando referência de método
    System.out.println("Antes do computeIfAbsent(5, ...)");
    System.out.println("map.get(5): " + map.get(5));
    map.computeIfAbsent(5, FunctionsDemoCollections::convertIntToString);
    System.out.println("Depois do computeIfAbsent(5, ...)");
    System.out.println("map.get(5): " + map.get(5));

    // Exemplo da interface BiFunction
    System.out.println("\n\n========== Exemplo da interface BiFunction ==========");
    // Usando expressão lambda
    System.out.println("Antes do computeIfPresent(2, ...)");
    System.out.println("map.get(2): " + map.get(2));
    map.computeIfPresent(2, (key, value) -> key + " : " +value);
    System.out.println("Depois do computeIfPresent(2, ...)");
    System.out.println("map.get(2): " + map.get(2));

    // Usando referência de método
    System.out.println("Antes do computeIfPresent(3, ...)");
    System.out.println("map.get(3): " + map.get(3));
    map.computeIfPresent(3, FunctionsDemoCollections::combineIntAndString);
    System.out.println("Depois do computeIfPresent(3, ...)");
    System.out.println("map.get(3): " + map.get(3));

    Map<Product, Double> productDiscountMap = new HashMap<>();
    List<Product> products = new ArrayList<>(Arrays.asList(
      new Product(1, 199.99),
      new Product(2, 79.99),
      new Product(3, 49.99)
    ));

    for (Product product: products) {
      Function<Product, Double> getPriceFunction = product2 -> product2.getPrice();
      Function<Double, Double> getDiscountFunction = price -> price * (1 - DISCOUNT_RATE);
      Function<Product, Double> getPriceAndThenDiscountFunction = getPriceFunction.andThen(getDiscountFunction);
      // O código abaixo equivale o de cima
      Function<Product, Double> getComposePriceWithDiscount = getDiscountFunction.compose(getPriceFunction);
      productDiscountMap.computeIfAbsent(product, getPriceAndThenDiscountFunction);
    }
    System.out.println(productDiscountMap);

    // Exemplo de Comparator.comparing()
    System.out.println("\n\n========== Exemplo de Comparator.comparing() ==========");
    System.out.println("Ordenando pelo preço");
    products.sort(Comparator.comparing(Product::getPrice));
    System.out.println(products);

    System.out.println("Ordenando pelo id");
    products.sort(Comparator.comparing(product -> product.getId()));
    System.out.println(products);


  }

}