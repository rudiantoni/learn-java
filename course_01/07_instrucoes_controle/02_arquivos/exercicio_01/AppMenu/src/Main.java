import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Por favor, digite um desses valores:");
    System.out.println("i. login");
    System.out.println("ii. sign_up");
    System.out.println("iii. terminate_program");
    System.out.println("iv. main_menu");
    System.out.println("v. about_app");

    Scanner sc = new Scanner(System.in);
    String chosenOption = sc.next();
    sc.close();
    switch (chosenOption) {
      case "login":
        System.out.println("Por favor, digite seu nome de usuário.");
        break;
      case "sign_up":
        System.out.println("Bem-vindo!");
        break;
      case "terminate_program":
        System.out.println("Obrigado, até mais!");
        break;
      case "main_menu":
        System.out.println("Menu principal");
        break;
      case "about_app":
        System.out.println("Esta aplicação foi criada com o apoio de \u00AEIT-Bulls.com");
        break;
      default:
        System.out.println("Por favor, digite um desses valores: login, sign_up, terminate_program, main_menu, about_app");
    }
  }
}