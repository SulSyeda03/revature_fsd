package revature;

import java.util.ArrayList;
import java.util.Iterator;

    public class ArrayListAssignment2 {

        //2. Write a Java program to iterate through all elements in a array list.
        public static void main(String[] args) {
            System.out.println("\n*********");
            System.out.println("\n ******Java program to iterate through all elements in a array list.******");

            ArrayList<String> colors = new ArrayList<>();

            colors.add("Red");
            colors.add("Green");
            colors.add("White");
            colors.add("Pink");
            colors.add("Black");
            colors.add("Red");

            System.out.println("\n >>The colors array is : ");
            System.out.println(colors);

            System.out.println("\n ******Iterate through all elements in an ArrayList.******");

            //using Iterator
            System.out.println("\n>>Printing elements from ArrayList using Iterator: ");
            Iterator iterator = colors.iterator();
            while(iterator.hasNext()){
                System.out.print(iterator.next() + " , ");
            }

            System.out.println();
            //using for loop
            System.out.println("\n>>Printing elements from ArrayList using For Loop: ");
            for (int i = 0 ; i < colors.size() ; i++) {
                System.out.print(colors.get(i) + " , ");
            }

            System.out.println();
            //using for each
            System.out.println("\n>>Printing elements from ArrayList using For Each: ");
            for (String color: colors) {
                System.out.print(color + " , ");
            }
        }
    }
