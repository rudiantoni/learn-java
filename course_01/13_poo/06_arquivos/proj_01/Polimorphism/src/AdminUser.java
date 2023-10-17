public class AdminUser extends User {
  private final String userGroup = "admin";
  public void validateAccessRights() {
    System.out.println("I'm an admin user. I can do whatever I want in the system.");
  }
  @Override
  public ProfileInformationData getProfileInformation(Profile profile) {
//    userGroup = "default";
//    profile = new UserProfile();
    return new AccountInformation();
  }
}
