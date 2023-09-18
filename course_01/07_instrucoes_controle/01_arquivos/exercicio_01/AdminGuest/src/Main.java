public class Main {
  public static void main(String[] args) {
    String currentArgs = String.join(" ", args);
    String admin = "--admin";
    String guest = "--guest";
    if ((currentArgs.contains(admin) && currentArgs.contains(guest)) ||
      !currentArgs.contains(admin) && !currentArgs.contains(guest)) {
      System.out.println("Por favor, selecione o modo 'ADMIN' ou 'GUEST' para este programa");
    } else if (currentArgs.contains(admin)) {
      System.out.println("Olá, Administrador!");
    } else if (currentArgs.contains(guest)) {
      System.out.println("Olá, Convidado!");
    } else {
      System.out.println("Por favor, selecione o modo 'ADMIN' ou 'GUEST' para este programa");
    }
  }
}