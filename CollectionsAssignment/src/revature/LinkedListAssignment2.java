package revature;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListAssignment2 {
    //2. Write a Java program to iterate through all elements in a linked list.
    public static void main(String[] args) {

        System.out.println("\n**********");
        System.out.println("\n ******Java program to iterate through all elements in a linked list.******");

        LinkedList<String> linked_list = new LinkedList<>();
        linked_list.add("New York");
        linked_list.add("Chicago");
        linked_list.add("California");
        linked_list.add("Washington");
        //linked_list.add("New York");


        System.out.println("Printing the contents of LinkedList ");
        System.out.println(linked_list);

        System.out.println("\nTraversing through elements using iterator: ");

        Iterator iterator = linked_list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("\nTraversing through elements using ForEach: ");
        for (String l_list : linked_list ) {
            System.out.println(l_list);
        }

        System.out.println("\nTraversing through elements using For : ");
        for (int i =0; i < linked_list.size(); i++) {
            System.out.println(linked_list.get(i));
        }

        System.out.println("\nTraversing through elements using forEach() method : ");
        linked_list.forEach( list -> System.out.println(list));
    }
}
