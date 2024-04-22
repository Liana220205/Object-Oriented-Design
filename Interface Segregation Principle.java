//*************************************************************************
// Title : A java programme to demonstrate Interface Segregation Principle.
// Author : Nuzhat Liana, Undergrduate student, Khulna University.
//*************************************************************************

/**
 * Represents an eBook.
 */
public interface eBook {
    /**
     * Gets the title of the eBook.
     *
     * @return The title of the eBook.
     */
    String getTitle();

    /**
     * Gets the author of the eBook.
     *
     * @return The author of the eBook.
     */
    String getAuthor();

    /**
     * Gets the content of the eBook.
     *
     * @return The content of the eBook.
     */
    String getContent();

    /**
     * Gets the format of the eBook.
     *
     * @return The format of the eBook.
     */
    String getFormat();
}

/**
 * Represents an Audiobook.
 */
public interface Audiobook {
    /**
     * Gets the title of the audiobook.
     *
     * @return The title of the audiobook.
     */
    String getTitle();

    /**
     * Gets the author of the audiobook.
     *
     * @return The author of the audiobook.
     */
    String getAuthor();

    /**
     * Gets the content of the audiobook.
     *
     * @return The content of the audiobook.
     */
    String getContent();

    /**
     * Gets the narrator of the audiobook.
     *
     * @return The narrator of the audiobook.
     */
    String getNarrator();
}
/**
 * Represents a PDF eBook.
 */
public class PDFBook implements eBook {
    private String title;
    private String author;
    private String content;

    /**
     * Constructs a PDFBook object with the given title, author, and content.
     *
     * @param title   The title of the PDF eBook.
     * @param author  The author of the PDF eBook.
     * @param content The content of the PDF eBook.
     */
    public PDFBook(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
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
    public String getContent() {
        return content;
    }

    @Override
    public String getFormat() {
        return "PDF";
    }
}

/**
 * Represents an MP3 audiobook.
 */
public class MP3AudioBook implements Audiobook {
    private String title;
    private String author;
    private String content;
    private String narrator;

    /**
     * Constructs an MP3AudioBook object with the given title, author, content, and narrator.
     *
     * @param title    The title of the MP3 audiobook.
     * @param author   The author of the MP3 audiobook.
     * @param content  The content of the MP3 audiobook.
     * @param narrator The narrator of the MP3 audiobook.
     */
    public MP3AudioBook(String title, String author, String content, String narrator) {
        this.title = title;
        this.author = author;
        this.content = content;
        this.narrator = narrator;
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
    public String getContent() {
        return content;
    }

    @Override
    public String getNarrator() {
        return narrator;
    }
}
/**
 * Main class to demonstrate the usage of PDFBook and MP3AudioBook.
 */
public class Main {
    /**
     * Main method to run the program.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // Create a PDF eBook
        eBook pdfBook = new PDFBook("Java Programming", "John Doe", "PDF content...");
        displayContentInfo(pdfBook);

        // Create an MP3 audiobook
        Audiobook mp3AudioBook = new MP3AudioBook("The Great Gatsby", "F. Scott Fitzgerald", "MP3 content...", "Narrator Name");
        displayContentInfo(mp3AudioBook);
    }

    /**
     * Displays information about the given digital content.
     *
     * @param content The digital content to display information about.
     */
    public static void displayContentInfo(DigitalContent content) {
        System.out.println("Title: " + content.getTitle());
        if (content instanceof eBook) {
            eBook ebook = (eBook) content;
            System.out.println("Author: " + ebook.getAuthor());
            System.out.println("Format: " + ebook.getFormat());
        } else if (content instanceof Audiobook) {
            Audiobook audiobook = (Audiobook) content;
            System.out.println("Author: " + audiobook.getAuthor());
            System.out.println("Narrator: " + audiobook.getNarrator());
        }
        System.out.println("Content: " + content.getContent());
        System.out.println();
    }
}

