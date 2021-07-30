package revature;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAssignment13 {
    //13. Write a Java program of swap two elements in an array list.

    public static void main(String[] args) {
        System.out.println("\n*********");
        System.out.println("\n ******Java program of swap two elements in an array list.******");

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("White");
        colors.add("Pink");
        colors.add("Black");
        colors.add("Red");

        System.out.println("\n >>The colors array is : ");
        System.out.println(colors);

        System.out.println("\nSwapping elements 'Pink' and 'Red'");
        Collections.swap(colors, 3,5);
        System.out.println(">>The colors array after swapping is : ");
        System.out.println(colors);
    }
}
