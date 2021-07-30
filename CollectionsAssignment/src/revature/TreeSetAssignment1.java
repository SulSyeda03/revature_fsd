package revature;

import java.util.TreeSet;

public class TreeSetAssignment1 {
    //1.Write a Java program to create a new tree set, add some colors (string) and print out the tree set.

    public static void main(String[] args) {
        System.out.println("\n**********");
        System.out.println("\n ******Java program to create a new tree set, add some colors (string) and print out the tree set.******");

        TreeSet<String> tree_set = new TreeSet<>();
        System.out.print("\nTreeSet before adding elements : ");
        System.out.println(tree_set);

        System.out.println("Adding colors in TreeSet...");
        tree_set.add("Red");
        tree_set.add("Orange");
        tree_set.add("Yellow");
        tree_set.add("Purple");
        tree_set.add("White");
        tree_set.add("Black");
        tree_set.add("Blue");


        System.out.println("Printing the colors in TreeSet ");
        System.out.println(tree_set);
    }
}
