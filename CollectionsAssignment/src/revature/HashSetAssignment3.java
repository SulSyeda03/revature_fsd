package revature;

import java.util.HashSet;

public class HashSetAssignment3 {
    //3. Write a Java program to get the number of elements in a hash set.

    public static void main(String[] args) {
        System.out.println("\n**********");
        System.out.println("\n ******Java program to get the number of elements in a hash set.******");

        HashSet<String> h_set = new HashSet<>();
        h_set.add("Mark");
        h_set.add("Mona");
        h_set.add("John");
        h_set.add("Ben");

        System.out.println("Printing the contents of HashSet ");
        System.out.println(h_set);

        System.out.println("HashSet contains " + h_set.size() + " elements.");
    }
}
