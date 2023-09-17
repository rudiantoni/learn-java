# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Ler entrada do usuário pelo console
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [06_arquivos](./06_arquivos/)
- Homework
  - [Arquivo: HW - Operators - Practical Tasks](./06_arquivos/homework/HW%20-%20Operators%20-%20Practical%20Tasks.pdf)
  - [Homework: Calculadora de inteiros de console simples](#homework-calculadora-de-inteiros-de-console-simples)
  - [Homework: Calcular a área de um triângulo](#homework-calcular-a-área-de-um-triângulo)
  - [Homework: Circunferência de um círculo](#homework-circunferência-de-um-círculo)
- Projetos
  - [Projeto 1](./06_arquivos/proj_01/) [(iniciado em)](#entrada-de-dados-com-a-classe-scanner)
- Exercícios
  - [Exercício 1](./06_arquivos/exercicio_01/) ([enunciado](#homework-calculadora-de-inteiros-de-console-simples))
  - [Exercício 2](./06_arquivos/exercicio_02/) ([enunciado](#homework-calcular-a-área-de-um-triângulo))
  - [Exercício 3](./06_arquivos/exercicio_03/) ([enunciado](#homework-circunferência-de-um-círculo))
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

### Homework: Calculadora de inteiros de console simples
[[Topo]](#)<br />

- Ver homework: [HW - Operators - Practical Tasks](./06_arquivos/homework/HW%20-%20Operators%20-%20Practical%20Tasks.pdf)

Implemente um programa de console que atenda aos seguintes requisitos:

1. O programa é iniciado com 2 argumentos de entrada.
2. O programa converte os argumentos em números inteiros.
3. O programa imprima no console o resultado da soma dos 2 números.

**Iniciar uma aplicação Java passando argumentos**
- Usando a linha de comando
  - Após compilar (`javac nome_programa.java`) o programa, utilize o seguinte comando para iniciar uma aplicação Java enviando os valores 3 e 4 como argumentos: `java nome_programa 3 4`
- Usando o IntelliJ Idea
  - Na barra de menus, acesse *Run* > *Edit Configurations*:
    - Em *Application*, crie um novo (ou selecione o já existente se for a classe correta) selecionando *Application* e aponte para a classe correta onde está localizado o método main().
    - Em *Program Arguments*, digite os argumentos a serem passados para a aplicação, clique em *Apply* e *Run*.
- Lembre-se: Cada argumento se dá separando os valores com espaços em branco.

Para converter argumentos em formato de texto (String) para inteiros, considere o seguinte exemplo: `int i = Integer.parseInt("1");`.

> Exercício 1 (Ler entrada do usuário pelo console): [06_arquivos/exercicio_01](./06_arquivos/exercicio_01/)

### Homework: Calcular a área de um triângulo
[[Topo]](#)<br />

- Ver homework: [HW - Operators - Practical Tasks](./06_arquivos/homework/HW%20-%20Operators%20-%20Practical%20Tasks.pdf)

Implemente um programa de console que atenda aos seguintes requisitos:

1. O programa inicia e pede ao usuário que insira o comprimento do lado A do triângulo.
2. O programa pede ao usuário que insira o comprimento do lado B do triângulo.
3. O programa pede ao usuário que insira o comprimento do lado C do triângulo.
4. Usando a fórmula de Heron (https://www.mathopenref.com/heronsformula.html), o programa calcula a área do triângulo e a exibe para o usuário.
5. Caso esse triângulo não exista, imprima 'NaN' no console.

> Exercício 2 (Ler entrada do usuário pelo console): [06_arquivos/exercicio_02](./06_arquivos/exercicio_02/)

### Homework: Circunferência de um círculo
[[Topo]](#)<br />

- Ver homework: [HW - Operators - Practical Tasks](./06_arquivos/homework/HW%20-%20Operators%20-%20Practical%20Tasks.pdf)

Implemente um programa de console que atenda aos seguintes requisitos:

1. O programa inicia e pede ao usuário para inserir o raio do círculo.
2. O programa calcula a circunferência do círculo e a exibe para o usuário.

> Exercício 3 (Ler entrada do usuário pelo console): [06_arquivos/exercicio_03](./06_arquivos/exercicio_03/)
