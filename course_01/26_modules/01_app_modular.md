# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## 26.1. Aplicação modular
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [01_arquivos](./01_arquivos/)
- Projetos
  - [Projeto 1](./01_arquivos/proj_01/) [(iniciado em)](#módulos)
  - [Projeto 2](./01_arquivos/proj_02/) [(iniciado em)](#opções-da-linha-de-comando-usando-a-máquina-virtual-java-java)
- Conteúdo
 - [Módulos](#módulos)
 - [JSR 376 - Java Platform Module System](#jsr-376---java-platform-module-system)
 - [Tipos de módulos](#tipos-de-módulos)
 - [Descritor do módulo (module descriptor)](#descritor-do-módulo-module-descriptor)
 - [Diretivas](#diretivas)
 - [Opções da linha de comando usando a Máquina Virtual Java (java)](#opções-da-linha-de-comando-usando-a-máquina-virtual-java-java)
 - [Consumindo um serviço de outro módulo](#consumindo-um-serviço-de-outro-módulo)

### Módulos
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./01_arquivos/proj_01/)

No Java, os módulos são uma adição significativa introduzida no Java 9 como parte do Projeto Jigsaw. O sistema de módulos do Java, também conhecido como Plataforma de Módulos Java (Java Platform Module System - JPMS), visa proporcionar uma forma melhor de organizar e estruturar grandes aplicações e bibliotecas Java. Ele oferece um mecanismo para encapsulamento e gestão de dependências mais robusto do que era possível com os classpath e jars tradicionais.

#### Objetivos dos módulos

Os módulos no Java, foram criados com vários objetivos em mente, visando melhorar a maneira como os desenvolvedores organizam e mantêm grandes bases de código e bibliotecas. Os principais objetivos dos módulos Java são:

##### Encapsulamento forte

Um dos objetivos principais dos módulos Java é fornecer um encapsulamento mais forte do que era possível com os classpaths e jars. Antes dos módulos, a visibilidade pública significava que uma classe estava acessível globalmente, o que poderia levar a acoplamentos indesejados e ao uso inadvertido de APIs internas. Com os módulos, você pode controlar especificamente quais pacotes são expostos para outros módulos, protegendo o código interno e expondo apenas interfaces bem definidas.

##### Gerenciamento explícito de dependências

Os módulos permitem que os desenvolvedores declarem explicitamente as dependências de seus módulos. Isso significa que um módulo deve listar todos os outros módulos dos quais depende. Este modelo de dependência explícita melhora a integridade e a manutenção do sistema, tornando claro quais são as dependências e reduzindo a probabilidade de conflitos de versão e problemas semelhantes.

##### Melhoria na organização e manutenção do código

Os módulos encorajam uma separação mais clara e organizada do código em unidades lógicas. Isso facilita a manutenção, o entendimento e a reutilização do código. Com módulos, grandes sistemas podem ser decompostos em componentes mais gerenciáveis, cada um com seu próprio namespace e conjunto de dependências.

##### Construção de plataformas e aplicações mais leves

A modularização da própria plataforma Java permite que os desenvolvedores criem aplicações mais leves, incluindo apenas os módulos da plataforma que são necessários para a aplicação. Isso é especialmente vantajoso para dispositivos com recursos limitados e para otimizar o tempo de inicialização.

##### Segurança e estabilidade

Ao permitir um controle mais estrito sobre quais dependências estão incluídas e quais partes do código estão acessíveis, os módulos podem aumentar a segurança e a estabilidade das aplicações. A redução do uso acidental ou inseguro de APIs internas contribui para um código mais robusto e confiável.

##### Facilitar a evolução da plataforma java

Com a plataforma Java dividida em módulos, é mais fácil para os desenvolvedores da plataforma evoluir partes específicas da API sem afetar outras partes. Isso também ajuda na introdução de novos recursos e na depreciação de APIs antigas de maneira mais controlada.

#### Benefícios dos módulos

Os módulos no Java, trazem vários benefícios significativos para o desenvolvimento de software, especialmente para grandes projetos e sistemas. Aqui estão alguns dos principais benefícios:

##### Encapsulamento e ocultação de implementações internas

Os módulos permitem um encapsulamento mais efetivo do código. Eles possibilitam que você exponha apenas as partes necessárias de um módulo para o uso externo (por meio de `exports`), enquanto mantém outras partes internas ocultas. Isso reduz o risco de uso indevido de classes internas por consumidores externos, aumenta a segurança e mantém o design limpo e claro.

##### Gerenciamento de dependências explícito e confiável

Com módulos, as dependências entre diferentes partes do sistema são declaradas explicitamente no arquivo `module-info.java`. Isso torna as dependências mais fáceis de entender e gerenciar, reduzindo a possibilidade de conflitos de dependências e problemas relacionados a versões incompatíveis.

##### Facilita a manutenção e escalabilidade de grandes aplicações

Em grandes aplicações, manter o código organizado e gerenciável pode ser um desafio. Os módulos ajudam a dividir o sistema em componentes mais gerenciáveis e menos acoplados. Isso facilita a manutenção, compreensão e escalabilidade da aplicação.

##### Melhor desempenho de tempo de execução e tempo de inicialização

Com a possibilidade de incluir apenas os módulos necessários para uma aplicação, o tamanho do runtime pode ser significativamente reduzido. Isso pode levar a um melhor desempenho, especialmente em termos de tempo de inicialização e consumo de memória.

##### Facilita a evolução da plataforma java

A modularização da própria Plataforma Java (JDK) significa que os desenvolvedores podem agora escolher incluir apenas os módulos do JDK que são relevantes para sua aplicação. Isso não só reduz o tamanho da aplicação, mas também ajuda a plataforma Java a evoluir de forma mais flexível e modular.

##### Segurança aumentada

Ao limitar o acesso a certas partes do código (por exemplo, classes internas ou utilitárias), os módulos podem aumentar a segurança de uma aplicação. Isso é especialmente importante em ambientes onde a segurança é uma grande preocupação.

##### Interoperabilidade com bibliotecas e frameworks

Os módulos facilitam a interoperabilidade com outras bibliotecas e frameworks, especialmente aqueles que também utilizam o sistema de módulos. Isso pode simplificar a integração de diferentes componentes de software em uma aplicação maior.


#### Estrutura de um módulo

Um módulo Java é essencialmente uma coleção de pacotes Java, mas com um arquivo de definição de módulo especial chamado `module-info.java`. Este arquivo define o nome do módulo, os pacotes que expõe e as dependências de outros módulos. 
```java
module my.module {
  requires another.module;
  exports my.module.package;
}
```

Neste exemplo:
- `my.module` é o nome do módulo.
- `requires another.module;` indica que este módulo depende de `another.module`.
- `exports my.module.package;` significa que `my.module.package` é um pacote público que outros módulos podem usar.

#### Considerações

A introdução de módulos foi uma mudança significativa no ecossistema Java e, embora ofereça muitos benefícios, também pode requerer uma curva de aprendizado para desenvolvedores acostumados ao modelo tradicional de classpath e jars. A modularização de uma aplicação Java existente pode exigir uma reestruturação significativa do código e dependências, mas para novos projetos, especialmente aqueles de grande escala, os módulos podem oferecer uma gestão de dependências e um encapsulamento muito melhores.

### JSR 376 - Java Platform Module System
[[Topo]](#)<br />

O JSR 376, ou Java Specification Request 376, é o documento formal que descreve a especificação do Java Platform Module System (JPMS), introduzido no Java 9. Este sistema de módulos representa uma mudança significativa na arquitetura e organização do código Java, visando melhorar a escalabilidade, manutenção e performance das aplicações Java, especialmente as de grande porte.

#### Principais aspectos

##### Modularidade no núcleo do Java

O JPMS introduz a modularidade no coração da plataforma Java, reestruturando o próprio JDK em módulos. Isso permite que aplicações e bibliotecas sejam construídas e estruturadas de maneira modular, com dependências claramente definidas e um melhor controle de visibilidade.

##### Encapsulamento e controle de acesso

Um dos objetivos principais do JPMS é fornecer um mecanismo para encapsular classes internas e pacotes dentro de um módulo. Isso é feito através da declaração de quais pacotes um módulo "exporta" para outros módulos. Pacotes não exportados permanecem inacessíveis para outros módulos, melhorando o encapsulamento e a integridade do design.

##### Gerenciamento de dependências

Com o sistema de módulos, as dependências entre módulos são declaradas explicitamente. Isso significa que cada módulo especifica quais outros módulos ele requer para funcionar. Essa abordagem elimina muitos dos problemas associados com o classpath, como conflitos de versões e dependências implícitas.

##### Arquivo module-info.java

Cada módulo Java contém um arquivo `module-info.java` na sua raiz, que define o nome do módulo, os pacotes que ele exporta e os módulos dos quais depende. Este arquivo é o coração do módulo e serve como a base para o sistema de módulos entender como os diferentes módulos interagem.

##### Facilidade de uso e desempenho

O sistema de módulos foi projetado para ser fácil de usar e para melhorar o desempenho das aplicações Java. Por exemplo, ao reduzir o número de classes carregadas na memória, o JPMS pode reduzir o tempo de inicialização das aplicações.

##### Refatoração do JDK

O próprio JDK foi refatorado em módulos como parte da implementação do JPMS. Isso significa que os desenvolvedores agora podem criar aplicações Java que utilizam apenas os módulos necessários, resultando em aplicações mais leves e eficientes.

O JSR 376 e a introdução do Java Platform Module System representam uma evolução importante na plataforma Java. Eles oferecem melhor controle de encapsulamento, um sistema de gerenciamento de dependências mais robusto e a habilidade de construir aplicações Java mais eficientes e bem-organizadas. Embora introduza uma nova complexidade, especialmente para projetos existentes que precisam ser migrados para o novo sistema, os benefícios a longo prazo em termos de manutenção e desempenho são significativos.

### Tipos de módulos
[[Topo]](#)<br />

No Java, com a introdução do Java Platform Module System (JPMS) no Java 9, os módulos são classificados em diferentes tipos com base em suas características e usos. Esses tipos de módulos ajudam a organizar o código e a plataforma Java de uma maneira mais modular e flexível. Os principais tipos de módulos no Java são:

#### Módulos de sistema (platform/system modules)

Estes são os módulos que compõem o próprio JDK. Com o Java 9 e versões posteriores, o JDK foi dividido em vários módulos (como `java.base`, `java.sql`, etc.), permitindo que aplicações usem apenas as partes necessárias do JDK, tornando-as mais leves e eficientes.

#### Módulos regulares (named/application modules)

Estes são os módulos padrão que você cria e define com um arquivo `module-info.java`. Eles têm um nome explícito e podem declarar explicitamente suas dependências em outros módulos, bem como os pacotes que exportam. Exemplo:

```java
module my.module {
  requires java.sql;
  exports com.mycompany.mymodule;
}
```

Neste exemplo, `my.module` é um módulo nomeado que depende do módulo `java.sql` e exporta o pacote `com.mycompany.mymodule`.

#### Módulos automáticos (automatic modules)

Os módulos automáticos são uma ponte entre o mundo dos JARs sem módulos e o novo mundo dos módulos Java. Quando você coloca um JAR de arquivo regular (sem `module-info.java`) no caminho do módulo, ele se torna um módulo automático. Seu nome é derivado do nome do arquivo JAR. Esses módulos têm acesso a todos os outros módulos e todos os pacotes não-modulares no classpath. Eles são usados principalmente para facilitar a migração gradual para o sistema de módulos.

#### Módulos não nomeados (unnamed modules)

Quando um código é executado no classpath (o caminho clássico usado antes do Java 9), ele é considerado parte de um módulo não nomeado. Esse tipo de módulo pode acessar todos os outros módulos não nomeados e módulos automáticos, mas não módulos nomeados explícitos. Este conceito é crucial para a compatibilidade com código Java legado que ainda não foi migrado para o sistema de módulos.

A introdução desses diferentes tipos de módulos permite uma maior flexibilidade no desenvolvimento de aplicações Java, facilitando tanto a migração para o novo sistema de módulos quanto a criação de aplicações mais modulares e eficientes. Cada tipo de módulo tem seu propósito e uso, dependendo da necessidade de compatibilidade com sistemas legados, do processo de migração e da estruturação da aplicação.

### Descritor do módulo (module descriptor)
[[Topo]](#)<br />

O "module descriptor" no Java, geralmente referido como o arquivo `module-info.java`, é um componente central do sistema de módulos introduzido no Java 9 com o Projeto Jigsaw. Este arquivo desempenha um papel crucial na definição das características e comportamentos de um módulo dentro do Java Platform Module System (JPMS).

#### Importância do Module Descriptor

- **Encapsulamento e modularidade**: O `module-info.java` é fundamental para o encapsulamento apropriado e a modularidade no Java, permitindo que os desenvolvedores controlem explicitamente o que é exposto e o que é ocultado dentro de um módulo.
- **Gerenciamento de dependências**: Ele oferece uma forma declarativa e robusta de gerenciar dependências entre módulos, o que ajuda a evitar conflitos e problemas de dependência.
- **Facilita a manutenção e escalabilidade**: Com um sistema de módulos bem definido, grandes projetos se tornam mais fáceis de manter e escalar.
- **Melhora na performance**: Com a capacidade de especificar dependências e exportações, o sistema de módulos pode potencialmente melhorar o desempenho das aplicações, reduzindo o tempo de inicialização e o uso de memória.

Em resumo, o `module-info.java` é um pilar do sistema de módulos no Java, estabelecendo as fundações para a construção de aplicações Java mais modularizadas e eficientes. Através deste arquivo, os desenvolvedores podem criar módulos bem definidos e autônomos com dependências claras, o que é fundamental para a gestão eficaz de projetos de software de grande escala.
 
### Diretivas
[[Topo]](#)<br />

No Java, as diretivas dos módulos são utilizadas no arquivo `module-info.java` para definir como um módulo específico interage com outros módulos no sistema. Estas diretivas são essenciais para controlar a visibilidade, as dependências e os serviços oferecidos e consumidos por um módulo. As principais diretivas de módulos no Java são:

#### requires

- **Uso**: Indica que o módulo depende de outro módulo para funcionar.
- **Exemplo**: `requires java.sql;`
- **Descrição**: Ao usar `requires`, você especifica que seu módulo precisa de acesso às classes públicas do módulo especificado. Esta é uma forma de declarar dependência.

#### exports

- **Uso**: Especifica quais pacotes dentro do módulo estão disponíveis para outros módulos.
- **Exemplo**: `exports com.myapp.utils;`
- **Descrição**: Se um módulo precisa expor certas classes ou interfaces para uso por outros módulos, ele usa a diretiva `exports`. Pacotes não exportados permanecem encapsulados dentro do módulo.

#### opens

- **Uso**: Semelhante a `exports`, mas também permite o acesso em tempo de execução para reflexão.
- **Exemplo**: `opens com.myapp.internal;`
- **Descrição**: Usado principalmente para frameworks que usam reflexão, como bibliotecas de serialização/desserializaçãopens` permite um acesso mais amplo do que `exports`

#### requires transitive

- **Uso**: Propaga a dependência a módulos consumidores.
- **Exemplo**: `requires transitive java.xml;`
- **Descrição**: Se o módulo A `requires transitive` o módulo B, e o módulo C requer o módulo A, então o módulo C automaticamente requer o módulo B também.

#### uses

- **Uso**: Indica que o módulo consome um serviço definido em outro módulo.
- **Exemplo**: `uses com.myapp.service.MyService;`
- **Descrição**: Utilizado em combinação com o mecanismo de ServiceLoader para indicar que o módulo utiliza um serviço específico.

#### provides ... with ...

- **Uso**: Indica que o módulo oferece uma implementação de um serviço.
- **Exemplo**: `provides com.myapp.service.MyService with com.myapp.service.impl.MyServiceImpl;`
- **Descrição**: Usado para definir que o módulo fornece uma implementação (`MyServiceImpl`) de uma interface de serviço (`MyService`).

Essas diretivas oferecem um alto grau de controle sobre como os módulos interagem entre si, permitindo um encapsulamento mais efetivo, um gerenciamento claro de dependências e uma arquitetura modular robusta. Ao utilizar estas diretivas corretamente no arquivo `module-info.java`, os desenv

olvedores podem criar sistemas modulares bem estruturados que são mais fáceis de manter, escalar e evoluir ao longo do tempo.

### Opções da linha de comando usando a Máquina Virtual Java (java)
[[Topo]](#)<br />

- Ver projeto: [Projeto 2](./01_arquivos/proj_02/)

No Java, com a introdução do sistema de módulos no Java 9, foram adicionadas várias opções de linha de comando específicas para trabalhar com módulos. Essas opções permitem controlar o comportamento do sistema de módulos durante a compilação e a execução de aplicações Java. Aqui estão algumas das opções de linha de comando mais importantes relacionadas a módulos no Java:

- **--module ou -m**
  - Executa o módulo principal especificado.
  - Exemplo: `java --module my.module/my.module.MainClass`
- **--module-path** ou **-p**
  - Define o caminho do módulo para a execução.
  - Exemplo: `java --module-path moduledir -m my.module/my.module.MainClass`
- **--add-reads**
  - Permite que um módulo leia outro módulo.
  - Exemplo: `java --add-reads my.module=java.sql ...`
- **--add-exports**
  - Exporta pacotes de um módulo para outro.
  - Exemplo: `java --add-exports java.base/java.lang=ALL-UNNAMED ...`
- **--add-opens**
  - Abre pacotes de um módulo para outro, principalmente para reflexão.
  - Exemplo: `java --add-opens java.base/java.lang=ALL-UNNAMED ...`
- **--add-modules**
  - Adiciona módulos específicos ao gráfico de módulos.
  - Exemplo: `java --add-modules java.xml,my.module ...`
- **--list-modules**
  - Lista todos os módulos disponíveis.
  - Exemplo: `java --list-modules`
- **--patch-module**
  - Permite a você modificar os conteúdos sem alterar o arquivo JAR original do módulo. Isto é particularmente útil para testes ou temporariamente substituir classes dentro de um módulo durante o desenvolvimento
  - Exemplo: `java --patch-module my.module=/path/to/patched/classes ...`
- **--illegal-access**
  - Controla o acesso das APIs nos módulos Java que são marcados como private ou internos mas são acessados por reflexão por bibliotecas ou aplicações que não foram explicatamente permitidas o acesso.
    - `permit`: Permite todas as operações ilegais de acesso reflexivo. Isso significa que qualquer acesso reflexivo a membros não exportados de módulos é permitido sem quaisquer avisos ou erros. Útil quando você tem certeza sobre a segurança dessas operações e não quer ser notificado sobre elas.
    - `warn`: Permite o acesso reflexivo ilegal, mas emite um aviso na primeira vez que uma operação de acesso ilegal é realizada para cada pacote distinto. Normalmente usado durante o período de transição para identificar e corrigir acessos ilegais sem quebrar a aplicação.
    - `debug`: Permite o acesso reflexivo ilegal, fornecendo informações detalhadas sobre cada operação de acesso ilegal. É mais detalhada do que warn e inclui informações adicionais úteis para fins de depuração. Ideal para ambientes de desenvolvimento onde os desenvolvedores precisam de insights detalhados para corrigir acessos ilegais.
    - `deny`: Esta opção desabilita completamente qualquer operação de acesso reflexivo ilegal. Qualquer tentativa de realizar tal operação resultará em uma IllegalAccessException. Esta é a configuração mais restritiva e garante que nenhum acesso ilegal seja possível, aumentando a segurança e o encapsulamento dos módulos. Deve ser a configuração alvo para aplicações que estão totalmente migradas para o sistema de módulos.
    - No Java 9 e 10, o modo padrão era `permit`, que permite o acesso por reflection mas causa um aviso na primeira vez que o acesso ocorre para cada pacote.
    - No Java 11 e posterior, o modo padrão foi alterado para `deny`, o que bloqueia o acesso por reflection para as APIs internas por padrão, mas pode ser sobrescrito.
  - Exemplo: `java --illegal-access=warn ...`
      










### Consumindo um serviço de outro módulo
[[Topo]](#)<br />

O Service Locator é um padrão de design que é usado para localizar serviços através de uma interface comum. Neste exemplo, criaremos um serviço de descoberta básico que mapeia interfaces a implementações concretas. 

#### Estrutura do projeto

- `core-module` (contém o Service Locator e interfaces de serviço)
  - `IService.java` (interface do serviço)
  - `ServiceLocator.java` (localizador de serviços)
- `service-module`
  - `MeuServico.java` (implementação do serviço)
- `client-module`
  - `Cliente.java` (cliente que usa o serviço)

#### Core module

Este módulo define as interfaces e o Service Locator.

**IService.java**:

```java
public interface IService {
  String execute();
}
```

#### Service module

Este módulo implementa a interface `IService`.

**MeuServico.java**:

```java
public class MeuServico implements IService {
  @Override
  public String execute() {
    return "Serviço Executado!";
  }
}
```

**META-INF/services/IService**:

```
MeuServico
```

Este arquivo de texto simples deve estar no diretório META-INF/services do classpath do módulo de serviço e conter o nome completamente qualificado da classe que implementa IService.

#### Client Module
Este módulo consome o serviço através do Service Locator.

**Cliente.java**:

```java
public class Cliente {
  public static void main(String[] args) {
    ServiceLoader<IService> serviceLoader = ServiceLoader.load(IService.class);

    for (IService service : serviceLoader) {
      System.out.println(service.execute());
    }
  }
}
```

#### Observações

- **Registro e descoberta de serviços**: O `ServiceLocator` registra os serviços e permite que os clientes os descubram. Esta é uma forma básica de descoberta de serviço.
- **Acoplamento**: Este método acopla o cliente ao `ServiceLocator`. Em sistemas mais complexos, você pode querer usar mecanismos de injeção de dependência para reduzir o acoplamento.
- **Exceções**: O código não inclui tratamento de exceções para casos em que um serviço não está registrado. Isso deve ser tratado em uma implementação real.
- **Escalabilidade e manutenção**: Para projetos maiores e mais complexos, um framework como Spring pode oferecer uma abordagem mais robusta e menos propensa a erros com recursos avançados de gerenciamento de serviços.
