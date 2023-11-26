import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
  public static void main(String[] args) {

    System.out.println("===== PriorityQueue =====");
    Queue<Integer> queue = new PriorityQueue<>();
    queue.offer(2);
    queue.offer(8);
    queue.offer(3);
    queue.offer(1);
    queue.offer(10);
    System.out.println(queue);

    System.out.println("Obtém o início da pilha e remove o elemento poll(): " + queue.poll());
    System.out.println(queue);

    System.out.println("Tamanho da pilha após o poll(): " + queue.size());

    System.out.println("Obtém o inicio da pilha sem remover o elemento peek(): " +queue.peek());
    System.out.println(queue);

    System.out.println("Tamanho da pilha após o peek(): " + queue.size());

    // Este exemplo lança ClassCastException, pois alguns (ou todos) itens não são comparáveis (não implementam comparable)
//    Queue<Product> products = new PriorityQueue<>();
//    products.offer(new DefaultProduct());

    Queue<Product> products = new PriorityQueue<>(new CustomProductComparator());
    products.offer(new DefaultProduct());
  }
}