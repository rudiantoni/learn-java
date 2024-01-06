# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

# 1.1. Por que Java e por que este curso? O que é JDK, JRE e JVM?
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [01_arquivos](./01_arquivos/)
- Homework
  - [Arquivo: HW - What is Java and JDK](./01_arquivos/homework/HW%20-%20What%20is%20Java%20and%20JDK.pdf)
- Conteúdo
  - [História do Java](#história-do-java)
  - [Por que Java?](#por-que-java)
  - [O que você pode implementar com Java?](#o-que-você-pode-implementar-com-java)
  - [O que é JVM?](#o-que-é-jvm)
  - [O que é JRE?](#o-que-é-jre)
  - [O que é JDK?](#o-que-é-jdk)

## História do Java
[[Topo]](#)<br />

Java foi concebido em 1991 por James Gosling na empresa Sun Microsystems, sob o projeto ainda chamado de *Oak*.

Java foi muito influenciado por C++.

O projeto foi renomeado para *Java* em 1995.

O Java é coinsiderado uma das linguagens de programação mais populares hoje em dia por alguns motivos:
- Independência de plataforma
- Multithread
- Segurança
- Fácil aprendizagem
- Orientação a Objetos nativo
- Robustez

Sun Microsystems foi comprada pela Oracle em 2010.

### Por que Java?
[[Topo]](#)<br />

Por que você deve começar a aprender Java e quais vantagens ele tras sob outras linguagens?
- Fácil aprendizagem
  - Não é necessário conhecer nada sobre gerenciamento de memória para iniciar, pois isso fica a cargo da JVM e do Garbage Collector.
  - A sintaxe é muito mais legível do que C, C++ ou qualquer outra linguagem.
  - Por ser uma linguagem fortemente tipada, ele previne que vários erros primários ocorram.
  - O compilador irá apontar exatamente aonde estão os erros encontrados quando a aplicação estiver sendo compilada.
- Java pode fazer tudo
  - É possível desenvolver softwares para PCs, Web, Mobile e até mesmo aplicações empresariais complexas.
- Comunidade gigante
  - Aumenta o sucesso com o suporte. Pois a chance de alguém já ter tido o mesmo problema que você está tendo é muito alta e provavelmente este alguém já terá dito suas respostas.
- Android
  - O Android é sistema operacional mais popular para dispositivos mobile em 2018.
- JVM
  - Java Virtual Machine, permite que o código desenvolvido para um computador Windows possa ser executado na Linux e no MAC.
- Independência de plataforma

### O que você pode implementar com Java?
[[Topo]](#)<br />

É possível implementar aplicações desktop, mobile e web.

### O que é JVM?
[[Topo]](#)<br />

JVM significa Java Virtual Machine, em português Máquina Virtual Java.

É um programa escrito em C++ que é o responsável por converter código de bytes (bytecode) para o código de uma máquina específica.

A JVM é a razão pela qual o Java é conhecido por ser independente de plataforma.

O código fonte desenvolvido é compilado em um bytecode, esse bytecode é então executado na JVM.

A JVM é usada para ambos:
- Traduzir o bytecode no código de máquina de um computador em particular
- Executar as instruções correspondentes na linguagem de máquina específica

> Sem uma JVM você não pode executar uma aplicação Java.

### O que é JRE?
[[Topo]](#)<br />

JRE significa Java Runtime Environment, em português Ambiente de Execução Java.

O JRE inclui a JVM em si com a adição de binários e classes java os quais são necessários para executar os programas.

### O que é JDK?
[[Topo]](#)<br />

JDK significa Java Development Kit, em português Kit de Desenvolvimento Java.

O JDK inclui a JVM e o JRE com a adição de todas as ferramentas que são necessárias para o desenvolvimento de programas Java.

Por exemplo o compilador *javac*, o depurador *jdb*, e o gerador de documentação *javadoc*.
