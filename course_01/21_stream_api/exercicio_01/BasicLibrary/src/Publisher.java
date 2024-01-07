import java.util.Objects;

public class Publisher {
  private int id;
  private String publisherName;

  public Publisher() {}

  public Publisher(int id, String publisherName) {
    this.id = id;
    this.publisherName = publisherName;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getPublisherName() {
    return publisherName;
  }

  public void setPublisherName(String publisherName) {
    this.publisherName = publisherName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Publisher publisher = (Publisher) o;
    return id == publisher.id;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return String.format("Publisher={id=%d, publisherName=%s}", id, publisherName);
  }
}
