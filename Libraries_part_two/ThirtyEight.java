/*38. Write a program to accept a file and convert its contents to uppercase.(write in compact way) */
import java.nio.file.*;
import java.io.IOException;

public class ThirtyEight {
    public static void main(String[] args) throws IOException {
        String file = "input.txt";
        String content = Files.readString(Paths.get(file)).toUpperCase();
        Files.writeString(Paths.get(file), content);
    }
}
