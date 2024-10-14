/*29. Accept five strings which contain numbers and display the total for those numbers. Make your program fault tolerant. */

import java.util.Scanner;

public class TwentyNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        int count = 0;

        while (count < 5) {
            System.out.print("Enter a number (" + (count + 1) + "/5): ");
            String input = scanner.nextLine();

            try {
                // Attempt to parse the input as a number
                double number = Double.parseDouble(input);
                total += number;
                count++;
            } catch (NumberFormatException e) {
                // Handle invalid input
                System.out.println("Invalid input! Please enter a valid number.");
            }
        }

        System.out.println("The total sum of the numbers is: " + total);
        scanner.close();
    }
}
