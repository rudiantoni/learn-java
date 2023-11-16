package pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Order {
  private static int nextId;
  private int id;
  static { nextId = 1; }
  { id = nextId++; }
  private List<Product> productList = new ArrayList<>();
  double total = 0.0;

  public Order(List<Product> listProduct) {
    this.productList = new ArrayList<>(listProduct);
    this.total = productList.stream().mapToDouble(Product::getPrice).sum();
  }

  public static int getNextId() {
    return nextId;
  }

  public int getId() {
    return id;
  }

  public List<Product> getProductList() {
    return productList;
  }

  public void setProductList(List<Product> productList) {
    this.productList = productList;
  }

  public double getTotal() {
    return total;
  }

  public void setTotal(double total) {
    this.total = total;
  }

  @Override
  public String toString() {
    return "Order{" +
      "id=" + id +
      ", productList=" + productList +
      ", total=" + total +
      '}';
  }

  public String toStringFormatted() {
    List<String> allProducts = productList.stream().map( it -> String.format("\t%s", it.toStringFormatted())).collect(Collectors.toList());
    return String.format("Pedido %d:\n" +
      "%s\n" +
      "\t\tTotal: %.2f", id, String.join("\n", allProducts), total);
  }
}
