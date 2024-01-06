import config.AppContext;
import service.InitializingService;
import service.MainMenuService;

public class Main {
  public static void main(String[] args) {
    InitializingService initializingService = new InitializingService();
    MainMenuService mainMenuService = new MainMenuService();
    initializingService.initialize();

    AppContext.addUser("Rudi", "Antoni", "rudi@email.com", "123");
    AppContext.addUser("Guilherme", "Cardoso", "guilherme@email.com", "123");

    AppContext.addProduct(1, "Smartphone X", "Electronics", 2499.95);
    AppContext.addProduct(2, "Designer Handbag", "Fashion", 999.75);
    AppContext.addProduct(3, "Coffee Maker", "Kitchen Appliances", 399.95);
    AppContext.addProduct(4, "Running Shoes", "Sports & Fitness", 449.75);
    AppContext.addProduct(5,"Bluetooth Speaker", "Electronics", 199.95);
    AppContext.addProduct(6,"Digital Camera", "Electronics", 1499.95);
    AppContext.addProduct(7,"Leather Wallet", "Fashion", 245.75);
    AppContext.addProduct(8,"Gaming Laptop", "Electronics", 6499.95);
    AppContext.addProduct(9,"Cookware Set", "Kitchen & Dining", 749.75);
    AppContext.addProduct(10,"Mountain Bike", "Sports & Outdoors", 2999.95);

    mainMenuService.initialize();
  }



}