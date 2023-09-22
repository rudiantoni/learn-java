# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Recursividade
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [03_arquivos](./03_arquivos/)
- Projetos
  - [Projeto 1](./03_arquivos/proj_01/) [(iniciado em)](#o-que-são-métodos-recursivos)
- Conteúdo
  - [O que são métodos recursivos](#o-que-são-métodos-recursivos)
  - [Como usar métodos recursivos](#como-usar-métodos-recursivos)

### O que são métodos recursivos
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./03_arquivos/proj_01/)

Métodos recursivos são métodos que chamam a si mesmos para resolver um problema em partes menores e, eventualmente, chegar a uma solução.

Essa técnica é conhecida como recursão. Ela é usada quando um problema pode ser decomposto em instâncias menores do mesmo problema.

A recursão envolve dois componentes essenciais:
- Caso Base: É a condição em que a recursão para. É importante definir um caso base para evitar que a recursão continue indefinidamente.
- Caso Recursivo: É a chamada recursiva ao próprio método com uma instância menor do problema.

Os métodos recursivos são amplamente utilizados em algoritmos de busca, ordenação, árvores, entre outros.

### Como usar métodos recursivos
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./03_arquivos/proj_01/)

Vamos criar um exemplo simples de um método recursivo que calcula o fatorial de um número.

O fatorial de um número n é o produto de todos os números inteiros positivos de 1 até n.

```java
public class ExemploRecursao {
  public static void main(String[] args) {
    int numero = 5;
    int resultado = calcularFatorial(numero);
    System.out.println("O fatorial de " + numero + " é " + resultado);
  }

  public static int calcularFatorial(int n) {
    // Caso base: O fatorial de 0 é 1
    if (n == 0) {
        return 1;
    }
    // Caso recursivo: Chamada recursiva com um problema menor
    return n * calcularFatorial(n - 1);
  }
}
```

Neste exemplo, temos a função calcularFatorial, que é chamada recursivamente. Quando n é igual a 0, a função retorna 1 (caso base), caso contrário, ela multiplica n pelo resultado da chamada recursiva com n - 1 (caso recursivo). Isso continua até que n seja 0, momento em que a recursão para.

Ao executar este código, você obterá a saída:

```
O fatorial de 5 é 120
```

Observe que a recursão deve sempre ter um caso base bem definido para evitar um loop infinito.

Além disso, é importante garantir que o problema seja decomposto em instâncias menores para que a recursão faça progresso em direção ao caso base.
