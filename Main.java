// Document class represents a simple text editor
class Document {

    // Private StringBuffer to store and manage text
    private StringBuffer textBuffer;

    // Constructor initializes an empty text buffer
    public Document() {
        textBuffer = new StringBuffer();
    }

    // Method to add text to the existing content
    public void addText(String text) {
        textBuffer.append(text);
    }

    // Method to clear all text from the editor
    public void clearText() {
        textBuffer.setLength(0);
    }

    // Method to reverse the current text
    public void reverseText() {
        textBuffer.reverse();
    }

    // Method to display the current text
    public void displayText() {
        System.out.println(textBuffer);
    }
}

// Main class to test the Document class
public class Main {

    public static void main(String[] args) {

        // Creating a Document object
        Document doc = new Document();

        // Adding text to the document
        doc.addText("Hello World");
        System.out.print("Text after adding: ");
        doc.displayText();

        // Reversing the text
        doc.reverseText();
        System.out.print("Text after reverse: ");
        doc.displayText();

        // Clearing all text
        doc.clearText();
        System.out.print("Text after clear: ");
        doc.displayText();
    }
}
