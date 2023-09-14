# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Refatoração de código no IntelliJ
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Conteúdo
  - [Refatoração](#refatoração)
  - [Como acessar as ferramentas de refatoração](#como-acessar-as-ferramentas-de-refatoração)
  - [Exemplos de refatoração](#exemplos-de-refatoração)
  - [Refatorações de código avançadas](#refatorações-de-código-avançadas)
  - [Histórico de refatoração](#histórico-de-refatoração)
  - [Refatoração de código em grande escala](#refatoração-de-código-em-grande-escala)
  
### Refatoração
[[Topo]](#)<br />

A refatoração de código é uma prática importante que envolve a reestruturação do código-fonte para melhorar sua qualidade, legibilidade e eficiência. O IntelliJ IDEA oferece uma variedade de recursos poderosos de refatoração para tornar esse processo mais fácil e seguro. Aqui estão alguns conceitos e ações relacionadas à refatoração de código no IntelliJ IDEA:

A refatoração de código no IntelliJ IDEA é uma prática essencial para manter um código limpo e bem organizado. Com as ferramentas avançadas oferecidas pela IDE, você pode realizar refatorações de maneira eficiente e segura, melhorando a qualidade e a manutenibilidade do seu código-fonte.

### Como acessar as ferramentas de refatoração

No IntelliJ IDEA, você pode acessar as ferramentas de refatoração de várias maneiras:
- Clique com o botão direito em um elemento (por exemplo, uma classe, método ou variável) no código-fonte e escolha "Refactor" no menu de contexto.
- Use a combinação de teclas associada a uma refatoração específica. Por exemplo, "Ctrl + Alt + M" para extrair um método ou "Shift + F6" para renomear um elemento.
- Vá para o menu "Refactor" na barra de menus para ver uma lista de opções de refatoração disponíveis.

### Exemplos de refatoração

Aqui estão alguns exemplos de refatoração comuns que você pode realizar no IntelliJ IDEA:

- Renomear: Use a refatoração de renomear (Shift + F6) para alterar o nome de uma classe, método, variável ou pacote em todo o projeto de forma segura.
- Extrair Método: Use a refatoração "Extract Method" (Ctrl + Alt + M) para criar um novo método a partir de um bloco de código selecionado, melhorando a legibilidade e a reutilização de código.
- Mover: Mova classes ou pacotes para novos pacotes ou pacotes diferentes com a refatoração "Move" (F6).
- Extrair Variável: Crie variáveis locais a partir de expressões para simplificar o código com a refatoração "Extract Variable" (Ctrl + Alt + V).
- Inline: Use a refatoração "Inline" (Ctrl + Alt + N) para substituir todas as referências a uma variável por seu valor real.
- Extrair Parâmetro: Adicione parâmetros a métodos para torná-los mais flexíveis e reutilizáveis com a refatoração "Extract Parameter" (Ctrl + Alt + P).
- Encapsular Campo: Melhore a encapsulação de campos de classe com a refatoração "Encapsulate Field" (Ctrl + Alt + F).

### Refatorações de código avançadas

O IntelliJ IDEA oferece refatorações avançadas, como:

- Métodos de Introdução e Exclusão de Parâmetros: Adicionar ou remover parâmetros de métodos.
- Extrair Interface ou Superclasse: Crie interfaces ou superclasses a partir de classes existentes.
- Refatoração de Herança: Melhore hierarquias de classes com as refatorações "Pull Up" e "Push Down".
- Segurança na Refatoração:
  - O IntelliJ IDEA é conhecido por sua segurança ao realizar refatorações. Ele realiza verificações estáticas para garantir que as refatorações sejam aplicadas corretamente, evitando erros no código.

### Histórico de refatoração

O IntelliJ IDEA mantém um histórico de todas as refatorações realizadas no projeto, permitindo desfazê-las ou refazê-las conforme necessário.

### Refatoração de código em grande escala
Para projetos maiores, o IntelliJ IDEA permite realizar refatorações em grande escala, como renomear pacotes inteiros ou reorganizar a estrutura do projeto.
