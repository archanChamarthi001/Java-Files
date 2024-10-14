/*43. Write a program to accept pan no and check whether it is valid or not. */

import java.util.Scanner;

public class FortyThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter PAN number: ");
        String pan = sc.nextLine();
        
        if (pan.matches("[A-Z]{5}[0-9]{4}[A-Z]")) {
            System.out.println("Valid PAN number");
        } else {
            System.out.println("Invalid PAN number");
        }
        sc.close();
    }
}
