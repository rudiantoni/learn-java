package service;

import config.AppConfig;
import enums.Command;
import pojo.User;
import util.ConsoleUtil;
import util.Consts;
import util.InputUtil;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class MainMenuService {
  public void initialize() {
    ConsoleUtil.clean();
    ConsoleUtil.printMainMenu();
    ConsoleUtil.printAllowedCommands(Arrays.asList(Command.EXIT.getName(), Command.GET_USERS.getName(), Command.GET_LOGGED.getName()));
    String input = InputUtil.waitForAllowedOption(
      "Digite uma opção válida: ",
      Arrays.asList("1", "2", "3", "4", "5", "6", Command.EXIT.getName(), Command.GET_USERS.getName(), Command.GET_LOGGED.getName())
    );

    if (Objects.equals(input, Command.EXIT.getName())) {
      System.out.println("Sair da aplicação");

      List<User> x = AppConfig.getUserList();
      boolean z = true;


    } else if (Objects.equals(input, Command.GET_LOGGED.getName())) {
      System.out.println(AppConfig.getLoggedUser());
      InputUtil.pause();
      initialize();

    } else if (Objects.equals(input, Command.GET_USERS.getName())) {
      System.out.println(AppConfig.getUserList());
      InputUtil.pause();
      initialize();

    } else if (Objects.equals(input, "1")) {
      registerUser();

    } else if (Objects.equals(input, "2")) {
      if (AppConfig.getLoggedUser() == null) {
        requestLogin();
      } else {
        requestLogout();
      }

    } else if (Objects.equals(input, "3")) {
      System.out.println("Não implementado");

    } else if (Objects.equals(input, "4")) {
      System.out.println("Não implementado");

    } else if (Objects.equals(input, "5")) {
      System.out.println("Não implementado");

    } else if (Objects.equals(input, "6")) {
      System.out.println("Não implementado");

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
    } else if (AppConfig.isEmailAlreadyInUse(email)) {
      System.out.println("E-mail inválido: este e-mail já está sendo usado.");
      InputUtil.pause();
      initialize();
      return;
    }
    String password = InputUtil.waitForAnyInput("Digite sua senha: ");
    User createdUser = AppConfig.addUser(firstName, lastName, email, password);
    if (AppConfig.getLoggedUser() != null) {
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
    System.out.printf("Até a próxima %s.\n", AppConfig.getLoggedUser().getFirstName());
    logout();
    InputUtil.pause();
    initialize();
  }

  private void logout() {
    AppConfig.setLoggedUser(null);
  }

  private void requestLogin() {
    ConsoleUtil.clean();
    ConsoleUtil.printHeader();
    System.out.printf("%s - Entrar\n", Consts.APP_NAME);
    ConsoleUtil.printDivider();
    String email = InputUtil.waitForAnyInput("Digite o seu email: ");
    String password = InputUtil.waitForAnyInput("Digite a sua senha: ");
    User user = AppConfig.findFirstByEmailAndPassword(email, password);
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
    AppConfig.setLoggedUser(user);
  }

}
