# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## O Enum
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [01_arquivos](./01_arquivos/)
- Homework
  - [HW - Enum](./01_arquivos/homework/HW%20-%20Enum.pdf)
  - [Homework: Enum por propriedade](#homework-enum-por-propriedade)
- Projetos
  - [Projeto 1](./01_arquivos/proj_01/) [(iniciado em)](#o-tipo-enum)
- (se existir exercícios) Exercícios
  - [Exercício N](folder_link-exercicio_nn) ([enunciado](#statement_content_link))
- Conteúdo
  - [O tipo Enum](#o-tipo-enum)
  - [Declaração](#declaração)
  - [Inicialização](#inicialização)
  - [Comparações](#comparações)
  - [Iterando nos valores](#iterando-nos-valores)
  - [Propriedades personalizadas](#propriedades-personalizadas)
  - [Métodos personalizados](#métodos-personalizados)

### O tipo Enum
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./01_arquivos/proj_01/)

Um enum (enumeração) em Java é um tipo de dado especial que consiste em um conjunto fixo de constantes nomeadas.

Enums são usados para representar valores que não mudam com o tempo, como dias da semana, meses, opções de menu etc.

Eles oferecem uma maneira mais segura e legível de representar essas constantes.

### Declaração
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./01_arquivos/proj_01/)

```java
enum DiaDaSemana {
  DOMINGO, SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO
}

enum Mes {
  JANEIRO, FEVEREIRO, MARCO, ABRIL, MAIO, JUNHO, JULHO, AGOSTO, SETEMBRO, OUTUBRO, NOVEMBRO, DEZEMBRO
}
```

### Inicialização
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./01_arquivos/proj_01/)

```java
DiaDaSemana dia = DiaDaSemana.SEGUNDA;
Mes mes = Mes.JULHO;

DiaDaSemana dia1 = DiaDaSemana.valueOf("SEGUNDA");
Mes mes1 = Mes.valueOf("JULHO");
```

### Comparações
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./01_arquivos/proj_01/)

```java
DiaDaSemana dia1 = DiaDaSemana.SEGUNDA;
DiaDaSemana dia2 = DiaDaSemana.TERCA;

if (dia1 == dia2) {
  System.out.println("Os dias são iguais.");
} else {
  System.out.println("Os dias são diferentes.");
}
```

### Iterando nos valores
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./01_arquivos/proj_01/)

```java
for (DiaDaSemana dia : DiaDaSemana.values()) {
  System.out.println("Dia: " + dia);
}

for (Mes mes : Mes.values()) {
  System.out.println("Mês: " + mes);
}
```

### Propriedades personalizadas
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./01_arquivos/proj_01/)

Você pode adicionar propriedades personalizadas a cada constante Enum. Por exemplo, atribuir um valor inteiro a cada mês:

```java
enum Mes {
  JANEIRO(1), FEVEREIRO(2), MARCO(3), ABRIL(4), MAIO(5), JUNHO(6), JULHO(7), AGOSTO(8), SETEMBRO(9), OUTUBRO(10), NOVEMBRO(11), DEZEMBRO(12);

  private final int numero;

  Mes(int numero) {
    this.numero = numero;
  }

  public int getNumero() {
    return numero;
  }
}

// Exemplo de uso:
Mes mes = Mes.JANEIRO;
System.out.println(mes + " tem o número " + mes.getNumero());
```

### Métodos personalizados
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./01_arquivos/proj_01/)

Você pode adicionar métodos personalizados a um enum. Aqui está um exemplo com um método que verifica se um mês está no verão:

```java

enum Mes {
  JANEIRO, FEVEREIRO, MARCO, ABRIL, MAIO, JUNHO, JULHO, AGOSTO, SETEMBRO, OUTUBRO, NOVEMBRO, DEZEMBRO;

  public boolean ehVerao() {
    return this == DEZEMBRO || this == JANEIRO || this == FEVEREIRO;
  }
}

// Exemplo de uso:
Mes mes = Mes.JULHO;
if (mes.ehVerao()) {
  System.out.println(mes + " é um mês de verão.");
} else {
  System.out.println(mes + " não é um mês de verão.");
}
```

### Homework: Enum por propriedade
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

Se exercício:
> Exercício N ((nome do vídeo, aula, etc)): [caminho](pasta_exercicio-exercicio_nn)
