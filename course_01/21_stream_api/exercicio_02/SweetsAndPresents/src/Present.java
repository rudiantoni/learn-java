import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Present {
  private List<Sweet> sweets;

  {
    sweets = new ArrayList<>();
  }

  public void addSweet(Sweet sweet) {
    if (Objects.nonNull(sweet)) {
      sweets.add(sweet);
    }
  }

  public Sweet[] getSweets() {
    return sweets.stream()
      .map(this::deepCopy)
      .toArray(Sweet[]::new);
  }

  private Sweet deepCopy(Sweet sweet) {
    String name = sweet.getName();
    Double weight = sweet.getWeight();
    Double sugarWeight = sweet.getSugarWeight();
    if (sweet instanceof Candy) {
      String flavor = ((Candy) sweet).getFlavor();
      return new Candy(name, weight, sugarWeight, flavor);
    } else if (sweet instanceof Lollipop) {
      String color = ((Lollipop) sweet).getColor();
      return new Lollipop(name, weight, sugarWeight, color);
    } else if (sweet instanceof Cookie) {
      String shape = ((Cookie) sweet).getShape();
      return new Cookie(name, weight, sugarWeight, shape);
    }
    return null;
  }

  public double calculateTotalWeight() {
    return sweets.stream()
      .mapToDouble(Sweet::getWeight)
      .sum();
  }

  public Sweet[] filterSweetsBySugarRange(double minSugarWeight, double maxSugarWeight) {
    return Arrays.stream(this.getSweets())
      .filter(sweet -> sweet.getSugarWeight() >= minSugarWeight && sweet.getSugarWeight() <= maxSugarWeight)
      .toArray(Sweet[]::new);
  }
}
