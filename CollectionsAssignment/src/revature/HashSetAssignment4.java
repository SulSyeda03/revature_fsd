package revature;

import java.util.Collections;
import java.util.HashSet;

public class HashSetAssignment4 {
    //4. Write a Java program to empty an hash set.

    public static void main(String[] args) {
        System.out.println("\n**********");
        System.out.println("\n ******Java program to empty an hash set.******");

        HashSet<String> h_set = new HashSet<>();
        h_set.add("Mark");
        h_set.add("Mona");
        h_set.add("John");
        h_set.add("Ben");


        System.out.println("\nPrinting the contents of HashSet ");
        System.out.println(h_set);

        System.out.println("Empty the HashSet");
        h_set.clear();
        System.out.println("\nAfter using clear() method: " + h_set);
    }
}