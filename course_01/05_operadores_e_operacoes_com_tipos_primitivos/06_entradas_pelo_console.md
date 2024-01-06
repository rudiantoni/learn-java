# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## 5.6. Ler entrada do usuário pelo console
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [06_arquivos](./06_arquivos/)
- Projetos
  - [Projeto 1](./06_arquivos/proj_01/) [(iniciado em)](#entrada-de-dados-com-a-classe-scanner)
- Conteúdo
  - [Entrada de dados com a classe Scanner](#entrada-de-dados-com-a-classe-scanner)

### Entrada de dados com a classe Scanner
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./06_arquivos/proj_01/)

Você pode ler dados de entrada do console usando a classe Scanner que está disponível no pacote java.util.

O Scanner permite que você leia diferentes tipos de dados do console de forma fácil e interativa.

Aqui está um exemplo de como fazer isso:

```java
import java.util.Scanner;

public class EntradaDeDados {
  public static void main(String[] args) {
    // Crie um objeto Scanner para ler do console
    Scanner scanner = new Scanner(System.in);

    // Solicite ao usuário que insira um número inteiro
    System.out.print("Digite um número inteiro: ");
    int numeroInteiro = scanner.nextInt();

    // Solicite ao usuário que insira um número de ponto flutuante
    System.out.print("Digite um número de ponto flutuante: ");
    double numeroPontoFlutuante = scanner.nextDouble();

    // Solicite ao usuário que insira uma string
    System.out.print("Digite uma string: ");
    String texto = scanner.next();

    // Exiba os valores lidos
    System.out.println("Você digitou um número inteiro: " + numeroInteiro);
    System.out.println("Você digitou um número de ponto flutuante: " + numeroPontoFlutuante);
    System.out.println("Você digitou uma string: " + texto);

    // Feche o Scanner quando não for mais necessário
    scanner.close();
  }
}
```

Neste exemplo, o programa cria um objeto Scanner para ler dados do console. Em seguida, ele solicita ao usuário que insira um número inteiro, um número de ponto flutuante e uma string. O Scanner é usado para ler esses valores e armazená-los em variáveis. Finalmente, os valores lidos são exibidos no console.

Lembre-se de importar a classe Scanner e tratá-la com cuidado. É uma boa prática fechar o Scanner quando você terminar de usá-lo para evitar vazamentos de recursos.

Você pode personalizar e expandir este exemplo para atender às suas necessidades específicas de entrada de dados por console em seus programas Java.

