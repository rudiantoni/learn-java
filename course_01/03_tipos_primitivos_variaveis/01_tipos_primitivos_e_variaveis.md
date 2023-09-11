# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

# Tipos Primitivos e Variáveis
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [01_arquivos](./01_arquivos/)
- Homework: [HW - Primitive Types.pdf](./01_arquivos/homework/HW%20-%20Primitive%20Types.pdf)
- Projetos
  - [Projeto 1](./01_arquivos/proj_01/) [(iniciado em)](#variáves)
- Conteúdo
  - [Quais tipos de dados existem em Java?](#quais-tipos-de-dados-existem-em-java)
  - [Tipos primitivos](#tipos-primitivos)
  - [Variáves](#variáves)

### Quais tipos de dados existem em Java?
[[Topo]](#)<br />

Existem 2 grupos principais de tipos de dados em Java: os *primitive types* e os *reference types*.

**Primitive Types**
- Integers
- Números Floating-point
- Booleans
- Characters

**Reference Types**
- Classes
- Annotations
- Interfaces
- Enumerations
- Arrays

A principal diferença é que os tipos primitivos armazenam um valor, e os tipos de referência armazenam um endereço de um objeto a que ele se refere.

### Tipos primitivos
[[Topo]](#)<br />

| Tipo | Tamanho | Valor mínimo | Valor máximo | Tipo encapsulador |
|---|---|---|---|---|
| Integers |  |  |  |  |
| byte | 1 byte | -128 | 127 | Byte |
| short | 2 bytes | -2^15 (-32768) | -2^15 -1(-32767) | Short |
| int | 4 bytes | -2^31 (-2147483648) | -2^31 (-2147483647) | Integer |
| long | 8 bytes | -2^63 (-9223372036854755808) | -2^63 (-9223372036854755807) | Long |
| Floating-Point |  |  |  |  |
| float | 4 bytes | Nota 1 | Nota 1 | Float |
| double | 8 bytes | Nota 2 | Nota 2 | Double |
| Boolean |  |  |  |  |
| boolean | Dependente da máquina virtual | false | true | Boolean |
| Characters |  |  |  |  |
| char | 2 bytes | 0 | 65535 | Character |
- *Nota 1*: Aproximadamente +- 3.40282347e+38F (6 - 7 dígitos decimais significativos). Java implemente o padrão Float IEEE 754.
- *Nota 2*: Aproximadamente +- 1.79769313486231570e+308 (15 dígitos decimais significativos).

### Variáves
[[Topo]](#)<br />

- Ver homework: [HW - Primitive Types.pdf](./01_arquivos/homework/HW%20-%20Primitive%20Types.pdf)
- Ver projeto: [Projeto 1](./01_arquivos/proj_01/)

Java é uma linguagem fortemente tipada (strongly typed)

- Cada variável tem um tipo
- Cada expressão tem um tipo
- Cada tipo é extritamente definido

- Uma variávei em Java é uma parte da memória que pode conter um valor
- Java é uma linguagem fortemente tipada: Cada variável tem um tipo
- Uma variável é definida pela combinação entre um identificador e um tipo
- *Para Java >= 10*: Você pode declarar uma variável com a palavra chave *var* - neste caso o tipo da variável será definido pelo compilador.
- Todas as variáveis têm um escopo, o qual define a sua visibilidade.
- Você não pode nomear uma variável com uma palavra-chave Java.
