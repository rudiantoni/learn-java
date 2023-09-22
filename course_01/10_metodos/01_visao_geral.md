# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Visao geral
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [01_arquivos](./01_arquivos/)
- Projetos
  - [Projeto 1](./01_arquivos/proj_01/) [(iniciado em)](#o-que-é-um-método)
- Conteúdo
  - [O que é um método](#o-que-é-um-método)
  - [Elementos](#elementos)
  - [Assinatura](#assinatura)

### O que é um método
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./01_arquivos/proj_01/)

Um método em Java é um bloco de código que realiza uma tarefa específica.

Os métodos são usados para organizar e reutilizar código em um programa Java.

Eles podem executar ações, retornar valores ou não retornar nada (void).

Os métodos são definidos dentro de classes e podem ser chamados a partir de objetos dessa classe.

### Elementos
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./01_arquivos/proj_01/)

**Modificador de Acesso**: Especifica o nível de acesso ao método (public, private, protected, package-private).

```java
public void meuMetodo() {
  // Código do método aqui
}
```

**Tipo de Retorno**: Especifica o tipo de dado que o método retorna ou "void" se não retornar nada.

```java
public int somar(int a, int b) {
  return a + b;
}
```

**Nome do Método**: O nome que identifica o método.

```java
public void imprimirMensagem() {
  System.out.println("Olá, mundo!");
}
```

**Parâmetros**: Os valores que podem ser passados para o método.

```java
public void saudacao(String nome) {
  System.out.println("Olá, " + nome + "!");
}
```

**Corpo do Método**: O bloco de código que define o comportamento do método.

```java
public int calcularSoma(int a, int b) {
  int resultado = a + b;
  return resultado;
}
```

### Assinatura
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./01_arquivos/proj_01/)

A assinatura de um método é uma combinação única do nome do método e dos tipos e ordem dos parâmetros.

A assinatura é usada para distinguir métodos com o mesmo nome em uma classe (sobrecarga de método).

Exemplo de assinatura de método:

```java
public int somar(int a, int b)
```

Neste exemplo, a assinatura do método somar inclui o nome do método, o tipo de retorno (int), e os tipos dos parâmetros (int e int).

Se você tentar criar outro método chamado somar com a mesma assinatura na mesma classe, isso resultaria em um erro de compilação.
