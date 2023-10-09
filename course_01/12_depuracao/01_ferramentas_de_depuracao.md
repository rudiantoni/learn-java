# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Ferramentas de depuração
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Conteúdo
  - [Debugger no IntelliJ IDEA](#debugger-no-intellij-idea)

### Debugger no IntelliJ IDEA
[[Topo]](#)<br />

O IntelliJ IDEA é uma poderosa IDE (Integrated Development Environment) usada para desenvolvimento de software em várias linguagens de programação, incluindo Java, Kotlin, Python e muito mais. O debugger é uma ferramenta essencial para depurar e identificar problemas em seu código. Aqui estão os passos básicos para usar o debugger no IntelliJ IDEA:

- Abra seu projeto no IntelliJ IDEA.
- Abra o arquivo que você deseja depurar.
- Coloque pontos de interrupção (breakpoints) no código onde você deseja que o programa pare e você possa examinar variáveis e o estado do programa. Você pode fazer isso clicando no número da linha à esquerda do código-fonte ou pressionando *Ctrl + F8* (ou *Cmd + F8* no macOS) na linha onde deseja definir o ponto de interrupção. Um ponto vermelho aparecerá na linha selecionada.
- Execute seu programa no modo de depuração. Você pode fazer isso de várias maneiras:
  - Clique com o botão direito do mouse no arquivo ou método principal e selecione "Debug".
  - Use o atalho *Shift + F9* para executar a configuração de depuração atual.
  - Crie uma configuração de execução de depuração personalizada e execute-a.
- O programa será executado até atingir o primeiro ponto de interrupção. Nesse momento, o debugger será ativado e você verá uma série de painéis na parte inferior da janela do IntelliJ IDEA.
- Nos painéis de depuração, você pode examinar variáveis, inspecionar a pilha de chamadas, controlar a execução do programa (passar para a próxima linha, entrar em métodos, sair de métodos, etc.) e muito mais. Aqui estão algumas ações comuns:
  - *F8* (ou *Fn + F8* no macOS): Avançar para a próxima linha.
  - *F7* (ou *Fn + F7* no macOS): Entrar em um método (se houver uma chamada de método na linha atual).
  - *Shift + F8*: Sair de um método (quando estiver dentro de um).
  - *Alt + F9*: Executar até o cursor (executa até a próxima linha onde o cursor está).
  - *Alt + F8*: Avaliar expressões (para verificar valores de variáveis).
  - *Ctrl + F2*: Parar a execução do programa.
- Você pode continuar a depurar seu código, movendo-se para diferentes pontos de interrupção, inspecionando variáveis e assim por diante, até identificar e resolver qualquer problema no código.
- Quando terminar de depurar, você pode encerrar a execução do programa clicando no botão "Stop" (parar) no painel de depuração ou pressionando *Ctrl + F2*.

Lembre-se de que essas são apenas as operações básicas de depuração no IntelliJ IDEA. A IDE oferece muitos recursos avançados de depuração que podem ajudá-lo a resolver problemas complexos em seu código. Explore a documentação do IntelliJ IDEA para obter mais informações sobre as funcionalidades específicas de depuração disponíveis para sua linguagem de programação e tecnologia.
