package revature;

import java.util.ArrayList;

public class ArrayListAssignment9 {
    //9. Write a Java program to copy one array list into another.

    public static void main(String[] args) {
        System.out.println("\n*********");
        System.out.println("\n ******Java program to copy one array list into another.******");

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("White");
        colors.add("Pink");
        colors.add("Black");
        colors.add("Red");

        System.out.println("\n >>The colors array is : " + colors);

        System.out.println("\nCopying colors array list to newArrayList...");
        ArrayList<String> newArrayList = new ArrayList<>();
        newArrayList.addAll(colors);
        System.out.println("newArrayList: " +newArrayList);
    }
}

