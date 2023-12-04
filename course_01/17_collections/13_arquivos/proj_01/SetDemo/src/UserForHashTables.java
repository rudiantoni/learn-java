import java.util.Objects;

public class UserForHashTables extends DefaultUser {
  public UserForHashTables() {
    super();
  }

  public UserForHashTables(String firstName, String lastName, String password, String email) {
    super(firstName, lastName, password, email);
  }

  public UserForHashTables(int id, String firstName, String lastName, String password, String email) {
    super(id, firstName, lastName, password, email);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DefaultUser that = (DefaultUser) o;
    return getId() == that.getId() &&
      Objects.equals(getFirstName(), that.getFirstName()) &&
      Objects.equals(getLastName(), that.getLastName()) &&
      Objects.equals(getPassword(), that.getPassword()) &&
      Objects.equals(getEmail(), that.getEmail());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId(), getFirstName(), getLastName(), getPassword(), getEmail());
  }

}
