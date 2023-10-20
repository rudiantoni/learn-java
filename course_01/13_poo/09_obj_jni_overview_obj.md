# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Objeto, JNI e visão geral da classe Object
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Conteúdo
 - [O que é a classe Object](#o-que-é-a-classe-object)
 - [Visão geral da classe Object](#visão-geral-da-classe-object)
 - [JNI - Java Native Interface](#jni---java-native-interface)
 - [Palavra-chave native](#palavra-chave-native)
 - [Anotação @Deprecated](#anotação-deprecated)

### O que é a classe Object
[[Topo]](#)<br />

- Link da documentação oficial da Oracle: https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html

Em Java, a classe Object é a classe raiz de todas as classes. Isso significa que todas as classes em Java são direta ou indiretamente derivadas da classe Object. A classe Object fornece um conjunto de métodos e funcionalidades que estão disponíveis para todas as classes em Java.

A classe Object é uma parte fundamental do sistema de tipos em Java e desempenha um papel importante na herança e na manipulação de objetos em Java. É importante notar que, embora todas as classes herdem da classe Object, você pode optar por substituir os métodos padrão da classe Object nas classes derivadas para personalizar o comportamento desses métodos para suas próprias classes.

### Visão geral da classe Object
[[Topo]](#)<br />

- **clone()**: É' usado para criar uma cópia superficial (shallow copy) de um objeto. Uma cópia superficial significa que ele cria um novo objeto que é uma cópia do objeto original, mas não copia recursivamente os objetos dentro do objeto original. Em vez disso, ele copia as referências para esses objetos internos, de modo que ambos, o objeto original e a cópia, compartilham os mesmos objetos internos.
- **equals(Object obj)**: Este método é usado para verificar se dois objetos são iguais. Por padrão, o método equals da classe Object compara os objetos com base em sua identidade de referência, ou seja, ele verifica se os dois objetos são a mesma instância na memória. No entanto, as classes derivadas geralmente sobrescrevem esse método para fornecer uma implementação personalizada de igualdade com base em critérios específicos.
- **finalize()**: Este método é chamado pelo coletor de lixo (garbage collector) quando o objeto está prestes a ser liberado da memória. Ele é usado para realizar ações de limpeza ou liberação de recursos antes que o objeto seja destruído. É importante observar que o uso do método finalize está em desuso, e é recomendado usar outras técnicas modernas de gerenciamento de recursos, como try-with-resources em Java.
- **getClass()**: Este método retorna um objeto Class que representa a classe do objeto em tempo de execução. Você pode usar este método para obter informações sobre a classe de um objeto, como seu nome.
- **hashCode()**: Este método retorna um valor inteiro que serve como um código hash para o objeto. O valor hash é frequentemente usado em estruturas de dados baseadas em hash, como tabelas de dispersão, para indexar objetos e melhorar o desempenho de pesquisas.
- **notify()**: Este método é usado para notificar uma única thread em espera que está aguardando em um objeto. Ele é usado em conjunção com os métodos wait() para implementar a sincronização entre threads.
- **notifyAll()**: Este método é semelhante ao notify(), mas notifica todas as threads em espera que estão aguardando em um objeto. Isso permite que várias threads sejam acordadas simultaneamente.
- **toString()**: Este método retorna uma representação de string do objeto. Por padrão, ele retorna uma representação que inclui o nome da classe e um identificador exclusivo do objeto. As classes derivadas geralmente substituem esse método para fornecer uma representação mais significativa do objeto em formato de string.
- **wait()**: Este método coloca a thread atual em espera até que outra thread chame o método notify() ou notifyAll() no mesmo objeto. Ele é usado para implementar sincronização entre threads.
- **wait(long timeout)**: Este método é semelhante ao wait(), mas permite que a thread atual aguarde por um período especificado em milissegundos antes de retomar a execução.
- **wait(long timeout, int nanos)**: Este método é uma variação do wait() que permite especificar um tempo limite com precisão de nanossegundos.

Esses são os métodos da classe Object em Java e sua descrição básica. Eles desempenham um papel fundamental na programação orientada a objetos e na manipulação de objetos em Java. Note que muitos desses métodos são frequentemente sobrescritos em classes derivadas para personalizar seu comportamento de acordo com as necessidades do programador.

### JNI - Java Native Interface
[[Topo]](#)<br />

JNI, que significa "Java Native Interface," é uma tecnologia que permite que código Java interaja com código escrito em linguagens de programação nativas, como C, C++, e Assembly. JNI é uma parte importante da plataforma Java, pois possibilita a integração de Java com sistemas nativos e a utilização de bibliotecas nativas em aplicativos Java.

A JNI é geralmente usada nas seguintes situações:

Acesso a bibliotecas nativas: Você pode usar a JNI para chamar funções de bibliotecas nativas escritas em C ou C++ diretamente do código Java. Isso é útil quando você precisa acessar recursos do sistema operacional, hardware específico ou bibliotecas de terceiros que não estão disponíveis em Java.

Melhorar o desempenho: Em alguns casos, escrever partes críticas de um aplicativo em linguagens nativas pode resultar em um melhor desempenho do que implementar essas partes em Java. A JNI permite que você faça essa integração de maneira eficiente.

Portabilidade de código existente: Se você já tem código nativo escrito em C ou C++ e deseja usá-lo em um aplicativo Java, a JNI oferece um meio de fazer isso sem precisar reescrever todo o código em Java.

O processo básico de uso da JNI envolve as seguintes etapas:

Escrever código nativo: Escrever código em uma linguagem nativa (como C ou C++) que contém as funções que você deseja chamar a partir do Java.

Gerar um arquivo de cabeçalho: Usar a ferramenta javah para gerar um arquivo de cabeçalho a partir das classes Java que precisam acessar as funções nativas.

Implementar as funções nativas: Implementar as funções nativas definidas no arquivo de cabeçalho usando código nativo.

Compilar e criar uma biblioteca compartilhada: Compilar o código nativo para criar uma biblioteca compartilhada (geralmente um arquivo .dll no Windows ou um arquivo .so no Linux) que pode ser carregada pelo Java.

Carregar e usar as funções nativas: No código Java, carregar a biblioteca compartilhada e usar a JNI para chamar as funções nativas.

É importante observar que o uso da JNI envolve preocupações de segurança, gerenciamento de memória e pode ser propenso a erros se não for usado corretamente. Portanto, é aconselhável usá-la com cuidado e somente quando necessário, já que o código nativo pode introduzir vulnerabilidades e complexidade adicionais em seu aplicativo Java.

### Palavra-chave native
[[Topo]](#)<br />

A palavra-chave "native" é uma palavra reservada em Java usada para indicar que um método é implementado em código nativo, ou seja, em uma linguagem de programação nativa, como C ou C++. Quando um método é declarado como "native" em Java, isso significa que a implementação real do método não está escrita em Java, mas em outra linguagem, e será fornecida externamente.

A palavra-chave "native" é usada em conjunto com a tecnologia JNI (Java Native Interface), que permite que o código Java interaja com código escrito em linguagens nativas. Para usar a JNI, você segue essas etapas:

- *Declare o método como "native"*: Em uma classe Java, você declara um método como "native" quando deseja que ele seja implementado em código nativo. A declaração pode ser assim:

```java
public native void metodoNativo();
```

- *Implemente o método em código nativo*: Depois de declarar um método como "native", você precisa implementá-lo em uma linguagem nativa, como C ou C++. A implementação real do método é feita fora do código Java, em um arquivo separado.
- *Use a JNI para carregar e chamar o método nativo*: No código Java, você usa a JNI para carregar a biblioteca compartilhada (que contém a implementação do método nativo) e chamar o método.

O uso de métodos nativos e a palavra-chave "native" é geralmente necessário em casos em que você deseja acessar recursos do sistema operacional, hardware específico ou bibliotecas de terceiros que não estão disponíveis em Java. No entanto, o uso de métodos nativos deve ser feito com cuidado, pois introduz complexidade e pode ser propenso a erros, como vazamentos de memória e problemas de segurança. Portanto, é recomendável usar métodos nativos apenas quando estritamente necessário e garantir que eles sejam implementados com atenção aos detalhes.

### Anotação @Deprecated
[[Topo]](#)<br />

A anotação @Deprecated é uma anotação em Java usada para marcar um elemento de código, como uma classe, método, campo ou construtor, como obsoleto ou desencorajado. Ela é usada para indicar que o elemento ainda está disponível e funcionando, mas não é recomendado o seu uso, pois pode ser removido em futuras versões ou tem uma alternativa melhor disponível.

A principal finalidade da anotação @Deprecated é fornecer informações aos desenvolvedores que estão usando o código, alertando-os de que o elemento marcado como obsoleto pode ser removido em versões futuras do software ou que há uma abordagem melhor recomendada para realizar a mesma tarefa.

```java
public class MinhaClasse {  
  // Método obsoleto marcado com @Deprecated
  @Deprecated
  public void metodoAntigo() {
    // Implementação do método antigo
  }
  
  public void novoMetodo() {
    // Implementação do novo método
  }
}
```

Neste exemplo, o método metodoAntigo() está marcado como obsoleto usando a anotação @Deprecated. Isso informa aos desenvolvedores que o uso desse método não é recomendado e que eles devem preferir o uso do método novoMetodo().

É importante observar que, mesmo que um elemento seja marcado como obsoleto, ele ainda está disponível e funcionando. No entanto, seu uso é desencorajado, e os desenvolvedores são incentivados a migrar para alternativas mais modernas e recomendadas.

Ao usar um elemento marcado como @Deprecated, os desenvolvedores podem ver um aviso ou mensagem de desencorajamento em suas ferramentas de desenvolvimento, como IDEs, para alertá-los sobre o uso desencorajado desse elemento. Isso ajuda a facilitar a transição suave para novas versões do software sem quebrar o código existente.
