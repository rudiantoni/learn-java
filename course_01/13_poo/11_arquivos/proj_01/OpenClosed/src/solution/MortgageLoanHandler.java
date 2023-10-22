package solution;

public class MortgageLoanHandler implements LoanHandler {
  public Validator validator;
  public MortgageLoanHandler(Validator validator) {
    this.validator = validator;
  }
  @Override
  public void approveLoan(User user) {
    if (validator.isValid(user)) {
      // Proceed with mortgage loan approval
    }
  }
}
