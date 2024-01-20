import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    // Exemplo de inferência de tipo de variável local
    System.out.println("========== Exemplo de inferência de tipo de variável local ==========");
    // Antes do Java 10
    List<String> names = new ArrayList<String>();
    // Com a inferência de tipo de variável local do Java 10
    var namesVar = new ArrayList<String>();
//		namesVar = new LinkedList<String>();
//		namesVar = new ArrayList<Integer>();
    namesVar = new ArrayList<String>();

    // Antes do Java 10
    List<String> names2 = Arrays.asList("Alice", "Bob", "Charlie");
    names.forEach((String name) -> System.out.println(name));

//		// No Java 10, você ainda precisa especificar o tipo para parâmetros de expressões lambda
		List<String> namesB = Arrays.asList("Alice", "Bob", "Charlie");
//		names.forEach((var name) -> System.out.println(name));
    namesB.forEach((name) -> System.out.println(name));
//		// Erro de compilação: 'var' is not allowed here

//		// Erro: Cannot infer type: 'var' on variable without initializer
//		var n;
//		// Erro: Cannot infer type: variable initializer is 'null
//		var emptyList = null;

//		var arr = { "One", "Two", "Three" }; // Erro: Array initializer is not allowed here

    // Exemplo do método orElseThrow() da classe Optional
    System.out.println("\n========== Exemplo do método orElseThrow() da classe Optional ==========");
    Optional<String> optionalValue = Optional.of("Hello, World!");
    // Se o valor estiver presente, imprima-o, caso contrário, lançe uma exceção
    String result = optionalValue.orElseThrow(() -> new IllegalStateException("Value is not present"));
    System.out.println(result);

    // Exemplo de APIs para coleções imutáveis
    System.out.println("\n========== Exemplo de APIs para coleções imutáveis ==========");
    List<String> originalList = Arrays.asList("apple", "banana", "orange");
    List<String> unmodifiableList = List.copyOf(originalList);

    Set<String> originalSet = new HashSet<>(Arrays.asList("apple", "banana", "orange"));
    Set<String> unmodifiableSet = Set.copyOf(originalSet);

    Map<String, Integer> originalMap = new HashMap<>();
    originalMap.put("apple", 1);
    originalMap.put("banana", 2);
    originalMap.put("orange", 3);

    Map<String, Integer> unmodifiableMap = Map.copyOf(originalMap);

    List<String> unmodifiableList2 = Stream.of("apple", "banana", "orange")
      .collect(Collectors.toUnmodifiableList());

    Set<String> unmodifiableSet2 = Stream.of("apple", "banana", "orange")
      .collect(Collectors.toUnmodifiableSet());

    Map<String, Integer> unmodifiableMap2 = Stream.of("apple", "banana", "orange")
      .collect(Collectors.toUnmodifiableMap(Function.identity(), String::length));

  }
  
}