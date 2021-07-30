package revature;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAssignment12 {
    //12. Write a Java program to extract a portion of a array list.

    public static void main(String[] args) {
        System.out.println("\n*********");
        System.out.println("\n ******Java program to extract a portion of a array list.******");

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("White");
        colors.add("Pink");
        colors.add("Black");
        colors.add("Red");

        System.out.println("\n >>The colors array is : ");
        System.out.println(colors);
        System.out.println("\nExtracting elements at index 2 and index 3");
        System.out.println(">>The extracted array list is : ");
        System.out.println(colors.subList(2,4));

    }

}
