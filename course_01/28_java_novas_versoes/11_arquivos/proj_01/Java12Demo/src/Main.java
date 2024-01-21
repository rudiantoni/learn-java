import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.CompactNumberFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    // Exemplo de CompactNumberFormat
    System.out.println("========== Exemplo de CompactNumberFormat ==========");
    // Criar um CompactNumberFormat com o locale padrão
    NumberFormat compactNumberFormat = CompactNumberFormat.getCompactNumberInstance();
    // Formatar um número usando o formato compacto
    double number = 1500.5;
    String compactNumber = compactNumberFormat.format(number);
    System.out.println("Formato compacto: " + compactNumber);
    // Formatar um número usando o formato regular
    NumberFormat numberFormat = NumberFormat.getNumberInstance();
    String regularNumber = numberFormat.format(number);
    System.out.println("Formato regular: " + regularNumber);
    // Cria um CompactNumberFormat para um locale específico (US)
    NumberFormat compactNumberFormatUs = CompactNumberFormat
      .getCompactNumberInstance(Locale.US, CompactNumberFormat.Style.LONG);
    // Formata um número usando o formato compacto com o locale de US
    String compactNumberUs = compactNumberFormatUs.format(number);
    System.out.println("Formato compacto (US): " + compactNumberUs);

    // Exemplo de métodos da classe String
    System.out.println("\n========== Exemplo de métodos da classe String ==========");
    System.out.println("*** indent() ***");
    String originalString = "Hello\nWorld";
    // Adicionando 3 expaços para o início de cada linha
    String indentedString = originalString.indent(3);
    System.out.println("String original:\n" + originalString);
    System.out.println("String identada:\n" + indentedString);

    System.out.println("\n*** transform() ***");
    // Transformando cada String em um número (quantidade de caractered numa palavra)
    String transformedString = originalString.transform(s -> Integer.toString(s.length()));
    // Transformando cada caractere em maiúsculo
    String transformedString2 = originalString.transform(String::toUpperCase);
    System.out.println("String original: " + originalString);
    System.out.println("String transformada #1: " + transformedString);
    System.out.println("String transformada #2: " + transformedString2);

    // Exemplo do método Files.mismatch()
    System.out.println("\n========== Exemplo do método Files.mismatch() ==========");
    Path path1 = Paths.get("test_text.txt");
    Path path2 = Paths.get("other_test_text.txt");
    Path path3 = Paths.get("another_test_text.txt");

    try {
      long mismatchPosition = Files.mismatch(path1, path2);

      if (mismatchPosition == -1) {
        System.out.println("Os arquivos são identicos, sem incompatibilidade.");
      } else {
        System.out.println("Os arquivos se diferenciam na posição: " + mismatchPosition);
      }
    } catch (IOException e) {
      System.err.println("Erro na leitura dos arquivos: " + e.getMessage());
    }

    try {
      long mismatchPosition = Files.mismatch(path1, path3);

      if (mismatchPosition == -1) {
        System.out.println("Os arquivos são identicos, sem incompatibilidade.");
      } else {
        System.out.println("Os arquivos se diferenciam na posição: " + mismatchPosition);
      }
    } catch (IOException e) {
      System.err.println("Erro na leitura dos arquivos: " + e.getMessage());
    }

    // Exemplo do método Collector.teeing()
    System.out.println("\n========== Exemplo do método Collector.teeing() ==========");
    List<Integer> numbers = List.of(5, 3, 8, 1, 7, 2, 4, 6);

    Result result = numbers.stream()
      .collect(Collectors.teeing(
        Collectors.minBy(Integer::compareTo),
        Collectors.maxBy(Integer::compareTo),
        (min, max) -> new Result(min.orElse(null), max.orElse(null))
      ));

    System.out.println("Valor mínimo: " + result.getMin());
    System.out.println("Valor máximo: " + result.getMax());
  }

  static class Result {
    private final Integer min;
    private final Integer max;

    public Result(Integer min, Integer max) {
      this.min = min;
      this.max = max;
    }

    public Integer getMin() {
      return min;
    }

    public Integer getMax() {
      return max;
    }
  }


}