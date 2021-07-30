package revature;

import java.util.ArrayList;

public class ArrayListAssignment3 {
//3. Write a Java program to insert an element into the array list at the first position.

    public static void main(String[] args) {

        System.out.println("*********");
        System.out.println("\n ******Java program to insert an element into the array list at the first position.******");

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("White");
        colors.add("Pink");
        colors.add("Black");
        colors.add("Red");

        System.out.println("\nArrayList before inserting element 'Blue' in first position: ");
        System.out.println(colors);
        System.out.println();
        System.out.println("\nArrayList after inserting element 'Blue' in first position: ");

        colors.add(0,"Blue");
        System.out.println(colors);

    }

}
