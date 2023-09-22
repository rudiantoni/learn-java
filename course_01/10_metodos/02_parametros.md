# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Parâmetros
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [02_arquivos](./02_arquivos/)
- Projetos
  - [Projeto 1](./02_arquivos/proj_01/) [(iniciado em)](#o-que-são-parâmetros)
- Conteúdo
  - [O que são parâmetros](#o-que-são-parâmetros)
  - [Parâmetros por valor](#parâmetros-por-valor)
  - [Parâmetros por referência](#parâmetros-por-referência)
  - [Passando tipos primitivos](#passando-tipos-primitivos)
  - [Passando tipos de referência](#passando-tipos-de-referência)

### O que são parâmetros
[[Topo]](#)<br />

Os parâmetros são valores que podem ser passados para um método para que ele possa realizar seu trabalho.

Eles permitem que você forneça dados de entrada para um método.

Em Java, os parâmetros são declarados na lista de parâmetros de um método.

### Parâmetros por valor
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./02_arquivos/proj_01/)

Em Java, todos os argumentos de método são passados por valor.

Isso significa que uma cópia do valor do argumento é passada para o método, e qualquer modificação feita no parâmetro dentro do método não afeta a variável original fora do método.

```java
public class ExemploPassagemPorValor {
  public static void main(String[] args) {
    int numero = 10;
    System.out.println("Antes do método: " + numero);
    
    modificarNumero(numero);
    
    System.out.println("Depois do método: " + numero);
  }
  
  public static void modificarNumero(int numero) {
    numero = 20; // Isso modifica apenas a cópia do valor, não o valor original
  }
}
```

A saída será:

```ython
Antes do método: 10
Depois do método: 10
```

### Parâmetros por referência
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./02_arquivos/proj_01/)

Em Java, todos os argumentos de método são passados por valor.

Isso significa que mesmo quando você passa um objeto como argumento, você está passando uma cópia da referência do objeto, não o próprio objeto. 

Isso pode dar a ilusão de que os objetos estão sendo passados por referência, mas eles não estão.


```java
public class ExemploPassagemPorReferencia {
  public static void main(String[] args) {
    StringBuilder texto = new StringBuilder("Olá");
    System.out.println("Antes do método: " + texto);
    
    modificarTexto(texto);
    
    System.out.println("Depois do método: " + texto);
  }
  
  public static void modificarTexto(StringBuilder texto) {
    texto.append(", mundo!"); // Isso modifica o objeto referenciado pela cópia da referência
  }
}
```

A saída será:

```
Antes do método: Olá
Depois do método: Olá, mundo!
```

### Passando tipos primitivos
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./02_arquivos/proj_01/)

Os tipos primitivos, como int, float, char, etc., são passados por valor.

Isso significa que uma cópia do valor é passada para o método, e qualquer modificação no parâmetro dentro do método não afeta a variável original fora do método.

```java
public class ExemploPassagemTiposPrimitivos {
  public static void main(String[] args) {
    int numero = 5;
    System.out.println("Antes do método: " + numero);
    
    modificarNumero(numero);
    
    System.out.println("Depois do método: " + numero);
  }
  
  public static void modificarNumero(int numero) {
    numero = 10; // Isso modifica apenas a cópia do valor, não o valor original
  }
}
```

A saída será:

```
Antes do método: 5
Depois do método: 5
```

### Passando tipos de referência
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./02_arquivos/proj_01/)

Em Java, mesmo quando você passa objetos como argumentos para um método, você está passando uma cópia da referência do objeto, não o próprio objeto.

Portanto, qualquer modificação feita no objeto referenciado dentro do método afetará o objeto original fora do método.

```java
public class ExemploPassagemTiposPorReferencia {
  public static void main(String[] args) {
    StringBuilder texto = new StringBuilder("Olá");
    System.out.println("Antes do método: " + texto);
    
    modificarTexto(texto);
    
    System.out.println("Depois do método: " + texto);
  }
  
  public static void modificarTexto(StringBuilder texto) {
    texto.append(", mundo!"); // Isso modifica o objeto referenciado
  }
}
```

A saída será:

```
Antes do método: Olá
Depois do método: Olá, mundo!
```

Lembre-se de que, em todos os casos, a passagem por valor significa que você está passando uma cópia do valor (ou referência), e qualquer modificação no parâmetro dentro do método não afetará a variável original fora do método.
