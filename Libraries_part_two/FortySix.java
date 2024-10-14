/*46. Write  a program to accept strings until 'end' is given and sort them and write them into Codes.txt and the string must be one/more alphabets followed by one/more digits.(use Regular Expressions) */

import java.io.*;
import java.util.*;


public class FortySix {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        List<String> validCodes = new ArrayList<>();
        
        while (true) {
            System.out.print("Enter a code (or 'end' to finish): ");
            String code = sc.nextLine();
            if (code.equalsIgnoreCase("end")) break;
            
            if (code.matches("[a-zA-Z]+[0-9]+")) {
                validCodes.add(code);
            }
        }
        
        Collections.sort(validCodes);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Codes.txt"))) {
            for (String code : validCodes) {
                writer.write(code);
                writer.newLine();
            }
        }
        sc.close();
    }
}
