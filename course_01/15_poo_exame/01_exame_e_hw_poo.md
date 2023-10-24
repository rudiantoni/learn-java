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

### EXAME: Loja Online
[[Topo]](#)<br />

Você tem que implementar um backend para uma loja online. O sistema deve suportar operações básicas, tais como:

- Registro de usuários (sign up)
- Entrada e saída de usuários (login e logout)
- Navegação no catálogo de produtos
- Adicionar produtos ao carrinho
- Enviar um pedido
- Realizar o checkout
- Gerenciamento de usuários
- E outros

Este código será usado na educação continuada e nos próximos tópicos e acabará com a criação do seu aplicativo de comércio eletrônico na web.

#### NAVEGAÇÃO DO MENU

##### Cenário: menu principal
- DADO: Sou um usuário do app
- QUANDO: Executo o programa
- ENTÃO: Vejo o menu principal

- Notas técnicas:
  - O menu principal consiste nos itens:
    - "1. Registrar"
    - "2. Entrar / Sair"
    - "3. Catálogo de Produtos"
    - "4. Meus Pedidos"
    - "5. Configurações"
    - "6. Lista de Clientes"
  - Quando o usuário estiver logado, então o item 2 deve ser alterado para Logout.

##### Cenário: parar o programa
- DADO: Sou um usuário do app
- E: Estou no menu principal
- QUANDO: Digito `exit` no console
- ENTÃO: A execução do programa é finalizada

##### Cenário: manipulação de entrada incorreta
- DADO: Sou um usuário do app
- QUANDO: Digito qualquer digito exceto 1, 2, 3, 4, 5 ou 6.
- ENTÃO: Vejo a mensagem de erro: "Apenas 1, 2, 3, 4, 5, 6 é permitido. Tente novamente."
- E: Sou redirecionado para o menu principal

#### REGISTRO DE USUÁRIO

##### Cenário: registro de novo usuário
- DADO: Sou um usuário do app
- E: Vejo o menu principal no console
- QUANDO: Digito 1 no console
- E: Seleciono "Registrar" no menu principal
- ENTÃO: O processo de registro se inicia
- E: Solicitado meu primeiro nome
- E: Solicitado meu último nome
- E: Solicitado meu email
- E: Solicitado minha senha
- E: App me registra com sucesso
- E: Vejo mensagem "Novo usuário criado"
- E: Sou redirecionado para o menu principal
- E: Ao invés de "Entrar" vejo o rótulo "Sair"

- Notas técnicas:
  - Cada novo usuário deve ter um ID.
  - O número do ID deve ser automaticamente incrementado para cada novo usuário (campo contador static deve ser parte da classe DefaultUser)

##### Cenário: registro de novo usuário - validação de email com sucesso: email é único 
- DADO: Sou um usuário do app
- E: Vejo o menu principal no console
- QUANDO: Digito 1 no console
- E: Seleciono "Registrar" no menu principal
- ENTÃO: O processo de registro se inicia
- E: Solicitado meu primeiro nome
- E: Solicitado meu último nome
- E: Solicitado meu email
- E: Digito um email único
- E: App me registra com sucesso
- E: Vejo mensagem "Novo usuário criado"
- E: Sou redirecionado para o menu principal
- E: Ao invés de "Entrar" vejo o rótulo "Sair"

##### Cenário: registro de novo usuário - validação de email com falha: email não é único 
- DADO: Sou um usuário do app
- E: Vejo o menu principal no console
- QUANDO: Digito 1 no console
- E: Seleciono "Registrar" no menu principal
- ENTÃO: O processo de registro se inicia
- E: Solicitado meu primeiro nome
- E: Solicitado meu último nome
- E: Solicitado meu email
- E: Digito um email NÃO único
- E: App não me registra
- E: Vejo mensagem "Este email já está em uso por outro usuárioo. Por favor, use outro email."
- E: Sou redirecionado para o menu principal

##### Cenário: registro de novo usuário - validação de email com falha: email vazio
- DADO: Sou um usuário do app
- E: Vejo o menu principal no console
- QUANDO: Digito 1 no console
- E: Seleciono "Registrar" no menu principal
- ENTÃO: O processo de registro se inicia
- E: Solicitado meu primeiro nome
- E: Solicitado meu último nome
- E: Solicitado meu email
- E: Digito um email vazio
- E: App não me registra
- E: Vejo mensagem "Você deve inserir um email para se registrar. Por favor, tente novamente."
- E: Sou redirecionado para o menu principal

#### ENTRAR

##### Cenário: entrar com sucesso
- DADO: Sou um usuário do app
- E: Vejo o menu principal no console
- QUANDO: Digito 2 no console
- E: Seleciono "Entrar" no menu principal
- ENTÃO: O processo para entrar se inicia
- E: Solicitado meu email
- E: Solicitado minha senha
- E: Credenciais do app são validas
- E: Vejo mensagem "Feliz em ter você de volta [primeiro nome] [último nome]!"
- E: Vejo o menu principal
- E: Ao invés de "Entrar" vejo o rótulo "Sair"

##### Cenário: entrar com falha
- DADO: Sou um usuário do app
- E: Vejo o menu principal no console
- QUANDO: Digito 2 no console
- E: Seleciono "Entrar" no menu principal
- ENTÃO: O processo para entrar se inicia
- E: Solicitado meu email
- E: Solicitado minha senha
- E: Credenciais do app NÃO são validas
- E: Vejo mensagem "Infelizmente, esse login e senha não existem."
- E: Vejo o menu principal

- Notas técnicas:
  - Credencians "NÃO válidas" significa que ou o usuário não existe, ou a senha está errada.

#### SAIR

##### Cenário: Sair com sucesso
- DADO: Sou um usuário do app
- E: Entrei
- E: Navego para o menu principal
- QUANDO: Digito 2 no console
- E: Seleciono "Sair" no menu principal
- ENTÃO: Vejo mensagem "Tenha um bom dia! Esperamos que você volte!"
- E: Vejo o menu principal
- E: Ao invés de "Sair" vejo o rótulo "Entrar"


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