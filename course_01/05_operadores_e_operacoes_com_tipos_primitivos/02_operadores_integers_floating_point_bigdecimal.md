# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## 5.2. Operadores com Integers e números com floating-point, tipo BigDecimal
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [02_arquivos](./02_arquivos/)
- Projetos
  - [Projeto 1](./02_arquivos/proj_01/) [(iniciado em)](#visão-geral)
- Conteúdo
  - [Visão geral](#visão-geral)
  - [Números inteiros](#números-inteiros)
  - [Números decimais](#números-decimais)

### Visão geral
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./02_arquivos/proj_01/) [(iniciado em)](#visão-geral)

Você pode usar a classe BigDecimal para realizar operações aritméticas precisas com números decimais, controlando a escala (número de casas decimais) e o modo de arredondamento.

### Números inteiros
[[Topo]](#)<br />

```java
import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalExemploInt {
    public static void main(String[] args) {
        int valorInteiro1 = 10;
        int valorInteiro2 = 3;

        BigDecimal decimalValor1 = new BigDecimal(valorInteiro1);
        BigDecimal decimalValor2 = new BigDecimal(valorInteiro2);

        // Adição
        BigDecimal soma = decimalValor1.add(decimalValor2);
        System.out.println("Soma: " + soma);

        // Subtração
        BigDecimal diferenca = decimalValor1.subtract(decimalValor2);
        System.out.println("Diferença: " + diferenca);

        // Multiplicação
        BigDecimal produto = decimalValor1.multiply(decimalValor2);
        System.out.println("Produto: " + produto);

        // Divisão com escala (número de casas decimais) e modo de arredondamento
        BigDecimal quociente = decimalValor1.divide(decimalValor2, 2, RoundingMode.HALF_UP);
        System.out.println("Quociente: " + quociente);
    }
}
```

Neste exemplo, temos duas variáveis *valorInteiro1* e *valorInteiro2* que armazenam valores inteiros. Eles são convertidos em objetos BigDecimal. Em seguida, realizamos várias operações aritméticas:
- *Adição*: Usamos add para somar *decimalValor1* e *decimalValor2*.
- *Subtração*: Usamos subtract para encontrar a diferença entre *decimalValor1* e *decimalValor2*.
- *Multiplicação*: Usamos multiply para multiplicar *decimalValor1* e *decimalValor2*.
- *Divisão*: Usamos divide para dividir *decimalValor1* por *decimalValor2* com uma escala de 2 casas decimais e o modo de arredondamento RoundingMode.HALF_UP.

### Números decimais
[[Topo]](#)<br />

```java
import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalExemploDouble {
    public static void main(String[] args) {
        double valorDouble1 = 10.5;
        double valorDouble2 = 3.2;

        BigDecimal decimalValor1 = BigDecimal.valueOf(valorDouble1);
        BigDecimal decimalValor2 = BigDecimal.valueOf(valorDouble2);

        // Adição
        BigDecimal soma = decimalValor1.add(decimalValor2);
        System.out.println("Soma: " + soma);

        // Subtração
        BigDecimal diferenca = decimalValor1.subtract(decimalValor2);
        System.out.println("Diferença: " + diferenca);

        // Multiplicação
        BigDecimal produto = decimalValor1.multiply(decimalValor2);
        System.out.println("Produto: " + produto);

        // Divisão com escala (número de casas decimais) e modo de arredondamento
        BigDecimal quociente = decimalValor1.divide(decimalValor2, 2, RoundingMode.HALF_UP);
        System.out.println("Quociente: " + quociente);
    }
}
```

Neste segundo exemplo, temos duas variáveis *valorDouble1* e *valorDouble2* que armazenam números de ponto flutuante (double).

Usamos `BigDecimal.valueOf()` para convertê-los em objetos BigDecimal. Em seguida, realizamos as mesmas operações aritméticas:

- *Adição*: Usamos add para somar decimalValor1 e decimalValor2.
- *Subtração*: Usamos subtract para encontrar a diferença entre decimalValor1 e decimalValor2.
- *Multiplicação*: Usamos multiply para multiplicar decimalValor1 e decimalValor2.
- *Divisão*: Usamos divide para dividir decimalValor1 por decimalValor2 com uma escala de 2 casas decimais e o modo de arredondamento *RoundingMode.HALF_UP*.

Em ambos os exemplos, o uso de setScale e rounding mode na operação de divisão permite controlar a precisão do resultado e o modo de arredondamento, garantindo que os resultados sejam calculados com a precisão desejada.
