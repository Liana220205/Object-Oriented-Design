//***********************************************************************
// Title : A java programme to demonstrate Liskov Substitution Principle.
// Author :Nuzhat Liana , Undergrduate student, Khulna University.
//***********************************************************************

/**
 * Interface representing digital content.
 */
public interface DigitalContent {
    /**
     * Gets the title of the digital content.
     *
     * @return The title of the digital content.
     */
    String getTitle();

    /**
     * Gets the type of the digital content.
     *
     * @return The type of the digital content.
     */
    String getType();

    /**
     * Gets the content of the digital content.
     *
     * @return The content of the digital content.
     */
    String getContent();
}
/**
 * Represents an eBook.
 */
public class EBook implements DigitalContent {
    private String title;
    private String author;
    private String content;

    /**
     * Constructs an EBook object with the given title, author, and content.
     *
     * @param title   The title of the eBook.
     * @param author  The author of the eBook.
     * @param content The content of the eBook.
     */
    public EBook(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getType() {
        return "eBook";
    }

    @Override
    public String getContent() {
        return content;
    }
}
/**
 * Represents an Audiobook.
 */
public class AudioBook implements DigitalContent {
    private String title;
    private String author;
    private String content;

    /**
     * Constructs an AudioBook object with the given title, author, and content.
     *
     * @param title   The title of the audiobook.
     * @param author  The author of the audiobook.
     * @param content The content of the audiobook.
     */
    public AudioBook(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getType() {
        return "Audiobook";
    }

    @Override
    public String getContent() {
        return content;
    }
}
/**
 * Manages and displays information about digital content.
 */
public class ContentManager {
    /**
     * Displays information about the given digital content.
     *
     * @param content The digital content to display information about.
     */
    public void displayContentInfo(DigitalContent content) {
        System.out.println("Title: " + content.getTitle());
        System.out.println("Type: " + content.getType());
        System.out.println("Content: " + content.getContent());
        System.out.println();
    }
}
