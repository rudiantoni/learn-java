public class Main {
  public static void main(String[] args) {
    // ========== Operadores aritméticos ==========
    // *** Operadores aritméticos unários ***
    // +
    // -
    // ++
    // --
    System.out.println("========== Operadores aritméticos unários ==========");
    int i = +10;
    int i2 = -10;
    int i3 = ++i;
    int i4 = i++;
    int i5 = --i;
    int i6 = i--;
    System.out.println("i = " + i); // 10
    System.out.println("i2 = " + i2); // -10
    System.out.println("i3 = " + i3); // 11
    System.out.println("i4 = " + i4); // 11
    System.out.println("i5 = " + i5); // 11
    System.out.println("i6 = " + i6); // 11

    // *** Operadores aritméticos binários ***
    // +
    // -
    // /
    // *
    // %
    System.out.println("========== Operadores aritméticos binários ==========");
    int i7 = 10 + 1;
    int i8 = i7 - 1;
    int i9 = i8 / 2;
    int i10 = i9 % 2;
    int i11 = 5 % 10;
    int i12 = i10 * 3;
    System.out.println("i7 = " + i7); // 11
    System.out.println("i8 = " + i8); // 10
    System.out.println("i9 = " + i9); // 5
    System.out.println("i10 = " + i10); // 1
    System.out.println("i11 = " + i11); // 5
    System.out.println("i12 = " + i12); // 3

    // ========== Operadores de atribuição ==========
    // =
    // +=
    // -=
    // /=
    // %=
    System.out.println();
    System.out.println("========== Operadores de atribuição ==========");
    int i13 = 10;
    i13 += 2;
    System.out.println("i13 = " + i13); // 12

    // ========== Operadores relacionais ==========
    // ==
    // !=
    // >
    // <
    // >=
    // <=
    System.out.println();
    System.out.println("========== Operadores relacionais ==========");
    int i14 = 10;
    int i15 = 20;
    System.out.println(i14 == i15); // false
    System.out.println(i14 != i15); // true
    System.out.println(i14 > i15); // false
    System.out.println(i14 < i15); // true
    System.out.println(i14 >= i15); // false
    System.out.println(i14 <= i15); // true

    // ========== Operadores lógicos ==========
    // &
    // &&
    // |
    // ||
    // !
    // ^
    System.out.println();
    System.out.println("========== Operadores lógicos ==========");
//    System.out.println(false & (5 / 0 == 0)); // Lança ArithmeticException / by zero
    System.out.println(false && (5 / 0 == 0)); // false
//    System.out.println(true | (5 / 0 == 0)); // Lança ArithmeticException / by zero
    System.out.println(true || (5 / 0 == 0)); // true
    // Com & e &&: o resultado é true se todos os valores forem true
    // Com | e ||: o resultado é true se qualquer valor for true
    // No &&, assim que a condição retornar false, o restante não é avaliado.
    // No ||, assim que a condição retornar true, o restante não é avaliado.
    // No &, toda a expressão é executada, mesmo que algum resutado seja false.
    // No |, toda a expressão é executada, mesmo que algum resutado seja true.
    // A diferença em expressões lógicas entre &/| e &&/|| é que:
    //   - o & e | avalia todos os valores,
    //   - o && e || avalia os expressões em curto-circuito, ou seja, assim que a condição dos próximos operandos não
    //      alterar mais o resultado, o resultado da expressão será retornado sem avaliá-los.
    System.out.println("!true = " + !true); // false
    System.out.println(true ^ true); // false
    System.out.println(true ^ false); // true
    System.out.println(false ^ true); // true

    // ========== Operadores bit-a-bit ==========
    // &
    // |
    // ^
    // ~
    // >>
    // >>>
    // <<
    System.out.println();
    System.out.println("========== Operadores bit-a-bit ==========");
    /* Binários para decimais
    0 0 0 = 0                     1 0 0 = 4
    0 0 1 = 1                     1 0 1 = 5
    0 1 0 = 2                     1 1 0 = 6
    0 1 1 = 3                     1 1 1 = 7 */

    /* Operador &                 Operador |
    0 & 0 = 0                     0 | 0 = 0
    0 & 1 = 0                     0 | 1 = 1
    1 & 0 = 0                     1 | 0 = 1
    1 & 1 = 1                     1 | 1 = 1 */
    System.out.println("4 & 5 = " + (4 & 5)); // 4
    /*          1 0 0  (4)
     *          & & &
     *          1 0 1  (5)
     *         -------
     *          1 0 0  (4)
     */

    System.out.println("4 | 5 = " + (4 | 5)); // 5
    /*          1 0 0  (4)
     *          | | |
     *          1 0 1  (5)
     *         -------
     *          1 0 1  (5)
     */

    System.out.println("4 ^ 5 = " + (4 ^ 5)); // 1
    /*          1 0 0  (4)
     *          ^ ^ ^
     *          1 0 1  (5)
     *         -------
     *          0 0 1  (1)
     */

    System.out.println("~1 = " + ~1); // -2
    System.out.println(Integer.toBinaryString(1)); // 1
    System.out.println(Integer.toBinaryString(-2)); // 11111111111111111111111111111110
    System.out.println((byte) 0b11111110); // -2
    System.out.println((byte) 0b10000000); // -128 = - (2 ^ 7)
    System.out.println((byte) 0b11000000); // -64 = - (2 ^ 7) + (2 ^ 6)

    System.out.println("5 = " + 0b101);
    System.out.println("5 >> 1 = " + (0b101 >> 1));
    System.out.println("5 in binary format = " + Integer.toBinaryString(5));
    System.out.println("2 in binary format = " + Integer.toBinaryString(2));

    System.out.println("5 = " + 0b101); // 000000101
    System.out.println("5 >>> 1 = " + (0b101 >>> 1)); // 000000010

    int negativeValueByte = 0b11111111111111111111111110000000;
    System.out.println("-128 = " + negativeValueByte);                 // 11111111111111111111111110000000
    System.out.println("-128 >>> 1 = " + (negativeValueByte >>> 1));   // 01111111111111111111111111000000
    System.out.println("-128 >> 1 = " + (negativeValueByte >> 1));     // 11111111111111111111111111000000

    System.out.println("5 = " + 0b101); // 5 = 101
    System.out.println("5 = " + Integer.toBinaryString(0b101) + " (bin)"); // 101
    System.out.println("5 << 1 = " + (0b101 << 1)); // 10 = 1010
    System.out.println("5 << 1 = " + Integer.toBinaryString(0b101 << 1) + " (bin)"); // 1010
    System.out.println("5 in binary format = " + Integer.toBinaryString(5));
    System.out.println("10 in binary format = " + Integer.toBinaryString(10));

//    System.out.println("10 * 2 = 10 << 1 = " + (10 << 1)); // x << y = x * (2 ^ y)
//    System.out.println("10 / 2 = 10 >> 1 = " + (10 >> 1)); // x >> y = x / (2 ^ y)
    System.out.println("10 = " + Integer.toBinaryString(10)); // 1010
    System.out.println("10 << 1 = " + Integer.toBinaryString(0b10100)); // 10100
    System.out.println("10 << 1 = " + Integer.toBinaryString(10 << 1)); // 10100
    System.out.println("10 << 1 = " + (10 << 1)); // 20

    System.out.println("10 >> 1 = " + Integer.toBinaryString(0b0101)); // 0101 = 101
    System.out.println("10 >> 1 = " + Integer.toBinaryString(10 >> 1)); // 0101 = 101
    System.out.println("10 >> 1 = " + (10 >> 1)); // 5

    // ========== Operador ternário ==========
    // (condição) ? (expressão verdadeira) : (expressão falsa)
    System.out.println();
    System.out.println("========== Operador ternário ==========");
    System.out.println(2 > 1 ? "2 é maior que 1" : "2 não é maior que 1");
    System.out.println(2 < 1 ? "2 é menor que 1" : "2 não é menor que 1");

    // ========== Precedência de operadores ==========
    // ()
    // []
    // .
    // ++
    // --
    System.out.println();
    System.out.println("========== Precedência de operadores ==========");

  }
}