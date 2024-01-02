public class Main {
  public static void main(String[] args) {

    GenericDemo03<Integer> integerBox = new GenericDemo03<Integer>();
    GenericDemo03<String> stringBox = new GenericDemo03<String>();

    integerBox.set(10);
    // Throws compilation error
    // java: incompatible types: java.lang.String cannot be converted to java.lang.Integer
//    integerBox.set("Hello world");

    stringBox.set("Hello world");
    // Throws compilation error
    // java: incompatible types: int cannot be converted to java.lang.String
//    stringBox.set(10);

    Integer integer = integerBox.get();
    String string = stringBox.get();

    System.out.printf("Integer value: %d\n\n", integer);
    System.out.printf("String value: %s\n", string);
  }

}

