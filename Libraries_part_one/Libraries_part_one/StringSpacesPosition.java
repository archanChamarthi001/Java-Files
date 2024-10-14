/*22. Write a program to accept a string and display the position of space for all spaces. */

import java.util.Scanner;

public class StringSpacesPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String: ");
        //Reading input from the user.
        String input = scanner.nextLine();
        
        System.out.println("Positions of spaces in the string: ");

        //Loop to check any of the index in the given string is matching with the space ' '. If matches, then it prints that index number stored in a variable i.
        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == ' ') {
                System.out.println("Spaces at position: " + i);
            } 
        }
        //closes the scanner method to stop taking input after this method call.
        scanner.close();

    }
}
