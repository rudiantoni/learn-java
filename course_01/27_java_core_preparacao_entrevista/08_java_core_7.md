# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## 27.8. Java Core parte 7: Perguntas e respostas
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Conteúdo
  - [Perguntas e respostas](#perguntas-e-respostas)

### Perguntas e respostas
[[Topo]](#)<br />

**O QUE É UM StringJoiner?**

StringJoiner é utilizado para criar uma sequência de caracteres separados por delimitadores que pode (ou não) começar com um prefixo e terminar com um sufixo.

**O QUE SÃO MÉTODOS PADRÃO?**

A partir do Java 8, podemos usar métodos padrão e métodos estáticos em interfaces. Um método padrão é um método em uma interface com lógica padrão que não é obrigatória de ser implementada durante a implementação da interface.

**O QUE SÃO MÉTODOS ESTÁTICOS EM INTERFACES?**

Métodos estáticos em uma interface são essencialmente os mesmos que métodos estáticos em uma classe abstrata. Métodos estáticos em uma interface são parte da interface, não podemos usá-los em objetos da classe de implementação. Métodos estáticos em uma interface são bons para fornecer métodos auxiliares como verificar se é nulo, ordenar coleções, etc. Métodos estáticos em uma interface ajudam a fornecer segurança, impedindo que classes que implementam a interface os substituam.

**O QUE É OPTIONAL?**

Optional é um contêiner de objetos, pode conter um valor, ou algum tipo T, ou simplesmente ser nulo. Fornece muitos métodos úteis para evitar adicionar verificações repetidas de se é nulo/não nulo, permitindo que nos concentremos no que queremos fazer.

O método isPresent() retorna verdadeiro se a instância Optional contiver um valor não nulo e falso caso contrário. O método orElseGet() contém um mecanismo de fallback para resultar se o Optional for nulo, aceitando funções para gerar um valor padrão. O método map() transforma o valor atual de Optional e retorna uma nova instância de Optional. O método orElse() é semelhante ao orElseGet(), mas em vez de uma função, ele recebe um valor padrão.

**O QUE É NASHORN?**

Nashorn é um motor de JavaScript desenvolvido inteiramente em Java pela Oracle. É projetado para permitir que o código JavaScript seja incorporado em aplicações Java. Comparado ao Rhino, que é mantido pela Fundação Mozilla, Nashorn proporciona um desempenho de 2x a 10x melhor porque compila diretamente o código na memória e passa o bytecode para a Máquina Virtual Java. Nashorn pode compilar código JavaScript e gerar classes Java que são carregadas por um carregador especial. É possível chamar código Java diretamente do JavaScript.

**O QUE É JJS EM JAVA?**

Nashorn vem com uma utilidade de linha de comando jjs que permite executar JavaScript diretamente no console. jjs aceita uma lista de arquivos fonte JavaScript e os executa. Para executar o arquivo, vamos passá-lo como um argumento para jjs:

jjs nomeDoArquivo.js

**O QUE É LocalDateTime?**

LocalDateTime combina LocaleDate e LocalTime juntos e contém a data e a hora, mas sem o fuso horário no sistema de calendário ISO-8601. O tempo é armazenado com precisão de nanossegundo, então LocalTime pode armazenar, por exemplo, o valor "13:45.30.123456789".

Existem muitos métodos úteis como plusMinutes, plusHours, isAfter, toSecondOfDay, etc.

**O QUE É ZonedDateTIme?**

ZonedDateTime é semelhante ao java.util.Calendar. Esta é a classe mais poderosa com informações completas sobre o contexto do tempo, incluindo o fuso horário. Contém a data e a hora no sistema de calendário ISO-8601.
