import java.util.Scanner;

public class TextAnalysis {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text (type 'exit' on a new line to finish):");

        StringBuilder text = new StringBuilder();
        String line;

        while (!(line = scanner.nextLine()).equals("exit")) {
            text.append(line).append("\n");
        }

        int charCount = text.length();
        int lineCount = text.toString().split("\n").length;
        int wordCount = text.toString().trim().split("\\s+").length;

        System.out.println("Character count: " + charCount);
        System.out.println("Line count: " + lineCount);
        System.out.println("Word count: " + wordCount);

        scanner.close();
    }
}