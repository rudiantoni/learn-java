# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Formatação de strings
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [04_arquivos](./04_arquivos/)
- Projetos
  - [Projeto 1](./04_arquivos/) [(iniciado em)](#visão-geral)
- Conteúdo
  - [Visão geral](#visão-geral)
  - [Espaços reservados](#espaços-reservados)

### Visão geral
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./04_arquivos/proj_01/)

Em Java, a formatação de strings pode ser realizada de várias maneiras. A formatação de strings é útil para criar strings com aparência específica, incluir valores de variáveis em uma string formatada e muito mais. Vou apresentar algumas das técnicas comuns de formatação de strings em Java 8, incluindo a formatação de strings simples e a formatação de strings com placeholders.

**Formatação de strings simples**

A formatação de strings simples envolve a concatenação de várias partes de texto e variáveis para criar uma única string formatada. Você pode usar o operador + para concatenar strings e variáveis.

```java
String nome = "João";
int idade = 30;

String mensagem = "Olá, meu nome é " + nome + " e tenho " + idade + " anos.";
System.out.println(mensagem);
```

**Formatação de strings com String.format()**

O método String.format() permite criar strings formatadas usando um formato especificado e argumentos correspondentes. O formato é definido com espaços reservados, como %s para strings e %d para inteiros.

```java
String nome = "Maria";
int idade = 25;

String mensagem = String.format("Olá, meu nome é %s e tenho %d anos.", nome, idade);
System.out.println(mensagem);
```

**Formatação de Strings com System.out.printf()**

Você também pode usar o método System.out.printf() para imprimir strings formatadas diretamente no console. Funciona da mesma forma que o String.format(), mas imprime o resultado formatado no console.

```java
String nome = "Carlos";
int idade = 40;

System.out.printf("Olá, meu nome é %s e tenho %d anos.", nome, idade);
```

**Formatação de Strings com StringBuilder**

Se você precisa criar strings longas ou iterar sobre muitas concatenações de strings, é mais eficiente usar a classe StringBuilder. Ela permite criar strings mutáveis que podem ser modificadas eficientemente.

```java
String[] palavras = {"Isso", "é", "uma", "frase"};
StringBuilder sb = new StringBuilder();

for (String palavra : palavras) {
  sb.append(palavra).append(" ");
}

String fraseFormatada = sb.toString().trim(); // Remove o espaço em branco extra no final
System.out.println(fraseFormatada);
```

  - [Espaços reservados](#visão-geral)
  - [Espaços reservados](#espaços-reservados)

### Espaços reservados
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./04_arquivos/proj_01/)

Em Java, você pode usar vários espaços reservados (placeholders) para formatar strings usando os métodos String.format(), System.out.printf(), entre outros. Cada espaço reservado é representado por um caractere de porcentagem % seguido de um caractere que especifica o tipo de formatação que será aplicado. Abaixo estão os espaços reservados mais comuns para formatação de strings em Java:

- **%a ou %A**: Formata como uma representação hexadecimal de um número de ponto flutuante em formato hexadecimal de ponto flutuante IEEE 754, usando letras minúsculas ou maiúsculas para os dígitos hexadecimais.
- **%%**: Representa o caractere de porcentagem literal.
- **%b**: Formata como um valor booleano (true ou false).
- **%c ou %C**: Formata como um caractere em minúsculo ou maiúsculo.
- **%d**: Formata como um número inteiro decimal (int).
- **%e ou %E**: Formata como uma notação científica para números de ponto flutuante (exponencial) minúsculo ou maiúsculo.
- **%f**: Formata como um número de ponto flutuante (float ou double).
- **%g ou %G**: Formata como uma notação geral (float ou notação científica, o que for mais curto) para números de ponto flutuante maiúsculo ou minúsculo.
- **%h**: Formata como uma representação hexadecimal do código hash de um objeto.
- **%I**: Formata como um número inteiro em maiúsculas.
- **%L**: Formata como um longo inteiro.
- **%n**: Insere um caractere de nova linha de plataforma independente.
- **%o**: Formata como um número octal (base 8).
- **%s**: Formata como uma string. Pode ser usado para strings, objetos e outros tipos de dados.
- **%S**: Formata como uma string em letras maiúsculas.
- **%T**: Formata como uma representação de tipo.
- **%x ou %X**: Formata como um número hexadecimal minúsculo ou maíusculo.

Também é possível formatar as datas (por mais que seja recomendado utilizar a classe SimpleDateFormat para isso)

- **%t**: Formata como uma data e hora (consulte a documentação para obter opções detalhadas).
- **%b**: Formata como uma data e hora em formato de data curta e hora curta.
- **%B**: Formata como uma data e hora em formato de data longa e hora curta.
- **%c**: Formata como uma data e hora em formato de data curta e hora longa.
- **%D ou %F**: Formata como uma data em formato yyyy-MM-dd.
- **%R**: Formata como uma hora em formato HH:mm.
- **%r**: Formata como uma hora em formato hh:mm:ss a/p.
- **%Z**: Formata como o nome da zona horária.
- **%z**: Formata como o deslocamento da zona horária.
- **%U**: Formata como a semana do ano (0-52) onde domingo é o primeiro dia da semana.
- **%W**: Formata como a semana do ano (0-52) onde segunda-feira é o primeiro dia da semana.
- **%w**: Formata como o dia da semana (0-6), onde 0 é domingo e 6 é sábado.
- **%k ou %H**: Formata como a hora do dia em formato 24 horas (0-23).
- **%l ou %I**: Formata como a hora do dia em formato 12 horas (1-12).

Além desses espaços reservados, você também pode usar modificadores para controlar a largura do campo, a precisão decimal, alinhamento, preenchimento e muito mais. Por exemplo:

- **%10s**: Especifica uma largura de campo de 10 caracteres para a string.
- **%.2f**: Especifica a precisão decimal de 2 casas para um número de ponto flutuante.

Aqui está um exemplo que demonstra o uso de vários espaços reservados em uma formatação de string:

```java
String nome = "Maria";
int idade = 25;
double altura = 1.75;

String mensagem = String.format("Nome: %s, Idade: %d, Altura: %.2f metros", nome, idade, altura);
System.out.println(mensagem);
```

Isso produzirá uma saída formatada, substituindo os espaços reservados pelos valores apropriados. Certifique-se de consultar a documentação oficial de formatação de strings em Java para obter informações detalhadas sobre todas as opções de formatação disponíveis, pois existem muitos modificadores e opções adicionais que podem ser usados para atender às suas necessidades específicas.
