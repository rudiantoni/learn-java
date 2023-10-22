package solution;

public class MailboxSettingsService {
  private SecurityService securityService;
  {
    securityService = new SecurityService();
  }
  public void changeSecondaryEmail(User user, String newSecondaryEmail) {
    if (user.getRole() == Role.ADMIN) {
      user.setSecondaryEmail(newSecondaryEmail);
    }
  }
}
