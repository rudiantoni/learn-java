import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    System.out.println("===== Exception Checked =====");
    runExceptionCheckedExample();

    System.out.println("===== Exception Unchecked =====");
    //runExceptionUncheckedExample();

    System.out.println("===== Exception handling exceptions =====");
    runExceptionHandlingExample();

    System.out.println("===== Catch block multiplo e catch inalcançável =====");
//    runMultiCatchExample();

    System.out.println("===== Try-catch-finally e throws =====");
    runTryCatchFinallyExample();
  }

  private static void runExceptionCheckedExample() {
    // The compiler knows that this exception can happen, so it must be handled
    //Files.readAllLines(Paths.get("caminho para um arquivo que não existe.txt")); // throws a java.io.IOException if there's no file
  }
  private static void runExceptionUncheckedExample() {
    User user = null;
    double orderPrice = 199.99;
    chargeUser(user, orderPrice); // throws a NullPointerException inside the method
  }
  private static void chargeUser(User user, double orderPrice) {
    user.setAmountOfMoney(user.getAmountOfMoney() - orderPrice);
  }
  private static void runExceptionHandlingExample() {
    try {
      Files.readAllLines(Paths.get("caminho para um arquivo que não existe.txt")); // throws a java.io.IOException if there's no file
    } catch (IOException e) {
      System.out.println("*** Estanos no block catch ***");
      System.out.println("*** Podemos logar os erros: ***" + Arrays.toString(e.getStackTrace()));
      e.getCause(); // Get the original exception
      e.getMessage(); // Get message that is associated with this exception
      e.printStackTrace();
    }
  }
  private static void runMultiCatchExample() {
    System.out.println("*** Multiple catch block with generic handling ***");
    try {
      Files.readAllLines(Paths.get("caminho para um arquivo que não existe.txt")); // throws a java.io.IOException if there's no file
      Connection conn = DriverManager.getConnection(""); // throws java.sql.SQLException if connection has any error
    } catch (IOException | SQLException e) {
      e.printStackTrace();
    }

    System.out.println("*** Multiple catch block with specific handling ***");
    try {
      Files.readAllLines(Paths.get("caminho para um arquivo que não existe.txt")); // throws a java.io.IOException if there's no file
      Connection conn = DriverManager.getConnection(""); // throws java.sql.SQLException if connection has any error
    } catch (IOException e) {
      System.out.println("Notificar o usuário que o arquivo não existe e solicite um novo arquivo.");
    } catch (SQLException e) {
      System.out.println("Notificar o usuário que há um erro no banco de dados.");
    }

    System.out.println("*** Multiple catch block with unreachable catch block ***");
    // More specifics exceptions should be catched first, in the following code, the correct version is
    // first: catch FileNotFoundException, then catch IOException
    try {
      Files.readAllLines(Paths.get("caminho para um arquivo que não existe.txt")); // throws a java.io.IOException if there's no file
      FileReader fr = new FileReader("fileName.txt");
    } catch (IOException e) {
      System.out.println("Notificar o usuário que o arquivo não existe e solicite um novo arquivo.");
    }
    //catch (FileNotFoundException e) { // throws a Unreachable catch block compilation error: java: exception java.io.FileNotFoundException has already been caught
    //System.out.println("Erro arquivo não localizado.");
    //}
  }

  private static void runTryCatchFinallyExample() {
    try {
      Files.readAllLines(Paths.get("caminho para um arquivo que não existe.txt")); // throws a java.io.IOException if there's no file
    } catch (IOException e) {
      System.out.println("*** Estanos no block catch ***");
      System.out.println("*** Podemos logar os erros: ***" + Arrays.toString(e.getStackTrace()));
      e.getCause(); // Get the original exception
      e.getMessage(); // Get message that is associated with this exception
      e.printStackTrace();
    } finally {
//      System.exit(0); // Exits the application, preventing to run next instructions in this block
//      throw new RuntimeException(); // Throw a new Exception, preventing to run next instructions in this block
      System.out.println("Bloco finally será executado com ou sem uma exception.");
    }
  }

}