# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## 4.1. Pacotes: criação e apresentação de pacotes
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Conteúdo
  - [Pacotes](#pacotes)
  - [Criando pacotes](#criando-pacotes)
  - [Movendo classes para pacotes](#movendo-classes-para-pacotes)
  - [Organizando imports](#organizando-imports)
  - [Visualização da hierarquia de pacotes](#visualização-da-hierarquia-de-pacotes)
  - [Refatoração de pacotes](#refatoração-de-pacotes)
  - [Navegação entre pacotes](#navegação-entre-pacotes)
  - [Gerenciamento de dependências](#gerenciamento-de-dependências)
  - [Exploração de pacotes](#exploração-de-pacotes)
  - [Pacotes internos e visibilidade](#pacotes-internos-e-visibilidade)
  - [Refatoração segura](#refatoração-segura)

### Pacotes
[[Topo]](#)<br />

O IntelliJ IDEA é uma poderosa IDE (Integrated Development Environment) para desenvolvimento Java que facilita a criação e organização de pacotes em seus projetos. Os pacotes são usados para estruturar e agrupar classes relacionadas em hierarquias organizadas. Aqui estão alguns conceitos e ações relacionadas a pacotes no IntelliJ IDEA.

### Criando pacotes
[[Topo]](#)<br />

- Para criar um novo pacote, clique com o botão direito do mouse na pasta "src" (ou em outra pasta de origem) em seu projeto e escolha "New" > "Package". Insira o nome do pacote desejado.
- Você também pode criar pacotes ao criar novas classes. Quando você cria uma nova classe no IntelliJ IDEA, pode especificar o pacote diretamente na caixa de diálogo de criação de classe.

### Movendo classes para pacotes
[[Topo]](#)<br />

Para mover uma classe para um pacote existente, clique com o botão direito na classe no explorador de projeto, selecione "Refactor" e escolha "Move". Em seguida, selecione o pacote de destino.

### Organizando imports
[[Topo]](#)<br />

O IntelliJ IDEA possui recursos automáticos para organizar os imports de suas classes. Use a combinação de teclas "Ctrl + Alt + O" (ou "Cmd + Option + O" no macOS) para organizar os imports em seu código.

### Visualização da hierarquia de pacotes
[[Topo]](#)<br />

O IntelliJ IDEA permite visualizar a hierarquia de pacotes em seu projeto. Basta clicar com o botão direito do mouse em um pacote e escolher "Diagramas" > "Show Diagram".

### Refatoração de pacotes
[[Topo]](#)<br />

O IntelliJ IDEA oferece recursos de refatoração para ajudar na reorganização de pacotes. Você pode renomear pacotes, mover pacotes e até mesmo extrair classes para novos pacotes de forma eficiente.

### Navegação entre pacotes
[[Topo]](#)<br />

Você pode navegar facilmente entre as classes e pacotes no IntelliJ IDEA usando a barra de navegação no topo da janela ou pressionando "Ctrl + N" (ou "Cmd + O" no macOS) para abrir um diálogo de pesquisa de classes e pacotes.

### Gerenciamento de dependências
[[Topo]](#)<br />

O IntelliJ IDEA oferece suporte para gerenciamento de dependências usando ferramentas como o Maven ou o Gradle. Você pode adicionar bibliotecas externas ao seu projeto e o IntelliJ IDEA cuidará das configurações de dependências.

### Exploração de pacotes
[[Topo]](#)<br />

O explorador de projeto no IntelliJ IDEA permite explorar facilmente a estrutura de pacotes em seu projeto. Você pode expandir e recolher pacotes para visualizar suas classes e recursos.

### Pacotes internos e visibilidade
[[Topo]](#)<br />

O IntelliJ IDEA gerencia a visibilidade de classes e pacotes de acordo com as convenções de acesso do Java (public, private, protected e padrão/package-private). Isso significa que você pode definir a visibilidade de classes e membros dentro de seus pacotes de acordo com suas necessidades.

### Refatoração segura
[[Topo]](#)<br />

O IntelliJ IDEA fornece refatoração segura, o que significa que, ao renomear um pacote ou classe, ele também atualizará todas as referências a esse pacote/classe em seu código.
