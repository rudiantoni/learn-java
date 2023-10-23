public class Account {
  private int id;
  private Transaction[] transactions;

  public Account(int id) {
    this.id = id;
  }

  public static class Transaction {
    private Account accountFrom;
    private Account accountTo;
    private double moneyAmount;
    private StandardAccountOperations operation;

    public Transaction(Account accountFrom, Account accountTo, double moneyAmount, StandardAccountOperations operation) {
      this.accountFrom = accountFrom;
      this.accountTo = accountTo;
      this.moneyAmount = moneyAmount;
      this.operation = operation;
    }

    public Account getAccountFrom() {
      return accountFrom;
    }

    public void setAccountFrom(Account accountFrom) {
      this.accountFrom = accountFrom;
    }

    public Account getAccountTo() {
      return accountTo;
    }

    public void setAccountTo(Account accountTo) {
      this.accountTo = accountTo;
    }

    public double getMoneyAmount() {
      return moneyAmount;
    }

    public void setMoneyAmount(double moneyAmount) {
      this.moneyAmount = moneyAmount;
    }

    public StandardAccountOperations getOperation() {
      return operation;
    }

    public void setOperation(StandardAccountOperations operation) {
      this.operation = operation;
    }
  }

  private void addTransaction(Transaction transaction) {
    if (transaction != null) {
      Transaction[] currentTransactions = transactions;
      int totalSize = currentTransactions.length + 1;

      Transaction[] newTransactions = new Transaction[totalSize];
      for (int i = 0; i < totalSize; i++) {
        if (i > currentTransactions.length - 1) {
          newTransactions[i] = transaction;
        } else {
          newTransactions[i] = currentTransactions[i];
        }
      }
      transactions = newTransactions;
    }
  }

  public void sendMoneyToAccount(Account accountTo, double moneyAmount) {
    Account originAccount = this;
    Account destinationAccount = accountTo;
    Transaction sendTransaction = new Transaction(originAccount, destinationAccount, moneyAmount, StandardAccountOperations.MONEY_TRANSFER_SEND);
    Transaction receiveTransaction = new Transaction(originAccount, destinationAccount, moneyAmount, StandardAccountOperations.MONEY_TRANSFER_SEND);
    
  }

  public void withdrawMoney(double moneyAmount) {
    // <write your code here>
  }

  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public void setTransactions(Transaction[] transactions) {
    this.transactions = transactions;
  }
  public Transaction[] getTransactions() {
    return transactions;
  }
}
