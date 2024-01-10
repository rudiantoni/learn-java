# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## 9.4. Foreach
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [04_arquivos](./04_arquivos/)
- Projetos
  - [Projeto 1](./04_arquivos/proj_01/) [(iniciado em)](#o-loop-foreach)
- Conteúdo
  - [O loop foreach](#o-loop-foreach)
  - [Funcionamento](#funcionamento)

### O loop foreach
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./04_arquivos/proj_01/)

O loop foreach, também conhecido como "for-each loop" em Java, é uma estrutura de controle que permite iterar facilmente por elementos de uma coleção, como arrays, listas, conjuntos, mapas e outras estruturas de dados.

Ele simplifica a iteração ao eliminar a necessidade de rastrear índices ou controlar variáveis de loop, tornando o código mais legível e menos propenso a erros.

Sintaxe do loop foreach:

```java
for (Tipo elemento : coleção) {
    // Corpo do loop
}
```

- `Tipo`: O tipo da variável que irá armazenar cada elemento da coleção.
- `elemento`: A variável que representará cada elemento da coleção em cada iteração.
- `coleção`: A coleção pela qual você deseja iterar.

### Funcionamento
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./04_arquivos/proj_01/)

Ele simplifica a iteração e elimina a necessidade de rastrear índices ou controlar variáveis de loop. O loop foreach torna o código mais limpo e legível.

```java
import java.util.ArrayList;
import java.util.List;

public class ExemploForeach {
  public static void main(String[] args) {
    List<String> nomes = new ArrayList<>();
    nomes.add("Alice");
    nomes.add("Bob");
    nomes.add("Charlie");

    // Iterando por uma lista de strings usando foreach
    for (String nome : nomes) {
      System.out.println(nome);
    }
  }
}
```

Neste exemplo:

- Criamos uma lista de strings chamada nomes e adicionamos três nomes a ela.
- Usamos o loop foreach para percorrer a lista nomes. A sintaxe for (String nome : nomes) significa que para cada elemento nome na lista nomes, o bloco de código dentro do loop é executado.
- O loop foreach automaticamente extrai cada elemento da lista e atribui à variável nome, simplificando a iteração.

A saída deste programa será:

```
Alice
Bob
Charlie
```

O loop foreach é especialmente útil quando você deseja iterar por elementos de uma coleção sem se preocupar com índices ou controle de variáveis, tornando o código mais eficiente e legível.
