import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Present present = new Present();
    System.out.println("========== Doces e presentes ==========");
    System.out.println("*** Presentes inicial ***");
    printList(Arrays.asList(present.getSweets()));
    System.out.printf("Peso total: %f\n", present.calculateTotalWeight());
    System.out.printf("Doces no filtro de peso de açúcar (0.02 - 0.05): %s\n", Arrays.toString(present.filterSweetsBySugarRange(0.02, 0.05)));

    System.out.println("\n*** Depois de adicionar as balas ***");
    present.addSweet(new Candy("Menta", 0.05, 0.02, "Menta"));
    present.addSweet(new Candy("Frutas Tropicais", 0.06, 0.025, "Tropical"));
    present.addSweet(new Candy("Limão", 0.04, 0.015, "Citrico"));
    present.addSweet(new Candy("Morango", 0.05, 0.02, "Frutado"));
    present.addSweet(new Candy("Caramelo", 0.07, 0.03, "Doce"));
    printList(Arrays.asList(present.getSweets()));
    System.out.printf("Peso total: %f\n", present.calculateTotalWeight());
    System.out.println("Doces no filtro de peso de açúcar (0.02 - 0.05):");
    printList(Arrays.asList(present.filterSweetsBySugarRange(0.02, 0.05)));

    System.out.println("\n*** Depois de adicionar os pirulitos ***");
    present.addSweet(new Lollipop("Vermelho", 0.08, 0.03, "Vermelho"));
    present.addSweet(new Lollipop("Azul", 0.09, 0.035, "Azul"));
    present.addSweet(new Lollipop("Verde", 0.08, 0.03, "Verde"));
    present.addSweet(new Lollipop("Amarelo", 0.07, 0.025, "Amarelo"));
    present.addSweet(new Lollipop("Roxo", 0.09, 0.035, "Roxo"));
    printList(Arrays.asList(present.getSweets()));
    System.out.printf("Peso total: %f\n", present.calculateTotalWeight());
    System.out.println("Doces no filtro de peso de açúcar (0.02 - 0.05):");
    printList(Arrays.asList(present.filterSweetsBySugarRange(0.02, 0.05)));

    System.out.println("\n*** Depois de adicionar os biscoitos ***");
    present.addSweet(new Cookie("Redondo", 0.1, 0.04, "Redondo"));
    present.addSweet(new Cookie("Quadrado", 0.12, 0.05, "Quadrado"));
    present.addSweet(new Cookie("Coração", 0.09, 0.035, "Coração"));
    present.addSweet(new Cookie("Estrela", 0.11, 0.045, "Estrela"));
    present.addSweet(new Cookie("Lua", 0.13, 0.06, "Lua"));
    printList(Arrays.asList(present.getSweets()));
    System.out.printf("Peso total: %f\n", present.calculateTotalWeight());
    System.out.println("Doces no filtro de peso de açúcar (0.02 - 0.05):");
    printList(Arrays.asList(present.filterSweetsBySugarRange(0.02, 0.05)));

  }

  private static void printList(Collection<?> list) {
    for (Object item : list) {
      System.out.println(item);
    }
  }
}