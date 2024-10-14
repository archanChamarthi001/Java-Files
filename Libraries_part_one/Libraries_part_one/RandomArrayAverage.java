/*19. Write a program to create an array of 10 elements, fill it with random no's and display array elements which are greater than average of array. */

import java.util.Random;

public class RandomArrayAverage {

   public static void main(String[] args) {
    int array[] = new int[10];
    Random rand = new Random();


    for(int i = 0; i < array.length; i++) {
        array[i] = rand.nextInt(100) + 1;
    }

    //Calculate the sum of the array
    int sum = 0;
    for(int num:array) {
        sum +=num;
    }

    //Calculate the average of the array

    double average = sum / (double)array.length;
   


    //Display the array
    for(int num:array) {
        System.out.println(num + "");
    }

    //Display the array

    System.out.println("The average of the array elements are: " + average);

    //Displaying the array elements which are greater than the average 
    for(int num:array) {
        if(num > average) {
            System.out.println(num + "");
        }
    }

    }
}