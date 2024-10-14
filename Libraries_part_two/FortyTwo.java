/*42. Create a treeset of strings and sort them by length (use Comparator) */

import java.util.*;

public class FortyTwo {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>(Comparator.comparingInt(String::length));
        
        set.add("apple");
        set.add("banana");
        set.add("kiwi");
        set.add("cherry");
        
        System.out.println(set);
    }
}
