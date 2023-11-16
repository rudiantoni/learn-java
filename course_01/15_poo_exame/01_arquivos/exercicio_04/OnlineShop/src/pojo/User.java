package pojo;

import java.util.Objects;

public class User {
  private static int nextId;
  private int id;
  static { nextId = 1; }
  { id = nextId++; }

  private String firstName;
  private String lastName;
  private String email;
  private String password;
  private Cart cart;

  public User(String firstName, String lastName, String email, String password) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.password = password;
    this.cart = new Cart();
  }

  public int getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  public Cart getCart() { return cart; }
  public void setCart(Cart cart) { this.cart = cart; }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    User user = (User) o;
    return id == user.id &&
      Objects.equals(firstName, user.firstName) &&
      Objects.equals(lastName, user.lastName) &&
      Objects.equals(email, user.email) &&
      Objects.equals(password, user.password) &&
      Objects.equals(cart, user.cart);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, email, password, cart);
  }

  @Override
  public String toString() {
    return "User{" +
      "id=" + id +
      ", firstName='" + firstName + '\'' +
      ", lastName='" + lastName + '\'' +
      ", email='" + email + '\'' +
      ", password='" + password + '\'' +
      ", cart=" + cart +
      '}';
  }
}
