import java.io.File;

public class RarArchiver implements Archiver {
  @Override
  public void archiveFiles(File... files) {
    System.out.println("Method od Rar Archiver is called.");
  }
}
