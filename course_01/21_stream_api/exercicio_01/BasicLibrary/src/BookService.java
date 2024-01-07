import java.util.Arrays;

public class BookService {
  public Book[] filterBooksByAuthor(Author searchAuthor, Book[] books) {
    return Arrays.stream(books)
      .filter(book -> Arrays.asList(book.getAuthors()).contains(searchAuthor)
      )
      .toArray(Book[]::new);
  }
  public Book[] filterBooksByPublisher(Publisher publisher, Book[] books) {
    return Arrays.stream(books)
      .filter(book -> book.getPublisher().equals(publisher))
      .toArray(Book[]::new);
  }
  public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {
    // os métodos mantêm livros com ano de publicação inclusivamente.
    return Arrays.stream(books)
      .filter(book -> book.getPublishingYear() >= yearFromInclusively)
      .toArray(Book[]::new);
  }
}
