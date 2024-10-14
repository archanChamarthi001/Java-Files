/*37. Write 20 marks into Marks.data. */

import java.io.*;

public class ThirtySeven {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Marks.data"))) {
            for (int i = 1; i <= 20; i++) {
                writer.write(Integer.toString((int) (Math.random() * 100)));
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
