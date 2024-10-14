//5. Write a program to accept five numbers from the user and display the average of numbers.

import java.util.Scanner;

public class Basics_five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int []arr = new int[5];
        int sum = 0;

        System.out.println("Enter 5 numbers:");
        for(int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            sum+= arr[i];
        }

        int average = sum / 5;

        System.out.println("Average of the given 5 numbers: " + average);

        sc.close();
    }
}
