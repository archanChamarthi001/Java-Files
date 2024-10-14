/*34. Write a program to accept a filename from the user and display how many uppercase, lowercase and digits the file has. */

import java.io.*;
import java.util.Scanner;

public class ThirtyFour {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String filename = sc.nextLine();
        
        int upperCase = 0, lowerCase = 0, digits = 0;
        
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        int c;
        while ((c = reader.read()) != -1) {
            if (Character.isUpperCase(c)) upperCase++;
            else if (Character.isLowerCase(c)) lowerCase++;
            else if (Character.isDigit(c)) digits++;
        }
        reader.close();
        
        System.out.println("Uppercase letters: " + upperCase);
        System.out.println("Lowercase letters: " + lowerCase);
        System.out.println("Digits: " + digits);
        sc.close();
    }
}
