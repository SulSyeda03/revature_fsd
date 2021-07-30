package revature;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetAssignment2 {
    //2. Write a Java program to iterate through all elements in a tree set.

    public static void main(String[] args) {
        System.out.println("\n**********");
        System.out.println("\n ******JJava program to iterate through all elements in a tree set.******");

        TreeSet<String> tree_set = new TreeSet<>();

        tree_set.add("Red");
        tree_set.add("Orange");
        tree_set.add("Yellow");
        tree_set.add("Purple");
        tree_set.add("White");
        tree_set.add("Black");
        tree_set.add("Blue");


        System.out.println("Printing the colors in TreeSet ");
        System.out.println(tree_set);

        System.out.println("\n Traversing through all colors in TreeSet using: ");
        System.out.println("\n 1. Iterator");

        Iterator iterator = tree_set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println("\n 2. Enhanced for Loop");
        for (String colors :
                tree_set) {
            System.out.print(colors + " ");
        }

        System.out.println("\n 3. forEach() method");
        tree_set.forEach(colors -> System.out.print(colors + " "));
    }
}
