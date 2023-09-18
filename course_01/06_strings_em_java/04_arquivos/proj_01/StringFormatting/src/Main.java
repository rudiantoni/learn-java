import java.util.Formatter;

public class Main {
  public static void main(String[] args) {
    System.out.println();
    System.out.println("===== Formatação de strings =====");
    System.out.println();

    String greetingsTemplate = "Olá caro %s! %s.";
    String firstName = "Andrii";
    String morning = "Bom dia";
    String afternoon = "Boa tarde";
    String formattedStringMorning = String.format(greetingsTemplate, firstName, morning);
    String formattedStringAfternoon = String.format(greetingsTemplate, firstName, afternoon);
    System.out.println(formattedStringMorning);
    System.out.println(formattedStringAfternoon);

    System.out.printf("Você tem %d computadores disponíveis na loja.\n", 10);
    System.out.println("===== Modificadores =====");
    System.out.println();
    System.out.println("*** Modificador de espaço em branco ( ) ***");
    Formatter formatter;
    formatter = new Formatter();
    formatter.format("%d", -111);
    System.out.println(formatter);

    formatter = new Formatter();
    formatter.format("% d", 111);
    System.out.println(formatter);

    formatter = new Formatter();
    formatter.format("% d", -222);
    System.out.println(formatter);

    formatter = new Formatter();
    formatter.format("% d", 222);
    System.out.println(formatter);

    System.out.println();
    System.out.println("*** Modificador de sinal (+) ***");

    formatter = new Formatter();
    formatter.format("%+d", 111);
    System.out.println(formatter);

    // No sinal - ele não terá efeito
    formatter = new Formatter();
    formatter.format("%+d", -111);
    System.out.println(formatter);

    System.out.println();
    System.out.println("*** Modificador de abre-parênteses (() ***");

    formatter = new Formatter();
    formatter.format("%(d", -111);
    System.out.println(formatter);

    formatter = new Formatter();
    formatter.format("%(d", 111);
    System.out.println(formatter);

    System.out.println();
    System.out.println("*** Modificador de vírgula (,) ***");

    formatter = new Formatter();
    formatter.format("%, d", 1000000);
    System.out.println(formatter);

    formatter = new Formatter();
    formatter.format("%, .3f", 32659526566.4521);
    System.out.println(formatter);

    System.out.println();
    System.out.println("*** Modificador de alinhamento à direita (||) (padrão) ***");

    formatter = new Formatter();
    formatter.format("|%20.4f|", 1234.1234);
    System.out.println(formatter);

    System.out.println();
    System.out.println("*** Modificador de alinhamento à esquerda (|-|) ***");

    formatter = new Formatter();
    formatter.format("|%-20.4f|", 1234.1234);
    System.out.println(formatter);

    System.out.println();
    System.out.println("*** Modificador %n ***");

    formatter = new Formatter();
    formatter.format("Learn IT %nJava Courses %nby IT-Bulls");
    System.out.println(formatter);

    System.out.println();
    System.out.println("*** Modificador %% ***");

    formatter = new Formatter();
    formatter.format("10 %% 4 = 2");
    System.out.println(formatter);

    System.out.println();
    System.out.println("*** Modificadores %x e %X ***");
    // %x: imprime o número em hexadecimal com letras em minúsculo
    formatter = new Formatter();
    formatter.format("%x", 250);
    System.out.println("Hexadecimal com letras em minúsculo usando %x: " + formatter);

    // %X: imprime o número em hexadecimal com letras em maiúsculo
    formatter = new Formatter();
    formatter.format("%X", 250);
    System.out.println("Hexadecimal com letras em maiúsculo usando %X: " + formatter);

    System.out.println();
    System.out.println("*** Modificadores %e e %E ***");

    // %e: imprime o número em notação científica com letras em minúsculo
    formatter = new Formatter();
    formatter.format("%e", 123.1234);
    System.out.println("Notação científica com letras em minúsculo usando %e: " + formatter);

    // %e: imprime o número em notação científica com letras em maiúsculo
    formatter = new Formatter();
    formatter.format("%E", 123.1234);
    System.out.println("Notação científica com letras em maiúsculo usando %E: " + formatter);

    System.out.println();
    System.out.println("*** Formatos de precisão ***");

    // Adicionado dados de números com ponto flutuante usando os modificadores %f ou %e
    // Formatado para 2 caracteres decimais, em um campo de 16 caracteres.
    formatter = new Formatter();
    formatter.format("%16.2e", 123.1234567);
    System.out.println("Notação científica para 16 total e 2 casas decimais: " + formatter);

    // Formatado para 4 caracteres decimais
    formatter = new Formatter();
    formatter.format("%.4f", 123.1234567);
    System.out.println("Ponto-flutuante com 4 casas decimais: " + formatter);

    // Formatado para 4 caracteres decimais
    // O modificador %g faz com que o Formatter use %f ou %e, o que for mais curto
    formatter = new Formatter();
    formatter.format("%.4g", 123.1234567);
    System.out.println("Ponto flutuante decimal ou em notação científica com 4 casas: " + formatter);

    // Exibir no máximo 15 caracteres em uma string
    formatter = new Formatter();
    formatter.format("%.15s", "12345678901234567890");
    System.out.println("Notação de String com 15 casas: " + formatter);

    // Formatar em número de 10 dígitos
    formatter = new Formatter();
    formatter.format("%010d", 88);
    System.out.println("Valor com 10 dígitos: " + formatter);
    
  }
}