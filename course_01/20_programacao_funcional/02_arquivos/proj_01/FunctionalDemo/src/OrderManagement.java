public class OrderManagement {
  private DistanceCalculator distanceCalculator;
  public OrderManagement(DistanceCalculator distanceCalculator) {
    this.distanceCalculator = distanceCalculator;
  }
  public void setDistanceCalculator(DistanceCalculator distanceCalculator) {
    this.distanceCalculator = distanceCalculator;
  }
}
