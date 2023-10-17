import java.io.File;

public class Main {
  public static void main(String[] args) {
    // User
    // ProfileInformationData
    // AccountInformation
    // Profile
    // ContentManager
    // AdminUser
    // Archiver
    // ZipArchiver
    // RarArchiver
    User contentManager = new ContentManager();
    User admin = new AdminUser();

    contentManager.validateAccessRights();
    admin.validateAccessRights();

    System.out.println();
    System.out.println("==========");
    System.out.println();

    Archiver zipArchiver = new ZipArchiver();
    Archiver rarArchiver = new ZipArchiver();
    zipArchiver.archiveFiles(new File(""));
    rarArchiver.archiveFiles(new File(""));

    System.out.println();
    System.out.println("==========");
    System.out.println();

    contentManager.getProfileInformation(new UserProfile());
  }
}