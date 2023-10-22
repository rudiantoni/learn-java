package solution;

public class Main {
  public static void main(String[] args) {
    MailboxSettingsService settingsService = new MailboxSettingsService();
    User user = new User();

    // Responsibility #1 of the MailboxSettingsService: change settings in mailbox
    settingsService.changeSecondaryEmail(user, "newemail@email.com");

    // Responsibility #1 of the SettingsService: verify access
    SecurityService securityService = new SecurityService();
    if (securityService.hasAccess(user)) {
      user.sendMoney(new User(), 1000);
    }
  }
}
