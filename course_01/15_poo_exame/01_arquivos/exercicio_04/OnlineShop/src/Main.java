import config.AppConfig;
import enums.Command;
import service.InitializingService;
import service.MainMenuService;
import util.ConsoleUtil;
import util.InputUtil;

public class Main {
  public static void main(String[] args) {
    InitializingService initializingService = new InitializingService();
    MainMenuService mainMenuService = new MainMenuService();
    initializingService.initialize();

    AppConfig.addUser("Rudi", "Antoni", "rudi@email.com", "123");
    AppConfig.addUser("Guilherme", "Cardoso", "guilherme@email.com", "123");

    mainMenuService.initialize();
  }



}