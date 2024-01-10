public class Main {
  public static void main(String[] args) {
    Account account = new Account();
    String accountReport = TodoAnalyzer.getTodoReport(account.getClass());
    System.out.println("Relatório da conta");
    System.out.println("---------------------------------------");
    System.out.println(accountReport);
  }
}
