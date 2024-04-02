package demobook;

public class BookBorrower {
    private BookSingleton borrowBook;
    private boolean haveBook = false;

    public void borrowBook() {
        borrowBook = BookSingleton.borrowBook();

        if (borrowBook == null) {
            haveBook = false;
        } else {
            haveBook = true;
        }
    }

    public String getAuthorAndTitle() {
        if (haveBook) {
            return borrowBook.getAuthorAndTitle();
        }
        return "I dont have the book";
    }

    public void returnBook() {
        borrowBook.returnBook(borrowBook);
    }

}
