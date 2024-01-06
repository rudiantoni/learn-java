import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean keepAskingOption = true;
    String inputOption;
    do {
      System.out.println("Digite uma opção válida:");
      System.out.println("Apenas os valores 'A', 'B', 'C' ou 'D' são permitidos.");
      inputOption = sc.nextLine();

      if (isValidMessageType(inputOption)) {
        keepAskingOption = false;
      } else {
        System.out.println("Valor digitado é inválido.");
      }
    } while (keepAskingOption);
  }

  private static boolean isValidMessageType(String userInput) {
    MessageType[] messageTypes = MessageType.values();
    boolean isValid = false;
    for (MessageType messageType: messageTypes) {
      if (messageType.name().equals(userInput)) {
        String f = String.format("Mensagem: %s, Prioridade: %s.", userInput, messageType.getPriority());
        System.out.println(f);
        isValid = true;
        break;
      }
    }
    return isValid;
  }
}