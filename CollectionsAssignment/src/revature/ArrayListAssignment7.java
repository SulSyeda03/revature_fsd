package revature;

import java.util.ArrayList;

public class ArrayListAssignment7 {
    //7. Write a Java program to search an element in a array list.

    public static void main(String[] args) {
        System.out.println("*********");
        System.out.println("\n ******Java program to search an element in a array list.******");

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("White");
        colors.add("Pink");
        colors.add("Black");
        colors.add("Red");

        System.out.println("\n >>The colors array is : " + colors);
        System.out.println("\nSearching for element 'Black'...");
        System.out.println("'Black' element is at index :" + colors.indexOf("Black"));

    }

}
