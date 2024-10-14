/*35. Write a program to display lines that contains more than 5 characters. */

import java.io.*;
import java.util.Scanner;

public class ThirtyFive {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String filename = sc.nextLine();
        
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        
        while ((line = reader.readLine()) != null) {
            if (line.length() > 5) {
                System.out.println(line);
            }
        }
        sc.close();
        reader.close();
    }
}
