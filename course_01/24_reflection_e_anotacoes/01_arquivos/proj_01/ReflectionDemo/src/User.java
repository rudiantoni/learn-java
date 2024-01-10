import java.io.Serializable;

public class User implements Serializable, Cloneable {
  private static int nextId;
  private int id;
  static {
    System.out.println("Running static initializer: static{}");
    nextId = 1;
  }
  {
    System.out.println("Running object initializer: {}");
    id = nextId++;
  }
  private String firstName;
  private String lastName;
  private String email;

  public User() {
    System.out.println("Running constructor: public User()");
  }

  public User(String firstName, String lastName, String email) {
    System.out.println("Running constructor: public User(String firstName, String lastName, String email)");
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
  }

  private User(String email) {
    this.email = email;
  }
  public int getId() {
    System.out.println("Running method: public int getId()");
    return id;
  }
  public String getFirstName() {
    System.out.println("Running method: public String getFirstName()");
    return firstName;
  }
  public void setFirstName(String firstName) {
    System.out.println("Running method: public void setFirstName(String firstName)");
    this.firstName = firstName;
  }
  public String getLastName() {
    System.out.println("Running method: public String getLastName()");
    return lastName;
  }
  public void setLastName(String lastName) {
    System.out.println("Running method: public void setLastName(String lastName)");
    this.lastName = lastName;
  }
  public String getEmail() {
    System.out.println("Running method: public String getEmail()");
    return email;
  }
  public void setEmail(String email) {
    System.out.println("Running method: public void setEmail(String email)");
    this.email = email;
  }
  public void printFullNameToConsole() {
    System.out.println("Running method: public void printFullNameToConsole()");
    System.out.println(firstName + " " + lastName);
  }
  public double calculateTotalAmountSpentInOnlineStore() {
    System.out.println("Running method: public double calculateTotalAmountSpentInOnlineStore()");
    return 1125.65;
  }
  public void mergeTwoUserAccounts(User anotherUser) {
    // Mesclando histórico de pedidos e outros dados das duas contas
    System.out.println("Running method: public void mergeTwoUserAccounts(User anotherUser)");
  }
  private void doSomething(String text) {
    System.out.println("Running method: private void doSomething(String text)");
    System.out.println("text: " + text);
  }

  private static void doSomethingStatic(String text) {
    System.out.println("Running method: private static void doSomethingStatic(String text)");
    System.out.println("text: " + text);
  }

  @Override
  public String toString() {
    return "User{" +
      "id=" + id +
      ", nextId=" + nextId +
      ", firstName='" + firstName + '\'' +
      ", lastName='" + lastName + '\'' +
      ", email='" + email + '\'' +
      '}';
  }
}
