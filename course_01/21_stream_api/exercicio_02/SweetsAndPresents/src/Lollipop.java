public class Lollipop extends Sweet {
  private final String color;
  public Lollipop(String name, Double weight, Double sugarWeight, String color) {
    super(name, weight, sugarWeight);
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  @Override
  public String toString() {
    return "Lollipop{" +
      "color='" + color + '\'' +
      "} " + super.toString();
  }
}
