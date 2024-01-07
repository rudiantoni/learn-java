public class Product {
  private String name;
  private double price;
  private int itemsInWarehouse;

  public Product(String name, double price, int itemsInWarehouse) {
    this.name = name;
    this.price = price;
    this.itemsInWarehouse = itemsInWarehouse;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getItemsInWarehouse() {
    return itemsInWarehouse;
  }

  public void setItemsInWarehouse(int itemsInWarehouse) {
    this.itemsInWarehouse = itemsInWarehouse;
  }

  @Override
  public String toString() {
    return String.format("Product [name=%s, price=%.2f, itemsInWarehouse=%d]", name, price, itemsInWarehouse);
  }
}
