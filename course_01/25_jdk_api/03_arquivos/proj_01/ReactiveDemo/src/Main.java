import java.util.concurrent.SubmissionPublisher;
import java.util.concurrent.TimeUnit;

public class Main {
  public static void main(String[] args) throws InterruptedException {
    /*
    * Usar Java 9+
    */
    System.out.println("===== Iniciando publisher =====");
    SubmissionPublisher<Integer> publisher = new SubmissionPublisher<>();
    MySubscriber subscriber = new MySubscriber();

    System.out.println("\n===== Sobrescrevendo subscriber =====");
    publisher.subscribe(subscriber);
    // Dá um pequeno delay para garantir que a subscrição esteja completa
    TimeUnit.SECONDS.sleep(1);

    System.out.println("\n===== Iniciando emissão de itens pelo publisher =====");
    for (int i = 1; i <= 5; i++) {
      System.out.println("Publisher: Emitindo item: " + i);
      publisher.submit(i);
    }

    // Dá um pequeno delay antes de fechar o publisher para dar tempo do subscriber processar tudo
    // Seria necessário um tempo entre as emissões caso não tivesse aqui
    TimeUnit.SECONDS.sleep(2);
    publisher.close();
  }
}