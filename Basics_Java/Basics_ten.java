//10. Write a program to create a function that takes multiple numbers and displays common factors.

import java.util.Scanner;

public class Basics_ten {

    // Function to find the greatest common divisor (GCD)
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Function to find the GCD of multiple numbers
    public static int findGCD(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = gcd(result, numbers[i]);
        }
        return result;
    }

    // Function to display common factors of multiple numbers
    public static void displayCommonFactors(int[] numbers) {
        int gcdOfNumbers = findGCD(numbers);

        System.out.println("Common factors are:");
        for (int i = 1; i <= gcdOfNumbers; i++) {
            if (gcdOfNumbers % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    //Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Input the array of numbers
        int[] numbers = new int[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Display the common factors
        displayCommonFactors(numbers);

        scanner.close();
    }
}
