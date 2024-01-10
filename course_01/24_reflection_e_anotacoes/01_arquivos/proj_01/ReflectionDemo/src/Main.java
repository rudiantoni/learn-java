import java.lang.reflect.*;
import java.util.Arrays;
import java.util.Optional;

public class Main {
  public static void main(String[] args) {
    try {
      examples();
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("Erro: " + e);
    }
  }

  private static void examples() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
    // Exemplo de Class
    System.out.println("========== Exemplo de Class ==========");
    Class userClass = new User().getClass();
    System.out.println("userClass.getName(): " + userClass.getName());

    // Exemplo de Field
    System.out.println("\n========== Exemplo de Field ==========");
    System.out.println("*** Nomes ***");
    Field[] fields = userClass.getDeclaredFields();
    Arrays.stream(fields).forEach(it -> System.out.println(it.getName()));
    System.out.println("*** Tipos ***");
    Arrays.stream(fields).forEach(it -> System.out.println(it.getName() + " : " + it.getGenericType()));
    System.out.println("*** Possui modificador private? ***");
    Arrays.stream(fields).forEach(it -> System.out.println(it.getName() + " : " + Modifier.isPrivate(it.getModifiers())));

    // Exemplo de package
    System.out.println("\n========== Exemplo de package ==========");
    String packageName = Optional.ofNullable(userClass.getPackage())
      .map(Package::getName)
      .orElse("padrão");
    System.out.println("Nome do pacote: " + packageName);
    System.out.println("Nome da superclasse: " + userClass.getSuperclass());

    // Exemplo de interfaces
    System.out.println("\n========== Exemplo de interfaces ==========");
    Class[] interfaces = userClass.getInterfaces();
    userClass = Class.forName("User");
    Arrays.stream(interfaces).forEach(it -> System.out.println(it.getName()));

    // Exemplo de Constructors
    System.out.println("\n========== Exemplo de Constructors ==========");
    Constructor<User>[] constructors = userClass.getDeclaredConstructors();
    System.out.println("Quantidade de construtores: " + constructors.length);
    Arrays.stream(constructors).forEach(it -> System.out.println(it));

    // Exemplo de Constructors private
    System.out.println("\n========== Exemplo de Constructors private ==========");
    Constructor<User> privateConstructor = userClass.getDeclaredConstructor(String.class);
    System.out.println(privateConstructor);

    // Exemplo de Methods
    System.out.println("\n========== Exemplo de Methods ==========");
    Method[] methods = userClass.getDeclaredMethods();
    Arrays.stream(methods).forEach(it -> System.out.println(it.getName()));

    // Exemplo de getMethod()
    System.out.println("\n========== Exemplo de getMethod() ==========");
    Method method = userClass.getMethod("mergeTwoUserAccounts", User.class);
    System.out.println(method);

    // Exemplo de nova instância
    System.out.println("\n========== Exemplo de nova instância ==========");
    Constructor<User> defaultConstructor = userClass.getConstructor();
    User newInstance = defaultConstructor.newInstance();
    System.out.println(newInstance);
    privateConstructor.setAccessible(true);
    System.out.println(privateConstructor.newInstance("newdefault@email.com"));

    // Exemplo de inicialização de campos
    System.out.println("\n========== Exemplo de inicialização de campos ==========");
    Field firstNameField = userClass.getDeclaredField("firstName");
    firstNameField.setAccessible(true);
    firstNameField.set(newInstance, "Sergey");
    System.out.println(newInstance);

    // Exemplo de inicialização de campo estático
    System.out.println("\n========== Exemplo de inicialização de campo estático ==========");
    Field nextIdField = userClass.getDeclaredField("nextId");
    System.out.println(nextIdField);
    nextIdField.setAccessible(true);
    nextIdField.set(null, 20);
    System.out.println(newInstance);

    // Exemplo de ler valor de campo
    System.out.println("\n========== Exemplo de ler valor de campo ==========");
    System.out.println(firstNameField.get(newInstance));
    System.out.println(nextIdField.get(null));

    // Exemplo de invocar métodos
    System.out.println("\n========== Exemplo de invocar métodos ==========");
    Method privateMethod = userClass.getDeclaredMethod("doSomething", String.class);
    privateMethod.setAccessible(true);
    privateMethod.invoke(newInstance, "Test String");

    // Exemplo de invocar métodos estáticos
    System.out.println("\n========== Exemplo de invocar métodos estáticos ==========");
    Method privateStaticMethod = userClass.getDeclaredMethod("doSomethingStatic", String.class);
    privateStaticMethod.setAccessible(true);
    privateStaticMethod.invoke(null, "Test String Static");


  }

}