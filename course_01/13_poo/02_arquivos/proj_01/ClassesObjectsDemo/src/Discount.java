public class Discount {
  private String discountName;
  private double discountRate;
  public Discount(String discountName, double discountRate) {
    this.discountName = discountName;
    this.discountRate = discountRate;
  }

  public String getDiscountName() {
    return discountName;
  }
  public void setDiscountName(String discountName) {
    this.discountName = discountName;
  }

  public double getDiscountRate() {
    return discountRate;
  }

  public void setDiscountRate(double discountRate) {
    this.discountRate = discountRate;
  }
}
