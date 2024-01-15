import java.io.IOException;
import java.util.concurrent.*;

public class Main {
  public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
    // Exemplo das atualizações da Process API
    System.out.println("========== Exemplo das atualizações da Process API ==========");
    ProcessBuilder processBuilder = new ProcessBuilder("gedit");
    Process process = processBuilder.start();
    ProcessHandle processHandle = process.toHandle();

    // Get process information
    System.out.println("Process ID: " + processHandle.pid());
    System.out.println("Parent Process: " + processHandle.parent().get());
    System.out.println("Is process alive: " + processHandle.isAlive());

    processHandle.onExit().thenAccept(ph -> System.out.println("Process exited: " + ph));
//        processHandle.destroy(); // Gracefully terminate the process
//        processHandle.destroyForcibly(); // Forcefully terminate the process

    // Exemplo das atualizações da CompletableFuture API
    System.out.println("========== Exemplo das atualizações da CompletableFuture API ==========");
    CompletableFuture<Void> delayedFuture = CompletableFuture.runAsync(() -> {
      // Some asynchronous operation
      System.out.println("Async operation");
    }, CompletableFuture.delayedExecutor(3, TimeUnit.SECONDS));

    // ------
    CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
      // Simulate a long-running operation
      try {
        TimeUnit.SECONDS.sleep(5);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      return "Result";
    });
    CompletableFuture<String> resultFuture = future.orTimeout(2, TimeUnit.SECONDS);
    try {
      resultFuture.get();
    } catch (InterruptedException | ExecutionException e) {
      System.out.println("Timeout Exception caught: " + e.getCause().getClass());
    }

    // -----

    future = CompletableFuture.supplyAsync(() -> {
      // Simulate a long-running operation
      try {
        TimeUnit.SECONDS.sleep(5);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      return "Result";
    });

    resultFuture = future.completeOnTimeout("Default", 2, TimeUnit.SECONDS);
    System.out.println(resultFuture.get());


    // -----
    Executor defaultExecutor = new CompletableFuture().defaultExecutor();
    System.out.println(defaultExecutor.getClass());
    future = CompletableFuture.supplyAsync(() -> "Result");
    future.thenAcceptAsync(r -> System.out.println(r), defaultExecutor);

    // -----
    CompletableFuture<String> incompleteFuture = new CompletableFuture().newIncompleteFuture();
    // Perform some asynchronous operation (e.g., fetching data from a remote service)
    // and complete the CompletableFuture when the operation is done
    performAsyncOperation(incompleteFuture);
    // Wait for the result and handle it
    String resultString = incompleteFuture.join();
    System.out.println("Result: " + resultString);

    // -----
    CompletableFuture<String> original = CompletableFuture.supplyAsync(() -> "Original Result");
    CompletableFuture<String> copy = original.copy();

    // -----
    CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> "Hello");
    // Using minimalCompletionStage to obtain a CompletionStage view
    CompletionStage<String> completionStage = completableFuture.minimalCompletionStage();
    // Interact with libraries or methods expecting CompletionStage
    processWithCompletionStage(completionStage);

    // ------
    CompletableFuture<String> f = new CompletableFuture<>();
    CompletableFuture<String> completedFuture = f.completeAsync(() -> "Result");
  }
  private static void performAsyncOperation(CompletableFuture<String> future) {
    // Simulate an asynchronous operation
    new Thread(() -> {
      try {
        // Simulate a delay
        TimeUnit.SECONDS.sleep(2);

        // Complete the CompletableFuture with a result
        future.complete("Async Operation Result");
      } catch (InterruptedException e) {
        // Handle exception (if needed)
        future.completeExceptionally(e);
      }
    }).start();
  }

  private static void processWithCompletionStage(CompletionStage<String> completionStage) {
    // Use the CompletionStage API
    completionStage.thenApply(String::toUpperCase)
      .thenAccept(System.out::println)
      .exceptionally(ex -> {
        System.err.println("Exception: " + ex);
        return null;
      });
  }
}