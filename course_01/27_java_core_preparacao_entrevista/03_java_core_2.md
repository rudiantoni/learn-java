# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## 27.3. Java Core parte 2: Perguntas e respostas
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Conteúdo
  - [Perguntas e respostas](#perguntas-e-respostas)

### Perguntas e respostas
[[Topo]](#)<br />

**POR QUE ALGUMAS INTERFACES NÃO DEFINEM MÉTODOS?**

Estas são as chamadas interfaces marcadoras. Elas simplesmente indicam que a classe pertence a um determinado grupo de classes. Por exemplo, a interface Cloneable indica que uma classe suporta o mecanismo de clonagem.

O grau de abstração neste caso é levado ao absoluto.

Exemplos de interfaces marcadoras em Java:

- Interface Serializable
- Interface Cloneable
- Interface Remote

**ME FALE SOBRE O MODELO DE MEMÓRIA JAVA**

No Java, a memória é organizada da seguinte forma, existem dois tipos:
- Heap
- Stack

O heap consiste em um contexto estático e o próprio heap. O heap é dividido em duas partes:
- Novo heap
- Velho heap

O novo heap, por sua vez, consiste em duas partes:
- Eden (vamos chamá-lo de primeiro) Space (heap)
- Survival Space (heap)

Descrição breve:

- **Eden Space (heap)**: a memória é alocada nesta área para todos os objetos criados pelo programa. A maioria dos objetos não vive muito tempo e é deletada durante coletas de lixo. Quando essa região enche, ocorre uma coleta de lixo menor.
- **Survivor Space (heap)**: objetos do Eden Space são movidos para cá após sobreviverem a pelo menos uma coleta de lixo. De tempos em tempos, objetos de longa vida são movidos para o Tenured Space (heap).
- **Tenured (Old) Generation (heap)**: objetos de longa vida se acumulam aqui. Quando essa área enche, ocorre uma coleta de lixo completa.
- **Permanent Generation (non-heap)**: onde as meta-informações usadas pela JVM são armazenadas.

**QUAL É A PRINCIPAL DIFERENÇA ENTRE String, StringBuffer E StringBuilder?**

- **String** pode ser usada para criar objetos imutáveis. Ou seja, para adicionar dados a uma string existente, um novo objeto string é criado.
- **StringBuffer** e **StringBuilder** podem mudar e adicionar strings. Estas operações não são tão caras em termos de memória. O primeiro é sincronizado, o segundo não é. Esta é a única diferença entre eles.

**ME FALE SOBRE OS STREAMS DE I/O EM JAVA.**

Existem dois tipos de streams de I/O:
- Stream de bytes (InputStream e OutputStream);
- Stream de caracteres (Reader e Writer);

Todos são classes abstratas decoradoras, às quais podem ser adicionadas funcionalidades adicionais, por exemplo:

```java
InputStream in = new FileInputStream(new File("file.txt"));
```

Neste caso, adicionamos a funcionalidade adicional de leitura de dados do arquivo.

**O QUE SÃO MEMÓRIA HEAP E STACK EM JAVA?**

- **Memória Heap**: área de memória alocada dinamicamente criada quando a JVM é iniciada. Usada pela Runtime do Java para alocar memória para objetos e JRE. A criação de um novo objeto também acontece no heap. Aqui é onde o coletor de lixo trabalha.
- **Memória Stack**: funciona de acordo com o esquema LIFO (Last-In-First-Out). Sempre que um método é chamado, um novo bloco é criado na memória stack que contém primitivos e referências a outros objetos no método. A memória do stack é muito menor do que a memória do heap.

**COMO FUNCIONA O COLETOR DE LIXO?**

O coletor de lixo possui vários algoritmos de trabalho. Ele é chamado periodicamente, e não apenas quando há falta de memória. A memória é limpa quando o primeiro heap (Eden Space) está completamente cheio. O coletor de lixo marca os objetos com referência nula, remove-os e organiza os objetos remanescentes. Se não houver espaço suficiente no Survivor Space, os objetos são transferidos para o Old heap, onde normalmente são armazenados objetos de longa vida.

**FALE SOBRE O CASTING DE TIPOS. QUANDO VOCÊ RECEBE UMA ClassCastException?**

O casting de tipos é definir o tipo de uma variável ou objeto para algo diferente do tipo atual. Existem dois tipos de cast em Java:
- Automático
- Não automático

O cast automático ocorre, por exemplo, em casos como: `byte->short->int->long->float->double`. Se estamos estendendo o tipo, não é necessário um cast explícito. Se estamos restringindo, é necessário especificar explicitamente a conversão de tipo.

No caso de objetos, podemos fazer cast automaticamente do tipo filho para o tipo pai, mas não o inverso. Nesse caso, uma ClassCastException será lançada.

**O QUE É UMA CLASSE ESTÁTICA E QUAIS SÃO AS CARACTERÍSTICAS DE SEU USO?**

Uma classe estática só pode ser uma classe aninhada (uma definição de classe colocada dentro de outra classe). Um objeto de uma classe interna comum mantém uma referência a um objeto da classe externa. Não há tal referência dentro de uma classe interna estática.

Características:

- Um objeto da classe externa não é necessário para criar um objeto da classe interna estática.
- A partir de um objeto de uma classe aninhada estática, não é possível acessar diretamente os membros não estáticos da classe externa.
- As classes internas comuns não podem conter métodos e membros estáticos.

As classes aninhadas permitem que cada classe interna herde independentemente uma implementação específica.

**QUAIS TIPOS DE CLASSES INTERNAS EXISTEM? PARA QUE SÃO USADAS?**

Classes aninhadas existem dentro de outras classes. Uma classe normal é um membro completo de um pacote. As classes aninhadas, disponíveis desde o Java 1.1, podem ser de quatro tipos:

- Classes aninhadas estáticas
- Classes internas não estáticas
- Classes locais
- Classes anônimas

Classes aninhadas estáticas têm acesso a quaisquer métodos estáticos da classe externa, incluindo privados. Não podem acessar diretamente campos e métodos não estáticos da classe externa. Classes internas não estáticas têm acesso às propriedades não estáticas da classe externa. Classes locais são definidas em um bloco e tipicamente encontradas no corpo de um método. Classes anônimas não têm nome e são visíveis apenas dentro do bloco.
