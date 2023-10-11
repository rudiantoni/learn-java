import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) {
    /**
     * Creating a new object from a class
     */
    System.out.println("========== Default constructor ==========");
    Cart cart = new Cart();
    System.out.println(cart);

    System.out.println();
    System.out.println("========== Custom constructor ==========");
    Cart cart1 = new Cart(2, 2);
    System.out.println(cart1);

    System.out.println();
    System.out.println("========== Add products to cart ==========");
    cart.addProduct(new Product("L shaped showerbath", BigDecimal.valueOf(300)));
    cart.addProduct(new Product("P shaped right hand bath", BigDecimal.valueOf(200)));
    System.out.println(cart);

  }

}