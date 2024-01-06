import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    String inputStr = "Login;Nome;Email\n" +
      "peterson;Chris Peterson;peterson@outlook.com\n" +
      "james;Derek James;james@gmail.com\n" +
      "jackson;Walter Jackson;jackson@gmail.com\n" +
      "gregory;Mike Gregory;gregory@yahoo.com";

    String converted1 = convert1(inputStr);
    String converted2 = convert2(inputStr);
    System.out.println("Primeira conversão:");
    System.out.println(converted1);
    System.out.println("Segunda conversão:");
    System.out.println(converted2);
  }

  public static String convert1(String input) {
    String[] lines = input.split("\n");
    String result = "";
    for (int i = 1; i < lines.length; i++) {
      String line = lines[i];
      String[] data = line.split(";");
      String login = data[0];
      String email = data[2];
      result += String.format("%s ==> %s", login, email);
      if (i < lines.length - 1) {
        result += "\n";
      }
    }
    return result;
  }

  public static String convert2(String input) {
    String[] lines = input.split("\n");
    String result = "";
    for (int i = 1; i < lines.length; i++) {
      String line = lines[i];
      String[] data = line.split(";");
      String name = data[1];
      String email = data[2];
      result += String.format("%s (email: %s)", name, email);
      if (i < lines.length - 1) {
        result += "\n";
      }
    }
    return result;
  }
}