# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Construção de switch
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [02_arquivos](./02_arquivos/)
- Projetos
  - [Projeto 1](./02_arquivos/proj_01/) [(iniciado em)](#instruções-switch)
- Conteúdo
  - [Instruções switch](#instruções-switch)
  - [Usos sem o break](#usos-sem-o-break)
  - [Diferenças entre if e switch](#diferenças-entre-if-e-switch)

### Instruções switch
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./02_arquivos/proj_01/)

A estrutura de controle switch é usada para tomar decisões com base no valor de uma expressão.

Ela é uma alternativa ao uso de múltiplas instruções if-else quando você precisa escolher entre várias opções com base em um valor específico.

A estrutura básica do switch em Java é a seguinte:

```java

switch (expressao) {
  case valor1:
    // Código a ser executado se a expressão for igual a valor1
    break;
  case valor2:
    // Código a ser executado se a expressão for igual a valor2
    break;
  // Adicione mais casos conforme necessário
  default:
    // Código a ser executado se a expressão não corresponder a nenhum dos casos
}
```
- *expressao*: É a expressão que você deseja avaliar. O resultado dessa expressão deve ser um valor inteiro, caractere (char), ou uma enumeração (enum).
- *case valor1*: Cada case representa um valor possível que a expressão pode ter. Se a expressão for igual a valor1, o código dentro desse case será executado. Lembre-se de incluir a palavra-chave break no final de cada case para evitar a execução dos case seguintes.
- *default*: O bloco default é opcional e é executado quando a expressão não corresponde a nenhum dos case. É usado como um caso de fallback.

```java
int diaDaSemana = 3;

switch (diaDaSemana) {
  case 1:
    System.out.println("Domingo");
    break;
  case 2:
    System.out.println("Segunda-feira");
    break;
  case 3:
    System.out.println("Terça-feira");
    break;
  case 4:
    System.out.println("Quarta-feira");
    break;
  case 5:
    System.out.println("Quinta-feira");
    break;
  case 6:
    System.out.println("Sexta-feira");
    break;
  case 7:
    System.out.println("Sábado");
    break;
  default:
    System.out.println("Dia inválido");
}
```

Neste exemplo, o programa avalia o valor de diaDaSemana e imprime o dia correspondente usando a estrutura switch. O break é usado para sair do switch após a correspondência do caso adequado. Se o valor não corresponder a nenhum caso, o código dentro do default será executado.

### Usos sem o break
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./02_arquivos/proj_01/)

Usar switch sem a instrução break permite que a execução continue para os casos seguintes após a correspondência. Isso pode ser útil em algumas situações, mas é importante entender como isso funciona, pois pode levar a resultados inesperados se não for usado com cuidado.

Quando você omite a instrução break após um case em um bloco switch, a execução continua para os casos subsequentes, incluindo o caso que correspondeu à expressão. Isso é chamado de "queda" ou "fallthrough". Aqui está um exemplo:


```java
int opcao = 2;

switch (opcao) {
  case 1:
    System.out.println("Opção 1 selecionada.");
  case 2:
    System.out.println("Opção 2 selecionada.");
  case 3:
    System.out.println("Opção 3 selecionada.");
  default:
    System.out.println("Opção padrão.");
}
```

Neste exemplo, se opcao for igual a 2, a saída será:

```text
Opção 2 selecionada.
Opção 3 selecionada.
Opção padrão.
```

Observe que, uma vez que o case 2 correspondeu, a execução continuou para os casos subsequentes sem a necessidade de break. Isso pode ser útil quando você deseja executar o mesmo código para vários casos consecutivos.

**Cuidados ao usar switch sem break**

Embora o uso de switch sem break possa ser útil, também pode ser propenso a erros se não for usado com cuidado. Certifique-se de que é a intenção do seu código que a execução continue para casos subsequentes.

Se você deseja interromper a execução após um caso correspondido, certifique-se de adicionar break. Se você quiser continuar a execução para os casos seguintes, omita o break. É importante documentar claramente o comportamento do switch no código para evitar confusão.

Além disso, tenha em mente que o uso excessivo de switch sem break pode tornar o código mais difícil de entender, por isso use com moderação e considere outras abordagens, como if-else, quando a lógica de controle for complexa.

### Diferenças entre if e switch
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./02_arquivos/proj_01/)

As diferenças entre as estruturas de controle if e switch em são:

- **Condições e expressões**
  - O if permite verificar uma condição booleana ou uma expressão que retorna um valor booleano.
  - O switch é usado para comparar uma única expressão com várias opções de valores constantes.
- **Complexidade de condições**
  - O if é flexível e pode lidar com condições complexas que envolvem operadores lógicos (como && e ||) e avaliação de expressões.
  - O switch é mais adequado para igualdade direta com valores constantes e não suporta condições complexas.
- **Teste de intervalos e valores personalizados**
  - O if permite testar intervalos numéricos, valores personalizados e realizar verificações personalizadas.
  - O switch é usado para verificar igualdade direta e não suporta testes de intervalos ou verificações personalizadas.
- **Número de opções**
  - O if pode ser usado para avaliar múltiplas condições em um único bloco de código.
  - O switch é mais eficiente quando você precisa comparar uma única expressão com muitas opções de valores constantes, tornando o código mais legível e eficiente.
- **Default (padrão)**:
  - O if não possui uma estrutura padrão explícita; você pode usar else para definir um bloco de código que é executado quando nenhuma das condições if anteriores é verdadeira.
  - O switch possui um bloco default que é executado quando nenhum dos casos corresponde à expressão.
**Performance**
  - O if tende a ser mais flexível, mas pode ser menos eficiente em comparação com o switch quando se lida com várias opções de valores constantes.
**Legibilidade**
  - O if pode ser mais legível em situações onde as condições são complexas ou variam muito.
  - O switch é mais legível quando você está lidando com uma única variável com várias opções claras.

Em resumo, o if é mais flexível e adequado para avaliações complexas, enquanto o switch é mais adequado para verificar igualdade direta com várias opções de valores constantes, tornando o código mais limpo e legível em situações específicas. A escolha entre if e switch depende das necessidades do seu código e da clareza que você deseja alcançar.
