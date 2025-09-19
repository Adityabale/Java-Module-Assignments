package Assignment3;
import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private String isbn;

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    // Display book details
    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
    }
}



public class LibraryManagement {
    private ArrayList<Book> library = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    // 1. Add a new book
    public void addBook() {
        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Book Author: ");
        String author = sc.nextLine();

        System.out.print("Enter Book ISBN: ");
        String isbn = sc.nextLine();

        library.add(new Book(title, author, isbn));
        System.out.println("Book added successfully!\n");
    }

    // 2. Remove a book by ISBN
    public void removeBook() {
        System.out.print("Enter ISBN of the book to remove: ");
        String isbn = sc.nextLine();

        for (Book book : library) {
            if (book.getIsbn().equals(isbn)) {
                library.remove(book);
                System.out.println("Book removed successfully!\n");
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found.\n");
    }

    // 3. Search book by title
    public void searchBook() {
        System.out.print("Enter title to search: ");
        String title = sc.nextLine();

        for (Book book : library) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book found:");
                book.displayBook();
                return;
            }
        }
        System.out.println("No book found with the title: " + title + "\n");
    }

    // 4. Display all books
    public void displayAllBooks() {
        if (library.isEmpty()) {
            System.out.println("No books in the library.\n");
            return;
        }

        System.out.println("Books in the library:");
        for (Book book : library) {
            book.displayBook();
        }
        System.out.println();
    }

    // Menu-driven program
    public void showMenu() {
        int choice;
        do {
            System.out.println("=== Library Management System ===");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book by Title");
            System.out.println("4. Display All Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            choice = Integer.parseInt(sc.nextLine()); // read choice

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    removeBook();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    displayAllBooks();
                    break;
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.\n");
            }
        } while (choice != 5);
    }

    public static void main(String[] args) {
        LibraryManagement lm = new LibraryManagement();
        lm.showMenu();
    }
}
