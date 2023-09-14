# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Ambiente Integrado de Desenvolvimento - IDE
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [03_arquivos](./03_arquivos/)
- Projetos
  - [Projeto 1](./03_arquivos/proj_01/) [(iniciado em)](#download-instalação-do-intellij-idea-e-primeiro-projeto-na-ide)
- Conteúdo
  - [O que é uma IDE?](#o-que-é-uma-ide)
  - [Download, instalação do IntelliJ Idea e primeiro projeto na IDE](#download-instalação-do-intellij-idea-e-primeiro-projeto-na-ide)
  - [O que são comentários?](#o-que-são-comentários)
  - [Quais os tipos de comentários no código fonte Java?](#quais-os-tipos-de-comentários-no-código-fonte-java)
  - [Dicas e boas práticas](#dicas-e-boas-práticas)

### O que é uma IDE?
[[Topo]](#)<br />

IDE significa Integrated Development Environment, ou Ambiente de Desenvolvimento Integrado.

Uma IDE é uma aplicação que fornece e ferramentas abrangentes para programadores de computador para o desenvolvimento de software.

Normalmente, elas consistem em um editor de código, ferramentas de automação de build, depurador e compilador.

- NetBeans, Eclipse e IntelliJ Idea são exempĺos de IDE's muito utilizadas no desenvolvimento Java.
- Android Studio também é uma IDE para Java, porém só desenvolve aplicações para Android.

- Recomenda-se utilizar o Eclipse ao desenvolver com Java EE.

- Neste curso, vamos utilzar apenas o Java SE, então usaremos a IDE IntelliJ Idea.

### Download, instalação do IntelliJ Idea e primeiro projeto na IDE
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./03_arquivos/proj_01/)

Acesse e download do IntelliJ Idea: https://www.jetbrains.com/pt-br/idea/

Siga as intruções presentes no website para a instalação segundo o seu sistema operacional.

Para criar o projeto no IntelliJ:
- Abra o IntelliJ
- Clique em *New Project*
- Em *Nome*, digite HelloWorld
- Em *Location*, escolha uma pasta para armazenar seu projeto
- Em *Language*, selecione *Java*
- Em *Build system*, selecione IntelliJ
- Em *JDK*, selecione a versão 8 (ou 1.8)
- Clique em *Create*

A IDE criará uma classe *Main* contendo o método *main()* pronto para executar.

Para executar o projeto pela primeira vez:
- Clique no botão de reproduzir à esquerda do método main().
- Visualize o resultado no console na parte inferior da IDE.
- Após a primeira vez que você executou o projeto desta maneira, você pode a partir de agora, iniciar o projeto a qualquer momento sem a necessidade de voltar para o arquivo main, utilizando *Shift + F10* ou clicando no botão reproduzir na barra de tarefas no canto superior direito.

### O que são comentários?
[[Topo]](#)<br />

Comentários são instruções que não são executadas pela JVM.

Eles podem ser usados para tornar a manutenção do código mais fácil.

Pode fornecer informações sobre partes específicos do código.

Pode ser usado como um lembrete TODO.

### Quais os tipos de comentários no código fonte Java?
[[Topo]](#)<br />

**Uma linha**: `// comente aqui`. Tudo a direita de `//` é ignorado pela JVM.

**Várias linhas**: `/* comente aqui */`. Tudo entre `/*` e `*/` é ignorado pela JVM.

**JavaDoc**: `/** comente aqui */`. Tudo entre `/**` e `*/` será automaticamente atribuído a uma documentação que pode ser acessada através de um arquivo *.html*.
- Para gerar o JavaDoc, vá em *Tools* > *Generate JavaDoc*
- Atente-se para o diretório de saída.

### Dicas e boas práticas
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./03_arquivos/proj_01/)

- Se uma porção específica do código está comentado apenas para esconder o código, então você não precisa dele no seu projeto.
- Comentários requerem manutenção e eles podem induzir a erro.
- No futuro - Os testes unitários atuarão no papel de documentação.
- Para melhorar a legibilidade do código, não dependa exclusivamente da documentação. Escreva código de acordo com as convenções de Código Java e escolha nomes significativos para métodos e variáveis.
