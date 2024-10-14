//7. Write a program to accept the number and display the number in reverse order.

import java.util.Scanner;

public class Basics_seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int reversedNumber = 0;
        System.out.println("Enter a number: ");

        number = sc.nextInt();
        while(number !=0) {
            int last = number % 10;
            reversedNumber = reversedNumber * 10 + last;
            number = number / 10;
        }
        System.out.println("Reversed number is: " + reversedNumber);

        sc.close();
    }
}
