import java.util.Comparator;

public class CustomProductComparator implements Comparator<Product> {

  @Override
  public int compare(Product o1, Product o2) {
    int categoryResult = o1.getCategoryName().compareTo(o2.getCategoryName());
    if (categoryResult == 0) {
      int priceResult = Double.valueOf(o1.getPrice()).compareTo(Double.valueOf(o2.getPrice()));
      if (priceResult == 0) {
        int nameResult = o1.getProductName().compareTo(o2.getProductName());
        return nameResult;
      } else {
        return priceResult;
      }
    } else {
      return categoryResult;
    }
  }
}
