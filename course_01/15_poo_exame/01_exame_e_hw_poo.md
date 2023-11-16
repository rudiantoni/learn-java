# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Exame e homework para o tópico POO
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [01_arquivos](./01_arquivos/)
- Homework
  - [Arquivo: HW - OOP](./01_arquivos/homework/HW%20-%20OOP.pdf)
  - [Classes](#classes)
  - [Herança e Polimorfismo](#herança-e-polimorfismo)
  - [Classes internas e aninhadas](#classes-internas-e-aninhadas)
  - [EXAME: Loja Online](#exame-loja-online)
- Exercícios
  - [Exercício 1](./01_arquivos/exercicio_01/) ([enunciado](#classes))
  - [Exercício 2](./01_arquivos/exercicio_02/) ([enunciado](#herança-e-polimorfismo))
  - [Exercício 3](./01_arquivos/exercicio_03//) ([enunciado](#classes-internas-e-aninhadas))
  - [Exercício 4](./01_arquivos/exercicio_04/) ([enunciado](#exame-loja-online))
- Conteúdo
  - [Classes](#classes)
  - [Herança e Polimorfismo](#herança-e-polimorfismo)
  - [Classes internas e aninhadas](#classes-internas-e-aninhadas)
  - [EXAME: Loja Online](#exame-loja-online)

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
- Finalizar compra
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
  - Credenciais "NÃO válidas" significa que ou o usuário não existe, ou a senha está errada.

#### SAIR

##### Cenário: sair com sucesso
- DADO: Sou um usuário do app
- E: Entrei
- E: Navego para o menu principal
- QUANDO: Digito 2 no console
- E: Seleciono "Sair" no menu principal
- ENTÃO: Vejo mensagem "Tenha um bom dia! Esperamos que você volte!"
- E: Vejo o menu principal
- E: Ao invés de "Sair" vejo o rótulo "Entrar"

#### CATÁLOGO DE PRODUTOS

##### Cenário: listar produtos
- DADO: Sou um usuário do app
- QUANDO: Digito 3 no console
- E: Seleciono "Catálogo de Produtos" no menu principal
- ENTÃO: Vejo uma lista de produtos impressos no console.

- Notas técnicas:
  - Produto tem os seguintes campos:
    - int id
    - String productName
    - String categoryName
    - double price

##### Cenário: navegar de volta ao menu principal
- DADO: Sou um usuário do app
- E: Naviguei para o menu "Catálogo de Produtos"
- QUANDO: Digito "menu" no console
- ENTÃO: Sou redirecionado para o menu principal.

##### Cenário: adicionar um produto ao carrinho
- DADO: Sou um usuário do app
- E: Entrei
- E: Digito 3 no console
- E: Seleciono "Catálogo de Produtos" no menu principal
- E: Vejo a lista de produtos
- E: Vejo mensagem "Digite o id do produto para adicioná-lo ao carrinho ou "menu" se você quiser navegar de volta ao menu principal".
- QUANDO: Digito algum id de produto existente
- ENTÃO: Vejo mensagem "Produto [nome produto] foi adicionado ao seu carrinho. Se você quiser adicionar um novo produto, digite o id do produto. Se você quiser proceder com a finalização da compra, digite "checkout" no console
- E: Vejo a lista de produtos novamente.

##### Cenário: adicionar um produto ao carrinho: manipulação de erros
- DADO: Sou um usuário do app
- E: Entrei
- E: Digito 3 no console
- E: Seleciono "Catálogo de Produtos" no menu principal
- E: Vejo a lista de produtos
- E: Vejo mensagem "Digite o id do produto para adicioná-lo ao carrinho ou "menu" se você quiser navegar de volta ao menu principal".
- QUANDO: Digito algum número aleatório qualquer que não corresponde a nenhum id de produto
- ENTÃO: Vejo mensagem: "Por favor, digite um id de produto se você quiser adicionar um produto ao carrinho. Ou digite "checkout" se você quiser prosseguir com a finalização da compra. Ou digite "menu" se você quiser navegar de volta para o menu principal.
- E: Vejo a lista de produtos novamente

#### FINALIZAR COMPRA

##### Cenário: finalização de compra bem-sucedida
- DADO: Sou um usuário do app
- E: Entrei
- E: Digito 3 no console
- E: Seleciono "Catálogo de Produtos" no menu principal
- E: Vejo a lista de produtos
- E: Vejo mensagem "Digite o id do produto para adicioná-lo ao carrinho ou "menu" se você quiser navegar de volta ao menu principal"
- E: Adiciono produtos ao carrinho
- QUANDO: Digito "checkout" no console
- ENTÃO: Vejo mensagem "Digite o número do seu cartão de crédito sem espaços e pressione "Enter" se você confirmar a compra"
- E: Insiro o número do cartão de crédito
- E: Pressiono Enter
- E: Vejo mensagem "Muito obrigado pela sua compra. Detalhes sobre a entrega do pedido foram enviados para o seu e-mail."
- E: Retorno ao menu principal

- Notas técnicas:
  - O carrinho deve ser esvaziado após a criação do pedido

##### Cenário: manipulação de erros: carrinho vazio
- DADO: Sou um usuário do app
- E: Entrei
- E: Digito 3 no console
- E: Seleciono "Catálogo de Produtos" no menu principal
- E: Vejo a lista de produtos
- E: Vejo mensagem "Digite o id do produto para adicioná-lo ao carrinho ou "menu" se você quiser navegar de volta ao menu principal"
- E: Tenho um carrinho vazio porque ainda não adicionei produtos a ele.
- QUANDO: Digito "checkout"
- ENTÃO: Vejo a mensagem: "Seu carrinho está vazio. Por favor, adicione produtos ao seu carrinho antes de tentar finalizar a compra."
- E: Vejo a lista de produtos novamente

##### Cenário: manipulação de erros: usuário não logado
- DADO: Sou um usuário do app
- E: NÃO entrei
- E: Digito 3 no console
- E: Seleciono "Catálogo de Produtos" no menu principal
- E: Vejo a lista de produtos
- E: Vejo mensagem "Digite o id do produto para adicioná-lo ao carrinho ou "menu" se você quiser navegar de volta ao menu principal"
- QUANDO: Adiciono produtos ao carrinho
- ENTÃO: Vejo mensagem: "Você não entrou. Por favor entre ou crie uma nova conta.
- E: Sou redirecionado para o menu principal.

##### Cenário: manipulação de erros: cartão de crédito inválido
- DADO: Sou um usuário do app
- E: Entrei
- E: Digito 3 no console
- E: Seleciono "Catálogo de Produtos" no menu principal
- E vejo a lista de produtos
- E: Vejo mensagem "Digite o id do produto para adicioná-lo ao carrinho ou "menu" se você quiser navegar de volta ao menu principal"
- E: Adiciono produtos ao carrinho
- QUANDO: Digito "checkout" no console
- ENTÃO: Vejo mensagem "Digite o número do seu cartão de crédito sem espaços e pressione "Enter" se você confirmar a compra"
- E: Digito um cartão de crédito inválido
- E: Pressiono "Enter"
- E: Vejo mensagem: "Você digitou um cartão de crédito inválido. Cartões de créditos válidos devem possuir 16 dígitos. Por favor, tente novamente."
- E: Sou solicitado a digitar o número do cartão de crédito novamente.

- Notas técnicas
  - Implementar a validação de um cartão de crédito: qualquer 16 dígitos.
  - Por segurança, limitar a quantidade máxima de tentativas para 3. Caso falhe, não realizar o procedimento e retornar ao "Catálogo de Produtos".

#### MEUS PEDIDOS

##### Cenário: listar meus pedidos
- DADO: Sou um usuário do app
- E: Entrei
- E: Digito 4 no console
- E: Seleciono "Meus Pedidos" no menu principal
- ENTÃO: Navego para "Meus Pedidos"
- E: Vejo a lista de todas as minhas compras
- E: Sou redirecionado para o menu principal.

##### Cenário: listar meus pedidios - manipulação de erro - usuário não entrou
- DADO: Sou um usuário do app
- E: NÃO Entrei
- E: Digito 4 no console
- E: Seleciono "Meus Pedidos" no menu principal
- ENTÃO: Vejo mensagem: "Por favor, entre ou crie uma nova conta para ver a listagem de seus pedidos."
- E: Sou redirecionado para o menu principal.

##### Cenário: listar meus pedidios - manipulação de erro - pedido vazio
- DADO: Sou um usuário do app
- E: Entrei
- E: Não tenho nenhuma compra registrada ainda
- QUANDO: Digito 4 no console
- E: Seleciono "Meus Pedidos" no menu principal
- ENTÃO: Navego para "Meus Pedidos"
- E: Vejo mensagem: "Infelizmente, você não realizou nenhum pedido ainda. Volte para o menu principal para fazer um pedido."


#### CONFIGURAÇÕES

##### Cenário: alterar senha
- DADO: Sou um usuário do app
- E: Entrei
- QUANDO: Digito 5 no console
- E: Seleciono "Configurações" no menu principal
- E: Vejo a lista de opções disponíveis
- E: Digito 1 no console
- E: Seleciono "Mudar Senha"
- E: Sou solicitado a digitar uma nova senha
- QUANDO: Digito uma nova senha
- ENTÃO: Vejo mensagem: "Sua senha foi alterada com sucesso".
- E: Sou redirecionado para o menu principal.

##### Cenário: alterar email
- DADO: Sou um usuário do app
- E: Entrei
- QUANDO: Digito 5 no console
- E: Seleciono "Configurações" no menu principal
- E: Vejo a lista de opções disponíveis
- E: Digito 2 no console
- E: Seleciono "Mudar Email"
- E: Sou solicitado a digitar um novo email
- QUANDO: Digito um novo email
- ENTÃO: Vejo mensagem: "Seu email foi alterado com sucesso".
- E: Sou redirecionado para o menu principal.

##### Cenário: configurações - manipulação de erros - opção inválida
- DADO: Sou um usuário do app
- E: Entrei
- QUANDO: Digito 5 no console
- E: Seleciono "Configurações" no menu principal
- E: Vejo a lista de opções disponíveis
- E: Digito qualquer opção exceto 1 ou 2.
- ENTÃO: Vejo mensagem "Apenas 1 e 2 é permitido. Tente novamente."
- E: Vejo o menu de configurações novamente.

##### Cenário: configurações - navegar de volta ao menu principal
- DADO: Sou um usuário do app
- E: Entrei
- QUANDO: Digito 5 no console
- E: Seleciono "Configurações" no menu principal
- QUANDO: Digito "menu"
- ENTÃO: Navego de volta ao menu principal

##### Cenário: configurações - manipulação de erros - usuário não entrou
- DADO: Sou um usuário do app
- E: NÃO Entrei
- QUANDO: Digito 5 no console
- E: Seleciono "Configurações" no menu principal
- ENTÃO: Vejo mensagem: "Por favor, entre ou cria uma nova conta para alterar suas configurações."
- E: Sou redirecionado para o menu principal.

#### LISTA DE CLIENTES

##### Cenário: Imprimir lista de clientes para o console
- DADO: Sou um usuário do app
- E: Entrei
- QUANDO: Digito 6 no console
- E: Seleciono "Lista de Clientes" no menu principal
- ENTÃO: Vejo a lista dos clientes
- QUANDO: Digito "menu"
- E: Sou redirecionado para o menu principal.

- Notas técnicas
  - Nós não devemos imprimir a senha do cliente.


#### Detalhes técnicos

- A instância de cada serviço (UserManagementService, OrderManagementService, ProductManagementService, ApplicationContext) existem em uma única cópia durante a execução do programa. O acesso a esta cópia única é possível via o método estático getInstance() do tipo específico. E não posso criar objetos com estes tipos via um construtor.

- Cada implementação de service deve possuir este método:

```java
void clearServiceState();
```

Para fins de teste, Este método deve resetar o estado do serviço para o padrão. Leve em consideração a instância de cada serviço estará em uma cópia única, nossos testes têm que possuir este método que resetarão o estado do serviço para reproduzir diferentes casos de teste.

Para resetar o contador de usuários, implemente o método `clearState()` na classe DefaultUser.

- Durante a implementação desta tarefa, você tem que implementar seguintes interfaces:

```java
public interface Cart {
  boolean isEmpty();
  void addProduct(Product productById);
  Product[] getProducts();
  void clear();
}

public interface Order {
  boolean isCreditCardNumberValid(String userInput);
  void setCreditCardNumber(String userInput);
  void setProducts(Product[] products);
  void setCustomerId(int customerId);
  int getCustomerId();
}

public interface Product {
  int getId();
  String getProductName();
}

public interface User {
  String getFirstName();
  String getLastName();
  String getPassword();
  String getEmail();
  int getId();void setPassword(String newPassword);
  void setEmail(String newEmail);
}

public interface Menu {
  void start();
  void printMenuHeader();
}

public interface OrderManagementService {
  void addOrder(Order order);
  Order[] getOrdersByUserId(int userId);
  Order[] getOrders();
}

public interface ProductManagementService {
  Product[] getProducts();
  Product getProductById(int productIdToAddToCart);
}

public interface UserManagementService {
  String registerUser(User user);
  User[] getUsers();
  User getUserByEmail(String userEmail);
}
```

E aqui vai a classe ApplicationContext, o que o ajudará durante a implementação deste programa:

```java
public class ApplicationContext {
  private static ApplicationContext instance;
  private User loggedInUser;
  private Menu mainMenu;
  private Cart sessionCart;
  
  private ApplicationContext() {}
  
  public static ApplicationContext getInstance() {
    if (instance == null) {
      instance = new ApplicationContext();
    }
    return instance;
  }
  public User getLoggedInUser() {
    return this.loggedInUser;
  }
  public void setLoggedInUser(User user) {
    if (this.sessionCart != null) {
      this.sessionCart.clear(); // we have to clear session cart when new user is logged in
    }
    this.loggedInUser = user;
  }
  public Menu getMainMenu() {
    return this.mainMenu;
  }
  public void setMainMenu(Menu menu) {
    this.mainMenu = menu;
  }
  
  public Cart getSessionCart() {
    if (this.sessionCart == null) {
      this.sessionCart = new DefaultCart();
    }
    return this.sessionCart;
  }
}
```

Para criar este programa, sinta-se livre para usar um modelo especial do programa que você pode achar aqui: https://github.com/AndriiPiatakha/learnit_java_core/tree/master/src/com/itbulls/learnit/
javacore/oop/exam/templates/onlineshop


A solução para essa tarefa do exame está aqui: https://github.com/AndriiPiatakha/learnit_java_core/tree/master/src/com/itbulls/learnit/javacor
e/oop/exam/onlineshop

> Exercício 4 (EXAME: Loja Online): [01_arquivos/exercicio_04](./01_arquivos/exercicio_04/)