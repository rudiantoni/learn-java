public class Cookie extends Sweet {
  private final String shape;
  public Cookie(String name, Double weight, Double sugarWeight, String shape) {
    super(name, weight, sugarWeight);
    this.shape = shape;
  }

  public String getShape() {
    return shape;
  }

  @Override
  public String toString() {
    return "Cookie{" +
      "shape='" + shape + '\'' +
      "} " + super.toString();
  }
}
