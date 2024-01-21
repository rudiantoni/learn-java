import java.io.IOException;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;

public class Main {
  public static void main(String[] args) throws IOException, InterruptedException {
    // Exemplo do cliente HTTP
    System.out.println("========== Exemplo do cliente HTTP ==========");

    HttpClient httpClient = HttpClient.newHttpClient();

    System.out.println("*** Enviando um GET síncrono: ***");
    HttpRequest request = HttpRequest.newBuilder()
      .uri(URI.create("https://google.com"))
      .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

    System.out.println("Código de resposta: " + response.statusCode());
    System.out.println("Corpo da resposta: " + response.body());

    System.out.println("\n*** Enviando um GET assíncrono: ***");
    CompletableFuture<HttpResponse<String>> future = httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString());

    future.thenAccept(response2 -> {
      System.out.println("Código de resposta: " + response2.statusCode());
      System.out.println("Corpo da resposta: " + response2.body());
    });

    future.join(); // Wait for the request to complete

    System.out.println("\n*** Personalizando requisição ***");
    HttpRequest requestCustomized = HttpRequest.newBuilder()
      .uri(URI.create("https://example.com"))
      .header("User-Agent", "Java 11 HttpClient")
      .timeout(Duration.ofSeconds(10))
      .build();


    System.out.println("\n*** Usando gerenciador de cookie ***");
    CookieManager cookieManager = new CookieManager(null, CookiePolicy.ACCEPT_ALL);
    HttpClient httpClient2 = HttpClient.newBuilder()
      .cookieHandler(cookieManager)
      .build();

    HttpRequest request2 = HttpRequest.newBuilder()
      .uri(URI.create("https://www.google.com"))
      .build();
    HttpResponse<String> response3 = httpClient2.send(request2, HttpResponse.BodyHandlers.ofString());
    // Print the cookies received
    cookieManager.getCookieStore().getCookies().forEach(cookie -> {
      System.out.println("Cookie recebido: " + cookie);
    });


    System.out.println("\n*** Configurando redirecionamentos ***");
    HttpClient httpClient3 = HttpClient.newBuilder()
      .followRedirects(HttpClient.Redirect.ALWAYS)
      .build();
    HttpResponse<String> response4 = httpClient3.send(request, HttpResponse.BodyHandlers.ofString());

    System.out.println("Código de resposta: " + response4.statusCode());
    System.out.println("Corpo da resposta: " + response4.body());

    // Exemplo dos novos métodos de String
    System.out.println("\n========== Exemplo dos novos métodos de String ==========");
    System.out.println("*** repeat() ***");
    String repeated = "Java ".repeat(3);
    System.out.println(repeated); // Resultado: Java Java Java

    System.out.println("\n*** isBlank() ***");
    String emptyString = "";
    String whitespaceString = "   ";
    String nonEmptyString = "Java";

    System.out.println(emptyString.isBlank()); // Resultado: true
    System.out.println(whitespaceString.isBlank()); // Resultado: true
    System.out.println(nonEmptyString.isBlank()); // Resultado: false
    System.out.println(whitespaceString.isEmpty()); // Resultado: false

    System.out.println("\n*** strip(), stripLeading() e stripTrailing() ***");
    String stringWithSpaces = "   Java 11   ";
    String strippedString = stringWithSpaces.strip();
    System.out.println(strippedString); // Resultado: Java 11
    String stringWithNonBreakingSpace = "\u2000 abc \u2000";
    String strippedString2 = stringWithNonBreakingSpace.strip();
    String trimmedString = stringWithNonBreakingSpace.trim();

    System.out.println("String original: '" + stringWithNonBreakingSpace + "'");
    System.out.println("String com strip: '" + strippedString2 + "'");
    System.out.println("String com trim: '" + trimmedString + "'");

    System.out.println("\n***lines()***");
    String multilineString = "Java\n11\nis\nawesome";
    multilineString.lines().forEach(System.out::println);

    // Exemplo dos novos métodos de Files
    System.out.println("\n========== Exemplo dos novos métodos de Files ==========");
    Path filePath = Path.of("test_text.txt");
    try {
      String content = Files.readString(filePath);
      System.out.println("Conteúdo do arquivo:\n" + content);
    } catch (IOException e) {
      e.printStackTrace();
    }

    Files.writeString(Paths.get("Java_11_test.txt"), "Java 11 - Demo Lesson",
      StandardOpenOption.CREATE, StandardOpenOption.DSYNC, StandardOpenOption.APPEND);
  }
}