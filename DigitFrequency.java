import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take input for the number
        System.out.print("Enter a number: ");
        long number = scanner.nextLong(); // Using long to handle large numbers

        // Convert the number to a string to easily access each digit
        String numStr = String.valueOf(number);

        // Array to store the frequency of each digit (0-9)
        int[] frequency = new int[10];

        // Loop through each digit in the number and count the frequency
        for (int i = 0; i < numStr.length(); i++) {
            // Get the current digit (convert the char to an integer)
            int digit = Character.getNumericValue(numStr.charAt(i));

            // Increment the frequency count for that digit
            frequency[digit]++;
        }

        // Display the frequency of each digit
        System.out.println("\nFrequency of each digit:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }

        // Close the scanner
        scanner.close();
    }
}
