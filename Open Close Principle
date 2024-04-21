//****************************************************************
// Title : A java programme to demonstrate Open Close Principle.
// Author : Nuzhat Liana, Undergrduate student, Khulna University.
//****************************************************************

/**
 * Represents a book with basic attributes like title, author, and price.
 */
public interface Book {
    /**
     * Gets the title of the book.
     *
     * @return The title of the book.
     */
    String getTitle();

    /**
     * Gets the author of the book.
     *
     * @return The author of the book.
     */
    String getAuthor();

    /**
     * Gets the price of the book.
     *
     * @return The price of the book.
     */
    double getPrice();
}
/**
 * Represents a concrete implementation of the Book interface.
 */
public class BaseBook implements Book {
    private String title;
    private String author;
    private double price;

    /**
     * Constructs a BaseBook object with the given title, author, and price.
     *
     * @param title  The title of the book.
     * @param author The author of the book.
     * @param price  The price of the book.
     */
    public BaseBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
/**
 * Represents a discounted book by applying a percentage discount to the original price.
 */
public class DiscountedBook implements Book {
    private Book book;
    private double discount;

    /**
     * Constructs a DiscountedBook object by applying a discount to the given book.
     *
     * @param book     The original book.
     * @param discount The discount percentage (0 to 1).
     */
    public DiscountedBook(Book book, double discount) {
        this.book = book;
        this.discount = discount;
    }

    @Override
    public String getTitle() {
        return book.getTitle();
    }

    @Override
    public String getAuthor() {
        return book.getAuthor();
    }

    @Override
    public double getPrice() {
        return book.getPrice() * (1 - discount);
    }
}
/**
 * Represents a discounted book by applying a fixed discount amount to the original price.
 */
public class FixedDiscount extends DiscountedBook {
    private double fixedAmount;

    /**
     * Constructs a FixedDiscount object by applying a fixed amount discount to the given book.
     *
     * @param book        The original book.
     * @param fixedAmount The fixed discount amount.
     */
    public FixedDiscount(Book book, double fixedAmount) {
        super(book, 0); // No percentage discount
        this.fixedAmount = fixedAmount;
    }

    @Override
    public double getPrice() {
        return super.getPrice() - fixedAmount;
    }
}
/**
 * Main class to demonstrate the usage of Book and DiscountedBook classes.
 */
public class Main {
    public static void main(String[] args) {
        Book book = new BaseBook("Design Patterns", "Gang of Four", 50.0);
        System.out.println("Original price: " + book.getPrice());

        // Apply a 10% discount
        Book discountedBook = new DiscountedBook(book, 0.1);
        System.out.println("Discounted price (10%): " + discountedBook.getPrice());

        // Apply a fixed discount of $5
        Book fixedDiscountedBook = new FixedDiscount(book, 5.0);
        System.out.println("Discounted price ($5 fixed): " + fixedDiscountedBook.getPrice());
    }
}
