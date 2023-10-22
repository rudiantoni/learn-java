package problem;

public class User {
  private int id;
  private String primaryEmail;
  private String secondaryEmail;
  private Role role;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getPrimaryEmail() {
    return primaryEmail;
  }

  public void setPrimaryEmail(String primaryEmail) {
    this.primaryEmail = primaryEmail;
  }

  public String getSecondaryEmail() {
    return secondaryEmail;
  }

  public void setSecondaryEmail(String secondaryEmail) {
    this.secondaryEmail = secondaryEmail;
  }

  public void sendMoney(User userTo, int dollarsAmount) {
    // Some code here to transfer money logic
  }
  public Role getRole() {
    return role;
  }
}
