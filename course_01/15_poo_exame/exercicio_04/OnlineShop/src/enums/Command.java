package enums;

public enum Command {
  UNKNOWN("desconhecido", "Erro: comando desconhecido"),
  EXIT("exit", "Fecha a aplicação"),
  MAIN_MENU("menu", "Retorna para o menu principal"),
  CHECKOUT("checkout", "Finaliza a compra"),
  GET_LOGGED("a", "Imprime quem está logado"),
  GET_USERS("b", "Imprime os usuários"),
  GET_PRODUCTS("c", "Imprime os produtos");

  Command(String name, String description) {
    this.name = name;
    this.description = description;
  }

  private final String name;
  private final String description;

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public static Command getCommandByName(String name) {
    for (Command command : Command.values()) {
      if (command.getName().equalsIgnoreCase(name)) {
        return command;
      }
    }
    return Command.UNKNOWN;
  }
}
