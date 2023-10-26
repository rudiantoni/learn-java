import service.InitializingService;

import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    InitializingService.initializeOS();
    System.out.println("Hello world!");
    System.out.println("Hello world!");
    System.out.println("Hello world!");
    System.out.println("Hello world!");
    System.out.println("Hello world!");
    System.out.println("Hello world!");
    System.out.println("Hello world!");
    String os = System.getProperty("os.name");
    System.out.println(os);

    try {
      new ProcessBuilder("clear").inheritIO().start().waitFor();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      System.out.println("unable to clear console");
      throw new RuntimeException(e);
    } finally {
      System.out.println("Console cleared");
    }

  }
}