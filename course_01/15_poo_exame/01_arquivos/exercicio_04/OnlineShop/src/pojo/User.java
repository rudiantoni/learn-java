package pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
  private static int nextId;
  private int id;

  static {
    nextId = 1;
  }

  {
    id = nextId++;
  }

  private String firstName;
  private String lastName;
  private String email;
  private String password;
  private Cart cart;
  private List<Order> orderList = new ArrayList<>();

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

  public Cart getCart() {
    return cart;
  }

  public void setCart(Cart cart) {
    this.cart = cart;
  }

  public List<Order> getOrderList() {
    return new ArrayList<>(orderList);
  }

  public boolean isOrderListEmpty() {
    return orderList.isEmpty();
  }

  public Order addOrder(List<Product> productList) {
    Order order = new Order(productList);
    orderList.add(order);
    return order;
  }

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
      Objects.equals(cart, user.cart) &&
      Objects.equals(orderList, user.orderList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, email, password, cart, orderList);
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
      ", orderList=" + orderList +
      '}';
  }

  public String toStringFormatted() {
    return String.format("Id: %d. Primeiro nome: %s. Último nome: %s. E-mail: %s.", id, firstName, lastName, email);
  }
}
