public abstract class Sweet {
  private final String name;
  private final Double weight;
  private final Double sugarWeight;

  public Sweet(String name, Double weight, Double sugarWeight) {
    this.name = name;
    this.weight = weight;
    this.sugarWeight = sugarWeight;
  }

  public String getName() {
    return name;
  }

  public Double getWeight() {
    return weight;
  }

  public Double getSugarWeight() {
    return sugarWeight;
  }

  @Override
  public String toString() {
    return "Sweet{" +
      "name='" + name + '\'' +
      ", weight=" + weight +
      ", sugarWeight=" + sugarWeight +
      '}';
  }
}
