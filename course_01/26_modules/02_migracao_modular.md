# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## 26.2. Migração para uma aplicação modular
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Conteúdo
  - [Algoritmo de migração](#algoritmo-de-migração)
  - [jdeps - Java Class Dependency Analyzer](#jdeps---java-class-dependency-analyzer)
  - [jdeprscan - Java Deprecated API Scanner](#jdeprscan---java-deprecated-api-scanner)
  - [Estratégias de migração](#estratégias-de-migração)
  - [Migração top-down](#migração-top-down)
  - [Migração bottom-up](#migração-bottom-up)

### Algoritmo de migração
[[Topo]](#)<br />

Migrar uma aplicação Java não modular para uma modular, especialmente em relação ao sistema de módulos introduzido no Java 9, é um processo que envolve várias etapas. O objetivo é transformar uma aplicação que utiliza classpath em uma que utiliza modulepath, aderindo ao sistema de módulos do Java. Aqui está um algoritmo básico e uma lista de passos para essa migração:

- **Análise da base de código existente**
  - Analisar a estrutura atual do projeto.
  - Identificar as dependências externas e internas.
  - Verificar a compatibilidade das dependências com o sistema de módulos do Java.
- **Estruturação inicial em módulos**
  - Definir um módulo candidato para cada JAR ou conjunto de pacotes relacionados.
  - Criar um `module-info.java` básico para cada módulo candidato, declarando explicitamente suas dependências.
- **Refatoração para reduzir acoplamentos**
  - Remover ou reduzir dependências cíclicas entre módulos.
  - Refatorar o código para respeitar os limites do módulo, movendo classes se necessário.
- **Adicionar declarações de módulo**
  - Completar os arquivos `module-info.java` com `requires`, `exports`, `opens`, `uses`, e `provides` conforme necessário.
  - Garantir que todos os módulos e dependências sejam corretamente declarados.
- **Testes e ajustes**
  - Testar cada módulo individualmente.
  - Ajustar as declarações de módulo e refatorações conforme necessário para resolver problemas de compilação e execução.
- **Integração e testes de sistema**
  - Testar a aplicação como um todo para garantir que todos os módulos estão interagindo corretamente.
  - Validar o funcionamento com relação a recursos como reflexão e serviços dinâmicos que podem ser afetados pelo sistema de módulos.
- **Otimização e melhorias**
  - Otimizar a configuração de módulos para melhor desempenho e facilidade de manutenção.
  - Considerar a criação de módulos automáticos para dependências que ainda não são módulos.
- **Documentação e manutenção**
  - Atualizar a documentação do projeto para refletir a nova estrutura modular.
  - Estabelecer práticas de manutenção que respeitem os limites e regras dos módulos.

#### Considerações importantes

- **Compatibilidade**: Certifique-se de que todas as ferramentas e bibliotecas usadas sejam compatíveis com o sistema de módulos do Java.
- **Iterativo vs. Big Bang**: A migração pode ser feita de forma iterativa, módulo por módulo, ou de uma só vez (abordagem Big Bang). A abordagem iterativa é geralmente mais gerenciável.

#### Recursos úteis

- **Ferramentas de análise**: Utilize ferramentas como `jdeps` para analisar dependências e facilitar a criação de `module-info.java`.
- **Documentação oficial**: A documentação do JDK para módulos é um recurso vital.
- **Comunidade e exemplos**: Buscar exemplos de projetos que já passaram por essa migração pode oferecer insights valiosos.

Lembre-se de que a migração para um sistema modular pode ser complexa, dependendo da estrutura e tamanho da aplicação. A abordagem incremental, focando em um módulo de cada vez, pode ajudar a gerenciar a complexidade e identificar problemas específicos mais facilmente.


#### Resumo

- Crie um conjunto confiável de testes
- Identifique os objetivos da nossa migração e meça-os
- Baixe a versão atualizada do JDK
- Execute o aplicativo com o novo JDK
- Atualize dependências de terceiros, se necessário
- Identifique dependências dentro do projeto - Execute jdeps no seu projeto
- Identifique a API obsoleta - execute o jdeprscan no seu projeto
- Selecione estratégia de migração
- Execute de migração
- Teste de regressão
- Meça os resultados para confirmar que os objetivos da migração foram alcançados

### jdeps - Java Class Dependency Analyzer
[[Topo]](#)<br />

A ferramenta `jdeps` é o Analisador de Dependência de Classes Java que vem com o JDK (Java Development Kit). É uma ferramenta de linha de comando usada principalmente para analisar dependências de bytecode em aplicativos e bibliotecas Java. A introdução do sistema de módulos no Java 9 aumentou a importância do `jdeps`, tornando-o uma ferramenta valiosa para migrar aplicações para o novo sistema modular. Vamos explorar suas funcionalidades e usos.

#### Funções principais do jdeps

- **Analisar dependências de classes e pacotes**
  - `jdeps` analisa arquivos `.class` e `.jar` para determinar dependências entre classes e pacotes.
  - Ele pode identificar quais pacotes e classes são usados por uma classe ou pacote específico.
- **Identificar uso de APIs internas do JDK**
  - A ferramenta pode detectar o uso de APIs internas do JDK que não fazem parte da API pública e podem ser removidas ou alteradas em versões futuras do JDK.
- **Auxiliar na migração para módulos**
  - `jdeps` é útil para analisar aplicativos não modulares (baseados em classpath) e identificar como eles podem ser divididos em módulos.
  - Pode gerar sugestões automáticas para `module-info.java`, facilitando a criação de definições de módulo para aplicações existentes.
- **Relatório de dependências**
  - Gera relatórios detalhados sobre as dependências, incluindo dependências transitivas.
- **Análise de nível de pacote e classe**
  - Permite análise em diferentes níveis, como pacote ou classe, para fornecer uma visão detalhada das dependências.

#### Usos comuns

- **Preparação para modularização**: Antes de converter uma aplicação para usar o sistema de módulos do Java, `jdeps` pode ser usado para entender as dependências existentes e planejar a divisão em módulos.
- **Manutenção e refatoração**: Auxilia no entendimento das dependências internas e externas do projeto, o que é crucial durante a manutenção e refatoração do código.
- **Análise de compatibilidade**: Ajuda a verificar a compatibilidade das bibliotecas com diferentes versões do Java, especialmente útil durante a atualização do JDK.

#### Como usar

Para usar o `jdeps`, você pode executá-lo a partir da linha de comando, passando o arquivo `.class` ou `.jar` como argumento. Por exemplo:

```shell
jdeps MeuAplicativo.jar
```

Isso fornecerá um relatório das dependências do arquivo `MeuAplicativo.jar`.

#### Considerações

- **Atualizações do JDK**: Como o `jdeps` é parte do JDK, suas funcionalidades podem ser ampliadas ou alteradas em novas versões do JDK. É importante estar atento às mudanças para tirar o máximo proveito da ferramenta.
- **Uso em projetos complexos**: Em projetos grandes e complexos, a análise de dependências pode se tornar complicada, mas o `jdeps` fornece opções para filtrar e focar em aspectos específicos das dependências, facilitando a gestão.
- **Interpretação de resultados**: A habilidade de interpretar corretamente os resultados fornecidos pelo `jdeps` é crucial. Entender as dependências e como elas afetam a modularização é fundamental para um processo de migração bem-sucedido.

Em resumo, o `jdeps` é uma ferramenta essencial no ecossistema Java para análise de dependências, especialmente útil para a transição para um design modular de aplicativos. Ele ajuda os desenvolvedores a entenderem melhor a estrutura de dependência do seu código e a planejar refatorações e modularizações de forma mais informada.

### jdeprscan - Java Deprecated API Scanner
[[Topo]](#)<br />

`jdeprscan`, abreviação de Java Deprecated API Scanner, é uma ferramenta de linha de comando fornecida com o Java Development Kit (JDK), introduzida na versão 9 do Java. Seu objetivo principal é ajudar os desenvolvedores a identificar o uso de APIs Java que foram marcadas como obsoletas ou que estão programadas para remoção em futuras versões do JDK.

#### Funções principais do jdeprscan

- **Identificação de APIs obsoletas**
  - A ferramenta analisa os arquivos `.class` e `.jar` de uma aplicação para encontrar usos de APIs que estão marcadas como obsoletas (`@Deprecated`) no JDK.
- **Relatórios de uso de APIs descontinuadas**
  - `jdeprscan` gera relatórios detalhando onde essas APIs obsoletas são usadas no código. Isso ajuda os desenvolvedores a entender quais partes do código precisam de atualização ou refatoração.
- **Foco na compatibilidade futura**
  - Ao identificar APIs obsoletas, o `jdeprscan` ajuda a garantir que o código seja compatível com futuras versões do Java, já que o uso de APIs descontinuadas pode levar a problemas de compatibilidade quando se atualiza para uma nova versão do JDK.

#### Usos comuns

- **Preparação para atualizações do JDK**: Antes de atualizar um projeto para uma nova versão do Java, `jdeprscan` pode ser usado para garantir que o código não dependa de APIs que foram removidas ou que estão programadas para remoção.
- **Manutenção de código**: Regularmente verificar o código com `jdeprscan` pode ajudar a manter o código limpo e atualizado, evitando a acumulação de dependências em APIs obsoletas.

#### Como usar

Para usar o `jdeprscan`, você pode executá-lo a partir da linha de comando, passando o arquivo `.class` ou `.jar` como argumento. Por exemplo:

```shell
jdeprscan --class-path MeuAplicativo.jar
```

Isso fornecerá um relatório de usos de APIs obsoletas no arquivo `MeuAplicativo.jar`.

#### Considerações

- **acompanhar mudanças no JDK**: É importante estar ciente das mudanças nas APIs do Java, especialmente aquelas marcadas para obsolescência ou remoção, para evitar surpresas em futuras atualizações do JDK.
- **Refatoração baseada nos resultados**: Após identificar o uso de APIs obsoletas, é essencial planejar e executar uma refatoração do código para substituí-las por alternativas mais recentes e suportadas.

Em suma, `jdeprscan` é uma ferramenta valiosa no kit de ferramentas de qualquer desenvolvedor Java, especialmente aqueles que trabalham com bases de código grandes ou legadas. Ao facilitar a identificação de APIs obsoletas, ela ajuda a manter a base de código atualizada, reduzindo o risco de problemas de compatibilidade com versões futuras do Java. Isso é particularmente útil em um contexto de aplicações modulares, onde a manutenção de um código limpo e atualizado é crucial para a saúde e facilidade de gerenciamento do sistema.

### Estratégias de migração
[[Topo]](#)<br />

Migrar uma aplicação Java não modular para uma aplicação modular é um processo que exige cuidado e planejamento. Com a introdução do sistema de módulos no Java 9, muitas aplicações existentes precisaram ser atualizadas para aproveitar os benefícios desta nova funcionalidade.

#### Estratégia bottom-up (de baixo para cima)

- **Começar pelas dependências**: Inicie convertendo as bibliotecas e dependências internas da aplicação em módulos. Isso envolve adicionar `module-info.java` a esses componentes.
- **Benefícios**: Essa abordagem garante que as dependências da sua aplicação já estejam modularizadas quando você começar a modularizar o aplicativo em si.
- **Desafio**: Dependências externas que ainda não são módulos podem complicar este processo.

#### Estratégia top-down (de cima para baixo)
- **Começar pelo aplicativo principal**: Inicie adicionando um `module-info.java` ao aplicativo principal, tratando inicialmente todas as dependências como um único módulo automático.
- **Benefícios**: Isso permite que você se concentre na estruturação do seu aplicativo principal sem se preocupar imediatamente com as dependências externas.
- **Desafio**: Pode haver necessidade de ajustes significativos nas dependências à medida que elas são gradualmente convertidas em módulos.

#### Estratégia incremental (passo a passo)
- **Migração em fases**: Migrar um módulo de cada vez, começando com as partes mais isoladas ou menos dependentes do aplicativo.
- **Benefícios**: Reduz o risco e permite testes e ajustes contínuos, facilitando a identificação de problemas específicos.
- **Desafio**: Pode ser um processo mais longo, requerendo uma gestão cuidadosa do projeto.

#### Estratégia big bang
- **Migração completa de uma vez**: Converter toda a aplicação e suas dependências em módulos de uma só vez.
- **Benefícios**: Rápido e decisivo, sem estados intermediários prolongados.
- **Desafio**: Alto risco, com possíveis problemas complexos que podem ser difíceis de isolar e corrigir.

#### Dicas comuns para todas as estratégias
- **Análise de dependências**: Use ferramentas como `jdeps` para entender as dependências existentes e como elas podem ser divididas em módulos.
- **Refatoração**: Prepare o código para modularização, removendo dependências cíclicas e refatorando o código conforme necessário.
- **Testes rigorosos**: Teste cada módulo e a aplicação inteira extensivamente após cada mudança para garantir que tudo ainda funcione conforme esperado.
- **Documentação**: Atualize a documentação para refletir as mudanças na estrutura modular.
- **Comunicação e planejamento**: Mantenha a equipe informada sobre as mudanças e planeje cuidadosamente as etapas para garantir uma transição suave.

#### Considerações finais
- **Compatibilidade**: Verifique a compatibilidade de todas as ferramentas e bibliotecas usadas com o sistema de módulos do Java.
- **Gerenciamento de dependências**: Atenção especial deve ser dada às dependências externas que podem não ser modulares.
- **Iteração e flexibilidade**: Esteja preparado para iterar e ajustar sua abordagem com base nos desafios encontrados.

Cada estratégia tem seus próprios méritos e desafios, e a escolha depende do tamanho, complexidade e requisitos específicos da aplicação e da equipe. Em muitos casos, uma combinação dessas estratégias pode ser a abordagem mais eficaz.

### Migração top-down
[[Topo]](#)<br />

A migração "Top-Down" (De Cima para Baixo) em Java, no contexto de transformar aplicações não modulares em modulares com o sistema de módulos introduzido no Java 9, é uma estratégia de migração que começa pelo nível mais alto da aplicação — tipicamente a camada de aplicação ou a interface com o usuário — e progride em direção às camadas mais baixas, como bibliotecas e componentes.

#### Características da migração top-down

- **Foco no aplicativo principal**
  - Inicia-se pela criação de um módulo para o aplicativo principal. Isso geralmente envolve a adição de um arquivo `module-info.java` no nível mais alto da aplicação.
  - Esse módulo principal declara explicitamente suas dependências para outros módulos e pacotes.
- **Tratamento de dependências**
  - Inicialmente, as dependências externas (bibliotecas e frameworks) são tratadas como módulos automáticos ou são mantidas no classpath.
  - Com o tempo, essas dependências podem ser transformadas em módulos verdadeiros, conforme a disponibilidade e a compatibilidade.
- **Iterativo e gradual**
  - Esta abordagem permite que a migração ocorra de forma iterativa. Começando do topo, cada parte da aplicação é gradualmente encapsulada em módulos.
  - À medida que a migração progride, ajustes e refatorações são feitos para garantir a compatibilidade modular.
- **Minimiza a disrupção inicial**
  - Ao começar pelo topo, a estratégia Top-Down minimiza a interrupção inicial nas funcionalidades principais da aplicação.
  - Isso é particularmente útil em sistemas grandes e complexos onde uma abordagem de "Big Bang" seria arriscada demais.

#### Vantagens da migração top-down

- **Gerenciabilidade**: Permite que a equipe se concentre em um conjunto menor de mudanças em cada etapa, tornando o processo mais gerenciável.
- **Teste contínuo**: Facilita o teste contínuo e a validação da aplicação à medida que cada módulo é convertido.
- **Flexibilidade**: Permite ajustes e adaptações conforme necessário durante o processo de migração.

#### Desafios

- **Dependências Externas**: Pode ser difícil lidar com bibliotecas que ainda não são modulares.
- **Refatoração de Código**: A necessidade de refatorar o código para se adequar ao sistema de módulos pode ser mais desafiadora no nível do aplicativo.

#### Conclusão

A migração top-down é uma abordagem pragmática e estruturada que pode ser particularmente eficaz para aplicações grandes e complexas, onde a modularização completa pode ser um processo longo e complicado. Esta estratégia equilibra a necessidade de progresso gradual com a manutenção da funcionalidade do sistema durante o processo de migração.

### Migração bottom-up
[[Topo]](#)<br />

A migração "Bottom-Up" (De Baixo para Cima) em Java, no contexto de converter aplicações não modulares para modulares com o sistema de módulos introduzido no Java 9, é uma estratégia que começa pela modularização das camadas mais baixas ou componentes internos da aplicação e progride em direção às camadas superiores, como a camada de interface com o usuário ou a camada de aplicação.

#### Características da migração bottom-up

- **Início pelas bibliotecas e componentes internos**
  - A migração começa pelas dependências internas, bibliotecas e componentes de baixo nível, convertendo-os em módulos.
  - Cada biblioteca ou componente interno é encapsulado em seu próprio módulo com um arquivo `module-info.java` definindo suas dependências e exportações.
- **Progressão para camadas superiores**
  - Após a modularização das camadas inferiores, a migração prossegue para as camadas superiores da aplicação.
  - Isso pode incluir a separação de diferentes funcionalidades ou serviços em módulos distintos.
- **Refatoração e reestruturação**
  - Essa abordagem pode exigir uma refatoração significativa dos componentes internos para garantir que eles sigam os princípios de encapsulamento e separação de responsabilidades exigidos pelo sistema de módulos.
- **Adaptação das dependências externas**
  - Dependências externas que ainda não são modulares podem ser um desafio. Elas podem precisar ser incluídas como módulos automáticos inicialmente.

#### Vantagens da migração bottom-up

- **Fortalecimento da base de código**: Começando de baixo, a estratégia garante que a base de código seja sólida e bem estruturada, o que é benéfico para a manutenção a longo prazo.
- **Menor disrupção nas camadas superiores**: Como a migração começa nas camadas inferiores, as partes superiores da aplicação permanecem relativamente inalteradas no início, permitindo que a funcionalidade principal continue operacional durante a maior parte do processo.

#### Desafios

- **Dependências externas**: As dependências externas podem se tornar um desafio, especialmente se não forem modularizadas.
- **Complexidade na refatoração**: A necessidade de refatoração profunda pode ser mais desafiadora nas camadas inferiores, onde as dependências e interações podem ser mais complexas.

#### Conclusão

A migração Bottom-Up é eficaz em situações onde as camadas inferiores da aplicação são relativamente isoladas e bem definidas, permitindo que sejam modularizadas sem grandes perturbações nas funcionalidades de nível superior. Esta abordagem é particularmente útil em sistemas onde as camadas inferiores são estáveis e bem compreendidas, enquanto as camadas superiores são mais dinâmicas ou sujeitas a mudanças frequentes.

A estratégia Bottom-Up pode ser mais adequada para projetos que desejam fortalecer e melhorar a qualidade do código em suas camadas fundamentais, garantindo que a base sobre a qual o resto da aplicação é construída seja sólida e bem estruturada. Além disso, ao lidar primeiro com as camadas inferiores, a equipe ganha experiência e conhecimento sobre o sistema de módulos, o que pode facilitar a migração das partes restantes da aplicação.
