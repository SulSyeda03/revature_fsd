package revature;

import java.util.ArrayList;

public class ArrayListAssignment4 {
//4. Write a Java program to retrieve an element (at a specified index) from a given array list.

    public static void main(String[] args) {
        System.out.println("*********");
        System.out.println("\n ******Java program to retrieve an element (at a specified index) from a given array list.******");

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("White");
        colors.add("Pink");
        colors.add("Black");
        colors.add("Red");

        System.out.println("\n >>The colors array is : " + colors);
        System.out.println("\nRetrieving element at index 2....");
        System.out.println("Element at index 2 is: " +colors.get(2));

    }
}
