public class Product {
  private Integer id;
  private String name;
  private String category;
  private Double price;

  public Product(Integer id, String name, String category, Double price) {
    this.id = id;
    this.name = name;
    this.category = category;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return String.format("Product id=%d, product name=%s, category name=%s, price=%.2f", id, name, category, price);
  }
}
