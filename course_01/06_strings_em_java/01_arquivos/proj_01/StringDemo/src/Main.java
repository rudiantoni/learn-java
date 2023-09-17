import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    System.out.println();
    System.out.println("===== Métodos de String =====");
    System.out.println();
    String s = " Hello ";
    System.out.println("s: " + s); //  Hello
    System.out.println("s.length(): " + s.length()); // 7
    System.out.println("s.contains(\"he\"): " + s.contains("he")); // false
    System.out.println("s.isEmpty(): " + s.isEmpty()); // false
    System.out.println("s.toUpperCase(): " + s.toUpperCase()); // HELLO
    System.out.println("s.toLowerCase(): " + s.toLowerCase()); // hello
    System.out.println("s.startsWith(\"H\"): " + s.startsWith("H")); // false
    System.out.println("s.endsWith(\" \"): " + s.endsWith(" ")); // true
    System.out.println("s.replace(\"ll\", \"LL\")): " + s.replace("ll", "LL")); // heLLo
    System.out.println("s.trim()" + s.trim()); // Hello
//    System.out.println("s.strip():" + s.strip()); // Apenas para JDK 11+
    System.out.println("s.substring(0, 3): " + s.substring(0, 3)); //  He
    System.out.println("Arrays.toString(s.getBytes()): " + Arrays.toString(s.getBytes())); // [32, 72, 101, 108, 108, 111, 32]
    System.out.println("Arrays.toString(s.toCharArray()): " + Arrays.toString(s.toCharArray())); // [ , H, e, l, l, o,  ]
    System.out.println("s.charAt(1): " + s.charAt(1)); // H
    System.out.println("Arrays.toString(s.split(\"e\")): " + Arrays.toString(s.split("e"))); // [ H, llo ]
    System.out.println("s: " + s); //  Hello
  }
}