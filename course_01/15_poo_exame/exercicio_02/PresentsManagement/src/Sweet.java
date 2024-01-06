public abstract class Sweet {
  private String name;
  private double weight;
  private double sugarWeight;

  public String getName() {
    return name;
  }

  public Sweet() {}

  abstract Sweet copy();

  public void setName(String name) {
    this.name = name;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public double getSugarWeight() {
    return sugarWeight;
  }

  public void setSugarWeight(double sugarWeight) {
    this.sugarWeight = sugarWeight;
  }

  @Override
  public String toString() {
    String className = getClass().getName();
    String printClassName = className.isEmpty() ? "Sweet" : className;
    return printClassName + "{" +
      "name='" + name + '\'' +
      ", weight=" + weight +
      ", sugarWeight=" + sugarWeight +
      ", hashCode=" + Integer.toHexString(System.identityHashCode(this)) +
      '}';
  }
}
