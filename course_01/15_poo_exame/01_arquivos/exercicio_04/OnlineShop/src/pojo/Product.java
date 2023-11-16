package pojo;

import java.util.Objects;

public class Product {
  private int id;
  private String productName;
  private String categoryName;
  private double price;

  public Product(int id, String productName, String categoryName, double price) {
    this.id = id;
    this.productName = productName;
    this.categoryName = categoryName;
    this.price = price;
  }

  public int getId() { return id; }
  public void setId(int id) { this.id = id; }

  public String getProductName() { return productName;}
  public void setProductName(String productName) { this.productName = productName; }

  public String getCategoryName() { return categoryName; }

  public void setCategoryName(String categoryName) { this.categoryName = categoryName; }

  public double getPrice() { return price; }

  public void setPrice(double price) { this.price = price; }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Product product = (Product) o;
    return id == product.id && Double.compare(price, product.price) == 0 && Objects.equals(productName, product.productName) && Objects.equals(categoryName, product.categoryName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, productName, categoryName, price);
  }

  public String toStringFormatted() {
    return String.format("Código: %d - Categoria: %s, Nome: %s, Preço: R$ %.2f", id, categoryName, productName, price);
  }

  @Override
  public String toString() {
    return "Product{" +
      "id=" + id +
      ", productName='" + productName + '\'' +
      ", categoryName='" + categoryName + '\'' +
      ", price=" + price +
      '}';
  }
}
