/*36. File Marks.txt, which have marks separated by comma in different lines.Find the total marks of each line and display them.(Use fault tolerance) */

import java.io.*;

public class ThirtySix {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("Marks.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] marks = line.split(",");
                int total = 0;
                for (String mark : marks) {
                    try {
                        total += Integer.parseInt(mark.trim());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid mark: " + mark);
                    }
                }
                System.out.println("Total marks: " + total);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
