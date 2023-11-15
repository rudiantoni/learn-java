package enums;

import java.util.Arrays;

public enum Command {
  UNKNOWN("desconhecido", "Erro: comando desconhecido"),
  EXIT("exit", "Fecha a aplicação"),
  GET_LOGGED("adm-logged", "Imprime quem está logado"),
  GET_USERS("adm-users", "Imprime os usuários");

  Command(String name, String description) {
    this.name = name;
    this.description = description;
  }
  private final String name;
  private final String description;

  public String getName() { return name; }
  public String getDescription() { return description; }

  public static Command getCommandByName(String name) {
    for (Command command: Command.values()) {
      if (command.getName().equalsIgnoreCase(name)) {
        return command;
      }
    }
    return Command.UNKNOWN;
  }
}
