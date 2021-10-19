package ExerciseLesson7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookMenu {
    static List<Book> bookList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isContinuing = true;
        while (isContinuing) {
            System.out.println("====MENU====");
            System.out.println("1. To add a new book");
            System.out.println("2. To retrieve book info");
            System.out.println("0. Exit!");

            int userOption = scanner.nextInt();

            switch (userOption) {
                case 0:
                    isContinuing = false;
                    System.out.println("Thank you!");
                    break;
                case 1:
                    addBook();
                    break;
                case 2:
                    retrieveBookInfo();
                    break;
                default:
                    System.out.println("Wrong Option");
            }
        }

    }

    private static void retrieveBookInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter ISBN: ");
        String inputISBN = scanner.nextLine();

        for (Book book : bookList) {
            if (inputISBN.equals(book.getBookISBN())) {
                System.out.println(book);
            }
        }
    }

    private static void addBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Book ISBN: ");
        String bookISBN = scanner.nextLine();

        System.out.print("Book Title: ");
        String bookTitle = scanner.nextLine();

        System.out.print("Author name: ");
        String authorName = scanner.nextLine();

        bookList.add(new Book(bookISBN, bookTitle, authorName));
    }
}
