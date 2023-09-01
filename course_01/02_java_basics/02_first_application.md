# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

# 2 - Primeira aplicação: Hello World App
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [02_arquivos](./02_arquivos/)
- Homework: [HW - Hello World App](./02_arquivos/homework/HW%20-%20Hello%20World%20App.pdf)
- Projetos
  - [Projeto 1](./02_arquivos/proj_01/) [(iniciado em)](#como-criar-uma-aplicação-hello-world-com-java)
    - `javac HelloWorld.java`
    - `javac TestError.java`
    - `java HelloWorld`
    - `java TestError`
    - `sh run.sh`
- Conteúdo
  - [O que são aplicações de console?](#o-que-são-aplicações-de-console)
  - [Aplicação de console em Java](#aplicação-de-console-em-java)
  - [Sintaxe básica: Convenção de nomenclatura](#sintaxe-básica-convenção-de-nomenclatura)
  - [Como criar uma aplicação "Hello World" com Java](#como-criar-uma-aplicação-hello-world-com-java)
  - [Como compilar arquivos .java para bytecode?](#como-compilar-arquivos-java-para-bytecode)
  - [Como executar nossos programas na JVM?](#como-executar-nossos-programas-na-jvm)
  - [O que são erros de compilação e de execução?](#o-que-são-erros-de-compilação-e-de-execução)
  - [Criação de arquivo .bat ou .sh](#criação-de-arquivo-bat-ou-sh)

### O que são aplicações de console?
[[Topo]](#)<br />

Uma aplicação ou programa de console é uma aplicação que serve para trabalhar com entrada e saídas de dados em uma linha de comando possuindo acesso a apenas 3 streams de dados: standard input, standard output e standard error.

Essas aplicações não possuem nenhuma GUI (interface gráfica).

Atualmente elas são utilizadas apenas para fins educacionais.

### Aplicação de console em Java
[[Topo]](#)<br />

- Primeiramente, vamos criar um arquivo com a extensão ".java", este será o código-fonte.
- Após isso vamos compilar o arquivo do código-fonte para bytecode através do compilador *javac*, o que produzirá um arquivo com o mesmo nome mas com a extensão ".class".

Lembre-se que a JVM não executa arquivos *.java*, ela executa principalmente arquivos *.class*.

### Sintaxe básica: Convenção de nomenclatura
[[Topo]](#)<br />

Os nomes de classes são sempre iniciados com uma letra maiúscula (Integer, String, etc), também conhecido como *PascalCase*.

Nomes de métodos são iniciados com letras minúsculas e as letras iniciais seguintes são sempre maiúsculas, também conhecido como *camelCase*.

Constantes são nomeadas com todas as letras maiúsculas e sublinhados, também conhecido como *MACRO_CASE*.

### Como criar uma aplicação "Hello World" com Java
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./02_arquivos/proj_01/)

Escolha alguma pasta e crie dentro dela um arquivo chamado *HelloWorld.java*. Use o comando `touch HelloWorld.java`.

Abra o arquivo com o seu editor de texto preferido e insira o seguinte conteúdo:

```java
public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}
```

Salve o arquivo.

### Como compilar arquivos .java para bytecode?
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./02_arquivos/proj_01/)

Após criar o arquivo, temos de compilá-lo.

Para isso, abra o terminal na mesma pasta onde o arquivo *HelloWorld.java* está localizado.

Para compilar, use o comando `javac HelloWorld.java`.

Após isso, será criado um arquivo com o nome *HelloWorld.class* na mesma pasta.

É importante notar que, toda vez que realizamos uma alteração no código fonte devemos recompilá-lo, pois temos que gerar um novo bytecode. Se você executar sem compilar após uma alteração, você ainda estará executando a versão antiga, que tinha sido compilada antes.

### Como executar nossos programas na JVM?
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./02_arquivos/proj_01/)

Após gerado o arquivo bytecode, temos de executá-lo.

Para isso, abra o terminal na mesma pasta onde o arquivo *HelloWorld.class* está localizado.

Para executar, use o comando `java HelloWorld` (sem a extensão).

Caso você visualize a mensagem `Hello World` no seu terminal, parabéns, você criou, compilou e executou sua primeira aplicação Java. Caso contrário, retorne ao passo onde a aplicação foi criada e reveja suas ações.

### O que são erros de compilação e de execução?
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./02_arquivos/proj_01/)

Erros de compilação ou compile errors, são gerados no momentos que tentamos compilar o código fonte e ocorrem erros que impedem a compilação.

Normalmente, são erros de sintaxe como variáveis não localizadas, palavras-chave escritas de maneira errada, dentre outros.

Erros de execução ou runtime erros, são erros presentes no código, mas que não impedem a compilação, eles só serão visualizados no momento em que a aplicação for executada e uma dada instrução causar o erro.

Normalmente, são erros de operação como não registrar a função main, utilizar um valor nulo em alguma operação ou em utilização de atributos e métodos, referenciar índices inexistentes de arrays, dentre outros.

Para testar, crie um arquivo chamado `TestError.java` e coloque o seguinte conteúdo:
```java
public class TestErrorD {
  public static void maine(String[] args) {
    System.out.println("Testing errors");
  }
}
```

Agora tente compilar o arquivo.

Você deve ver o seguinte no terminal:
```bash
TestError.java:1: error: class TestErrorD is public, should be declared in a file named TestErrorD.java
public class TestErrorD {
       ^
1 error
```

Aqui ocorreu um erro ao compilar o arquivo, pois o nome da classe pública *TestErrorD* no código-fonte, é diferente do nome do arquivo *TestError.java* e, no Java, eles precisam ter o mesmo exato nome.

Vamos corrigir o erro removendo o *D* no fim do nome da classe, ficando desta maneira:
```java
public class TestError {
  public static void maine(String[] args) {
    System.out.println("Testing errors");
  }
}
```

Agora perceba que, ao compilar, não são gerados mais erros, e o bytecode é gerado normalmente. É hora de executar o programa.

Ao tentar executar o programa, podemos visualizar o seguinte erro no terminal:
```java
Error: Main method not found in class TestError, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application
```

Aqui ocorreu um ao executar alguma instrução, onde é solicitado a criação do método *main* com uma dada assinatura `public static void main(String[] args)`. No Java, a intrução inicial do programa é executar o método main existente, sendo assim toda a aplicação Java deve ter um método *main* em uma de suas classes, neste caso, o método main não existe, pois ele foi nomeado como *maine*.

Vamos corrigir o erro removendo o *e* no fim do nome do método *maine*, ficando desta maneira:
```java
public class TestError {
  public static void main(String[] args) {
    System.out.println("Testing errors");
  }
}
```

Pronto, agora, ao recompilar e executar, você deve estar visualizando a mensagem `Testing errors` e já sem mais erros.

### Criação de arquivo .bat ou .sh
[[Topo]](#)<br />

- Ver homework: [HW - Hello World App](./02_arquivos/homework/HW%20-%20Hello%20World%20App.pdf)
- Ver projeto: [Projeto 1](./02_arquivos/proj_01/)

Homework: Criar um script *.bat* (para Windows) ou *.sh* (para Linux e MacOS) que:
- Compile o código fonte *HelloWorld*
- Execute o bytecode gerado
- Remova o bytecode após a execução para manter a pasta limpa.

Conteúdo do arquivo:

```bash
#!/bin/bash

javac HelloWorld.java
java HelloWorld
rm HelloWorld.class
```

Para executá-lo, navegue até onde a pasta está e use o comando `sh run.sh`.
