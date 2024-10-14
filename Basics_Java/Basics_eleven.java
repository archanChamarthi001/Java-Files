/*11. Write a program to consider command line arguments num, length as inputs (where length is optional) if you won't get that use default number as length.
 */

public class Basics_eleven {
         public static void main(String[] args) {
            // Default values
            int num;
            int length = 10; // Default length
    
            // Check if at least one argument (num) is provided
            if (args.length < 1) {
                System.out.println("Usage: java CommandLineArgs <num> [length]");
                return;
            }
    
            // Parse the first argument as num
            try {
                num = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format for num. Please provide an integer.");
                return;
            }
    
            // Check if the second argument (length) is provided and parse it
            if (args.length > 1) {
                try {
                    length = Integer.parseInt(args[1]);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number format for length. Using default length = " + length);
                }
            }
    
            // Display the values of num and length
            System.out.println("num: " + num);
            System.out.println("length: " + length);
            
            // Perform some operation with num and length (for example, print num 'length' times)
            System.out.println("Output:");
            for (int i = 1; i <= length; i++) {
                System.out.println(num + " * " + i + " = " + (num * i));
            }
        }
    }
