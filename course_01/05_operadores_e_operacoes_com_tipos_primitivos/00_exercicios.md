# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Exercícios - 5. Operadores e operações com tipos primitivos
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Homework
  - [Arquivo: HW - Operators - Practical Tasks](./06_arquivos/homework/HW%20-%20Operators%20-%20Practical%20Tasks.pdf)
    - [Calculadora de inteiros de console simples](#calculadora-de-inteiros-de-console-simples)
    - [Calcular a área de um triângulo](#calcular-a-área-de-um-triângulo)
    - [Circunferência de um círculo](#circunferência-de-um-círculo)
- (se existir exercícios) Exercícios
  - [Exercício 1](./exercicio_01/) ([enunciado](#calculadora-de-inteiros-de-console-simples))
  - [Exercício 2](./exercicio_02/) ([enunciado](#calcular-a-área-de-um-triângulo))
  - [Exercício 3](./exercicio_03/) ([enunciado](#circunferência-de-um-círculo))
- Conteúdo
  - [5.6. Ler entrada do usuário pelo console](#56-ler-entrada-do-usuário-pelo-console)
    - [Calculadora de inteiros de console simples](#calculadora-de-inteiros-de-console-simples)
    - [Calcular a área de um triângulo](#calcular-a-área-de-um-triângulo)
    - [Circunferência de um círculo](#circunferência-de-um-círculo)

### 5.6. Ler entrada do usuário pelo console
[[Topo]](#)<br />

#### Calculadora de inteiros de console simples
[[Topo]](#)<br />

- Ver homework: [HW - Operators - Practical Tasks](./06_arquivos/homework/HW%20-%20Operators%20-%20Practical%20Tasks.pdf)

Implemente um programa de console que atenda aos seguintes requisitos:

1. O programa é iniciado com 2 argumentos de entrada.
2. O programa converte os argumentos em números inteiros.
3. O programa imprima no console o resultado da soma dos 2 números.

**Iniciar uma aplicação Java passando argumentos**
- Usando a linha de comando
  - Após compilar (`javac nome_programa.java`) o programa, utilize o seguinte comando para iniciar uma aplicação Java enviando os valores 3 e 4 como argumentos: `java nome_programa 3 4`
- Usando o IntelliJ Idea
  - Na barra de menus, acesse *Run* > *Edit Configurations*:
    - Em *Application*, crie um novo (ou selecione o já existente se for a classe correta) selecionando *Application* e aponte para a classe correta onde está localizado o método main().
    - Em *Program Arguments*, digite os argumentos a serem passados para a aplicação, clique em *Apply* e *Run*.
- Lembre-se: Cada argumento se dá separando os valores com espaços em branco.

Para converter argumentos em formato de texto (String) para inteiros, considere o seguinte exemplo: `int i = Integer.parseInt("1");`.

> Exercício 1 (Calculadora de inteiros de console simples): [exercicio_01](./exercicio_01/)

#### Calcular a área de um triângulo
[[Topo]](#)<br />

- Ver homework: [HW - Operators - Practical Tasks](./06_arquivos/homework/HW%20-%20Operators%20-%20Practical%20Tasks.pdf)

Implemente um programa de console que atenda aos seguintes requisitos:

1. O programa inicia e pede ao usuário que insira o comprimento do lado A do triângulo.
2. O programa pede ao usuário que insira o comprimento do lado B do triângulo.
3. O programa pede ao usuário que insira o comprimento do lado C do triângulo.
4. Usando a fórmula de Heron (https://www.mathopenref.com/heronsformula.html), o programa calcula a área do triângulo e a exibe para o usuário.
5. Caso esse triângulo não exista, imprima 'NaN' no console.

> Exercício 2 (Calcular a área de um triângulo): [exercicio_02](./exercicio_02/)

#### Circunferência de um círculo
[[Topo]](#)<br />

- Ver homework: [HW - Operators - Practical Tasks](./06_arquivos/homework/HW%20-%20Operators%20-%20Practical%20Tasks.pdf)

Implemente um programa de console que atenda aos seguintes requisitos:

1. O programa inicia e pede ao usuário para inserir o raio do círculo.
2. O programa calcula a circunferência do círculo e a exibe para o usuário.

> Exercício 3 (Circunferência de um círculo): [exercicio_03](./exercicio_03/)

