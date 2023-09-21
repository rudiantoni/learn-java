# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Labels
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [07_arquivos](./07_arquivos/)
- (se existir homework) Homework
  - [Arquivo: file_name_no_extension](file_link)
  - [content_title](content_link)
  - ...
- Projetos
  - [Projeto 1](./07_arquivos/proj_01/) [(iniciado em)](#o-que-são-labels)
- (se existir exercícios) Exercícios
  - [Exercício N](folder_link-exercicio_nn) ([enunciado](#statement_content_link))
  - ...
- Conteúdo
  - []()
  - ...

### O que são labels
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./07_arquivos/proj_01/)

Em Java, labels são identificadores que você pode atribuir a loops, como for, while, ou do-while, bem como a blocos de código, como um bloco { }. Esses labels são usados para marcar esses blocos de código de maneira única, permitindo que você os identifique e referencie em instruções break e continue.

Em essência, um label é um rótulo nomeado para um bloco de código. Eles são usados quando você tem loops aninhados (loops dentro de loops) e deseja especificar a qual loop você deseja aplicar uma instrução break ou continue. Os labels ajudam a controlar o fluxo de execução com mais precisão.

### Como utilizar labels
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./07_arquivos/proj_01/)

Aqui está um exemplo de como usar labels em Java:

```java
outerLoop: // Label para o loop externo
for (int i = 1; i <= 3; i++) {
  innerLoop: // Label para o loop interno
  for (int j = 1; j <= 3; j++) {
    if (i == 2 && j == 2) {
      break outerLoop; // Sai do loop externo quando i é 2 e j é 2
    }
    System.out.println("i: " + i + ", j: " + j);
  }
}
```

Neste exemplo:

- Usamos o label outerLoop para marcar o loop externo e o label innerLoop para marcar o loop interno.
- Dentro do loop interno, verificamos se i é igual a 2 e j é igual a 2. Se essa condição for verdadeira, usamos break outerLoop; para sair do loop externo (outerLoop).

O resultado será a impressão dos valores de i e j até que a condição seja atendida:

```
i: 1, j: 1
i: 1, j: 2
```

Observe que o uso de labels permite que você controle qual loop será afetado pela instrução break ou continue. Isso é útil em situações de loops aninhados quando você precisa sair de um loop específico ou continuar em um loop específico.


Se homework:
- Ver homework: [file_name_no_extension](file_link)


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
> Exercício N ((nome do vídeo, aula, etc)): [caminho](pasta_exercicio-exercicio_nn)

Enunciado de pesquisa:
Usando Java 8, me forneça conteúdo sobre o seguintes tópico com exemplos de código apenas onde solicitado:
- De maneira mais aprofundada, o que são labels
- Como utilizar labels (com exemplos de código)