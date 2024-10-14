/*40. Write a program to assume names1.txt & names2.txt where we have one name for line & display unique names from both the files in the order they appear. */

import java.io.*;
import java.util.LinkedHashSet;
import java.util.Set;

public class Forty {
    public static void main(String[] args) throws IOException {
        Set<String> uniqueNames = new LinkedHashSet<>();
        
        BufferedReader reader1 = new BufferedReader(new FileReader("names1.txt"));
        BufferedReader reader2 = new BufferedReader(new FileReader("names2.txt"));
        
        String line;
        while ((line = reader1.readLine()) != null) {
            uniqueNames.add(line.trim());
        }
        while ((line = reader2.readLine()) != null) {
            uniqueNames.add(line.trim());
        }
        
        reader1.close();
        reader2.close();
        
        for (String name : uniqueNames) {
            System.out.println(name);
        }
    }
}
