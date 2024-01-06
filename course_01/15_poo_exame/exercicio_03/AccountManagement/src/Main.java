public class Main {
  public static void main(String[] args) {
    Account account1 = new Account(1);
    Account account2 = new Account(2);

    account1.sendMoneyToAccount(account2, 65.32);
    account1.sendMoneyToAccount(account2, 70.40);
    account1.sendMoneyToAccount(account2, 81.39);

    account2.sendMoneyToAccount(account1, 500);
    account2.sendMoneyToAccount(account1, 500);
    account2.sendMoneyToAccount(account1, 500);

    account1.withdrawMoney(600);
    account1.withdrawMoney(150);
    account1.withdrawMoney(6);

    account2.withdrawMoney(5);
    account2.withdrawMoney(1);
    account2.withdrawMoney(60);

    System.out.println("\n========== Account 1 Transactions ==========");
    for (Account.Transaction transaction: account1.getTransactions()) {
      System.out.println(transaction);
    }

    System.out.println("\n========== Account 2 Transactions ==========");
    for (Account.Transaction transaction: account2.getTransactions()) {
      System.out.println(transaction);
    }

  }
}