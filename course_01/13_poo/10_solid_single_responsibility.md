# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## SOLID: Single Responsibility
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [10_arquivos](./10_arquivos/)
- Projetos
  - [Projeto 1](./10_arquivos/proj_01/) [(iniciado em)](#princípios-solid)
- Conteúdo
  - [Princípios SOLID](#princípios-solid)
  - [Single Responsibility](#single-responsibility)
  - [Exemplo sem a aplicação do princípio](#exemplo-sem-a-aplicação-do-princípio)
  - [Exemplo com a aplicação do princípio](#exemplo-com-a-aplicação-do-princípio)

### Princípios SOLID
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./10_arquivos/proj_01/)

Os princípios SOLID são um conjunto de cinco princípios de design de software que foram introduzidos por Robert C. Martin (também conhecido como Uncle Bob) e que visam promover a criação de código-fonte mais limpo, modular, flexível e de fácil manutenção.

Esses princípios ajudam os desenvolvedores a escrever código mais robusto e escalável. Cada letra no acrônimo SOLID representa um princípio específico:

- **S**: Princípio da Responsabilidade Única (Single Responsibility Principle - SRP): Esse princípio afirma que uma classe deve ter apenas uma razão para mudar. Em outras palavras, uma classe deve ter uma única responsabilidade ou tarefa. Isso ajuda a manter o código mais coeso e facilita a manutenção, pois mudanças em uma responsabilidade não afetam outras partes do código.
- **O**: Princípio do Aberto/Fechado (Open/Closed Principle - OCP): Esse princípio preconiza que as entidades de software (como classes, módulos, etc.) devem estar abertas para extensão, mas fechadas para modificação. Isso significa que você pode adicionar novos recursos ou funcionalidades sem alterar o código existente, usando herança, interfaces e polimorfismo.
- **L**: Princípio da Substituição de Liskov (Liskov Substitution Principle - LSP): Esse princípio estabelece que objetos de uma subclasse devem ser capazes de substituir objetos de sua classe base sem afetar a integridade do programa. Em outras palavras, se uma classe filha herda de uma classe pai, ela deve manter o mesmo contrato (interfaces, comportamento esperado, etc.) sem causar surpresas.
- **I**: Princípio da Segregação de Interfaces (Interface Segregation Principle - ISP): Esse princípio defende que uma classe não deve ser forçada a implementar interfaces que ela não utiliza. Em vez disso, as interfaces devem ser granulares e específicas para as necessidades da classe, evitando a criação de classes inchadas com métodos não utilizados.
- **D**: Princípio da Inversão de Dependência (Dependency Inversion Principle - DIP): Este princípio sugere que os módulos de alto nível não devem depender de módulos de baixo nível. Ambos devem depender de abstrações. Além disso, ele afirma que abstrações não devem depender de detalhes, mas detalhes devem depender de abstrações. Isso promove o uso de interfaces ou classes abstratas para desacoplar componentes e facilitar a substituição de implementações.

Ao aderir aos princípios SOLID, os desenvolvedores podem criar sistemas de software mais flexíveis, extensíveis e fáceis de manter, o que é fundamental para o desenvolvimento de software de alta qualidade e sustentável.

### Single Responsibility
[[Topo]](#)<br />

O princípio de Single Responsibility, em português "Princípio da Responsabilidade Única," é um dos cinco princípios do SOLID, que é um conjunto de diretrizes para escrever código orientado a objetos mais coeso e de alta qualidade. O Princípio da Responsabilidade Única (SRP) estabelece que uma classe deve ter apenas uma razão para mudar, ou seja, ela deve ter uma única responsabilidade.

Em termos simples, isso significa que uma classe deve fazer apenas uma coisa e fazer bem, e não deve ser sobrecarregada com múltiplas responsabilidades ou funcionalidades diferentes. Quando uma classe tem apenas uma responsabilidade, é mais fácil de entender, manter e modificar, e também ajuda a reduzir o acoplamento entre classes.

A aplicação do SRP implica que, se você tiver uma classe que está realizando várias tarefas distintas, deve considerar dividi-la em várias classes, cada uma com sua responsabilidade única. Isso ajuda a evitar que mudanças em uma parte da funcionalidade afetem outras partes não relacionadas da classe.

A ideia por trás do SRP é promover a coesão no código, ou seja, garantir que as partes relacionadas de um sistema estejam agrupadas de forma apropriada, enquanto mantém a separação entre funcionalidades diferentes. Isso torna o código mais organizado, legível, testável e sustentável a longo prazo.

### Exemplo sem a aplicação do princípio
[[Topo]](#)<br />

Vamos examinar um exemplo simples em Java 8 para ilustrar o princípio de Single Responsibility, mostrando uma classe com uma implementação que viola o SRP e, em seguida, uma implementação que segue o SRP corretamente.

Exemplo Errado (Violando SRP):

Suponha que estamos lidando com uma classe chamada OrderProcessor que representa o processamento de pedidos em um sistema de comércio eletrônico. Nesta implementação incorreta, a classe OrderProcessor viola o SRP ao ter múltiplas responsabilidades:

```java
import java.util.List;

public class OrderProcessor {

  public void processOrder(Order order) {
    // Lógica para processar o pedido
  }

  public void printInvoice(Order order) {
    // Lógica para imprimir uma fatura
  }

  public List<Order> fetchOrders() {
    // Lógica para buscar pedidos do banco de dados
    return null;
  }
  
  // Outras responsabilidades...
}
```

Neste exemplo errado, a classe OrderProcessor está responsável por processar pedidos, imprimir faturas e buscar pedidos do banco de dados, o que vai contra o SRP.

### Exemplo com a aplicação do princípio
[[Topo]](#)<br />

Aqui está uma implementação que segue o princípio da responsabilidade única:

```java
import java.util.List;

public class OrderProcessor {

  public void processOrder(Order order) {
    // Lógica para processar o pedido
  }
}

public class InvoicePrinter {

  public void printInvoice(Order order) {
    // Lógica para imprimir uma fatura
  }
}

public class OrderRepository {

  public List<Order> fetchOrders() {
    // Lógica para buscar pedidos do banco de dados
    return null;
  }
}

```

Nesta implementação correta, dividimos as responsabilidades em três classes diferentes: OrderProcessor para processar pedidos, InvoicePrinter para imprimir faturas e OrderRepository para buscar pedidos do banco de dados. Cada classe agora tem uma única responsabilidade, seguindo o princípio de Single Responsibility.

Isso torna o código mais modular, facilita a manutenção e permite que cada classe se concentre em sua única responsabilidade, melhorando a legibilidade e a escalabilidade do código.
