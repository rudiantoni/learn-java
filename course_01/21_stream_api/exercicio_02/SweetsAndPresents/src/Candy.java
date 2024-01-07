public class Candy extends Sweet {
  private final String flavor;

  public Candy(String name, Double weight, Double sugarWeight, String flavor) {
    super(name, weight, sugarWeight);
    this.flavor = flavor;
  }

  public String getFlavor() {
    return flavor;
  }

  @Override
  public String toString() {
    return "Candy{" +
      "flavor='" + flavor + '\'' +
      "} " + super.toString();
  }
}
