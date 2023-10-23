import java.math.BigDecimal;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    Author authorJonJohnson = new Author(1, "Jon", "Johnson");
    Author authorWilliamWilson = new Author(2, "William", "Wilson");
    Author authorWalterPeterson = new Author(3, "Walter", "Peterson");
    Author authorCraigGregory = new Author(4, "Craig", "Gregory");
    Publisher publisher1 = new Publisher(1, "Publisher_1");
    Publisher publisher2 = new Publisher(2, "Publisher_2");
    Publisher publisher3 = new Publisher(3, "Publisher_3");
    Book[] books = new Book[]{
      new Book(1, "Book_1", new Author[]{authorJonJohnson}, publisher1, 1990, 231, BigDecimal.valueOf(24.99), CoverType.PAPERBACK),
      new Book(2, "Book_2", new Author[]{authorJonJohnson, authorWilliamWilson}, publisher2, 2000, 120, BigDecimal.valueOf(14.99), CoverType.PAPERBACK),
      new Book(3, "Book_3", new Author[]{authorWalterPeterson}, publisher1, 1997, 350, BigDecimal.valueOf(34.99), CoverType.HARDCOVER),
      new Book(4, "Book_4", new Author[]{authorCraigGregory}, publisher3, 1992, 185, BigDecimal.valueOf(19.99), CoverType.PAPERBACK)
    };
    BookService service = new BookService();
    System.out.println("All books");
    for (Book book: books) {
      System.out.println(book);
    }

    System.out.println("\n==================== Books by Author ====================\n");
    Author booksByAuthorSearchAuthor = authorJonJohnson;
    Book[] booksByAuthor = service.filterBooksByAuthor(booksByAuthorSearchAuthor, books);
    System.out.println("Author:");
    System.out.println(booksByAuthorSearchAuthor);
    System.out.println("Found books:");
    for (Book book: booksByAuthor) {
      System.out.println(book);
    }

    System.out.println("\n==================== Books by Publisher ====================\n");
    Publisher booksByPublisherSearchPublisher = publisher1;
    Book[] booksByPublisher = service.filterBooksByPublisher(booksByPublisherSearchPublisher, books);
    System.out.println("Publisher:");
    System.out.println(booksByPublisherSearchPublisher);
    System.out.println("Found books:");
    for (Book book: booksByPublisher) {
      System.out.println(book);
    }

    System.out.println("\n==================== Books after Publishing Year ====================\n");
    int booksByPublishingYearSearchYear = 1990;
    Book[] booksByPublishingYear = service.filterBooksAfterSpecifiedYear(booksByPublishingYearSearchYear, books);
    System.out.println("After Publishing Year:");
    System.out.println(booksByPublishingYearSearchYear);
    System.out.println("Found books:");
    for (Book book: booksByPublishingYear) {
      System.out.println(book);
    }

  }
}