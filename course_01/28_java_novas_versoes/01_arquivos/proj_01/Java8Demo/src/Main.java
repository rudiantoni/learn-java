import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    // Exemplo de métodos default e static em interfaces
    System.out.println("========== Exemplo de métodos default e static em interfaces ==========");
    MyClass myObject = new MyClass();
    myObject.regularMethod(); // Output: Implementation of regularMethod in MyClass
    myObject.defaultMethod(); // Output: Default implementation of defaultMethod in MyInterface

    // Calling the static method using the interface name
    MyInterface.staticMethod(); // Output: Static method in MyInterface

    // Exemplo de interfaces funcionais
    System.out.println("\n========== Exemplo de interfaces funcionais ==========");
    MyInterface o = () -> System.out.println("Implementation of regularMethod");
    o.regularMethod(); // Output: Implementation of regularMethod

    List<String> myList = Arrays.asList("Java", "is", "fun");

    // Exemplo de expressões lambda
    System.out.println("\n========== Exemplo de expressões lambda ==========");

    // Before Java 8
    Collections.sort(myList, new Comparator<String>() {
      @Override
      public int compare(String s1, String s2) {
        return s1.compareTo(s2);
      }
    });

    // After Java 8 with Lambda expression
    Collections.sort(myList, (s1, s2) -> s1.compareTo(s2));


    // Exemplo de variável effectively final
    System.out.println("\n========== Exemplo de variável effectively final ==========");
    // Regular variable
    int regularVariable = 10;

    // Effectively final variable
    int effectivelyFinalVariable = 20;

    // Lambda expression using effectively final variable
    MyInterface myFunc = () -> {
      System.out.println("Regular Variable: " + regularVariable);
      System.out.println("Effectively Final Variable: " + effectivelyFinalVariable);
    };

    // Uncommenting the next line would result in a compilation error
//         regularVariable = 30;

    // Using the lambda expression
    myFunc.regularMethod();

    // Exemplo de referências de métodos
    System.out.println("\n========== Exemplo de referências de métodos ==========");
    // Reference to a static method
    Function<String, Integer> parseIntLambda = s -> Integer.parseInt(s);
    Function<String, Integer> parseIntReference = Integer::parseInt;

    // Reference to an Instance Method of a Particular Object
    List<String> words = Arrays.asList("apple", "banana", "orange");
    words.forEach(s -> System.out.println(s.toUpperCase()));
    // Method reference
    words.forEach(System.out::println);

    // Reference to an Instance Method of an Arbitrary Object of a Particular Type
    // Lambda expression
    Comparator<String> lengthComparatorLambda = (s1, s2) -> s1.length() - s2.length();
    // Method reference
    Comparator<String> lengthComparatorReference = Comparator.comparing(String::length);

    // Reference to a Constructor
    // Lambda expression
    Supplier<List<String>> listSupplierLambda = () -> new ArrayList<>();
    // Method reference
    Supplier<List<String>> listSupplierReference = ArrayList::new;


    Collections.sort(myList, String::compareTo);


    // Exemplo de Stream API
    System.out.println("\n========== Exemplo de Stream API ==========");

    // Before Java 8
    for (String s : myList) {
      System.out.println(s);
    }

    // After Java 8 with Stream and Method Reference
    myList.stream().forEach(System.out::println);
    // Create a stream from the list, filter words with length greater than 2, and convert to uppercase
    List<String> result = myList.stream()
      .filter(word -> word.length() > 2)
      .map(String::toUpperCase)
      .collect(Collectors.toList());

    // Print the result
    System.out.println("Transformed and filtered elements: " + result);

    // Count the number of elements with length greater than 2
    long count = myList.stream()
      .filter(word -> word.length() > 2)
      .count();

    // Print the count
    System.out.println("Number of elements with length greater than 2: " + count);


    // Exemplo de Optional
    System.out.println("\n========== Exemplo de Optional ==========");
    // Creating an Optional with a non-null value
    Optional<String> optionalValue = Optional.of("Hello, Java 8!");
    // Accessing the value if present
    if (optionalValue.isPresent()) {
      String value = optionalValue.get();
      System.out.println(value); // Output: Hello, Java 8!
    }
    // Using orElse to provide a default value if the Optional is empty
    String stringResult = optionalValue.orElse("Default Value");
    System.out.println(stringResult); // Output: Hello, Java 8!
    // Creating an Optional with a null value
    Optional<String> emptyOptional = Optional.ofNullable(null);
    // Using orElseGet to provide a supplier for the default value
    String defaultResult = emptyOptional.orElseGet(() -> "Default Value");
    System.out.println(defaultResult); // Output: Default Value
    // Using map to transform the value if present
    String uppercasedValue = optionalValue.map(String::toUpperCase).orElse("No Value");
    System.out.println(uppercasedValue); // Output: HELLO, JAVA 8!
    // Using ifPresent to perform an action if the value is present
    optionalValue.ifPresent(value -> System.out.println("Value is present: " + value));


    // Exemplo de nova API de data/hora
    System.out.println("\n========== Exemplo de nova API de data/hora ==========");
    // LocalDate represents a date (year, month, day)
    LocalDate date = LocalDate.now();
    System.out.println("Current Date: " + date);

    // LocalTime represents a time (hour, minute, second)
    LocalTime time = LocalTime.now();
    System.out.println("Current Time: " + time);

    // LocalDateTime represents both date and time
    LocalDateTime dateTime = LocalDateTime.now();
    System.out.println("Current Date and Time: " + dateTime);

    // ZonedDateTime represents a date and time with a time zone
    ZonedDateTime zonedDateTime = ZonedDateTime.now();
    System.out.println("Current Date and Time with Time Zone: " + zonedDateTime);

    // Specifying a different time zone
    ZonedDateTime newYorkTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
    System.out.println("Current Date and Time in New York: " + newYorkTime);

    // Instant represents a point in time
    Instant instant = Instant.now();
    System.out.println("Current Instant: " + instant);

    // Duration represents a time span between two Instants
    Instant start = Instant.now();
    // Simulate some time-consuming operation
    for (int i = 0; i < 1000000; i++) {
      // Do nothing
    }
    Instant end = Instant.now();
    Duration duration = Duration.between(start, end);
    System.out.println("Time taken: " + duration.toMillis() + " milliseconds");

    // Period represents a date-based amount of time
    LocalDate birthDate = LocalDate.of(1990, 1, 1);
    LocalDate currentDate = LocalDate.now();
    Period age = Period.between(birthDate, currentDate);
    System.out.println("Age: " + age.getYears() + " years, " + age.getMonths() + " months");
  }
}