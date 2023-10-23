# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Exame e homework para o tópico POO
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [01_arquivos](./01_arquivos/)
- Homework
  - [Arquivo: HW - OOP](./01_arquivos/homework/HW%20-%20OOP.pdf)
  - [Classes](#classes)
  - [Herança e Polimorfismo](#herança-e-polimorfismo)
  - [Classes internas e aninhadas](#classes-internas-e-aninhadas)
  - ...
- Exercícios
  - [Exercício 1](./01_arquivos/exercicio_01/) ([enunciado](#classes))
  - [Exercício 2](./01_arquivos/exercicio_02/) ([enunciado](#herança-e-polimorfismo))
  - [Exercício 3](./01_arquivos/exercicio_03//) ([enunciado](#classes-internas-e-aninhadas))
  - ...
- Conteúdo
  - [Classes](#classes)
  - [Herança e Polimorfismo](#herança-e-polimorfismo)
  - [Classes internas e aninhadas](#classes-internas-e-aninhadas)
  - ...

### Classes
[[Topo]](#)<br />

Implemente um programa de console que atenda aos seguintes requisitos:

Implemente a classe Book (Livro) que possui as seguintes propriedades:

- int id - identificador único
- String name - nome do livro
- Author[] authors - array de autores
- Publisher publisher - editora do livro
- int publishingYear - ano de publicação
- int amountOfPages - quantidade de páginas
- BigDecimal price - preço do livro
- CoverType coverType - tipo de encadernação do livro, enum (Brochura, Capa Dura)

Implemente a classe Author (Autor) que possui as seguintes propriedades:

- int id - identificador único
- String firstName - primeiro nome do autor
- String lastName - sobrenome do autor

Implemente a classe Publisher (Editora) que possui as seguintes propriedades:

- int id - identificador único
- String publisherName - nome da editora

Implemente múltiplos construtores para as classes Book, Author e Publisher.

Implemente o enum CoverType (Tipo de Encadernação) com dois valores - Paperback and Hardcover.

Sobrescreva os métodos toString para as classes Book, Author e Publisher.

Implemente a classe BookService (Serviço de Livros) com os seguintes métodos:

```java
public Book[] filterBooksByAuthor(Author author, Book[] books) {
	// <write your code here>
}

public Book[] filterBooksByPublisher(Publisher publisher, Book[] books) {
	// <write your code here>
}

// methods keeps books with publishing year inclusively. 
public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {
	// <write your code here>
}
```

Implemente uma classe Demo que contenha o método main. Na classe Demo, execute as seguintes ações:

```java
Book[] books = new Book[] {
new Book(1, "Book_1", new Author[] { new Author(1, "Jon", "Johnson") }, new Publisher(1, "Publisher_1"), 1990, 231, BigDecimal.valueOf(24.99), CoverType.PAPERBACK),

new Book(2, "Book_2", new Author[] { new Author(1, "Jon", "Johnson"), new Author(2, "William", "Wilson") }, new Publisher(2, "Publisher_2"), 2000, 120, BigDecimal.valueOf(14.99), CoverType.PAPERBACK),

new Book(3, "Book_3", new Author[] { new Author(3, "Walter", "Peterson") }, new Publisher(1, "Publisher_1"), 1997, 350, BigDecimal.valueOf(34.99), CoverType.HARDCOVER),

new Book(4, "Book_4", new Author[] { new Author(4, "Craig", "Gregory") }, new Publisher(3, "Publisher_3"), 1992, 185, BigDecimal.valueOf(19.99), CoverType.PAPERBACK) };
```

Crie uma instância do tipo BookService e demonstre o funcionamento dos métodos de BookService, ou seja, filterBooksByAuthor, filterBooksByPublisher, filterBooksAfterSpecifiedYear.

> Exercício 1 (Exame e homework para o tópico POO): [01_arquivos/exercicio_01](./01_arquivos/exercicio_01/)

### Herança e Polimorfismo
[[Topo]](#)<br />

Implemente um programa de console com os seguntes requisitos:

- Implemente uma hierarquia de Sweets (doces). Todos os doces devem possuir as seguintes propriedades: name, weight e sugarWeight. Weight é o peso´de um doce em kilogramas, sugarWeight é o peso do açúcar neste doce em kilogramas.

Eu não quero fornecer instruções específicas aqui para dar a você a oportunidade de decidir o que funcionará melhor para começar a descrever a hierarquia de Doces: uma interface ou uma classe abstrata?

Candy, Lollipop e Cookie - são três outros tipos na hierarquia de Doces.

Crie a classe Present (presente). O presente tem o seguinte comportamento:

```java
// O método filtra doces pelo peso do açucar inclusive
public Sweet[] filterSweetsBySugarRange(double minSugarWeight, double maxSugarWeight) {
	// <write your code here>
}

// O método calcula o total de peso no presente
public double calculateTotalWeight() {
	// <write your code here>
}

// O método adiciona um doce ao presente
public void addSweet(Sweet sweet) {
	// <write your code here>
}

// O método retorna uma copa do arrai Sweet[] para que ninguém
// possa modificar o estado do presente sem o método addSweet()
// O array também não pode conter valores nulos
public Sweet[] getSweets() {
	// <write your code here>
}
```

> Exercício 2 (Exame e homework para o tópico POO): [01_arquivos/exercicio_02](./01_arquivos/exercicio_02/)

### Classes internas e aninhadas
[[Topo]](#)<br />

Implemente um programa de console que atenda aos seguintes requisitos:
Implemente a classe Account (Conta). A classe Account possui os seguintes campos:

- int id
- Transaction[] transactions (transações)

Implemente o enum StandardAccountOperations (Operações Padrão da Conta) que contém os seguintes valores:

- MONEY_TRANSFER_SEND (Enviar dinheiro)
- MONEY_TRANSFER_RECEIVE (Receber dinheiro)
- WITHDRAW (Sacar)

Implemente a classe Transaction (Transação) aninhada, que possui os seguintes campos:

- Account accountFrom (conta de origem)
- Account accountTo (conta de destino)
- double moneyAmount (quantia em dinheiro)
- StandardAccountOperations operation (operação padrão da conta)

Na classe Account, implemente os seguintes métodos:

> Exercício 3 (Exame e homework para o tópico POO): [01_arquivos/exercicio_03](./01_arquivos/exercicio_03/)

```java
public void sendMoneyToAccount(Account accountTo, double moneyAmount) {
	// <write your code here>
}

public void withdrawMoney(double moneyAmount) {
	// <write your code here>
}

public Transaction[] getTransactions() {
	// <write your code here>
}
```

Preste atenção que quando dinheiro é enviado de uma conta para outra, uma transação MONEY_TRANSFER_SEND (Enviar dinheiro) é criada em uma conta, e a segunda transação MONEY_TRANSFER_RECEIVE (Receber dinheiro) é criada na outra conta.

### (nome do vídeo, aula, etc)
[[Topo]](#)<br />



### (nome do vídeo, aula, etc)
[[Topo]](#)<br />



### (nome do vídeo, aula, etc)
[[Topo]](#)<br />



### (nome do vídeo, aula, etc)
[[Topo]](#)<br />



### (nome do vídeo, aula, etc)
[[Topo]](#)<br />



### (nome do vídeo, aula, etc)
[[Topo]](#)<br />



### (nome do vídeo, aula, etc)
[[Topo]](#)<br />



### (nome do vídeo, aula, etc)
[[Topo]](#)<br />



### (nome do vídeo, aula, etc)
[[Topo]](#)<br />



### (nome do vídeo, aula, etc)
[[Topo]](#)<br />


Se homework:
- Ver homework: [file_name_no_extension](file_link)
Se projeto:
- Ver projeto: [Projeto N](folder_link-proj_nn)

Lista ordenada
1. Lista item 1
2. Lista item 2
3. Lista item 3

Lista desordenada
- Lista item 1
- Lista item 2
- Lista item 3

`linha de codigo`

Bloco de código

```
bloco de código {

}
```

Se exercício:
> Exercício N ((nome do vídeo, aula, etc)): [caminho](pasta_exercicio-exercicio_nn)

Enunciado de pesquisa:
- Em Java 8, o que é xxx?(com exemplos de código)...
- Em Java 8, o que é xxx?(com exemplos de código)...
- Em Java 8, o que é xxx?(com exemplos de código)...