/*32. Write a program to accept some numbers from the user until 'O' and display the sum of +ve numbers. */

import java.util.Scanner;

public class ThirtyTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;

        while(true) {
            System.out.println("Enter a number or 'O' to stop.");
            String input = scanner.nextLine();

            if(input.equalsIgnoreCase("O")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);

                if(number > 0) {
                    sum = sum + number;
                }
            } catch(NumberFormatException e) {
                System.out.println("Invalid input, please enter only numbers or 'O' to stop.");
            }
        }
        System.out.println("Sum of positive numbers: " + sum);
        scanner.close();
    }
}