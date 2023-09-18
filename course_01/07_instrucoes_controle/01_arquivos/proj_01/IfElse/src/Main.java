public class Main {
  public static void main(String[] args) {
    int amountOfMoneyOnAccount = 100;
    int itemPrice = 200;

    if (amountOfMoneyOnAccount < itemPrice) {
      System.out.println("Você não tem dinheiro suficiente na sua conta para comprar este item.");
    } else {
      // Implementação da lógica de compra aqui
      System.out.println("Item comprado.");
    }

    // Exemplo sem chaves
    amountOfMoneyOnAccount += 200;
    if (amountOfMoneyOnAccount < itemPrice)
      System.out.println("Você não tem dinheiro suficiente na sua conta para comprar este item.");
    else
      // Implementação da lógica de compra aqui
      System.out.println("Item comprado.");

    // Instruções if aninhadas
    int i1 = 3;
    int i2 = 2;
    int i3 = 10;
    if (i1 > i2) {
      if (i1 > i3)
        System.out.println("i1 é mais que i2 e i3");
      else
        System.out.println("i1 é mais que i2 mas menos que i3");
    }

    // if - else - if
    int orderPrice = 1000;
    if (orderPrice > 0 && orderPrice < 100) {
      System.out.println("Você tem um desconto de 5% para este pedido.");
    } else if (orderPrice >= 100 && orderPrice < 500) {
      System.out.println("Você tem um desconto de 10% para este pedido.");
    } else if (orderPrice >= 500 && orderPrice < 5000) {
      System.out.println("Você tem um desconto de 15% para este pedido.");
    }

  }
}