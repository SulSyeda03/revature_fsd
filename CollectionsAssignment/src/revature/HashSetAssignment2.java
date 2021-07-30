package revature;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetAssignment2 {
    //2. Write a Java program to iterate through all elements in a hash list.

    public static void main(String[] args) {

        System.out.println("\n**********");
        System.out.println("\n ******Java program to iterate through all elements in a hash list.******");

        HashSet<String> h_set = new HashSet<>();
        h_set.add("Mark");
        h_set.add("Mona");
        h_set.add("John");
        h_set.add("Ben");


        System.out.println("\nPrinting the contents of HashSet ");
        System.out.println(h_set);

        System.out.println("\n Traversing through all elements using: ");
        System.out.println("\n 1. Iterator");

        Iterator iterator = h_set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println("\n 2. Enhanced for Loop");
        for (String names:
             h_set) {
            System.out.print(names + " ");
        }

        System.out.println("\n 3. forEach() method");
        h_set.forEach(names -> System.out.print(names + " "));
    }
}
