package revature;

import java.util.TreeSet;

public class TreeSetAssignment3 {
    //3. Write a Java program to add all the elements of a specified tree set to another tree set.

    public static void main(String[] args) {
        System.out.println("\n**********");
        System.out.println("\n ******Java program to add all the elements of a specified tree set to another tree set.******");

        TreeSet<String> tree_set = new TreeSet<>();

        tree_set.add("Red");
        tree_set.add("Orange");
        tree_set.add("Yellow");
        tree_set.add("Purple");
        tree_set.add("White");
        tree_set.add("Black");
        tree_set.add("Blue");


        System.out.println("Printing the elements in tree_set ");
        System.out.println(tree_set);

        System.out.println("\nCreating another TreeSet - colors");
        TreeSet<String> colors = new TreeSet<>();
        System.out.println("Adding all elements from tree_set....");
        colors.addAll(tree_set);
        System.out.println("Printing the elements in colors ");
        System.out.println(colors);

    }
}
