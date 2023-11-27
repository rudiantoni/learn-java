import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Main {
  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();
    map.put(2, "two");
    map.put(1, "one");
    map.put(3, "three");
    map.put(4, null);

    System.out.println("===== Operações com Maps =====");
    System.out.println("Retornar elemento do Map - get(1): " + map.get(1));

    System.out.println("\n*** Realizando iterações ***");
    System.out.println("Iterando nas chaves do Map");
    for (Integer key: map.keySet()) {
      System.out.println("Chave: " + key);
    }

    // entradas = par chave-valor
    System.out.println("Iterando nas entradas do Map");
    for (Map.Entry<Integer, String> entry: map.entrySet()) {
      System.out.printf("Entrada: %s Chave: %s Valor: %s\n", entry, entry.getKey(), entry.getValue());
    }

    System.out.println("\n*** getOrDefault() ***");
    // Só retorna o padrão se a chave não existir
    System.out.println("getOrDefault() com a chave 4: " + map.getOrDefault(4, "four"));
    System.out.println("getOrDefault() com a chave 5: " + map.getOrDefault(5, "five"));
    // Nesse caso o null deve ser verificado externamente (com Optional ou Objects)

    System.out.println("\n*** pufIfAbsent() ***");
    map.putIfAbsent(3, "three-changed");
    System.out.println("Depois de pufIfAbsent() ser chamado na chave 3 com o valor \"three-changed\": " +map.get(3));
    map.putIfAbsent(4, "four");
    System.out.println("Depois de pufIfAbsent() ser chamado na chave 4 com o valor \"four\": " +map.get(4));
    map.putIfAbsent(5, "five");
    System.out.println("Depois de pufIfAbsent() ser chamado na chave 5 com o valor \"five\": " +map.get(5));

    System.out.println("\n===== Hash tables =====");
    System.out.println("*** Utilizando objeto sem hash/equals como chave ***");
    Map<User, Product> userProductMap = new HashMap<>();
    User user = new User(1, "John", "Smith", "pass", "john.smith@email.com");
    Product product = new Product(1, "Shoes", "Clothing", 259.99);
    userProductMap.put(user, product);

    User userCopy = new User(1, "John", "Smith", "pass", "john.smith@email.com");

    System.out.println("Obter produto por usuário do map: " + userProductMap.get(user));
    System.out.println("Obter produto por usuário (cópia) do map: " + userProductMap.get(userCopy));

    System.out.println("user hashCode(): " + user.hashCode());
    System.out.println("userCopy hashCode(): " + userCopy.hashCode());

    System.out.println("\n*** Utilizando objeto com hash/equals como chave ***");
    User hashUser = new UserForHashTables(1, "Alice", "Cunning", "pass2", "alice.cunning@email.com");
    Product product2 = new Product(2, "T Shirt", "Clothing", 39.45);
    userProductMap.put(hashUser, product2);

    User hashUserCopy = new UserForHashTables(1, "Alice", "Cunning", "pass2", "alice.cunning@email.com");

    System.out.println("Obter produto por usuário COM HASH do map: " + userProductMap.get(hashUser));
    System.out.println("Obter produto por usuário (cópia) COM HASH do map: " + userProductMap.get(hashUserCopy));

    System.out.println("hashUser hashCode(): " + hashUser.hashCode());
    System.out.println("hashUserCopy hashCode(): " + hashUserCopy.hashCode());

    System.out.println();
    hashUserCopy.setEmail("john.smith@email.com");
    System.out.println("Obter produto por usuário (cópia) COM HASH, mas com email alterado do map: " + userProductMap.get(hashUserCopy));
    System.out.println("hashUser hashCode(): " + hashUser.hashCode());
    System.out.println("hashUserCopy hashCode(): " + hashUserCopy.hashCode());
    System.out.println();
    System.out.println("POR ISSO É RECOMENDADO SEMPRE UTILIZAR OBJETOS IMUTÁVEIS COMO CHAVES DE MAPAS");
    System.out.println("COMO STRINGS E INTEGERS");
  }
}