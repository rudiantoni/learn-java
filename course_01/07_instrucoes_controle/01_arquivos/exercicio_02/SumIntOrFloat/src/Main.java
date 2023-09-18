public class Main {
  public static void main(String[] args) {
    if (args.length == 2) {
      String arg1 = args[0];
      String arg2 = args[1];
      Float numF1 = Float.parseFloat(arg1);
      Float numF2 = Float.parseFloat(arg2);
      if (numF1 - numF1.intValue() > 0 || numF2 - numF2.intValue() > 0) {
        Float res = numF1 + numF2;
        System.out.println("float: " + res);
      } else {
        Integer res = numF1.intValue() + numF2.intValue();
        System.out.println("integer: " + res);
      }
    } else {
      System.out.println("Quantidade de argumentos inválida. São necessários 2 argumentos numéricos.");
    }
  }
}