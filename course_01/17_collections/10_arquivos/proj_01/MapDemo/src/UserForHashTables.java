import java.util.Objects;

public class UserForHashTables extends User {
  public UserForHashTables(Integer id, String firstName, String lastName, String password, String email) {
    super(id, firstName, lastName, password, email);
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    User user = (User) o;
    return Objects.equals(getId(), user.getId()) &&
      Objects.equals(getFirstName(), user.getFirstName()) &&
      Objects.equals(getLastName(), user.getLastName()) &&
      Objects.equals(getPassword(), user.getPassword()) &&
      Objects.equals(getEmail(), user.getEmail());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId(), getFirstName(), getLastName(), getPassword(), getEmail());
  }

}
