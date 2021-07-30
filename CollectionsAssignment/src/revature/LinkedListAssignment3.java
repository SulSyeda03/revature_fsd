package revature;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListAssignment3 {
    //3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
    public static void main(String[] args) {

        System.out.println("\n**********");
        System.out.println("\n ******Java program to iterate through all elements in a linked list starting at the specified position.******");

        LinkedList<String> linked_list = new LinkedList<>();
        linked_list.add("New York");
        linked_list.add("Chicago");
        linked_list.add("California");
        linked_list.add("Washington");
        linked_list.add("San Francisco");
        linked_list.add("Seattle");
        linked_list.add("Denver");
        linked_list.add("Boston");
        linked_list.add("Washington");

        System.out.println("Printing the contents of LinkedList ");
        System.out.println(linked_list);

        System.out.println("\nTraversing through all elements starting at index 2 ");

        for (int i = 2; i < linked_list.size(); i++) {
            System.out.println(linked_list.get(i));
        }
    }
}