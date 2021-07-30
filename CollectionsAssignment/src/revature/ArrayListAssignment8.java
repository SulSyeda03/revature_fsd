package revature;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAssignment8 {
    //8. Write a Java program to sort a given array list.

    public static void main(String[] args) {
        System.out.println("\n*********");
        System.out.println("\n ******Java program to sort a given array list.******");

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("White");
        colors.add("Pink");
        colors.add("Black");
        colors.add("Red");

        System.out.println("\n >>The colors array before sorting is : " + colors);
        System.out.println("\nSorting array....");
        Collections.sort(colors);
        System.out.println(">>The colors array after sorting is : " + colors);

    }
}
