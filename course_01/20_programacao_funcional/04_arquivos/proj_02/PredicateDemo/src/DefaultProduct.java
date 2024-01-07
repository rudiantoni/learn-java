import java.util.Objects;

public class DefaultProduct implements Product {
  int id;
  String productName;
  String categoryName;
  double price;
  public DefaultProduct(){}
  public DefaultProduct(int id, String productName, String categoryName, double price) {
    this.id = id;
    this.productName = productName;
    this.categoryName = categoryName;
    this.price = price;
  }
  @Override
  public int getId() {
    return id;
  }
  @Override
  public String getProductName() {
    return productName;
  }

  @Override
  public String getCategoryName() {
    return categoryName;
  }

  @Override
  public double getPrice() {
    return price;
  }

  @Override
  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "DefaultProduct{" +
      "id=" + id +
      ", productName='" + productName + '\'' +
      ", categoryName='" + categoryName + '\'' +
      ", price=" + price +
      '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DefaultProduct that = (DefaultProduct) o;
    return id == that.id && Double.compare(price, that.price) == 0 && Objects.equals(productName, that.productName) && Objects.equals(categoryName, that.categoryName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, productName, categoryName, price);
  }
}
