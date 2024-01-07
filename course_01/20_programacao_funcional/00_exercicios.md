# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Exercícios - 20. Programação Funcional
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Homework
  - [20.4. Consumer, BiConsumer, Predicate e BiPredicate: teoria e prática](#204-consumer-biconsumer-predicate-e-bipredicate-teoria-e-prática)
    - [Arquivo: HW - Anonymous Methods - Lambda Expressions](./04_arquivos/homework/HW%20-%20Anonymous%20Methods%20-%20Lambda%20Expressions.pdf)
- Exercícios
  - [20.4. Consumer, BiConsumer, Predicate e BiPredicate: teoria e prática](#204-consumer-biconsumer-predicate-e-bipredicate-teoria-e-prática)
    - [Exercício 1](./exercicio_01/) ([enunciado](#ordenar-strings))

### 20.4. Consumer, BiConsumer, Predicate e BiPredicate: teoria e prática
[[Topo]](#)<br />

#### Ordenar Strings
[[Topo]](#)<br />

- Ver homework: [HW - Anonymous Methods - Lambda Expressions](./04_arquivos/homework/HW%20-%20Anonymous%20Methods%20-%20Lambda%20Expressions.pdf)

Implemente um programa de console que atenda aos seguintes requisitos:

- 1 - O programa inicia e pede ao usuário para inserir 7 palavras separadas por espaço
- 2 - O programa armazena todas essas strings em um array.
- 3 - O programa ordena o array colocando em primeiro lugar as strings que têm mais caracteres e colocando no final as strings com menor comprimento
- 4 - O programa imprime no console o array ordenado

**Exemplo:**
Entrada do usuário:
```
apple windows oracle microsoft Apple zpple
```

Saída do console do programa:

```
microsoft windows oracle apple Apple zpple
```

- Obs.: Preste atenção especial à comparação de strings que têm o mesmo comprimento, mas começam com maiúsculas e minúsculas, como 'Apple' e 'apple'
- Bom saber: Algoritmo de ordenação rápida https://en.wikipedia.org/wiki/Quicksort

> Exercício 1 (Consumer, BiConsumer, Predicate e BiPredicate: teoria e prática): [exercicio_01](./exercicio_01/)
