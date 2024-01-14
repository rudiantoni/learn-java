# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## 26.2. Migração para uma aplicação modular
[[Home - Curso 1]](../../README.md#curso-1)<br />

- (se existir diretório de arquivos com documentos, etc) Diretório de arquivos: [folder_name-nn_arquivos](folder_link)
- (se existir homework parte sem exercíos) Homework
  - [Arquivo: file_name_no_extension](file_link)
  - [content_title](content_link)
  - ...
- (se existir projeto) Projetos
  - [Projeto N](folder_link-proj_nn) [(iniciado em)](#started_in_content_link)
  - ...
- Conteúdo
  - []()
  - ...

### Algoritmo de Migração
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

### Java Class Dependency Analyzer - jdeps
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

- **Preparação para modularização'**: Antes de converter uma aplicação para usar o sistema de módulos do Java, `jdeps` pode ser usado para entender as dependências existentes e planejar a divisão em módulos.
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
- **Uso em Projetos Complexos**: Em projetos grandes e complexos, a análise de dependências pode se tornar complicada, mas o `jdeps` fornece opções para filtrar e focar em aspectos específicos das dependências, facilitando a gestão.
- **Interpretação de Resultados**: A habilidade de interpretar corretamente os resultados fornecidos pelo `jdeps` é crucial. Entender as dependências e como elas afetam a modularização é fundamental para um processo de migração bem-sucedido.

Em resumo, o `jdeps` é uma ferramenta essencial no ecossistema Java para análise de dependências, especialmente útil para a transição para um design modular de aplicativos. Ele ajuda os desenvolvedores a entenderem melhor a estrutura de dependência do seu código e a planejar refatorações e modularizações de forma mais informada.

### (nome do vídeo, aula, etc)
[[Topo]](#)<br />



### (nome do vídeo, aula, etc)
[[Topo]](#)<br />



### (nome do vídeo, aula, etc)
[[Topo]](#)<br />



### (nome do vídeo, aula, etc)
[[Topo]](#)<br />



### (nome do vídeo, aula, etc)
[[Topo]](#)<br />



### (nome do vídeo, aula, etc)
[[Topo]](#)<br />



### (nome do vídeo, aula, etc)
[[Topo]](#)<br />



### (nome do vídeo, aula, etc)
[[Topo]](#)<br />



### (nome do vídeo, aula, etc)
[[Topo]](#)<br />



### (nome do vídeo, aula, etc)
[[Topo]](#)<br />



### (nome do vídeo, aula, etc)
[[Topo]](#)<br />


Se homework:
- Ver homework: [file_name_no_extension](file_link)
Se projeto:
- Ver projeto: [Projeto N](folder_link-proj_nn)

Lista ordenada
1. Lista item 1
2. Lista item 2
3. Lista item 3

Lista desordenada
- Lista item 1
- Lista item 2
- Lista item 3

`linha de codigo`

Bloco de código

```
bloco de código {

}
```

Se exercício:
> Exercício N ((nome do vídeo, aula, etc)): [caminho](exercicio_nn)

Enunciado de pesquisa:
- Em Java, sobre aplicações modulares, me explique o que é o algoritmo de migração de uma aplicação nao modular para uma aplicação modular e forneça uma lista de passos
- Em Java, sobre aplicações modulares, me explique o que é a ferramenta jdeps Java Class Dependency Analyzer
- Em Java, sobre aplicações modulares, me explique o que é a ferramenta jreprscan Java Deprecated API Scanner
- Em Java, sobre aplicações modulares, me explique quais são as estratégias comuns na migração de uma aplicação nao modular para uma aplicação modular
- Em Java, sobre aplicações modulares, me explique o que é a migração top down
- Em Java, sobre aplicações modulares, me explique o que é a migração bottom up

