public class MasterProduct extends BaseProduct {
  private boolean isAvailableForLease;

  @Override
  public boolean isAvailableInStock() {
    return getRemainingAmountInStock() > 0;
  }
}
