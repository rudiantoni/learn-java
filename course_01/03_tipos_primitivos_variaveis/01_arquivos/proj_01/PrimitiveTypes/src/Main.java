public class Main {
  public static void main(String[] args) {
    byte b = 1;
    short s;
    s = 2;
    int i = 3;
    long l = 4;

    char c = 'a';
    boolean bool = true;

    float f = 1.2F;
    long l2 = 2_000_000_000_000L;

    double d = 1.3;

    // Apenas para o Java >= 10
    // var v = 1;
    // v = true (erro)
    // v = 1.3 (erro)

    int i3 = s;
    char c2 = 100; // Receberá o caractere com a sequencia 100 conforme a tabela unicode
    System.out.println(c2);

    double d2 = i3;
    d2 = l;

    b = (byte) i3;

    byte b2 = 10;

//    byte b2 = 1000; (erro)

    byte b3 = (byte) 128;
    System.out.println(b3);

    long number = 499_999_999_000_000_001L;
    double converted = (double) number;
    System.out.println(number - (long) converted);

    Integer i4 = 1;
    int i5 = i4;
  }
}
