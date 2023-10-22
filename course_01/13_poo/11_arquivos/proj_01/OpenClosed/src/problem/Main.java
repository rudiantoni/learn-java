package problem;

public class Main {
  public static void main(String[] args) {
    LoanHandler loanHandler = new LoanHandler();
    User user = new User();

    loanHandler.approvePersonalLoan(user);
    loanHandler.approveMortgage(user);
  }
}
