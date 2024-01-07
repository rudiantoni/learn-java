import java.util.List;

public class Warehouse {
  private List<Product> products;
  public Warehouse() {}
  public List<Product> getProducts() {
    return products;
  }

  public void setProducts(List<Product> products) {
    this.products = products;
  }

  @Override
  public String toString() {
    return "Warehouse{" +
      "products=" + products +
      '}';
  }
}
