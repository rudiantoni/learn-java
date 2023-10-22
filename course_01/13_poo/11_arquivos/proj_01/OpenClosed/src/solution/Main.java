package solution;

public class Main {
  public static void main(String[] args) {
    LoanHandler loanHandler = new PersonalLoanHandler(new PersonalLoanValidator());
    User user = new User();
    loanHandler.approveLoan(user);

    LoanHandler loanHandler1 = new MortgageLoanHandler(new MortgageLoanValidator());
    loanHandler1.approveLoan(user);
  }
}
