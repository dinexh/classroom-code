import java.util.ArrayList;
import java.util.Scanner;

public class BookStore {

    public static boolean isBookAvailable(ArrayList<String> bookList, String bookTitle) {
        // Check if the bookTitle is present in the bookList
        return bookList.contains(bookTitle);
    }

    public static void main(String[] args) {
        // Sample bookList containing titles of various books
        ArrayList<String> bookList = new ArrayList<>();
        bookList.add("Harry Potter and the Philosopher's Stone");
        bookList.add("To Kill a Mockingbird");
        bookList.add("The Great Gatsby");
        bookList.add("1984");
        bookList.add("Pride and Prejudice");

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a book title
        System.out.print("Enter the title of the book to check availability: ");
        String searchTitle = scanner.nextLine();

        // Check if the book is available in the library
        if (isBookAvailable(bookList, searchTitle)) {
            System.out.println("The book \"" + searchTitle + "\" is available in the library.");
        } else {
            System.out.println("Sorry, the book \"" + searchTitle + "\" is not available in the library.");
        }

        // Close the scanner
        scanner.close();
    }
}
