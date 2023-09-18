public class Main {
  public static void main(String[] args) {
    // Tipos de expressão disponíveis: byte, short, char, int, String, Enum
    String customerStatus = "premium_customer";
    switch (customerStatus) {
      case "guest":
        System.out.println("Obrigado pelo seu pedido!");
        break;
      case "regular_customer":
        System.out.println("Obrigado pela sua compra! Aproveite este desconto de 10% por permanecer conosco!");
        break;
      case "premium_customer":
        System.out.println("Uau! você é um cliente PREMIUM! Leve todo o pedido por apenas 1 USD.");
        break;
      default:
        System.out.println("Cliente ainda não possui status definido.");
    }

    System.out.println("===== Uso sem o break =====");
    int i = 1;
    switch (i) {
      case 1:
        System.out.println("um");
      case 2:
        System.out.println("dois");
        break;
      default:
        System.out.println("Este é o bloco default.");
    }

    System.out.println("===== Uso do bloco default =====");
    i = 10;
    switch (i) {
      case 1:
        System.out.println("um");
      case 2:
        System.out.println("dois");
        break;
      default:
        System.out.println("Este é o bloco default.");
    }
  }
}