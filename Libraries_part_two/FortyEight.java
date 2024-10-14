/* 48. Assume a txt file customers.txt which contains name & mobile no and you need to display in sorted order of name.(Use regular expression)*/
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class FortyEight {
    public static void main(String[] args) throws IOException {
        List<String> customers = new ArrayList<>();
        Pattern pattern = Pattern.compile("([a-zA-Z]+)\\s([0-9]+)");
        
        BufferedReader reader = new BufferedReader(new FileReader("customers.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            Matcher matcher = pattern.matcher(line);
            if (matcher.matches()) {
                customers.add(matcher.group(1) + " " + matcher.group(2));
            }
        }
        reader.close();
        
        customers.sort(Comparator.comparing(s -> s.split(" ")[0])); // Sort by name
        for (String customer : customers) {
            System.out.println(customer);
        }
    }
}
