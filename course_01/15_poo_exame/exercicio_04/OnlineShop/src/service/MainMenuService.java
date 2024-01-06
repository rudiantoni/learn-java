package service;

import config.AppContext;
import enums.Command;
import pojo.Order;
import pojo.Product;
import pojo.User;
import util.ConsoleUtil;
import util.Consts;
import util.InputUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainMenuService {
  public void initialize() {
    ConsoleUtil.clean();
    ConsoleUtil.printMainMenu();
    List<String> allowedCommands = new ArrayList<>();
    allowedCommands.add(Command.EXIT.getName());
    allowedCommands.add(Command.GET_LOGGED.getName());
    allowedCommands.add(Command.GET_USERS.getName());
    allowedCommands.add(Command.GET_PRODUCTS.getName());
    List<String> allowedOptions = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6"));
    allowedOptions.addAll(allowedCommands);
    ConsoleUtil.printAllowedCommands(allowedCommands);
    String input = InputUtil.waitForAllowedOption("Digite uma opção válida: ", allowedOptions);
    if (input.equals(Command.EXIT.getName())) {
      if (!AppContext.hasLoggedUser()) {
        logout();
      }
      System.out.println("A aplicação será fechada. Até a próxima!");
      InputUtil.pause();
      System.exit(0);

    } else if (input.equals(Command.GET_LOGGED.getName())) {
      System.out.println(AppContext.getLoggedUser());
      InputUtil.pause();
      initialize();

    } else if (input.equals(Command.GET_USERS.getName())) {
      System.out.println(AppContext.getUserList());
      InputUtil.pause();
      initialize();

    } else if (input.equals(Command.GET_PRODUCTS.getName())) {
      System.out.println(AppContext.getProductList());
      InputUtil.pause();
      initialize();

    } else if (input.equals("1")) {
      registerUser();

    } else if (input.equals("2")) {

      if (!AppContext.hasLoggedUser()) {
        requestLogin();
      } else {
        requestLogout();
      }

    } else if (input.equals("3")) {
      productCatalog();

    } else if (input.equals("4")) {
      if (AppContext.hasLoggedUser()) {

        if (AppContext.getLoggedUser().isOrderListEmpty()) {
          System.out.println("Você ainda não realizou nenhum pedido, adicione produtos no carrinho e/ou finalize sua compra.");
          InputUtil.pause();
          initialize();
        } else {
          myOrders();
        }

      } else {
        System.out.println("Você ainda não entrou, entre ou crie uma conta nova.");
        InputUtil.pause();
        initialize();
      }

    } else if (input.equals("5")) {
      if (AppContext.hasLoggedUser()) {
        settings();
      } else {
        System.out.println("Você ainda não entrou, entre ou crie uma conta nova.");
        InputUtil.pause();
        initialize();
      }

    } else if (input.equals("6")) {
      customerList();

    }

  }

  private void registerUser() {
    ConsoleUtil.clean();
    ConsoleUtil.printHeader();
    System.out.printf("%s - Registro de usuário\n", Consts.APP_NAME);
    ConsoleUtil.printDivider();

    String firstName = InputUtil.waitForAnyInput("Digite o seu primeiro nome: ");
    String lastName = InputUtil.waitForAnyInput("Digite o seu último nome: ");
    String email = InputUtil.waitForAnyInput("Digite o seu email: ");
    if (email.replaceAll("\\s+", "").isEmpty()) {
      System.out.println("E-mail inválido: você deve inserir um e-mail para se registrar.");
      InputUtil.pause();
      initialize();
      return;
    } else if (AppContext.isEmailAlreadyInUse(email)) {
      System.out.println("E-mail inválido: este e-mail já está sendo usado.");
      InputUtil.pause();
      initialize();
      return;
    }
    String password = InputUtil.waitForAnyInput("Digite sua senha: ");
    User createdUser = AppContext.addUser(firstName, lastName, email, password);
    if (AppContext.hasLoggedUser()) {
      requestLogout();
    }
    login(createdUser);
    System.out.println("Novo usuário criado e já logado no sistema.");
    InputUtil.pause();
    initialize();
  }

  private void requestLogout() {
    ConsoleUtil.clean();
    ConsoleUtil.printHeader();
    System.out.printf("%s - Sair\n", Consts.APP_NAME);
    ConsoleUtil.printDivider();
    System.out.printf("Até a próxima %s.\n", AppContext.getLoggedUser().getFirstName());
    logout();
    InputUtil.pause();
    initialize();
  }

  private void logout() {
    AppContext.setLoggedUser(null);
  }

  private void requestLogin() {
    ConsoleUtil.clean();
    ConsoleUtil.printHeader();
    System.out.printf("%s - Entrar\n", Consts.APP_NAME);
    ConsoleUtil.printDivider();
    String email = InputUtil.waitForAnyInput("Digite o seu email: ");
    String password = InputUtil.waitForAnyInput("Digite a sua senha: ");
    User user = AppContext.findFirstUserByEmailAndPassword(email, password);
    if (user == null) {
      System.out.println("Usuário e/ou senha inválido.");
      InputUtil.pause();
      initialize();
      return;
    } else {
      login(user);
      System.out.printf("Olá %s %s! Ficamos felizes em te ver novamente.\n", user.getFirstName(), user.getLastName());
      InputUtil.pause();
      initialize();
      return;
    }
  }

  private void login(User user) {
    AppContext.setLoggedUser(user);
  }

  private void productCatalog() {
    ConsoleUtil.clean();
    ConsoleUtil.printHeader();
    System.out.printf("%s - Catálogo de produtos\n", Consts.APP_NAME);
    ConsoleUtil.printDivider();
    List<String> allProducts = AppContext.getProductList().stream().map(Product::toStringFormatted).collect(Collectors.toList());
    System.out.println(String.join("\n", allProducts));

    List<String> allowedCommands = new ArrayList<>();
    allowedCommands.add(Command.MAIN_MENU.getName());
    allowedCommands.add(Command.CHECKOUT.getName());

    List<String> allowedOptions = new ArrayList<>();
    allowedOptions.addAll(AppContext.getProductList().stream().map(it -> String.valueOf(it.getId())).collect(Collectors.toList()));
    allowedOptions.addAll(allowedCommands);

    ConsoleUtil.printAllowedCommands(allowedCommands);
    String input = InputUtil.waitForAllowedOption(
      "Digite o código do produto ou uma opção válida: ",
      "Por favor, digite o código do produto para adicioná-lo ao carrinho.\n" +
        "Ou digite \"" + Command.CHECKOUT.getName() + "\" se você quiser prosseguir com a finalização da compra.\n" +
        "Ou digite \"" + Command.MAIN_MENU.getName() + "\" se você quiser navegar de volta para o menu principal.",
      allowedOptions);
    if (input.equals(Command.MAIN_MENU.getName())) {
      initialize();
      return;
    }
    if (input.equals(Command.CHECKOUT.getName())) {
      if (!AppContext.hasLoggedUser()) {
        System.out.println("Você não entrou. Por favor entre ou crie uma nova conta.");
        InputUtil.pause();
        initialize();
        return;
      } else if (AppContext.getLoggedUser().getCart().isCartEmpty()) {
        System.out.println("Seu carrinho está vazio. Por favor, adicione produtos ao seu carrinho antes de tentar finalizar a compra.");
        InputUtil.pause();
        productCatalog();
        return;
      }

      boolean isCreditCardNumberValid = false;
      String creditCardNumber;
      int maxTries = 3;
      int currentTry = 1;

      do {
        System.out.printf("Por razões de segurança, o número máximo de tentativas é %d. Você está na tentativa %d.\n", maxTries, currentTry);
        creditCardNumber = InputUtil.waitForAnyInput("Digite o número do seu cartão de crédito sem espaços e pressione \"Enter\" para confirmar a compra.\n");
        if (creditCardNumber.length() == 16) {
          isCreditCardNumberValid = true;
        }
        currentTry++;
      } while (!isCreditCardNumberValid && currentTry <= maxTries);

      if (!isCreditCardNumberValid) {
        System.out.println("Você esgotou o máximo de tentativas para digitar o cartão de crédito.");
        InputUtil.pause();
        productCatalog();
        return;
      }
      Order generatedOrder = AppContext.getLoggedUser().addOrder(AppContext.getLoggedUser().getCart().getProductList());
      System.out.printf("Foi gerado o pedido %d.\n", generatedOrder.getId());
      System.out.println("Muito obrigado pela sua compra. Detalhes sobre a entrega do pedido foram enviados para o seu e-mail.");
      AppContext.getLoggedUser().getCart().empty();
      InputUtil.pause();
      initialize();
      return;
    }

    if (AppContext.hasLoggedUser()) {
      Product chosenProduct = AppContext.findProductById(Integer.parseInt(input));
      if (chosenProduct != null) {
        AppContext.getLoggedUser().getCart().addProduct(chosenProduct);
        System.out.printf("\nO produto %s foi adicionado ao seu carrinho.\n\n", chosenProduct.getProductName());
        InputUtil.pause();
        productCatalog();
      } else {
        System.out.println("Produto inválido.");
        initialize();
      }

    } else {
      System.out.println("Você ainda não entrou, por favor entre ou crie uma conta nova.");
      InputUtil.pause();
      initialize();
      return;
    }

  }

  private void myOrders() {
    ConsoleUtil.clean();
    ConsoleUtil.printHeader();
    System.out.printf("%s - Meus pedidos\n", Consts.APP_NAME);
    ConsoleUtil.printDivider();
    List<String> allOrders = AppContext.getLoggedUser().getOrderList().stream().map(Order::toStringFormatted).collect(Collectors.toList());
    System.out.println(String.join("\n", allOrders));
    InputUtil.pause();
    initialize();
  }

  private void settings() {
    ConsoleUtil.clean();
    ConsoleUtil.printHeader();
    System.out.printf("%s - Configurações\n", Consts.APP_NAME);
    ConsoleUtil.printDivider();
    System.out.println("1 - Alterar senha");
    System.out.println("2 - Alterar e-mail");
    String input = InputUtil.waitForAllowedOption("Digite uma opção válida: ", Arrays.asList("1", "2"));
    if (input.equals("1")) {
      String password = InputUtil.waitForAnyInput("Digite sua senha: ");
      int currentUserId = AppContext.getLoggedUser().getId();
      User user = AppContext.getUserList().stream().filter(it -> it.getId() == currentUserId).findFirst().orElse(null);
      if (user != null) {
        user.setPassword(password);
        System.out.println("Sua senha foi alterada com sucesso.");
        InputUtil.pause();
        initialize();
        return;
      }
    } else if (input.equals("2")) {
      int currentUserId = AppContext.getLoggedUser().getId();
      String email = InputUtil.waitForAnyInput("Digite seu e-mail: ");
      if (email.replaceAll("\\s+", "").isEmpty()) {
        System.out.println("E-mail inválido: você deve inserir um e-mail para se registrar.");
        InputUtil.pause();
        initialize();
        return;
      } else if (AppContext.isEmailAlreadyInUse(email)) {
        System.out.println("E-mail inválido: este e-mail já está sendo usado.");
        InputUtil.pause();
        initialize();
        return;
      }
      User user = AppContext.getUserList().stream().filter(it -> it.getId() == currentUserId).findFirst().orElse(null);
      if (user != null) {
        user.setEmail(email);
        System.out.println("Seu e-mail foi alterado com sucesso.");
        InputUtil.pause();
        initialize();
        return;
      }
    }
  }

  private void customerList() {
    ConsoleUtil.clean();
    ConsoleUtil.printHeader();
    System.out.printf("%s - Lista de clientes\n", Consts.APP_NAME);
    ConsoleUtil.printDivider();
    List<String> allCustomers = AppContext.getUserList().stream().map(User::toStringFormatted).collect(Collectors.toList());
    System.out.println(String.join("\n", allCustomers));
    InputUtil.pause();
    initialize();
  }
}