import java.util.concurrent.Flow.Subscription;
import java.util.concurrent.Flow.Subscriber;

public class MySubscriber implements Subscriber<Integer> {
  private Subscription subscription;

  @Override
  public void onSubscribe(Subscription subscription) {
    System.out.println("Subscriber: Subscrito");
    System.out.println(subscription);
    this.subscription = subscription;
    subscription.request(1); // Solicita um item inicialmente
  }

  @Override
  public void onNext(Integer item) {
    System.out.println("Subscriber: Recebido item " + item);
    // Processa o item recebido aqui
    submit(String.valueOf(item * 2));
    subscription.request(1); // Solicita o próximo item
  }

  @Override
  public void onError(Throwable throwable) {
    System.out.println("Subscriber: Error - " + throwable.getMessage());
  }

  @Override
  public void onComplete() {
    System.out.println("Subscriber: Concluído.");
    subscription.cancel();
  }

  private void submit(String item) {
    System.out.println("Subscriber: Emitindo item " + item);
  }
}
