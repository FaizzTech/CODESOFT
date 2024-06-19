import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'text' to input text, or 'file' to input a file path:");
        String inputType = scanner.nextLine().trim();

        String text = "";
        if (inputType.equalsIgnoreCase("text")) {
            System.out.println("Enter the text:");
            text = scanner.nextLine();
        } else if (inputType.equalsIgnoreCase("file")) {
            System.out.println("Enter the file path:");
            String filePath = scanner.nextLine();
            try {
                text = readFile(filePath);
            } catch (FileNotFoundException e) {
                System.out.println("File not found.");
                return;
            }
        } else {
            System.out.println("Invalid input.");
            return;
        }

        // Split text into words using space or punctuation as delimiters
        String[] words = text.split("[\\s\\p{Punct}]+");
        
        int wordCount = words.length;
        System.out.println("Total word count: " + wordCount);

        // Additional features can be implemented here, such as ignoring stop words,
        // calculating unique word count, frequency of each word, etc.

        scanner.close();
    }

    private static String readFile(String filePath) throws FileNotFoundException {
        StringBuilder contentBuilder = new StringBuilder();
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            contentBuilder.append(scanner.nextLine()).append("\n");
        }
        scanner.close();
        return contentBuilder.toString();
    }
}
