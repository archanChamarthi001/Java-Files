/*23. Write a program to take a String and invert the case of characters. */

import java.util.Scanner;


public class StringCaseInversion {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        //Reading String as an input from the user.
        System.out.println("Enter a string: ");
        String input = reader.nextLine();

        //String Builder to store the inverted result which helps in not creating string object every time when a character's case is inverted/changed. 
        StringBuilder invertString = new StringBuilder();

        for(int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if(Character.isUpperCase(ch)) {
                invertString.append(Character.toLowerCase(ch));
            }
            else if(Character.isLowerCase(ch)) {
                invertString.append(Character.toUpperCase(ch));
            }

            else {
                invertString.append(ch);
            }
        }
        System.out.println("The inverted string is : " + invertString.toString());

        reader.close();
    }
}
