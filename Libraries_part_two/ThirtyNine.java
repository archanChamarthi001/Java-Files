/*39. Write a program to take names from names.txt & display unique names in sorted order. */

import java.io.*;
import java.util.*;

public class ThirtyNine {
    public static void main(String[] args) throws IOException {
        Set<String> uniqueNames = new TreeSet<>();
        
        BufferedReader reader = new BufferedReader(new FileReader("names.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            uniqueNames.add(line.trim());
        }
        reader.close();
        
        for (String name : uniqueNames) {
            System.out.println(name);
        }
    }
}
