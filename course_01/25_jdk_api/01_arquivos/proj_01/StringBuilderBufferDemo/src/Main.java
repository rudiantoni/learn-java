import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
  public static void main(String[] args) throws IOException {
    // Exemplo com String
    System.out.println("========== Exemplo com String ==========");
    long timeStart = System.currentTimeMillis();
    String result = readAllLinesFromFile();
    System.out.println(result);
    long delta1 = (System.currentTimeMillis() - timeStart);

    // Exemplo com String
    System.out.println("========== Exemplo com StringBuilder ==========");
    timeStart = System.currentTimeMillis();
    result = readAllLinesFromFileWithStringBuilder();
    System.out.println(result);
    long delta2 = (System.currentTimeMillis() - timeStart);
    System.out.println("Tempo da operação usando Spring:\t" + delta1);
    System.out.println("Tempo da operação usando StringBuilder:\t" + delta2);
  }
  private static String readAllLinesFromFile() throws IOException {
    String resultString = "";
    List<String> allines = Files.readAllLines(Paths.get("test_text.txt"));
    for (String line : allines) {
      // A abordagem abaixo nos levará ao caso de ter um monte de objetos String
      resultString += line;
      resultString += System.lineSeparator();
    }
    return resultString;
  }
  private static String readAllLinesFromFileWithStringBuilder() throws IOException {
    StringBuilder sb = new StringBuilder();
    List<String> allines = Files.readAllLines(Paths.get("test_text.txt"));
    for (String line : allines) {
      sb.append(line).append(System.lineSeparator());
    }
    return sb.toString();
  }

}