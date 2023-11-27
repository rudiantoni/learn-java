
public class Product  {
  private Integer id;
  private String productName;
  private String productCategory;
  private Double price;

  public Product(Integer id, String productName, String productCategory, Double price) {
    this.id = id;
    this.productName = productName;
    this.productCategory = productCategory;
    this.price = price;
  }

  public Integer getId() {
    return id;
  }

  public String getProductName() {
    return productName;
  }

  public String getProductCategory() {
    return productCategory;
  }

  public Double getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return "Product{" +
      "id=" + id +
      ", productName='" + productName + '\'' +
      ", productCategory='" + productCategory + '\'' +
      ", price=" + price +
      '}';
  }
}
