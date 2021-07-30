package revature;

import java.util.ArrayList;

public class ArrayListAssignment5 {
    //5. Write a Java program to update specific array element by given element.

    public static void main(String[] args) {
        System.out.println("*********");
        System.out.println("\n ******Java program to update specific array element by given element.******");

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("White");
        colors.add("Pink");
        colors.add("Black");
        colors.add("Red");

        System.out.println("\nThe colors array before updating is: ");
        System.out.println(colors);
        System.out.println("\nAdding element at index 3...");
        colors.set(3,"Purple");
        System.out.println("\nThe colors array after updating is: ");
        System.out.println(colors);
    }
}
