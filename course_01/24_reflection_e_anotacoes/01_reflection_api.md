# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## 24.1. Java Reflection API
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [01_arquivos](./01_arquivos/)
- Projetos
  - [Projeto 1](./01_arquivos/proj_01/) [(iniciado em)](#exemplos-de-uso)
- Conteúdo
  - [O que é a Reflection API](#o-que-é-a-reflection-api)
  - [Objetivos](#objetivos)
  - [Exemplos de uso](#exemplos-de-uso)

### O que é a Reflection API
[[Topo]](#)<br />

A Reflection API em Java é uma poderosa ferramenta para inspecionar e manipular classes, métodos, campos e construtores em tempo de execução. Ela permite que programas Java analisem ou "reflitam" sobre si mesmos, tornando possível fazer coisas como:

- **Descobrir e manipular a estrutura da classe**: Com a Reflection API, você pode obter informações sobre a estrutura de uma classe, como seus métodos, campos, anotações, superclasses, interfaces implementadas, etc. Isso é feito através de classes como Class, Method, Field, Constructor, e Annotation.
- **Criação de instâncias dinâmicas**: Você pode criar objetos de classes em tempo de execução sem conhecer o nome da classe em tempo de compilação, usando Class.newInstance() ou Constructor.newInstance().
- **Acesso a membros privados**: A Reflection API permite acessar e modificar membros privados de uma classe (embora isso deva ser feito com cautela, pois quebra o encapsulamento).
- **Invocação de métodos**: Você pode invocar métodos de um objeto dinamicamente, mesmo que o nome do método não seja conhecido até o tempo de execução.
- **Manipulação de arrays**: A Reflection API também fornece meios para manipular arrays de forma dinâmica.

Apesar de sua potência, a Reflection API deve ser usada com cuidado. Ela pode levar a problemas de desempenho, segurança e manutenção. O uso excessivo ou inadequado da Reflection pode tornar o código difícil de entender e manter. Em Java 8, a Reflection API não sofreu grandes alterações em relação às versões anteriores, mas continua sendo uma ferramenta útil para casos de uso específicos que requerem flexibilidade e introspecção dinâmica.

### Objetivos
[[Topo]](#)<br />

A Reflection API em Java 8 é projetada com vários objetivos principais em mente, que permitem uma ampla gama de operações dinâmicas e introspectivas em programas Java. Estes objetivos incluem:

- **Introspecção de classes e objetos**: A Reflection API permite examinar ou "refletir" sobre as classes e objetos em tempo de execução. Isso inclui obter informações sobre os métodos, campos, anotações, e a hierarquia de classes de um objeto. Por exemplo, você pode descobrir quais métodos uma classe suporta, quais campos ela possui, se ela tem anotações específicas, entre outros.
- **Manipulação dinâmica de objetos**: Através da Reflection API, é possível criar instâncias de classes, acessar e modificar campos, e invocar métodos dinamicamente, sem a necessidade de conhecê-los em tempo de compilação. Isso é particularmente útil em cenários onde você está trabalhando com código que pode não estar disponível até o momento da execução.
- **Implementação de funcionalidades genéricas**: A Reflection API facilita a criação de funcionalidades genéricas que podem operar em uma ampla gama de objetos. Por exemplo, um framework de serialização pode usar a Reflection para genericamente serializar objetos de qualquer tipo.
- **Desenvolvimento de frameworks e bibliotecas**: Muitos frameworks e bibliotecas Java, como Spring e Hibernate, usam a Reflection API intensamente para realizar operações como injeção de dependência, mapeamento objeto-relacional, e criação de proxies dinâmicos.
- **Depuração e teste**: A Reflection API pode ser usada para fins de depuração e teste, permitindo que os desenvolvedores e ferramentas de teste acessem e manipulem o estado interno de objetos de maneira flexível.
- **Desenvolvimento de ferramentas de desenvolvimento integrado (IDEs)**: As IDEs podem usar a Reflection API para fornecer funcionalidades como autocompletar código, navegação de código, e inspeção de objetos em tempo de execução.

Apesar desses benefícios, é importante usar a Reflection API com cautela. Ela pode introduzir problemas de desempenho, complicar a manutenção do código, e, em alguns casos, pode comprometer a segurança e o encapsulamento. Portanto, seu uso é recomendado principalmente em cenários onde as capacidades dinâmicas que ela oferece são realmente necessárias e justificadas.

### Exemplos de uso
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./01_arquivos/proj_01/)

#### Obtendo informações de classe

```java
public class Exemplo {
  private int numero;
  public String texto;

  public void metodoPublico() {
    // Método público
  }

  private void metodoPrivado() {
    // Método privado
  }
}

public class Main {
  public static void main(String[] args) {
    Class<Exemplo> classe = Exemplo.class;

    // Obtendo o nome da classe
    System.out.println("Nome da classe: " + classe.getName());

    // Listando os métodos
    System.out.println("Métodos:");
    for (Method metodo : classe.getDeclaredMethods()) {
        System.out.println(metodo.getName());
    }

    // Listando os campos
    System.out.println("Campos:");
    for (Field campo : classe.getDeclaredFields()) {
      System.out.println(campo.getName());
    }
  }
}
```

#### Criando instâncias e acessando campos

```java
public class Exemplo {
  private int numero;
  public String texto;
}

public class Main {
  public static void main(String[] args) throws Exception {
    // Criando uma instância da classe Exemplo
    Class<Exemplo> classe = Exemplo.class;
    Exemplo exemplo = classe.newInstance();

    // Acessando e modificando o campo público "texto"
    Field texto = classe.getField("texto");
    texto.set(exemplo, "Olá, Reflection!");
    System.out.println("Texto: " + exemplo.texto);

    // Acessando e modificando o campo privado "numero"
    Field numero = classe.getDeclaredField("numero");
    numero.setAccessible(true); // Necessário para acessar um campo privado
    numero.setInt(exemplo, 10);
    System.out.println("Número: " + numero.getInt(exemplo));
  }
}
```

#### Invocando métodos

```java
public class Exemplo {
  private void mensagem(String msg) {
    System.out.println(msg);
  }
}

public class Main {
  public static void main(String[] args) throws Exception {
    Exemplo exemplo = new Exemplo();

    // Obtendo o método privado
    Method metodo = Exemplo.class.getDeclaredMethod("mensagem", String.class);
    metodo.setAccessible(true); // Necessário para acessar um método privado

    // Invocando o método
    metodo.invoke(exemplo, "Chamada via Reflection");
  }
}
```

#### Observações importantes
- **Tratamento de exceções**: Os exemplos simplificam o tratamento de exceções. Na prática, você deve lidar adequadamente com `IllegalAccessException`, `NoSuchFieldException`, `NoSuchMethodException`, `InvocationTargetException`, etc.
- **Segurança e performance**: Alterar a visibilidade de campos e métodos (usando `setAccessible(true)`) pode ter implicações de segurança e performance. Deve ser usado com cautela.
- **Uso responsável**: A Reflection API é poderosa, mas seu uso indiscriminado pode levar a códigos difíceis de manter e entender. Recomenda-se utilizá-la apenas quando estritamente necessário.
