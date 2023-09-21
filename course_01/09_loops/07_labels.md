# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Labels
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [07_arquivos](./07_arquivos/)
- Homework
  - [Arquivo: HW - Loops](./07_arquivos/homework/HW%20-%20Loops.pdf)
  - [Homework: Imprimir entradas em novas linhas](#homework-imprimir-entradas-em-novas-linhas)
  - [Homework: Pirâmide no console](#homework-pirâmide-no-console)
  - [Homework: Matriz tabulada](#homework-matriz-tabulada)
- Projetos
  - [Projeto 1](./07_arquivos/proj_01/) [(iniciado em)](#o-que-são-labels)
- Exercícios
  - [Exercício 1](./07_arquivos/exercicio_01/) ([enunciado](#homework-imprimir-entradas-em-novas-linhas))
  - [Exercício 2](./07_arquivos/exercicio_02/) ([enunciado](#homework-pirâmide-no-console))
  - [Exercício 3](./07_arquivos/exercicio_03/) ([enunciado](#homework-matriz-tabulada))
- Conteúdo
  - [O que são labels](#o-que-são-labels)
  - [Como utilizar labels](#como-utilizar-labels)

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

### Homework: Imprimir entradas em novas linhas
[[Topo]](#)<br />

- Ver homework: [HW - Loops](./07_arquivos/homework/HW%20-%20Loops.pdf)

Implemente um programa de console que atenda aos seguintes requisitos:
- O programa inicia e solicita ao usuário que digite um número inteiro.
- O programa imprime cada dígito em uma nova linha.

Exemplo:

- Entrada do usuário: "12345"
- Saída do console do programa:
```
1
2
3
4
5
```

> Exercício 1 (Labels): [07_arquivos/exercicio_01](./07_arquivos/exercicio_01/)

### Homework: Pirâmide no console
[[Topo]](#)<br />

- Ver homework: [HW - Loops](./07_arquivos/homework/HW%20-%20Loops.pdf)

Implemente um programa de console que atenda aos seguintes requisitos:
- O programa inicia e pede ao usuário que insira a altura da pirâmide.
- O programa desenha a figura de uma pirâmide horizontalmente no console:

Exemplo:

- Entrada do usuário: "4"
- Saída do console do programa:
```
*
**
***
****
***
**
*
```

> Exercício 2 (Labels): [07_arquivos/exercicio_02](./07_arquivos/exercicio_02/)

### Homework: Matriz tabulada
[[Topo]](#)<br />

- Ver homework: [HW - Loops](./07_arquivos/homework/HW%20-%20Loops.pdf)

Implemente um programa de console que atenda aos seguintes requisitos:
- O programa inicia e imprime uma matriz no console.
- Matriz a ser impressa:
```
{
  {1, 2, 3, 4, 5},
  {6, 7},
  {8, 9, 10}
}
```
- A saída deve se parecer com isso:
```
	1	2	3	4	5
	6	7
	8	9	10
```

> Exercício 3 (Labels): [07_arquivos/exercicio_03](./07_arquivos/exercicio_03/)
