/*44. Write a program to accept a string & display each word on a separate line (use any separator) */

import java.util.Scanner;

public class FortyFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        String[] words = input.split("\\s+"); // Splitting by spaces
        for (String word : words) {
            System.out.println(word);
        }
        sc.close();
    }
}
