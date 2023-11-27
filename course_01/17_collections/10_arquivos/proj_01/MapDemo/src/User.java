import java.util.Objects;

public class User {
  private Integer id;
  private String firstName;
  private String lastName;
  private String password;
  private String email;

  public User(Integer id, String firstName, String lastName, String password, String email) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.password = password;
    this.email = email;
  }

  public Integer getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getPassword() {
    return password;
  }

  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  @Override
  public String toString() {
    return "User{" +
      "id=" + id +
      ", firstName='" + firstName + '\'' +
      ", lastName='" + lastName + '\'' +
      ", password='" + password + '\'' +
      ", email='" + email + '\'' +
      '}';
  }


}
