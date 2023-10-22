package problem;

public class LoanHandler {
  private PersonalLoanValidator personalLoanValidator;
  private MortgageLoanValidator mortgageLoanValidator;

  public void approvePersonalLoan(User user) {
    if (personalLoanValidator.isValidUserForPersonalLoan(user)) {
      // Proceed with personal loan approval
    }
  }

  public void approveMortgage(User user) {
    if (mortgageLoanValidator.isValidUserForMortgage(user)) {
      // Proceed with mortgage loan approval
    }
  }
}
