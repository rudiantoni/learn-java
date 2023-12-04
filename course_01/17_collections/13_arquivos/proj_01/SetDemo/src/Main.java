import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    Set<Integer> set = new HashSet<>();
    System.out.println("===== Set sem elementos repetidos =====");
    System.out.println("Adicionar 1: " +set.add(1));
    System.out.println("Adicionar 1: " +set.add(1));
    System.out.println("Adicionar 2: " +set.add(2));
    System.out.println("Adicionar 3: " +set.add(3));
    System.out.println(set);

    System.out.println();
    System.out.println("===== Objetos SEM hashCode e equalsTo sobrescritos sendo adicionados no Set ===");
    Set<User> users = new HashSet<>();
    User user1 = new DefaultUser(1, "John", "Smith", "password", "john@email.com");
    User user2 = new DefaultUser(1, "John", "Smith", "password", "john@email.com");
    users.add(user1);
    users.add(user2);
    for (User user: users) {
      System.out.println(user);
    }

    System.out.println();
    System.out.println("===== Objetos COM hashCode e equalsTo sobrescritos sendo adicionados no Set ===");
    User userHash1 = new UserForHashTables(2, "John", "Smith", "password", "john@email.com");
    User userHash2 = new UserForHashTables(2, "John", "Smith", "password", "john@email.com");
    users.add(userHash1);
    users.add(userHash2);
    for (User user: users) {
      System.out.println(user);
    }

  }
}