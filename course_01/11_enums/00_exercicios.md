# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Exercícios - 11. Enums
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Homework
  - [11.1. O Enum](#111-o-enum)
    - [Arquivo: HW - Enum](./01_arquivos/homework/HW%20-%20Enum.pdf)
- Exercícios
  - [11.1. O Enum](#111-o-enum)
    - [Exercício 1](./01_arquivos/) ([enunciado](#enum-por-propriedade))

### 11.1. O Enum
[[Topo]](#)<br />

#### Enum por propriedade
[[Topo]](#)<br />

- Ver homework: [HW - Enum](./01_arquivos/homework/HW%20-%20Enum.pdf)

Implemente um programa de console que atenda aos seguintes requisitos:
- O programa inicia e pede ao usuário para inserir o tipo de mensagem.
- Apenas os tipos de mensagem 'A', 'B', 'C' ou 'D' são permitidos.
- Caso o usuário insira um tipo de mensagem inválido, o programa solicita que ele insira o tipo de mensagem novamente.
- Quando um tipo de mensagem válido for inserido, o programa imprime a prioridade do tipo de mensagem no console.
- Prioridade e Tipo de Mensagem implementados como tipos enumerados (enum).
- Os tipos de mensagem têm as seguintes prioridades:
  - A = ALTA
  - B = MÉDIA
  - C = BAIXA
  - D = BAIXA
- O enum MessageType possui o seguinte método:

```java
public Priority getPriority() {
  // <escreva seu código aqui>
}
```

> Exercício 1 (O Enum): [exercicio_01](./exercicio_01/)
