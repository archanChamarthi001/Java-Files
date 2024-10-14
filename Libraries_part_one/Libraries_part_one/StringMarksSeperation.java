/*21. Write a program to accept a string that contains marks separated by commas and display total. */

import java.util.Scanner;

public class StringMarksSeperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks seperated by commas: ");
        //Reading the string
        String input = sc.nextLine();

        String marksArray[] = input.split(",");

        int total = 0;
        
        for(String marks: marksArray) {
            total += Integer.parseInt(marks.trim());
        }

        System.out.println("Total Marks obtained: " + total);

        sc.close();
    }
}
