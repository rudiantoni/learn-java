public class NestExample {
  private int privateField;

  public class InnerClass1 {
    private void accessPrivateField() {
      // InnerClass1 pode acessar o privateField diretamente
      System.out.println(privateField);
    }
  }

  public class InnerClass2 {
    private void accessPrivateField() {
      // InnerClass2 pode acessar o privateField diretamente
      System.out.println(privateField);
    }
  }
}
