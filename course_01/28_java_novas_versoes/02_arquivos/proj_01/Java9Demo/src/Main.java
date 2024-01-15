import javax.swing.*;
import java.awt.*;
import java.awt.image.MultiResolutionImage;
import java.io.File;
import java.lang.StackWalker.StackFrame;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {

    // Exemplo de métodos factory de Collection List.of(...), Set.of(...), Map.of(...)
    System.out.println("========== Exemplo de métodos factory de Collection List.of(...), Set.of(...), Map.of(...) ==========");
    List<String> fruits = List.of("Apple", "Banana", "Orange");
    System.out.println(fruits);

    Set<Integer> numbers = Set.of(1, 2, 3, 4, 5);
    System.out.println(numbers);

    Map<String, Integer> ageMap = Map.of("Alice", 25, "Bob", 30, "Charlie", 22);
    System.out.println(ageMap);

    // Exemplo de melhorias na StreamAPI takeWhile, dropWhile, ofNullable, iterar com condição
    System.out.println("\n========== Exemplo de melhorias na StreamAPI takeWhile, dropWhile, ofNullable, iterar com condição ==========");
    List<Integer> result = Stream.of(1, 2, 3, 4, 5, 6).takeWhile(n -> n < 4).collect(Collectors.toList());
    System.out.println(result);  // Output: [1, 2, 3]

    result = Stream.of(1, 2, 3, 4, 5, 6).dropWhile(n -> n < 4).collect(Collectors.toList());
    System.out.println(result);  // Output: [4, 5, 6]

    Integer value = 42;
    Stream<Integer> stream = Stream.ofNullable(value);
    stream.forEach(System.out::println);  // Output: 42

    Optional<Integer> optionalValue = Optional.ofNullable(null);

    result = optionalValue
      .stream()
      .flatMap(Stream::ofNullable)
      .collect(Collectors.toList());
    System.out.println(result);

    Stream.iterate(1, n -> n < 10, n -> n * 2)
      .forEach(System.out::println);

    // Exemplo de MultiResolutionImage API
    System.out.println("\n========== Exemplo de MultiResolutionImage API ==========");
    // Assume you have a MultiResolutionImage for your app logo
    MultiResolutionImage logo = getLogo();

    // Get the best logo version for a specific screen size
    double screenWidth = 800.0;
    double screenHeight = 600.0;
    Image bestLogoVersion = logo.getResolutionVariant(screenWidth, screenHeight);
    System.out.println("Best Logo Version - " + bestLogoVersion);

    JFrame frame = new JFrame("Logo Viewer");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // Create a JLabel to display the selected image
    JLabel imageLabel = new JLabel(new ImageIcon(bestLogoVersion));

    // Add the label to the frame
    frame.getContentPane().add(imageLabel);

    // Pack and display the frame
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    // Get a list of all logo versions
    List<Image> allLogoVersions = logo.getResolutionVariants();
    System.out.println("All Logo Versions amount: " + allLogoVersions.size());

    // Exemplo de StackWalker API
    System.out.println("\n========== Exemplo de StackWalker API ==========");

    // Create a StackWalker for the current thread
    StackWalker stackWalker = StackWalker.getInstance();

    // Walk the stack frames and print information
    List<String> frameInfoList = stackWalker.walk(frames -> {
      List<String> frameInfo = frames.map(StackFrame::toString)
        .collect(Collectors.toList());

      System.out.println("Stack Frames:");
      frameInfo.forEach(System.out::println);
      return frameInfo;
    });

    System.out.println("\n*** this.getClass().getPackageName() ***");
    System.out.println(Main.class.getPackageName());
  }

  private static MultiResolutionImage getLogo() {
    // Load resolution variants of the logo using Toolkit
    Image logo1x = Toolkit.getDefaultToolkit().getImage("resources" + File.separator + "java9" + File.separator + "logo.png");
    Image logo2x = Toolkit.getDefaultToolkit().getImage("resources" + File.separator + "java9" + File.separator + "logo_2x.png");
    Image logo3x = Toolkit.getDefaultToolkit().getImage("resources" + File.separator + "java9" + File.separator + "logo_3x.png");

    // Create a list of resolution variants
    List<Image> resolutionVariants = new ArrayList<>();
    resolutionVariants.add(logo1x);
    resolutionVariants.add(logo2x);
    resolutionVariants.add(logo3x);

    // Return a MultiResolutionImage instance
    return new SimpleMultiResolutionImage(resolutionVariants);
  }

}