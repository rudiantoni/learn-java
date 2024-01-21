import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Main {
  public static void main(String[] args) {
    // Exemplo de método Collection.toArray()
    System.out.println("\n========== Exemplo de método Collection.toArray() ==========");
    List<String> stringList = new ArrayList<>();
    stringList.add("Java");
    stringList.add("Python");
    stringList.add("C++");

    String[] stringArray = stringList.toArray(size -> new String[size]);
    stringArray = stringList.toArray(String[]::new);

    System.out.println(Arrays.toString(stringArray));

    // Exemplo de método Predicate.not()
    System.out.println("\n========== Exemplo de método Predicate.not() ==========");

    // Predicate original para verificar se um número é maior que 5
    Predicate<Integer> isGreaterThan5 = n -> n > 5;

    // Usando o método not para criar um novo Predicate que nega o Predicate original
    Predicate<Integer> isNotGreaterThan5 = Predicate.not(isGreaterThan5);

    // Testando os predicates
    System.out.println("isGreaterThan5: " + isGreaterThan5.test(8));       // true
    System.out.println("isNotGreaterThan5: " + isNotGreaterThan5.test(8)); // false


    // Exemplo do JEP 323: Local-variable syntax for lambda parameters
    System.out.println("\n========== Exemplo de JEP 323: Local-variable syntax for lambda parameters) ==========");
    // Antes do Java 11
    BiFunction<Integer, Integer, Integer> add = (Integer a, Integer b) -> a + b;
    // Desde o Java 11
    BiFunction<Integer, Integer, Integer> add2 = (var a, var b) -> a + b;
    // Recomendação :)
    BiFunction<Integer, Integer, Integer> add3 = (a, b) -> a + b;

    // Exemplo de JEP 181: Nest-based access control
    System.out.println("\n========== Exemplo de JEP 181: Nest-based access control ==========");
    // Usando reflection para obter os os hosts e members do nest
    getNestInformation(NestExample.class);
    getNestInformation(NestExample.InnerClass1.class);
    getNestInformation(NestExample.InnerClass2.class);
  }

  private static void getNestInformation(Class<?> clazz) {
    System.out.println("Class: " + clazz.getName());

    // Obtém o nest host
    Class<?> nestHost = clazz.getNestHost();
    System.out.println("Nest Host: " + (nestHost != null ? nestHost.getName() : "None"));

    // Obtém o nest member
    Class<?>[] nestMembers = clazz.getNestMembers();
    System.out.println("Nest Members: " + Arrays.toString(nestMembers));

    System.out.println();
  }
}