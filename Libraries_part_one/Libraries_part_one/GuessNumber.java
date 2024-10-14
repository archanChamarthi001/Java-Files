/*18. Write a program to guess the random number in three attempts. The range is (1 to 25). */

import java.util.Scanner;
import java.util.Random;
/**
 * GuessNumber
 */
public class GuessNumber {

    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(25) + 1;  
        int attempts = 3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing game!");
        System.out.println("Guess a number between 1 and 25. You have total 3 attempts.");

        for(int i = 1; i <= attempts; i++) {
            System.out.println("Attempt" + attempts + ": Enter your guess: ");
            int guess = sc.nextInt();

            if(guess == randomNumber) {
                System.out.println("Congratulations! You have guessed the number correctly.");
                break;
            } else if(guess < randomNumber) {
                System.out.println("Number guessed is very less.");
            } else {
                System.out.println("Number guessed is very high");
            }

            if(i == attempts) {
                System.out.println("Sorry! You have ran out of guesses. The correct number is: " + randomNumber);
            }
        
        }
        sc.close();
    }
}