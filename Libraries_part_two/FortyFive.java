/*45. Write a program to accept a file and replace one (or) more spaces with a single space. */

import java.io.*;
import java.nio.file.*;

public class FortyFive {
    public static void main(String[] args) throws IOException {
        String file = "input.txt";
        String content = Files.readString(Paths.get(file));
        content = content.replaceAll("\\s+", " "); // Replace multiple spaces
        Files.writeString(Paths.get(file), content);
    }
}
