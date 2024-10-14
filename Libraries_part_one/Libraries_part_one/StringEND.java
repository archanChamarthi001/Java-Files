/*25. Write a program to accept names until the END is given and display all the names separated by '-'. */

import java.util.Scanner;

public class StringEND {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        StringBuilder names = new StringBuilder();

        while (true) {
            System.out.println("Enter a string (or type 'END' to finish): ");

            String name = reader.nextLine();

            if (name.equalsIgnoreCase("END")) {
                break;
            }

            //
            if (names.length() > 0) {
                names.append("-");
            }

            names.append(name);
        }

        System.out.println("All the collected names: " + names.toString());
        reader.close();
    }
}
