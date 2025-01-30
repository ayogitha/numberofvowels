import java.util.Scanner;

public class Numberofvowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Convert the string to lowercase to handle both uppercase and lowercase vowels
        inputString = inputString.toLowerCase();

        // Initialize the counter for vowels
        int vowelCount = 0;

        // Iterate through each character in the string
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        // Output the result
        System.out.println("Number of vowels in the string: " + vowelCount);

    }
    
}
