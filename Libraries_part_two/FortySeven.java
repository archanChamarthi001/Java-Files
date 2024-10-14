/*47. Write a program to display the file which contains the given string in a path. */
import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class FortySeven {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter directory path: ");
        String dirPath = sc.nextLine();
        System.out.print("Enter search string: ");
        String searchString = sc.nextLine();
        
        Files.walk(Paths.get(dirPath))
             .filter(Files::isRegularFile)
             .forEach(path -> {
                 try {
                     String content = Files.readString(path);
                     if (content.contains(searchString)) {
                         System.out.println("Found in: " + path);
                     }
                 } catch (IOException e) {
                     e.printStackTrace();
                 }
             });

             sc.close();
    }
}
