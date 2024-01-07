import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {
  public static void main(String[] args) {
    Author authorJohn = new Author(1, "John", "Johnson");
    Author authorWilliam = new Author(2, "William", "Wilson");
    Author authorWalter = new Author(3, "Walter", "Peterson");
    Author authorCraig = new Author(4, "Craig", "Gregory");
    Publisher publisher1 = new Publisher(1, "Publisher N1");
    Publisher publisher2 = new Publisher(2, "Publisher N2");
    Publisher publisher3 = new Publisher(3, "Publisher N3");
    Book[] books = new Book[]{
      new Book(1, "Livro 1", new Author[]{authorJohn}, publisher1, 1990, 231, BigDecimal.valueOf(24.99), CoverType.PAPERBACK),
      new Book(2, "Livro 2", new Author[]{authorJohn, authorWilliam}, publisher2, 2000, 120, BigDecimal.valueOf(14.99), CoverType.PAPERBACK),
      new Book(3, "Livro 3", new Author[]{authorWalter}, publisher1, 1997, 350, BigDecimal.valueOf(34.99), CoverType.HARDCOVER),
      new Book(4, "Livro 4", new Author[]{authorCraig}, publisher3, 1992, 185, BigDecimal.valueOf(19.99), CoverType.PAPERBACK)
    };

    BookService service = new BookService();

    System.out.println("========== Utilizando filtro de livros por autor ==========");
    System.out.println(String.format(" *** Autor: %s ***", authorJohn));
    printList(Arrays.asList(service.filterBooksByAuthor(authorJohn, books)));
    System.out.println(String.format(" *** Autor: %s ***", authorWilliam));
    printList(Arrays.asList(service.filterBooksByAuthor(authorWilliam, books)));
    System.out.println(String.format(" *** Autor: %s ***", authorWalter));
    printList(Arrays.asList(service.filterBooksByAuthor(authorWalter, books)));
    System.out.println(String.format(" *** Autor: %s ***", authorCraig));
    printList(Arrays.asList(service.filterBooksByAuthor(authorCraig, books)));

    System.out.println("\n========== Utilizando filtro de livros por editora ==========");
    System.out.println(String.format(" *** Editora: %s ***", publisher1));
    printList(Arrays.asList(service.filterBooksByPublisher(publisher1, books)));
    System.out.println(String.format(" *** Editora: %s ***", publisher2));
    printList(Arrays.asList(service.filterBooksByPublisher(publisher2, books)));
    System.out.println(String.format(" *** Editora: %s ***", publisher3));
    printList(Arrays.asList(service.filterBooksByPublisher(publisher3, books)));

    System.out.println("\n========== Utilizando filtro de livros por ano de publicação ==========");
    System.out.println(String.format(" *** Ano de publicação: %d ***", 1985));
    printList(Arrays.asList(service.filterBooksAfterSpecifiedYear(1985, books)));
    System.out.println(String.format(" *** Ano de publicação: %d ***", 1990));
    printList(Arrays.asList(service.filterBooksAfterSpecifiedYear(1990, books)));
    System.out.println(String.format(" *** Ano de publicação: %d ***", 1991));
    printList(Arrays.asList(service.filterBooksAfterSpecifiedYear(1991, books)));
    System.out.println(String.format(" *** Ano de publicação: %d ***", 1992));
    printList(Arrays.asList(service.filterBooksAfterSpecifiedYear(1992, books)));
    System.out.println(String.format(" *** Ano de publicação: %d ***", 1994));
    printList(Arrays.asList(service.filterBooksAfterSpecifiedYear(1994, books)));
    System.out.println(String.format(" *** Ano de publicação: %d ***", 2005));
    printList(Arrays.asList(service.filterBooksAfterSpecifiedYear(2005, books)));
  }
  private static void printList(Collection<?> list) {
    for (Object item : list) {
      System.out.println(item);
    }
  }
}