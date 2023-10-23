public class BookService {
  public Book[] filterBooksByAuthor(Author author, Book[] books) {
    if (author == null || books == null) {
      return new Book[]{};
    }
    String foundBookIds = "";
    for (Book book : books) {
      Author[] currentAuthors = book.getAuthors();
      for (Author currentAuthor : currentAuthors) {
        if (currentAuthor.equals(author)) {
          foundBookIds += book.getId() + ",";
        }
      }
    }
    Book[] filteredBooks = getBooksByIdsInString(books, foundBookIds);
    return filteredBooks;
  }

  public Book[] filterBooksByPublisher(Publisher publisher, Book[] books) {
    if (publisher == null || books == null) {
      return new Book[]{};
    }
    String foundBookIds = "";
    for (Book book : books) {
      if (book.getPublisher().equals(publisher)) {
        foundBookIds += book.getId() + ",";
      }
    }
    Book[] filteredBooks = getBooksByIdsInString(books, foundBookIds);
    return filteredBooks;
  }

  public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {
    if (books == null) {
      return new Book[]{};
    }
    String foundBookIds = "";
    for (Book book : books) {
      if (book.getPublishingYear() >= yearFromInclusively) {
        foundBookIds += book.getId() + ",";
      }
    }
    Book[] filteredBooks = getBooksByIdsInString(books, foundBookIds);
    return filteredBooks;
  }

  private Book[] getBooksByIdsInString(Book[] books, String idsAsStr) {
    if (!idsAsStr.isEmpty()) {
      int[] filteredBookIds = getIntsFromString(idsAsStr, ",");
      Book[] filteredBooks = getBooksByIds(books, filteredBookIds);
      return filteredBooks;
    } else {
      return new Book[]{};
    }
  }

  private int[] getIntsFromString(String intsAsStr, String separator) {
    String[] strArr = intsAsStr.split(separator);
    int[] intArr = new int[strArr.length];
    for (int i = 0; i < strArr.length; i++) {
      intArr[i] = Integer.valueOf(strArr[i]);
    }
    return intArr;
  }

  private Book[] getBooksByIds(Book[] books, int[] bookIds) {
    Book[] newBooks = new Book[bookIds.length];
    int foundBooks = 0;
    for (int i = 0; i < books.length; i++) {
      Book book = books[i];
      if (intArrHasElement(bookIds, book.getId())) {
        newBooks[foundBooks++] = book;
      }
    }
    return newBooks;
  }

  private boolean intArrHasElement(int[] elements, int search) {
    for (int element : elements) {
      if (element == search) {
        return true;
      }
    }
    return false;
  }

}
