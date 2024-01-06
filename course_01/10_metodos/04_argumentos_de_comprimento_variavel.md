# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Argumentos de comprimento variável
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [04_arquivos](./04_arquivos/)
- Projetos
  - [Projeto 1](./04_arquivos/proj_01/) [(iniciado em)](#varargs)
- Conteúdo
  - [Varargs](#varargs)

### Varargs
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./04_arquivos/proj_01/)

Em Java, você pode criar métodos que aceitam um número variável de argumentos usando o recurso de "Argumentos de Comprimento Variável", ou Varargs.

Isso permite que você chame um método com um número arbitrário de argumentos do mesmo tipo.

Os argumentos de comprimento variável são representados como um array no interior do método.

```java
public class ExemploArgumentosVariaveis {
  public static void main(String[] args) {
    imprimirNomes("Alice", "Bob", "Carol");
    imprimirNomes("David", "Eva");
  }

  public static void imprimirNomes(String... nomes) {
    System.out.print("Nomes: ");
    for (String nome : nomes) {
      System.out.print(nome + " ");
    }
    System.out.println();
  }
}
```

Neste exemplo, a função imprimirNomes aceita um número variável de argumentos do tipo String.

Você pode chamar essa função com qualquer número de argumentos de string, separados por vírgulas.

A função itera sobre os argumentos e os imprime na saída.

Aqui estão algumas chamadas possíveis para o método imprimirNomes:

```java
imprimirNomes("Alice", "Bob", "Carol");
// Saída: Nomes: Alice Bob Carol

imprimirNomes("David", "Eva");
// Saída: Nomes: David Eva

imprimirNomes(); // Você também pode chamar o método sem argumentos
// Saída: Nomes:
```

Observe que os argumentos de comprimento variável devem ser o último parâmetro na lista de parâmetros de um método, e você pode ter apenas um único parâmetro de comprimento variável em um método.

Além disso, o parâmetro de comprimento variável é tratado como um array dentro do método, permitindo que você acesse os valores individualmente.
