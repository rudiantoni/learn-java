public class Main {
  public static void main(String[] args) {
    System.out.println("========== USO BÁSICO ==========");
    Priority priority = Priority.HIGH;
    switch (priority) {
      case HIGH:
        System.out.println("High priority.");
        break;
      case MEDIUM:
        System.out.println("Medium priority.");
        break;
      case LOW:
        System.out.println("Low priority.");
        break;
    }

    // INICIALIZAÇÃO POR NOME
    // Outra opção de inicialização
    System.out.println("\n========== INICIALIZAÇÃO POR NOME ==========");
    Priority priority1 = Priority.valueOf("HIGH");
    System.out.println(priority1);
    //Priority priority2 = Priority.valueOf("high"); // java.lang.IllegalArgumentException: No enum constant Priority.high

    // COMPARAÇÃO
    // Pode ser usado o operador de igualdade ==
    System.out.println("\n========== COMPARAÇÃO ==========");
    System.out.println("Priority.HIGH == Priority.MEDIUM = " + (Priority.HIGH == Priority.MEDIUM));
    System.out.println("Priority.HIGH == Priority.HIGH = " + (Priority.HIGH == Priority.HIGH));

    // ORDINAL
    // Obtém a ordem (ordinal) em que cada valor está no enum
    System.out.println("\n========== ORDINAL ==========");
    System.out.println("Priority.HIGH.ordinal()) = " + Priority.HIGH.ordinal());
    System.out.println("Priority.MEDIUM.ordinal() = " + Priority.MEDIUM.ordinal());
    System.out.println("Priority.LOW.ordinal() = " + Priority.LOW.ordinal());

    // ITERAÇÃO
    // É possível iterar nos valores do enum como arrays
    System.out.println("\n========== ITERAÇÃO ==========");
    Priority[] priorities = Priority.values();
    for (Priority priorityItem: priorities) {
      System.out.println(priorityItem);
    }

    // MÉTODOS E PROPRIEDADES
    // Os enums podem possuir seus próprias métodos e propriedades
    System.out.println("\n========== MÉTODOS E PROPRIEDADES ==========");
    System.out.println("Month.JANUARY.getDaysAmount() = " + Month.JANUARY.getDaysAmount());
  }
}