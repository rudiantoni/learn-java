# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Exercícios - 18. Genéricos
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Homework
  - [18.1. Manipulação de genéricos](#181-manipulação-de-genéricos)
    - [Arquivo: HW - Generics](./01_arquivos/homework/HW%20-%20Generics.pdf)
- Exercícios
  - [18.1. Manipulação de genéricos](#181-manipulação-de-genéricos)
    - [Exercício 1](./exercicio_01/) ([enunciado](#lista-personalizada-parametrizada))

### 18.1. Manipulação de genéricos
[[Topo]](#)<br />

#### Lista personalizada parametrizada
[[Topo]](#)<br />

- Ver homework: [HW - Generics](./01_arquivos/homework/HW%20-%20Generics.pdf)

Implementar generics na interface MyList e nas implementações desta interface.
- **a**. Certifique-se de que você completou o homework do tópico de Lists (tarefa 3), neste link: https://docs.google.com/document/d/1g5GRLOU4XRDCIp50n_-Dmnok-2EdoDTlAQdVm6XyBLo/edit?usp=sharing
- **b**. Parametrizar iteradores (ambos, Iterator e ListIterator) e também parametrizar as implementações destes iteradores que você criou no escopo desta tarefa: https://docs.google.com/document/d/1EAQRwHR1HbWt95T3FtS9EOdQsIc_3nZFYUvc6Qv4frQ/edit?usp=sharing
- **c**. Sua interface parametrizada deve se parecer com isso:
  - `public interface MyListParameterized<T> extends Iterable<T> { ... }`
- **d**. As implementações dessa interface deve se parecer com isso:
  - `public class DefaultMyListParameterized<T> implements MyListParameterized<T>, ListIterableParameterized<T>`
- **e**: O Iterator e ListIterator que você implementou no escopo de outro homework compartilhado acima, esta classe também deve ser parametrizada.
- Commit para verificar apenas as alterações realizadas: https://github.com/AndriiPiatakha/learnit_java_core/commit/964112dd84f03adbabb16348bcca77555d4d1294

> Exercício 1 (Manipulação de genéricos): [exercicio_01](./exercicio_01/)
