package ExerciseLesson7;

public class Book {
    private String bookISBN;
    private String bookTitle;
    private String bookAuthorName;

    public Book(String bookISBN, String bookTitle, String bookAuthorName) {
        this.bookISBN = bookISBN;
        this.bookTitle = bookTitle;
        this.bookAuthorName = bookAuthorName;
    }

    public String getBookISBN() {
        return bookISBN;
    }

    public void setBookISBN(String bookISBN) {
        this.bookISBN = bookISBN;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthorName() {
        return bookAuthorName;
    }

    public void setBookAuthorName(String bookAuthorName) {
        this.bookAuthorName = bookAuthorName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookISBN='" + bookISBN + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookAuthorName='" + bookAuthorName + '\'' +
                '}';
    }
}
