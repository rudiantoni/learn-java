# Oracle Certified Associate Java Programmer (OCAJP) 1Z0-808

## Queue e Deque
[[Home - Curso 1]](../../README.md#curso-1)<br />

- Diretório de arquivos: [08_arquivos](./08_arquivos/)
- Homework
  - [Arquivo: HW - Queue](./08_arquivos/homework/HW%20-%20Queue.pdf)
  - [Backend para um help-desk](#backend-para-um-help-desk)
- Projetos
  - [Projeto 1](./08_arquivos/proj_01/) [(iniciado em)](#interface-queue)
- Exercícios
  - [Exercício 1](./08_arquivos/exercicio_01/) ([enunciado](#backend-para-um-help-desk))
- Conteúdo
  - [Interface Queue](#interface-queue)
  - [Interface Deque](#interface-deque)
  - [FIFO - Filas](#fifo---filas)
  - [LIFO - Pilhas](#lifo---pilhas)
  - [Implementações populares de Queue e Deque](#implementações-populares-de-queue-e-deque)
  - [PriorityQueue](#priorityqueue)
  - [Backend para um help-desk](#backend-para-um-help-desk)

### Interface Queue
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./08_arquivos/proj_01/)

A interface Queue em Java é uma parte do Java Collections Framework e representa uma estrutura de dados do tipo fila, que é uma coleção ordenada para armazenar elementos em uma ordem específica, geralmente uma ordem FIFO (First-In-First-Out, ou seja, o primeiro a entrar é o primeiro a sair).

Exemplos utilizando Queue com FIFO

```java
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
  public static void main(String[] args) {
    Queue<Integer> queue = new LinkedList<>();

    // Adicionando elementos
    queue.offer(1);
    queue.offer(2);
    queue.offer(3);

    // Removendo elementos (FIFO)
    while (!queue.isEmpty()) {
      System.out.println(queue.poll());
    }
  }
}
```

A interface Queue estende a interface Collection e é usada para operações típicas de fila, como inserção, remoção e inspeção de elementos.

**Principais características e métodos da interface Queue**

- **Estrutura FIFO**: Em uma fila típica, elementos são adicionados no final da fila e removidos do início, seguindo a ordem FIFO. No entanto, algumas implementações de Queue, como PriorityQueue, podem usar diferentes ordens, como prioridade dos elementos.

**Métodos importantes**

- **offer(E e)**: Adiciona um elemento no final da fila, retornando true se a adição for bem-sucedida. Este método é preferível ao add(E e) em filas com capacidade limitada, pois não lança exceção se a fila estiver cheia.
- **poll()**: Remove e retorna o cabeçalho da fila, ou retorna null se a fila estiver vazia.
- **peek()**: Retorna, mas não remove, o cabeçalho da fila, ou retorna null se a fila estiver vazia.
- **add(E e)** e **remove()**: Métodos herdados da interface Collection que também adicionam e removem elementos, respectivamente, mas podem lançar exceções se a fila estiver cheia (no caso de add) ou vazia (no caso de remove).

**Uso em programação concorrente**

Filas bloqueantes, como ArrayBlockingQueue e LinkedBlockingQueue, são particularmente úteis em programação concorrente, onde threads diferentes podem estar adicionando e removendo elementos da fila simultaneamente.

**Aplicações**

Filas são frequentemente usadas em situações que envolvem um serviço de "primeiro a chegar, primeiro a ser servido", como gerenciamento de tarefas, operações de buffer e processamento de dados em fluxo (stream).

  - [Interface Queue](#interface-queue)
  - [Interface Deque](#interface-deque)
  - [FIFO - Filas](#fifo---filas)
  - [LIFO - Pilhas](#lifo---pilhas)
  - [Implementações populares de Queue e Deque](#implementações-populares-de-queue-e-deque)
  - [PriorityQueue](#priorityqueue)
  - [Backend para um help-desk](#backend-para-um-help-desk)

### Interface Deque
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./08_arquivos/proj_01/)

A interface Deque em Java, uma abreviação de "Double Ended Queue" (Fila de Duas Extremidades), é uma extensão da interface Queue e faz parte do Java Collections Framework.

Ela representa uma fila de duas extremidades, o que significa que os elementos podem ser inseridos e removidos de ambos os lados da fila.

Exemplos utilizando Deque com FIFO

```java
import java.util.ArrayDeque;
import java.util.Deque;

public class DequeFifoExample {
  public static void main(String[] args) {
    Deque<Integer> deque = new ArrayDeque<>();

    // Adicionando elementos no final
    deque.offerLast(1);
    deque.offerLast(2);
    deque.offerLast(3);

    // Removendo elementos do início (FIFO)
    while (!deque.isEmpty()) {
      System.out.println(deque.pollFirst());
    }
  }
}
```

Exemplos utilizando Deque com LIFO

```java
import java.util.ArrayDeque;
import java.util.Deque;

public class DequeLifoExample {
  public static void main(String[] args) {
    Deque<Integer> deque = new ArrayDeque<>();

    // Adicionando elementos (como uma pilha)
    deque.push(1);
    deque.push(2);
    deque.push(3);

    // Removendo elementos (LIFO)
    while (!deque.isEmpty()) {
      System.out.println(deque.pop());
    }
  }
}
```

**Principais características e métodos da interface Deque**
- **Operações em ambas as extremidades**: A interface Deque permite inserir, remover e inspecionar elementos tanto no início quanto no final da fila. Isso a torna mais versátil do que a fila comum (Queue), que opera principalmente em uma estrutura FIFO (First-In-First-Out).

**Métodos principais**
- **addFirst(E e)**, **addLast(E e)**, **offerFirst(E e)**, **offerLast(E e)**: Métodos para adicionar elementos.
- **removeFirst()**, **removeLast()**, **pollFirst()**, **pollLast()**: Métodos para remover elementos.
- **getFirst()**, **getLast()**, **peekFirst()**, **peekLast()**: Métodos para inspecionar elementos (sem removê-los).

**Versatilidade**

Por permitir operações em ambas as extremidades, Deque pode ser usado tanto como uma pilha (LIFO - Last-In-First-Out) quanto como uma fila (FIFO). Isso a torna adequada para um leque mais amplo de problemas em comparação com uma fila simples.

**Uso em programação concorrente**

Assim como as filas, existem versões de Deque projetadas para uso em ambientes multithread, como LinkedBlockingDeque, que fazem parte do pacote java.util.concurrent.

**Aplicações**: Deque é útil em situações que exigem flexibilidade na manipulação de dados, como em algoritmos que necessitam tanto de operações de pilha quanto de fila, ou em casos onde é vantajoso poder adicionar ou remover elementos de ambas as extremidades da coleção.

  - [Interface Queue](#interface-queue)
  - [Interface Deque](#interface-deque)
  - [FIFO - Filas](#fifo---filas)
  - [LIFO - Pilhas](#lifo---pilhas)
  - [Implementações populares de Queue e Deque](#implementações-populares-de-queue-e-deque)
  - [PriorityQueue](#priorityqueue)
  - [Backend para um help-desk](#backend-para-um-help-desk)

### FIFO - Filas
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./08_arquivos/proj_01/)

O princípio FIFO, que significa "First In, First Out" (Primeiro a Entrar, Primeiro a Sair), é um conceito fundamental em diversas áreas, como ciência da computação, contabilidade e logística.

Especificamente em programação e estruturas de dados, ele descreve a maneira como determinadas coleções de dados operam, onde o primeiro elemento adicionado à coleção será o primeiro a ser removido ou processado.

**Estruturas de dados FIFO**

Em estruturas de dados que seguem o princípio FIFO, como filas (queues), os elementos são adicionados ao final da fila e removidos do início. Isso significa que os elementos são processados na ordem exata em que foram adicionados.

**Aplicações em programação**
- **Filas**: O exemplo mais comum de uma estrutura FIFO em programação é a fila (queue). Filas são usadas em uma variedade de aplicações, como gerenciamento de tarefas, buffer de dados e processamento de mensagens.
- **Processamento de tarefas**: Em sistemas operacionais e programação concorrente, filas FIFO são frequentemente usadas para gerenciar tarefas ou processos, garantindo que a primeira tarefa adicionada será a primeira a ser processada ou executada.

**Vantagens do FIFO**
- **Justiça**: O princípio FIFO garante que nenhuma entrada é esquecida ou permanece na fila indefinidamente, desde que continuem chegando e saindo elementos.
- **Simplicidade**: Estruturas de dados baseadas em FIFO são relativamente simples de implementar e entender.

**Exemplo de uso**

Em um sistema de atendimento ao cliente, por exemplo, as solicitações podem ser atendidas na ordem em que foram recebidas, seguindo o princípio FIFO.

**Diferença em relação a outros princípios**:
- **FIFO vs. LIFO**: Em contraste com FIFO, o princípio LIFO (Last In, First Out) é utilizado em pilhas (stacks), onde o último elemento adicionado é o primeiro a ser removido.
- **FIFO vs. Prioridade**: Em algumas estruturas de dados, como filas de prioridade, os elementos são processados com base em uma prioridade designada, que pode não seguir a ordem FIFO.

  - [Interface Queue](#interface-queue)
  - [Interface Deque](#interface-deque)
  - [FIFO - Filas](#fifo---filas)
  - [LIFO - Pilhas](#lifo---pilhas)
  - [Implementações populares de Queue e Deque](#implementações-populares-de-queue-e-deque)
  - [PriorityQueue](#priorityqueue)
  - [Backend para um help-desk](#backend-para-um-help-desk)

### LIFO - Pilhas
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./08_arquivos/proj_01/)

O princípio LIFO, que significa "Last In, First Out" (Último a Entrar, Primeiro a Sair), é um conceito fundamental em diversas áreas, incluindo ciência da computação, contabilidade e logística.

No contexto de estruturas de dados e programação, LIFO refere-se a um método de gerenciamento de coleções de dados onde o último elemento adicionado à coleção é o primeiro a ser removido ou processado.


**Estruturas de fados LIFO**

Em estruturas de dados que seguem o princípio LIFO, como pilhas (stacks), os elementos são adicionados e removidos do mesmo lado da coleção. Isso significa que o elemento mais recentemente adicionado é sempre o primeiro a ser acessado ou removido.

**Aplicações em programação**
- **Pilhas**: O exemplo mais comum de uma estrutura LIFO em programação é a pilha. Pilhas são usadas em várias aplicações, incluindo avaliação de expressões, navegação em históricos (como o botão "voltar" em navegadores), e em algoritmos de percurso de árvores e grafos.
- **Chamadas de funções**: Em muitas linguagens de programação, a pilha de chamadas (call stack) que gerencia chamadas de função e retornos segue o princípio LIFO.

**Vantagens do LIFO**
- **Simplicidade**: Estruturas de dados baseadas em LIFO são simples de implementar e entender.
- **Eficiência**: O acesso ao elemento mais recentemente adicionado é imediato, o que é útil em muitos algoritmos e aplicações.

**Exemplo de uso**

Na implementação de um recurso de desfazer (undo) em um editor de texto, onde a última ação realizada pelo usuário é a primeira a ser desfeita.

**Diferença em relação a outros princípios**:
- **LIFO vs. FIFO**: Em contraste com LIFO, o princípio FIFO (First In, First Out) é utilizado em filas (queues), onde o primeiro elemento adicionado é o primeiro a ser removido.
- **LIFO vs. Prioridade**: Diferentemente das filas de prioridade, onde os elementos são processados com base em uma prioridade designada, as pilhas LIFO processam os elementos na ordem exata de sua chegada.

  - [Interface Queue](#interface-queue)
  - [Interface Deque](#interface-deque)
  - [FIFO - Filas](#fifo---filas)
  - [LIFO - Pilhas](#lifo---pilhas)
  - [Implementações populares de Queue e Deque](#implementações-populares-de-queue-e-deque)
  - [PriorityQueue](#priorityqueue)
  - [Backend para um help-desk](#backend-para-um-help-desk)

### Implementações populares de Queue e Deque
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./08_arquivos/proj_01/)

**Implementações comuns da interface Queue**
- **LinkedList**: Além de implementar a interface List, LinkedList é uma implementação comum de Queue.
- **PriorityQueue**: Uma implementação de fila baseada em prioridades, onde os elementos são ordenados de acordo com sua ordem natural ou por um Comparator fornecido no momento da criação da fila.
- **ArrayBlockingQueue**, LinkedBlockingQueue: Variantes de filas bloqueantes, utilizadas em programação concorrente.

**Implementações comuns da interface Deque*inter#interface-queue*
  - [Interface Queue](#interface-deque)
  - [Interface Deque](#fifo---filas)
  - [FIFO - Filas](#lifo---pilhas)
  - [LIFO - Pilhas](#implementações-populares-de-queue-e-deque)
  - [Implementações populares de Queue e Deque](#priorityqueue)
  - [PriorityQueue](#backend-para-um-help-desk)
 Além de implementar a interface List, LinkedList também é uma implementação comum de Deque.

### PriorityQueue
[[Topo]](#)<br />

- Ver projeto: [Projeto 1](./08_arquivos/proj_01/)

A PriorityQueue é uma estrutura de dados específica em Java, parte do Java Collections Framework.

Diferentemente de uma fila comum (Queue), que opera principalmente no princípio FIFO (First-In-First-Out), uma PriorityQueue ordena seus elementos de acordo com sua prioridade natural ou um comparador fornecido no momento de sua criação.

Exemplo utilizando PriorityQueue

```java
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
  public static void main(String[] args) {
    Queue<Integer> priorityQueue = new PriorityQueue<>();

    // Adicionando elementos
    priorityQueue.offer(3);
    priorityQueue.offer(1);
    priorityQueue.offer(2);

    // Removendo elementos (ordem de prioridade)
    while (!priorityQueue.isEmpty()) {
      System.out.println(priorityQueue.poll());
    }
  }
}
```

- **Ordenação de elementos**: Em uma PriorityQueue, os elementos são ordenados de acordo com sua prioridade. A prioridade pode ser determinada pela ordem natural dos elementos (por exemplo, números são ordenados numericamente) ou por um Comparator definido pelo usuário.
- **Recuperação de elementos**: O elemento com a maior prioridade (ou seja, o menor elemento na ordem de classificação padrão) é sempre o primeiro a ser removido da fila.
- **Métodos de acesso e remoção**
  - **offer(E e)**: Insere um elemento na PriorityQueue. O elemento é inserido de acordo com sua ordem de prioridade.
  - **poll()**: Remove e retorna o elemento com a maior prioridade da fila, ou retorna null se a fila estiver vazia.
  - **peek()**: Retorna, mas não remove, o elemento com a maior prioridade, ou retorna null se a fila estiver vazia.
- **Capacidade**: A PriorityQueue não tem limite de capacidade. Ela aumenta automaticamente seu tamanho quando necessário.
- **Não é Thread-Safe**: Por padrão, uma PriorityQueue não é sincronizada, o que significa que ela não é thread-safe sem sincronização externa.
- **Iteração**: A iteração sobre uma PriorityQueue não garante que os elementos serão processados em ordem de prioridade. Para processar os elementos na ordem correta, eles devem ser removidos usando poll().
- **Uso**: PriorityQueue é frequentemente usada em algoritmos que processam tarefas com base em prioridades, como algoritmos de caminho mais curto em grafos (por exemplo, o algoritmo de Dijkstra), ou em sistemas de gerenciamento de tarefas onde algumas tarefas têm prioridade sobre outras.
**Implementação**: Internamente, a PriorityQueue é geralmente implementada como uma heap (estrutura de árvore binária), o que permite que as operações de inserção e remoção sejam realizadas de forma eficiente.

  - [Interface Queue](#interface-queue)
  - [Interface Deque](#interface-deque)
  - [FIFO - Filas](#fifo---filas)
  - [LIFO - Pilhas](#lifo---pilhas)
  - [Implementações populares de Queue e Deque](#implementações-populares-de-queue-e-deque)
  - [PriorityQueue](#priorityqueue)
  - [Backend para um help-desk](#backend-para-um-help-desk)

### Backend para um help-desk
[[Topo]](#)<br />

- Ver homework: [HW - Queue](./08_arquivos/homework/HW%20-%20Queue.pdf)

Implemente o back-end para um Help Desk

- Crie a seguinte interface
```java
public interface HelpDeskFacade {
  void addNewSupportTicket(SupportTicket supportTicket);
  SupportTicket getNextSupportTicket();
  /**
  * @return amount of tickets that are not processed
  */
  int getNumberOfTickets();
}
```
- Crie DefaultHelpDeskFacade que implementa HelpDeskFacade
- Crie a interface SupportTicket:
```java
public interface SupportTicket {
  Priority getPriority();
  /**
  * This method returns the unique sequential number of the support ticket.
  * This number can be used as an identifier.
  * Order is started from 1.
  * The less the return number is - that support ticket was created earlier.
  *
  * @return unique sequence number
  */
  int getSequentialNumber();
  RequestType getRequestType();
}
```
- Crie DefaultSupportTicket e implemente a interface SupportTicket
- O método getNextSupportTicket() deve retornar o ticket e removê-lo do HelpDesk na seguinte ordem:
  - Tickets com maior prioridade vêm primeiro
  - No caso de dois tickets terem a mesma prioridade - o que foi criado mais cedo deve ser retornado
- Aqui está o mapeamento do tipo de solicitação e prioridade. Usando esta pasta, implemente o enum RequestType e o enum Priority

| Enum RequestType | Enum Priority |
|-------------|:--------------|
| OTHER | LOW |
| CHANGE_ACCOUNT_DETAILS | LOW |
| CAN_NOT_LOGIN | MEDIUM |
| ACCOUNT_IS_BLOCKED | MEDIUM |
| COOPERATION | MEDIUM |
| ACCOUNT_IS_HACKED | HIGH |
| CAN_NOT_COMPLETE_PURCHASE | HIGH |
| ORDER_IS_NOT_RECEIVED | HIGH |

- Commit para verificar apenas as alterações realizadas: https://github.com/AndriiPiatakha/learnit_java_core/commit/9134c3ba126a753e6d79b82d547b391419c48c30

Se exercício:
> Exercício 1 (Queue e Deque): [08_arquivos/exercicio_01](./08_arquivos/exercicio_01/)
