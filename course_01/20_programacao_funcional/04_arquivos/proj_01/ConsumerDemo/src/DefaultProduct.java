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
}
