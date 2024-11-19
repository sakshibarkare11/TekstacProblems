import java.util.Scanner;
 
public class UserInterface {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
 
        // Prompt user for the sentence
        System.out.println("Enter the sentence");
        String sentence = scanner.nextLine();
        // Prompt user for the word to search
        System.out.println("Enter the word");
        String word = scanner.nextLine();
        // Check if the word is present in the sentence
        if (sentence.contains(word)) {
            System.out.println(word + " is present in the sentence");
        } else {
            System.out.println(word + " is not present in the sentence");
        }
        // Close the scanner
        scanner.close();
    }
}