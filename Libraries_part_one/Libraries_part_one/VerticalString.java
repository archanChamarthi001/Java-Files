/*20. Write a program to accept a string from the user and display it vertically. use nextLine() to read a string from the user. */

import java.util.Scanner;

public class VerticalString {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        //Read a string from the user
        System.out.println("Enter a String: ");
        String input = read.nextLine();

        System.out.println("Printing the given string vertically...");

        //Dsiplay the string vertically
        for(int i =0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
        }
        read.close();
    }
}
