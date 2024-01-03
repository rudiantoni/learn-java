@FunctionalInterface
public interface DistanceCalculator {
  double calculateDistance(City city1, City city2);

  // Numa interface funcional é proibido possuir mais de um método abstrato
  // double calculateDeliveryTime();

  default void someDefaultMethod() {};

  static void someStaticMethod() {};

}