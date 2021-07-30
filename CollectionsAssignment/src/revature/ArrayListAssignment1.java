package revature;

import java.util.ArrayList;

public class ArrayListAssignment1 {

    //1. Write a Java program to create a new array list, add some colors (string) and print out
    // the collection.
    public static void main(String[] args) {
        System.out.println("*********");
        System.out.println("\n ******Java program to create a new array list, add some colors " +
                "(string) " +
                "and print out " +
                "the collection.******\n ");

        ArrayList<String> colors = new ArrayList<>();

        System.out.println("\nArray before addition: " + colors);

        System.out.println("Adding elements to colors array....");

        colors.add("Red");
        colors.add("Green");
        colors.add("White");
        colors.add("Pink");
        colors.add("Black");
        colors.add("Red");

        System.out.println("\n >>Addition completed. The colors array is : " + colors);

    }
}
