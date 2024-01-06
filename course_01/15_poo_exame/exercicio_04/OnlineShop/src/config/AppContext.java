package config;

import pojo.Product;
import pojo.User;

import java.util.ArrayList;
import java.util.Scanner;

public class AppContext {
  private AppContext() {
  }

  private static boolean cleanable = false;
  private static String osName = null;
  private static Scanner sc = null;
  private static User loggedUser = null;
  private static ArrayList<User> userList = new ArrayList<>();
  private static ArrayList<Product> productList = new ArrayList<>();

  public static boolean isCleanable() {
    return cleanable;
  }

  public static void setCleanable(boolean cleanable) {
    AppContext.cleanable = cleanable;
  }

  public static String getOsName() {
    return osName;
  }

  public static void setOsName(String osName) {
    AppContext.osName = osName;
  }

  public static boolean isWindows() {
    return osName.equals("windows");
  }

  public static boolean isLinux() {
    return osName.equals("linux");
  }

  public static Scanner getSc() {
    return sc;
  }

  public static void setSc(Scanner sc) {
    AppContext.sc = sc;
  }

  public static User getLoggedUser() {
    return loggedUser;
  }

  public static boolean hasLoggedUser() {
    return loggedUser != null;
  }

  public static void setLoggedUser(User loggedUser) {
    AppContext.loggedUser = loggedUser;
  }

  public static boolean isEmailAlreadyInUse(String email) {
    return userList.stream().anyMatch(it -> it.getEmail().equalsIgnoreCase(email));
  }

  public static ArrayList<User> getUserList() {
    return new ArrayList<>(userList);
  }

  public static User addUser(String firstName, String lastName, String email, String password) {
    User user = new User(firstName, lastName, email, password);
    AppContext.userList.add(user);
    return user;
  }

  public static User findFirstUserByEmailAndPassword(String email, String password) {
    User user = AppContext.userList.stream().filter(it ->
        it.getEmail().equalsIgnoreCase(email) && it.getPassword().equals(password))
      .findAny().orElse(null);
    return user;
  }

  public static ArrayList<Product> getProductList() {
    return new ArrayList<>(productList);
  }

  public static Product addProduct(int id, String productName, String categoryName, double price) {
    Product product = new Product(id, productName, categoryName, price);
    AppContext.productList.add(product);
    return product;
  }

  public static Product findProductById(int id) {
    Product product = AppContext.productList.stream().filter(it -> it.getId() == id)
      .findFirst().orElse(null);
    return product;
  }

}
