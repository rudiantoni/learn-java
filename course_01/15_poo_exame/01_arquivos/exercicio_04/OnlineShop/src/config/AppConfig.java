package config;

import pojo.User;

import java.util.ArrayList;
import java.util.Scanner;

public class AppConfig {
  private AppConfig() {
  }

  private static boolean cleanable = false;
  private static String osName = null;
  private static Scanner sc = null;
  private static User loggedUser = null;
  private static ArrayList<User> userList = new ArrayList<>();

  public static boolean isCleanable() {
    return cleanable;
  }
  public static void setCleanable(boolean cleanable) {
    AppConfig.cleanable = cleanable;
  }

  public static String getOsName() {
    return osName;
  }
  public static void setOsName(String osName) {
    AppConfig.osName = osName;
  }
  public static boolean isWindows() {
    return osName.equals("windows");
  }
  public static boolean isLinux() {
    return osName.equals("linux");
  }

  public static Scanner getSc() {return sc;}
  public static void setSc(Scanner sc) {AppConfig.sc = sc;}

  public static User getLoggedUser() {
    return loggedUser;
  }
  public static void setLoggedUser(User loggedUser) {
    AppConfig.loggedUser = loggedUser;
  }

  public static boolean isEmailAlreadyInUse(String email) {
    return userList.stream().anyMatch(it -> it.getEmail().equalsIgnoreCase(email));
  }

  public static ArrayList<User> getUserList() {
    return new ArrayList<>(userList);
  }

  public static void setUserList(ArrayList<User> userList) {
    AppConfig.userList = userList;
  }

  public static User addUser(String firstName, String lastName, String email, String password) {
    User user = new User(firstName, lastName, email, password);
    AppConfig.userList.add(user);
    return user;
  }

  public static User findFirstByEmailAndPassword(String email, String password) {
    User user = AppConfig.userList.stream().filter(it ->
      it.getEmail().equalsIgnoreCase(email) && it.getPassword().equals(password))
      .findAny().orElse(null);
    return user;
  }
}
