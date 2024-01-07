# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Exercícios - 21. Stream API
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Homework
  - [21.1. Sobre a Stream API](#211-sobre-a-stream-api)
    - [Arquivo: HW - Stream API](./01_arquivos/homework/HW%20-%20Stream%20API.pdf)
- Exercícios
  - [21.1. Sobre a Stream API](#211-sobre-a-stream-api)
    - [Exercício 1](./exercicio_01/) ([enunciado](#biblioteca-básica))
    - [Exercício 2](./exercicio_02/) ([enunciado](#doces-e-presentes))
    - [Exercício 3](./exercicio_03/) ([enunciado](#filtrar-strings-pelo-comprimento))

### 21.1. Sobre a Stream API
[[Topo]](#)<br />
 
#### Biblioteca básica
[[Topo]](#)<br />

- Ver homework: [Arquivo: HW - Stream API](./01_arquivos/homework/HW%20-%20Stream%20API.pdf)

Implemente um programa de console que atenda aos seguintes requisitos:

- Implemente a classe Book que tem as seguintes propriedades:
  - int id - identificador único
  - String name - nome do livro
  - Author[] authors - array de autores
  - Publisher publisher - editora do livro
  - int publishingYear - ano de publicação
  - int amountOfPages - quantidade de páginas
  - BigDecimal price - preço do livro
  - CoverType coverType - tipo de encadernação do livro, enum (Paperback, Hardcover)
- Implemente a classe Author que tem as seguintes propriedades:
  - int id - identificador único
  - String firstName - primeiro nome do autor
  - String lastName - sobrenome do autor
- Implemente a classe Publisher que tem as seguintes propriedades:
  - int id - identificador único
  - String publisherName - nome da editora
- Implemente múltiplos construtores para as classes Book, Author e Publisher.
- Implemente o tipo enum CoverType com dois enums - Paperback e Hardcover
- Sobrescreva os métodos toString para as classes Book, Author e Publisher.
- Implemente a classe BookService com os seguintes métodos
```java
public Book[] filterBooksByAuthor(Author author, Book[] books) {
  // <escreva seu código aqui>
}
public Book[] filterBooksByPublisher(Publisher publisher, Book[] books) {
  // <escreva seu código aqui>
}
// os métodos mantêm livros com ano de publicação inclusivamente.
public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {
  // <escreva seu código aqui>
}
```
  - Todos os métodos devem usar stream api
- Implemente uma classe Demo que tem o método principal. Na classe Demo, realize as seguintes ações:
  - Crie um array de livros. Você pode usar a variável a seguir para fins de demonstração.
```java
Book[] books = new Book[] {
  new Book(1, "Livro 1", new Author[] { new Author(1, "Jon", "Johnson")}, new Publisher(1, "Editora 1"), 1990, 231, BigDecimal.valueOf(24.99), CoverType.PAPERBACK),
  new Book(2, "Livro 2", new Author[] { new Author(1, "Jon", "Johnson"), new Author(2, "William", "Wilson") }, new Publisher(2, "Editora 2"), 2000, 120, BigDecimal.valueOf(14.99), CoverType.PAPERBACK),
  new Book(3, "Livro 3", new Author[] { new Author(3, "Walter", "Peterson") }, new Publisher(1, "Editora 1"), 1997, 350, BigDecimal.valueOf(34.99), CoverType.HARDCOVER),
  new Book(4, "Livro 4", new Author[] { new Author(4, "Craig", "Gregory") }, new Publisher(3, "Editora 3"), 1992, 185, BigDecimal.valueOf(19.99), CoverType.PAPERBACK)
};
```
  - Crie uma instância do tipo BookService e demonstre o trabalho dos métodos BookService, nomeadamente - filterBooksByAuthor, filterBooksByPublisher, filterBooksAfterSpecifiedYear.

> Exercício 1 (Sobre a Stream API): [exercicio_01](./exercicio_01/)

#### Doces e presentes
[[Topo]](#)<br />

- Ver homework: [Arquivo: HW - Stream API](./01_arquivos/homework/HW%20-%20Stream%20API.pdf)

Implemente um programa de console que atenda aos seguintes requisitos:

- Implemente uma hierarquia de Sweet. Todos os Sweet devem ter as seguintes propriedades: name, weight e sugarWeight. Weight é o peso do doce específico em quilogramas, sugarWeight é o peso do açúcar neste doce em quilogramas.
  - Eu não quero dar direções específicas aqui para te dar a oportunidade de decidir o que funcionará melhor aqui para começar a descrever a hierarquia de Sweets: uma interface ou uma classe abstrata?
- Candy, Lollipop e Cookie - outros dois tipos da hierarquia de Sweet.
- Crie a classe Present. Present tem o seguinte comportamento:

```java
// o método filtra doces por peso de açúcar inclusivamente
public Sweet[] filterSweetsBySugarRange(double minSugarWeight, double maxSugarWeight) {
  // <escreva seu código aqui>
}
// o método calcula o peso total do presente
public double calculateTotalWeight() {
  // <escreva seu código aqui>
}
// o método que adiciona um doce ao presente
public void addSweet(Sweet sweet) {
  // <escreva seu código aqui>
}
// o método retorna uma cópia do array Sweet[] para que ninguém possa modificar o estado do presente sem o método addSweet().
// Além disso, o array não deve conter valores nulos.
public Sweet[] getSweets() {
  // <escreva seu código aqui>
}
```
- Durante a implementação desses métodos - use a stream API

> Exercício 2 (Sobre a Stream API): [exercicio_02](./exercicio_02/)

#### Filtrar strings pelo comprimento
[[Topo]](#)<br />

- Ver homework: [Arquivo: HW - Stream API](./01_arquivos/homework/HW%20-%20Stream%20API.pdf)

Implemente um programa de console que atenda aos seguintes requisitos:

- O programa começa e pede ao usuário para inserir palavras aleatórias separadas por espaço
- O programa pede ao usuário para inserir o comprimento mínimo da string para filtrar as palavras que foram inseridas
- O programa cria um objeto de array a partir das palavras inseridas
- O programa chama um método específico que recebe String[] como parâmetro e retorna um array de strings que contém palavras com comprimento igual ou superior ao valor especificado pelo usuário
- O método deve parecer com isso:
```java
public static String[] filterWordsByLength(int minLength, String[] words) {
  // <escreva seu código aqui>
}
```
- N.B.: durante a implementação deste método - use a stream API

> Exercício 3 (Sobre a Stream API): [exercicio_03](./exercicio_03/)
