# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Exercícios - 24. Java Reflection API e Anotações
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Homework
  - [24.2. Anotações](#242-anotações)
    - [Arquivo: HW - Annotations](./02_arquivos/homework/HW%20-%20Annotations.pdf)
- Exercícios
  - [24.2. Anotações](#242-anotações)
    - [Exercício 1](./exercicio_01/) ([enunciado](#anotação-todo))

### 24.2. Anotações
[[Topo]](#)<br />

#### Anotação Todo
[[Topo]](#)<br />

- Ver homework: [HW - Annotations](./02_arquivos/homework/HW%20-%20Annotations.pdf)

Implemente a Anotação que permite rastrear o progresso.

- O nome da Anotação é 'Todo'
- A Anotação tem os seguintes elementos:
  - author - tipo String
  - priority - tipo Enum Priority (LOW, MEDIUM, HIGH)
  - status - tipo Enum Status (STARTED, NOT_STARTED)
- Declare os enums Priority e Status DENTRO da anotação Todo
- A Priority padrão é LOW
- O status padrão é NOT_STARTED
- Para o elemento author não há valor padrão
- A Anotação pode ser aplicada apenas a métodos
- A Anotação deve estar disponível durante a execução
- Crie a classe TodoAnalyzer
- Declare o método getTodoReport() na classe TodoAnalyzer
  - O método retorna uma String que contém o relatório Todo seguindo um formato específico descrito abaixo
  - O método deve receber um objeto Class para analisar como argumento do método
  - O método retorna uma String de cada análise de método dividida por um separador de nova linha. Cada linha deve ter o seguinte formato: `nome do método: <AQUI NOME DO MÉTODO>, autor: <AQUI AUTOR>, prioridade: <AQUI PRIORIDADE>, status: <AQUI STATUS>`

> Exercício N (Anotações): [exercicio_01](./exercicio_01/)
