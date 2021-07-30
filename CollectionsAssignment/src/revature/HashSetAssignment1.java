package revature;

import java.util.HashSet;

public class HashSetAssignment1 {
    //1. Write a Java program to append the specified element to the end of a hash set.

    public static void main(String[] args) {
        System.out.println("\n**********");
        System.out.println("\n ******Java program to append the specified element to the end of a hash set.******");

        HashSet<String> h_set = new HashSet<>();
        System.out.print("\nHashSet before adding elements : ");
        System.out.println(h_set);

        System.out.println("Adding keys and values to it in HashSet...");
        h_set.add("Mark");
        h_set.add("Mona");
        h_set.add("John");
        h_set.add("Ben");


        System.out.println("Printing the contents of HashSet ");
        System.out.println(h_set);
    }
}
