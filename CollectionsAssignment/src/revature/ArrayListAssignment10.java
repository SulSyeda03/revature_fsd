package revature;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAssignment10 {
    //Java program to copy one array list into another.

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

        System.out.println("\n >>The colors array before shuffling : ");
        System.out.println(colors);
        Collections.shuffle(colors);
        System.out.println("\n >>The colors array after shuffling : ");
        System.out.println(colors);


    }
}

