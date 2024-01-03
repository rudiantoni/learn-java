public class Main {
  public static void main(String[] args) {
    // Para o exemplo de interfaces funcionais:
    // Ver City e DistanceCalculator

    // ========== Exemplo de expressões lambda ==========
    System.out.println("========== Exemplo de expressões lambda ==========");

    // Maneira antiga (sem exepressão lambda)
    // Cria o objeto e passa um objeto que possui a implementação do método
    OrderManagement orderManagement = new OrderManagement(new DefaultDistanceCalculator());

    // Re-implementa a interface passando os comportamentos do método
    orderManagement.setDistanceCalculator(new DistanceCalculator() {
      @Override
      public double calculateDistance(City city1, City city2) {
        return city1.getLongitude() - city2.getLongitude(); // Cálculo de demonstração
      }
    });

    // Maneira nova (com exepressão lambda)
    //
    //   Aqui utilizamos uma expressão lambda implementando o método abstrato calculateDistance
    //   da interface funcional DistanceCalculator
    //
    //   Aqui tipar é opcional
    //   (City city1, City city2) -> {} equivale a
    //   (city1, city2) -> {}
    //
    // Lambda com apenas 1 instrução
    DistanceCalculator dCalculator = ((city1, city2) -> city1.getLatitude() - city2.getLatitude());
    // Lambda com mais de 1 instrução
    DistanceCalculator dCalculator2 = ((city1, city2) -> {
      System.out.println("Texto dentro da expressão lambda");
      return city1.getLatitude() - city2.getLatitude();
    });

    // Exemplo utilizando lambda com mais de 1 instrução
    dCalculator2.calculateDistance(new City(), new City());
    // Exemplo definindo novo comportamento para o método usando lambda ao
    // invés de reimplementar a interface como foi feito antes
    orderManagement.setDistanceCalculator((city1, city2) -> 5.52);

    // ========== Exemplo de método de referência ==========
    System.out.println("========== Exemplo de método de referência ==========");
    // O método que está sendo referenciado deve possuir os mesmos tipos de parâmetros e retorno do que o esperado
    // pelo método abstrato (na interface, que seria implementado)
    orderManagement.setDistanceCalculator(GoogleDistanceCalculator::getDistanceBetweenCitiesStatic);

    GoogleDistanceCalculator gdc = new GoogleDistanceCalculator();
    orderManagement.setDistanceCalculator(gdc::getDiscanteBetweenCities);

  }
}