package revature;

import java.util.TreeSet;

public class TreeSetAssignment5 {
    //5. Write a Java program to get the first and last elements in a tree set

    public static void main(String[] args) {
        System.out.println("\n**********");
        System.out.println("\n ******Java program to get the first and last elements in a tree set******");

        TreeSet<String> tree_set = new TreeSet<>();

        tree_set.add("Red");
        tree_set.add("Orange");
        tree_set.add("Yellow");
        tree_set.add("Purple");
        tree_set.add("White");
        tree_set.add("Black");
        tree_set.add("Blue");


        System.out.println("\nPrinting the colors in TreeSet ");
        System.out.println(tree_set);

        System.out.println("\n First element in tree_set is: " + tree_set.first());
        System.out.println(" Last element in tree_set is: " + tree_set.last());

    }
}
