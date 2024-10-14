/*8. Write a program to create an array of 5 elements and store values into it by taking them from the keyboard and display them in reverse order.
*/

import java.util.Scanner;

public class Basics_eight {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        int []arr = new int[5];
        System.out.println("Enter 5 elements: ");

        //Reading 5 elements
        for(int i = 0; i < 5; i++) {
            arr[i] = a.nextInt();
        }

        //Printing those elements in reverse order
    
        System.out.println("Reversed array is: ");
        for(int i = 4; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        a.close();
    }
}
