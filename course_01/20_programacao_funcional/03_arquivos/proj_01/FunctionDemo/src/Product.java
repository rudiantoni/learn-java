public class Product {
  private int id;
  private double price;

  public Product(int id, double price) {
    this.id = id;
    this.price = price;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return String.format("Product [id=%d, price=%f]", id, price);
  }
}
