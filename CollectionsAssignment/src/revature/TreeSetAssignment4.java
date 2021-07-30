package revature;

import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeSet;

public class TreeSetAssignment4 {
    //4. Write a Java program to create a reverse order view of the elements contained in a given tree set.

    public static void main(String[] args) {
        System.out.println("\n**********");
        System.out.println("\n ******Java program to create a reverse order view of the elements contained in a given tree set.******");

        TreeSet<String> tree_set = new TreeSet<>();

        tree_set.add("Red");
        tree_set.add("Orange");
        tree_set.add("Yellow");
        tree_set.add("Purple");
        tree_set.add("White");
        tree_set.add("Black");
        tree_set.add("Blue");


        System.out.println("Printing the colors in TreeSet in default order ");
        System.out.println(tree_set);

        System.out.println("Printing the colors in TreeSet in reverse order by creating " +
                "LinkedList" +
                " ");
        LinkedList<String> li = new LinkedList<>(tree_set);
        System.out.println("TreeSet in reverse order is: ");
        Collections.reverse(li);
        System.out.println(li);
    }
}
