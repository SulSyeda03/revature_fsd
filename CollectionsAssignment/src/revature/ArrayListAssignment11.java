package revature;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAssignment11 {
    //11. Write a Java program to reverse elements in a array list.

    public static void main(String[] args) {
        System.out.println("\n*********");
        System.out.println("\n ******Java program to reverse elements in a array list.******");

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("White");
        colors.add("Pink");
        colors.add("Black");
        colors.add("Red");

        System.out.println("\n >>The colors array is : ");
        System.out.println(colors);
        System.out.println("\n Reversing elements....");
        Collections.reverse(colors);
        System.out.println("\n >>The colors array after reversing is : ");
        System.out.println(colors);
    }

}
