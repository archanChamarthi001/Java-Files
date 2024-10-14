/*Write a program to accept the day of a week and the number of hours worked and calculate the wage.
Conditions:
     1,2,3 —>  Rs200/ hour
        4,5  —> Rs400 / hour
           6  —> Rs600 / hour
           7  —> Rs800 / hour
        1 to 7 is Monday to Friday.
   If the total amount exceeds Rs2000 then there will be a bonus of 10%.  (Use Switch Expression)
   
*/

import java.util.Scanner;

public class Basic_four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the day of the week ");
        int day = scanner.nextInt();

       
        System.out.println("Enter the number of hours worked: ");
        int hoursWorked = scanner.nextInt();

        int wagePerHour;

        
        wagePerHour = switch (day) {
            case 1, 2, 3 -> 200; 
            case 4, 5 -> 400;     
            case 6 -> 600;        
            case 7 -> 800;        
            default -> 0;
        };

        int totalWage = wagePerHour * hoursWorked;

        
        if (totalWage > 2000) {
            totalWage += totalWage * 0.10; 
        }

        // Display the total wage
        System.out.println("The total wage is: Rs " + totalWage);

        scanner.close();
    }
}
