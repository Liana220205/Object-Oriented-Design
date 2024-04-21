//************************************************************************
// Title : A java programme to demonstrate Dependency Inversion Principle.
// Author : Nuzhat Liana, Undergrduate student, Khulna University.
//*******

/**
 * Interface representing a content provider.
 */
public interface ContentProvider {
    /**
     * Retrieves the content from the provider.
     *
     * @return The content retrieved from the provider.
     */
    String getContent();
}
/**
 * Concrete implementation of ContentProvider for eBooks.
 */
public class EBookProvider implements ContentProvider {
    /**
     * Retrieves eBook content.
     *
     * @return eBook content.
     */
    @Override
    public String getContent() {
        // Simulate retrieving eBook content from a source (e.g., database, file)
        return "eBook content...";
    }
}
/**
 * Concrete implementation of ContentProvider for Audiobooks.
 */
public class AudiobookProvider implements ContentProvider {
    /**
     * Retrieves audiobook content.
     *
     * @return Audiobook content.
     */
    @Override
    public String getContent() {
        // Simulate retrieving audiobook content from a source (e.g., database, file)
        return "Audiobook content...";
    }
}
/**
 * Main class to demonstrate the usage of ContentProvider and ContentConsumer.
 */
public class Main {
    /**
     * Main method to run the program.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // Create an eBook content provider
        ContentProvider eBookProvider = new EBookProvider();
        // Create an audiobook content provider
        ContentProvider audiobookProvider = new AudiobookProvider();

        // Use the ContentConsumer to display eBook content
        ContentConsumer eBookConsumer = new ContentConsumer(eBookProvider);
        System.out.println("eBook content: " + eBookConsumer.displayContent());

        // Use the ContentConsumer to display audiobook content
        ContentConsumer audiobookConsumer = new ContentConsumer(audiobookProvider);
        System.out.println("Audiobook content: " + audiobookConsumer.displayContent());
    }
}
