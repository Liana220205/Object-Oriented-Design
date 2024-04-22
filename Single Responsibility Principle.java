//*************************************************************************
// Title : A java programme to demonstrate Single Responsibility Principle.
// Author : Nuzhat Liana, Undergrduate student, Khulna University.
//*************************************************************************

/**
 * Represents a book with basic attributes like title, author, and year published.
 */
public class Book {
    private String title;
    private String author;
    private int yearPublished;

    /**
     * Constructs a Book object with the given title, author, and year published.
     *
     * @param title         The title of the book.
     * @param author        The author of the book.
     * @param yearPublished The year the book was published.
     */
    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    // Getters and setters

    /**
     * Retrieves the title of the book.
     *
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the book.
     *
     * @param title The title of the book.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Retrieves the author of the book.
     *
     * @return The author of the book.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the author of the book.
     *
     * @param author The author of the book.
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Retrieves the year the book was published.
     *
     * @return The year the book was published.
     */
    public int getYearPublished() {
        return yearPublished;
    }

    /**
     * Sets the year the book was published.
     *
     * @param yearPublished The year the book was published.
     */
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
}
/**
 * Handles the persistence of books to a database.
 */
public class BookPersistence {
    /**
     * Saves the given book to the database.
     *
     * @param book The book to be saved.
     */
    public void saveBook(Book book) {
        // Code to save the book to a database
        System.out.println("Saving book to the database: " + book.getTitle());
    }

    /**
     * Loads a book with the specified title from the database.
     *
     * @param title The title of the book to load.
     * @return The loaded Book object.
     */
    public Book loadBook(String title) {
        // Code to load the book from a database
        // For simplicity, we'll just return a new Book object
        System.out.println("Loading book from the database: " + title);
        return new Book(title, "Unknown Author", 0);
    }
}
/**
 * Main class to demonstrate the usage of Book and BookPersistence classes.
 */
public class Main {
    public static void main(String[] args) {
        // Create a new book
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);

        // Save the book
        BookPersistence persistence = new BookPersistence();
        persistence.saveBook(book);

        // Load a book
        Book loadedBook = persistence.loadBook("To Kill a Mockingbird");
        System.out.println("Loaded book: " + loadedBook.getTitle());
    }
}
/*
In this Main class, we create a new book instance, then use the BookPersistence class
to save the book to the database and load another book from the database. This separation of 
concerns adheres to the Single Responsibility Principle, as each class has only one reason
to change: the Book class changes if the representation of a book changes, and
the BookPersistence class changes if the database interaction logic changes.*/





