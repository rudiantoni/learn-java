# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## 27.2. Java Core parte 1: Perguntas e respostas
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Conteúdo
  - [Perguntas e respostas](#perguntas-e-respostas)

### Perguntas e respostas
[[Topo]](#)<br />

**COMO O JRE, JVM E JDK SÃO DIFERENTES?**

- JRE, abreviado - para fazer a aplicação Java funcionar. Java Runtime Environment (JRE) - a implementação mínima da máquina virtual necessária para executar aplicações Java sem um compilador e outras ferramentas de desenvolvimento. Consiste em uma máquina virtual - Java Virtual Machine e uma biblioteca de classes Java.
- JDK, abreviado - para programação. Java Development Kit (JDK) é um kit de desenvolvimento de aplicações Java gratuito distribuído pela Oracle Corporation (anteriormente Sun Microsystems), que inclui o compilador Java (javac), bibliotecas de classes Java padrão, exemplos, documentação, várias utilidades e o ambiente de execução Java (JRE).
- JVM, abreviado - máquina virtual Java. Java Virtual Machine - a parte principal do sistema de execução Java, o chamado Java Runtime Environment (JRE). A Java Virtual Machine interpreta o Java Bytecode previamente gerado a partir do código-fonte do programa Java pelo compilador Java (javac). A JVM também pode ser usada para executar programas escritos em outras linguagens de programação.

**DESCREVA OS MODIFICADORES DE ACESSO EM JAVA**

Java tem os seguintes modificadores de acesso:

- private: (usado em construtores, classes internas, métodos e campos de classe) - O acesso é permitido apenas na classe atual.
- default (package-private): (usado em classes, construtores, interfaces, classes internas, métodos e campos de classe) - Acesso no nível do pacote. Se a classe é declarada assim, ela só estará disponível dentro do pacote.
- protected: (usado em construtores, classes internas, métodos e campos de classe) Um modificador de acesso no nível do pacote e na hierarquia de herança.
- public: (usado em classes, construtores, interfaces, classes internas, métodos e campos de classe) - Modificador de acesso público, disponível para todos.

A sequência de modificadores em ordem decrescente de nível de privacidade: private, default, protected, public.

**COMO UMA CLASSE ABSTRATA DIFERE DE UMA INTERFACE? QUANDO VOCÊ USARIA UMA CLASSE ABSTRATA E QUANDO USARIA A INTERFACE?**

Uma classe abstrata é uma classe que é marcada como "abstract" e pode ou não conter métodos abstratos. Uma instância de uma classe abstrata não pode ser instanciada. Uma classe que herda de uma classe abstrata pode ou não implementar métodos abstratos. Caso a classe filha não implemente todos os métodos abstratos, então ela também deve ser abstrata. Além disso, se a classe herdeira sobrescrever o método implementado na classe abstrata pai, ele pode ser sobrescrito com o modificador abstract! Ou seja, abandonar a implementação. Consequentemente, esta classe também deve ser abstrata.

Quanto à interface, ela contém apenas métodos abstratos e constantes, isso era o caso antes do lançamento do Java 8. A partir do Java 8, além de métodos abstratos, também podemos usar métodos padrão (default methods) e métodos estáticos (static methods) em interfaces.

Um método padrão em uma interface é um método em uma interface com lógica padrão que não é obrigatória para ser definida na implementação dessa interface.

Métodos estáticos em uma interface são essencialmente os mesmos que métodos estáticos em uma classe abstrata.

Ao implementar uma interface, uma classe deve implementar todos os métodos da interface. Caso contrário, a classe deve ser marcada como abstrata. Uma interface também pode conter classes internas. E nenhum método abstrato nelas.

Além disso, sempre lembre que você pode estender apenas uma classe em Java, mas pode implementar múltiplas interfaces.

O que usar: Interface ou Classe Abstrata?

Uma classe abstrata é usada quando precisamos de algum tipo de implementação padrão. Uma interface é usada quando uma classe precisa especificar um comportamento específico. Muitas vezes, uma interface e uma classe abstrata são combinadas, ou seja, implementar uma interface em uma classe abstrata para especificar o comportamento e implementação padrão.

**UM OBJETO PODE ACESSAR UMA VARIÁVEL DE CLASSE PRIVADA? SE SIM, COMO?**

Em geral, uma variável de classe privada só pode ser acessada dentro da classe na qual é declarada. Variáveis privadas também podem ser acessadas através da API de Reflexão Java.

**É POSSÍVEL SOBRECARREGAR UM MÉTODO ESTÁTICO?**

Métodos estáticos podem ser sobrecarregados por métodos não estáticos e vice-versa - sem restrições. Mas não há ponto em sobrescrever um método estático.

**FALE SOBRE CLASSES INTERNAS. QUANDO VOCÊ AS USARÁ?**

Uma classe interna é uma classe que existe dentro de uma classe ou interface. Ao fazer isso, ela ganha acesso a todos os campos e métodos de sua classe externa.

Para que pode ser usada? Por exemplo, para fornecer alguma lógica de classe adicional e encapsulá-la. Embora o uso de classes internas complique o programa, é recomendado evitar seu uso.

**QUAL É A DIFERENÇA ENTRE UMA VARIÁVEL DE INSTÂNCIA E UMA VARIÁVEL ESTÁTICA? DÊ UM EXEMPLO**

Variáveis estáticas são inicializadas quando a classe é carregada pelo classloader e não dependem do objeto. Uma variável de instância é inicializada quando a classe é criada.

Exemplo: Por exemplo, precisamos de uma variável global para todos os objetos de uma classe, como o número de visitas de usuários a um artigo específico na Internet. Cada vez que um artigo é visitado, um novo objeto é criado e a variável de visitas é incrementada. A variável de visitas é uma variável estática que permanece a mesma para todas as instâncias da mesma classe.

**QUAL É A DIFERENÇA ENTRE UMA VARIÁVEL DE INSTÂNCIA E UMA VARIÁVEL ESTÁTICA? DÊ UM EXEMPLO**

Variáveis estáticas são inicializadas quando a classe é carregada pelo carregador de classes e não dependem do objeto. Uma variável de instância é inicializada quando o objeto da classe é criada.

Exemplo: Por exemplo, precisamos de uma variável global para todos os objetos de uma classe, como o número de visitas dos usuários a um artigo específico na Internet. Cada vez que um artigo é visitado, um novo objeto é criado e a variável de visitas é incrementada. A variável de visitas é uma variável estática que permanece a mesma para todas as instâncias da mesma classe.

**FALE SOBRE CARREGADORES DE CLASSE E SOBRE O CARREGAMENTO DINÂMICO DE CLASSES**

Qualquer classe usada em um programa Java de alguma forma foi carregada no contexto do programa por algum tipo de carregador. Todas as máquinas virtuais Java incluem pelo menos um carregador de classe, o chamado carregador base. Ele carrega todas as principais classes, que são as classes do arquivo rt.jar. É interessante notar que esse carregador não está relacionado ao programa de forma alguma, ou seja, não podemos obter o nome do carregador de java.lang.Object, por exemplo, o método getClassLoader() retornará null para nós.

O próximo carregador é o carregador de extensão, que carrega classes de $JAVA_HOME/lib/ext.

Em seguida, na hierarquia, está o carregador do sistema, que carrega as classes cujo caminho é especificado na variável classpath. Por exemplo, digamos que temos uma classe personalizada MyClass e a usamos. Como ela é carregada...

Primeiro, o carregador do sistema tenta encontrá-la em seu cache de carregamento; se encontrada, a classe é carregada com sucesso, caso contrário, o controle de carregamento é transferido para o carregador de extensão, que também verifica seu cache de carregamento e, se não for bem-sucedido, transfere a tarefa para o carregador base. Este verifica o cache e, em caso de falha, tenta baixá-la; se o download for bem-sucedido, o carregamento está completo. Se não, ele transfere o controle para o carregador de extensão. O carregador de extensão tenta carregar a classe e, se falhar, passa essa tarefa para o carregador do sistema. O carregador do sistema tenta carregar a classe e, se falhar, uma exceção java.lang.ClassNotFoundException é lançada.

É assim que funciona o carregamento de classes em Java. A chamada delegação de carregamento.

Se houver carregadores personalizados no sistema, eles devem ser herdados da classe java.lang.ClassLoader.

**O QUE É CARREGAMENTO ESTÁTICO E O QUE É CARREGAMENTO DINÂMICO DE CLASSES?**

O carregamento estático de classes ocorre ao usar o operador "new".

O carregamento dinâmico ocorre "em tempo de execução" durante a execução do programa usando o método estático da classe Class.forName(nome da classe). 

Para que serve o carregamento dinâmico? Por exemplo, não sabemos qual classe precisamos e tomamos uma decisão durante a execução do programa, passando o nome da classe para o método estático forName().
