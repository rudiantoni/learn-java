import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  public static void main(String[] args) {
    String gmailPattern = "[a-zA-Z-\\d]+@gmail\\.com";
    Pattern p = Pattern.compile(gmailPattern);
    String sampleText = "Algum texto aleatório que contém endereços gmail " +
      " como este aqui algum-email@gmail.com. E qualquer outro texto.";
    Matcher m = p.matcher(sampleText);
    m.find();
    String gmailAddress = m.group();
    System.out.println(gmailAddress);

    String sampleText2 = "Há três sentenças nesta string. Você têm certeza? Sim!";
    String[] sentences = sampleText2.split("[\\.!?]");
    System.out.println(Arrays.toString(sentences));
  }
}