public class ComparableProduct implements Comparable<ComparableProduct>{
  private Integer id;
  private String name;
  private String category;
  private Double price;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ComparableProduct(Integer id, String name, String category, Double price) {
    this.id = id;
    this.name = name;
    this.category = category;
    this.price = price;
  }

  @Override
  public int compareTo(ComparableProduct o) {
    return this.id - o.getId();
  }

  @Override
  public String toString() {
    return String.format("Product id=%d, product name=%s, category name=%s, price=%.2f", id, name, category, price);
  }
}
