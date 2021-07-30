package revature;

import java.util.ArrayList;

public class ArrayListAssignment6 {
  //6. Write a Java program to remove the third element from a array list.

    public static void main(String[] args) {
        System.out.println("\n*********");
        System.out.println("\n ******Java program to remove the third element from a array list.******");

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("White");
        colors.add("Pink");
        colors.add("Black");
        colors.add("Red");

        System.out.println("\n >>The colors array is : " + colors);

        System.out.println("\nThird element in array is :" + colors.get(2));
        System.out.println("Removing third element....");
        colors.remove(2);
        System.out.println("\n >>The colors array after removing third element is : " + colors);
        System.out.println("\nThird element now in array is :" + colors.get(2));

    }
}
