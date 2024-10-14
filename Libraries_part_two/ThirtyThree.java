/*33. Write a program to accept names from users until 'END' is given and write them into names.txt as one name for the line. */

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ThirtyThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (FileWriter writer = new FileWriter("names.txt")) {  // Automatically closes FileWriter using try-with-resources
            String name;
            
            // Loop to accept names until "END" is entered
            while (true) {
                System.out.print("Enter a name (or 'END' to finish): ");
                name = scanner.nextLine();
                
                if (name.equalsIgnoreCase("END")) {
                    break;  // Exit the loop if "END" is entered
                }
                
                writer.write(name + System.lineSeparator());  // Write name to file with a newline
            }

            System.out.println("Names have been successfully written to names.txt.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        } finally {
            scanner.close();  // Close the scanner to avoid resource leaks
        }
    }
}
