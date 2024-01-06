package pojo;

import java.util.ArrayList;
import java.util.List;

public class Cart {
  private List<Product> productList = new ArrayList<>();

  public boolean isCartEmpty() {
    return productList.isEmpty();
  }

  public void addProduct(Product product) {
    productList.add(product);
  }

  public void empty() {
    productList.clear();
  }

  public List<Product> getProductList() {
    return new ArrayList<>(productList);
  }

  @Override
  public String toString() {
    return "Cart{" +
      "productList=" + productList +
      '}';
  }
}
