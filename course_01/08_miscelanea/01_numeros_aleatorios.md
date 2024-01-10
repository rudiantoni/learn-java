# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## 8.1. Números aleatórios
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [01_arquivos](./01_arquivos/)
- Projetos
  - [Projeto 1](./01_arquivos/proj_01/) [(iniciado em)](#a-classe-random)
- Conteúdo
  - [A classe Random](#a-classe-random)
  - [Criando uma instância da classe Random](#criando-uma-instância-da-classe-random)
  - [Gerando números inteiros aleatórios](#gerando-números-inteiros-aleatórios)
  - [Gerando números de ponto flutuante aleatórios](#gerando-números-de-ponto-flutuante-aleatórios)

### A classe Random
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./01_arquivos/proj_01/)

A classe Random em é uma parte da biblioteca padrão que permite a geração de números pseudoaleatórios. Você pode usar essa classe para criar números aleatórios em seus programas.

A classe Random oferece diversos métodos para gerar números inteiros e números de ponto flutuante aleatórios com diferentes distribuições.

### Criando uma instância da classe Random
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./01_arquivos/proj_01/)

Para usar a classe Random, primeiro você precisa criar uma instância dela. Você pode fazer isso da seguinte maneira:

```java
import java.util.Random;

// Criar uma instância da classe Random
Random gerador = new Random();
```

### Gerando números inteiros aleatórios
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./01_arquivos/proj_01/)

Para gerar números inteiros aleatórios, você pode usar o método nextInt().

Por padrão, ele gera números inteiros dentro de todo o intervalo possível de valores inteiros.

```java
int numeroAleatorio = gerador.nextInt();
```

Você também pode especificar um limite superior para o intervalo de valores gerados:

```java
int numeroEntre1e10 = gerador.nextInt(10) + 1; // Gera um número entre 1 e 10
```

### Gerando números de ponto flutuante aleatórios
[[Topo]](#)<br />

Para gerar números de ponto flutuante aleatórios, você pode usar o método nextDouble(). Ele gera valores entre 0 (inclusive) e 1 (exclusivo).

```java
double numeroAleatorio = gerador.nextDouble();
```

Aqui está um exemplo completo que utiliza a classe Random para gerar números inteiros aleatórios dentro de um intervalo especificado:


```java
import java.util.Random;

public class ExemploRandom {
  public static void main(String[] args) {
    // Criar uma instância da classe Random
    Random gerador = new Random();

    // Gerar um número inteiro aleatório entre 1 e 10
    int numeroAleatorio = gerador.nextInt(10) + 1;
    System.out.println("Número aleatório entre 1 e 10: " + numeroAleatorio);
  }
}
```

Este exemplo cria um objeto Random, gera um número inteiro aleatório entre 1 e 10 e o imprime no console.

Lembre-se de que os números gerados pela classe Random são pseudoaleatórios e baseados em uma semente (seed).

Para obter sequências de números realmente aleatórios, você pode considerar outras fontes de entropia ou sementes diferentes.
